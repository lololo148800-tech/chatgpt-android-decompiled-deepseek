package p858ko;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p758g0.AbstractC13758e;
import p758g0.C13746W;
import p758g0.C13774m;
import p758g0.InterfaceC13772l;
import p878lo.C17097f;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ko.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C16517t extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f51229Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC13772l f51230Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16499b f51231o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16499b f51232p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16498a f51233q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C16501d f51234r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C16498a f51235s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C16484C f51236t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ long f51237u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16517t(InterfaceC13772l interfaceC13772l, C16499b c16499b, C16499b c16499b2, C16498a c16498a, C16501d c16501d, C16498a c16498a2, C16484C c16484c, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f51230Z = interfaceC13772l;
        this.f51231o0 = c16499b;
        this.f51232p0 = c16499b2;
        this.f51233q0 = c16498a;
        this.f51234r0 = c16501d;
        this.f51235s0 = c16498a2;
        this.f51236t0 = c16484c;
        this.f51237u0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16517t(this.f51230Z, this.f51231o0, this.f51232p0, this.f51233q0, this.f51234r0, this.f51235s0, this.f51236t0, this.f51237u0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16517t) create((C17097f) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f51229Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13774m c13774mM15237b = AbstractC13758e.m15237b(0.0f, 0.0f, 30);
            Float f10 = new Float(1.0f);
            InterfaceC13772l c13746w = this.f51230Z;
            if (c13746w instanceof C13746W) {
                C13746W c13746w2 = (C13746W) c13746w;
                Float f11 = new Float(1.0E-4f);
                AbstractC16544l.m18094g(c13746w2, "<this>");
                c13746w = new C13746W(c13746w2.f43352a, c13746w2.f43353b, f11);
            }
            C16516s c16516s = new C16516s(this.f51231o0, this.f51232p0, this.f51233q0, this.f51234r0, this.f51235s0, this.f51236t0, this.f51237u0);
            this.f51229Y = 1;
            if (AbstractC13758e.m15244i(c13774mM15237b, f10, c13746w, false, c16516s, this, 4) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
