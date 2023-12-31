// Generated by data binding compiler. Do not edit!
package com.easyplex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.easyplex.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogCommentsBinding extends ViewDataBinding {
  @NonNull
  public final FloatingActionButton addCommentBtn;

  @NonNull
  public final ImageView btClose;

  @NonNull
  public final EditText commentMessage;

  @NonNull
  public final TextView commentTotal;

  @NonNull
  public final ImageView imageViewCommentDialogEmpty;

  @NonNull
  public final LinearLayout noCommentFound;

  @NonNull
  public final RelativeLayout relativeLayoutCommentBack;

  @NonNull
  public final RecyclerView rvComments;

  protected DialogCommentsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FloatingActionButton addCommentBtn, ImageView btClose, EditText commentMessage,
      TextView commentTotal, ImageView imageViewCommentDialogEmpty, LinearLayout noCommentFound,
      RelativeLayout relativeLayoutCommentBack, RecyclerView rvComments) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addCommentBtn = addCommentBtn;
    this.btClose = btClose;
    this.commentMessage = commentMessage;
    this.commentTotal = commentTotal;
    this.imageViewCommentDialogEmpty = imageViewCommentDialogEmpty;
    this.noCommentFound = noCommentFound;
    this.relativeLayoutCommentBack = relativeLayoutCommentBack;
    this.rvComments = rvComments;
  }

  @NonNull
  public static DialogCommentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_comments, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogCommentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogCommentsBinding>inflateInternal(inflater, R.layout.dialog_comments, root, attachToRoot, component);
  }

  @NonNull
  public static DialogCommentsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_comments, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogCommentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogCommentsBinding>inflateInternal(inflater, R.layout.dialog_comments, null, false, component);
  }

  public static DialogCommentsBinding bind(@NonNull View view) {
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
  public static DialogCommentsBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogCommentsBinding)bind(component, view, R.layout.dialog_comments);
  }
}
