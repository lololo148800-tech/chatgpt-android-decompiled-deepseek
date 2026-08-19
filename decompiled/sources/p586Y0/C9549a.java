package p586Y0;

import p021Aj.C0537v;
import p046Bk.C1419y0;
import p049Bm.InterfaceC1436k;
import p193Hf.C3331S0;
import p406Qg.C6702M;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Y0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9549a extends C9550b {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public C9549a(int i10, C9560l c9560l) {
        InterfaceC1436k c6702m;
        synchronized (AbstractC9562n.f28759b) {
            ?? r6 = AbstractC9562n.f28765h;
            c6702m = (InterfaceC1436k) AbstractC17680n.m19367q0(r6);
            c6702m = c6702m == null ? new C6702M(r6, 1) : c6702m;
        }
        super(i10, c9560l, null, c6702m);
    }

    @Override // p586Y0.C9550b
    /* JADX INFO: renamed from: C */
    public final C9550b mo10041C(InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
        return (C9550b) ((AbstractC9556h) AbstractC9562n.m10082f(new C1419y0(2, new C3331S0(interfaceC1436k, interfaceC1436k2, 1))));
    }

    @Override // p586Y0.C9550b, p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: c */
    public final void mo10043c() {
        synchronized (AbstractC9562n.f28759b) {
            int i10 = this.f28741d;
            if (i10 >= 0) {
                AbstractC9562n.m10098v(i10);
                this.f28741d = -1;
            }
        }
    }

    @Override // p586Y0.C9550b, p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: k */
    public final void mo10050k() {
        AbstractC9567s.m10114j();
        throw null;
    }

    @Override // p586Y0.C9550b, p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: l */
    public final void mo10051l() {
        AbstractC9567s.m10114j();
        throw null;
    }

    @Override // p586Y0.C9550b, p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: m */
    public final void mo10052m() {
        AbstractC9562n.m10077a();
    }

    @Override // p586Y0.C9550b, p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: t */
    public final AbstractC9556h mo10057t(InterfaceC1436k interfaceC1436k) {
        return (AbstractC9556h) AbstractC9562n.m10082f(new C1419y0(2, new C0537v(14, interfaceC1436k)));
    }

    @Override // p586Y0.C9550b
    /* JADX INFO: renamed from: v */
    public final AbstractC9567s mo10058v() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
