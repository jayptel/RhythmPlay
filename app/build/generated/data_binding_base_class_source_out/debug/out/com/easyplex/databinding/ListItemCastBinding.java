// Generated by data binding compiler. Do not edit!
package com.easyplex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.easyplex.R;
import com.mikhaellopez.circularimageview.CircularImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemCastBinding extends ViewDataBinding {
  @NonNull
  public final TextView castName;

  @NonNull
  public final CircularImageView imageCast;

  @NonNull
  public final LinearLayout rootLayout;

  protected ListItemCastBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView castName, CircularImageView imageCast, LinearLayout rootLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.castName = castName;
    this.imageCast = imageCast;
    this.rootLayout = rootLayout;
  }

  @NonNull
  public static ListItemCastBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_cast, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemCastBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemCastBinding>inflateInternal(inflater, R.layout.list_item_cast, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemCastBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_cast, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemCastBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemCastBinding>inflateInternal(inflater, R.layout.list_item_cast, null, false, component);
  }

  public static ListItemCastBinding bind(@NonNull View view) {
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
  public static ListItemCastBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemCastBinding)bind(component, view, R.layout.list_item_cast);
  }
}
