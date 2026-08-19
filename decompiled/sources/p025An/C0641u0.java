package p025An;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p153Fn.C2930h;
import p153Fn.C2931i;
import p153Fn.C2942t;
import p334Na.AbstractC5695b;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9221V;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18774g;
import p972qm.InterfaceC18775h;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: An.u0 */
/* JADX INFO: loaded from: classes2.dex */
public class C0641u0 implements InterfaceC0627n0, InterfaceC0562A0 {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1897Y = AtomicReferenceFieldUpdater.newUpdater(C0641u0.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1898Z = AtomicReferenceFieldUpdater.newUpdater(C0641u0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public C0641u0(boolean z6) {
        this._state$volatile = z6 ? AbstractC0575H.f1805j : AbstractC0575H.f1804i;
    }

    /* JADX INFO: renamed from: U */
    public static C0632q m1287U(C2931i c2931i) {
        while (c2931i.mo1313h()) {
            C2931i c2931iM3750e = c2931i.m3750e();
            if (c2931iM3750e == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2931i.f8786Z;
                Object obj = atomicReferenceFieldUpdater.get(c2931i);
                while (true) {
                    c2931i = (C2931i) obj;
                    if (!c2931i.mo1313h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c2931i);
                }
            } else {
                c2931i = c2931iM3750e;
            }
        }
        while (true) {
            c2931i = c2931i.m3752g();
            if (!c2931i.mo1313h()) {
                if (c2931i instanceof C0632q) {
                    return (C0632q) c2931i;
                }
                if (c2931i instanceof C0645w0) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static String m1288d0(Object obj) {
        if (!(obj instanceof C0639t0)) {
            if (obj instanceof InterfaceC0617i0) {
                return ((InterfaceC0617i0) obj).mo1220a() ? "Active" : "New";
            }
            return obj instanceof C0642v ? "Cancelled" : "Completed";
        }
        C0639t0 c0639t0 = (C0639t0) obj;
        if (c0639t0.m1284e()) {
            return "Cancelling";
        }
        return C0639t0.f1888Z.get(c0639t0) == 1 ? "Completing" : "Active";
    }

    /* JADX INFO: renamed from: A */
    public final void m1289A(InterfaceC0617i0 interfaceC0617i0, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1898Z;
        InterfaceC0630p interfaceC0630p = (InterfaceC0630p) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0630p != null) {
            interfaceC0630p.dispose();
            atomicReferenceFieldUpdater.set(this, C0649y0.f1903Y);
        }
        C0644w c0644w = null;
        C0642v c0642v = obj instanceof C0642v ? (C0642v) obj : null;
        Throwable th2 = c0642v != null ? c0642v.f1900a : null;
        if (interfaceC0617i0 instanceof AbstractC0633q0) {
            try {
                ((AbstractC0633q0) interfaceC0617i0).mo1150k(th2);
                return;
            } catch (Throwable th3) {
                mo1222J(new C0644w("Exception in completion handler " + interfaceC0617i0 + " for " + this, th3));
                return;
            }
        }
        C0645w0 c0645w0Mo1221c = interfaceC0617i0.mo1221c();
        if (c0645w0Mo1221c != null) {
            c0645w0Mo1221c.m3749d(new C2930h(1), 1);
            Object obj2 = C2931i.f8785Y.get(c0645w0Mo1221c);
            AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (C2931i c2931iM3752g = (C2931i) obj2; !c2931iM3752g.equals(c0645w0Mo1221c); c2931iM3752g = c2931iM3752g.m3752g()) {
                if (c2931iM3752g instanceof AbstractC0633q0) {
                    try {
                        ((AbstractC0633q0) c2931iM3752g).mo1150k(th2);
                    } catch (Throwable th4) {
                        if (c0644w != null) {
                            AbstractC9221V.m9789a(c0644w, th4);
                        } else {
                            c0644w = new C0644w("Exception in completion handler " + c2931iM3752g + " for " + this, th4);
                        }
                    }
                }
            }
            if (c0644w != null) {
                mo1222J(c0644w);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final Throwable m1290B(Object obj) {
        Throwable thM1283d;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        C0641u0 c0641u0 = (C0641u0) ((InterfaceC0562A0) obj);
        Object obj2 = f1897Y.get(c0641u0);
        if (obj2 instanceof C0639t0) {
            thM1283d = ((C0639t0) obj2).m1283d();
        } else if (obj2 instanceof C0642v) {
            thM1283d = ((C0642v) obj2).f1900a;
        } else {
            if (obj2 instanceof InterfaceC0617i0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            thM1283d = null;
        }
        CancellationException c0629o0 = thM1283d instanceof CancellationException ? (CancellationException) thM1283d : null;
        if (c0629o0 == null) {
            c0629o0 = new C0629o0("Parent job is ".concat(m1288d0(obj2)), thM1283d, c0641u0);
        }
        return c0629o0;
    }

    /* JADX INFO: renamed from: C */
    public final Object m1291C(C0639t0 c0639t0, Object obj) {
        Throwable thM1292D;
        C0642v c0642v = obj instanceof C0642v ? (C0642v) obj : null;
        Throwable th2 = c0642v != null ? c0642v.f1900a : null;
        synchronized (c0639t0) {
            c0639t0.m1284e();
            ArrayList<Throwable> arrayListM1285f = c0639t0.m1285f(th2);
            thM1292D = m1292D(c0639t0, arrayListM1285f);
            if (thM1292D != null && arrayListM1285f.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM1285f.size()));
                for (Throwable th3 : arrayListM1285f) {
                    if (th3 != thM1292D && th3 != thM1292D && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                        AbstractC9221V.m9789a(thM1292D, th3);
                    }
                }
            }
        }
        if (thM1292D != null && thM1292D != th2) {
            obj = new C0642v(thM1292D, false);
        }
        if (thM1292D != null && (m1312x(thM1292D) || mo1145I(thM1292D))) {
            AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0642v.f1899b.compareAndSet((C0642v) obj, 0, 1);
        }
        mo1223Y(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1897Y;
        Object c0619j0 = obj instanceof InterfaceC0617i0 ? new C0619j0((InterfaceC0617i0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c0639t0, c0619j0) && atomicReferenceFieldUpdater.get(this) == c0639t0) {
        }
        m1289A(c0639t0, obj);
        return obj;
    }

    @Override // p025An.InterfaceC0627n0
    /* JADX INFO: renamed from: C0 */
    public final InterfaceC0630p mo1269C0(C0641u0 c0641u0) {
        C0632q c0632q = new C0632q(c0641u0);
        c0632q.f1882p0 = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1897Y;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0597X) {
                C0597X c0597x = (C0597X) obj;
                if (c0597x.f1829Y) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0632q)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                        }
                    }
                    break loop0;
                }
                m1303a0(c0597x);
            } else {
                boolean z6 = obj instanceof InterfaceC0617i0;
                C0649y0 c0649y0 = C0649y0.f1903Y;
                Throwable thM1283d = null;
                if (!z6) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C0642v c0642v = obj2 instanceof C0642v ? (C0642v) obj2 : null;
                    c0632q.mo1150k(c0642v != null ? c0642v.f1900a : null);
                    return c0649y0;
                }
                C0645w0 c0645w0Mo1221c = ((InterfaceC0617i0) obj).mo1221c();
                if (c0645w0Mo1221c != null) {
                    if (c0645w0Mo1221c.m3749d(c0632q, 7)) {
                        break;
                    }
                    boolean zM3749d = c0645w0Mo1221c.m3749d(c0632q, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof C0639t0) {
                        thM1283d = ((C0639t0) obj3).m1283d();
                    } else {
                        C0642v c0642v2 = obj3 instanceof C0642v ? (C0642v) obj3 : null;
                        if (c0642v2 != null) {
                            thM1283d = c0642v2.f1900a;
                        }
                    }
                    c0632q.mo1150k(thM1283d);
                    if (zM3749d) {
                        break;
                    }
                    return c0649y0;
                }
                AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                m1304b0((AbstractC0633q0) obj);
            }
        }
        return c0632q;
    }

