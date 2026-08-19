package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import android.net.Network;
import io.sentry.InterfaceC15115D;
import p658b5.C11238i;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C15229a extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC15115D f47524a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11238i f47525b;

    public C15229a(C11238i c11238i, InterfaceC15115D interfaceC15115D) {
        this.f47525b = c11238i;
        this.f47524a = interfaceC15115D;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f47524a.mo16259m(this.f47525b.mo12581z());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i10) {
        this.f47524a.mo16259m(this.f47525b.mo12581z());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f47524a.mo16259m(this.f47525b.mo12581z());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        this.f47524a.mo16259m(this.f47525b.mo12581z());
    }
}
