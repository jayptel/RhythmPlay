// Generated by data binding compiler. Do not edit!
package com.easyplex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.easyplex.R;
import com.easyplex.ui.users.MenuHandler;
import com.mikhaellopez.circularimageview.CircularImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemProfilesBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout deleteProfile;

  @NonNull
  public final LinearLayout editProfile;

  @NonNull
  public final CircularImageView itemMovieImage;

  @NonNull
  public final TextView profileTitle;

  @NonNull
  public final LinearLayout rootLayout;

  @Bindable
  protected MenuHandler mController;

  protected ItemProfilesBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout deleteProfile, LinearLayout editProfile, CircularImageView itemMovieImage,
      TextView profileTitle, LinearLayout rootLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.deleteProfile = deleteProfile;
    this.editProfile = editProfile;
    this.itemMovieImage = itemMovieImage;
    this.profileTitle = profileTitle;
    this.rootLayout = rootLayout;
  }

  public abstract void setController(@Nullable MenuHandler controller);

  @Nullable
  public MenuHandler getController() {
    return mController;
  }

  @NonNull
  public static ItemProfilesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_profiles, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemProfilesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemProfilesBinding>inflateInternal(inflater, R.layout.item_profiles, root, attachToRoot, component);
  }

  @NonNull
  public static ItemProfilesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_profiles, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemProfilesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemProfilesBinding>inflateInternal(inflater, R.layout.item_profiles, null, false, component);
  }

  public static ItemProfilesBinding bind(@NonNull View view) {
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
  public static ItemProfilesBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemProfilesBinding)bind(component, view, R.layout.item_profiles);
  }
}
