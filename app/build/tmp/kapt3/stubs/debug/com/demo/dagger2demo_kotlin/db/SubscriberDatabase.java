package com.demo.dagger2demo_kotlin.db;

import java.lang.System;

@androidx.room.Database(entities = {com.demo.dagger2demo_kotlin.db.Subscriber.class}, version = 2)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/demo/dagger2demo_kotlin/db/SubscriberDatabase;", "Landroidx/room/RoomDatabase;", "()V", "subscriberDAO", "Lcom/demo/dagger2demo_kotlin/db/SubscriberDAO;", "getSubscriberDAO", "()Lcom/demo/dagger2demo_kotlin/db/SubscriberDAO;", "Companion", "app_debug"})
public abstract class SubscriberDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.demo.dagger2demo_kotlin.db.SubscriberDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.demo.dagger2demo_kotlin.db.SubscriberDatabase INSTANCE;
    
    public SubscriberDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.demo.dagger2demo_kotlin.db.SubscriberDAO getSubscriberDAO();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/demo/dagger2demo_kotlin/db/SubscriberDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/demo/dagger2demo_kotlin/db/SubscriberDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.demo.dagger2demo_kotlin.db.SubscriberDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}