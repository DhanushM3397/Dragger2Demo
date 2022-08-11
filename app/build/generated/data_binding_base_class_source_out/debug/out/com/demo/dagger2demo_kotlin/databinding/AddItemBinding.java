// Generated by data binding compiler. Do not edit!
package com.demo.dagger2demo_kotlin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.demo.dagger2demo_kotlin.R;
import com.demo.dagger2demo_kotlin.SubscriberViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AddItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView alertText;

  @NonNull
  public final CheckBox simpleCheckBox;

  @NonNull
  public final EditText userName;

  @Bindable
  protected SubscriberViewModel mMyalertviewmodel;

  protected AddItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView alertText, CheckBox simpleCheckBox, EditText userName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.alertText = alertText;
    this.simpleCheckBox = simpleCheckBox;
    this.userName = userName;
  }

  public abstract void setMyalertviewmodel(@Nullable SubscriberViewModel myalertviewmodel);

  @Nullable
  public SubscriberViewModel getMyalertviewmodel() {
    return mMyalertviewmodel;
  }

  @NonNull
  public static AddItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.add_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AddItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AddItemBinding>inflateInternal(inflater, R.layout.add_item, root, attachToRoot, component);
  }

  @NonNull
  public static AddItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.add_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AddItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AddItemBinding>inflateInternal(inflater, R.layout.add_item, null, false, component);
  }

  public static AddItemBinding bind(@NonNull View view) {
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
  public static AddItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (AddItemBinding)bind(component, view, R.layout.add_item);
  }
}