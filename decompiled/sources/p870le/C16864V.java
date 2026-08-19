package p870le;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: le.V */
/* JADX INFO: loaded from: classes3.dex */
public final class C16864V extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean f54110Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f54111Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f54112o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16864V(boolean z6, InterfaceC5985X interfaceC5985X, InterfaceC5985X interfaceC5985X2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54110Y = z6;
        this.f54111Z = interfaceC5985X;
        this.f54112o0 = interfaceC5985X2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16864V(this.f54110Y, this.f54111Z, this.f54112o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C16864V c16864v = (C16864V) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c16864v.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        if (this.f54110Y) {
            InterfaceC5985X interfaceC5985X = this.f54111Z;
            if (!((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                this.f54112o0.setValue(null);
                interfaceC5985X.setValue(Boolean.TRUE);
            }
        }
        return C17296C.f55119a;
    }
}
