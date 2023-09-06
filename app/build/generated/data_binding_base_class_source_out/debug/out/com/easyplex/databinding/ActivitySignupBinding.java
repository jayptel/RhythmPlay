// Generated by data binding compiler. Do not edit!
package com.easyplex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.easyplex.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivitySignupBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout btnRegister;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final LinearLayout formContainer;

  @NonNull
  public final TextView goToLogin;

  @NonNull
  public final ProgressBar loader;

  @NonNull
  public final ImageView logoImageTop;

  @NonNull
  public final ImageView splashImage;

  @NonNull
  public final TextInputLayout tilEmail;

  @NonNull
  public final TextInputLayout tilName;

  @NonNull
  public final TextInputLayout tilPassword;

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

  protected ActivitySignupBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout btnRegister, ConstraintLayout constraintLayout, LinearLayout formContainer,
      TextView goToLogin, ProgressBar loader, ImageView logoImageTop, ImageView splashImage,
      TextInputLayout tilEmail, TextInputLayout tilName, TextInputLayout tilPassword,
      Guideline tubiTvControllerGuidelineBottom, Guideline tubiTvControllerGuidelineLeft,
      Guideline tubiTvControllerGuidelineRight, Guideline tubiTvControllerGuidelineSeekLeft,
      Guideline tubiTvControllerGuidelineSeekRight, Guideline tubiTvControllerGuidelineTop) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnRegister = btnRegister;
    this.constraintLayout = constraintLayout;
    this.formContainer = formContainer;
    this.goToLogin = goToLogin;
    this.loader = loader;
    this.logoImageTop = logoImageTop;
    this.splashImage = splashImage;
    this.tilEmail = tilEmail;
    this.tilName = tilName;
    this.tilPassword = tilPassword;
    this.tubiTvControllerGuidelineBottom = tubiTvControllerGuidelineBottom;
    this.tubiTvControllerGuidelineLeft = tubiTvControllerGuidelineLeft;
    this.tubiTvControllerGuidelineRight = tubiTvControllerGuidelineRight;
    this.tubiTvControllerGuidelineSeekLeft = tubiTvControllerGuidelineSeekLeft;
    this.tubiTvControllerGuidelineSeekRight = tubiTvControllerGuidelineSeekRight;
    this.tubiTvControllerGuidelineTop = tubiTvControllerGuidelineTop;
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_signup, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivitySignupBinding>inflateInternal(inflater, R.layout.activity_signup, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_signup, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivitySignupBinding>inflateInternal(inflater, R.layout.activity_signup, null, false, component);
  }

  public static ActivitySignupBinding bind(@NonNull View view) {
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
  public static ActivitySignupBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivitySignupBinding)bind(component, view, R.layout.activity_signup);
  }
}
