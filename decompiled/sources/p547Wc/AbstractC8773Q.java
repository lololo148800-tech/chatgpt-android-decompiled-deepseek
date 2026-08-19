package p547Wc;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6035w;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17758g;

/* JADX INFO: renamed from: Wc.Q */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8773Q {

    /* JADX INFO: renamed from: a */
    public static final float f26760a = 500;

    /* JADX INFO: renamed from: b */
    public static final float f26761b = 64;

    /* JADX INFO: renamed from: a */
    public static final void m9528a(C8775T sidebarLayoutState, boolean z6, boolean z10, C8410b c8410b, InterfaceC10459q interfaceC10459q, C8410b c8410b2, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(sidebarLayoutState, "sidebarLayoutState");
        c6021p.m6526U(-1769944132);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(sidebarLayoutState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6545h(c8410b2) ? 131072 : 65536;
        }
        int i12 = i11;
        if ((74899 & i12) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Object objM6514H = c6021p.m6514H();
            if (objM6514H == C6013l.f19514a) {
                objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            AbstractC17758g.m19481a(interfaceC10459q, null, false, AbstractC8411c.m8969c(-1924269914, c6021p, new C8771O(sidebarLayoutState, z10, z6, c8410b, c8410b2, ((C6035w) objM6514H).f19668Y)), c6021p, ((i12 >> 12) & 14) | 3072, 6);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8772P(sidebarLayoutState, z6, z10, c8410b, interfaceC10459q, c8410b2, i10);
        }
    }
}
