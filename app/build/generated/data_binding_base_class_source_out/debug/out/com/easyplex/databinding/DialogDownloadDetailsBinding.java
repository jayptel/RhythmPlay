// Generated by data binding compiler. Do not edit!
package com.easyplex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.easyplex.R;
import com.easyplex.ui.downloadmanager.ui.customview.FixHintTextInputEditText;
import com.easyplex.ui.downloadmanager.ui.details.DownloadDetailsViewModel;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogDownloadDetailsBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton calculateMd5Hash;

  @NonNull
  public final MaterialButton calculateSha256Hash;

  @NonNull
  public final FixHintTextInputEditText checksum;

  @NonNull
  public final ImageButton checksumClipboardButton;

  @NonNull
  public final TextView checksumTitle;

  @NonNull
  public final LinearLayout content;

  @NonNull
  public final TextView dateAdded;

  @NonNull
  public final TextInputEditText description;

  @NonNull
  public final TextView downloaded;

  @NonNull
  public final ImageButton folderChooserButton;

  @NonNull
  public final TextView freeSpace;

  @NonNull
  public final ContentLoadingProgressBar initProgress;

  @NonNull
  public final TextInputLayout layoutChecksum;

  @NonNull
  public final TextInputLayout layoutDescription;

  @NonNull
  public final TextInputLayout layoutLink;

  @NonNull
  public final TextInputLayout layoutName;

  @NonNull
  public final TextInputLayout layoutSavePath;

  @NonNull
  public final TextInputEditText link;

  @NonNull
  public final TextView md5Hash;

  @NonNull
  public final ContentLoadingProgressBar md5HashProgress;

  @NonNull
  public final TextInputEditText name;

  @NonNull
  public final TextView numPieces;

  @NonNull
  public final CheckBox retry;

  @NonNull
  public final TextInputEditText savePath;

  @NonNull
  public final TextView sha256Hash;

  @NonNull
  public final ContentLoadingProgressBar sha256HashProgress;

  @NonNull
  public final CheckBox unmeteredConnectionsOnly;

  @NonNull
  public final ImageButton urlClipboardButton;

  @NonNull
  public final TextView userAgent;

  @Bindable
  protected DownloadDetailsViewModel mViewModel;

  protected DialogDownloadDetailsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton calculateMd5Hash, MaterialButton calculateSha256Hash,
      FixHintTextInputEditText checksum, ImageButton checksumClipboardButton,
      TextView checksumTitle, LinearLayout content, TextView dateAdded,
      TextInputEditText description, TextView downloaded, ImageButton folderChooserButton,
      TextView freeSpace, ContentLoadingProgressBar initProgress, TextInputLayout layoutChecksum,
      TextInputLayout layoutDescription, TextInputLayout layoutLink, TextInputLayout layoutName,
      TextInputLayout layoutSavePath, TextInputEditText link, TextView md5Hash,
      ContentLoadingProgressBar md5HashProgress, TextInputEditText name, TextView numPieces,
      CheckBox retry, TextInputEditText savePath, TextView sha256Hash,
      ContentLoadingProgressBar sha256HashProgress, CheckBox unmeteredConnectionsOnly,
      ImageButton urlClipboardButton, TextView userAgent) {
    super(_bindingComponent, _root, _localFieldCount);
    this.calculateMd5Hash = calculateMd5Hash;
    this.calculateSha256Hash = calculateSha256Hash;
    this.checksum = checksum;
    this.checksumClipboardButton = checksumClipboardButton;
    this.checksumTitle = checksumTitle;
    this.content = content;
    this.dateAdded = dateAdded;
    this.description = description;
    this.downloaded = downloaded;
    this.folderChooserButton = folderChooserButton;
    this.freeSpace = freeSpace;
    this.initProgress = initProgress;
    this.layoutChecksum = layoutChecksum;
    this.layoutDescription = layoutDescription;
    this.layoutLink = layoutLink;
    this.layoutName = layoutName;
    this.layoutSavePath = layoutSavePath;
    this.link = link;
    this.md5Hash = md5Hash;
    this.md5HashProgress = md5HashProgress;
    this.name = name;
    this.numPieces = numPieces;
    this.retry = retry;
    this.savePath = savePath;
    this.sha256Hash = sha256Hash;
    this.sha256HashProgress = sha256HashProgress;
    this.unmeteredConnectionsOnly = unmeteredConnectionsOnly;
    this.urlClipboardButton = urlClipboardButton;
    this.userAgent = userAgent;
  }

  public abstract void setViewModel(@Nullable DownloadDetailsViewModel viewModel);

  @Nullable
  public DownloadDetailsViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static DialogDownloadDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_download_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogDownloadDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogDownloadDetailsBinding>inflateInternal(inflater, R.layout.dialog_download_details, root, attachToRoot, component);
  }

  @NonNull
  public static DialogDownloadDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_download_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogDownloadDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogDownloadDetailsBinding>inflateInternal(inflater, R.layout.dialog_download_details, null, false, component);
  }

  public static DialogDownloadDetailsBinding bind(@NonNull View view) {
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
  public static DialogDownloadDetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogDownloadDetailsBinding)bind(component, view, R.layout.dialog_download_details);
  }
}
