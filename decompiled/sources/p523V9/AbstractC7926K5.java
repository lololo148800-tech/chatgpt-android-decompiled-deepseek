package p523V9;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1106xf.AbstractC21197e;
import p1106xf.C21210r;
import p124Ei.C2473Q0;
import p229J0.AbstractC3984T1;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p870le.C16886i0;
import p895n1.C17425e;

/* JADX INFO: renamed from: V9.K5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7926K5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25144a;

    /* JADX INFO: renamed from: a */
    public static final void m8221a(int i10, InterfaceC1436k onIntent, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(onIntent, "onIntent");
        c6021p.m6526U(929044602);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(onIntent) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 48;
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            C17296C c17296c = C17296C.f55119a;
            c6021p.m6524S(1460100646);
            boolean zM6545h = c6021p.m6545h(interfaceC20904w);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (zM6545h || objM6514H == obj) {
                objM6514H = new C21210r(interfaceC20904w, null);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c);
            c6021p.m6524S(1460104336);
            boolean z6 = (i12 & 14) == 4;
            Object objM6514H2 = c6021p.m6514H();
            if (z6 || objM6514H2 == obj) {
                objM6514H2 = new C16886i0(18, onIntent);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC3984T1.m4700s((InterfaceC1426a) objM6514H2, c10456n, false, null, null, null, null, null, null, AbstractC21197e.f67398a, c6021p, (i12 & 112) | 805306368, 508);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2473Q0(onIntent, interfaceC10459q2, i10, 5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8222b(int i10, StringBuilder sb2) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(Separators.QUESTION);
            if (i11 < i10 - 1) {
                sb2.append(Separators.COMMA);
            }
        }
    }
}
