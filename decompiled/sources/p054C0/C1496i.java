package p054C0;

import p017Af.C0485p;
import p080D0.AbstractC1823p0;
import p080D0.C1821o0;
import p080D0.C1826r;
import p080D0.C1828s;
import p080D0.C1840y;
import p080D0.InterfaceC1815l0;
import p1071w0.InterfaceC20772r0;
import p1095x1.InterfaceC21098s;
import p759g1.C13800b;

/* JADX INFO: renamed from: C0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1496i implements InterfaceC20772r0 {

    /* JADX INFO: renamed from: a */
    public long f3965a = 0;

    /* JADX INFO: renamed from: b */
    public long f3966b = 0;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1494g f3967c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC1815l0 f3968d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f3969e;

    public C1496i(C1494g c1494g, InterfaceC1815l0 interfaceC1815l0, long j10) {
        this.f3967c = c1494g;
        this.f3968d = interfaceC1815l0;
        this.f3969e = j10;
    }

    @Override // p1071w0.InterfaceC20772r0
    /* JADX INFO: renamed from: a */
    public final void mo464a() {
        C1840y c1840y;
        InterfaceC1815l0 interfaceC1815l0 = this.f3968d;
        if (!AbstractC1823p0.m2652a(interfaceC1815l0, this.f3969e) || (c1840y = ((C1821o0) interfaceC1815l0).f5249h) == null) {
            return;
        }
        c1840y.invoke();
    }

    @Override // p1071w0.InterfaceC20772r0
    /* JADX INFO: renamed from: b */
    public final void mo465b(long j10) {
        InterfaceC21098s interfaceC21098s = (InterfaceC21098s) this.f3967c.invoke();
        InterfaceC1815l0 interfaceC1815l0 = this.f3968d;
        if (interfaceC21098s != null) {
            if (!interfaceC21098s.mo21522h()) {
                return;
            }
            C1826r c1826r = C1828s.f5268f;
            C0485p c0485p = ((C1821o0) interfaceC1815l0).f5247f;
            if (c0485p != null) {
                c0485p.mo985d(Boolean.TRUE, interfaceC21098s, new C13800b(j10), c1826r);
            }
            this.f3965a = j10;
        }
        if (AbstractC1823p0.m2652a(interfaceC1815l0, this.f3969e)) {
            this.f3966b = 0L;
        }
    }

    @Override // p1071w0.InterfaceC20772r0
    /* JADX INFO: renamed from: e */
    public final void mo468e(long j10) {
        InterfaceC21098s interfaceC21098s = (InterfaceC21098s) this.f3967c.invoke();
        if (interfaceC21098s == null || !interfaceC21098s.mo21522h()) {
            return;
        }
        InterfaceC1815l0 interfaceC1815l0 = this.f3968d;
        if (AbstractC1823p0.m2652a(interfaceC1815l0, this.f3969e)) {
            long jM15311l = C13800b.m15311l(this.f3966b, j10);
            this.f3966b = jM15311l;
            long jM15311l2 = C13800b.m15311l(this.f3965a, jM15311l);
            if (((C1821o0) interfaceC1815l0).m2649b(interfaceC21098s, jM15311l2, this.f3965a, C1828s.f5268f, true)) {
                this.f3965a = jM15311l2;
                this.f3966b = 0L;
            }
        }
    }

    @Override // p1071w0.InterfaceC20772r0
    public final void onCancel() {
        C1840y c1840y;
        InterfaceC1815l0 interfaceC1815l0 = this.f3968d;
        if (!AbstractC1823p0.m2652a(interfaceC1815l0, this.f3969e) || (c1840y = ((C1821o0) interfaceC1815l0).f5249h) == null) {
            return;
        }
        c1840y.invoke();
    }

    @Override // p1071w0.InterfaceC20772r0
    /* JADX INFO: renamed from: c */
    public final void mo466c() {
    }

    @Override // p1071w0.InterfaceC20772r0
    /* JADX INFO: renamed from: d */
    public final void mo467d() {
    }
}