    /* JADX INFO: renamed from: D */
    public final Throwable m1292D(C0639t0 c0639t0, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (c0639t0.m1284e()) {
                return new C0629o0(mo1227y(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th2 = (Throwable) next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof C0574G0) {
            for (Object obj2 : arrayList) {
                Throwable th4 = (Throwable) obj2;
                if (th4 != th3 && (th4 instanceof C0574G0)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    @Override // p025An.InterfaceC0627n0
    /* JADX INFO: renamed from: E */
    public final InterfaceC0595V mo1270E(boolean z6, boolean z10, InterfaceC1436k interfaceC1436k) {
        return m1295L(z10, z6 ? new C0623l0(interfaceC1436k) : new C0596W(interfaceC1436k, 1));
    }

    /* JADX INFO: renamed from: F */
    public boolean mo1277F() {
        return true;
    }

    /* JADX INFO: renamed from: G */
    public boolean mo1278G() {
        return this instanceof C0636s;
    }

    /* JADX INFO: renamed from: H */
    public final C0645w0 m1293H(InterfaceC0617i0 interfaceC0617i0) {
        C0645w0 c0645w0Mo1221c = interfaceC0617i0.mo1221c();
        if (c0645w0Mo1221c != null) {
            return c0645w0Mo1221c;
        }
        if (interfaceC0617i0 instanceof C0597X) {
            return new C0645w0();
        }
        if (interfaceC0617i0 instanceof AbstractC0633q0) {
            m1304b0((AbstractC0633q0) interfaceC0617i0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC0617i0).toString());
    }

    @Override // p025An.InterfaceC0627n0
    /* JADX INFO: renamed from: H0 */
    public final InterfaceC0595V mo1271H0(InterfaceC1436k interfaceC1436k) {
        return m1295L(true, new C0596W(interfaceC1436k, 1));
    }

    /* JADX INFO: renamed from: I */
    public boolean mo1145I(Throwable th2) {
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final void m1294K(InterfaceC0627n0 interfaceC0627n0) {
        C0649y0 c0649y0 = C0649y0.f1903Y;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1898Z;
        if (interfaceC0627n0 == null) {
            atomicReferenceFieldUpdater.set(this, c0649y0);
            return;
        }
        interfaceC0627n0.start();
        InterfaceC0630p interfaceC0630pMo1269C0 = interfaceC0627n0.mo1269C0(this);
        atomicReferenceFieldUpdater.set(this, interfaceC0630pMo1269C0);
        if (m1296M()) {
            interfaceC0630pMo1269C0.dispose();
            atomicReferenceFieldUpdater.set(this, c0649y0);
        }
    }

    /* JADX INFO: renamed from: L */
    public final InterfaceC0595V m1295L(boolean z6, AbstractC0633q0 abstractC0633q0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0649y0 c0649y0;
        boolean z10;
        boolean zM3749d;
        abstractC0633q0.f1882p0 = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f1897Y;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z11 = obj instanceof C0597X;
            c0649y0 = C0649y0.f1903Y;
            z10 = true;
            if (!z11) {
                if (!(obj instanceof InterfaceC0617i0)) {
                    z10 = false;
                    break;
                }
                InterfaceC0617i0 interfaceC0617i0 = (InterfaceC0617i0) obj;
                C0645w0 c0645w0Mo1221c = interfaceC0617i0.mo1221c();
                if (c0645w0Mo1221c == null) {
                    AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m1304b0((AbstractC0633q0) obj);
                } else {
                    if (abstractC0633q0.mo1149j()) {
                        C0639t0 c0639t0 = interfaceC0617i0 instanceof C0639t0 ? (C0639t0) interfaceC0617i0 : null;
                        Throwable thM1283d = c0639t0 != null ? c0639t0.m1283d() : null;
                        if (thM1283d != null) {
                            if (z6) {
                                abstractC0633q0.mo1150k(thM1283d);
                            }
                            return c0649y0;
                        }
                        zM3749d = c0645w0Mo1221c.m3749d(abstractC0633q0, 5);
                    } else {
                        zM3749d = c0645w0Mo1221c.m3749d(abstractC0633q0, 1);
                    }
                    if (zM3749d) {
                        break;
                    }
                }
            } else {
                C0597X c0597x = (C0597X) obj;
                if (c0597x.f1829Y) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC0633q0)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                } else {
                    m1303a0(c0597x);
                }
            }
        }
        if (z10) {
            return abstractC0633q0;
        }
        if (z6) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0642v c0642v = obj2 instanceof C0642v ? (C0642v) obj2 : null;
            abstractC0633q0.mo1150k(c0642v != null ? c0642v.f1900a : null);
        }
        return c0649y0;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m1296M() {
        return !(f1897Y.get(this) instanceof InterfaceC0617i0);
    }

    /* JADX INFO: renamed from: N */
    public boolean mo1297N() {
        return this instanceof C0612g;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m1298O(Object obj) {
        Object objM1306e0;
        do {
            objM1306e0 = m1306e0(f1897Y.get(this), obj);
            if (objM1306e0 == AbstractC0575H.f1799d) {
                return false;
            }
            if (objM1306e0 == AbstractC0575H.f1800e) {
                return true;
            }
        } while (objM1306e0 == AbstractC0575H.f1801f);
        mo1213r(objM1306e0);
        return true;
    }

    @Override // p025An.InterfaceC0627n0
    /* JADX INFO: renamed from: P */
    public final Object mo1272P(InterfaceC18770c interfaceC18770c) {
        Object obj;
        C17296C c17296c;
        do {
            obj = f1897Y.get(this);
            boolean z6 = obj instanceof InterfaceC0617i0;
            c17296c = C17296C.f55119a;
            if (!z6) {
                AbstractC0575H.m1187p(interfaceC18770c.getContext());
                return c17296c;
            }
        } while (m1305c0(obj) < 0);
        C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(interfaceC18770c));
        c0624m.m1262r();
        c0624m.m1265v(new C0616i(AbstractC0575H.m1195x(this, true, new C0628o(c0624m, 1)), 2));
        Object objM1261q = c0624m.m1261q();
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        if (objM1261q != enumC19250a) {
            objM1261q = c17296c;
        }
        return objM1261q == enumC19250a ? objM1261q : c17296c;
    }

    /* JADX INFO: renamed from: Q */
    public final Object m1299Q(Object obj) {
        Object objM1306e0;
        do {
            objM1306e0 = m1306e0(f1897Y.get(this), obj);
            if (objM1306e0 == AbstractC0575H.f1799d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0642v c0642v = obj instanceof C0642v ? (C0642v) obj : null;
                throw new IllegalStateException(str, c0642v != null ? c0642v.f1900a : null);
            }
        } while (objM1306e0 == AbstractC0575H.f1801f);
        return objM1306e0;
    }

    /* JADX INFO: renamed from: R */
    public String mo1198R() {
        return getClass().getSimpleName();
    }

    @Override // p025An.InterfaceC0627n0
    /* JADX INFO: renamed from: T */
    public final CancellationException mo1273T() {
        CancellationException cancellationException;
        Object obj = f1897Y.get(this);
        if (!(obj instanceof C0639t0)) {
            if (obj instanceof InterfaceC0617i0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C0642v)) {
                return new C0629o0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th2 = ((C0642v) obj).f1900a;
            cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            return cancellationException == null ? new C0629o0(mo1227y(), th2, this) : cancellationException;
        }
        Throwable thM1283d = ((C0639t0) obj).m1283d();
        if (thM1283d == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thM1283d instanceof CancellationException ? (CancellationException) thM1283d : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = mo1227y();
        }
        return new C0629o0(strConcat, thM1283d, this);
    }

    /* JADX INFO: renamed from: V */
    public final void m1300V(C0645w0 c0645w0, Throwable th2) {
        c0645w0.m3749d(new C2930h(4), 4);
        Object obj = C2931i.f8785Y.get(c0645w0);
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        C0644w c0644w = null;
        for (C2931i c2931iM3752g = (C2931i) obj; !c2931iM3752g.equals(c0645w0); c2931iM3752g = c2931iM3752g.m3752g()) {
            if ((c2931iM3752g instanceof AbstractC0633q0) && ((AbstractC0633q0) c2931iM3752g).mo1149j()) {
                try {
                    ((AbstractC0633q0) c2931iM3752g).mo1150k(th2);
                } catch (Throwable th3) {
                    if (c0644w != null) {
                        AbstractC9221V.m9789a(c0644w, th3);
                    } else {
                        c0644w = new C0644w("Exception in completion handler " + c2931iM3752g + " for " + this, th3);
                    }
                }
            }
        }
        if (c0644w != null) {
            mo1222J(c0644w);
        }
        m1312x(th2);
    }

    @Override // p025An.InterfaceC0627n0
    /* JADX INFO: renamed from: a */
    public boolean mo1274a() {
        Object obj = f1897Y.get(this);
        return (obj instanceof InterfaceC0617i0) && ((InterfaceC0617i0) obj).mo1220a();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m1303a0(C0597X c0597x) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0645w0 c0645w0 = new C0645w0();
        Object c0615h0 = c0645w0;
        if (!c0597x.f1829Y) {
            c0615h0 = new C0615h0(c0645w0);
        }
        do {
            atomicReferenceFieldUpdater = f1897Y;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c0597x, c0615h0)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c0597x);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m1304b0(AbstractC0633q0 abstractC0633q0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0645w0 c0645w0 = new C0645w0();
        abstractC0633q0.getClass();
        C2931i.f8786Z.set(c0645w0, abstractC0633q0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C2931i.f8785Y;
        atomicReferenceFieldUpdater2.set(c0645w0, abstractC0633q0);
        loop0: while (atomicReferenceFieldUpdater2.get(abstractC0633q0) == abstractC0633q0) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(abstractC0633q0, abstractC0633q0, c0645w0)) {
                    c0645w0.m3751f(abstractC0633q0);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(abstractC0633q0) == abstractC0633q0);
        }
        C2931i c2931iM3752g = abstractC0633q0.m3752g();
        do {
            atomicReferenceFieldUpdater = f1897Y;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC0633q0, c2931iM3752g)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC0633q0);
    }

    /* JADX INFO: renamed from: c0 */
    public final int m1305c0(Object obj) {
        boolean z6 = obj instanceof C0597X;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1897Y;
        if (z6) {
            if (((C0597X) obj).f1829Y) {
                return 0;
            }
            C0597X c0597x = AbstractC0575H.f1805j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0597x)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            mo1302Z();
            return 1;
        }
        if (!(obj instanceof C0615h0)) {
            return 0;
        }
        C0645w0 c0645w0 = ((C0615h0) obj).f1860Y;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0645w0)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        mo1302Z();
        return 1;
    }

