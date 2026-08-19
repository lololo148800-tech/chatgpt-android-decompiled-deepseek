package p278L0;

import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p103Dn.C2219z0;
import p349O0.C5997d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: L0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C4882k extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15915Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f15916Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC16546n f15917o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC19694j f15918p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4882k(InterfaceC1426a interfaceC1426a, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15917o0 = (AbstractC16546n) interfaceC1426a;
        this.f15918p0 = (AbstractC19694j) interfaceC1439n;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r2v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4882k c4882k = new C4882k(this.f15917o0, this.f15918p0, interfaceC18770c);
        c4882k.f15916Z = obj;
        return c4882k;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4882k) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r5v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15915Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f15916Z;
            C16525B c16525b = new C16525B();
            C2219z0 c2219z0M6441a0 = C5997d.m6441a0(this.f15917o0);
            C4880j c4880j = new C4880j(c16525b, interfaceC0571F, this.f15918p0, 0);
            this.f15915Y = 1;
            if (c2219z0M6441a0.mo3141d(c4880j, this) == enumC19250a) {
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
