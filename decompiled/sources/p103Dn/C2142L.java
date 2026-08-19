package p103Dn;

import java.util.Set;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p032B4.C0806a;
import p060C6.AbstractC1604a;
import p060C6.C1607d;
import p1034u6.C20133k;
import p1034u6.C20139q;
import p1099x6.AbstractC21154v;
import p1099x6.C21147o;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17680n;
import p917o6.C17853f;
import p967qh.C18715e;
import p972qm.InterfaceC18770c;
import p991rh.C18987B;
import p991rh.C18988C;
import p991rh.InterfaceC18989D;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Dn.L */
/* JADX INFO: loaded from: classes2.dex */
public final class C2142L implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f6560Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2186j f6561Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16525B f6562o0;

    public /* synthetic */ C2142L(InterfaceC2186j interfaceC2186j, C16525B c16525b, int i10) {
        this.f6560Y = i10;
        this.f6561Z = interfaceC2186j;
        this.f6562o0 = c16525b;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) throws Throwable {
        C2140K c2140k;
        C2142L c2142l;
        C20133k c20133k;
        C21147o c21147o;
        Object obj2;
        switch (this.f6560Y) {
            case 0:
                if (interfaceC18770c instanceof C2140K) {
                    c2140k = (C2140K) interfaceC18770c;
                    int i10 = c2140k.f6556p0;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c2140k.f6556p0 = i10 - Integer.MIN_VALUE;
                    } else {
                        c2140k = new C2140K(this, interfaceC18770c);
                    }
                } else {
                    c2140k = new C2140K(this, interfaceC18770c);
                }
                Object obj3 = c2140k.f6554Z;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i11 = c2140k.f6556p0;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2142l = c2140k.f6553Y;
                    try {
                        AbstractC9233X.m9807c(obj3);
                        return C17296C.f55119a;
                    } catch (Throwable th2) {
                        th = th2;
                        c2142l.f6562o0.f51262Y = th;
                        throw th;
                    }
                }
                AbstractC9233X.m9807c(obj3);
                try {
                    InterfaceC2186j interfaceC2186j = this.f6561Z;
                    c2140k.f6553Y = this;
                    c2140k.f6556p0 = 1;
                    if (interfaceC2186j.mo395a(obj, c2140k) == enumC19250a) {
                        return enumC19250a;
                    }
                    return C17296C.f55119a;
                } catch (Throwable th3) {
                    th = th3;
                    c2142l = this;
                    c2142l.f6562o0.f51262Y = th;
                    throw th;
                }
            case 1:
                InterfaceC18989D interfaceC18989D = (InterfaceC18989D) obj;
                boolean z6 = interfaceC18989D instanceof C18988C;
                C17296C c17296c = C17296C.f55119a;
                if (z6) {
                    Object objMo395a = this.f6561Z.mo395a(new C18715e(((C18988C) interfaceC18989D).f60562a), interfaceC18770c);
                    return objMo395a == EnumC19250a.f61036Y ? objMo395a : c17296c;
                }
                if (!(interfaceC18989D instanceof C18987B)) {
                    return c17296c;
                }
                this.f6562o0.f51262Y = ((C18987B) interfaceC18989D).f60561a;
                return c17296c;
            case 2:
                if (interfaceC18770c instanceof C20133k) {
                    c20133k = (C20133k) interfaceC18770c;
                    int i12 = c20133k.f63774Z;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c20133k.f63774Z = i12 - Integer.MIN_VALUE;
                    } else {
                        c20133k = new C20133k(this, interfaceC18770c);
                    }
                } else {
                    c20133k = new C20133k(this, interfaceC18770c);
                }
                Object obj4 = c20133k.f63773Y;
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i13 = c20133k.f63774Z;
                if (i13 == 0) {
                    AbstractC9233X.m9807c(obj4);
                    C17853f c17853fM1843b = (C17853f) obj;
                    if (this.f6562o0.f51262Y != null) {
                        C0806a c0806aM19598a = c17853fM1843b.m19598a();
                        c0806aM19598a.f2235a = false;
                        c17853fM1843b = c0806aM19598a.m1843b();
                    }
                    c20133k.f63774Z = 1;
                    if (this.f6561Z.mo395a(c17853fM1843b, c20133k) == enumC19250a2) {
                        return enumC19250a2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj4);
                }
                return C17296C.f55119a;
            case 3:
                return m3249b((C17853f) obj, interfaceC18770c);
            default:
                if (interfaceC18770c instanceof C21147o) {
                    c21147o = (C21147o) interfaceC18770c;
                    int i14 = c21147o.f67203Z;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c21147o.f67203Z = i14 - Integer.MIN_VALUE;
                    } else {
                        c21147o = new C21147o(this, interfaceC18770c);
                    }
                } else {
                    c21147o = new C21147o(this, interfaceC18770c);
                }
                Object obj5 = c21147o.f67202Y;
                EnumC19250a enumC19250a3 = EnumC19250a.f61036Y;
                int i15 = c21147o.f67203Z;
                if (i15 == 0) {
                    AbstractC9233X.m9807c(obj5);
                    if (!(obj instanceof Set) || (obj2 = this.f6562o0.f51262Y) == null || !AbstractC17680n.m19346V((Iterable) obj, (Iterable) obj2).isEmpty()) {
                        c21147o.f67203Z = 1;
                        if (this.f6561Z.mo395a(obj, c21147o) == enumC19250a3) {
                            return enumC19250a3;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj5);
                }
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m3249b(C17853f c17853f, InterfaceC18770c interfaceC18770c) {
        C20139q c20139q;
        C2142L c2142l;
        if (interfaceC18770c instanceof C20139q) {
            c20139q = (C20139q) interfaceC18770c;
            int i10 = c20139q.f63795p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c20139q.f63795p0 = i10 - Integer.MIN_VALUE;
            } else {
                c20139q = new C20139q(this, interfaceC18770c);
            }
        } else {
            c20139q = new C20139q(this, interfaceC18770c);
        }
        Object obj = c20139q.f63793Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c20139q.f63795p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            AbstractC1604a abstractC1604a = c17853f.f56935e;
            C1607d c1607d = AbstractC21154v.f67230a;
            InterfaceC2186j interfaceC2186j = this.f6561Z;
            if (abstractC1604a != c1607d) {
                c20139q.f63795p0 = 2;
                return interfaceC2186j.mo395a(c17853f, c20139q) == enumC19250a ? enumC19250a : c17296c;
            }
            Object obj2 = this.f6562o0.f51262Y;
            if (obj2 != null) {
                c20139q.f63792Y = this;
                c20139q.f63795p0 = 1;
                if (interfaceC2186j.mo395a(obj2, c20139q) == enumC19250a) {
                    return enumC19250a;
                }
                c2142l = this;
                c2142l.f6562o0.f51262Y = null;
            }
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    AbstractC9233X.m9807c(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2142l = c20139q.f63792Y;
            AbstractC9233X.m9807c(obj);
            c2142l.f6562o0.f51262Y = null;
        }
        return c17296c;
    }

    public C2142L(C16525B c16525b, InterfaceC2186j interfaceC2186j) {
        this.f6560Y = 3;
        this.f6562o0 = c16525b;
        this.f6561Z = interfaceC2186j;
    }
}
