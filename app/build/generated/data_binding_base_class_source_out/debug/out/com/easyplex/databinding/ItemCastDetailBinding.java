// Generated by data binding compiler. Do not edit!
package com.easyplex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.BannerView;
import com.easyplex.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemCastDetailBinding extends ViewDataBinding {
  @NonNull
  public final TextView actorType;

  @NonNull
  public final FrameLayout adViewContainer;

  @NonNull
  public final BannerView appodealBannerView;

  @NonNull
  public final LinearLayout bannerContainer;

  @NonNull
  public final FrameLayout bannerContainerIron;

  @NonNull
  public final TextView birthday;

  @NonNull
  public final FrameLayout bottomSheet;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final TextView epResumeTitle;

  @NonNull
  public final ImageView facebook;

  @NonNull
  public final TextView filmographieTotal;

  @NonNull
  public final ImageView imageMoviePoster;

  @NonNull
  public final ImageView instagram;

  @NonNull
  public final NestedScrollView itemDetailContainer;

  @NonNull
  public final TextView moviePremuim;

  @NonNull
  public final CoordinatorLayout myCoordinatorLayout;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView recyclerViewCastMovieDetail;

  @NonNull
  public final LinearLayout resumeLinear;

  @NonNull
  public final TextView textMovieTitle;

  @NonNull
  public final TextView textOverviewLabel;

  @NonNull
  public final TextView timeRemaning;

  @NonNull
  public final ImageView twitter;

  @NonNull
  public final RelativeLayout unityBannerViewContainer;

  @NonNull
  public final TextView viewMovieViews;

  protected ItemCastDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView actorType, FrameLayout adViewContainer, BannerView appodealBannerView,
      LinearLayout bannerContainer, FrameLayout bannerContainerIron, TextView birthday,
      FrameLayout bottomSheet, ConstraintLayout constraintLayout, TextView epResumeTitle,
      ImageView facebook, TextView filmographieTotal, ImageView imageMoviePoster,
      ImageView instagram, NestedScrollView itemDetailContainer, TextView moviePremuim,
      CoordinatorLayout myCoordinatorLayout, ProgressBar progressBar,
      RecyclerView recyclerViewCastMovieDetail, LinearLayout resumeLinear, TextView textMovieTitle,
      TextView textOverviewLabel, TextView timeRemaning, ImageView twitter,
      RelativeLayout unityBannerViewContainer, TextView viewMovieViews) {
    super(_bindingComponent, _root, _localFieldCount);
    this.actorType = actorType;
    this.adViewContainer = adViewContainer;
    this.appodealBannerView = appodealBannerView;
    this.bannerContainer = bannerContainer;
    this.bannerContainerIron = bannerContainerIron;
    this.birthday = birthday;
    this.bottomSheet = bottomSheet;
    this.constraintLayout = constraintLayout;
    this.epResumeTitle = epResumeTitle;
    this.facebook = facebook;
    this.filmographieTotal = filmographieTotal;
    this.imageMoviePoster = imageMoviePoster;
    this.instagram = instagram;
    this.itemDetailContainer = itemDetailContainer;
    this.moviePremuim = moviePremuim;
    this.myCoordinatorLayout = myCoordinatorLayout;
    this.progressBar = progressBar;
    this.recyclerViewCastMovieDetail = recyclerViewCastMovieDetail;
    this.resumeLinear = resumeLinear;
    this.textMovieTitle = textMovieTitle;
    this.textOverviewLabel = textOverviewLabel;
    this.timeRemaning = timeRemaning;
    this.twitter = twitter;
    this.unityBannerViewContainer = unityBannerViewContainer;
    this.viewMovieViews = viewMovieViews;
  }

  @NonNull
  public static ItemCastDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_cast_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemCastDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemCastDetailBinding>inflateInternal(inflater, R.layout.item_cast_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ItemCastDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_cast_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemCastDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemCastDetailBinding>inflateInternal(inflater, R.layout.item_cast_detail, null, false, component);
  }

  public static ItemCastDetailBinding bind(@NonNull View view) {
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
  public static ItemCastDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemCastDetailBinding)bind(component, view, R.layout.item_cast_detail);
  }
}
