package p153Fn;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17312o;
import np.AbstractC17713e;
import p008A6.C0384d;
import p025An.AbstractC0563B;
import p025An.AbstractC0570E0;
import p025An.AbstractC0575H;
import p025An.AbstractC0607d0;
import p025An.C0582K0;
import p025An.C0589O;
import p025An.C0625m0;
import p025An.C0642v;
import p025An.C0644w;
import p025An.InterfaceC0567D;
import p025An.InterfaceC0568D0;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1113xn.AbstractC21329w;
import p251Jn.C4485a;
import p571X9.AbstractC9221V;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p975qp.InterfaceC18797a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Fn.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2923a {

    /* JADX INFO: renamed from: a */
    public static final C2942t f8760a = new C2942t("CLOSED", 0);

    /* JADX INFO: renamed from: b */
    public static final C2942t f8761b = new C2942t("UNDEFINED", 0);

    /* JADX INFO: renamed from: c */
    public static final C2942t f8762c = new C2942t("REUSABLE_CLAIMED", 0);

    /* JADX INFO: renamed from: d */
    public static final C2942t f8763d = new C2942t("NO_THREAD_ELEMENTS", 0);

    /* JADX INFO: renamed from: e */
    public static final C0384d f8764e = new C0384d(6);

    /* JADX INFO: renamed from: f */
    public static final C0384d f8765f = new C0384d(7);

    /* JADX INFO: renamed from: g */
    public static final C0384d f8766g = new C0384d(8);

    /* JADX INFO: renamed from: a */
    public static final void m3727a(InterfaceC1436k interfaceC1436k, Object obj, InterfaceC18776i interfaceC18776i) {
        C0644w c0644wM3728b = m3728b(interfaceC1436k, obj, null);
        if (c0644wM3728b != null) {
            AbstractC0575H.m1194w(interfaceC18776i, c0644wM3728b);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C0644w m3728b(InterfaceC1436k interfaceC1436k, Object obj, C0644w c0644w) {
        try {
            interfaceC1436k.invoke(obj);
        } catch (Throwable th2) {
            if (c0644w == null || c0644w.getCause() == th2) {
                return new C0644w(AbstractC10763a.m11051i(obj, "Exception in undelivered element handler for "), th2);
            }
            AbstractC9221V.m9789a(c0644w, th2);
        }
        return c0644w;
    }

    /* JADX INFO: renamed from: c */
    public static final void m3729c(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Expected positive parallelism level, but got ").toString());
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Object m3730d(AbstractC2940r abstractC2940r, long j10, InterfaceC1439n interfaceC1439n) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (abstractC2940r.f8804o0 >= j10 && !abstractC2940r.mo3745d()) {
                return abstractC2940r;
            }
            Object obj = AbstractC2924b.f8767Y.get(abstractC2940r);
            C2942t c2942t = f8760a;
            if (obj == c2942t) {
                return c2942t;
            }
            AbstractC2940r abstractC2940r2 = (AbstractC2940r) ((AbstractC2924b) obj);
            if (abstractC2940r2 == null) {
                abstractC2940r2 = (AbstractC2940r) interfaceC1439n.invoke(Long.valueOf(abstractC2940r.f8804o0 + 1), abstractC2940r);
                do {
                    atomicReferenceFieldUpdater = AbstractC2924b.f8767Y;
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC2940r, null, abstractC2940r2)) {
                        if (abstractC2940r.mo3745d()) {
                            abstractC2940r.m3746e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(abstractC2940r) == null);
            }
            abstractC2940r = abstractC2940r2;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC2940r m3731e(Object obj) {
        if (obj != f8760a) {
            return (AbstractC2940r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    /* JADX INFO: renamed from: f */
    public static final void m3732f(InterfaceC18776i interfaceC18776i, Throwable th2) {
        Throwable runtimeException;
        Iterator it = AbstractC2926d.f8770a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0567D) it.next()).handleException(interfaceC18776i, th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    AbstractC9221V.m9789a(runtimeException, th2);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            AbstractC9221V.m9789a(th2, new C2927e(interfaceC18776i));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m3733g(Object obj) {
        return obj == f8760a;
    }

    /* JADX INFO: renamed from: h */
    public static final Object m3734h(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static final void m3735i(InterfaceC18776i interfaceC18776i, Object obj) {
        if (obj == f8763d) {
            return;
        }
        if (!(obj instanceof C2945w)) {
            Object objFold = interfaceC18776i.fold(null, f8765f);
            AbstractC16544l.m18092e(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            C4485a.m5212V0((Map) obj);
            return;
        }
        C2945w c2945w = (C2945w) obj;
        InterfaceC0568D0[] interfaceC0568D0Arr = c2945w.f8813c;
        int length = interfaceC0568D0Arr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            AbstractC16544l.m18091d(interfaceC0568D0Arr[length]);
            C4485a.m5212V0((Map) c2945w.f8812b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m3736j(Object obj, InterfaceC18770c interfaceC18770c) {
        if (!(interfaceC18770c instanceof C2928f)) {
            interfaceC18770c.resumeWith(obj);
            return;
        }
        C2928f c2928f = (C2928f) interfaceC18770c;
        Throwable thM18979a = C17312o.m18979a(obj);
        Object c0642v = thM18979a == null ? obj : new C0642v(thM18979a, false);
        AbstractC0563B abstractC0563B = c2928f.f8773p0;
        AbstractC19687c abstractC19687c = c2928f.f8774q0;
        if (m3738l(abstractC0563B, abstractC19687c.getContext())) {
            c2928f.f8775r0 = c0642v;
            c2928f.f1822o0 = 1;
            m3737k(abstractC0563B, abstractC19687c.getContext(), c2928f);
            return;
        }
        AbstractC0607d0 abstractC0607d0M1147a = AbstractC0570E0.m1147a();
        if (abstractC0607d0M1147a.m1241d1()) {
            c2928f.f8775r0 = c0642v;
            c2928f.f1822o0 = 1;
            abstractC0607d0M1147a.m1239a1(c2928f);
            return;
        }
        abstractC0607d0M1147a.m1240c1(true);
        try {
            InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) abstractC19687c.getContext().get(C0625m0.f1875Y);
            if (interfaceC0627n0 == null || interfaceC0627n0.mo1274a()) {
                Object obj2 = c2928f.f8776s0;
                InterfaceC18776i context = abstractC19687c.getContext();
                Object objM3742p = m3742p(context, obj2);
                C0582K0 c0582k0M1167O = objM3742p != f8763d ? AbstractC0575H.m1167O(abstractC19687c, context, objM3742p) : null;
                try {
                    abstractC19687c.resumeWith(obj);
                    if (c0582k0M1167O == null || c0582k0M1167O.m1207l0()) {
                        m3735i(context, objM3742p);
                    }
                } catch (Throwable th2) {
                    if (c0582k0M1167O == null || c0582k0M1167O.m1207l0()) {
                        m3735i(context, objM3742p);
                    }
                    throw th2;
                }
            } else {
                c2928f.resumeWith(AbstractC9233X.m9806b(interfaceC0627n0.mo1273T()));
            }
            while (abstractC0607d0M1147a.m1242f1()) {
            }
        } catch (Throwable th3) {
            try {
                c2928f.m1218g(th3);
            } finally {
                abstractC0607d0M1147a.m1238Z0(true);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m3737k(AbstractC0563B abstractC0563B, InterfaceC18776i interfaceC18776i, Runnable runnable) {
        try {
            abstractC0563B.mo872V0(interfaceC18776i, runnable);
        } catch (Throwable th2) {
            throw new C0589O(th2, abstractC0563B, interfaceC18776i);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m3738l(AbstractC0563B abstractC0563B, InterfaceC18776i interfaceC18776i) throws C0589O {
        try {
            return abstractC0563B.mo1143X0(interfaceC18776i);
        } catch (Throwable th2) {
            throw new C0589O(th2, abstractC0563B, interfaceC18776i);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final long m3739m(String str, long j10, long j11, long j12) {
        String property;
        int i10 = AbstractC2943u.f8808a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j10;
        }
        Long lM21738y = AbstractC21329w.m21738y(property);
        if (lM21738y == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM21738y.longValue();
        if (j11 <= jLongValue && jLongValue <= j12) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX INFO: renamed from: n */
    public static int m3740n(String str, int i10, int i11, int i12, int i13) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return (int) m3739m(str, i10, i11, i12);
    }

    /* JADX INFO: renamed from: o */
    public static final Object m3741o(InterfaceC18776i interfaceC18776i) {
        Object objFold = interfaceC18776i.fold(0, f8764e);
        AbstractC16544l.m18091d(objFold);
        return objFold;
    }

    /* JADX INFO: renamed from: p */
    public static final Object m3742p(InterfaceC18776i interfaceC18776i, Object obj) {
        if (obj == null) {
            obj = m3741o(interfaceC18776i);
        }
        if (obj == 0) {
            return f8763d;
        }
        if (obj instanceof Integer) {
            return interfaceC18776i.fold(new C2945w(((Number) obj).intValue(), interfaceC18776i), f8766g);
        }
        C4485a c4485a = (C4485a) ((InterfaceC0568D0) obj);
        InterfaceC18797a interfaceC18797a = AbstractC17713e.f56550a;
        if (interfaceC18797a == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        Map mapMo16558n = interfaceC18797a.mo16558n();
        C4485a.m5212V0(c4485a.f14637Y);
        return mapMo16558n;
    }
}
