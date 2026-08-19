package p1127yf;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: yf.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C21533h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean f68208Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f68209Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21533h(boolean z6, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f68208Y = z6;
        this.f68209Z = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C21533h(this.f68208Y, this.f68209Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C21533h c21533h = (C21533h) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c21533h.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        if (this.f68208Y) {
            this.f68209Z.setValue(Boolean.TRUE);
        }
        return C17296C.f55119a;
    }
}
