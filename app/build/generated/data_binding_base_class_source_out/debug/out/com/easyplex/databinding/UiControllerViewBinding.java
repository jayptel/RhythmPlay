// Generated by data binding compiler. Do not edit!
package com.easyplex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.mediarouter.app.MediaRouteButton;
import com.easyplex.R;
import com.easyplex.ui.player.bindings.PlayerController;
import com.easyplex.ui.player.views.PlayStateImageButton;
import com.easyplex.ui.player.views.SubstitleImageButton;
import com.tubitv.ui.TubiLoadingView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class UiControllerViewBinding extends ViewDataBinding {
  @NonNull
  public final SwitchCompat autoplaySwitch;

  @NonNull
  public final ConstraintLayout controllerPanel;

  @NonNull
  public final ImageView exoArtwork;

  @NonNull
  public final ImageView imageViewMovieNext;

  @NonNull
  public final FrameLayout movieSkipFramelayout;

  @NonNull
  public final FrameLayout nextPlayFramelayout;

  @NonNull
  public final ImageButton playerLockedIcon;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView textViewVideoTimeRemaining;

  @NonNull
  public final Guideline tubiTvControllerGuidelineBottom;

  @NonNull
  public final Guideline tubiTvControllerGuidelineLeft;

  @NonNull
  public final Guideline tubiTvControllerGuidelineRight;

  @NonNull
  public final Guideline tubiTvControllerGuidelineSeekLeft;

  @NonNull
  public final Guideline tubiTvControllerGuidelineSeekRight;

  @NonNull
  public final Guideline tubiTvControllerGuidelineTop;

  @NonNull
  public final Button unlockBtnSecond;

  @NonNull
  public final LinearLayout viewAudioMovie;

  @NonNull
  public final LinearLayout viewAudioStreaming;

  @NonNull
  public final LinearLayout viewAutoPlay;

  @NonNull
  public final MediaRouteButton viewControllerChromecastIb;

  @NonNull
  public final LinearLayout viewEpisodes;

  @NonNull
  public final TextView viewIslive;

  @NonNull
  public final LinearLayout viewLockMovie;

  @NonNull
  public final LinearLayout viewLockSerie;

  @NonNull
  public final TextView viewMovieViews;

  @NonNull
  public final LinearLayout viewMoviesList;

  @NonNull
  public final LinearLayout viewMoviesListTv;

  @NonNull
  public final LinearLayout viewNextEpisode;

  @NonNull
  public final LinearLayout viewRestartMovie;

  @NonNull
  public final LinearLayout viewSpeedStreaming;

  @NonNull
  public final LinearLayout viewStreaming;

  @NonNull
  public final LinearLayout viewSubstitlesAuto;

  @NonNull
  public final LinearLayout viewSubstitlesAutoMovies;

  @NonNull
  public final ImageView viewTubiControllerAppSettings;

  @NonNull
  public final ImageButton viewTubiControllerClose;

  @NonNull
  public final TextView viewTubiControllerElapsedTime;

  @NonNull
  public final ImageButton viewTubiControllerEpisodes;

  @NonNull
  public final TextView viewTubiControllerEpisodesText;

  @NonNull
  public final ImageButton viewTubiControllerForwardIb;

  @NonNull
  public final TubiLoadingView viewTubiControllerLoading;

  @NonNull
  public final PlayStateImageButton viewTubiControllerPlayToggleIb;

  @NonNull
  public final TextView viewTubiControllerRemainingTime;

  @NonNull
  public final ImageButton viewTubiControllerRewindIb;

  @NonNull
  public final ImageView viewTubiControllerScaleIb;

  @NonNull
  public final TextView viewTubiControllerSecondTitle;

  @NonNull
  public final SeekBar viewTubiControllerSeekBar;

  @NonNull
  public final ImageButton viewTubiControllerStreaming;

  @NonNull
  public final TextView viewTubiControllerStreamingText;

  @NonNull
  public final TextView viewTubiControllerSubstitleCurentLang;

  @NonNull
  public final TextView viewTubiControllerSubstitleCurentLangMovies;

  @NonNull
  public final ImageButton viewTubiControllerSubstitlesIcon;

  @NonNull
  public final ImageButton viewTubiControllerSubstitlesIconMovies;

  @NonNull
  public final SubstitleImageButton viewTubiControllerSubtitlesIb;

  @NonNull
  public final TextView viewTubiControllerTitle;

  @Bindable
  protected PlayerController mController;

  protected UiControllerViewBinding(Object _bindingComponent, View _root, int _localFieldCount,
      SwitchCompat autoplaySwitch, ConstraintLayout controllerPanel, ImageView exoArtwork,
      ImageView imageViewMovieNext, FrameLayout movieSkipFramelayout,
      FrameLayout nextPlayFramelayout, ImageButton playerLockedIcon, ProgressBar progressBar,
      TextView textViewVideoTimeRemaining, Guideline tubiTvControllerGuidelineBottom,
      Guideline tubiTvControllerGuidelineLeft, Guideline tubiTvControllerGuidelineRight,
      Guideline tubiTvControllerGuidelineSeekLeft, Guideline tubiTvControllerGuidelineSeekRight,
      Guideline tubiTvControllerGuidelineTop, Button unlockBtnSecond, LinearLayout viewAudioMovie,
      LinearLayout viewAudioStreaming, LinearLayout viewAutoPlay,
      MediaRouteButton viewControllerChromecastIb, LinearLayout viewEpisodes, TextView viewIslive,
      LinearLayout viewLockMovie, LinearLayout viewLockSerie, TextView viewMovieViews,
      LinearLayout viewMoviesList, LinearLayout viewMoviesListTv, LinearLayout viewNextEpisode,
      LinearLayout viewRestartMovie, LinearLayout viewSpeedStreaming, LinearLayout viewStreaming,
      LinearLayout viewSubstitlesAuto, LinearLayout viewSubstitlesAutoMovies,
      ImageView viewTubiControllerAppSettings, ImageButton viewTubiControllerClose,
      TextView viewTubiControllerElapsedTime, ImageButton viewTubiControllerEpisodes,
      TextView viewTubiControllerEpisodesText, ImageButton viewTubiControllerForwardIb,
      TubiLoadingView viewTubiControllerLoading,
      PlayStateImageButton viewTubiControllerPlayToggleIb, TextView viewTubiControllerRemainingTime,
      ImageButton viewTubiControllerRewindIb, ImageView viewTubiControllerScaleIb,
      TextView viewTubiControllerSecondTitle, SeekBar viewTubiControllerSeekBar,
      ImageButton viewTubiControllerStreaming, TextView viewTubiControllerStreamingText,
      TextView viewTubiControllerSubstitleCurentLang,
      TextView viewTubiControllerSubstitleCurentLangMovies,
      ImageButton viewTubiControllerSubstitlesIcon,
      ImageButton viewTubiControllerSubstitlesIconMovies,
      SubstitleImageButton viewTubiControllerSubtitlesIb, TextView viewTubiControllerTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.autoplaySwitch = autoplaySwitch;
    this.controllerPanel = controllerPanel;
    this.exoArtwork = exoArtwork;
    this.imageViewMovieNext = imageViewMovieNext;
    this.movieSkipFramelayout = movieSkipFramelayout;
    this.nextPlayFramelayout = nextPlayFramelayout;
    this.playerLockedIcon = playerLockedIcon;
    this.progressBar = progressBar;
    this.textViewVideoTimeRemaining = textViewVideoTimeRemaining;
    this.tubiTvControllerGuidelineBottom = tubiTvControllerGuidelineBottom;
    this.tubiTvControllerGuidelineLeft = tubiTvControllerGuidelineLeft;
    this.tubiTvControllerGuidelineRight = tubiTvControllerGuidelineRight;
    this.tubiTvControllerGuidelineSeekLeft = tubiTvControllerGuidelineSeekLeft;
    this.tubiTvControllerGuidelineSeekRight = tubiTvControllerGuidelineSeekRight;
    this.tubiTvControllerGuidelineTop = tubiTvControllerGuidelineTop;
    this.unlockBtnSecond = unlockBtnSecond;
    this.viewAudioMovie = viewAudioMovie;
    this.viewAudioStreaming = viewAudioStreaming;
    this.viewAutoPlay = viewAutoPlay;
    this.viewControllerChromecastIb = viewControllerChromecastIb;
    this.viewEpisodes = viewEpisodes;
    this.viewIslive = viewIslive;
    this.viewLockMovie = viewLockMovie;
    this.viewLockSerie = viewLockSerie;
    this.viewMovieViews = viewMovieViews;
    this.viewMoviesList = viewMoviesList;
    this.viewMoviesListTv = viewMoviesListTv;
    this.viewNextEpisode = viewNextEpisode;
    this.viewRestartMovie = viewRestartMovie;
    this.viewSpeedStreaming = viewSpeedStreaming;
    this.viewStreaming = viewStreaming;
    this.viewSubstitlesAuto = viewSubstitlesAuto;
    this.viewSubstitlesAutoMovies = viewSubstitlesAutoMovies;
    this.viewTubiControllerAppSettings = viewTubiControllerAppSettings;
    this.viewTubiControllerClose = viewTubiControllerClose;
    this.viewTubiControllerElapsedTime = viewTubiControllerElapsedTime;
    this.viewTubiControllerEpisodes = viewTubiControllerEpisodes;
    this.viewTubiControllerEpisodesText = viewTubiControllerEpisodesText;
    this.viewTubiControllerForwardIb = viewTubiControllerForwardIb;
    this.viewTubiControllerLoading = viewTubiControllerLoading;
    this.viewTubiControllerPlayToggleIb = viewTubiControllerPlayToggleIb;
    this.viewTubiControllerRemainingTime = viewTubiControllerRemainingTime;
    this.viewTubiControllerRewindIb = viewTubiControllerRewindIb;
    this.viewTubiControllerScaleIb = viewTubiControllerScaleIb;
    this.viewTubiControllerSecondTitle = viewTubiControllerSecondTitle;
    this.viewTubiControllerSeekBar = viewTubiControllerSeekBar;
    this.viewTubiControllerStreaming = viewTubiControllerStreaming;
    this.viewTubiControllerStreamingText = viewTubiControllerStreamingText;
    this.viewTubiControllerSubstitleCurentLang = viewTubiControllerSubstitleCurentLang;
    this.viewTubiControllerSubstitleCurentLangMovies = viewTubiControllerSubstitleCurentLangMovies;
    this.viewTubiControllerSubstitlesIcon = viewTubiControllerSubstitlesIcon;
    this.viewTubiControllerSubstitlesIconMovies = viewTubiControllerSubstitlesIconMovies;
    this.viewTubiControllerSubtitlesIb = viewTubiControllerSubtitlesIb;
    this.viewTubiControllerTitle = viewTubiControllerTitle;
  }

  public abstract void setController(@Nullable PlayerController controller);

  @Nullable
  public PlayerController getController() {
    return mController;
  }

  @NonNull
  public static UiControllerViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.ui_controller_view, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static UiControllerViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<UiControllerViewBinding>inflateInternal(inflater, R.layout.ui_controller_view, root, attachToRoot, component);
  }

  @NonNull
  public static UiControllerViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.ui_controller_view, null, false, component)
   */
  @NonNull
  @Deprecated
  public static UiControllerViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<UiControllerViewBinding>inflateInternal(inflater, R.layout.ui_controller_view, null, false, component);
  }

  public static UiControllerViewBinding bind(@NonNull View view) {
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
  public static UiControllerViewBinding bind(@NonNull View view, @Nullable Object component) {
    return (UiControllerViewBinding)bind(component, view, R.layout.ui_controller_view);
  }
}
