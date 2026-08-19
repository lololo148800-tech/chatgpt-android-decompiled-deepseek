package gd;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2153Q0;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: gd.u2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13997u2 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f44069Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14005w2 f44070Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13997u2(C14005w2 c14005w2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44070Z = c14005w2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C13997u2(this.f44070Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13997u2) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44069Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            long j10 = C14005w2.f44082f;
            this.f44069Y = 1;
            if (AbstractC0575H.m1185n(j10, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        C14005w2 c14005w2 = this.f44070Z;
        Object value = c14005w2.f44086d.getValue();
        EnumC13846D enumC13846D = EnumC13846D.f43883Z;
        if (value != enumC13846D) {
            AbstractC8160o6.m8726a(c14005w2.f44085c, "Statsig initialization timed out", null, 6);
            C2153Q0 c2153q0 = c14005w2.f44086d;
            c2153q0.getClass();
            c2153q0.m3251l(null, enumC13846D);
        }
        return C17296C.f55119a;
    }
}
