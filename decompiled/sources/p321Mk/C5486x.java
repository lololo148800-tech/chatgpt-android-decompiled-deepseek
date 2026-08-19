package p321Mk;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p658b5.C11238i;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Mk.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C5486x extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C11238i f17912Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f17913Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5486x(C11238i c11238i, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f17912Y = c11238i;
        this.f17913Z = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5486x(this.f17912Y, this.f17913Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C5486x c5486x = (C5486x) create(Float.valueOf(((Number) obj).floatValue()), (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c5486x.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f17912Y.m12543J0(this.f17913Z);
        return C17296C.f55119a;
    }
}
