package com.demo.dagger2demo_kotlin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\u0012\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\""}, d2 = {"Lcom/demo/dagger2demo_kotlin/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "addItemBinding", "Lcom/demo/dagger2demo_kotlin/databinding/AddItemBinding;", "getAddItemBinding", "()Lcom/demo/dagger2demo_kotlin/databinding/AddItemBinding;", "setAddItemBinding", "(Lcom/demo/dagger2demo_kotlin/databinding/AddItemBinding;)V", "binding", "Lcom/demo/dagger2demo_kotlin/databinding/ActivityMainBinding;", "subscriberViewModel", "Lcom/demo/dagger2demo_kotlin/SubscriberViewModel;", "videoAdapter", "Lcom/demo/dagger2demo_kotlin/adapters/VideoAdapter;", "viewModel", "Lcom/demo/dagger2demo_kotlin/MainActivityViewModel;", "getViewModel", "()Lcom/demo/dagger2demo_kotlin/MainActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addInfo", "", "displaySubscriberList", "initFeedRecyclerView", "initRecyclerView", "listItemClicked", "subscriber", "Lcom/demo/dagger2demo_kotlin/db/Subscriber;", "loadData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "updateInfo", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.demo.dagger2demo_kotlin.databinding.ActivityMainBinding binding;
    public com.demo.dagger2demo_kotlin.databinding.AddItemBinding addItemBinding;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.demo.dagger2demo_kotlin.SubscriberViewModel subscriberViewModel;
    private com.demo.dagger2demo_kotlin.adapters.VideoAdapter videoAdapter;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
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
    
    private final void displaySubscriberList() {
    }
    
    private final void listItemClicked(com.demo.dagger2demo_kotlin.db.Subscriber subscriber) {
    }
    
    private final void updateInfo(com.demo.dagger2demo_kotlin.db.Subscriber subscriber) {
    }
}