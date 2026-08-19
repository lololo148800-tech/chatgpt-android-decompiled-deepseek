package p173Gj;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1156zj.C22156g0;
import p523V9.AbstractC8215v5;
import p571X9.AbstractC9233X;
import p729ej.C13421l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Gj.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3095b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f9312Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22156g0 f9313Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13421l f9314o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3095b(C22156g0 c22156g0, C13421l c13421l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f9313Z = c22156g0;
        this.f9314o0 = c13421l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3095b(this.f9313Z, this.f9314o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3095b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f9312Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            long j10 = this.f9313Z.f70057u0;
            this.f9312Y = 1;
            if (AbstractC0575H.m1184m(j10, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        this.f9314o0.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(C3094a.f9306Z));
        return C17296C.f55119a;
    }
}
