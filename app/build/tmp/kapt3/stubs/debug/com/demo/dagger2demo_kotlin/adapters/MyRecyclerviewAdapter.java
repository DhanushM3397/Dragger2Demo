package com.demo.dagger2demo_kotlin.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/demo/dagger2demo_kotlin/adapters/MyRecyclerviewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/demo/dagger2demo_kotlin/adapters/MyRecyclerviewAdapter$MyViewHolder;", "context", "Landroid/content/Context;", "subscribersList", "", "Lcom/demo/dagger2demo_kotlin/db/Subscriber;", "clickLister", "Lkotlin/Function1;", "", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getContext", "()Landroid/content/Context;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "app_debug"})
public final class MyRecyclerviewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.demo.dagger2demo_kotlin.adapters.MyRecyclerviewAdapter.MyViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final java.util.List<com.demo.dagger2demo_kotlin.db.Subscriber> subscribersList = null;
    private final kotlin.jvm.functions.Function1<com.demo.dagger2demo_kotlin.db.Subscriber, kotlin.Unit> clickLister = null;
    
    public MyRecyclerviewAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.demo.dagger2demo_kotlin.db.Subscriber> subscribersList, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.demo.dagger2demo_kotlin.db.Subscriber, kotlin.Unit> clickLister) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.demo.dagger2demo_kotlin.adapters.MyRecyclerviewAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.demo.dagger2demo_kotlin.adapters.MyRecyclerviewAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/demo/dagger2demo_kotlin/adapters/MyRecyclerviewAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/demo/dagger2demo_kotlin/databinding/ListItemBinding;", "(Lcom/demo/dagger2demo_kotlin/adapters/MyRecyclerviewAdapter;Lcom/demo/dagger2demo_kotlin/databinding/ListItemBinding;)V", "getBinding", "()Lcom/demo/dagger2demo_kotlin/databinding/ListItemBinding;", "bind", "", "subscriber", "Lcom/demo/dagger2demo_kotlin/db/Subscriber;", "clickLister", "Lkotlin/Function1;", "app_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.demo.dagger2demo_kotlin.databinding.ListItemBinding binding = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.demo.dagger2demo_kotlin.databinding.ListItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.demo.dagger2demo_kotlin.databinding.ListItemBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.demo.dagger2demo_kotlin.db.Subscriber subscriber, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.demo.dagger2demo_kotlin.db.Subscriber, kotlin.Unit> clickLister) {
        }
    }
}