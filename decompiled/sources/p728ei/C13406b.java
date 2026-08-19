package p728ei;

import af.C10564U;
import androidx.lifecycle.ProcessLifecycleOwner;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p103Dn.C2217y0;
import p221Ii.C3727f;
import p228J.AbstractC3794B0;
import p324Mn.C5551u;
import p427Rc.C6852i;
import p571X9.AbstractC9206S2;
import p909nm.C17689w;
import p992ri.EnumC19019b;
import p992ri.InterfaceC19020c;

/* JADX INFO: renamed from: ei.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C13406b implements InterfaceC19020c {

    /* JADX INFO: renamed from: a */
    public final C2153Q0 f42467a;

    /* JADX INFO: renamed from: b */
    public final C2153Q0 f42468b;

    /* JADX INFO: renamed from: c */
    public final C2217y0 f42469c;

    /* JADX INFO: renamed from: d */
    public final C6852i f42470d;

    /* JADX INFO: renamed from: e */
    public C5551u f42471e;

    /* JADX INFO: renamed from: f */
    public final EnumC19019b f42472f;

    public C13406b() {
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(Boolean.FALSE);
        this.f42467a = c2153q0M3204c;
        C2153Q0 c2153q0M3204c2 = AbstractC2124C.m3204c(C17689w.f56480Y);
        this.f42468b = c2153q0M3204c2;
        C2217y0 c2217y0 = new C2217y0(c2153q0M3204c);
        this.f42469c = c2217y0;
        this.f42470d = AbstractC9206S2.m9772c(C13405a.f42466Y, c2153q0M3204c2);
        C5551u.Companion.getClass();
        this.f42471e = new C5551u(AbstractC3794B0.m4501z("instant(...)"));
        AbstractC9206S2.m9772c(new C10564U(this, 25), c2217y0);
        this.f42472f = EnumC19019b.f60600Z;
    }

    @Override // p992ri.InterfaceC19020c
    /* JADX INFO: renamed from: a */
    public final EnumC19019b mo14948a() {
        return this.f42472f;
    }

    @Override // p992ri.InterfaceC19020c
    /* JADX INFO: renamed from: b */
    public final void mo14949b() {
        ProcessLifecycleOwner.f33399u0.f33405r0.mo7806a(new C3727f(this, 2));
    }
}
