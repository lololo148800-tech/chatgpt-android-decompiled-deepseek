package p273Kl;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import fo.C13711h;
import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.C2153Q0;
import p1160zp.AbstractC22225a;
import p444S4.C7011q;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p613Z4.AbstractC10162i;
import p613Z4.C10161h;
import p625Zh.C10396b;
import p867l8.C16831c;

/* JADX INFO: renamed from: Kl.G0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4721G0 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15354a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f15355b;

    public /* synthetic */ C4721G0(Object obj, int i10) {
        this.f15354a = i10;
        this.f15355b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        Object obj = this.f15355b;
        switch (this.f15354a) {
            case 0:
                AbstractC16544l.m18094g(network, "network");
                C4727J0 c4727j0 = (C4727J0) obj;
                if (c4727j0.f15370C) {
                    C8395g c8395g = AbstractC8396h.Companion;
                    EnumC8397i enumC8397i = EnumC8397i.f26118o0;
                    AbstractC8396h.Companion.getClass();
                    if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18569g(new Object[0]);
                    }
                    if (c4727j0.m5412g() != EnumC4807x0.f15676p0) {
                        c4727j0.f15376a.m16217i();
                    }
                    c4727j0.f15370C = false;
                    break;
                }
                break;
            case 1:
            default:
                super.onAvailable(network);
                break;
            case 2:
                AbstractC16544l.m18094g(network, "network");
                C2153Q0 c2153q0 = ((C10396b) obj).f30811p0;
                Boolean bool = Boolean.TRUE;
                c2153q0.getClass();
                c2153q0.m3251l(null, bool);
                break;
            case 3:
                C13711h.m15178c((C13711h) obj, network, true);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
        switch (this.f15354a) {
            case 1:
                AbstractC16544l.m18094g(network, "network");
                AbstractC16544l.m18094g(capabilities, "capabilities");
                C7011q.m7408d().m7410a(AbstractC10162i.f30097a, "Network capabilities changed: " + capabilities);
                C10161h c10161h = (C10161h) this.f15355b;
                c10161h.m10760b(AbstractC10162i.m10761a(c10161h.f30095f));
                break;
            default:
                super.onCapabilitiesChanged(network, capabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f15354a) {
            case 0:
                AbstractC16544l.m18094g(network, "network");
                ((C4727J0) this.f15355b).f15370C = true;
                break;
            case 1:
                AbstractC16544l.m18094g(network, "network");
                C7011q.m7408d().m7410a(AbstractC10162i.f30097a, "Network connection lost");
                C10161h c10161h = (C10161h) this.f15355b;
                c10161h.m10760b(AbstractC10162i.m10761a(c10161h.f30095f));
                break;
            case 2:
                AbstractC16544l.m18094g(network, "network");
                C2153Q0 c2153q0 = ((C10396b) this.f15355b).f30811p0;
                Boolean bool = Boolean.FALSE;
                c2153q0.getClass();
                c2153q0.m3251l(null, bool);
                break;
            default:
                C13711h.m15178c((C13711h) this.f15355b, network, false);
                break;
        }
    }
}
