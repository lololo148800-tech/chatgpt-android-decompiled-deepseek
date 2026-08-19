package p1105xc;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: xc.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C21188r extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f67340Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21189s f67341Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21188r(C21189s c21189s, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f67341Z = c21189s;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C21188r(this.f67341Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C21188r) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f67340Y;
        C21189s c21189s = this.f67341Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        long j10 = c21189s.f67346e;
        this.f67340Y = 1;
        if (AbstractC0575H.m1184m(j10, this) == enumC19250a) {
            return enumC19250a;
        }
        this.f67340Y = 2;
        if (C21189s.m21613a(c21189s, this) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
