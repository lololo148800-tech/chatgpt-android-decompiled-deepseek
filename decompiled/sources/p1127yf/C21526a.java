package p1127yf;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p926of.C18143F;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: yf.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C21526a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f68172Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f68173Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21526a(InterfaceC5985X interfaceC5985X, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f68172Y = str;
        this.f68173Z = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C21526a(this.f68173Z, this.f68172Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C21526a c21526a = (C21526a) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c21526a.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        ((InterfaceC1436k) this.f68173Z.getValue()).invoke(new C18143F(this.f68172Y));
        return C17296C.f55119a;
    }
}
