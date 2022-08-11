package com.demo.dagger2demo_kotlin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0006\u0010\u0015\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\tJ\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\tJ\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\tH\u0002J\u000e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cJ\u0012\u0010\u001d\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J&\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001cJ\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\tH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006#"}, d2 = {"Lcom/demo/dagger2demo_kotlin/SubscriberViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/databinding/Observable;", "repositary", "Lcom/demo/dagger2demo_kotlin/db/SubscriberRepositary;", "(Lcom/demo/dagger2demo_kotlin/db/SubscriberRepositary;)V", "isUpdateorDelete", "", "subscriberToUpdateOrDelete", "Lcom/demo/dagger2demo_kotlin/db/Subscriber;", "subscribers", "Landroidx/lifecycle/LiveData;", "", "getSubscribers", "()Landroidx/lifecycle/LiveData;", "addOnPropertyChangedCallback", "", "callback", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "clearAll", "Lkotlinx/coroutines/Job;", "clearAllorDelete", "delete", "subscriber", "initUpdateandDelete", "insert", "itemUpdate", "isLive", "", "removeOnPropertyChangedCallback", "save", "name", "email", "isliveBoolean", "update", "app_debug"})
public final class SubscriberViewModel extends androidx.lifecycle.ViewModel implements androidx.databinding.Observable {
    private final com.demo.dagger2demo_kotlin.db.SubscriberRepositary repositary = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.demo.dagger2demo_kotlin.db.Subscriber>> subscribers = null;
    private boolean isUpdateorDelete = false;
    private com.demo.dagger2demo_kotlin.db.Subscriber subscriberToUpdateOrDelete;
    
    public SubscriberViewModel(@org.jetbrains.annotations.NotNull()
    com.demo.dagger2demo_kotlin.db.SubscriberRepositary repositary) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.demo.dagger2demo_kotlin.db.Subscriber>> getSubscribers() {
        return null;
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String isLive, @org.jetbrains.annotations.NotNull()
    java.lang.String isliveBoolean) {
    }
    
    public final void itemUpdate(@org.jetbrains.annotations.NotNull()
    java.lang.String isLive) {
    }
    
    public final void clearAllorDelete() {
    }
    
    private final kotlinx.coroutines.Job insert(com.demo.dagger2demo_kotlin.db.Subscriber subscriber) {
        return null;
    }
    
    private final kotlinx.coroutines.Job update(com.demo.dagger2demo_kotlin.db.Subscriber subscriber) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job delete(@org.jetbrains.annotations.NotNull()
    com.demo.dagger2demo_kotlin.db.Subscriber subscriber) {
        return null;
    }
    
    private final kotlinx.coroutines.Job clearAll() {
        return null;
    }
    
    public final void initUpdateandDelete(@org.jetbrains.annotations.NotNull()
    com.demo.dagger2demo_kotlin.db.Subscriber subscriber) {
    }
    
    @java.lang.Override()
    public void addOnPropertyChangedCallback(@org.jetbrains.annotations.Nullable()
    androidx.databinding.Observable.OnPropertyChangedCallback callback) {
    }
    
    @java.lang.Override()
    public void removeOnPropertyChangedCallback(@org.jetbrains.annotations.Nullable()
    androidx.databinding.Observable.OnPropertyChangedCallback callback) {
    }
}