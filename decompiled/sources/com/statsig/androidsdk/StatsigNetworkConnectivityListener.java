package com.statsig.androidsdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m18067d2 = {"Lcom/statsig/androidsdk/StatsigNetworkConnectivityListener;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "connectivityManager", "Landroid/net/ConnectivityManager;", "isNetworkAvailable", "", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class StatsigNetworkConnectivityListener {
    private final ConnectivityManager connectivityManager;

    public StatsigNetworkConnectivityListener(Context context) {
        AbstractC16544l.m18094g(context, "context");
        Object systemService = context.getSystemService("connectivity");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        this.connectivityManager = (ConnectivityManager) systemService;
    }

    public final boolean isNetworkAvailable() {
        NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(this.connectivityManager.getActiveNetwork());
        return AbstractC16544l.m18089b(networkCapabilities == null ? null : Boolean.valueOf(networkCapabilities.hasCapability(12)), Boolean.TRUE);
    }
}
