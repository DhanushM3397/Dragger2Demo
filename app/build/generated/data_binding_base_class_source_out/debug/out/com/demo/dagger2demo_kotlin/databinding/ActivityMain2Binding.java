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
import androidx.appcompat.widget.AppCompatEditText;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.demo.dagger2demo_kotlin.R;
import com.demo.dagger2demo_kotlin.SubscriberViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMain2Binding extends ViewDataBinding {
  @NonNull
  public final CheckBox simpleCheckBox;

  @NonNull
  public final TextView textview;

  @NonNull
  public final EditText userEmail1;

  @NonNull
  public final AppCompatEditText userName1;

  @Bindable
  protected SubscriberViewModel mMyalertviewmodel;

  protected ActivityMain2Binding(Object _bindingComponent, View _root, int _localFieldCount,
      CheckBox simpleCheckBox, TextView textview, EditText userEmail1,
      AppCompatEditText userName1) {
    super(_bindingComponent, _root, _localFieldCount);
    this.simpleCheckBox = simpleCheckBox;
    this.textview = textview;
    this.userEmail1 = userEmail1;
    this.userName1 = userName1;
  }

  public abstract void setMyalertviewmodel(@Nullable SubscriberViewModel myalertviewmodel);

  @Nullable
  public SubscriberViewModel getMyalertviewmodel() {
    return mMyalertviewmodel;
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main2, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMain2Binding>inflateInternal(inflater, R.layout.activity_main2, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main2, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMain2Binding>inflateInternal(inflater, R.layout.activity_main2, null, false, component);
  }

  public static ActivityMain2Binding bind(@NonNull View view) {
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
  public static ActivityMain2Binding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMain2Binding)bind(component, view, R.layout.activity_main2);
  }
}
