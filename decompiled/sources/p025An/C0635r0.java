package p025An;

import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: An.r0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0635r0 extends C0624m {

    /* JADX INFO: renamed from: u0 */
    public final C0641u0 f1883u0;

    public C0635r0(InterfaceC18770c interfaceC18770c, C0641u0 c0641u0) {
        super(1, interfaceC18770c);
        this.f1883u0 = c0641u0;
    }

    @Override // p025An.C0624m
    /* JADX INFO: renamed from: p */
    public final Throwable mo1260p(C0641u0 c0641u0) {
        Throwable thM1283d;
        C0641u0 c0641u1 = this.f1883u0;
        c0641u1.getClass();
        Object obj = C0641u0.f1897Y.get(c0641u1);
        if (!(obj instanceof C0639t0) || (thM1283d = ((C0639t0) obj).m1283d()) == null) {
            return obj instanceof C0642v ? ((C0642v) obj).f1900a : c0641u0.mo1273T();
        }
        return thM1283d;
    }

    @Override // p025An.C0624m
    /* JADX INFO: renamed from: z */
    public final String mo1268z() {
        return "AwaitContinuation";
    }
}
