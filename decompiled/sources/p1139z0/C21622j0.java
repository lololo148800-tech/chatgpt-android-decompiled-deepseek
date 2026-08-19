package p1139z0;

import mm.C17296C;
import p002A0.C0120T;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: z0.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21622j0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f68494Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21640s0 f68495Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21622j0(C21640s0 c21640s0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f68495Z = c21640s0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C21622j0(this.f68495Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C21622j0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f68494Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C0120T c0120t = this.f68495Z.f68552D0;
            this.f68494Y = 1;
            if (c0120t.m415t(this) == enumC19250a) {
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
