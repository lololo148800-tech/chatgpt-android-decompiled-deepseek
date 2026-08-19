package p758g0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p254K0.C4526w;
import p349O0.C5997d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: g0.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C13769j0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public float f43476Y;

    /* JADX INFO: renamed from: Z */
    public int f43477Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f43478o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13771k0 f43479p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13769j0(C13771k0 c13771k0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f43479p0 = c13771k0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C13769j0 c13769j0 = new C13769j0(this.f43479p0, interfaceC18770c);
        c13769j0.f43478o0 = obj;
        return c13769j0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13769j0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        float fM15251p;
        InterfaceC0571F interfaceC0571F;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f43477Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F2 = (InterfaceC0571F) this.f43478o0;
            fM15251p = AbstractC13758e.m15251p(interfaceC0571F2.getCoroutineContext());
            interfaceC0571F = interfaceC0571F2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fM15251p = this.f43476Y;
            interfaceC0571F = (InterfaceC0571F) this.f43478o0;
            AbstractC9233X.m9807c(obj);
        }
        while (AbstractC0575H.m1196y(interfaceC0571F)) {
            C4526w c4526w = new C4526w(this.f43479p0, fM15251p, 4);
            this.f43478o0 = interfaceC0571F;
            this.f43476Y = fM15251p;
            this.f43477Z = 1;
            if (C5997d.m6424K(getContext()).mo876v0(c4526w, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
