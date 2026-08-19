package p103Dn;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.C0616i;
import p025An.C0624m;
import p025An.C0625m0;
import p025An.C0644w;
import p025An.InterfaceC0627n0;
import p077Cn.EnumC1733a;
import p129En.AbstractC2591b;
import p129En.AbstractC2592c;
import p129En.AbstractC2593d;
import p129En.InterfaceC2614y;
import p153Fn.C2942t;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Dn.D0 */
/* JADX INFO: loaded from: classes2.dex */
public class C2127D0 extends AbstractC2591b implements InterfaceC2211v0, InterfaceC2184i, InterfaceC2614y {

    /* JADX INFO: renamed from: q0 */
    public final int f6509q0;

    /* JADX INFO: renamed from: r0 */
    public final int f6510r0;

    /* JADX INFO: renamed from: s0 */
    public final EnumC1733a f6511s0;

    /* JADX INFO: renamed from: t0 */
    public Object[] f6512t0;

    /* JADX INFO: renamed from: u0 */
    public long f6513u0;

    /* JADX INFO: renamed from: v0 */
    public long f6514v0;

    /* JADX INFO: renamed from: w0 */
    public int f6515w0;

    /* JADX INFO: renamed from: x0 */
    public int f6516x0;

    public C2127D0(int i10, int i11, EnumC1733a enumC1733a) {
        this.f6509q0 = i10;
        this.f6510r0 = i11;
        this.f6511s0 = enumC1733a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public static void m3228m(C2127D0 c2127d0, InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) throws Throwable {
        C2125C0 c2125c0;
        C2127D0 c2127d1;
        Throwable th2;
        C2129E0 c2129e0;
        InterfaceC2186j interfaceC2186j2;
        InterfaceC0627n0 interfaceC0627n0;
        if (interfaceC18770c instanceof C2125C0) {
            c2125c0 = (C2125C0) interfaceC18770c;
            int i10 = c2125c0.f6505s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2125c0.f6505s0 = i10 - Integer.MIN_VALUE;
            } else {
                c2125c0 = new C2125C0(c2127d0, interfaceC18770c);
            }
        } else {
            c2125c0 = new C2125C0(c2127d0, interfaceC18770c);
        }
        Object obj = c2125c0.f6503q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c2125c0.f6505s0;
        if (i11 != 0) {
            if (i11 == 1) {
                c2129e0 = c2125c0.f6501o0;
                InterfaceC2186j interfaceC2186j3 = c2125c0.f6500Z;
                C2127D0 c2127d2 = c2125c0.f6499Y;
                try {
                    AbstractC9233X.m9807c(obj);
                    interfaceC2186j2 = interfaceC2186j3;
                    c2127d0 = c2127d2;
                    try {
                        interfaceC0627n0 = (InterfaceC0627n0) c2125c0.getContext().get(C0625m0.f1875Y);
                    } catch (Throwable th3) {
                        c2127d1 = c2127d0;
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    c2127d1 = c2127d2;
                }
            } else {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC0627n0 interfaceC0627n1 = c2125c0.f6502p0;
                c2129e0 = c2125c0.f6501o0;
                InterfaceC2186j interfaceC2186j4 = c2125c0.f6500Z;
                c2127d1 = c2125c0.f6499Y;
                try {
                    AbstractC9233X.m9807c(obj);
                    interfaceC2186j2 = interfaceC2186j4;
                    interfaceC0627n0 = interfaceC0627n1;
                    c2127d0 = c2127d1;
                } catch (Throwable th5) {
                    th2 = th5;
                }
            }
            c2127d1.m3612j(c2129e0);
            throw th2;
        }
        AbstractC9233X.m9807c(obj);
        C2129E0 c2129e1 = (C2129E0) c2127d0.m3610c();
        try {
            if (interfaceC2186j instanceof C2158T0) {
                c2125c0.f6499Y = c2127d0;
                c2125c0.f6500Z = interfaceC2186j;
                c2125c0.f6501o0 = c2129e1;
                c2125c0.f6505s0 = 1;
                if (((C2158T0) interfaceC2186j).m3252b(c2125c0) == enumC19250a) {
                    return;
                }
            }
            interfaceC2186j2 = interfaceC2186j;
            c2129e0 = c2129e1;
            interfaceC0627n0 = (InterfaceC0627n0) c2125c0.getContext().get(C0625m0.f1875Y);
        } catch (Throwable th6) {
            c2127d1 = c2127d0;
            th2 = th6;
            c2129e0 = c2129e1;
        }
        while (true) {
            Object objM3243u = c2127d0.m3243u(c2129e0);
            if (objM3243u == AbstractC2124C.f6496c) {
                c2125c0.f6499Y = c2127d0;
                c2125c0.f6500Z = interfaceC2186j2;
                c2125c0.f6501o0 = c2129e0;
                c2125c0.f6502p0 = interfaceC0627n0;
                c2125c0.f6505s0 = 2;
                if (c2127d0.m3234k(c2129e0, c2125c0) == enumC19250a) {
                    return;
                }
            } else {
                if (interfaceC0627n0 != null && !interfaceC0627n0.mo1274a()) {
                    throw interfaceC0627n0.mo1273T();
                }
                c2125c0.f6499Y = c2127d0;
                c2125c0.f6500Z = interfaceC2186j2;
                c2125c0.f6501o0 = c2129e0;
                c2125c0.f6502p0 = interfaceC0627n0;
                c2125c0.f6505s0 = 3;
                if (interfaceC2186j2.mo395a(objM3243u, c2125c0) == enumC19250a) {
                    return;
                }
            }
        }
    }

    @Override // p103Dn.InterfaceC2211v0, p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        InterfaceC18770c[] interfaceC18770cArrM3238p;
        C2123B0 c2123b0;
        if (mo3231f(obj)) {
            return C17296C.f55119a;
        }
        C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(interfaceC18770c));
        c0624m.m1262r();
        InterfaceC18770c[] interfaceC18770cArrM3238p2 = AbstractC2592c.f8036a;
        synchronized (this) {
            try {
                if (m3241s(obj)) {
                    c0624m.resumeWith(C17296C.f55119a);
                    interfaceC18770cArrM3238p = m3238p(interfaceC18770cArrM3238p2);
                    c2123b0 = null;
                } else {
                    C2123B0 c2123b1 = new C2123B0(this, ((long) (this.f6515w0 + this.f6516x0)) + m3239q(), obj, c0624m);
                    m3237o(c2123b1);
                    this.f6516x0++;
                    if (this.f6510r0 == 0) {
                        interfaceC18770cArrM3238p2 = m3238p(interfaceC18770cArrM3238p2);
                    }
                    interfaceC18770cArrM3238p = interfaceC18770cArrM3238p2;
                    c2123b0 = c2123b1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c2123b0 != null) {
            c0624m.m1265v(new C0616i(c2123b0, 2));
        }
        for (InterfaceC18770c interfaceC18770c2 : interfaceC18770cArrM3238p) {
            if (interfaceC18770c2 != null) {
                interfaceC18770c2.resumeWith(C17296C.f55119a);
            }
        }
        Object objM1261q = c0624m.m1261q();
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        if (objM1261q != enumC19250a) {
            objM1261q = C17296C.f55119a;
        }
        return objM1261q == enumC19250a ? objM1261q : C17296C.f55119a;
    }

    @Override // p129En.InterfaceC2614y
    /* JADX INFO: renamed from: b */
    public final InterfaceC2184i mo3229b(InterfaceC18776i interfaceC18776i, int i10, EnumC1733a enumC1733a) {
        return AbstractC2124C.m3225x(this, interfaceC18776i, i10, enumC1733a);
    }

    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) throws Throwable {
        m3228m(this, interfaceC2186j, interfaceC18770c);
        return EnumC19250a.f61036Y;
    }

