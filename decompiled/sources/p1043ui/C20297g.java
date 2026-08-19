package p1043ui;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p582Xk.HXHG.TfazcFv;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ui.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C20297g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f64167Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC20298h f64168Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f64169o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20297g(InterfaceC1436k interfaceC1436k, InterfaceC18770c interfaceC18770c, AbstractC20298h abstractC20298h) {
        super(2, interfaceC18770c);
        this.f64168Z = abstractC20298h;
        this.f64169o0 = interfaceC1436k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20297g(this.f64169o0, interfaceC18770c, this.f64168Z);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20297g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f64167Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f64167Y = 1;
            if (this.f64168Z.m21029b(this.f64169o0, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException(TfazcFv.AYHjquyS);
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
