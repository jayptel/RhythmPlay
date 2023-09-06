// Generated by data binding compiler. Do not edit!
package com.easyplex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.easyplex.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivitySplashBinding extends ViewDataBinding {
  @NonNull
  public final ImageView logoImageTop;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final ImageView splashImage;

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

  protected ActivitySplashBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView logoImageTop, ProgressBar progressBar, ImageView splashImage,
      Guideline tubiTvControllerGuidelineBottom, Guideline tubiTvControllerGuidelineLeft,
      Guideline tubiTvControllerGuidelineRight, Guideline tubiTvControllerGuidelineSeekLeft,
      Guideline tubiTvControllerGuidelineSeekRight, Guideline tubiTvControllerGuidelineTop) {
    super(_bindingComponent, _root, _localFieldCount);
    this.logoImageTop = logoImageTop;
    this.progressBar = progressBar;
    this.splashImage = splashImage;
    this.tubiTvControllerGuidelineBottom = tubiTvControllerGuidelineBottom;
    this.tubiTvControllerGuidelineLeft = tubiTvControllerGuidelineLeft;
    this.tubiTvControllerGuidelineRight = tubiTvControllerGuidelineRight;
    this.tubiTvControllerGuidelineSeekLeft = tubiTvControllerGuidelineSeekLeft;
    this.tubiTvControllerGuidelineSeekRight = tubiTvControllerGuidelineSeekRight;
    this.tubiTvControllerGuidelineTop = tubiTvControllerGuidelineTop;
  }

  @NonNull
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_splash, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivitySplashBinding>inflateInternal(inflater, R.layout.activity_splash, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_splash, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivitySplashBinding>inflateInternal(inflater, R.layout.activity_splash, null, false, component);
  }

  public static ActivitySplashBinding bind(@NonNull View view) {
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
  public static ActivitySplashBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivitySplashBinding)bind(component, view, R.layout.activity_splash);
  }
}
