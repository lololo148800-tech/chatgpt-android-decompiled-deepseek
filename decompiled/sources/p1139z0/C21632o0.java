package p1139z0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: z0.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21632o0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f68530Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f68531Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21640s0 f68532o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21632o0(C21640s0 c21640s0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f68532o0 = c21640s0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C21632o0 c21632o0 = new C21632o0(this.f68532o0, interfaceC18770c);
        c21632o0.f68531Z = obj;
        return c21632o0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C21632o0) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f68530Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C21630n0 c21630n0 = new C21630n0(this.f68532o0, (C19723A) this.f68531Z, null);
            this.f68530Y = 1;
            if (AbstractC0575H.m1183l(c21630n0, this) == enumC19250a) {
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
