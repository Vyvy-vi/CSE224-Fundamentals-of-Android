package com.example.littlelemon;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0016\u0010\u0013\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/littlelemon/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "database", "Lcom/example/littlelemon/AppDatabase;", "getDatabase", "()Lcom/example/littlelemon/AppDatabase;", "database$delegate", "Lkotlin/Lazy;", "httpClient", "Lio/ktor/client/HttpClient;", "fetchMenu", "", "Lcom/example/littlelemon/MenuItemNetwork;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "saveMenuToDatabase", "menuItemsNetwork", "app_debug"})
public final class MainActivity extends androidx.activity.ComponentActivity {
    private final io.ktor.client.HttpClient httpClient = null;
    private final kotlin.Lazy database$delegate = null;
    
    public MainActivity() {
        super();
    }
    
    private final com.example.littlelemon.AppDatabase getDatabase() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final java.lang.Object fetchMenu(kotlin.coroutines.Continuation<? super java.util.List<com.example.littlelemon.MenuItemNetwork>> continuation) {
        return null;
    }
    
    private final void saveMenuToDatabase(java.util.List<com.example.littlelemon.MenuItemNetwork> menuItemsNetwork) {
    }
}