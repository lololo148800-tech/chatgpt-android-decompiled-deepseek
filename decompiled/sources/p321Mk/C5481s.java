package p321Mk;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p658b5.C11238i;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Mk.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C5481s extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f17898Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11238i f17899Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f17900o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5481s(C11238i c11238i, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f17899Z = c11238i;
        this.f17900o0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C5481s c5481s = new C5481s(this.f17899Z, this.f17900o0, interfaceC18770c);
        c5481s.f17898Y = obj;
        return c5481s;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5481s) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f17898Y;
        C11238i c11238i = this.f17899Z;
        long j10 = this.f17900o0;
        AbstractC0575H.m1156D(interfaceC0571F, null, null, new C5479q(c11238i, j10, null), 3);
        return AbstractC0575H.m1156D(interfaceC0571F, null, null, new C5480r(c11238i, j10, null), 3);
    }
}
