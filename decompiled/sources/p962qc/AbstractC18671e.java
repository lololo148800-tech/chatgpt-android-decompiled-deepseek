package p962qc;

import io.sentry.android.replay.C15298l;
import p042Bf.C1276r;
import p049Bm.InterfaceC1440o;
import p080D0.C1834v;
import p229J0.C4108p0;
import p349O0.C5975S;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6037x;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p848k6.AbstractC16347a;
import p911o0.AbstractC17792x;
import p946pc.C18321F;

/* JADX INFO: renamed from: qc.e */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18671e {

    /* JADX INFO: renamed from: a */
    public static final C6037x f59428a = new C6037x(C18669c.f59424Y, C5975S.f19448r0);

    /* JADX INFO: renamed from: a */
    public static final void m20038a(InterfaceC10459q interfaceC10459q, C18321F c18321f, C8410b c8410b, C6021p c6021p, int i10, int i11) {
        int i12;
        c6021p.m6526U(-649695358);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            i12 |= c6021p.m6542f(c18321f) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i12 |= c6021p.m6545h(c8410b) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (i13 != 0) {
                interfaceC10459q = C10456n.f30959Y;
            }
            m20039b(AbstractC8411c.m8968b(391388596, c6021p, new C15298l(interfaceC10459q, c18321f, c8410b, 5)), c6021p, 6);
        }
        InterfaceC10459q interfaceC10459q2 = interfaceC10459q;
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1276r(interfaceC10459q2, c18321f, (InterfaceC1440o) c8410b, i10, i11, 18);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m20039b(C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-1726357480);
        if ((i10 & 14) == 0) {
            i11 = (c6021p.m6545h(c8410b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else if (((Boolean) c6021p.m6548k(f59428a)).booleanValue()) {
            c6021p.m6525T(-383565853);
            AbstractC17792x.m19538u(i11 & 14, c8410b, c6021p, false);
        } else {
            c6021p.m6525T(-383566387);
            AbstractC16347a.m17946a(C18670d.f59425Z, AbstractC18668b.f59422a, C18670d.f59426o0, AbstractC18668b.f59423b, AbstractC8411c.m8968b(1746380571, c6021p, new C4108p0(c8410b, 19)), c6021p, 27696);
            c6021p.m6553p(false);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1834v(c8410b, i10, 8);
        }
    }
}
