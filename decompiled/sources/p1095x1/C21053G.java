package p1095x1;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0246e2;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1140z1.C21658D;
import p1140z1.C21663I;
import p1140z1.C21711p0;
import p349O0.AbstractC6025r;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.C6029t;
import p349O0.InterfaceC6009j;
import p392Q0.C6543a;
import p392Q0.C6546d;
import p537W0.C8410b;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9562n;
import p586Y0.AbstractC9567s;
import p586Y0.C9549a;
import p692d0.C12951D;
import p692d0.C12954G;
import ph.C18416d;

/* JADX INFO: renamed from: x1.G */
/* JADX INFO: loaded from: classes.dex */
public final class C21053G implements InterfaceC6009j {

    /* JADX INFO: renamed from: A0 */
    public int f66953A0;

    /* JADX INFO: renamed from: Y */
    public final C21658D f66955Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC6025r f66956Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC21087h0 f66957o0;

    /* JADX INFO: renamed from: p0 */
    public int f66958p0;

    /* JADX INFO: renamed from: q0 */
    public int f66959q0;

    /* JADX INFO: renamed from: z0 */
    public int f66968z0;

    /* JADX INFO: renamed from: r0 */
    public final HashMap f66960r0 = new HashMap();

    /* JADX INFO: renamed from: s0 */
    public final HashMap f66961s0 = new HashMap();

    /* JADX INFO: renamed from: t0 */
    public final C21048B f66962t0 = new C21048B(this);

    /* JADX INFO: renamed from: u0 */
    public final C21105z f66963u0 = new C21105z(this);

    /* JADX INFO: renamed from: v0 */
    public final HashMap f66964v0 = new HashMap();

    /* JADX INFO: renamed from: w0 */
    public final C21085g0 f66965w0 = new C21085g0();

    /* JADX INFO: renamed from: x0 */
    public final LinkedHashMap f66966x0 = new LinkedHashMap();

    /* JADX INFO: renamed from: y0 */
    public final C6546d f66967y0 = new C6546d(new Object[16]);

    /* JADX INFO: renamed from: B0 */
    public final String f66954B0 = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public C21053G(C21658D c21658d, InterfaceC21087h0 interfaceC21087h0) {
        this.f66955Y = c21658d;
        this.f66957o0 = interfaceC21087h0;
    }

    /* JADX INFO: renamed from: h */
    public static C6029t m21507h(C6029t c6029t, C21658D c21658d, boolean z6, AbstractC6025r abstractC6025r, C8410b c8410b) {
        if (c6029t == null || c6029t.f19615D0) {
            ViewGroup.LayoutParams layoutParams = AbstractC0246e2.f937a;
            c6029t = new C6029t(abstractC6025r, new C21711p0(c21658d));
        }
        if (z6) {
            C6021p c6021p = c6029t.f19614C0;
            c6021p.f19589y = 100;
            c6021p.f19588x = true;
            c6029t.m6573j(c8410b);
            if (c6021p.f19553E || c6021p.f19589y != 100) {
                C5997d.m6443b0("Cannot disable reuse from root if it was caused by other groups");
                throw null;
            }
            c6021p.f19589y = -1;
            c6021p.f19588x = false;
        } else {
            c6029t.m6573j(c8410b);
        }
        return c6029t;
    }

