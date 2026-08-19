package p000;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p195Hh.C3430e;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: f */
/* JADX INFO: loaded from: classes.dex */
public final class C13459f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f42597Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f42598Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13459f(InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f42598Z = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C13459f(this.f42598Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13459f) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f42597Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f42597Y = 1;
            if (AbstractC0575H.m1184m(300L, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        C3430e c3430e = AbstractC17714o.f56552b;
        this.f42598Z.setValue(Boolean.TRUE);
        return C17296C.f55119a;
    }
}
