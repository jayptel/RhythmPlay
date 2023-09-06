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

public abstract class RowItemChoosedBinding extends ViewDataBinding {
  @NonNull
  public final ImageView itemMovieImage;

  @NonNull
  public final TextView mgenres;

  @NonNull
  public final TextView moviePremuim;

  @NonNull
  public final TextView movietitle;

  @NonNull
  public final FrameLayout rootLayout;

  @NonNull
  public final TextView substitle;

  protected RowItemChoosedBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView itemMovieImage, TextView mgenres, TextView moviePremuim, TextView movietitle,
      FrameLayout rootLayout, TextView substitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.itemMovieImage = itemMovieImage;
    this.mgenres = mgenres;
    this.moviePremuim = moviePremuim;
    this.movietitle = movietitle;
    this.rootLayout = rootLayout;
    this.substitle = substitle;
  }

  @NonNull
  public static RowItemChoosedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_item_choosed, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowItemChoosedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowItemChoosedBinding>inflateInternal(inflater, R.layout.row_item_choosed, root, attachToRoot, component);
  }

  @NonNull
  public static RowItemChoosedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_item_choosed, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowItemChoosedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowItemChoosedBinding>inflateInternal(inflater, R.layout.row_item_choosed, null, false, component);
  }

  public static RowItemChoosedBinding bind(@NonNull View view) {
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
  public static RowItemChoosedBinding bind(@NonNull View view, @Nullable Object component) {
    return (RowItemChoosedBinding)bind(component, view, R.layout.row_item_choosed);
  }
}