    @Override // p103Dn.InterfaceC2211v0
    /* JADX INFO: renamed from: e */
    public final void mo3230e() {
        synchronized (this) {
            m3244v(m3239q() + ((long) this.f6515w0), this.f6514v0, m3239q() + ((long) this.f6515w0), m3239q() + ((long) this.f6515w0) + ((long) this.f6516x0));
        }
    }

    @Override // p103Dn.InterfaceC2211v0
    /* JADX INFO: renamed from: f */
    public final boolean mo3231f(Object obj) {
        int i10;
        boolean z6;
        InterfaceC18770c[] interfaceC18770cArrM3238p = AbstractC2592c.f8036a;
        synchronized (this) {
            if (m3241s(obj)) {
                interfaceC18770cArrM3238p = m3238p(interfaceC18770cArrM3238p);
                z6 = true;
            } else {
                z6 = false;
            }
        }
        for (InterfaceC18770c interfaceC18770c : interfaceC18770cArrM3238p) {
            if (interfaceC18770c != null) {
                interfaceC18770c.resumeWith(C17296C.f55119a);
            }
        }
        return z6;
    }

    @Override // p129En.AbstractC2591b
    /* JADX INFO: renamed from: g */
    public final AbstractC2593d mo3232g() {
        C2129E0 c2129e0 = new C2129E0();
        c2129e0.f6522a = -1L;
        return c2129e0;
    }

