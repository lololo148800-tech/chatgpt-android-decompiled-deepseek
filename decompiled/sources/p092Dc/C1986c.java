package p092Dc;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.C2207t0;
import p571X9.AbstractC9233X;
import p708dh.C13149c;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dc.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1986c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f5868Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13149c f5869Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1986c(C13149c c13149c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f5869Z = c13149c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C1986c(this.f5869Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1986c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f5868Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2207t0 c2207t0 = this.f5869Z.f41743b;
            this.f5868Y = 1;
            obj = AbstractC2124C.m3221t(c2207t0, this);
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
