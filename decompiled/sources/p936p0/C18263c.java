package p936p0;

import java.util.Collection;
import p1140z1.C21658D;
import p349O0.C5996c0;
import p909nm.AbstractC17680n;
import p953q0.InterfaceC18597r;

/* JADX INFO: renamed from: p0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C18263c implements InterfaceC18597r {

    /* JADX INFO: renamed from: a */
    public final C18280t f58224a;

    /* JADX INFO: renamed from: b */
    public final int f58225b;

    public C18263c(C18280t c18280t, int i10) {
        this.f58224a = c18280t;
        this.f58225b = i10;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // p953q0.InterfaceC18597r
    /* JADX INFO: renamed from: a */
    public final int mo19796a() {
        return Math.min(mo19797b() - 1, ((C18273m) AbstractC17680n.m19351a0(this.f58224a.m19824g().f58296j)).f58304a + this.f58225b);
    }

    @Override // p953q0.InterfaceC18597r
    /* JADX INFO: renamed from: b */
    public final int mo19797b() {
        return this.f58224a.m19824g().f58299m;
    }

    @Override // p953q0.InterfaceC18597r
    /* JADX INFO: renamed from: c */
    public final void mo19798c() {
        C21658D c21658d = this.f58224a.f58355k;
        if (c21658d != null) {
            c21658d.m22047l();
        }
    }

    @Override // p953q0.InterfaceC18597r
    /* JADX INFO: renamed from: d */
    public final boolean mo19799d() {
        return !((Collection) this.f58224a.m19824g().f58296j).isEmpty();
    }

    @Override // p953q0.InterfaceC18597r
    /* JADX INFO: renamed from: e */
    public final int mo19800e() {
        return Math.max(0, ((C5996c0) this.f58224a.f58348d.f1140b).m6412g() - this.f58225b);
    }
}
