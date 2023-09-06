// Generated by data binding compiler. Do not edit!
package com.easyplex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.easyplex.R;
import com.easyplex.ui.downloadmanager.ui.browser.BrowserViewModel;
import com.easyplex.ui.downloadmanager.ui.customview.NestedWebView;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityBrowserTopAppBarBinding extends ViewDataBinding {
  @NonNull
  public final BrowserAddressBarBinding addressBar;

  @NonNull
  public final AppBarLayout appBar;

  @NonNull
  public final CoordinatorLayout coordinatorLayout;

  @NonNull
  public final BrowserProgressBarBinding progress;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final NestedWebView webView;

  @Bindable
  protected BrowserViewModel mViewModel;

  protected ActivityBrowserTopAppBarBinding(Object _bindingComponent, View _root,
      int _localFieldCount, BrowserAddressBarBinding addressBar, AppBarLayout appBar,
      CoordinatorLayout coordinatorLayout, BrowserProgressBarBinding progress, Toolbar toolbar,
      NestedWebView webView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addressBar = addressBar;
    this.appBar = appBar;
    this.coordinatorLayout = coordinatorLayout;
    this.progress = progress;
    this.toolbar = toolbar;
    this.webView = webView;
  }

  public abstract void setViewModel(@Nullable BrowserViewModel viewModel);

  @Nullable
  public BrowserViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityBrowserTopAppBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_browser_top_app_bar, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityBrowserTopAppBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityBrowserTopAppBarBinding>inflateInternal(inflater, R.layout.activity_browser_top_app_bar, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityBrowserTopAppBarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_browser_top_app_bar, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityBrowserTopAppBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityBrowserTopAppBarBinding>inflateInternal(inflater, R.layout.activity_browser_top_app_bar, null, false, component);
  }

  public static ActivityBrowserTopAppBarBinding bind(@NonNull View view) {
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
  public static ActivityBrowserTopAppBarBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityBrowserTopAppBarBinding)bind(component, view, R.layout.activity_browser_top_app_bar);
  }
}