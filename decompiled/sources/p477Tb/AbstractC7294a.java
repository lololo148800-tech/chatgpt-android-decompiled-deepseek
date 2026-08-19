package p477Tb;

import java.io.FileNotFoundException;
import java.io.IOException;
import p026Ao.AbstractC0682p;
import p026Ao.C0654C;
import p349O0.C5997d;
import p349O0.C6018n0;
import p349O0.C6021p;
import p437Rn.C6949g;
import p547Wc.C8814x;
import p637a3.C10484a;
import p637a3.C10485b;
import p637a3.C10487d;
import p637a3.C10488e;
import p637a3.C10493j;
import p637a3.C10498o;
import p637a3.InterfaceC10497n;
import p776h3.C14393g;

/* JADX INFO: renamed from: Tb.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7294a {
    /* JADX INFO: renamed from: a */
    public static final void m7744a(C10484a c10484a, InterfaceC10497n interfaceC10497n, int i10, C10487d c10487d, C6021p c6021p, int i11, int i12) {
        int i13;
        C10487d c10487d2;
        int i14;
        c6021p.m6526U(491792371);
        if ((i11 & 6) == 0) {
            int i15 = i11 & 8;
            i13 = (c6021p.m6542f(c10484a) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c6021p.m6542f(null) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= c6021p.m6542f(interfaceC10497n) ? 256 : 128;
        }
        int i16 = i13 | 3072;
        int i17 = i12 & 16;
        if (i17 != 0) {
            i16 = i13 | 27648;
        } else if ((i11 & 24576) == 0) {
            int i18 = 32768 & i11;
            i16 |= c6021p.m6542f(c10487d) ? 16384 : 8192;
        }
        if ((i16 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            i14 = i10;
            c10487d2 = c10487d;
        } else {
            if (i17 != 0) {
                c10487d = null;
            }
            c6021p.m6525T(135631275);
            c6021p.m6553p(false);
            C10498o c10498o = C10498o.f31098Y;
            c6021p.m6525T(-1115894518);
            c6021p.m6525T(1886828752);
            if (!(c6021p.f19565a instanceof C10485b)) {
                C5997d.m6425L();
                throw null;
            }
            c6021p.m6522Q();
            if (c6021p.f19563O) {
                c6021p.m6549l(new C6949g(c10498o));
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C10488e.f31072o0, c6021p, c10484a);
            C5997d.m6439Z(C10488e.f31073p0, c6021p, interfaceC10497n);
            C5997d.m6439Z(C10488e.f31074q0, c6021p, new C14393g(1));
            C5997d.m6439Z(C10488e.f31075r0, c6021p, c10487d);
            c6021p.m6553p(true);
            c6021p.m6553p(false);
            c6021p.m6553p(false);
            c10487d2 = c10487d;
            i14 = 1;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8814x(c10484a, interfaceC10497n, i14, c10487d2, i11, i12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m7745b(AbstractC0682p abstractC0682p, C0654C c0654c) throws IOException {
        try {
            IOException iOException = null;
            for (C0654C c0654c2 : abstractC0682p.mo1396e(c0654c)) {
                try {
                    if (abstractC0682p.m1464f(c0654c2).f1984c) {
                        m7745b(abstractC0682p, c0654c2);
                    }
                    abstractC0682p.mo1395b(c0654c2);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m7746c(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m7747d(C10493j c10493j) {
        return true;
    }
}
