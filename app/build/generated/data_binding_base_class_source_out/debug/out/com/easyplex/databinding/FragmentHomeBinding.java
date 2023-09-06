// Generated by data binding compiler. Do not edit!
package com.easyplex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.easyplex.R;
import com.easyplex.ui.users.MenuHandler;
import com.easyplex.util.GridItemImageView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.navigation.NavigationView;
import java.lang.Deprecated;
import java.lang.Object;
import me.relex.circleindicator.CircleIndicator2;

public abstract class FragmentHomeBinding extends ViewDataBinding {
  @NonNull
  public final GridItemImageView animesAll;

  @NonNull
  public final ImageView animesEpisodesAll;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final FrameLayout bottomSheet;

  @NonNull
  public final ImageView castersAll;

  @NonNull
  public final RecyclerView choosed;

  @NonNull
  public final GridItemImageView choosedAll;

  @NonNull
  public final LinearLayout choosedLinear;

  @NonNull
  public final ImageView clearHistory;

  @NonNull
  public final ImageView closePlans;

  @NonNull
  public final ImageView closeStatus;

  @NonNull
  public final RelativeLayout constraintLayout;

  @NonNull
  public final TextView coutinueWatchingTitle;

  @NonNull
  public final ImageView customBanner;

  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final ImageView episodesAll;

  @NonNull
  public final FrameLayout flAdplaceholder;

  @NonNull
  public final FrameLayout fragmentContainer;

  @NonNull
  public final TextView genres;

  @NonNull
  public final GridItemImageView imageAds;

  @NonNull
  public final CircleIndicator2 indicator;

  @NonNull
  public final GridItemImageView latestSeriesAll;

  @NonNull
  public final LinearLayout linearEpisodesAnimes;

  @NonNull
  public final LinearLayout linearEpisodesChannels;

  @NonNull
  public final LinearLayout linearLatestChannels;

  @NonNull
  public final ImageView linearLatestChannelsImage;

  @NonNull
  public final ImageView linearLatestEpisodesImage;

  @NonNull
  public final ImageView linearLatestEpisodesImageAnimes;

  @NonNull
  public final LinearLayout linearNetworks;

  @NonNull
  public final ImageView linearNetworksImage;

  @NonNull
  public final LinearLayout linearPinned;

  @NonNull
  public final ImageView linearPinnedImage;

  @NonNull
  public final LinearLayout linearPopularCasters;

  @NonNull
  public final ImageView linearPopularCastersImage;

  @NonNull
  public final LinearLayout linearUpcoming;

  @NonNull
  public final LinearLayout linearWatch;

  @NonNull
  public final ImageView linearWatchImage;

  @NonNull
  public final CoordinatorLayout mainContent;

  @NonNull
  public final TextView mantenanceModeMessage;

  @NonNull
  public final FrameLayout maxNativeAds;

  @NonNull
  public final GridItemImageView mostPopularAll;

  @NonNull
  public final ImageView movieImage;

  @NonNull
  public final LinearLayout nativeAdsSpace;

  @NonNull
  public final NavigationView navView;

  @NonNull
  public final ImageView newReleasesAll;

  @NonNull
  public final LinearLayout newthisweekLinear;

  @NonNull
  public final TextView pinned;

  @NonNull
  public final TextView popularCasters;

  @NonNull
  public final LinearLayout popularLinear;

  @NonNull
  public final GridItemImageView popularSeriesAll;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final GridItemImageView recommendedAll;

  @NonNull
  public final RecyclerView recyclerViewPlans;

  @NonNull
  public final Button restartApp;

  @NonNull
  public final RecyclerView rvAnimes;

  @NonNull
  public final LinearLayout rvAnimesLinear;

  @NonNull
  public final RecyclerView rvCountinueWatching;

  @NonNull
  public final RecyclerView rvEpisodesLatest;

  @NonNull
  public final RecyclerView rvEpisodesLatestAnimes;

  @NonNull
  public final RecyclerView rvFeatured;

  @NonNull
  public final RecyclerView rvLatest;

  @NonNull
  public final LinearLayout rvLatestLinear;

  @NonNull
  public final RecyclerView rvLatestStreaming;

  @NonNull
  public final RecyclerView rvNetworks;

  @NonNull
  public final RecyclerView rvNewthisweek;

  @NonNull
  public final RecyclerView rvPinned;

  @NonNull
  public final RecyclerView rvPopular;

  @NonNull
  public final RecyclerView rvPopularCasters;

  @NonNull
  public final RecyclerView rvRecommended;

  @NonNull
  public final LinearLayout rvRecommendedLinear;

  @NonNull
  public final RecyclerView rvSeriesPopular;

  @NonNull
  public final LinearLayout rvSeriesPopularLinear;

