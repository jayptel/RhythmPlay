package com.easyplex.ui.library;

import static com.easyplex.util.Constants.ARG_MOVIE;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.easyplex.R;
import com.easyplex.data.local.entity.Media;
import com.easyplex.ui.animes.AnimeDetailsActivity;
import com.easyplex.ui.moviedetails.MovieDetailsActivity;
import com.easyplex.ui.seriedetails.SerieDetailsActivity;
import com.easyplex.util.ItemAnimation;
import com.easyplex.util.Tools;

import org.jetbrains.annotations.NotNull;

public class ItemAdapter extends PagedListAdapter<Media, ItemAdapter.ItemViewHolder> {

    private final Context context;
    private final int animationType;

    public ItemAdapter(Context context, int animationType) {
        super(ITEM_CALLBACK);
        this.context = context;
        this.animationType = animationType;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_genre, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

        Media media = getItem(position);


        if (media != null) {


            Tools.onLoadMediaCoverAdapters(context,holder.imageView,media.getPosterPath());


            setAnimation(holder.itemView, position);

            holder.title.setText(media.getName());

            if ("anime".equals(media.getType())) {
                holder.substitle.setText("Anime");
            } else if ("serie".equals(media.getType())) {
                holder.substitle.setText("Serie");
            } else if ("movie".equals(media.getType())) {
                holder.substitle.setText("Movie");
            }

            holder.movietype.setOnClickListener(v -> {

                if ("anime".equals(media.getType())) {
                    Intent intent = new Intent(context, AnimeDetailsActivity.class);
                    intent.putExtra(ARG_MOVIE, media);
                    context.startActivity(intent);
                } else if ("serie".equals(media.getType())) {
                    Intent intent = new Intent(context, SerieDetailsActivity.class);
                    intent.putExtra(ARG_MOVIE, media);
                    context.startActivity(intent);
                } else if ("movie".equals(media.getType())) {
                    Intent intent = new Intent(context, MovieDetailsActivity.class);
                    intent.putExtra(ARG_MOVIE, media);
                    context.startActivity(intent);
                }

           });


        }

        }


    private static final DiffUtil.ItemCallback<Media> ITEM_CALLBACK =
            new DiffUtil.ItemCallback<>() {
                @Override
                public boolean areItemsTheSame(Media oldItem, Media newItem) {
                    return oldItem.getId().equals(newItem.getId());
                }

                @SuppressLint("DiffUtilEquals")
                @Override
                public boolean areContentsTheSame(Media oldItem, @NotNull Media newItem) {
                    return oldItem.equals(newItem);
                }
            };


    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
                onAttach = false;
                super.onScrollStateChanged(recyclerView, newState);
            }
        });
        super.onAttachedToRecyclerView(recyclerView);
    }



    private int lastPosition = -1;
    private boolean onAttach = true;


    private void setAnimation(View view, int position) {
        if (position > lastPosition) {
            ItemAnimation.animate(view, onAttach ? position : -1, animationType);
            lastPosition = position;
        }
    }


    static class ItemViewHolder extends RecyclerView.ViewHolder {

        final ImageView imageView;
        final LinearLayout movietype;
        final TextView mgenres;

        final TextView substitle;

        final TextView title;
        public ItemViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.item_movie_image);
            movietype = itemView.findViewById(R.id.rootLayout);
            mgenres = itemView.findViewById(R.id.mgenres);
            substitle = itemView.findViewById(R.id.substitle);
            title = itemView.findViewById(R.id.movietitle);
        }
    }
}
