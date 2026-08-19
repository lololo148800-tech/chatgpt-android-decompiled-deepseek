package p594Y9;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p080D0.C1789X;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p229J0.AbstractC3945L2;
import p229J0.AbstractC3980S2;
import p324Mn.C5551u;
import p349O0.AbstractC5993b;
import p349O0.C5949E0;
import p349O0.C5992a0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p523V9.AbstractC8128k6;
import p547Wc.C8784b;
import p547Wc.C8786c;
import p547Wc.C8788d;
import p586Y0.AbstractC9562n;
import p635a1.InterfaceC10459q;
import p758g0.AbstractC13764h;
import p919o8.AbstractC17976h1;
import p919o8.C17973g1;

/* JADX INFO: renamed from: Y9.x3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9996x3 {
    /* JADX INFO: renamed from: a */
    public static final void m10636a(long j10, C5551u c5551u, InterfaceC10459q interfaceC10459q, long j11, double d10, double d11, C6021p c6021p, int i10) {
        int i11;
        int i12;
        double d12;
        double d13;
        long jM8644j;
        C5992a0 c5992a0;
        long j12;
        double d14;
        double d15;
        long j13;
        c6021p.m6526U(-1339148266);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6540e(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(c5551u) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= 1024;
        }
        int i13 = i11 | 221184;
        if ((74899 & i13) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
            j13 = j11;
            d14 = d10;
            d15 = d11;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                C21554a c21554a = C21555b.f68260Z;
                i12 = i13 & (-7169);
                d12 = 0.95d;
                d13 = 0.7d;
                jM8644j = AbstractC8128k6.m8644j(1, EnumC21557d.SECONDS);
            } else {
                c6021p.m6517L();
                jM8644j = j11;
                d13 = d10;
                d12 = d11;
                i12 = i13 & (-7169);
            }
            c6021p.m6554q();
            c6021p.m6524S(-125418488);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (objM6514H == obj) {
                int i14 = AbstractC5993b.f19471b;
                objM6514H = new C5992a0(0.0d);
                c6021p.m6537c0(objM6514H);
            }
            C5992a0 c5992a1 = (C5992a0) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(-125415932);
            boolean zM6545h = ((i12 & 458752) == 131072) | c6021p.m6545h(c5551u) | ((i12 & 14) == 4) | ((i12 & 57344) == 16384) | c6021p.m6540e(jM8644j);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6545h || objM6514H2 == obj) {
                c5992a0 = c5992a1;
                j12 = jM8644j;
                Object c8784b = new C8784b(c5551u, j10, d13, d12, j12, c5992a0, null);
                c6021p.m6537c0(c8784b);
                objM6514H2 = c8784b;
            } else {
                c5992a0 = c5992a1;
                j12 = jM8644j;
            }
            c6021p.m6553p(false);
            int i15 = i12 >> 3;
            C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, c5551u);
            C5992a0 c5992a2 = c5992a0;
            InterfaceC5982V0 interfaceC5982V0M15261b = AbstractC13764h.m15261b((float) ((C5949E0) AbstractC9562n.m10097u(c5992a2.f19469Z, c5992a2)).f19388c, AbstractC3945L2.f12176g, "asyncTaskProgressIndicator", c6021p, 3072, 20);
            c6021p.m6524S(-125396426);
            boolean zM6542f = c6021p.m6542f(interfaceC5982V0M15261b);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f || objM6514H3 == obj) {
                objM6514H3 = new C1789X(interfaceC5982V0M15261b, 2);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            AbstractC3980S2.m4669c((InterfaceC1426a) objM6514H3, interfaceC10459q, 0L, 0L, 0, 0.0f, C8786c.f26850Z, c6021p, (i15 & 112) | 1572864, 60);
            d14 = d13;
            d15 = d12;
            j13 = j12;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8788d(j10, c5551u, interfaceC10459q, j13, d14, d15, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C17973g1 m10637b(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            String strMo4384r = c3676s.m4395w("type").mo4384r();
            AbstractC16544l.m18093f(strMo4384r, "jsonObject.get(\"type\").asString");
            for (int i10 : AbstractC0010F.m27k(3)) {
                if (AbstractC17976h1.m19666a(i10).equals(strMo4384r)) {
                    AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("has_replay");
                    Boolean boolValueOf = abstractC3673pM4395w != null ? Boolean.valueOf(abstractC3673pM4395w.mo4380f()) : null;
                    AbstractC16544l.m18093f(id2, "id");
                    return new C17973g1(i10, boolValueOf, id2);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type ResourceEventSession", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type ResourceEventSession", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type ResourceEventSession", e12);
        }
    }
}
