package p647ak;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC8215v5;
import p571X9.AbstractC9233X;
import p729ej.C13421l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ak.W0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10675W0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f31696Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13421l f31697Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C10696e1 f31698o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10675W0(C13421l c13421l, C10696e1 c10696e1, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f31697Z = c13421l;
        this.f31698o0 = c10696e1;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C10675W0(this.f31697Z, this.f31698o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C10675W0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f31696Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f31696Y = 1;
            if (AbstractC0575H.m1184m(1000L, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        this.f31697Z.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a(this.f31698o0, C10671U0.f31678o0));
        return C17296C.f55119a;
    }
}
