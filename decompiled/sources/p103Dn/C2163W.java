package p103Dn;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p129En.C2590a;
import p427Rc.C6850g;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.W */
/* JADX INFO: loaded from: classes2.dex */
public final class C2163W implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f6629Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2186j f6630Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC19694j f6631o0;

    /* JADX WARN: Multi-variable type inference failed */
    public C2163W(InterfaceC2186j interfaceC2186j, InterfaceC1439n interfaceC1439n) {
        this.f6630Z = interfaceC2186j;
        this.f6631o0 = (AbstractC19694j) interfaceC1439n;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r2v10, types: [Bm.n, sm.j] */
    /* JADX WARN: Type inference failed for: r9v2, types: [Bm.n, sm.j] */
    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        C2161V c2161v;
        Object obj2;
        Object obj3;
        C2163W c2163w;
        C6850g c6850g;
        InterfaceC2186j interfaceC2186j;
        switch (this.f6629Y) {
            case 0:
                if (interfaceC18770c instanceof C2161V) {
                    c2161v = (C2161V) interfaceC18770c;
                    int i10 = c2161v.f6624o0;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c2161v.f6624o0 = i10 - Integer.MIN_VALUE;
                    } else {
                        c2161v = new C2161V(this, interfaceC18770c);
                    }
                } else {
                    c2161v = new C2161V(this, interfaceC18770c);
                }
                Object obj4 = c2161v.f6623Z;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i11 = c2161v.f6624o0;
                boolean z6 = true;
                if (i11 != 0) {
                    if (i11 == 1) {
                        Object obj5 = c2161v.f6626q0;
                        C2163W c2163w2 = c2161v.f6622Y;
                        AbstractC9233X.m9807c(obj4);
                        obj3 = obj5;
                        c2163w = c2163w2;
                        obj2 = obj4;
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c2163w = c2161v.f6622Y;
                        AbstractC9233X.m9807c(obj4);
                    }
                    if (z6) {
                        return C17296C.f55119a;
                    }
                    throw new C2590a(c2163w);
                }
                AbstractC9233X.m9807c(obj4);
                c2161v.f6622Y = this;
                c2161v.f6626q0 = obj;
                c2161v.f6624o0 = 1;
                Object objInvoke = this.f6631o0.invoke(obj, c2161v);
                if (objInvoke == enumC19250a) {
                    return enumC19250a;
                }
                obj2 = objInvoke;
                obj3 = obj;
                c2163w = this;
                if (((Boolean) obj2).booleanValue()) {
                    InterfaceC2186j interfaceC2186j2 = c2163w.f6630Z;
                    c2161v.f6622Y = c2163w;
                    c2161v.f6626q0 = null;
                    c2161v.f6624o0 = 2;
                    if (interfaceC2186j2.mo395a(obj3, c2161v) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    z6 = false;
                }
                if (z6) {
                    return C17296C.f55119a;
                }
                throw new C2590a(c2163w);
            default:
                if (interfaceC18770c instanceof C6850g) {
                    c6850g = (C6850g) interfaceC18770c;
                    int i12 = c6850g.f21985Z;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c6850g.f21985Z = i12 - Integer.MIN_VALUE;
                    } else {
                        c6850g = new C6850g(this, interfaceC18770c);
                    }
                } else {
                    c6850g = new C6850g(this, interfaceC18770c);
                }
                Object obj6 = c6850g.f21984Y;
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i13 = c6850g.f21985Z;
                if (i13 != 0) {
                    if (i13 == 1) {
                        interfaceC2186j = c6850g.f21986o0;
                        AbstractC9233X.m9807c(obj6);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(obj6);
                    }
                    return C17296C.f55119a;
                }
                AbstractC9233X.m9807c(obj6);
                InterfaceC2186j interfaceC2186j3 = this.f6630Z;
                c6850g.f21986o0 = interfaceC2186j3;
                c6850g.f21985Z = 1;
                Object objInvoke2 = this.f6631o0.invoke(obj, c6850g);
                if (objInvoke2 == enumC19250a2) {
                    return enumC19250a2;
                }
                obj6 = objInvoke2;
                interfaceC2186j = interfaceC2186j3;
                c6850g.f21986o0 = null;
                c6850g.f21985Z = 2;
                if (interfaceC2186j.mo395a(obj6, c6850g) == enumC19250a2) {
                    return enumC19250a2;
                }
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2163W(InterfaceC1439n interfaceC1439n, InterfaceC2186j interfaceC2186j) {
        this.f6631o0 = (AbstractC19694j) interfaceC1439n;
        this.f6630Z = interfaceC2186j;
    }
}
