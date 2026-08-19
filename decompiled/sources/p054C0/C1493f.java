package p054C0;

import java.util.List;
import p049Bm.InterfaceC1436k;
import p080D0.C1821o0;
import p080D0.C1842z;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1140z1.AbstractC21668N;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21706n;
import p1140z1.C21660F;
import p1140z1.InterfaceC21708o;
import p1140z1.InterfaceC21710p;
import p1140z1.InterfaceC21718w;
import p204I1.C3582M;
import p204I1.C3590f;
import p328N1.InterfaceC5598n;
import p774h1.InterfaceC14366v;

/* JADX INFO: renamed from: C0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1493f extends AbstractC21706n implements InterfaceC21718w, InterfaceC21708o, InterfaceC21710p {

    /* JADX INFO: renamed from: B0 */
    public C1495h f3954B0;

    /* JADX INFO: renamed from: C0 */
    public final InterfaceC1436k f3955C0 = null;

    /* JADX INFO: renamed from: D0 */
    public final C1502o f3956D0;

    public C1493f(C3590f c3590f, C3582M c3582m, InterfaceC5598n interfaceC5598n, InterfaceC1436k interfaceC1436k, int i10, boolean z6, int i11, int i12, List list, InterfaceC1436k interfaceC1436k2, C1495h c1495h, InterfaceC14366v interfaceC14366v) {
        this.f3954B0 = c1495h;
        C1502o c1502o = new C1502o(c3590f, c3582m, interfaceC5598n, interfaceC1436k, i10, z6, i11, i12, list, interfaceC1436k2, c1495h, interfaceC14366v, null);
        m22223K0(c1502o);
        this.f3956D0 = c1502o;
        if (this.f3954B0 == null) {
            throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        }
    }

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void mo427L() {
    }

    @Override // p1140z1.InterfaceC21710p
    /* JADX INFO: renamed from: c */
    public final void mo2143c(AbstractC21678Y abstractC21678Y) {
        C1495h c1495h = this.f3954B0;
        if (c1495h != null) {
            c1495h.f3962p0 = C1498k.m2160a(c1495h.f3962p0, abstractC21678Y, null, 2);
            C1821o0 c1821o0 = (C1821o0) c1495h.f3960Z;
            c1821o0.f5242a = false;
            C1842z c1842z = c1821o0.f5246e;
            if (c1842z != null) {
                c1842z.invoke(Long.valueOf(c1495h.f3959Y));
            }
        }
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: d */
    public final int mo2144d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return this.f3956D0.mo2144d(abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: e */
    public final void mo430e(C21660F c21660f) throws Throwable {
        this.f3956D0.mo430e(c21660f);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2145f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        return this.f3956D0.mo2145f(interfaceC21059M, interfaceC21056J, j10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: g */
    public final int mo2146g(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return this.f3956D0.mo2146g(abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: h */
    public final int mo2147h(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return this.f3956D0.mo2147h(abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: k */
    public final int mo2148k(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return this.f3956D0.mo2148k(abstractC21668N, interfaceC21056J, i10);
    }
}
