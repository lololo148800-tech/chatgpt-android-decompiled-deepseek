package p1071w0;

import androidx.compose.foundation.layout.AbstractC10844c;
import p003A1.C0280q;
import p049Bm.InterfaceC1436k;
import p069Cf.C1648g;
import p080D0.AbstractC1807h0;
import p080D0.InterfaceC1818n;
import p1039ud.C20198o;
import p156G1.AbstractC2965l;
import p229J0.C4127s1;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p547Wc.C8760D;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17758g;

/* JADX INFO: renamed from: w0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20739b {

    /* JADX INFO: renamed from: a */
    public static final float f65744a;

    /* JADX INFO: renamed from: b */
    public static final float f65745b;

    static {
        float f10 = 25;
        f65744a = f10;
        f65745b = (f10 * 2.0f) / 2.4142137f;
    }

    /* JADX INFO: renamed from: a */
    public static final void m21256a(InterfaceC1818n interfaceC1818n, InterfaceC10459q interfaceC10459q, long j10, C6021p c6021p, int i10, int i11) {
        int i12;
        long j11;
        c6021p.m6526U(1776202187);
        if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c6021p.m6542f(interfaceC1818n) : c6021p.m6545h(interfaceC1818n) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                j11 = j10;
                int i13 = c6021p.m6540e(j10) ? 256 : 128;
                i12 |= i13;
            } else {
                j11 = j10;
            }
            i12 |= i13;
        } else {
            j11 = j10;
        }
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6519N();
            if ((i10 & 1) != 0 && !c6021p.m6561x()) {
                c6021p.m6517L();
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
            } else if ((i11 & 4) != 0) {
                i12 &= -897;
                j11 = 9205357640488583168L;
            }
            c6021p.m6554q();
            int i14 = i12 & 14;
            boolean z6 = i14 == 4 || ((i12 & 8) != 0 && c6021p.m6545h(interfaceC1818n));
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C20198o(interfaceC1818n, 9);
                c6021p.m6537c0(objM6514H);
            }
            AbstractC1807h0.m2613b(interfaceC1818n, C10444b.f30935Z, AbstractC8411c.m8969c(-1653527038, c6021p, new C4127s1(j11, AbstractC2965l.m3789a(interfaceC10459q, false, (InterfaceC1436k) objM6514H), 2)), c6021p, i14 | 432);
        }
        long j12 = j11;
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8760D(interfaceC1818n, interfaceC10459q, j12, i10, i11, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m21257b(int i10, int i11, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i12;
        c6021p.m6526U(694251107);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (i13 != 0) {
                interfaceC10459q = C10456n.f30959Y;
            }
            AbstractC17758g.m19482b(c6021p, AbstractC10443a.m10921b(AbstractC10844c.m11253m(interfaceC10459q, f65745b, f65744a), C0280q.f1030t0, C20737a.f65742Y));
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1648g(interfaceC10459q, i10, i11, 4);
        }
    }
}
