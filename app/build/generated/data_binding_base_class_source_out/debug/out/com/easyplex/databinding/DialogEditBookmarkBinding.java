// Generated by data binding compiler. Do not edit!
package com.easyplex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.easyplex.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogEditBookmarkBinding extends ViewDataBinding {
  @NonNull
  public final TextInputLayout layoutName;

  @NonNull
  public final TextInputLayout layoutUrl;

  @NonNull
  public final TextInputEditText name;

  @NonNull
  public final TextInputEditText url;

  protected DialogEditBookmarkBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextInputLayout layoutName, TextInputLayout layoutUrl, TextInputEditText name,
      TextInputEditText url) {
    super(_bindingComponent, _root, _localFieldCount);
    this.layoutName = layoutName;
    this.layoutUrl = layoutUrl;
    this.name = name;
    this.url = url;
  }

  @NonNull
  public static DialogEditBookmarkBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_edit_bookmark, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogEditBookmarkBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogEditBookmarkBinding>inflateInternal(inflater, R.layout.dialog_edit_bookmark, root, attachToRoot, component);
  }

  @NonNull
  public static DialogEditBookmarkBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_edit_bookmark, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogEditBookmarkBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogEditBookmarkBinding>inflateInternal(inflater, R.layout.dialog_edit_bookmark, null, false, component);
  }

  public static DialogEditBookmarkBinding bind(@NonNull View view) {
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
  public static DialogEditBookmarkBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogEditBookmarkBinding)bind(component, view, R.layout.dialog_edit_bookmark);
  }
}
