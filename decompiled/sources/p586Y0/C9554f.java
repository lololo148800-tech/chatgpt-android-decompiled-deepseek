package p586Y0;

import p049Bm.InterfaceC1436k;
import p658b5.C11242m;

/* JADX INFO: renamed from: Y0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9554f extends AbstractC9556h {

    /* JADX INFO: renamed from: e */
    public final InterfaceC1436k f28735e;

    /* JADX INFO: renamed from: f */
    public int f28736f;

    public C9554f(int i10, C9560l c9560l, InterfaceC1436k interfaceC1436k) {
        super(i10, c9560l);
        this.f28735e = interfaceC1436k;
        this.f28736f = 1;
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: c */
    public final void mo10043c() {
        if (this.f28740c) {
            return;
        }
        mo10051l();
        this.f28740c = true;
        synchronized (AbstractC9562n.f28759b) {
            int i10 = this.f28741d;
            if (i10 >= 0) {
                AbstractC9562n.m10098v(i10);
                this.f28741d = -1;
            }
        }
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: f */
    public final InterfaceC1436k mo10046f() {
        return this.f28735e;
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: g */
    public final boolean mo10047g() {
        return true;
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: i */
    public final InterfaceC1436k mo10049i() {
        return null;
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: k */
    public final void mo10050k() {
        this.f28736f++;
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: l */
    public final void mo10051l() {
        int i10 = this.f28736f - 1;
        this.f28736f = i10;
        if (i10 == 0) {
            m10069a();
        }
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: n */
    public final void mo10053n(InterfaceC9542A interfaceC9542A) {
        C11242m c11242m = AbstractC9562n.f28758a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: t */
    public final AbstractC9556h mo10057t(InterfaceC1436k interfaceC1436k) {
        AbstractC9562n.m10080d(this);
        return new C9552d(this.f28739b, this.f28738a, AbstractC9562n.m10088l(true, interfaceC1436k, this.f28735e), this);
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: m */
    public final void mo10052m() {
    }
}
