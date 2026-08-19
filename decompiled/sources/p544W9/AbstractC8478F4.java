package p544W9;

import kotlin.jvm.internal.AbstractC16544l;
import p002A0.C0148y;
import p003A1.C0184L0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p124Ei.C2535p;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p587Y1.C9588n;
import p594Y9.AbstractC9973t4;

/* JADX INFO: renamed from: W9.F4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8478F4 {
    /* JADX INFO: renamed from: a */
    public static final void m9118a(String code, InterfaceC1426a onDismiss, InterfaceC1436k onClick, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(code, "code");
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        AbstractC16544l.m18094g(onClick, "onClick");
        c6021p.m6526U(-241310062);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(code) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onDismiss) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onClick) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-1546563694);
            boolean z6 = (i11 & 112) == 32;
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C2535p(13, onDismiss);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC9973t4.m10617b((InterfaceC1426a) objM6514H, new C9588n(3, false, false), AbstractC8411c.m8969c(-1383561111, c6021p, new C0148y(onDismiss, onClick, code, 14)), c6021p, 432, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(code, onDismiss, onClick, i10, 19);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m9119b(int i10, int i11) {
        return i10 == i11;
    }
}
