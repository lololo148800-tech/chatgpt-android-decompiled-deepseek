package p232J3;

import p1016t3.AbstractC19764N;
import p1016t3.C19797x;
import p1073w3.AbstractC20817s;
import p1142z3.InterfaceC21730C;

/* JADX INFO: renamed from: J3.c0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4231c0 extends AbstractC4237i {

    /* JADX INFO: renamed from: k */
    public final AbstractC4226a f13828k;

    public AbstractC4231c0(AbstractC4226a abstractC4226a) {
        this.f13828k = abstractC4226a;
    }

    /* JADX INFO: renamed from: A */
    public void mo5001A() {
        m5006z();
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: f */
    public final AbstractC19764N mo4992f() {
        return this.f13828k.mo4992f();
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: g */
    public final C19797x mo4930g() {
        return this.f13828k.mo4930g();
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: h */
    public final boolean mo4993h() {
        return this.f13828k.mo4993h();
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: k */
    public final void mo4932k(InterfaceC21730C interfaceC21730C) {
        this.f13848j = interfaceC21730C;
        this.f13847i = AbstractC20817s.m21411l(null);
        mo5001A();
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: r */
    public void mo4935r(C19797x c19797x) {
        this.f13828k.mo4935r(c19797x);
    }

    @Override // p232J3.AbstractC4237i
    /* JADX INFO: renamed from: s */
    public final C4253y mo4936s(Object obj, C4253y c4253y) {
        return mo5004x(c4253y);
    }

    @Override // p232J3.AbstractC4237i
    /* JADX INFO: renamed from: t */
    public final long mo5002t(long j10, Object obj) {
        return j10;
    }

    @Override // p232J3.AbstractC4237i
    /* JADX INFO: renamed from: u */
    public final int mo5003u(int i10, Object obj) {
        return i10;
    }

    @Override // p232J3.AbstractC4237i
    /* JADX INFO: renamed from: v */
    public final void mo4937v(Object obj, AbstractC4226a abstractC4226a, AbstractC19764N abstractC19764N) {
        mo5005y(abstractC19764N);
    }

    /* JADX INFO: renamed from: y */
    public abstract void mo5005y(AbstractC19764N abstractC19764N);

    /* JADX INFO: renamed from: z */
    public final void m5006z() {
        m5008w(null, this.f13828k);
    }

    /* JADX INFO: renamed from: x */
    public C4253y mo5004x(C4253y c4253y) {
        return c4253y;
    }
}
