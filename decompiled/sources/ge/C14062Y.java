package ge;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ge.Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C14062Y extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean f44213Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f44214Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14062Y(boolean z6, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44213Y = z6;
        this.f44214Z = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14062Y(this.f44213Y, this.f44214Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C14062Y c14062y = (C14062Y) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c14062y.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        if (this.f44213Y) {
            this.f44214Z.setValue(Boolean.TRUE);
        }
        return C17296C.f55119a;
    }
}
