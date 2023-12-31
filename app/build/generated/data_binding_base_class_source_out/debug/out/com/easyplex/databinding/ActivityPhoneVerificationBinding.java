// Generated by data binding compiler. Do not edit!
package com.easyplex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.easyplex.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityPhoneVerificationBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout btnSend;

  @NonNull
  public final LinearLayout btnVerify;

  @NonNull
  public final EditText countryCode;

  @NonNull
  public final EditText phone;

  @NonNull
  public final LinearLayout phoneVerificationLinear;

  @NonNull
  public final TextView smsResend;

  @NonNull
  public final TextView timeOut;

  @NonNull
  public final Toolbar toolbar;

  protected ActivityPhoneVerificationBinding(Object _bindingComponent, View _root,
      int _localFieldCount, LinearLayout btnSend, LinearLayout btnVerify, EditText countryCode,
      EditText phone, LinearLayout phoneVerificationLinear, TextView smsResend, TextView timeOut,
      Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnSend = btnSend;
    this.btnVerify = btnVerify;
    this.countryCode = countryCode;
    this.phone = phone;
    this.phoneVerificationLinear = phoneVerificationLinear;
    this.smsResend = smsResend;
    this.timeOut = timeOut;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityPhoneVerificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_phone_verification, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPhoneVerificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityPhoneVerificationBinding>inflateInternal(inflater, R.layout.activity_phone_verification, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityPhoneVerificationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_phone_verification, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPhoneVerificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityPhoneVerificationBinding>inflateInternal(inflater, R.layout.activity_phone_verification, null, false, component);
  }

  public static ActivityPhoneVerificationBinding bind(@NonNull View view) {
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
  public static ActivityPhoneVerificationBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityPhoneVerificationBinding)bind(component, view, R.layout.activity_phone_verification);
  }
}
