// Generated by data binding compiler. Do not edit!
package com.easyplex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.balysv.materialripple.MaterialRippleLayout;
import com.easyplex.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemNetworkBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardviewPayment;

  @NonNull
  public final ImageView image;

  @NonNull
  public final MaterialRippleLayout lytParent;

  protected ItemNetworkBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardviewPayment, ImageView image, MaterialRippleLayout lytParent) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardviewPayment = cardviewPayment;
    this.image = image;
    this.lytParent = lytParent;
  }

  @NonNull
  public static ItemNetworkBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_network, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemNetworkBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemNetworkBinding>inflateInternal(inflater, R.layout.item_network, root, attachToRoot, component);
  }

  @NonNull
  public static ItemNetworkBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_network, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemNetworkBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemNetworkBinding>inflateInternal(inflater, R.layout.item_network, null, false, component);
  }

  public static ItemNetworkBinding bind(@NonNull View view) {
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
  public static ItemNetworkBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemNetworkBinding)bind(component, view, R.layout.item_network);
  }
}