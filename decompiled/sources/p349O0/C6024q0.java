package p349O0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: O0.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6024q0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f19592Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f19593Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6030t0 f19594o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5977T f19595p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6024q0(C6030t0 c6030t0, InterfaceC5977T interfaceC5977T, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f19594o0 = c6030t0;
        this.f19595p0 = interfaceC5977T;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C6024q0 c6024q0 = new C6024q0(this.f19594o0, this.f19595p0, interfaceC18770c);
        c6024q0.f19593Z = obj;
        return c6024q0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6024q0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f19592Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f19593Z;
        this.f19592Y = 1;
        this.f19594o0.invoke(interfaceC0571F, this.f19595p0, this);
        return enumC19250a;
    }
}
