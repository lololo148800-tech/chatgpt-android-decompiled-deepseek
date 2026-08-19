package p100Dk;

import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p729ej.InterfaceC13427r;
import p994rk.InterfaceC19201o2;

/* JADX INFO: renamed from: Dk.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C2087n implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final String f6427b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC19201o2 f6428c;

    /* JADX INFO: renamed from: d */
    public final String f6429d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2094u f6430e;

    public C2087n(String str, InterfaceC19201o2 interfaceC19201o2, String str2, InterfaceC2094u interfaceC2094u) {
        this.f6427b = str;
        this.f6428c = interfaceC19201o2;
        this.f6429d = str2;
        this.f6430e = interfaceC2094u;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        if (otherWorker instanceof C2087n) {
            if (AbstractC16544l.m18089b(this.f6429d, ((C2087n) otherWorker).f6429d)) {
                return true;
            }
        }
        return false;
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return new C2219z0(new C2086m(this, null));
    }
}
