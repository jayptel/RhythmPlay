// Generated by data binding compiler. Do not edit!
package com.easyplex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.easyplex.R;
import com.easyplex.util.GridItemImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemEpisodesGenresBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout cardView;

  @NonNull
  public final GridItemImageView infoSerie;

  @NonNull
  public final GridItemImageView itemMovieImage;

  @NonNull
  public final TextView movietitle;

  @NonNull
  public final ConstraintLayout rootLayout;

  protected ItemEpisodesGenresBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FrameLayout cardView, GridItemImageView infoSerie, GridItemImageView itemMovieImage,
      TextView movietitle, ConstraintLayout rootLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardView = cardView;
    this.infoSerie = infoSerie;
    this.itemMovieImage = itemMovieImage;
    this.movietitle = movietitle;
    this.rootLayout = rootLayout;
  }

  @NonNull
  public static ItemEpisodesGenresBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_episodes_genres, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemEpisodesGenresBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemEpisodesGenresBinding>inflateInternal(inflater, R.layout.item_episodes_genres, root, attachToRoot, component);
  }

  @NonNull
  public static ItemEpisodesGenresBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_episodes_genres, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemEpisodesGenresBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemEpisodesGenresBinding>inflateInternal(inflater, R.layout.item_episodes_genres, null, false, component);
  }

  public static ItemEpisodesGenresBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemEpisodesGenresBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemEpisodesGenresBinding)bind(component, view, R.layout.item_episodes_genres);
  }
}
