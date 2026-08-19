package androidx.lifecycle;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: androidx.lifecycle.o */
/* JADX INFO: loaded from: classes.dex */
public final class C11106o extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f33481Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11107p f33482Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11106o(C11107p c11107p, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f33482Z = c11107p;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11106o c11106o = new C11106o(this.f33482Z, interfaceC18770c);
        c11106o.f33481Y = obj;
        return c11106o;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C11106o c11106o = (C11106o) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c11106o.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f33481Y;
        C11107p c11107p = this.f33482Z;
        AbstractC11105n abstractC11105n = c11107p.f33483Y;
        if (abstractC11105n.mo7807b().compareTo(EnumC11104m.f33475Z) >= 0) {
            abstractC11105n.mo7806a(c11107p);
        } else {
            AbstractC0575H.m1181j(interfaceC0571F.getCoroutineContext(), null);
        }
        return C17296C.f55119a;
    }
}
