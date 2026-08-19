package p025An;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import mm.C17312o;
import p003A1.C0292u;
import p008A6.C0384d;
import p049Bm.InterfaceC1439n;
import p050Bn.C1451e;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p153Fn.AbstractC2923a;
import p153Fn.C2925c;
import p153Fn.C2928f;
import p153Fn.C2939q;
import p153Fn.C2942t;
import p201Hn.C3516e;
import p523V9.AbstractC8048a6;
import p523V9.AbstractC8056b6;
import p523V9.AbstractC8128k6;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9221V;
import p571X9.AbstractC9233X;
import p909nm.C17677k;
import p909nm.C17689w;
import p972qm.C18771d;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18772e;
import p972qm.InterfaceC18774g;
import p972qm.InterfaceC18775h;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19685a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19688d;

/* JADX INFO: renamed from: An.H */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0575H {

    /* JADX INFO: renamed from: a */
    public static final C2942t f1796a = new C2942t("RESUME_TOKEN", 0);

    /* JADX INFO: renamed from: b */
    public static final C2942t f1797b = new C2942t("REMOVED_TASK", 0);

    /* JADX INFO: renamed from: c */
    public static final C2942t f1798c = new C2942t("CLOSED_EMPTY", 0);

    /* JADX INFO: renamed from: d */
    public static final C2942t f1799d = new C2942t("COMPLETING_ALREADY", 0);

    /* JADX INFO: renamed from: e */
    public static final C2942t f1800e = new C2942t("COMPLETING_WAITING_CHILDREN", 0);

    /* JADX INFO: renamed from: f */
    public static final C2942t f1801f = new C2942t("COMPLETING_RETRY", 0);

    /* JADX INFO: renamed from: g */
    public static final C2942t f1802g = new C2942t("TOO_LATE_TO_CANCEL", 0);

    /* JADX INFO: renamed from: h */
    public static final C2942t f1803h = new C2942t("SEALED", 0);

    /* JADX INFO: renamed from: i */
    public static final C0597X f1804i = new C0597X(false);

    /* JADX INFO: renamed from: j */
    public static final C0597X f1805j = new C0597X(true);

    /* JADX INFO: renamed from: A */
    public static final boolean m1153A(int i10) {
        return i10 == 1 || i10 == 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: B */
    public static final Object m1154B(Collection collection, AbstractC19687c abstractC19687c) {
        C0610f c0610f;
        Iterator it;
        if (abstractC19687c instanceof C0610f) {
            c0610f = (C0610f) abstractC19687c;
            int i10 = c0610f.f1854o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0610f.f1854o0 = i10 - Integer.MIN_VALUE;
            } else {
                c0610f = new C0610f(abstractC19687c);
            }
        } else {
            c0610f = new C0610f(abstractC19687c);
        }
        Object obj = c0610f.f1853Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c0610f.f1854o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            it = collection.iterator();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c0610f.f1852Y;
            AbstractC9233X.m9807c(obj);
        }
        while (it.hasNext()) {
            InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) it.next();
            c0610f.f1852Y = it;
            c0610f.f1854o0 = 1;
            if (interfaceC0627n0.mo1272P(c0610f) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: C */
    public static final C0564B0 m1155C(InterfaceC0571F interfaceC0571F, InterfaceC18776i interfaceC18776i, EnumC0573G enumC0573G, InterfaceC1439n interfaceC1439n) {
        InterfaceC18776i interfaceC18776iM1157E = m1157E(interfaceC0571F, interfaceC18776i);
        enumC0573G.getClass();
        C0564B0 c0643v0 = enumC0573G == EnumC0573G.f1791Z ? new C0643v0(interfaceC18776iM1157E, interfaceC1439n) : new C0564B0(interfaceC18776iM1157E, true, true);
        c0643v0.m1226i0(enumC0573G, c0643v0, interfaceC1439n);
        return c0643v0;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ C0564B0 m1156D(InterfaceC0571F interfaceC0571F, InterfaceC18776i interfaceC18776i, EnumC0573G enumC0573G, InterfaceC1439n interfaceC1439n, int i10) {
        if ((i10 & 1) != 0) {
            interfaceC18776i = C18777j.f59682Y;
        }
        if ((i10 & 2) != 0) {
            enumC0573G = EnumC0573G.f1790Y;
        }
        return m1155C(interfaceC0571F, interfaceC18776i, enumC0573G, interfaceC1439n);
    }

    /* JADX INFO: renamed from: E */
    public static final InterfaceC18776i m1157E(InterfaceC0571F interfaceC0571F, InterfaceC18776i interfaceC18776i) {
        InterfaceC18776i interfaceC18776iM1188q = m1188q(interfaceC0571F.getCoroutineContext(), interfaceC18776i, true);
        C3516e c3516e = AbstractC0593T.f1824a;
        return (interfaceC18776iM1188q == c3516e || interfaceC18776iM1188q.get(C18771d.f59681Y) != null) ? interfaceC18776iM1188q : interfaceC18776iM1188q.plus(c3516e);
    }

    /* JADX INFO: renamed from: F */
    public static final C2925c m1158F(InterfaceC0571F interfaceC0571F, InterfaceC18774g interfaceC18774g) {
        return new C2925c(interfaceC0571F.getCoroutineContext().plus(interfaceC18774g));
    }

    /* JADX INFO: renamed from: G */
    public static final Object m1159G(Object obj) {
        return obj instanceof C0642v ? AbstractC9233X.m9806b(((C0642v) obj).f1900a) : obj;
    }

    /* JADX INFO: renamed from: H */
    public static final void m1160H(C0624m c0624m, InterfaceC18770c interfaceC18770c, boolean z6) {
        Object obj = C0624m.f1871s0.get(c0624m);
        Throwable thMo1216e = c0624m.mo1216e(obj);
        Object objM9806b = thMo1216e != null ? AbstractC9233X.m9806b(thMo1216e) : c0624m.mo1217f(obj);
        if (!z6) {
            interfaceC18770c.resumeWith(objM9806b);
            return;
        }
        AbstractC16544l.m18092e(interfaceC18770c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C2928f c2928f = (C2928f) interfaceC18770c;
        AbstractC19687c abstractC19687c = c2928f.f8774q0;
        InterfaceC18776i context = abstractC19687c.getContext();
        Object objM3742p = AbstractC2923a.m3742p(context, c2928f.f8776s0);
        C0582K0 c0582k0M1167O = objM3742p != AbstractC2923a.f8763d ? m1167O(abstractC19687c, context, objM3742p) : null;
        try {
            abstractC19687c.resumeWith(objM9806b);
        } finally {
            if (c0582k0M1167O == null || c0582k0M1167O.m1207l0()) {
                AbstractC2923a.m3735i(context, objM3742p);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public static final Object m1161I(InterfaceC18776i interfaceC18776i, InterfaceC1439n interfaceC1439n) throws Throwable {
        AbstractC0607d0 abstractC0607d0M1147a;
        InterfaceC18776i interfaceC18776iM1188q;
        Thread threadCurrentThread = Thread.currentThread();
        InterfaceC18775h interfaceC18775h = C18771d.f59681Y;
        InterfaceC18772e interfaceC18772e = (InterfaceC18772e) interfaceC18776i.get(interfaceC18775h);
        C18777j c18777j = C18777j.f59682Y;
        if (interfaceC18772e == null) {
            abstractC0607d0M1147a = AbstractC0570E0.m1147a();
            interfaceC18776iM1188q = m1188q(c18777j, interfaceC18776i.plus(abstractC0607d0M1147a), true);
            C3516e c3516e = AbstractC0593T.f1824a;
            if (interfaceC18776iM1188q != c3516e && interfaceC18776iM1188q.get(interfaceC18775h) == null) {
                interfaceC18776iM1188q = interfaceC18776iM1188q.plus(c3516e);
            }
        } else {
            if (interfaceC18772e instanceof AbstractC0607d0) {
            }
            abstractC0607d0M1147a = (AbstractC0607d0) AbstractC0570E0.f1786a.get();
            interfaceC18776iM1188q = m1188q(c18777j, interfaceC18776i, true);
            C3516e c3516e2 = AbstractC0593T.f1824a;
            if (interfaceC18776iM1188q != c3516e2 && interfaceC18776iM1188q.get(interfaceC18775h) == null) {
                interfaceC18776iM1188q = interfaceC18776iM1188q.plus(c3516e2);
            }
        }
        C0612g c0612g = new C0612g(interfaceC18776iM1188q, threadCurrentThread, abstractC0607d0M1147a);
        c0612g.m1226i0(EnumC0573G.f1790Y, c0612g, interfaceC1439n);
        AbstractC0607d0 abstractC0607d0 = c0612g.f1857q0;
        if (abstractC0607d0 != null) {
            int i10 = AbstractC0607d0.f1846q0;
            abstractC0607d0.m1240c1(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jMo1231e1 = abstractC0607d0 != null ? abstractC0607d0.mo1231e1() : Long.MAX_VALUE;
                if (c0612g.m1296M()) {
                    if (abstractC0607d0 != null) {
                        int i11 = AbstractC0607d0.f1846q0;
                        abstractC0607d0.m1238Z0(false);
                    }
                    Object objM1166N = m1166N(C0641u0.f1897Y.get(c0612g));
                    C0642v c0642v = objM1166N instanceof C0642v ? (C0642v) objM1166N : null;
                    if (c0642v == null) {
                        return objM1166N;
                    }
                    throw c0642v.f1900a;
                }
                LockSupport.parkNanos(c0612g, jMo1231e1);
            } catch (Throwable th2) {
                if (abstractC0607d0 != null) {
                    int i12 = AbstractC0607d0.f1846q0;
                    abstractC0607d0.m1238Z0(false);
                }
                throw th2;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0612g.m1310v(interruptedException);
        throw interruptedException;
    }

    /* JADX INFO: renamed from: K */
    public static final Object m1163K(RunnableC0576H0 runnableC0576H0, InterfaceC1439n interfaceC1439n) throws Throwable {
        Object c0642v;
        Object objM1299Q;
        m1195x(runnableC0576H0, true, new C0596W(m1190s(runnableC0576H0.f8802p0.getContext()).mo1199S(runnableC0576H0.f1806q0, runnableC0576H0, runnableC0576H0.f1833o0), 0));
        try {
            if (interfaceC1439n instanceof AbstractC19685a) {
                AbstractC16529F.m18081e(2, interfaceC1439n);
                c0642v = interfaceC1439n.invoke(runnableC0576H0, runnableC0576H0);
            } else {
                c0642v = AbstractC8154o0.m8715f(interfaceC1439n, runnableC0576H0, runnableC0576H0);
            }
        } catch (Throwable th2) {
            c0642v = new C0642v(th2, false);
        }
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        if (c0642v == enumC19250a || (objM1299Q = runnableC0576H0.m1299Q(c0642v)) == f1800e) {
            return enumC19250a;
        }
        if (objM1299Q instanceof C0642v) {
            Throwable th3 = ((C0642v) objM1299Q).f1900a;
            if (!(th3 instanceof C0574G0) || ((C0574G0) th3).f1795Y != runnableC0576H0) {
                throw th3;
            }
            if (c0642v instanceof C0642v) {
                throw ((C0642v) c0642v).f1900a;
            }
        } else {
            c0642v = m1166N(objM1299Q);
        }
        return c0642v;
    }

    /* JADX INFO: renamed from: L */
    public static final String m1164L(InterfaceC18770c interfaceC18770c) {
        Object objM9806b;
        if (interfaceC18770c instanceof C2928f) {
            return ((C2928f) interfaceC18770c).toString();
        }
        try {
            objM9806b = interfaceC18770c + '@' + m1191t(interfaceC18770c);
        } catch (Throwable th2) {
            objM9806b = AbstractC9233X.m9806b(th2);
        }
        if (C17312o.m18979a(objM9806b) != null) {
            objM9806b = interfaceC18770c.getClass().getName() + '@' + m1191t(interfaceC18770c);
        }
        return (String) objM9806b;
    }

    /* JADX INFO: renamed from: M */
    public static final long m1165M(long j10) {
        C21554a c21554a = C21555b.f68260Z;
        boolean z6 = j10 > 0;
        if (z6) {
            return C21555b.m21835e(C21555b.m21839i(j10, AbstractC8128k6.m8645k(999999L, EnumC21557d.NANOSECONDS)));
        }
        if (z6) {
            throw new C0644w();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: N */
    public static final Object m1166N(Object obj) {
        InterfaceC0617i0 interfaceC0617i0;
        C0619j0 c0619j0 = obj instanceof C0619j0 ? (C0619j0) obj : null;
        return (c0619j0 == null || (interfaceC0617i0 = c0619j0.f1863a) == null) ? obj : interfaceC0617i0;
    }

    /* JADX INFO: renamed from: O */
    public static final C0582K0 m1167O(InterfaceC18770c interfaceC18770c, InterfaceC18776i interfaceC18776i, Object obj) {
        C0582K0 c0582k0 = null;
        if (!(interfaceC18770c instanceof InterfaceC19688d)) {
            return null;
        }
        if (interfaceC18776i.get(C0584L0.f1815Y) != null) {
            InterfaceC19688d callerFrame = (InterfaceC19688d) interfaceC18770c;
            while (!(callerFrame instanceof C0590P) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof C0582K0) {
                    c0582k0 = (C0582K0) callerFrame;
                    break;
                }
            }
            if (c0582k0 != null) {
                c0582k0.m1209n0(interfaceC18776i, obj);
            }
        }
        return c0582k0;
    }

    /* JADX INFO: renamed from: P */
    public static final Object m1168P(InterfaceC18776i interfaceC18776i, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        Object objM1166N;
        InterfaceC18776i context = interfaceC18770c.getContext();
        InterfaceC18776i interfaceC18776iPlus = !((Boolean) interfaceC18776i.fold(Boolean.FALSE, new C0384d(2))).booleanValue() ? context.plus(interfaceC18776i) : m1188q(context, interfaceC18776i, false);
        m1187p(interfaceC18776iPlus);
        if (interfaceC18776iPlus == context) {
            C2939q c2939q = new C2939q(interfaceC18770c, interfaceC18776iPlus);
            objM1166N = AbstractC8056b6.m8453d(c2939q, c2939q, interfaceC1439n);
        } else {
            C18771d c18771d = C18771d.f59681Y;
            if (AbstractC16544l.m18089b(interfaceC18776iPlus.get(c18771d), context.get(c18771d))) {
                C0582K0 c0582k0 = new C0582K0(interfaceC18770c, interfaceC18776iPlus);
                InterfaceC18776i interfaceC18776i2 = c0582k0.f1833o0;
                Object objM3742p = AbstractC2923a.m3742p(interfaceC18776i2, null);
                try {
                    Object objM8453d = AbstractC8056b6.m8453d(c0582k0, c0582k0, interfaceC1439n);
                    AbstractC2923a.m3735i(interfaceC18776i2, objM3742p);
                    objM1166N = objM8453d;
                } catch (Throwable th2) {
                    AbstractC2923a.m3735i(interfaceC18776i2, objM3742p);
                    throw th2;
                }
            } else {
                C0590P c0590p = new C0590P(interfaceC18770c, interfaceC18776iPlus);
                try {
                    AbstractC2923a.m3736j(C17296C.f55119a, AbstractC8154o0.m8714e(AbstractC8154o0.m8710a(interfaceC1439n, c0590p, c0590p)));
                    do {
                        atomicIntegerFieldUpdater = C0590P.f1821q0;
                        int i10 = atomicIntegerFieldUpdater.get(c0590p);
                        if (i10 != 0) {
                            if (i10 != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            objM1166N = m1166N(C0641u0.f1897Y.get(c0590p));
                            if (objM1166N instanceof C0642v) {
                                throw ((C0642v) objM1166N).f1900a;
                            }
                        }
                    } while (!atomicIntegerFieldUpdater.compareAndSet(c0590p, 0, 1));
                    objM1166N = EnumC19250a.f61036Y;
                } catch (Throwable th3) {
                    AbstractC8048a6.m8438b(c0590p, th3);
                    throw null;
                }
            }
        }
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM1166N;
    }

    /* JADX INFO: renamed from: Q */
    public static final Object m1169Q(long j10, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) throws Throwable {
        if (j10 <= 0) {
            throw new C0574G0("Timed out immediately", null);
        }
        Object objM1163K = m1163K(new RunnableC0576H0(j10, interfaceC18770c), interfaceC1439n);
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM1163K;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: R */
    public static final Object m1170R(long j10, InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) throws Throwable {
        C0578I0 c0578i0;
        C16525B c16525b;
        if (abstractC19687c instanceof C0578I0) {
            c0578i0 = (C0578I0) abstractC19687c;
            int i10 = c0578i0.f1811o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0578i0.f1811o0 = i10 - Integer.MIN_VALUE;
            } else {
                c0578i0 = new C0578I0(abstractC19687c);
            }
        } else {
            c0578i0 = new C0578I0(abstractC19687c);
        }
        Object objM1163K = c0578i0.f1810Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c0578i0.f1811o0;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c16525b = c0578i0.f1809Y;
            try {
                AbstractC9233X.m9807c(objM1163K);
            } catch (C0574G0 e10) {
                e = e10;
                if (e.f1795Y == c16525b.f51262Y) {
                    return null;
                }
                throw e;
            }
        }
        AbstractC9233X.m9807c(objM1163K);
        if (j10 <= 0) {
            return null;
        }
        C16525B c16525b2 = new C16525B();
        try {
            c0578i0.f1809Y = c16525b2;
            c0578i0.f1811o0 = 1;
            RunnableC0576H0 runnableC0576H0 = new RunnableC0576H0(j10, c0578i0);
            c16525b2.f51262Y = runnableC0576H0;
            objM1163K = m1163K(runnableC0576H0, interfaceC1439n);
            return objM1163K == enumC19250a ? enumC19250a : objM1163K;
        } catch (C0574G0 e11) {
            e = e11;
            c16525b = c16525b2;
            if (e.f1795Y == c16525b.f51262Y) {
                return null;
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: S */
    public static final Object m1171S(AbstractC19687c abstractC19687c) {
        Object obj;
        InterfaceC18776i context = abstractC19687c.getContext();
        m1187p(context);
        InterfaceC18770c interfaceC18770cM8714e = AbstractC8154o0.m8714e(abstractC19687c);
        C2928f c2928f = interfaceC18770cM8714e instanceof C2928f ? (C2928f) interfaceC18770cM8714e : null;
        C17296C c17296c = C17296C.f55119a;
        if (c2928f == null) {
            obj = c17296c;
        } else {
            AbstractC0563B abstractC0563B = c2928f.f8773p0;
            if (AbstractC2923a.m3738l(abstractC0563B, context)) {
                c2928f.f8775r0 = c17296c;
                c2928f.f1822o0 = 1;
                abstractC0563B.mo1142W0(context, c2928f);
            } else {
                C0588N0 c0588n0 = new C0588N0(C0588N0.f1818Z);
                InterfaceC18776i interfaceC18776iPlus = context.plus(c0588n0);
                c2928f.f8775r0 = c17296c;
                c2928f.f1822o0 = 1;
                abstractC0563B.mo1142W0(interfaceC18776iPlus, c2928f);
                if (c0588n0.f1819Y) {
                    AbstractC0607d0 abstractC0607d0M1147a = AbstractC0570E0.m1147a();
                    C17677k c17677k = abstractC0607d0M1147a.f1849p0;
                    if (c17677k != null ? c17677k.isEmpty() : true) {
                        obj = c17296c;
                    } else if (abstractC0607d0M1147a.m1241d1()) {
                        c2928f.f8775r0 = c17296c;
                        c2928f.f1822o0 = 1;
                        abstractC0607d0M1147a.m1239a1(c2928f);
                        obj = EnumC19250a.f61036Y;
                    } else {
                        abstractC0607d0M1147a.m1240c1(true);
                        try {
                            c2928f.run();
                            do {
                            } while (abstractC0607d0M1147a.m1242f1());
                        } catch (Throwable th2) {
                            try {
                                c2928f.m1218g(th2);
                            } catch (Throwable th3) {
                                abstractC0607d0M1147a.m1238Z0(true);
                                throw th3;
                            }
                        }
                        abstractC0607d0M1147a.m1238Z0(true);
                        obj = c17296c;
                    }
                }
            }
            obj = EnumC19250a.f61036Y;
        }
        return obj == EnumC19250a.f61036Y ? obj : c17296c;
    }

    /* JADX INFO: renamed from: a */
    public static final CancellationException m1172a(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    /* JADX INFO: renamed from: b */
    public static C0636s m1173b() {
        C0636s c0636s = new C0636s(true);
        c0636s.m1294K(null);
        return c0636s;
    }

    /* JADX INFO: renamed from: c */
    public static final C2925c m1174c(InterfaceC18776i interfaceC18776i) {
        if (interfaceC18776i.get(C0625m0.f1875Y) == null) {
            interfaceC18776i = interfaceC18776i.plus(m1175d());
        }
        return new C2925c(interfaceC18776i);
    }

    /* JADX INFO: renamed from: d */
    public static C0631p0 m1175d() {
        return new C0631p0(null);
    }

    /* JADX INFO: renamed from: e */
    public static C0566C0 m1176e() {
        return new C0566C0(null);
    }

    /* JADX INFO: renamed from: f */
    public static C0583L m1177f(InterfaceC0571F interfaceC0571F, InterfaceC18776i interfaceC18776i, InterfaceC1439n interfaceC1439n, int i10) {
        if ((i10 & 1) != 0) {
            interfaceC18776i = C18777j.f59682Y;
        }
        EnumC0573G enumC0573G = EnumC0573G.f1790Y;
        InterfaceC18776i interfaceC18776iM1157E = m1157E(interfaceC0571F, interfaceC18776i);
        EnumC0573G enumC0573G2 = EnumC0573G.f1790Y;
        C0583L c0583l = new C0583L(interfaceC18776iM1157E, true, true);
        c0583l.m1226i0(enumC0573G, c0583l, interfaceC1439n);
        return c0583l;
    }

    /* JADX INFO: renamed from: g */
    public static final Object m1178g(Collection collection, AbstractC19694j abstractC19694j) {
        if (collection.isEmpty()) {
            return C17689w.f56480Y;
        }
        InterfaceC0581K[] interfaceC0581KArr = (InterfaceC0581K[]) collection.toArray(new InterfaceC0581K[0]);
        C0608e c0608e = new C0608e(interfaceC0581KArr);
        C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(abstractC19694j));
        c0624m.m1262r();
        int length = interfaceC0581KArr.length;
        C0604c[] c0604cArr = new C0604c[length];
        for (int i10 = 0; i10 < length; i10++) {
            InterfaceC0581K interfaceC0581K = interfaceC0581KArr[i10];
            interfaceC0581K.start();
            C0604c c0604c = new C0604c(c0608e, c0624m);
            c0604c.f1840r0 = m1195x(interfaceC0581K, true, c0604c);
            c0604cArr[i10] = c0604c;
        }
        C0606d c0606d = new C0606d(c0604cArr);
        for (int i11 = 0; i11 < length; i11++) {
            C0604c c0604c2 = c0604cArr[i11];
            c0604c2.getClass();
            C0604c.f1838t0.set(c0604c2, c0606d);
        }
        if (C0624m.f1871s0.get(c0624m) instanceof InterfaceC0651z0) {
            c0624m.m1265v(c0606d);
        } else {
            c0606d.m1236a();
        }
        Object objM1261q = c0624m.m1261q();
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM1261q;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public static final void m1179h(AbstractC19687c abstractC19687c) {
        C0587N c0587n;
        if (abstractC19687c instanceof C0587N) {
            c0587n = (C0587N) abstractC19687c;
            int i10 = c0587n.f1817Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0587n.f1817Z = i10 - Integer.MIN_VALUE;
            } else {
                c0587n = new C0587N(abstractC19687c);
            }
        } else {
            c0587n = new C0587N(abstractC19687c);
        }
        Object obj = c0587n.f1816Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c0587n.f1817Z;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c0587n.f1817Z = 1;
            C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(c0587n));
            c0624m.m1262r();
            if (c0624m.m1261q() == enumC19250a) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        throw new C0644w();
    }

    /* JADX INFO: renamed from: i */
    public static final void m1180i(InterfaceC0571F interfaceC0571F, CancellationException cancellationException) {
        InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) interfaceC0571F.getCoroutineContext().get(C0625m0.f1875Y);
        if (interfaceC0627n0 != null) {
            interfaceC0627n0.mo1275e(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC0571F).toString());
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m1181j(InterfaceC18776i interfaceC18776i, CancellationException cancellationException) {
        InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) interfaceC18776i.get(C0625m0.f1875Y);
        if (interfaceC0627n0 != null) {
            interfaceC0627n0.mo1275e(cancellationException);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final Object m1182k(InterfaceC0627n0 interfaceC0627n0, AbstractC19694j abstractC19694j) {
        interfaceC0627n0.mo1275e(null);
        Object objMo1272P = interfaceC0627n0.mo1272P(abstractC19694j);
        return objMo1272P == EnumC19250a.f61036Y ? objMo1272P : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: l */
    public static final Object m1183l(InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        C2939q c2939q = new C2939q(interfaceC18770c, interfaceC18770c.getContext());
        Object objM8453d = AbstractC8056b6.m8453d(c2939q, c2939q, interfaceC1439n);
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM8453d;
    }

    /* JADX INFO: renamed from: m */
    public static final Object m1184m(long j10, InterfaceC18770c interfaceC18770c) {
        C17296C c17296c = C17296C.f55119a;
        if (j10 <= 0) {
            return c17296c;
        }
        C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(interfaceC18770c));
        c0624m.m1262r();
        if (j10 < Long.MAX_VALUE) {
            m1190s(c0624m.f1874q0).mo1211k(j10, c0624m);
        }
        Object objM1261q = c0624m.m1261q();
        return objM1261q == EnumC19250a.f61036Y ? objM1261q : c17296c;
    }

    /* JADX INFO: renamed from: n */
    public static final Object m1185n(long j10, InterfaceC18770c interfaceC18770c) {
        Object objM1184m = m1184m(m1165M(j10), interfaceC18770c);
        return objM1184m == EnumC19250a.f61036Y ? objM1184m : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m1186o(InterfaceC0571F interfaceC0571F) {
        m1187p(interfaceC0571F.getCoroutineContext());
    }

    /* JADX INFO: renamed from: p */
    public static final void m1187p(InterfaceC18776i interfaceC18776i) {
        InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) interfaceC18776i.get(C0625m0.f1875Y);
        if (interfaceC0627n0 != null && !interfaceC0627n0.mo1274a()) {
            throw interfaceC0627n0.mo1273T();
        }
    }

    /* JADX INFO: renamed from: q */
    public static final InterfaceC18776i m1188q(InterfaceC18776i interfaceC18776i, InterfaceC18776i interfaceC18776i2, boolean z6) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC18776i.fold(bool, new C0384d(2))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC18776i2.fold(bool, new C0384d(2))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC18776i.plus(interfaceC18776i2);
        }
        C16525B c16525b = new C16525B();
        c16525b.f51262Y = interfaceC18776i2;
        C18777j c18777j = C18777j.f59682Y;
        InterfaceC18776i interfaceC18776i3 = (InterfaceC18776i) interfaceC18776i.fold(c18777j, new C0650z(c16525b, z6, 0));
        if (zBooleanValue2) {
            c16525b.f51262Y = ((InterfaceC18776i) c16525b.f51262Y).fold(c18777j, new C0384d(3));
        }
        return interfaceC18776i3.plus((InterfaceC18776i) c16525b.f51262Y);
    }

    /* JADX INFO: renamed from: r */
    public static final AbstractC0563B m1189r(Executor executor) {
        C1451e c1451e;
        ExecutorC0592S executorC0592S = executor instanceof ExecutorC0592S ? (ExecutorC0592S) executor : null;
        return (executorC0592S == null || (c1451e = executorC0592S.f1823Y) == null) ? new C0611f0(executor) : c1451e;
    }

    /* JADX INFO: renamed from: s */
    public static final InterfaceC0585M m1190s(InterfaceC18776i interfaceC18776i) {
        InterfaceC18774g interfaceC18774g = interfaceC18776i.get(C18771d.f59681Y);
        InterfaceC0585M interfaceC0585M = interfaceC18774g instanceof InterfaceC0585M ? (InterfaceC0585M) interfaceC18774g : null;
        return interfaceC0585M == null ? AbstractC0579J.f1812a : interfaceC0585M;
    }

    /* JADX INFO: renamed from: t */
    public static final String m1191t(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: u */
    public static final InterfaceC0627n0 m1192u(InterfaceC18776i interfaceC18776i) {
        InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) interfaceC18776i.get(C0625m0.f1875Y);
        if (interfaceC0627n0 != null) {
            return interfaceC0627n0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC18776i).toString());
    }

    /* JADX INFO: renamed from: v */
    public static final C0624m m1193v(InterfaceC18770c interfaceC18770c) {
        C0624m c0624m;
        C0624m c0624m2;
        if (!(interfaceC18770c instanceof C2928f)) {
            return new C0624m(1, interfaceC18770c);
        }
        C2928f c2928f = (C2928f) interfaceC18770c;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2928f.f8772t0;
            Object obj = atomicReferenceFieldUpdater.get(c2928f);
            C2942t c2942t = AbstractC2923a.f8762c;
            c0624m = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c2928f, c2942t);
                c0624m2 = null;
                break;
            }
            if (obj instanceof C0624m) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(c2928f, obj, c2942t)) {
                        c0624m2 = (C0624m) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(c2928f) == obj);
            } else if (obj != c2942t && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0624m2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0624m.f1871s0;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0624m2);
            if (!(obj2 instanceof C0640u) || ((C0640u) obj2).f1895d == null) {
                C0624m.f1870r0.set(c0624m2, 536870911);
                atomicReferenceFieldUpdater2.set(c0624m2, C0602b.f1836Y);
                c0624m = c0624m2;
            } else {
                c0624m2.m1258m();
            }
            if (c0624m != null) {
                return c0624m;
            }
        }
        return new C0624m(2, interfaceC18770c);
    }

    /* JADX INFO: renamed from: w */
    public static final void m1194w(InterfaceC18776i interfaceC18776i, Throwable th2) {
        if (th2 instanceof C0589O) {
            th2 = ((C0589O) th2).f1820Y;
        }
        try {
            InterfaceC0567D interfaceC0567D = (InterfaceC0567D) interfaceC18776i.get(C0565C.f1783Y);
            if (interfaceC0567D != null) {
                interfaceC0567D.handleException(interfaceC18776i, th2);
            } else {
                AbstractC2923a.m3732f(interfaceC18776i, th2);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                AbstractC9221V.m9789a(runtimeException, th2);
                th2 = runtimeException;
            }
            AbstractC2923a.m3732f(interfaceC18776i, th2);
        }
    }

    /* JADX INFO: renamed from: x */
    public static final InterfaceC0595V m1195x(InterfaceC0627n0 interfaceC0627n0, boolean z6, AbstractC0633q0 abstractC0633q0) {
        if (interfaceC0627n0 instanceof C0641u0) {
            return ((C0641u0) interfaceC0627n0).m1295L(z6, abstractC0633q0);
        }
        return interfaceC0627n0.mo1270E(abstractC0633q0.mo1149j(), z6, new C0292u(1, abstractC0633q0, AbstractC0633q0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 2));
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m1196y(InterfaceC0571F interfaceC0571F) {
        InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) interfaceC0571F.getCoroutineContext().get(C0625m0.f1875Y);
        if (interfaceC0627n0 != null) {
            return interfaceC0627n0.mo1274a();
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m1197z(InterfaceC18776i interfaceC18776i) {
        InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) interfaceC18776i.get(C0625m0.f1875Y);
        if (interfaceC0627n0 != null) {
            return interfaceC0627n0.mo1274a();
        }
        return true;
    }
}
