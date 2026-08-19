package p758g0;

import mm.EnumC17307j;
import p049Bm.InterfaceC1436k;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p571X9.AbstractC9227W;
import p736f0.C13503u;

/* JADX INFO: renamed from: g0.o0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13779o0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f43515a = 0;

    static {
        AbstractC9227W.m9799b(EnumC17307j.f55134Z, C13773l0.f43500Y);
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r7v5, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r9v3, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: a */
    public static final C13761f0 m15288a(C13771k0 c13771k0, C13783q0 c13783q0, String str, C6021p c6021p, int i10, int i11) {
        C13759e0 c13759e0;
        if ((i11 & 2) != 0) {
            str = "DeferredAnimation";
        }
        int i12 = (i10 & 14) ^ 6;
        boolean z6 = true;
        boolean z10 = (i12 > 4 && c6021p.m6542f(c13771k0)) || (i10 & 6) == 4;
        Object objM6514H = c6021p.m6514H();
        Object obj = C6013l.f19514a;
        if (z10 || objM6514H == obj) {
            objM6514H = new C13761f0(c13771k0, c13783q0, str);
            c6021p.m6537c0(objM6514H);
        }
        C13761f0 c13761f0 = (C13761f0) objM6514H;
        if ((i12 <= 4 || !c6021p.m6542f(c13771k0)) && (i10 & 6) != 4) {
            z6 = false;
        }
        boolean zM6545h = c6021p.m6545h(c13761f0) | z6;
        Object objM6514H2 = c6021p.m6514H();
        if (zM6545h || objM6514H2 == obj) {
            objM6514H2 = new C13775m0(c13771k0, 0, c13761f0);
            c6021p.m6537c0(objM6514H2);
        }
        C5997d.m6444c(c13761f0, (InterfaceC1436k) objM6514H2, c6021p);
        if (c13771k0.m15276g() && (c13759e0 = (C13759e0) c13761f0.f43448b.getValue()) != null) {
            ?? r10 = c13759e0.f43440o0;
            C13771k0 c13771k1 = c13761f0.f43449c;
            c13759e0.f43438Y.m15266f(r10.invoke(c13771k1.m15275f().mo15004a()), c13759e0.f43440o0.invoke(c13771k1.m15275f().mo15006c()), (InterfaceC13726B) c13759e0.f43439Z.invoke(c13771k1.m15275f()));
        }
        return c13761f0;
    }

    /* JADX INFO: renamed from: b */
    public static final C13767i0 m15289b(C13771k0 c13771k0, Object obj, Object obj2, InterfaceC13726B interfaceC13726B, C13783q0 c13783q0, C6021p c6021p, int i10) {
        boolean zM6542f = c6021p.m6542f(c13771k0);
        Object objM6514H = c6021p.m6514H();
        Object obj3 = C6013l.f19514a;
        if (zM6542f || objM6514H == obj3) {
            AbstractC13784r abstractC13784r = (AbstractC13784r) c13783q0.f43526a.invoke(obj2);
            abstractC13784r.mo15286d();
            objM6514H = new C13767i0(c13771k0, obj, abstractC13784r, c13783q0);
            c6021p.m6537c0(objM6514H);
        }
        C13767i0 c13767i0 = (C13767i0) objM6514H;
        if (c13771k0.m15276g()) {
            c13767i0.m15266f(obj, obj2, interfaceC13726B);
        } else {
            c13767i0.m15267g(obj2, interfaceC13726B);
        }
        boolean zM6542f2 = c6021p.m6542f(c13771k0) | c6021p.m6542f(c13767i0);
        Object objM6514H2 = c6021p.m6514H();
        if (zM6542f2 || objM6514H2 == obj3) {
            objM6514H2 = new C13775m0(c13771k0, 1, c13767i0);
            c6021p.m6537c0(objM6514H2);
        }
        C5997d.m6444c(c13767i0, (InterfaceC1436k) objM6514H2, c6021p);
        return c13767i0;
    }

    /* JADX INFO: renamed from: c */
    public static final C13771k0 m15290c(C13740P c13740p, String str, C6021p c6021p, int i10) {
        boolean z6 = (((i10 & 14) ^ 6) > 4 && c6021p.m6542f(c13740p)) || (i10 & 6) == 4;
        Object objM6514H = c6021p.m6514H();
        Object obj = C6013l.f19514a;
        if (z6 || objM6514H == obj) {
            objM6514H = new C13771k0(c13740p, null, str);
            c6021p.m6537c0(objM6514H);
        }
        C13771k0 c13771k0 = (C13771k0) objM6514H;
        c6021p.m6524S(1030875195);
        c13771k0.m15270a(c13740p.f43331c.getValue(), c6021p, 0);
        c6021p.m6553p(false);
        boolean zM6542f = c6021p.m6542f(c13771k0);
        Object objM6514H2 = c6021p.m6514H();
        if (zM6542f || objM6514H2 == obj) {
            objM6514H2 = new C13503u(c13771k0, 1);
            c6021p.m6537c0(objM6514H2);
        }
        C5997d.m6444c(c13771k0, (InterfaceC1436k) objM6514H2, c6021p);
        return c13771k0;
    }

    /* JADX INFO: renamed from: d */
    public static final C13771k0 m15291d(Object obj, String str, C6021p c6021p, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        Object objM6514H = c6021p.m6514H();
        C5975S c5975s = C6013l.f19514a;
        if (objM6514H == c5975s) {
            objM6514H = new C13771k0(new C13740P(obj), null, str);
            c6021p.m6537c0(objM6514H);
        }
        C13771k0 c13771k0 = (C13771k0) objM6514H;
        c13771k0.m15270a(obj, c6021p, (i10 & 8) | 48 | (i10 & 14));
        Object objM6514H2 = c6021p.m6514H();
        if (objM6514H2 == c5975s) {
            objM6514H2 = new C13503u(c13771k0, 2);
            c6021p.m6537c0(objM6514H2);
        }
        C5997d.m6444c(c13771k0, (InterfaceC1436k) objM6514H2, c6021p);
        return c13771k0;
    }
}
