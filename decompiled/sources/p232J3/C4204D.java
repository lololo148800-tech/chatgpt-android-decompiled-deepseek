package p232J3;

import p1016t3.C19765O;
import p1016t3.C19788o;
import p281L3.InterfaceC4930q;

/* JADX INFO: renamed from: J3.D */
/* JADX INFO: loaded from: classes.dex */
public final class C4204D implements InterfaceC4930q {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4930q f13659a;

    /* JADX INFO: renamed from: b */
    public final C19765O f13660b;

    public C4204D(InterfaceC4930q interfaceC4930q, C19765O c19765o) {
        this.f13659a = interfaceC4930q;
        this.f13660b = c19765o;
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: a */
    public final C19765O mo4904a() {
        return this.f13660b;
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: b */
    public final void mo4905b(boolean z6) {
        this.f13659a.mo4905b(z6);
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: c */
    public final C19788o mo4906c(int i10) {
        return this.f13660b.f62605d[this.f13659a.mo4908e(i10)];
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: d */
    public final void mo4907d() {
        this.f13659a.mo4907d();
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: e */
    public final int mo4908e(int i10) {
        return this.f13659a.mo4908e(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4204D)) {
            return false;
        }
        C4204D c4204d = (C4204D) obj;
        return this.f13659a.equals(c4204d.f13659a) && this.f13660b.equals(c4204d.f13660b);
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: f */
    public final void mo4909f() {
        this.f13659a.mo4909f();
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: g */
    public final int mo4910g() {
        return this.f13659a.mo4910g();
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: h */
    public final C19788o mo4911h() {
        return this.f13660b.f62605d[this.f13659a.mo4910g()];
    }

    public final int hashCode() {
        return this.f13659a.hashCode() + ((this.f13660b.hashCode() + 527) * 31);
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: i */
    public final void mo4912i(float f10) {
        this.f13659a.mo4912i(f10);
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: j */
    public final void mo4913j() {
        this.f13659a.mo4913j();
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: k */
    public final void mo4914k() {
        this.f13659a.mo4914k();
    }

    @Override // p281L3.InterfaceC4930q
    /* JADX INFO: renamed from: l */
    public final int mo4915l(int i10) {
        return this.f13659a.mo4915l(i10);
    }

    @Override // p281L3.InterfaceC4930q
    public final int length() {
        return this.f13659a.length();
    }
}
