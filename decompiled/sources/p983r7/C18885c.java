package p983r7;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.AbstractC16544l;
import p1145z7.C21807d;
import p1145z7.InterfaceC21808e;
import p165G9.C3024j;
import p310M9.C5311e;
import p523V9.AbstractC7889G0;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p676c7.C11685d;

/* JADX INFO: renamed from: r7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C18885c extends ConnectivityManager.NetworkCallback implements InterfaceC18886d {

    /* JADX INFO: renamed from: Y */
    public final C5311e f60207Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC21808e f60208Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC11256c f60209o0;

    /* JADX INFO: renamed from: p0 */
    public C11685d f60210p0;

    public C18885c(C5311e c5311e, InterfaceC11256c internalLogger) {
        InterfaceC21808e.f69170n0.getClass();
        C3024j c3024j = C21807d.f69169b;
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f60207Y = c5311e;
        this.f60208Z = c3024j;
        this.f60209o0 = internalLogger;
        this.f60210p0 = new C11685d(0, null, null, null, null, null, null, 127);
    }

    @Override // p983r7.InterfaceC18886d
    /* JADX INFO: renamed from: a */
    public final void mo17961a(Context context) {
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        EnumC11255b enumC11255b = EnumC11255b.f34098Y;
        if (connectivityManager == null) {
            AbstractC7889G0.m8184b(this.f60209o0, 5, enumC11255b, C18884b.f60203q0, null, false, 56);
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this);
        } catch (SecurityException e10) {
            AbstractC7889G0.m8184b(this.f60209o0, 5, enumC11255b, C18884b.f60204r0, e10, false, 48);
        } catch (RuntimeException e11) {
            AbstractC7889G0.m8184b(this.f60209o0, 5, enumC11255b, C18884b.f60205s0, e11, false, 48);
        }
    }

    @Override // p983r7.InterfaceC18886d
    /* JADX INFO: renamed from: k */
    public final void mo17962k(Context context) {
        C5311e c5311e = this.f60207Y;
        AbstractC16544l.m18094g(context, "context");
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        EnumC11255b enumC11255b = EnumC11255b.f34098Y;
        if (connectivityManager == null) {
            AbstractC7889G0.m8184b(this.f60209o0, 5, enumC11255b, C18884b.f60200Z, null, false, 56);
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(this);
            Network activeNetwork = connectivityManager.getActiveNetwork();
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (activeNetwork == null || networkCapabilities == null) {
                return;
            }
            onCapabilitiesChanged(activeNetwork, networkCapabilities);
        } catch (SecurityException e10) {
            AbstractC7889G0.m8184b(this.f60209o0, 5, enumC11255b, C18884b.f60201o0, e10, false, 48);
            C11685d c11685d = new C11685d(12, null, null, null, null, null, null, 126);
            this.f60210p0 = c11685d;
            c5311e.m5846A(c11685d);
        } catch (Exception e11) {
            AbstractC7889G0.m8184b(this.f60209o0, 5, enumC11255b, C18884b.f60202p0, e11, false, 48);
            C11685d c11685d2 = new C11685d(12, null, null, null, null, null, null, 126);
            this.f60210p0 = c11685d2;
            c5311e.m5846A(c11685d2);
        }
    }

    @Override // p983r7.InterfaceC18886d
    /* JADX INFO: renamed from: o */
    public final C11685d mo17963o() {
        return this.f60210p0;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0017 A[PHI: r1
      0x0017: PHI (r1v4 int) = (r1v0 int), (r1v1 int) binds: [B:3:0x0015, B:6:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        int i10;
        int i11;
        AbstractC16544l.m18094g(network, "network");
        AbstractC16544l.m18094g(networkCapabilities, "networkCapabilities");
        super.onCapabilitiesChanged(network, networkCapabilities);
        int i12 = 3;
        if (networkCapabilities.hasTransport(1)) {
            i11 = i12;
        } else {
            i12 = 2;
            if (networkCapabilities.hasTransport(3)) {
                i11 = i12;
            } else {
                if (networkCapabilities.hasTransport(0)) {
                    i10 = 11;
                } else {
                    i10 = networkCapabilities.hasTransport(2) ? 5 : 12;
                }
                i11 = i10;
            }
        }
        C11685d c11685d = new C11685d(i11, null, null, networkCapabilities.getLinkUpstreamBandwidthKbps() > 0 ? Long.valueOf(networkCapabilities.getLinkUpstreamBandwidthKbps()) : null, networkCapabilities.getLinkDownstreamBandwidthKbps() > 0 ? Long.valueOf(networkCapabilities.getLinkDownstreamBandwidthKbps()) : null, (((C3024j) this.f60208Z).f9112Z < 29 || networkCapabilities.getSignalStrength() == Integer.MIN_VALUE) ? null : Long.valueOf(networkCapabilities.getSignalStrength()), null, 70);
        this.f60210p0 = c11685d;
        this.f60207Y.m5846A(c11685d);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AbstractC16544l.m18094g(network, "network");
        super.onLost(network);
        C11685d c11685d = new C11685d(1, null, null, null, null, null, null, 126);
        this.f60210p0 = c11685d;
        this.f60207Y.m5846A(c11685d);
    }
}
