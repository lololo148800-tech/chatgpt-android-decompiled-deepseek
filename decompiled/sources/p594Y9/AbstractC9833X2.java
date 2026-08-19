package p594Y9;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p042Bf.C1268j;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1139z0.C21585H;
import p124Ei.C2490Z0;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p350O1.C6045C;
import p527Ve.C8277n;
import p527Ve.C8279p;
import p537W0.AbstractC8411c;
import p587Y1.C9588n;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p919o8.C17919N0;

/* JADX INFO: renamed from: Y9.X2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9833X2 {
    /* JADX INFO: renamed from: a */
    public static final void m10475a(int i10, InterfaceC1426a onDismiss, InterfaceC1436k onConfirm, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i11;
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        AbstractC16544l.m18094g(onConfirm, "onConfirm");
        c6021p.m6526U(-10027587);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(onDismiss) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onConfirm) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            interfaceC10459q = C10456n.f30959Y;
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            C17296C c17296c = C17296C.f55119a;
            c6021p.m6524S(966887199);
            boolean zM6545h = c6021p.m6545h(interfaceC20904w);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                objM6514H = new C8277n(interfaceC20904w, null);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c);
            int i13 = i12 << 3;
            m10476b((i13 & 7168) | (i13 & 112) | 6 | (i13 & 896), onDismiss, onConfirm, c6021p, interfaceC10459q);
        }
        InterfaceC10459q interfaceC10459q2 = interfaceC10459q;
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2490Z0(onDismiss, onConfirm, interfaceC10459q2, i10, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10476b(int i10, InterfaceC1426a onDismiss, InterfaceC1436k onConfirm, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i11;
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        AbstractC16544l.m18094g(onConfirm, "onConfirm");
        c6021p.m6526U(1854006432);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f("") ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onDismiss) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onConfirm) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Object[] objArr = new Object[0];
            C21585H c21585h = C6045C.f19681d;
            c6021p.m6524S(485514579);
            boolean z6 = (i11 & 14) == 4;
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C8279p(0);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC9973t4.m10617b(onDismiss, new C9588n(3, false, false), AbstractC8411c.m8969c(2114257463, c6021p, new C1268j(interfaceC10459q, AbstractC9834X3.m10480c(objArr, c21585h, (InterfaceC1426a) objM6514H, c6021p, 0), onDismiss, onConfirm, 10)), c6021p, ((i11 >> 3) & 14) | 432, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2490Z0(onDismiss, onConfirm, interfaceC10459q, i10, 2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static C17919N0 m10477c(C3676s c3676s) {
        try {
            return new C17919N0(c3676s.m4395w("duration").mo4382p(), c3676s.m4395w("start").mo4382p());
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Connect", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Connect", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Connect", e12);
        }
    }
}
