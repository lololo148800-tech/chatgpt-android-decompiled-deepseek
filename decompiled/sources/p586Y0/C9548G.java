package p586Y0;

import p049Bm.InterfaceC1436k;
import p349O0.C5997d;

/* JADX INFO: renamed from: Y0.G */
/* JADX INFO: loaded from: classes.dex */
public final class C9548G extends AbstractC9556h {

    /* JADX INFO: renamed from: e */
    public final AbstractC9556h f28717e;

    /* JADX INFO: renamed from: f */
    public final boolean f28718f;

    /* JADX INFO: renamed from: g */
    public InterfaceC1436k f28719g;

    /* JADX INFO: renamed from: h */
    public final long f28720h;

    public C9548G(AbstractC9556h abstractC9556h, InterfaceC1436k interfaceC1436k, boolean z6) {
        InterfaceC1436k interfaceC1436kMo10046f;
        super(0, C9560l.f28750q0);
        this.f28717e = abstractC9556h;
        this.f28718f = z6;
        this.f28719g = AbstractC9562n.m10088l(false, interfaceC1436k, (abstractC9556h == null || (interfaceC1436kMo10046f = abstractC9556h.mo10046f()) == null) ? ((C9549a) AbstractC9562n.f28766i.get()).f28722e : interfaceC1436kMo10046f);
        this.f28720h = C5997d.m6418E();
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: c */
    public final void mo10043c() {
        AbstractC9556h abstractC9556h;
        this.f28740c = true;
        if (!this.f28718f || (abstractC9556h = this.f28717e) == null) {
            return;
        }
        abstractC9556h.mo10043c();
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: d */
    public final int mo10044d() {
        return m10061u().mo10044d();
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: e */
    public final C9560l mo10045e() {
        return m10061u().mo10045e();
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: f */
    public final InterfaceC1436k mo10046f() {
        return this.f28719g;
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: g */
    public final boolean mo10047g() {
        return m10061u().mo10047g();
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: i */
    public final InterfaceC1436k mo10049i() {
        return null;
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: k */
    public final void mo10050k() {
        AbstractC9567s.m10114j();
        throw null;
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: l */
    public final void mo10051l() {
        AbstractC9567s.m10114j();
        throw null;
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: m */
    public final void mo10052m() {
        m10061u().mo10052m();
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: n */
    public final void mo10053n(InterfaceC9542A interfaceC9542A) {
        m10061u().mo10053n(interfaceC9542A);
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: t */
    public final AbstractC9556h mo10057t(InterfaceC1436k interfaceC1436k) {
        return AbstractC9562n.m10084h(m10061u().mo10057t(null), AbstractC9562n.m10088l(true, interfaceC1436k, this.f28719g), true);
    }

    /* JADX INFO: renamed from: u */
    public final AbstractC9556h m10061u() {
        AbstractC9556h abstractC9556h = this.f28717e;
        return abstractC9556h == null ? (AbstractC9556h) AbstractC9562n.f28766i.get() : abstractC9556h;
    }
}
