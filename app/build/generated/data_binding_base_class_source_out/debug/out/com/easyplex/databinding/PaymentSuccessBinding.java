// Generated by data binding compiler. Do not edit!
package com.easyplex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.easyplex.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class PaymentSuccessBinding extends ViewDataBinding {
  @NonNull
  public final ImageView closePaymentSuccess;

  @NonNull
  public final ImageView movieImage;

  @NonNull
  public final TextView movietitle;

  @NonNull
  public final FrameLayout viewPaymentSuccess;

  protected PaymentSuccessBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView closePaymentSuccess, ImageView movieImage, TextView movietitle,
      FrameLayout viewPaymentSuccess) {
    super(_bindingComponent, _root, _localFieldCount);
    this.closePaymentSuccess = closePaymentSuccess;
    this.movieImage = movieImage;
    this.movietitle = movietitle;
    this.viewPaymentSuccess = viewPaymentSuccess;
  }

  @NonNull
  public static PaymentSuccessBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.payment_success, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PaymentSuccessBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PaymentSuccessBinding>inflateInternal(inflater, R.layout.payment_success, root, attachToRoot, component);
  }

  @NonNull
  public static PaymentSuccessBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.payment_success, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PaymentSuccessBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PaymentSuccessBinding>inflateInternal(inflater, R.layout.payment_success, null, false, component);
  }

  public static PaymentSuccessBinding bind(@NonNull View view) {
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
  public static PaymentSuccessBinding bind(@NonNull View view, @Nullable Object component) {
    return (PaymentSuccessBinding)bind(component, view, R.layout.payment_success);
  }
}
