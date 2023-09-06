// Generated by data binding compiler. Do not edit!
package com.easyplex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.easyplex.R;
import com.paypal.checkout.paymentbutton.PayPalButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class PaymentPaypalBinding extends ViewDataBinding {
  @NonNull
  public final ProgressBar loader;

  @NonNull
  public final PayPalButton paypalMethod;

  protected PaymentPaypalBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ProgressBar loader, PayPalButton paypalMethod) {
    super(_bindingComponent, _root, _localFieldCount);
    this.loader = loader;
    this.paypalMethod = paypalMethod;
  }

  @NonNull
  public static PaymentPaypalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.payment_paypal, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PaymentPaypalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PaymentPaypalBinding>inflateInternal(inflater, R.layout.payment_paypal, root, attachToRoot, component);
  }

  @NonNull
  public static PaymentPaypalBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.payment_paypal, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PaymentPaypalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PaymentPaypalBinding>inflateInternal(inflater, R.layout.payment_paypal, null, false, component);
  }

  public static PaymentPaypalBinding bind(@NonNull View view) {
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
  public static PaymentPaypalBinding bind(@NonNull View view, @Nullable Object component) {
    return (PaymentPaypalBinding)bind(component, view, R.layout.payment_paypal);
  }
}
