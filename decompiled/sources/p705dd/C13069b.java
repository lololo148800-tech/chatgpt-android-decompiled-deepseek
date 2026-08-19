package p705dd;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2213w0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: dd.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C13069b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC2213w0 f41516Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f41517Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13069b(InterfaceC2213w0 interfaceC2213w0, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f41516Y = interfaceC2213w0;
        this.f41517Z = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C13069b(this.f41516Y, this.f41517Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C13069b c13069b = (C13069b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c13069b.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f41516Y.setValue(this.f41517Z);
        return C17296C.f55119a;
    }
}