  @NonNull
  public final RecyclerView rvSeriesRecents;

  @NonNull
  public final LinearLayout rvSeriesRecentsLinear;

  @NonNull
  public final RecyclerView rvTrending;

  @NonNull
  public final LinearLayout rvTrendingLinear;

  @NonNull
  public final RecyclerView rvTvMovies;

  @NonNull
  public final LinearLayout rvTvMoviesLinear;

  @NonNull
  public final RecyclerView rvUpcoming;

  @NonNull
  public final NestedScrollView scrollView;

  @NonNull
  public final ImageView sreamingAll;

  @NonNull
  public final SwipeRefreshLayout swipeContainer;

  @NonNull
  public final GridItemImageView thisWeekAll;

  @NonNull
  public final MainToolbarBinding toolbar;

  @NonNull
  public final ImageView top20All;

  @NonNull
  public final GridItemImageView trendingAll;

  @NonNull
  public final ImageView upcomingPinnedImage;

  @NonNull
  public final TextView viewAdText;

  @NonNull
  public final FrameLayout viewMantenanceMode;

  @NonNull
  public final FrameLayout viewPlans;

  @Bindable
  protected MenuHandler mController;

  protected FragmentHomeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      GridItemImageView animesAll, ImageView animesEpisodesAll, AppBarLayout appbar,
      FrameLayout bottomSheet, ImageView castersAll, RecyclerView choosed,
      GridItemImageView choosedAll, LinearLayout choosedLinear, ImageView clearHistory,
      ImageView closePlans, ImageView closeStatus, RelativeLayout constraintLayout,
      TextView coutinueWatchingTitle, ImageView customBanner, DrawerLayout drawerLayout,
      ImageView episodesAll, FrameLayout flAdplaceholder, FrameLayout fragmentContainer,
      TextView genres, GridItemImageView imageAds, CircleIndicator2 indicator,
      GridItemImageView latestSeriesAll, LinearLayout linearEpisodesAnimes,
      LinearLayout linearEpisodesChannels, LinearLayout linearLatestChannels,
      ImageView linearLatestChannelsImage, ImageView linearLatestEpisodesImage,
      ImageView linearLatestEpisodesImageAnimes, LinearLayout linearNetworks,
      ImageView linearNetworksImage, LinearLayout linearPinned, ImageView linearPinnedImage,
      LinearLayout linearPopularCasters, ImageView linearPopularCastersImage,
      LinearLayout linearUpcoming, LinearLayout linearWatch, ImageView linearWatchImage,
      CoordinatorLayout mainContent, TextView mantenanceModeMessage, FrameLayout maxNativeAds,
      GridItemImageView mostPopularAll, ImageView movieImage, LinearLayout nativeAdsSpace,
      NavigationView navView, ImageView newReleasesAll, LinearLayout newthisweekLinear,
      TextView pinned, TextView popularCasters, LinearLayout popularLinear,
      GridItemImageView popularSeriesAll, ProgressBar progressBar, GridItemImageView recommendedAll,
      RecyclerView recyclerViewPlans, Button restartApp, RecyclerView rvAnimes,
      LinearLayout rvAnimesLinear, RecyclerView rvCountinueWatching, RecyclerView rvEpisodesLatest,
      RecyclerView rvEpisodesLatestAnimes, RecyclerView rvFeatured, RecyclerView rvLatest,
      LinearLayout rvLatestLinear, RecyclerView rvLatestStreaming, RecyclerView rvNetworks,
      RecyclerView rvNewthisweek, RecyclerView rvPinned, RecyclerView rvPopular,
      RecyclerView rvPopularCasters, RecyclerView rvRecommended, LinearLayout rvRecommendedLinear,
      RecyclerView rvSeriesPopular, LinearLayout rvSeriesPopularLinear,
      RecyclerView rvSeriesRecents, LinearLayout rvSeriesRecentsLinear, RecyclerView rvTrending,
      LinearLayout rvTrendingLinear, RecyclerView rvTvMovies, LinearLayout rvTvMoviesLinear,
      RecyclerView rvUpcoming, NestedScrollView scrollView, ImageView sreamingAll,
      SwipeRefreshLayout swipeContainer, GridItemImageView thisWeekAll, MainToolbarBinding toolbar,
      ImageView top20All, GridItemImageView trendingAll, ImageView upcomingPinnedImage,
      TextView viewAdText, FrameLayout viewMantenanceMode, FrameLayout viewPlans) {
    super(_bindingComponent, _root, _localFieldCount);
    this.animesAll = animesAll;
    this.animesEpisodesAll = animesEpisodesAll;
    this.appbar = appbar;
    this.bottomSheet = bottomSheet;
    this.castersAll = castersAll;
    this.choosed = choosed;
    this.choosedAll = choosedAll;
    this.choosedLinear = choosedLinear;
    this.clearHistory = clearHistory;
    this.closePlans = closePlans;
    this.closeStatus = closeStatus;
    this.constraintLayout = constraintLayout;
    this.coutinueWatchingTitle = coutinueWatchingTitle;
    this.customBanner = customBanner;
    this.drawerLayout = drawerLayout;
    this.episodesAll = episodesAll;
    this.flAdplaceholder = flAdplaceholder;
    this.fragmentContainer = fragmentContainer;
    this.genres = genres;
    this.imageAds = imageAds;
    this.indicator = indicator;
    this.latestSeriesAll = latestSeriesAll;
    this.linearEpisodesAnimes = linearEpisodesAnimes;
    this.linearEpisodesChannels = linearEpisodesChannels;
    this.linearLatestChannels = linearLatestChannels;
    this.linearLatestChannelsImage = linearLatestChannelsImage;
    this.linearLatestEpisodesImage = linearLatestEpisodesImage;
    this.linearLatestEpisodesImageAnimes = linearLatestEpisodesImageAnimes;
    this.linearNetworks = linearNetworks;
    this.linearNetworksImage = linearNetworksImage;
    this.linearPinned = linearPinned;
    this.linearPinnedImage = linearPinnedImage;
    this.linearPopularCasters = linearPopularCasters;
    this.linearPopularCastersImage = linearPopularCastersImage;
    this.linearUpcoming = linearUpcoming;
    this.linearWatch = linearWatch;
    this.linearWatchImage = linearWatchImage;
    this.mainContent = mainContent;
    this.mantenanceModeMessage = mantenanceModeMessage;
    this.maxNativeAds = maxNativeAds;
    this.mostPopularAll = mostPopularAll;
    this.movieImage = movieImage;
    this.nativeAdsSpace = nativeAdsSpace;
    this.navView = navView;
    this.newReleasesAll = newReleasesAll;
    this.newthisweekLinear = newthisweekLinear;
    this.pinned = pinned;
    this.popularCasters = popularCasters;
    this.popularLinear = popularLinear;
    this.popularSeriesAll = popularSeriesAll;
    this.progressBar = progressBar;
    this.recommendedAll = recommendedAll;
    this.recyclerViewPlans = recyclerViewPlans;
    this.restartApp = restartApp;
    this.rvAnimes = rvAnimes;
    this.rvAnimesLinear = rvAnimesLinear;
    this.rvCountinueWatching = rvCountinueWatching;
    this.rvEpisodesLatest = rvEpisodesLatest;
    this.rvEpisodesLatestAnimes = rvEpisodesLatestAnimes;
    this.rvFeatured = rvFeatured;
    this.rvLatest = rvLatest;
    this.rvLatestLinear = rvLatestLinear;
    this.rvLatestStreaming = rvLatestStreaming;
    this.rvNetworks = rvNetworks;
    this.rvNewthisweek = rvNewthisweek;
    this.rvPinned = rvPinned;
    this.rvPopular = rvPopular;
    this.rvPopularCasters = rvPopularCasters;
    this.rvRecommended = rvRecommended;
    this.rvRecommendedLinear = rvRecommendedLinear;
    this.rvSeriesPopular = rvSeriesPopular;
    this.rvSeriesPopularLinear = rvSeriesPopularLinear;
    this.rvSeriesRecents = rvSeriesRecents;
    this.rvSeriesRecentsLinear = rvSeriesRecentsLinear;
    this.rvTrending = rvTrending;
    this.rvTrendingLinear = rvTrendingLinear;
    this.rvTvMovies = rvTvMovies;
    this.rvTvMoviesLinear = rvTvMoviesLinear;
    this.rvUpcoming = rvUpcoming;
    this.scrollView = scrollView;
    this.sreamingAll = sreamingAll;
    this.swipeContainer = swipeContainer;
    this.thisWeekAll = thisWeekAll;
    this.toolbar = toolbar;
    this.top20All = top20All;
    this.trendingAll = trendingAll;
    this.upcomingPinnedImage = upcomingPinnedImage;
    this.viewAdText = viewAdText;
    this.viewMantenanceMode = viewMantenanceMode;
    this.viewPlans = viewPlans;
  }

  public abstract void setController(@Nullable MenuHandler controller);

  @Nullable
  public MenuHandler getController() {
    return mController;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, R.layout.fragment_home, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, R.layout.fragment_home, null, false, component);
  }

  public static FragmentHomeBinding bind(@NonNull View view) {
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
  public static FragmentHomeBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentHomeBinding)bind(component, view, R.layout.fragment_home);
  }
}
