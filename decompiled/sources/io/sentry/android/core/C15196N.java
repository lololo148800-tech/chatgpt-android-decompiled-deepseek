package io.sentry.android.core;

import android.net.NetworkCapabilities;
import android.os.Build;
import p544W9.AbstractC8483G3;

/* JADX INFO: renamed from: io.sentry.android.core.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C15196N {

    /* JADX INFO: renamed from: a */
    public final int f47350a;

    /* JADX INFO: renamed from: b */
    public final int f47351b;

    /* JADX INFO: renamed from: c */
    public final int f47352c;

    /* JADX INFO: renamed from: d */
    public final long f47353d;

    /* JADX INFO: renamed from: e */
    public final boolean f47354e;

    /* JADX INFO: renamed from: f */
    public final String f47355f;

    public C15196N(NetworkCapabilities networkCapabilities, C15184B c15184b, long j10) {
        String str;
        AbstractC8483G3.m9133c(networkCapabilities, "NetworkCapabilities is required");
        AbstractC8483G3.m9133c(c15184b, "BuildInfoProvider is required");
        this.f47350a = networkCapabilities.getLinkDownstreamBandwidthKbps();
        this.f47351b = networkCapabilities.getLinkUpstreamBandwidthKbps();
        int signalStrength = Build.VERSION.SDK_INT >= 29 ? networkCapabilities.getSignalStrength() : 0;
        this.f47352c = signalStrength <= -100 ? 0 : signalStrength;
        this.f47354e = networkCapabilities.hasTransport(4);
        if (networkCapabilities.hasTransport(3)) {
            str = "ethernet";
        } else if (networkCapabilities.hasTransport(1)) {
            str = "wifi";
        } else {
            str = networkCapabilities.hasTransport(0) ? "cellular" : null;
        }
        this.f47355f = str == null ? "" : str;
        this.f47353d = j10;
    }
}
