package p275Kn;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import mm.C17296C;
import p025An.C0624m;
import p025An.InterfaceC0586M0;
import p025An.InterfaceC0620k;
import p049Bm.InterfaceC1440o;
import p050Bn.C1450d;
import p077Cn.C1734b;
import p153Fn.AbstractC2940r;
import p153Fn.C2942t;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: Kn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C4815b implements InterfaceC0620k, InterfaceC0586M0 {

    /* JADX INFO: renamed from: Y */
    public final C0624m f15694Y;

    /* JADX INFO: renamed from: Z */
    public final Object f15695Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4816c f15696o0;

    public C4815b(C4816c c4816c, C0624m c0624m, Object obj) {
        this.f15696o0 = c4816c;
        this.f15694Y = c0624m;
        this.f15695Z = obj;
    }

    @Override // p025An.InterfaceC0586M0
    /* JADX INFO: renamed from: a */
    public final void mo1212a(AbstractC2940r abstractC2940r, int i10) {
        this.f15694Y.mo1212a(abstractC2940r, i10);
    }

    @Override // p025An.InterfaceC0620k
    /* JADX INFO: renamed from: b */
    public final boolean mo1244b(Throwable th2) {
        return this.f15694Y.mo1244b(th2);
    }

    @Override // p972qm.InterfaceC18770c
    public final InterfaceC18776i getContext() {
        return this.f15694Y.f1874q0;
    }

    @Override // p025An.InterfaceC0620k
    /* JADX INFO: renamed from: h */
    public final C2942t mo1245h(Object obj, InterfaceC1440o interfaceC1440o) {
        C4816c c4816c = this.f15696o0;
        C1734b c1734b = new C1734b(c4816c, 1, this);
        C2942t c2942tM1254F = this.f15694Y.m1254F((C17296C) obj, c1734b);
        if (c2942tM1254F != null) {
            C4816c.f15697h.set(c4816c, this.f15695Z);
        }
        return c2942tM1254F;
    }

    @Override // p025An.InterfaceC0620k
    /* JADX INFO: renamed from: n */
    public final void mo1246n(Object obj, InterfaceC1440o interfaceC1440o) {
        C17296C c17296c = C17296C.f55119a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4816c.f15697h;
        Object obj2 = this.f15695Z;
        C4816c c4816c = this.f15696o0;
        atomicReferenceFieldUpdater.set(c4816c, obj2);
        this.f15694Y.m1251B(new C1450d(c4816c, 1, this), c17296c);
    }

    @Override // p972qm.InterfaceC18770c
    public final void resumeWith(Object obj) {
        this.f15694Y.resumeWith(obj);
    }

    @Override // p025An.InterfaceC0620k
    /* JADX INFO: renamed from: t */
    public final void mo1247t(Object obj) {
        this.f15694Y.mo1247t(obj);
    }
}