    @Override // p349O0.InterfaceC6009j
    /* JADX INFO: renamed from: a */
    public final void mo6477a() {
        C21658D c21658d = this.f66955Y;
        c21658d.f68661x0 = true;
        HashMap map = this.f66960r0;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            C6029t c6029t = ((C21104y) it.next()).f67036c;
            if (c6029t != null) {
                c6029t.dispose();
            }
        }
        c21658d.m22049m0();
        c21658d.f68661x0 = false;
        map.clear();
        this.f66961s0.clear();
        this.f66953A0 = 0;
        this.f66968z0 = 0;
        this.f66964v0.clear();
        m21509d();
    }

    @Override // p349O0.InterfaceC6009j
    /* JADX INFO: renamed from: b */
    public final void mo6478b() {
        m21510e(true);
    }

    /* JADX INFO: renamed from: c */
    public final void m21508c(int i10) {
        boolean z6;
        boolean z10 = false;
        this.f66968z0 = 0;
        int i11 = (((C6543a) this.f66955Y.m22057r()).f21176Y.f21184o0 - this.f66953A0) - 1;
        if (i10 <= i11) {
            this.f66965w0.clear();
            if (i10 <= i11) {
                int i12 = i10;
                while (true) {
                    Object obj = this.f66960r0.get((C21658D) ((C6543a) this.f66955Y.m22057r()).get(i12));
                    AbstractC16544l.m18091d(obj);
                    this.f66965w0.f67008Y.add(((C21104y) obj).f67034a);
                    if (i12 == i11) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f66957o0.mo21574d(this.f66965w0);
            AbstractC9556h abstractC9556hM10108d = AbstractC9567s.m10108d();
            InterfaceC1436k interfaceC1436kMo10046f = abstractC9556hM10108d != null ? abstractC9556hM10108d.mo10046f() : null;
            AbstractC9556h abstractC9556hM10109e = AbstractC9567s.m10109e(abstractC9556hM10108d);
            z6 = false;
            while (i11 >= i10) {
                try {
                    C21658D c21658d = (C21658D) ((C6543a) this.f66955Y.m22057r()).get(i11);
                    Object obj2 = this.f66960r0.get(c21658d);
                    AbstractC16544l.m18091d(obj2);
                    C21104y c21104y = (C21104y) obj2;
                    Object obj3 = c21104y.f67034a;
                    if (this.f66965w0.f67008Y.contains(obj3)) {
                        this.f66968z0++;
                        if (((Boolean) c21104y.f67039f.getValue()).booleanValue()) {
                            c21658d.m22003A().f68725w0 = 3;
                            C21663I c21663iM22070z = c21658d.m22070z();
                            if (c21663iM22070z != null) {
                                c21663iM22070z.f68694u0 = 3;
                            }
                            c21104y.f67039f.setValue(Boolean.FALSE);
                            z6 = true;
                        }
                    } else {
                        C21658D c21658d2 = this.f66955Y;
                        c21658d2.f68661x0 = true;
                        this.f66960r0.remove(c21658d);
                        C6029t c6029t = c21104y.f67036c;
                        if (c6029t != null) {
                            c6029t.dispose();
                        }
                        this.f66955Y.m22051n0(i11, 1);
                        c21658d2.f68661x0 = false;
                    }
                    this.f66961s0.remove(obj3);
                    i11--;
                } catch (Throwable th2) {
                    AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
                    throw th2;
                }
            }
            AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
        } else {
            z6 = false;
        }
        if (z6) {
            synchronized (AbstractC9562n.f28759b) {
                C12954G c12954g = ((C9549a) AbstractC9562n.f28766i.get()).f28725h;
                if (c12954g != null && c12954g.m14631h()) {
                    z10 = true;
                }
            }
            if (z10) {
                AbstractC9562n.m10077a();
            }
        }
        m21509d();
    }

    /* JADX INFO: renamed from: d */
    public final void m21509d() {
        int i10 = ((C6543a) this.f66955Y.m22057r()).f21176Y.f21184o0;
        HashMap map = this.f66960r0;
        if (map.size() != i10) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + map.size() + ") and the children count on the SubcomposeLayout (" + i10 + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((i10 - this.f66968z0) - this.f66953A0 < 0) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Incorrect state. Total children ", ". Reusable children ");
            sbM11057o.append(this.f66968z0);
            sbM11057o.append(". Precomposed children ");
            sbM11057o.append(this.f66953A0);
            throw new IllegalArgumentException(sbM11057o.toString().toString());
        }
        HashMap map2 = this.f66964v0;
        if (map2.size() == this.f66953A0) {
            return;
        }
        throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f66953A0 + ". Map size " + map2.size()).toString());
    }

    /* JADX INFO: renamed from: e */
    public final void m21510e(boolean z6) {
        this.f66953A0 = 0;
        this.f66964v0.clear();
        C21658D c21658d = this.f66955Y;
        int i10 = ((C6543a) c21658d.m22057r()).f21176Y.f21184o0;
        if (this.f66968z0 != i10) {
            this.f66968z0 = i10;
            AbstractC9556h abstractC9556hM10108d = AbstractC9567s.m10108d();
            InterfaceC1436k interfaceC1436kMo10046f = abstractC9556hM10108d != null ? abstractC9556hM10108d.mo10046f() : null;
            AbstractC9556h abstractC9556hM10109e = AbstractC9567s.m10109e(abstractC9556hM10108d);
            for (int i11 = 0; i11 < i10; i11++) {
                try {
                    C21658D c21658d2 = (C21658D) ((C6543a) c21658d.m22057r()).get(i11);
                    C21104y c21104y = (C21104y) this.f66960r0.get(c21658d2);
                    if (c21104y != null && ((Boolean) c21104y.f67039f.getValue()).booleanValue()) {
                        c21658d2.m22003A().f68725w0 = 3;
                        C21663I c21663iM22070z = c21658d2.m22070z();
                        if (c21663iM22070z != null) {
                            c21663iM22070z.f68694u0 = 3;
                        }
                        if (z6) {
                            C6029t c6029t = c21104y.f67036c;
                            if (c6029t != null) {
                                c6029t.m6574k();
                            }
                            c21104y.f67039f = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                        } else {
                            c21104y.f67039f.setValue(Boolean.FALSE);
                        }
                        c21104y.f67034a = AbstractC21075b0.f66993a;
                    }
                } catch (Throwable th2) {
                    AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
                    throw th2;
                }
            }
            AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
            this.f66961s0.clear();
        }
        m21509d();
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC21077c0 m21511f(Object obj, InterfaceC1439n interfaceC1439n) {
        C21658D c21658d = this.f66955Y;
        if (!c21658d.m22024V()) {
            return new C21051E();
        }
        m21509d();
        if (!this.f66961s0.containsKey(obj)) {
            this.f66966x0.remove(obj);
            HashMap map = this.f66964v0;
            Object objM21513j = map.get(obj);
            if (objM21513j == null) {
                objM21513j = m21513j(obj);
                if (objM21513j != null) {
                    int iM7107l = ((C6543a) c21658d.m22057r()).f21176Y.m7107l(objM21513j);
                    int i10 = ((C6543a) c21658d.m22057r()).f21176Y.f21184o0;
                    c21658d.f68661x0 = true;
                    c21658d.m22039g0(iM7107l, i10, 1);
                    c21658d.f68661x0 = false;
                    this.f66953A0++;
                } else {
                    int i11 = ((C6543a) c21658d.m22057r()).f21176Y.f21184o0;
                    C21658D c21658d2 = new C21658D(true, 2, 0);
                    c21658d.f68661x0 = true;
                    c21658d.m22016N(i11, c21658d2);
                    c21658d.f68661x0 = false;
                    this.f66953A0++;
                    objM21513j = c21658d2;
                }
                map.put(obj, objM21513j);
            }
            m21512g((C21658D) objM21513j, obj, interfaceC1439n);
        }
        return new C21052F(this, obj);
    }

    /* JADX INFO: renamed from: g */
    public final void m21512g(C21658D c21658d, Object obj, InterfaceC1439n interfaceC1439n) {
        boolean z6;
        HashMap map = this.f66960r0;
        Object obj2 = map.get(c21658d);
        Object obj3 = obj2;
        if (obj2 == null) {
            C8410b c8410b = AbstractC21086h.f67009a;
            C21104y c21104y = new C21104y();
            c21104y.f67034a = obj;
            c21104y.f67035b = c8410b;
            c21104y.f67036c = null;
            c21104y.f67039f = C5997d.m6430Q(Boolean.TRUE, C5975S.f19448r0);
            map.put(c21658d, c21104y);
            obj3 = c21104y;
        }
        C21104y c21104y2 = (C21104y) obj3;
        C6029t c6029t = c21104y2.f67036c;
        if (c6029t != null) {
            synchronized (c6029t.f19619p0) {
                z6 = ((C12951D) c6029t.f19629z0.f42001Y).f41127e > 0;
            }
        } else {
            z6 = true;
        }
        if (c21104y2.f67035b != interfaceC1439n || z6 || c21104y2.f67037d) {
            c21104y2.f67035b = interfaceC1439n;
            AbstractC9556h abstractC9556hM10108d = AbstractC9567s.m10108d();
            InterfaceC1436k interfaceC1436kMo10046f = abstractC9556hM10108d != null ? abstractC9556hM10108d.mo10046f() : null;
            AbstractC9556h abstractC9556hM10109e = AbstractC9567s.m10109e(abstractC9556hM10108d);
            try {
                C21658D c21658d2 = this.f66955Y;
                c21658d2.f68661x0 = true;
                InterfaceC1439n interfaceC1439n2 = c21104y2.f67035b;
                C6029t c6029t2 = c21104y2.f67036c;
                AbstractC6025r abstractC6025r = this.f66956Z;
                if (abstractC6025r == null) {
                    throw new IllegalStateException("parent composition reference not set");
                }
                c21104y2.f67036c = m21507h(c6029t2, c21658d, c21104y2.f67038e, abstractC6025r, new C8410b(new C18416d(c21104y2, 12, interfaceC1439n2), true, -1750409193));
                c21104y2.f67038e = false;
                c21658d2.f68661x0 = false;
                AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
                c21104y2.f67037d = false;
            } catch (Throwable th2) {
                AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
                throw th2;
            }
        }
    }

    @Override // p349O0.InterfaceC6009j
    /* JADX INFO: renamed from: i */
    public final void mo6479i() {
        m21510e(false);
    }

    /* JADX INFO: renamed from: j */
    public final C21658D m21513j(Object obj) {
        HashMap map;
        int i10;
        if (this.f66968z0 == 0) {
            return null;
        }
        C21658D c21658d = this.f66955Y;
        int i11 = ((C6543a) c21658d.m22057r()).f21176Y.f21184o0 - this.f66953A0;
        int i12 = i11 - this.f66968z0;
        int i13 = i11 - 1;
        int i14 = i13;
        while (true) {
            map = this.f66960r0;
            if (i14 < i12) {
                i10 = -1;
                break;
            }
            Object obj2 = map.get((C21658D) ((C6543a) c21658d.m22057r()).get(i14));
            AbstractC16544l.m18091d(obj2);
            if (AbstractC16544l.m18089b(((C21104y) obj2).f67034a, obj)) {
                i10 = i14;
                break;
            }
            i14--;
        }
        if (i10 == -1) {
            while (true) {
                if (i13 < i12) {
                    i14 = i13;
                    break;
                }
                Object obj3 = map.get((C21658D) ((C6543a) c21658d.m22057r()).get(i13));
                AbstractC16544l.m18091d(obj3);
                C21104y c21104y = (C21104y) obj3;
                Object obj4 = c21104y.f67034a;
                if (obj4 == AbstractC21075b0.f66993a || this.f66957o0.mo21573c(obj, obj4)) {
                    c21104y.f67034a = obj;
                    i14 = i13;
                    i10 = i14;
                    break;
                }
                i13--;
            }
        }
        if (i10 == -1) {
            return null;
        }
        if (i14 != i12) {
            c21658d.f68661x0 = true;
            c21658d.m22039g0(i14, i12, 1);
            c21658d.f68661x0 = false;
        }
        this.f66968z0--;
        C21658D c21658d2 = (C21658D) ((C6543a) c21658d.m22057r()).get(i12);
        Object obj5 = map.get(c21658d2);
        AbstractC16544l.m18091d(obj5);
        C21104y c21104y2 = (C21104y) obj5;
        c21104y2.f67039f = C5997d.m6430Q(Boolean.TRUE, C5975S.f19448r0);
        c21104y2.f67038e = true;
        c21104y2.f67037d = true;
        return c21658d2;
    }
}
