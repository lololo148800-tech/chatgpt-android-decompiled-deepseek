package p1087wj;

import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p1044uj.C20338h;
import p729ej.InterfaceC13427r;

/* JADX INFO: renamed from: wj.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C20989j implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final String f66819b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC20971B f66820c;

    /* JADX INFO: renamed from: d */
    public final C20338h f66821d;

    public C20989j(String str, InterfaceC20971B interfaceC20971B, C20338h c20338h) {
        this.f66819b = str;
        this.f66820c = interfaceC20971B;
        this.f66821d = c20338h;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        if (otherWorker instanceof C20989j) {
            C20989j c20989j = (C20989j) otherWorker;
            if (AbstractC16544l.m18089b(this.f66819b, c20989j.f66819b) && AbstractC16544l.m18089b(this.f66821d, c20989j.f66821d)) {
                return true;
            }
        }
        return false;
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return new C2219z0(new C20988i(this, null));
    }
}