    @Override // p129En.AbstractC2591b
    /* JADX INFO: renamed from: h */
    public final AbstractC2593d[] mo3233h() {
        return new C2129E0[2];
    }

    /* JADX INFO: renamed from: k */
    public final Object m3234k(C2129E0 c2129e0, C2125C0 c2125c0) {
        C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(c2125c0));
        c0624m.m1262r();
        synchronized (this) {
            if (m3242t(c2129e0) < 0) {
                c2129e0.f6523b = c0624m;
            } else {
                c0624m.resumeWith(C17296C.f55119a);
            }
        }
        Object objM1261q = c0624m.m1261q();
        return objM1261q == EnumC19250a.f61036Y ? objM1261q : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: l */
    public final void m3235l() {
        if (this.f6510r0 != 0 || this.f6516x0 > 1) {
            Object[] objArr = this.f6512t0;
            AbstractC16544l.m18091d(objArr);
            while (this.f6516x0 > 0) {
                long jM3239q = m3239q();
                int i10 = this.f6515w0;
                int i11 = this.f6516x0;
                if (objArr[((int) ((jM3239q + ((long) (i10 + i11))) - 1)) & (objArr.length - 1)] != AbstractC2124C.f6496c) {
                    return;
                }
                this.f6516x0 = i11 - 1;
                AbstractC2124C.m3207f(objArr, m3239q() + ((long) (this.f6515w0 + this.f6516x0)), null);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m3236n() {
        AbstractC2593d[] abstractC2593dArr;
        Object[] objArr = this.f6512t0;
        AbstractC16544l.m18091d(objArr);
        AbstractC2124C.m3207f(objArr, m3239q(), null);
        this.f6515w0--;
        long jM3239q = m3239q() + 1;
        if (this.f6513u0 < jM3239q) {
            this.f6513u0 = jM3239q;
        }
        if (this.f6514v0 < jM3239q) {
            if (this.f8033Z != 0 && (abstractC2593dArr = this.f8032Y) != null) {
                for (AbstractC2593d abstractC2593d : abstractC2593dArr) {
                    if (abstractC2593d != null) {
                        C2129E0 c2129e0 = (C2129E0) abstractC2593d;
                        long j10 = c2129e0.f6522a;
                        if (j10 >= 0 && j10 < jM3239q) {
                            c2129e0.f6522a = jM3239q;
                        }
                    }
                }
            }
            this.f6514v0 = jM3239q;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m3237o(Object obj) {
        int i10 = this.f6515w0 + this.f6516x0;
        Object[] objArrM3240r = this.f6512t0;
        if (objArrM3240r == null) {
            objArrM3240r = m3240r(null, 0, 2);
        } else if (i10 >= objArrM3240r.length) {
            objArrM3240r = m3240r(objArrM3240r, i10, objArrM3240r.length * 2);
        }
        AbstractC2124C.m3207f(objArrM3240r, m3239q() + ((long) i10), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [qm.c[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX INFO: renamed from: p */
    public final InterfaceC18770c[] m3238p(InterfaceC18770c[] interfaceC18770cArr) {
        AbstractC2593d[] abstractC2593dArr;
        C2129E0 c2129e0;
        C0624m c0624m;
        int length = interfaceC18770cArr.length;
        if (this.f8033Z != 0 && (abstractC2593dArr = this.f8032Y) != null) {
            int length2 = abstractC2593dArr.length;
            int i10 = 0;
            while (i10 < length2) {
                AbstractC2593d abstractC2593d = abstractC2593dArr[i10];
                if (abstractC2593d == null || (c0624m = (c2129e0 = (C2129E0) abstractC2593d).f6523b) == null || m3242t(c2129e0) < 0) {
                    interfaceC18770cArr = interfaceC18770cArr;
                } else {
                    if (length >= interfaceC18770cArr.length) {
                        interfaceC18770cArr = interfaceC18770cArr;
                        interfaceC18770cArr = interfaceC18770cArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) interfaceC18770cArr, Math.max(2, interfaceC18770cArr.length * 2));
                        AbstractC16544l.m18093f(objArrCopyOf, "copyOf(...)");
                        interfaceC18770cArr = objArrCopyOf;
                    }
                    interfaceC18770cArr = interfaceC18770cArr;
                    interfaceC18770cArr = interfaceC18770cArr;
                    ((InterfaceC18770c[]) interfaceC18770cArr)[length] = c0624m;
                    c2129e0.f6523b = null;
                    length++;
                }
                i10++;
                interfaceC18770cArr = interfaceC18770cArr;
            }
            interfaceC18770cArr = interfaceC18770cArr;
        }
        return (InterfaceC18770c[]) interfaceC18770cArr;
    }

    /* JADX INFO: renamed from: q */
    public final long m3239q() {
        return Math.min(this.f6514v0, this.f6513u0);
    }

    /* JADX INFO: renamed from: r */
    public final Object[] m3240r(Object[] objArr, int i10, int i11) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.f6512t0 = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jM3239q = m3239q();
        for (int i12 = 0; i12 < i10; i12++) {
            long j10 = ((long) i12) + jM3239q;
            AbstractC2124C.m3207f(objArr2, j10, objArr[((int) j10) & (objArr.length - 1)]);
        }
        return objArr2;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m3241s(Object obj) {
        int i10 = this.f8033Z;
        int i11 = this.f6509q0;
        if (i10 == 0) {
            if (i11 != 0) {
                m3237o(obj);
                int i12 = this.f6515w0 + 1;
                this.f6515w0 = i12;
                if (i12 > i11) {
                    m3236n();
                }
                this.f6514v0 = m3239q() + ((long) this.f6515w0);
            }
            return true;
        }
        int i13 = this.f6515w0;
        int i14 = this.f6510r0;
        if (i13 >= i14 && this.f6514v0 <= this.f6513u0) {
            int iOrdinal = this.f6511s0.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return true;
                }
                throw new C0644w();
            }
        }
        m3237o(obj);
        int i15 = this.f6515w0 + 1;
        this.f6515w0 = i15;
        if (i15 > i14) {
            m3236n();
        }
        long jM3239q = m3239q() + ((long) this.f6515w0);
        long j10 = this.f6513u0;
        if (((int) (jM3239q - j10)) > i11) {
            m3244v(j10 + 1, this.f6514v0, m3239q() + ((long) this.f6515w0), m3239q() + ((long) this.f6515w0) + ((long) this.f6516x0));
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final long m3242t(C2129E0 c2129e0) {
        long j10 = c2129e0.f6522a;
        if (j10 < m3239q() + ((long) this.f6515w0)) {
            return j10;
        }
        if (this.f6510r0 <= 0 && j10 <= m3239q() && this.f6516x0 != 0) {
            return j10;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: u */
    public final Object m3243u(C2129E0 c2129e0) {
        Object obj;
        InterfaceC18770c[] interfaceC18770cArrM3245w = AbstractC2592c.f8036a;
        synchronized (this) {
            try {
                long jM3242t = m3242t(c2129e0);
                if (jM3242t < 0) {
                    obj = AbstractC2124C.f6496c;
                } else {
                    long j10 = c2129e0.f6522a;
                    Object[] objArr = this.f6512t0;
                    AbstractC16544l.m18091d(objArr);
                    Object obj2 = objArr[((int) jM3242t) & (objArr.length - 1)];
                    if (obj2 instanceof C2123B0) {
                        obj2 = ((C2123B0) obj2).f6492o0;
                    }
                    c2129e0.f6522a = jM3242t + 1;
                    Object obj3 = obj2;
                    interfaceC18770cArrM3245w = m3245w(j10);
                    obj = obj3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (InterfaceC18770c interfaceC18770c : interfaceC18770cArrM3245w) {
            if (interfaceC18770c != null) {
                interfaceC18770c.resumeWith(C17296C.f55119a);
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: v */
    public final void m3244v(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jM3239q = m3239q(); jM3239q < jMin; jM3239q++) {
            Object[] objArr = this.f6512t0;
            AbstractC16544l.m18091d(objArr);
            AbstractC2124C.m3207f(objArr, jM3239q, null);
        }
        this.f6513u0 = j10;
        this.f6514v0 = j11;
        this.f6515w0 = (int) (j12 - jMin);
        this.f6516x0 = (int) (j13 - j12);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00be  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    public final InterfaceC18770c[] m3245w(long j10) {
        long j11;
        long j12;
        InterfaceC18770c[] interfaceC18770cArr;
        long j13;
        long jMax;
        Object[] objArr;
        long j14;
        AbstractC2593d[] abstractC2593dArr;
        long j15 = this.f6514v0;
        InterfaceC18770c[] interfaceC18770cArr2 = AbstractC2592c.f8036a;
        if (j10 > j15) {
            return interfaceC18770cArr2;
        }
        long jM3239q = m3239q();
        long j16 = ((long) this.f6515w0) + jM3239q;
        int i10 = this.f6510r0;
        if (i10 == 0 && this.f6516x0 > 0) {
            j16++;
        }
        if (this.f8033Z != 0 && (abstractC2593dArr = this.f8032Y) != null) {
            for (AbstractC2593d abstractC2593d : abstractC2593dArr) {
                if (abstractC2593d != null) {
                    long j17 = ((C2129E0) abstractC2593d).f6522a;
                    if (j17 >= 0 && j17 < j16) {
                        j16 = j17;
                    }
                }
            }
        }
        if (j16 <= this.f6514v0) {
            return interfaceC18770cArr2;
        }
        long jM3239q2 = m3239q() + ((long) this.f6515w0);
        int iMin = this.f8033Z > 0 ? Math.min(this.f6516x0, i10 - ((int) (jM3239q2 - j16))) : this.f6516x0;
        long j18 = ((long) this.f6516x0) + jM3239q2;
        C2942t c2942t = AbstractC2124C.f6496c;
        if (iMin > 0) {
            interfaceC18770cArr2 = new InterfaceC18770c[iMin];
            Object[] objArr2 = this.f6512t0;
            AbstractC16544l.m18091d(objArr2);
            j11 = j16;
            long j19 = jM3239q2;
            long j20 = j19;
            int i11 = 0;
            while (true) {
                if (j20 >= j18) {
                    j12 = j18;
                    interfaceC18770cArr = interfaceC18770cArr2;
                    jM3239q2 = j19;
                    break;
                }
                j12 = j18;
                Object obj = objArr2[((int) j20) & (objArr2.length - 1)];
                if (obj != c2942t) {
                    AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    C2123B0 c2123b0 = (C2123B0) obj;
                    int i12 = i11 + 1;
                    interfaceC18770cArr2[i11] = c2123b0.f6493p0;
                    AbstractC2124C.m3207f(objArr2, j20, c2942t);
                    AbstractC2124C.m3207f(objArr2, j19, c2123b0.f6492o0);
                    j14 = 1;
                    jM3239q2 = j19 + 1;
                    if (i12 < iMin) {
                        j19 = jM3239q2;
                        i11 = i12;
                    }
                } else {
                    j14 = 1;
                }
                j20 += j14;
                j18 = j12;
            }
            int i13 = (int) (jM3239q2 - jM3239q);
            if (this.f8033Z == 0) {
                j13 = jM3239q2;
            } else {
                j13 = j11;
            }
            jMax = Math.max(this.f6513u0, jM3239q2 - ((long) Math.min(this.f6509q0, i13)));
            if (i10 == 0 && jMax < j12) {
                objArr = this.f6512t0;
                AbstractC16544l.m18091d(objArr);
                if (AbstractC16544l.m18089b(objArr[((int) jMax) & (objArr.length - 1)], c2942t)) {
                    jM3239q2++;
                    jMax++;
                }
            }
            m3244v(jMax, j13, jM3239q2, j12);
            m3235l();
            if (interfaceC18770cArr.length == 0) {
                return interfaceC18770cArr;
            }
            return m3238p(interfaceC18770cArr);
        }
        j11 = j16;
        j12 = j18;
        interfaceC18770cArr = interfaceC18770cArr2;
        int i14 = (int) (jM3239q2 - jM3239q);
        if (this.f8033Z == 0) {
            j13 = jM3239q2;
        } else {
            j13 = j11;
        }
        jMax = Math.max(this.f6513u0, jM3239q2 - ((long) Math.min(this.f6509q0, i14)));
        if (i10 == 0) {
            objArr = this.f6512t0;
            AbstractC16544l.m18091d(objArr);
            if (AbstractC16544l.m18089b(objArr[((int) jMax) & (objArr.length - 1)], c2942t)) {
                jM3239q2++;
                jMax++;
            }
        }
        m3244v(jMax, j13, jM3239q2, j12);
        m3235l();
        if (interfaceC18770cArr.length == 0) {
            return interfaceC18770cArr;
        }
        return m3238p(interfaceC18770cArr);
    }
}
