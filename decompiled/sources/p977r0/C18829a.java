package p977r0;

import java.util.Collection;
import p1140z1.C21658D;
import p349O0.C5996c0;
import p909nm.AbstractC17680n;
import p953q0.InterfaceC18597r;

/* JADX INFO: renamed from: r0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18829a implements InterfaceC18597r {

    /* JADX INFO: renamed from: a */
    public final C18852x f59924a;

    public C18829a(C18852x c18852x) {
        this.f59924a = c18852x;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // p953q0.InterfaceC18597r
    /* JADX INFO: renamed from: a */
    public final int mo19796a() {
        return ((C18845q) AbstractC17680n.m19351a0(this.f59924a.m20151g().f59998j)).f60006a;
    }

    @Override // p953q0.InterfaceC18597r
    /* JADX INFO: renamed from: b */
    public final int mo19797b() {
        return this.f59924a.m20151g().f59997i;
    }

    @Override // p953q0.InterfaceC18597r
    /* JADX INFO: renamed from: c */
    public final void mo19798c() {
        C21658D c21658d = this.f59924a.f60047f;
        if (c21658d != null) {
            c21658d.m22047l();
        }
    }

    @Override // p953q0.InterfaceC18597r
    /* JADX INFO: renamed from: d */
    public final boolean mo19799d() {
        return !((Collection) this.f59924a.m20151g().f59998j).isEmpty();
    }

    @Override // p953q0.InterfaceC18597r
    /* JADX INFO: renamed from: e */
    public final int mo19800e() {
        return ((C5996c0) this.f59924a.f60042a.f2238d).m6412g();
    }
}
