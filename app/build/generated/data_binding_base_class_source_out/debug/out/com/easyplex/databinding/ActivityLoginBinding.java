// Generated by data binding compiler. Do not edit!
package com.easyplex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
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
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.common.SignInButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityLoginBinding extends ViewDataBinding {
  @NonNull
  public final Button btnEnterPasswordAccess;

  @NonNull
  public final ImageButton btnFacebook;

  @NonNull
  public final ImageButton btnGoogle;

  @NonNull
  public final LinearLayout btnLogin;

  @NonNull
  public final LinearLayout btnSkip;

  @NonNull
  public final LinearLayout codeAccessEnable;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final TextView forgetPassword;

  @NonNull
  public final LinearLayout formContainer;

  @NonNull
  public final TextView goToRegister;

  @NonNull
  public final ProgressBar loader;

  @NonNull
  public final LoginButton loginButton;

  @NonNull
  public final ImageView logoImageTop;

  @NonNull
  public final SignInButton signInButton;

  @NonNull
  public final ImageView splashImage;

  @NonNull
  public final Button textGetCode;

  @NonNull
  public final TextView textViewCheckingAuth;

  @NonNull
  public final TextInputLayout tilEmail;

  @NonNull
  public final TextInputLayout tilPassword;

  @NonNull
  public final TextInputLayout tilPasswordCode;

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

  protected ActivityLoginBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnEnterPasswordAccess, ImageButton btnFacebook, ImageButton btnGoogle,
      LinearLayout btnLogin, LinearLayout btnSkip, LinearLayout codeAccessEnable,
      ConstraintLayout constraintLayout, TextView forgetPassword, LinearLayout formContainer,
      TextView goToRegister, ProgressBar loader, LoginButton loginButton, ImageView logoImageTop,
      SignInButton signInButton, ImageView splashImage, Button textGetCode,
      TextView textViewCheckingAuth, TextInputLayout tilEmail, TextInputLayout tilPassword,
      TextInputLayout tilPasswordCode, Guideline tubiTvControllerGuidelineBottom,
      Guideline tubiTvControllerGuidelineLeft, Guideline tubiTvControllerGuidelineRight,
      Guideline tubiTvControllerGuidelineSeekLeft, Guideline tubiTvControllerGuidelineSeekRight,
      Guideline tubiTvControllerGuidelineTop) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnEnterPasswordAccess = btnEnterPasswordAccess;
    this.btnFacebook = btnFacebook;
    this.btnGoogle = btnGoogle;
    this.btnLogin = btnLogin;
    this.btnSkip = btnSkip;
    this.codeAccessEnable = codeAccessEnable;
    this.constraintLayout = constraintLayout;
    this.forgetPassword = forgetPassword;
    this.formContainer = formContainer;
    this.goToRegister = goToRegister;
    this.loader = loader;
    this.loginButton = loginButton;
    this.logoImageTop = logoImageTop;
    this.signInButton = signInButton;
    this.splashImage = splashImage;
    this.textGetCode = textGetCode;
    this.textViewCheckingAuth = textViewCheckingAuth;
    this.tilEmail = tilEmail;
    this.tilPassword = tilPassword;
    this.tilPasswordCode = tilPasswordCode;
    this.tubiTvControllerGuidelineBottom = tubiTvControllerGuidelineBottom;
    this.tubiTvControllerGuidelineLeft = tubiTvControllerGuidelineLeft;
    this.tubiTvControllerGuidelineRight = tubiTvControllerGuidelineRight;
    this.tubiTvControllerGuidelineSeekLeft = tubiTvControllerGuidelineSeekLeft;
    this.tubiTvControllerGuidelineSeekRight = tubiTvControllerGuidelineSeekRight;
    this.tubiTvControllerGuidelineTop = tubiTvControllerGuidelineTop;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_login, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLoginBinding>inflateInternal(inflater, R.layout.activity_login, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_login, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLoginBinding>inflateInternal(inflater, R.layout.activity_login, null, false, component);
  }

  public static ActivityLoginBinding bind(@NonNull View view) {
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
  public static ActivityLoginBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityLoginBinding)bind(component, view, R.layout.activity_login);
  }
}