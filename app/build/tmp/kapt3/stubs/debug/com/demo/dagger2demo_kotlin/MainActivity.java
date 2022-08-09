package com.demo.dagger2demo_kotlin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u001dH\u0002J\u0012\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006%"}, d2 = {"Lcom/demo/dagger2demo_kotlin/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "addItemBinding", "Lcom/demo/dagger2demo_kotlin/databinding/AddItemBinding;", "getAddItemBinding", "()Lcom/demo/dagger2demo_kotlin/databinding/AddItemBinding;", "setAddItemBinding", "(Lcom/demo/dagger2demo_kotlin/databinding/AddItemBinding;)V", "binding", "Lcom/demo/dagger2demo_kotlin/databinding/ActivityMainBinding;", "getBinding", "()Lcom/demo/dagger2demo_kotlin/databinding/ActivityMainBinding;", "setBinding", "(Lcom/demo/dagger2demo_kotlin/databinding/ActivityMainBinding;)V", "check", "", "checkBoole", "subscriberViewModel", "Lcom/demo/dagger2demo_kotlin/SubscriberViewModel;", "videoAdapter", "Lcom/demo/dagger2demo_kotlin/adapters/VideoAdapter;", "viewModel", "Lcom/demo/dagger2demo_kotlin/MainActivityViewModel;", "getViewModel", "()Lcom/demo/dagger2demo_kotlin/MainActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "DisplaySubscriberList", "", "addInfo", "initFeedRecyclerView", "initRecyclerView", "loadData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    public com.demo.dagger2demo_kotlin.databinding.ActivityMainBinding binding;
    public com.demo.dagger2demo_kotlin.databinding.AddItemBinding addItemBinding;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.demo.dagger2demo_kotlin.SubscriberViewModel subscriberViewModel;
    private com.demo.dagger2demo_kotlin.adapters.VideoAdapter videoAdapter;
    private java.lang.String check;
    private java.lang.String checkBoole;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.dagger2demo_kotlin.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.demo.dagger2demo_kotlin.databinding.ActivityMainBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.dagger2demo_kotlin.databinding.AddItemBinding getAddItemBinding() {
        return null;
    }
    
    public final void setAddItemBinding(@org.jetbrains.annotations.NotNull()
    com.demo.dagger2demo_kotlin.databinding.AddItemBinding p0) {
    }
    
    private final com.demo.dagger2demo_kotlin.MainActivityViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRecyclerView() {
    }
    
    private final void loadData() {
    }
    
    private final void addInfo() {
    }
    
    private final void initFeedRecyclerView() {
    }
    
    private final void DisplaySubscriberList() {
    }
}