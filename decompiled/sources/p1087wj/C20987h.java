package p1087wj;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1044uj.C20338h;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: wj.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C20987h extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f66813Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20989j f66814Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20987h(C20989j c20989j, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f66814Z = c20989j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C20987h(this.f66814Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C20987h) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f66813Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C20989j c20989j = this.f66814Z;
            InterfaceC20971B interfaceC20971B = c20989j.f66820c;
            C20338h c20338h = c20989j.f66821d;
            this.f66813Y = 1;
            obj = interfaceC20971B.m21457a(c20989j.f66819b, c20338h.f64309p0, this);
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