    @Override // p025An.InterfaceC0627n0
    /* JADX INFO: renamed from: e */
    public void mo1275e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0629o0(mo1227y(), null, this);
        }
        mo1311w(cancellationException);
    }

    /* JADX INFO: renamed from: e0 */
    public final Object m1306e0(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof InterfaceC0617i0)) {
            return AbstractC0575H.f1799d;
        }
        if (((obj instanceof C0597X) || (obj instanceof AbstractC0633q0)) && !(obj instanceof C0632q) && !(obj2 instanceof C0642v)) {
            InterfaceC0617i0 interfaceC0617i0 = (InterfaceC0617i0) obj;
            Object c0619j0 = obj2 instanceof InterfaceC0617i0 ? new C0619j0((InterfaceC0617i0) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f1897Y;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0617i0, c0619j0)) {
                    mo1223Y(obj2);
                    m1289A(interfaceC0617i0, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC0617i0);
            return AbstractC0575H.f1801f;
        }
        InterfaceC0617i0 interfaceC0617i1 = (InterfaceC0617i0) obj;
        C0645w0 c0645w0M1293H = m1293H(interfaceC0617i1);
        if (c0645w0M1293H == null) {
            return AbstractC0575H.f1801f;
        }
        C0639t0 c0639t0 = interfaceC0617i1 instanceof C0639t0 ? (C0639t0) interfaceC0617i1 : null;
        if (c0639t0 == null) {
            c0639t0 = new C0639t0(c0645w0M1293H, null);
        }
        synchronized (c0639t0) {
            try {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0639t0.f1888Z;
                if (atomicIntegerFieldUpdater.get(c0639t0) == 1) {
                    return AbstractC0575H.f1799d;
                }
                atomicIntegerFieldUpdater.set(c0639t0, 1);
                if (c0639t0 != interfaceC0617i1) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1897Y;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC0617i1, c0639t0)) {
                        if (atomicReferenceFieldUpdater2.get(this) != interfaceC0617i1) {
                            return AbstractC0575H.f1801f;
                        }
                    }
                }
                boolean zM1284e = c0639t0.m1284e();
                C0642v c0642v = obj2 instanceof C0642v ? (C0642v) obj2 : null;
                if (c0642v != null) {
                    c0639t0.m1282b(c0642v.f1900a);
                }
                Throwable thM1283d = zM1284e ? null : c0639t0.m1283d();
                if (thM1283d != null) {
                    m1300V(c0645w0M1293H, thM1283d);
                }
                C0632q c0632qM1287U = m1287U(c0645w0M1293H);
                if (c0632qM1287U != null && m1307f0(c0639t0, c0632qM1287U, obj2)) {
                    return AbstractC0575H.f1800e;
                }
                c0645w0M1293H.m3749d(new C2930h(2), 2);
                C0632q c0632qM1287U2 = m1287U(c0645w0M1293H);
                return (c0632qM1287U2 == null || !m1307f0(c0639t0, c0632qM1287U2, obj2)) ? m1291C(c0639t0, obj2) : AbstractC0575H.f1800e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m1307f0(C0639t0 c0639t0, C0632q c0632q, Object obj) {
        while (AbstractC0575H.m1195x(c0632q.f1881q0, false, new C0637s0(this, c0639t0, c0632q, obj)) == C0649y0.f1903Y) {
            c0632q = m1287U(c0632q);
            if (c0632q == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p972qm.InterfaceC18776i
    public final Object fold(Object obj, InterfaceC1439n interfaceC1439n) {
        return interfaceC1439n.invoke(obj, this);
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18774g get(InterfaceC18775h interfaceC18775h) {
        return AbstractC5695b.m6136c(this, interfaceC18775h);
    }

    @Override // p972qm.InterfaceC18774g
    public final InterfaceC18775h getKey() {
        return C0625m0.f1875Y;
    }

    @Override // p025An.InterfaceC0627n0
    public final InterfaceC0627n0 getParent() {
        InterfaceC0630p interfaceC0630p = (InterfaceC0630p) f1898Z.get(this);
        if (interfaceC0630p != null) {
            return interfaceC0630p.getParent();
        }
        return null;
    }

    @Override // p025An.InterfaceC0627n0
    public final boolean isCancelled() {
        Object obj = f1897Y.get(this);
        return (obj instanceof C0642v) || ((obj instanceof C0639t0) && ((C0639t0) obj).m1284e());
    }

    /* JADX INFO: renamed from: m */
    public Object m1308m() throws Throwable {
        Object obj = f1897Y.get(this);
        if (obj instanceof InterfaceC0617i0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof C0642v) {
            throw ((C0642v) obj).f1900a;
        }
        return AbstractC0575H.m1166N(obj);
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18776i minusKey(InterfaceC18775h interfaceC18775h) {
        return AbstractC5695b.m6137d(this, interfaceC18775h);
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18776i plus(InterfaceC18776i interfaceC18776i) {
        return AbstractC5695b.m6138e(this, interfaceC18776i);
    }

    /* JADX INFO: renamed from: s */
    public void mo1210s(Object obj) {
        mo1213r(obj);
    }

    @Override // p025An.InterfaceC0627n0
    public final boolean start() {
        int iM1305c0;
        do {
            iM1305c0 = m1305c0(f1897Y.get(this));
            if (iM1305c0 == 0) {
                return false;
            }
        } while (iM1305c0 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo1198R() + '{' + m1288d0(f1897Y.get(this)) + '}');
        sb2.append('@');
        sb2.append(AbstractC0575H.m1191t(this));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public final Object m1309u(InterfaceC18770c interfaceC18770c) throws Throwable {
        Object obj;
        int i10 = 2;
        do {
            obj = f1897Y.get(this);
            if (!(obj instanceof InterfaceC0617i0)) {
                if (obj instanceof C0642v) {
                    throw ((C0642v) obj).f1900a;
                }
                return AbstractC0575H.m1166N(obj);
            }
        } while (m1305c0(obj) < 0);
        C0635r0 c0635r0 = new C0635r0(AbstractC8154o0.m8714e(interfaceC18770c), this);
        c0635r0.m1262r();
        c0635r0.m1265v(new C0616i(AbstractC0575H.m1195x(this, true, new C0596W(c0635r0, i10)), i10));
        Object objM1261q = c0635r0.m1261q();
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM1261q;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m1310v(Object obj) {
        C2942t c2942t;
        Object objM1306e0 = AbstractC0575H.f1799d;
        if (mo1278G()) {
            do {
                Object obj2 = f1897Y.get(this);
                if (obj2 instanceof InterfaceC0617i0) {
                    if (obj2 instanceof C0639t0) {
                        C0639t0 c0639t0 = (C0639t0) obj2;
                        c0639t0.getClass();
                        if (C0639t0.f1888Z.get(c0639t0) == 1) {
                        }
                    }
                    objM1306e0 = m1306e0(obj2, new C0642v(m1290B(obj), false));
                }
                objM1306e0 = AbstractC0575H.f1799d;
                break;
            } while (objM1306e0 == AbstractC0575H.f1801f);
            if (objM1306e0 == AbstractC0575H.f1800e) {
                return true;
            }
        }
        if (objM1306e0 == AbstractC0575H.f1799d) {
            Throwable thM1290B = null;
            loop1: while (true) {
                Object obj3 = f1897Y.get(this);
                if (obj3 instanceof C0639t0) {
                    synchronized (obj3) {
                        try {
                            C0639t0 c0639t1 = (C0639t0) obj3;
                            c0639t1.getClass();
                            if (C0639t0.f1890p0.get(c0639t1) == AbstractC0575H.f1803h) {
                                c2942t = AbstractC0575H.f1802g;
                            } else {
                                boolean zM1284e = ((C0639t0) obj3).m1284e();
                                if (thM1290B == null) {
                                    thM1290B = m1290B(obj);
                                }
                                ((C0639t0) obj3).m1282b(thM1290B);
                                Throwable thM1283d = zM1284e ? null : ((C0639t0) obj3).m1283d();
                                if (thM1283d != null) {
                                    m1300V(((C0639t0) obj3).f1891Y, thM1283d);
                                }
                                c2942t = AbstractC0575H.f1799d;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } else if (obj3 instanceof InterfaceC0617i0) {
                    if (thM1290B == null) {
                        thM1290B = m1290B(obj);
                    }
                    InterfaceC0617i0 interfaceC0617i0 = (InterfaceC0617i0) obj3;
                    if (interfaceC0617i0.mo1220a()) {
                        C0645w0 c0645w0M1293H = m1293H(interfaceC0617i0);
                        if (c0645w0M1293H == null) {
                            continue;
                        } else {
                            C0639t0 c0639t2 = new C0639t0(c0645w0M1293H, thM1290B);
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1897Y;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0617i0, c0639t2)) {
                                    m1300V(c0645w0M1293H, thM1290B);
                                    c2942t = AbstractC0575H.f1799d;
                                } else if (atomicReferenceFieldUpdater.get(this) != interfaceC0617i0) {
                                }
                            }
                        }
                    } else {
                        Object objM1306e1 = m1306e0(obj3, new C0642v(thM1290B, false));
                        if (objM1306e1 == AbstractC0575H.f1799d) {
                            throw new IllegalStateException(("Cannot happen in " + obj3).toString());
                        }
                        if (objM1306e1 != AbstractC0575H.f1801f) {
                            objM1306e0 = objM1306e1;
                            break;
                        }
                    }
                } else {
                    c2942t = AbstractC0575H.f1802g;
                }
                objM1306e0 = c2942t;
                break;
            }
        }
        if (objM1306e0 != AbstractC0575H.f1799d && objM1306e0 != AbstractC0575H.f1800e) {
            if (objM1306e0 == AbstractC0575H.f1802g) {
                return false;
            }
            mo1213r(objM1306e0);
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public void mo1311w(CancellationException cancellationException) {
        m1310v(cancellationException);
    }

    /* JADX INFO: renamed from: x */
    public final boolean m1312x(Throwable th2) {
        if (mo1297N()) {
            return true;
        }
        boolean z6 = th2 instanceof CancellationException;
        InterfaceC0630p interfaceC0630p = (InterfaceC0630p) f1898Z.get(this);
        if (interfaceC0630p == null || interfaceC0630p == C0649y0.f1903Y) {
            return z6;
        }
        return interfaceC0630p.mo1276b(th2) || z6;
    }

    /* JADX INFO: renamed from: y */
    public String mo1227y() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: z */
    public boolean mo1146z(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return m1310v(th2) && mo1277F();
    }

    /* JADX INFO: renamed from: Z */
    public void mo1302Z() {
    }

    /* JADX INFO: renamed from: J */
    public void mo1222J(C0644w c0644w) {
        throw c0644w;
    }

    /* JADX INFO: renamed from: X */
    public void m1301X(Throwable th2) {
    }

    /* JADX INFO: renamed from: Y */
    public void mo1223Y(Object obj) {
    }

    /* JADX INFO: renamed from: r */
    public void mo1213r(Object obj) {
    }
}
