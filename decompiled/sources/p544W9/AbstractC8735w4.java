package p544W9;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p027Ap.C0693a;
import p042Bf.C1276r;
import p049Bm.InterfaceC1439n;
import p228J.AbstractC3794B0;
import p347No.InterfaceC5938c;
import p349O0.C5997d;
import p349O0.C6018n0;
import p349O0.C6021p;
import p437Rn.C6949g;
import p523V9.AbstractC8038Z3;
import p637a3.C10485b;
import p637a3.InterfaceC10497n;
import p863l3.C16811b;
import p863l3.C16812c;
import p863l3.C16813d;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: W9.w4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8735w4 {
    /* JADX INFO: renamed from: a */
    public static final void m9467a(String str, InterfaceC10497n interfaceC10497n, C16813d c16813d, int i10, C6021p c6021p, int i11) {
        int i12;
        c6021p.m6526U(-192911377);
        if ((i11 & 6) == 0) {
            i12 = (c6021p.m6542f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c6021p.m6542f(interfaceC10497n) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c6021p.m6542f(c16813d) ? 256 : 128;
        }
        if (((i12 | 3072) & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6519N();
            if ((i11 & 1) == 0 || c6021p.m6561x()) {
                i10 = Integer.MAX_VALUE;
            } else {
                c6021p.m6517L();
            }
            c6021p.m6554q();
            C16811b c16811b = C16811b.f53942Y;
            c6021p.m6525T(-1115894518);
            c6021p.m6525T(1886828752);
            if (!(c6021p.f19565a instanceof C10485b)) {
                C5997d.m6425L();
                throw null;
            }
            c6021p.m6522Q();
            if (c6021p.f19563O) {
                c6021p.m6549l(new C6949g(c16811b));
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C16812c.f53943Z, c6021p, str);
            C5997d.m6439Z(C16812c.f53944o0, c6021p, interfaceC10497n);
            C5997d.m6439Z(C16812c.f53945p0, c6021p, c16813d);
            C16812c c16812c = C16812c.f53946q0;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i10))) {
                c6021p.m6537c0(Integer.valueOf(i10));
                c6021p.m6534b(Integer.valueOf(i10), c16812c);
            }
            AbstractC3794B0.m4471F(c6021p, true, false, false);
        }
        int i13 = i10;
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1276r(str, interfaceC10497n, c16813d, i13, i11, 12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9468b(InterfaceC5938c interfaceC5938c, C0693a c0693a, InterfaceC1439n interfaceC1439n) {
        ArrayList arrayListM8397f = AbstractC8038Z3.m8397f(c0693a);
        if (arrayListM8397f.size() == 2) {
            return interfaceC5938c.mo3261f(arrayListM8397f, interfaceC1439n);
        }
        if (arrayListM8397f.size() > 2) {
            return interfaceC5938c.mo3261f(AbstractC17681o.m19382k((Comparable) AbstractC17680n.m19343S(arrayListM8397f), (Comparable) AbstractC17680n.m19344T(1, arrayListM8397f)), interfaceC1439n) && interfaceC5938c.mo3261f(AbstractC17681o.m19382k((Comparable) AbstractC17680n.m19344T(1, arrayListM8397f), (Comparable) AbstractC17680n.m19344T(2, arrayListM8397f)), interfaceC1439n);
        }
        return false;
    }
}
