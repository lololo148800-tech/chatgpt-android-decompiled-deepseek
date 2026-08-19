package p232J3;

import p001A.C0072l;
import p035B7.C0845b;
import p1016t3.C19797x;
import p1142z3.InterfaceC21739g;
import p133F3.InterfaceC2661g;
import p140Fa.C2685e;
import p372P3.InterfaceC6336r;
import p885m4.C17155e;

/* JADX INFO: renamed from: J3.O */
/* JADX INFO: loaded from: classes.dex */
public final class C4215O implements InterfaceC4252x {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21739g f13740a;

    /* JADX INFO: renamed from: b */
    public final C0072l f13741b;

    /* JADX INFO: renamed from: c */
    public final C0845b f13742c;

    /* JADX INFO: renamed from: d */
    public final C2685e f13743d;

    /* JADX INFO: renamed from: e */
    public final int f13744e;

    public C4215O(InterfaceC21739g interfaceC21739g, InterfaceC6336r interfaceC6336r) {
        C0072l c0072l = new C0072l(interfaceC6336r, 29);
        C0845b c0845b = new C0845b(1);
        C2685e c2685e = new C2685e();
        this.f13740a = interfaceC21739g;
        this.f13741b = c0072l;
        this.f13742c = c0845b;
        this.f13743d = c2685e;
        this.f13744e = 1048576;
    }

    @Override // p232J3.InterfaceC4252x
    /* JADX INFO: renamed from: a */
    public final InterfaceC4252x mo4958a(C17155e c17155e) {
        return this;
    }

    @Override // p232J3.InterfaceC4252x
    /* JADX INFO: renamed from: b */
    public final AbstractC4226a mo4959b(C19797x c19797x) {
        c19797x.f62786b.getClass();
        InterfaceC21739g interfaceC21739g = this.f13740a;
        C0072l c0072l = this.f13741b;
        this.f13742c.getClass();
        c19797x.f62786b.getClass();
        c19797x.f62786b.getClass();
        return new C4216P(c19797x, interfaceC21739g, c0072l, InterfaceC2661g.f8172b, this.f13743d, this.f13744e);
    }

    @Override // p232J3.InterfaceC4252x
    /* JADX INFO: renamed from: c */
    public final InterfaceC4252x mo4960c(boolean z6) {
        return this;
    }
}
