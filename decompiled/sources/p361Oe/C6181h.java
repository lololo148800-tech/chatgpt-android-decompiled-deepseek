package p361Oe;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.C2153Q0;
import p216Id.C3700h;
import p571X9.AbstractC9233X;
import p909nm.C17689w;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Oe.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C6181h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f20132Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2153Q0 f20133Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6181h(C2153Q0 c2153q0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f20133Z = c2153q0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C6181h c6181h = new C6181h(this.f20133Z, interfaceC18770c);
        c6181h.f20132Y = obj;
        return c6181h;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C6181h c6181h = (C6181h) create((C6174a) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c6181h.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C2153Q0 c2153q0;
        Object value;
        C17689w c17689w;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        if (!(((C6174a) this.f20132Y).f20114b instanceof C3700h)) {
            do {
                c2153q0 = this.f20133Z;
                value = c2153q0.getValue();
                c17689w = C17689w.f56480Y;
                ((C6175b) value).getClass();
            } while (!c2153q0.m3250k(value, new C6175b(c17689w)));
        }
        return C17296C.f55119a;
    }
}
