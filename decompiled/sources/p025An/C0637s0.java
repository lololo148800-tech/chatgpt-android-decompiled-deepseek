package p025An;

import p153Fn.C2930h;

/* JADX INFO: renamed from: An.s0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0637s0 extends AbstractC0633q0 {

    /* JADX INFO: renamed from: q0 */
    public final C0641u0 f1884q0;

    /* JADX INFO: renamed from: r0 */
    public final C0639t0 f1885r0;

    /* JADX INFO: renamed from: s0 */
    public final C0632q f1886s0;

    /* JADX INFO: renamed from: t0 */
    public final Object f1887t0;

    public C0637s0(C0641u0 c0641u0, C0639t0 c0639t0, C0632q c0632q, Object obj) {
        this.f1884q0 = c0641u0;
        this.f1885r0 = c0639t0;
        this.f1886s0 = c0632q;
        this.f1887t0 = obj;
    }

    @Override // p025An.AbstractC0633q0
    /* JADX INFO: renamed from: j */
    public final boolean mo1149j() {
        return false;
    }

    @Override // p025An.AbstractC0633q0
    /* JADX INFO: renamed from: k */
    public final void mo1150k(Throwable th2) {
        C0632q c0632q = this.f1886s0;
        C0641u0 c0641u0 = this.f1884q0;
        c0641u0.getClass();
        C0632q c0632qM1287U = C0641u0.m1287U(c0632q);
        C0639t0 c0639t0 = this.f1885r0;
        Object obj = this.f1887t0;
        if (c0632qM1287U == null || !c0641u0.m1307f0(c0639t0, c0632qM1287U, obj)) {
            c0639t0.f1891Y.m3749d(new C2930h(2), 2);
            C0632q c0632qM1287U2 = C0641u0.m1287U(c0632q);
            if (c0632qM1287U2 == null || !c0641u0.m1307f0(c0639t0, c0632qM1287U2, obj)) {
                c0641u0.mo1213r(c0641u0.m1291C(c0639t0, obj));
            }
        }
    }
}
