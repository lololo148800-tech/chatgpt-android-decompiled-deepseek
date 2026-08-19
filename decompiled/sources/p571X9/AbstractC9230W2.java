package p571X9;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.InterfaceC17302e;
import ne.C17601c;
import p025An.AbstractC0575H;
import p042Bf.C1269k;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p1135yn.C21555b;
import p269Kh.C4688o;
import p349O0.C6018n0;
import p349O0.C6021p;
import p427Rc.C6856m;
import p537W0.AbstractC8411c;
import p594Y9.AbstractC9973t4;
import p601Yh.C10064c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: X9.W2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9230W2 {
    /* JADX INFO: renamed from: a */
    public static final void m9801a(InterfaceC1426a onDismiss, C4688o c4688o, List list, InterfaceC1436k onModelSelect, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        AbstractC16544l.m18094g(onModelSelect, "onModelSelect");
        c6021p.m6526U(1588730691);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(onDismiss) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(c4688o) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(list) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(onModelSelect) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC9973t4.m10617b(onDismiss, null, AbstractC8411c.m8969c(121955340, c6021p, new C17601c(list, c4688o, onDismiss, onModelSelect, 1)), c6021p, (i11 & 14) | 384, 2);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(onDismiss, (Object) c4688o, (Object) list, (InterfaceC17302e) onModelSelect, i10, 25);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:46|22|(1:24)) */
    /* JADX WARN: Code duplicated, block: B:24:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
        r16 = r13;
        r13 = r0;
        r0 = r12;
        r12 = r1;
        r1 = r16;
        r17 = r9;
        r9 = r3;
        r3 = r14;
        r14 = r11;
        r10 = r17;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d2 -> B:36:0x00e0). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9802b(int i10, long j10, long j11, int i11, InterfaceC1436k interfaceC1436k, C10064c c10064c, AbstractC19687c abstractC19687c) throws Exception {
        C6856m c6856m;
        long j12;
        long j13;
        int i12;
        InterfaceC1436k interfaceC1436k2;
        InterfaceC1440o interfaceC1440o;
        int i13;
        C6856m c6856m2;
        Exception exc;
        int i14;
        int i15;
        C21555b c21555b;
        C21555b c21555b2;
        if (abstractC19687c instanceof C6856m) {
            c6856m = (C6856m) abstractC19687c;
            int i16 = c6856m.f22010v0;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                c6856m.f22010v0 = i16 - Integer.MIN_VALUE;
            } else {
                c6856m = new C6856m(abstractC19687c);
            }
        } else {
            c6856m = new C6856m(abstractC19687c);
        }
        Object objInvoke = c6856m.f22009u0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i17 = c6856m.f22010v0;
        if (i17 == 0) {
            AbstractC9233X.m9807c(objInvoke);
            j12 = j10;
            j13 = j11;
            i12 = i11;
            interfaceC1436k2 = interfaceC1436k;
            interfaceC1440o = c10064c;
            i13 = 0;
            c6856m2 = c6856m;
            exc = null;
            i14 = i10;
            if (i13 >= i14) {
                throw new IllegalStateException("Unreachable code");
            }
            Integer num = new Integer(i13);
            c6856m2.f22006r0 = interfaceC1436k2;
            c6856m2.f22007s0 = interfaceC1440o;
            c6856m2.f22008t0 = null;
            c6856m2.f22001Y = i14;
            c6856m2.f22004p0 = j13;
            c6856m2.f22002Z = i12;
            c6856m2.f22005q0 = j12;
            c6856m2.f22003o0 = i13;
            c6856m2.f22010v0 = 1;
            objInvoke = interfaceC1440o.invoke(num, exc, c6856m2);
            if (objInvoke == enumC19250a) {
                return enumC19250a;
            }
        } else if (i17 == 1) {
            int i18 = c6856m.f22003o0;
            j12 = c6856m.f22005q0;
            int i19 = c6856m.f22002Z;
            long j14 = c6856m.f22004p0;
            int i20 = c6856m.f22001Y;
            InterfaceC1440o interfaceC1440o2 = c6856m.f22007s0;
            InterfaceC1436k interfaceC1436k3 = c6856m.f22006r0;
            try {
                AbstractC9233X.m9807c(objInvoke);
            } catch (Exception e10) {
                Exception exc2 = e10;
                InterfaceC1440o interfaceC1440o3 = interfaceC1440o2;
                if (((Boolean) interfaceC1436k3.invoke(exc2)).booleanValue() || (i15 = i18 + 1) == i20) {
                    throw exc2;
                }
                c6856m.f22006r0 = interfaceC1436k3;
                c6856m.f22007s0 = interfaceC1440o3;
                c6856m.f22008t0 = exc2;
                c6856m.f22001Y = i20;
                c6856m.f22004p0 = j14;
                c6856m.f22002Z = i19;
                c6856m.f22005q0 = j12;
                c6856m.f22003o0 = i15;
                c6856m.f22010v0 = 2;
                if (AbstractC0575H.m1185n(j12, c6856m) == enumC19250a) {
                    return enumC19250a;
                }
                int i21 = i20;
                interfaceC1440o = interfaceC1440o3;
                exc = exc2;
                c6856m2 = c6856m;
                i14 = i21;
                InterfaceC1436k interfaceC1436k4 = interfaceC1436k3;
                i13 = i15;
                i12 = i19;
                j13 = j14;
                interfaceC1436k2 = interfaceC1436k4;
                c21555b = new C21555b(C21555b.m21840j(i12, j12));
                c21555b2 = new C21555b(j13);
                if (c21555b.compareTo(c21555b2) > 0) {
                    c21555b = c21555b2;
                }
                j12 = c21555b.f68263Y;
                if (i13 >= i14) {
                    throw new IllegalStateException("Unreachable code");
                }
                Integer num2 = new Integer(i13);
                c6856m2.f22006r0 = interfaceC1436k2;
                c6856m2.f22007s0 = interfaceC1440o;
                c6856m2.f22008t0 = null;
                c6856m2.f22001Y = i14;
                c6856m2.f22004p0 = j13;
                c6856m2.f22002Z = i12;
                c6856m2.f22005q0 = j12;
                c6856m2.f22003o0 = i13;
                c6856m2.f22010v0 = 1;
                objInvoke = interfaceC1440o.invoke(num2, exc, c6856m2);
                if (objInvoke == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i17 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i22 = c6856m.f22003o0;
            j12 = c6856m.f22005q0;
            int i23 = c6856m.f22002Z;
            long j15 = c6856m.f22004p0;
            int i24 = c6856m.f22001Y;
            Exception exc3 = c6856m.f22008t0;
            InterfaceC1440o interfaceC1440o4 = c6856m.f22007s0;
            InterfaceC1436k interfaceC1436k5 = c6856m.f22006r0;
            AbstractC9233X.m9807c(objInvoke);
            exc = exc3;
            c6856m2 = c6856m;
            i14 = i24;
            interfaceC1440o = interfaceC1440o4;
            i13 = i22;
            i12 = i23;
            j13 = j15;
            interfaceC1436k2 = interfaceC1436k5;
            c21555b = new C21555b(C21555b.m21840j(i12, j12));
            c21555b2 = new C21555b(j13);
            if (c21555b.compareTo(c21555b2) > 0) {
                c21555b = c21555b2;
            }
            j12 = c21555b.f68263Y;
            if (i13 >= i14) {
                throw new IllegalStateException("Unreachable code");
            }
            Integer num3 = new Integer(i13);
            c6856m2.f22006r0 = interfaceC1436k2;
            c6856m2.f22007s0 = interfaceC1440o;
            c6856m2.f22008t0 = null;
            c6856m2.f22001Y = i14;
            c6856m2.f22004p0 = j13;
            c6856m2.f22002Z = i12;
            c6856m2.f22005q0 = j12;
            c6856m2.f22003o0 = i13;
            c6856m2.f22010v0 = 1;
            objInvoke = interfaceC1440o.invoke(num3, exc, c6856m2);
            if (objInvoke == enumC19250a) {
                return enumC19250a;
            }
        }
        return objInvoke;
    }
}
