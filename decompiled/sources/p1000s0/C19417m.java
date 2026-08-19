package p1000s0;

import java.util.Collection;
import p1140z1.C21658D;
import p909nm.AbstractC17680n;
import p953q0.InterfaceC18597r;

/* JADX INFO: renamed from: s0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C19417m implements InterfaceC18597r {

    /* JADX INFO: renamed from: a */
    public final C19408d f61536a;

    /* JADX INFO: renamed from: b */
    public final int f61537b;

    public C19417m(C19408d c19408d, int i10) {
        this.f61536a = c19408d;
        this.f61537b = i10;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // p953q0.InterfaceC18597r
    /* JADX INFO: renamed from: a */
    public final int mo19796a() {
        C19408d c19408d = this.f61536a;
        return Math.min(c19408d.mo20500l() - 1, ((C19414j) AbstractC17680n.m19351a0(c19408d.m20499k().f61597a)).f61521a + this.f61537b);
    }

    @Override // p953q0.InterfaceC18597r
    /* JADX INFO: renamed from: b */
    public final int mo19797b() {
        return this.f61536a.mo20500l();
    }

    @Override // p953q0.InterfaceC18597r
    /* JADX INFO: renamed from: c */
    public final void mo19798c() {
        C21658D c21658d = (C21658D) this.f61536a.f61460w.getValue();
        if (c21658d != null) {
            c21658d.m22047l();
        }
    }

    @Override // p953q0.InterfaceC18597r
    /* JADX INFO: renamed from: d */
    public final boolean mo19799d() {
        return !((Collection) this.f61536a.m20499k().f61597a).isEmpty();
    }

    @Override // p953q0.InterfaceC18597r
    /* JADX INFO: renamed from: e */
    public final int mo19800e() {
        return Math.max(0, this.f61536a.f61441d - this.f61537b);
    }
}
