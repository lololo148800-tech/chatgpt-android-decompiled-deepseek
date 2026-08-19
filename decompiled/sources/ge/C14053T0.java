package ge;

import gd.C13936f1;
import gd.C13953j2;
import gd.C13972o1;
import gd.C13993t2;
import gd.C14005w2;
import gd.InterfaceC13849E;
import java.util.Iterator;
import java.util.List;
import mm.C17296C;
import p025An.AbstractC0593T;
import p103Dn.AbstractC2124C;
import p148Fi.C2786R0;
import p172Gi.C3077j;
import p201Hn.C3516e;
import p523V9.AbstractC8033Y5;
import p571X9.AbstractC9233X;
import p708dh.C13133K;
import p873lh.C16961l;
import p948pi.InterfaceC18419b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ge.T0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14053T0 implements InterfaceC18419b {

    /* JADX INFO: renamed from: Y */
    public final C13133K f44172Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC13849E f44173Z;

    /* JADX INFO: renamed from: o0 */
    public final C13993t2 f44174o0;

    /* JADX INFO: renamed from: p0 */
    public final C16961l f44175p0;

    public C14053T0(C13133K c13133k, InterfaceC13849E interfaceC13849E, C13993t2 c13993t2, C16961l c16961l) {
        this.f44172Y = c13133k;
        this.f44173Z = interfaceC13849E;
        this.f44174o0 = c13993t2;
        this.f44175p0 = c16961l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m15483c(C14053T0 c14053t0, AbstractC19687c abstractC19687c) {
        C14042N0 c14042n0;
        if (abstractC19687c instanceof C14042N0) {
            c14042n0 = (C14042N0) abstractC19687c;
            int i10 = c14042n0.f44147p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c14042n0.f44147p0 = i10 - Integer.MIN_VALUE;
            } else {
                c14042n0 = new C14042N0(c14053t0, abstractC19687c);
            }
        } else {
            c14042n0 = new C14042N0(c14053t0, abstractC19687c);
        }
        Object objM15480b = c14042n0.f44145Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c14042n0.f44147p0;
        if (i11 != 0) {
            if (i11 == 1) {
                c14053t0 = c14042n0.f44144Y;
                AbstractC9233X.m9807c(objM15480b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM15480b);
            }
            return objM15480b;
        }
        AbstractC9233X.m9807c(objM15480b);
        C13953j2 c13953j2 = C13953j2.f44007d;
        c14042n0.f44144Y = c14053t0;
        c14042n0.f44147p0 = 1;
        objM15480b = c14053t0.f44174o0.m15480b(c13953j2, c14042n0);
        if (objM15480b == enumC19250a) {
            return enumC19250a;
        }
        if (((Boolean) objM15480b).booleanValue()) {
            return Boolean.TRUE;
        }
        InterfaceC13849E interfaceC13849E = c14053t0.f44173Z;
        C13972o1 c13972o1 = C13972o1.f44030c;
        c14042n0.f44144Y = null;
        c14042n0.f44147p0 = 2;
        objM15480b = ((C14005w2) interfaceC13849E).m15482b(c13972o1, c14042n0);
        if (objM15480b == enumC19250a) {
            return enumC19250a;
        }
        return objM15480b;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009b  */
    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: a */
    public final Object mo1965a(InterfaceC18770c interfaceC18770c) {
        C14044O0 c14044o0;
        C14053T0 c14053t0;
        C2786R0 c2786r0;
        C3077j c3077j;
        C16961l c16961l;
        List list;
        Object next;
        if (interfaceC18770c instanceof C14044O0) {
            c14044o0 = (C14044O0) interfaceC18770c;
            int i10 = c14044o0.f44152p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c14044o0.f44152p0 = i10 - Integer.MIN_VALUE;
            } else {
                c14044o0 = new C14044O0(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c14044o0 = new C14044O0(this, (AbstractC19687c) interfaceC18770c);
        }
        Object objM15482b = c14044o0.f44150Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c14044o0.f44152p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                c14053t0 = c14044o0.f44149Y;
                AbstractC9233X.m9807c(objM15482b);
            } else if (i11 == 2) {
                c14053t0 = c14044o0.f44149Y;
                AbstractC9233X.m9807c(objM15482b);
                c2786r0 = (C2786R0) objM15482b;
                if (c2786r0 != null || (list = c2786r0.f8502a) == null) {
                    c3077j = null;
                } else {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!AbstractC8033Y5.m8383a((C3077j) next));
                    c3077j = (C3077j) next;
                }
                if (c3077j == null) {
                    c16961l = c14053t0.f44175p0;
                    c14044o0.f44149Y = null;
                    c14044o0.f44152p0 = 3;
                    if (c16961l.m18594e(c14044o0) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM15482b);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(objM15482b);
        c14044o0.f44149Y = this;
        c14044o0.f44152p0 = 1;
        objM15482b = ((C14005w2) this.f44173Z).m15482b(C13936f1.f43986c, c14044o0);
        if (objM15482b == enumC19250a) {
            return enumC19250a;
        }
        c14053t0 = this;
        if (((Boolean) objM15482b).booleanValue()) {
            C16961l c16961l2 = c14053t0.f44175p0;
            c14044o0.f44149Y = c14053t0;
            c14044o0.f44152p0 = 2;
            objM15482b = AbstractC2124C.m3221t(c16961l2.f54438Z.f64176f, c14044o0);
            if (objM15482b == enumC19250a) {
                return enumC19250a;
            }
            c2786r0 = (C2786R0) objM15482b;
            if (c2786r0 != null) {
                c3077j = null;
            } else {
                c3077j = null;
            }
            if (c3077j == null) {
                c16961l = c14053t0.f44175p0;
                c14044o0.f44149Y = null;
                c14044o0.f44152p0 = 3;
                if (c16961l.m18594e(c14044o0) == enumC19250a) {
                    return enumC19250a;
                }
            }
        }
        return c17296c;
    }

    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: b */
    public final C3516e mo1966b() {
        return AbstractC0593T.f1824a;
    }
}
