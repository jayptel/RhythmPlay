// Generated by data binding compiler. Do not edit!
package com.easyplex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.chivorn.smartmaterialspinner.SmartMaterialSpinner;
import com.easyplex.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LayoutGenresBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final LinearLayout filterBtn;

  @NonNull
  public final LinearLayout filterBtnAllgenres;

  @NonNull
  public final LinearLayout noMoviesFound;

  @NonNull
  public final TextView noResults;

  @NonNull
  public final SmartMaterialSpinner planetsSpinner;

  @NonNull
  public final SmartMaterialSpinner planetsSpinnerSort;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final TextView selectedGenre;

  @NonNull
  public final TextView selectedGenreLeft;

  protected LayoutGenresBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout constraintLayout, LinearLayout filterBtn, LinearLayout filterBtnAllgenres,
      LinearLayout noMoviesFound, TextView noResults, SmartMaterialSpinner planetsSpinner,
      SmartMaterialSpinner planetsSpinnerSort, RecyclerView recyclerView, TextView selectedGenre,
      TextView selectedGenreLeft) {
    super(_bindingComponent, _root, _localFieldCount);
    this.constraintLayout = constraintLayout;
    this.filterBtn = filterBtn;
    this.filterBtnAllgenres = filterBtnAllgenres;
    this.noMoviesFound = noMoviesFound;
    this.noResults = noResults;
    this.planetsSpinner = planetsSpinner;
    this.planetsSpinnerSort = planetsSpinnerSort;
    this.recyclerView = recyclerView;
    this.selectedGenre = selectedGenre;
    this.selectedGenreLeft = selectedGenreLeft;
  }

  @NonNull
  public static LayoutGenresBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_genres, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutGenresBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutGenresBinding>inflateInternal(inflater, R.layout.layout_genres, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutGenresBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_genres, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutGenresBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutGenresBinding>inflateInternal(inflater, R.layout.layout_genres, null, false, component);
  }

  public static LayoutGenresBinding bind(@NonNull View view) {
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
  public static LayoutGenresBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutGenresBinding)bind(component, view, R.layout.layout_genres);
  }
}
