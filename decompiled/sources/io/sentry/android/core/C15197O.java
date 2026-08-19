package io.sentry.android.core;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import io.sentry.C15109B;
import io.sentry.C15345d;
import io.sentry.C15516w;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15172W0;
import p544W9.AbstractC8483G3;

/* JADX INFO: renamed from: io.sentry.android.core.O */
/* JADX INFO: loaded from: classes3.dex */
public final class C15197O extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final C15109B f47365a;

    /* JADX INFO: renamed from: b */
    public final C15184B f47366b;

    /* JADX INFO: renamed from: c */
    public Network f47367c;

    /* JADX INFO: renamed from: d */
    public NetworkCapabilities f47368d;

    /* JADX INFO: renamed from: e */
    public long f47369e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC15172W0 f47370f;

    public C15197O(C15184B c15184b, InterfaceC15172W0 interfaceC15172W0) {
        C15109B c15109b = C15109B.f47017a;
        this.f47367c = null;
        this.f47368d = null;
        this.f47369e = 0L;
        this.f47365a = c15109b;
        AbstractC8483G3.m9133c(c15184b, "BuildInfoProvider is required");
        this.f47366b = c15184b;
        AbstractC8483G3.m9133c(interfaceC15172W0, "SentryDateProvider is required");
        this.f47370f = interfaceC15172W0;
    }

    /* JADX INFO: renamed from: a */
    public static C15345d m16402a(String str) {
        C15345d c15345d = new C15345d();
        c15345d.f47907p0 = "system";
        c15345d.f47909r0 = "network.event";
        c15345d.m16574b(str, "action");
        c15345d.f47911t0 = EnumC15375i1.INFO;
        return c15345d;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        if (network.equals(this.f47367c)) {
            return;
        }
        this.f47365a.mo16248l(m16402a("NETWORK_AVAILABLE"));
        this.f47367c = network;
        this.f47368d = null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:60:0x0108  */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        String str;
        long j10;
        boolean z6;
        boolean z10;
        C15196N c15196n;
        if (network.equals(this.f47367c)) {
            long jMo16356d = this.f47370f.mo16338a().mo16356d();
            NetworkCapabilities networkCapabilities2 = this.f47368d;
            long j11 = this.f47369e;
            C15184B c15184b = this.f47366b;
            if (networkCapabilities2 == null) {
                c15196n = new C15196N(networkCapabilities, c15184b, jMo16356d);
                j10 = jMo16356d;
            } else {
                AbstractC8483G3.m9133c(c15184b, "BuildInfoProvider is required");
                int linkDownstreamBandwidthKbps = networkCapabilities2.getLinkDownstreamBandwidthKbps();
                int linkUpstreamBandwidthKbps = networkCapabilities2.getLinkUpstreamBandwidthKbps();
                int signalStrength = Build.VERSION.SDK_INT >= 29 ? networkCapabilities2.getSignalStrength() : 0;
                if (signalStrength <= -100) {
                    signalStrength = 0;
                }
                boolean zHasTransport = networkCapabilities2.hasTransport(4);
                if (networkCapabilities2.hasTransport(3)) {
                    str = "ethernet";
                } else if (networkCapabilities2.hasTransport(1)) {
                    str = "wifi";
                } else {
                    str = networkCapabilities2.hasTransport(0) ? "cellular" : null;
                }
                if (str == null) {
                    str = "";
                }
                C15196N c15196n2 = new C15196N(networkCapabilities, c15184b, jMo16356d);
                int iAbs = Math.abs(signalStrength - c15196n2.f47352c);
                int iAbs2 = Math.abs(linkDownstreamBandwidthKbps - c15196n2.f47350a);
                int iAbs3 = Math.abs(linkUpstreamBandwidthKbps - c15196n2.f47351b);
                boolean z11 = ((double) Math.abs(j11 - c15196n2.f47353d)) / 1000000.0d < 5000.0d;
                boolean z12 = z11 || iAbs <= 5;
                if (z11) {
                    j10 = jMo16356d;
                } else {
                    j10 = jMo16356d;
                    if (iAbs2 > Math.max(1000.0d, ((double) Math.abs(linkDownstreamBandwidthKbps)) * 0.1d)) {
                        z6 = false;
                    }
                    if (!z11 || iAbs3 <= Math.max(1000.0d, ((double) Math.abs(linkUpstreamBandwidthKbps)) * 0.1d)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (zHasTransport != c15196n2.f47354e && str.equals(c15196n2.f47355f) && z12 && z6 && z10) {
                        c15196n = null;
                    } else {
                        c15196n = c15196n2;
                    }
                }
                z6 = true;
                if (z11) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (zHasTransport != c15196n2.f47354e) {
                    c15196n = c15196n2;
                } else {
                    c15196n = c15196n2;
                }
            }
            if (c15196n == null) {
                return;
            }
            this.f47368d = networkCapabilities;
            this.f47369e = j10;
            C15345d c15345dM16402a = m16402a("NETWORK_CAPABILITIES_CHANGED");
            c15345dM16402a.m16574b(Integer.valueOf(c15196n.f47350a), "download_bandwidth");
            c15345dM16402a.m16574b(Integer.valueOf(c15196n.f47351b), "upload_bandwidth");
            c15345dM16402a.m16574b(Boolean.valueOf(c15196n.f47354e), "vpn_active");
            c15345dM16402a.m16574b(c15196n.f47355f, "network_type");
            int i10 = c15196n.f47352c;
            if (i10 != 0) {
                c15345dM16402a.m16574b(Integer.valueOf(i10), "signal_strength");
            }
            C15516w c15516w = new C15516w();
            c15516w.m16729c("android:networkCapabilities", c15196n);
            this.f47365a.mo16252u(c15345dM16402a, c15516w);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        if (network.equals(this.f47367c)) {
            this.f47365a.mo16248l(m16402a("NETWORK_LOST"));
            this.f47367c = null;
            this.f47368d = null;
        }
    }
}
