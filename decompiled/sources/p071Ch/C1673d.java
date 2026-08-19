package p071Ch;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ch.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C1673d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f4744Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1676g f4745Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1673d(C1676g c1676g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f4745Z = c1676g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C1673d(this.f4745Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1673d) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f4744Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C1678i c1678i = this.f4745Z.f4752b;
            this.f4744Y = 1;
            obj = AbstractC2124C.m3221t(c1678i.f64176f, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
