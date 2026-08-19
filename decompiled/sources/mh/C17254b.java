package mh;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: mh.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C17254b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean f55044Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f55045Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f55046o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f55047p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17254b(boolean z6, int i10, InterfaceC5985X interfaceC5985X, InterfaceC5985X interfaceC5985X2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f55044Y = z6;
        this.f55045Z = i10;
        this.f55046o0 = interfaceC5985X;
        this.f55047p0 = interfaceC5985X2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17254b(this.f55044Y, this.f55045Z, this.f55046o0, this.f55047p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C17254b c17254b = (C17254b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c17254b.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        boolean z6 = this.f55044Y;
        InterfaceC5985X interfaceC5985X = this.f55046o0;
        if (z6) {
            interfaceC5985X.setValue(Boolean.valueOf(this.f55045Z > 0));
        } else if (((Boolean) interfaceC5985X.getValue()).booleanValue()) {
            ((InterfaceC1426a) this.f55047p0.getValue()).invoke();
        }
        return C17296C.f55119a;
    }
}
