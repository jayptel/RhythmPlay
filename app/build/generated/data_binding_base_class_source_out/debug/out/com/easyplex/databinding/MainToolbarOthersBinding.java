// Generated by data binding compiler. Do not edit!
package com.easyplex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.easyplex.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MainToolbarOthersBinding extends ViewDataBinding {
  @NonNull
  public final ImageView logoImageTop;

  @NonNull
  public final Toolbar toolbar;

  protected MainToolbarOthersBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView logoImageTop, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.logoImageTop = logoImageTop;
    this.toolbar = toolbar;
  }

  @NonNull
  public static MainToolbarOthersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.main_toolbar_others, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MainToolbarOthersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MainToolbarOthersBinding>inflateInternal(inflater, R.layout.main_toolbar_others, root, attachToRoot, component);
  }

  @NonNull
  public static MainToolbarOthersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.main_toolbar_others, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MainToolbarOthersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MainToolbarOthersBinding>inflateInternal(inflater, R.layout.main_toolbar_others, null, false, component);
  }

  public static MainToolbarOthersBinding bind(@NonNull View view) {
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
  public static MainToolbarOthersBinding bind(@NonNull View view, @Nullable Object component) {
    return (MainToolbarOthersBinding)bind(component, view, R.layout.main_toolbar_others);
  }
}
