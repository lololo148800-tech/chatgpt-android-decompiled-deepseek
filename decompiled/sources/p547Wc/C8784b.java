package p547Wc;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1135yn.C21555b;
import p228J.AbstractC3794B0;
import p324Mn.C5551u;
import p349O0.C5992a0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wc.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C8784b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f26839Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f26840Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C5551u f26841o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f26842p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ double f26843q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ double f26844r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ long f26845s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C5992a0 f26846t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8784b(C5551u c5551u, long j10, double d10, double d11, long j11, C5992a0 c5992a0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f26841o0 = c5551u;
        this.f26842p0 = j10;
        this.f26843q0 = d10;
        this.f26844r0 = d11;
        this.f26845s0 = j11;
        this.f26846t0 = c5992a0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C8784b c8784b = new C8784b(this.f26841o0, this.f26842p0, this.f26843q0, this.f26844r0, this.f26845s0, this.f26846t0, interfaceC18770c);
        c8784b.f26840Z = obj;
        return c8784b;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8784b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0571F interfaceC0571F;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f26839Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            interfaceC0571F = (InterfaceC0571F) this.f26840Z;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0571F = (InterfaceC0571F) this.f26840Z;
            AbstractC9233X.m9807c(obj);
        }
        while (AbstractC0575H.m1196y(interfaceC0571F)) {
            C5551u.Companion.getClass();
            long jM5946b = new C5551u(AbstractC3794B0.m4501z("instant(...)")).m5946b(this.f26841o0);
            long j10 = this.f26842p0;
            double dExp = 0.0d;
            if (C21555b.m21835e(j10) > 0) {
                double d10 = this.f26844r0;
                double d11 = this.f26843q0;
                if (d10 > d11) {
                    double dM21835e = C21555b.m21835e(jM5946b);
                    double dM21835e2 = C21555b.m21835e(j10);
                    if (dM21835e <= dM21835e2) {
                        dExp = (dM21835e / dM21835e2) * d11;
                    } else {
                        double d12 = d10 - d11;
                        dExp = ((((double) 1) - Math.exp(((-(d11 / dM21835e2)) / d12) * (dM21835e - dM21835e2))) * d12) + d11;
                    }
                }
            }
            this.f26846t0.m6407g(dExp);
            this.f26840Z = interfaceC0571F;
            this.f26839Y = 1;
            if (AbstractC0575H.m1185n(this.f26845s0, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
