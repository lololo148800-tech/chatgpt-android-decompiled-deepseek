package ge;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2213w0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ge.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14077g0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC2213w0 f44304Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f44305Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14077g0(InterfaceC2213w0 interfaceC2213w0, int i10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44304Y = interfaceC2213w0;
        this.f44305Z = i10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14077g0(this.f44304Y, this.f44305Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C14077g0 c14077g0 = (C14077g0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c14077g0.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f44304Y.setValue(new Integer(this.f44305Z));
        return C17296C.f55119a;
    }
}
