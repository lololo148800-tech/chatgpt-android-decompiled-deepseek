package p349O0;

import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import mm.C17296C;
import mm.C17309l;
import p025An.AbstractC0575H;
import p025An.C0624m;
import p025An.C0625m0;
import p025An.C0631p0;
import p025An.InterfaceC0620k;
import p025An.InterfaceC0627n0;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p197Hj.C3457c;
import p229J0.C4171z3;
import p273Kl.C4714D;
import p292Lg.C5034f;
import p392Q0.C6546d;
import p392Q0.C6548f;
import p491U0.C7534b;
import p523V9.AbstractC8154o0;
import p537W0.C8410b;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9562n;
import p586Y0.C9550b;
import p586Y0.C9557i;
import p692d0.C12954G;
import p720e6.C13288c;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import p909nm.C17689w;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: O0.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6032u0 extends AbstractC6025r {

    /* JADX INFO: renamed from: w */
    public static final C2153Q0 f19643w = AbstractC2124C.m3204c(C7534b.f23880p0);

    /* JADX INFO: renamed from: x */
    public static final AtomicReference f19644x = new AtomicReference(Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public long f19645a;

    /* JADX INFO: renamed from: b */
    public final C6003g f19646b;

    /* JADX INFO: renamed from: c */
    public final Object f19647c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0627n0 f19648d;

    /* JADX INFO: renamed from: e */
    public Throwable f19649e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f19650f;

    /* JADX INFO: renamed from: g */
    public Object f19651g;

    /* JADX INFO: renamed from: h */
    public C12954G f19652h;

    /* JADX INFO: renamed from: i */
    public final C6546d f19653i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f19654j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f19655k;

    /* JADX INFO: renamed from: l */
    public final LinkedHashMap f19656l;

    /* JADX INFO: renamed from: m */
    public final LinkedHashMap f19657m;

    /* JADX INFO: renamed from: n */
    public ArrayList f19658n;

    /* JADX INFO: renamed from: o */
    public LinkedHashSet f19659o;

    /* JADX INFO: renamed from: p */
    public C0624m f19660p;

    /* JADX INFO: renamed from: q */
    public C13288c f19661q;

    /* JADX INFO: renamed from: r */
    public boolean f19662r;

    /* JADX INFO: renamed from: s */
    public final C2153Q0 f19663s;

    /* JADX INFO: renamed from: t */
    public final C0631p0 f19664t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC18776i f19665u;

    /* JADX INFO: renamed from: v */
    public final C5975S f19666v;

    public C6032u0(InterfaceC18776i interfaceC18776i) {
        C6003g c6003g = new C6003g(new C3457c(this, 23));
        this.f19646b = c6003g;
        this.f19647c = new Object();
        this.f19650f = new ArrayList();
        this.f19652h = new C12954G();
        this.f19653i = new C6546d(new C6029t[16]);
        this.f19654j = new ArrayList();
        this.f19655k = new ArrayList();
        this.f19656l = new LinkedHashMap();
        this.f19657m = new LinkedHashMap();
        this.f19663s = AbstractC2124C.m3204c(EnumC6020o0.f19544o0);
        C0631p0 c0631p0 = new C0631p0((InterfaceC0627n0) interfaceC18776i.get(C0625m0.f1875Y));
        c0631p0.mo1271H0(new C4171z3(this, 24));
        this.f19664t = c0631p0;
        this.f19665u = interfaceC18776i.plus(c6003g).plus(c0631p0);
        this.f19666v = new C5975S(7);
    }

    /* JADX INFO: renamed from: D */
    public static final void m6590D(ArrayList arrayList, C6032u0 c6032u0, C6029t c6029t) {
        arrayList.clear();
        synchronized (c6032u0.f19647c) {
            Iterator it = c6032u0.f19655k.iterator();
            if (it.hasNext()) {
                ((AbstractC5981V) it.next()).getClass();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m6591G(C6032u0 c6032u0, Exception exc, boolean z6, int i10) throws Exception {
        if ((i10 & 4) != 0) {
            z6 = false;
        }
        c6032u0.m6603F(exc, null, z6);
    }

    /* JADX INFO: renamed from: p */
    public static final Object m6592p(C6032u0 c6032u0, C6030t0 c6030t0) {
        C0624m c0624m;
        if (c6032u0.m6610z()) {
            return C17296C.f55119a;
        }
        C0624m c0624m2 = new C0624m(1, AbstractC8154o0.m8714e(c6030t0));
        c0624m2.m1262r();
        synchronized (c6032u0.f19647c) {
            if (c6032u0.m6610z()) {
                c0624m = c0624m2;
            } else {
                c6032u0.f19660p = c0624m2;
                c0624m = null;
            }
        }
        if (c0624m != null) {
            c0624m.resumeWith(C17296C.f55119a);
        }
        Object objM1261q = c0624m2.m1261q();
        return objM1261q == EnumC19250a.f61036Y ? objM1261q : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m6593q(C6032u0 c6032u0) {
        int i10;
        List list;
        synchronized (c6032u0.f19647c) {
            try {
                if (c6032u0.f19656l.isEmpty()) {
                    list = C17689w.f56480Y;
                } else {
                    ArrayList arrayListM19390s = AbstractC17682p.m19390s(c6032u0.f19656l.values());
                    c6032u0.f19656l.clear();
                    ArrayList arrayList = new ArrayList(arrayListM19390s.size());
                    int size = arrayListM19390s.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        AbstractC5981V abstractC5981V = (AbstractC5981V) arrayListM19390s.get(i11);
                        arrayList.add(new C17309l(abstractC5981V, c6032u0.f19657m.get(abstractC5981V)));
                    }
                    c6032u0.f19657m.clear();
                    list = arrayList;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size2 = list.size();
        for (i10 = 0; i10 < size2; i10++) {
            C17309l c17309l = (C17309l) list.get(i10);
        }
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m6594r(C6032u0 c6032u0) {
        boolean zM6609y;
        synchronized (c6032u0.f19647c) {
            zM6609y = c6032u0.m6609y();
        }
        return zM6609y;
    }

    /* JADX INFO: renamed from: s */
    public static final C6029t m6595s(C6032u0 c6032u0, C6029t c6029t, C12954G c12954g) {
        C9550b c9550bMo10041C;
        c6032u0.getClass();
        if (c6029t.f19614C0.f19553E || c6029t.f19615D0) {
            return null;
        }
        LinkedHashSet linkedHashSet = c6032u0.f19659o;
        if (linkedHashSet != null && linkedHashSet.contains(c6029t)) {
            return null;
        }
        C4171z3 c4171z3 = new C4171z3(c6029t, 25);
        C5034f c5034f = new C5034f(c6029t, 11, c12954g);
        AbstractC9556h abstractC9556hM10087k = AbstractC9562n.m10087k();
        C9550b c9550b = abstractC9556hM10087k instanceof C9550b ? (C9550b) abstractC9556hM10087k : null;
        if (c9550b == null || (c9550bMo10041C = c9550b.mo10041C(c4171z3, c5034f)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        try {
            AbstractC9556h abstractC9556hM10070j = c9550bMo10041C.m10070j();
            if (c12954g != null) {
                try {
                    if (c12954g.m14631h()) {
                        C4714D c4714d = new C4714D(c12954g, 12, c6029t);
                        C6021p c6021p = c6029t.f19614C0;
                        if (c6021p.f19553E) {
                            C5997d.m6470z("Preparing a composition while composing is not supported");
                            throw null;
                        }
                        c6021p.f19553E = true;
                        try {
                            c4714d.invoke();
                            c6021p.f19553E = false;
                        } catch (Throwable th2) {
                            c6021p.f19553E = false;
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    AbstractC9556h.m10068p(abstractC9556hM10070j);
                    throw th3;
                }
            }
            boolean zM6584u = c6029t.m6584u();
            AbstractC9556h.m10068p(abstractC9556hM10070j);
            m6598v(c9550bMo10041C);
            if (!zM6584u) {
                c6029t = null;
            }
            return c6029t;
        } catch (Throwable th4) {
            m6598v(c9550bMo10041C);
            throw th4;
        }
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m6596t(C6032u0 c6032u0) {
        boolean z6;
        List listM6599A;
        synchronized (c6032u0.f19647c) {
            z6 = true;
            if (!c6032u0.f19652h.m14630g()) {
                C6548f c6548f = new C6548f(c6032u0.f19652h);
                c6032u0.f19652h = new C12954G();
                synchronized (c6032u0.f19647c) {
                    listM6599A = c6032u0.m6599A();
                }
                try {
                    int size = listM6599A.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((C6029t) listM6599A.get(i10)).m6585v(c6548f);
                        if (((EnumC6020o0) c6032u0.f19663s.getValue()).compareTo(EnumC6020o0.f19543Z) <= 0) {
                            break;
                        }
                    }
                    synchronized (c6032u0.f19647c) {
                        c6032u0.f19652h = new C12954G();
                    }
                    synchronized (c6032u0.f19647c) {
                        if (c6032u0.m6608x() != null) {
                            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                        }
                        if (!c6032u0.f19653i.m7109n() && !c6032u0.m6609y()) {
                            z6 = false;
                        }
                    }
                } catch (Throwable th2) {
                    synchronized (c6032u0.f19647c) {
                        C12954G c12954g = c6032u0.f19652h;
                        c12954g.getClass();
                        for (Object obj : c6548f) {
                            c12954g.f41144b[c12954g.m14627d(obj)] = obj;
                        }
                        throw th2;
                    }
                }
            } else if (!c6032u0.f19653i.m7109n() && !c6032u0.m6609y()) {
                z6 = false;
            }
        }
        return z6;
    }

    /* JADX INFO: renamed from: u */
    public static final void m6597u(C6032u0 c6032u0, InterfaceC0627n0 interfaceC0627n0) {
        synchronized (c6032u0.f19647c) {
            Throwable th2 = c6032u0.f19649e;
            if (th2 != null) {
                throw th2;
            }
            if (((EnumC6020o0) c6032u0.f19663s.getValue()).compareTo(EnumC6020o0.f19543Z) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (c6032u0.f19648d != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            c6032u0.f19648d = interfaceC0627n0;
            c6032u0.m6608x();
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m6598v(C9550b c9550b) {
        try {
            if (c9550b.mo10058v() instanceof C9557i) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            c9550b.mo10043c();
        } catch (Throwable th2) {
            c9550b.mo10043c();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX INFO: renamed from: A */
    public final List m6599A() {
        Object obj = this.f19651g;
        ?? r6 = obj;
        if (obj == null) {
            ArrayList arrayList = this.f19650f;
            Object arrayList2 = arrayList.isEmpty() ? C17689w.f56480Y : new ArrayList(arrayList);
            this.f19651g = arrayList2;
            r6 = arrayList2;
        }
        return r6;
    }

    /* JADX INFO: renamed from: B */
    public final void m6600B() {
        synchronized (this.f19647c) {
            this.f19662r = true;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m6601C(C6029t c6029t) {
        synchronized (this.f19647c) {
            ArrayList arrayList = this.f19655k;
            if (arrayList.size() > 0) {
                ((AbstractC5981V) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final List m6602E(List list, C12954G c12954g) {
        C9550b c9550bMo10041C;
        ArrayList arrayList;
        Object obj;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = list.get(i10);
            ((AbstractC5981V) obj2).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj2);
        }
        for (Map.Entry entry : map.entrySet()) {
            C6029t c6029t = (C6029t) entry.getKey();
            List list2 = (List) entry.getValue();
            C5997d.m6437X(!c6029t.f19614C0.f19553E);
            C4171z3 c4171z3 = new C4171z3(c6029t, 25);
            C5034f c5034f = new C5034f(c6029t, 11, c12954g);
            AbstractC9556h abstractC9556hM10087k = AbstractC9562n.m10087k();
            C9550b c9550b = abstractC9556hM10087k instanceof C9550b ? (C9550b) abstractC9556hM10087k : null;
            if (c9550b == null || (c9550bMo10041C = c9550b.mo10041C(c4171z3, c5034f)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC9556h abstractC9556hM10070j = c9550bMo10041C.m10070j();
                try {
                    synchronized (this.f19647c) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            AbstractC5981V abstractC5981V = (AbstractC5981V) list2.get(i11);
                            LinkedHashMap linkedHashMap = this.f19656l;
                            abstractC5981V.getClass();
                            List list3 = (List) linkedHashMap.get(null);
                            if (list3 != null) {
                                Object objM19395C = AbstractC17686t.m19395C(list3);
                                if (list3.isEmpty()) {
                                    linkedHashMap.remove(null);
                                }
                                obj = objM19395C;
                            } else {
                                obj = null;
                            }
                            arrayList.add(new C17309l(abstractC5981V, obj));
                        }
                    }
                    int size3 = arrayList.size();
                    for (int i12 = 0; i12 < size3; i12++) {
                        if (((C17309l) arrayList.get(i12)).f55137Z != null) {
                            int size4 = arrayList.size();
                            for (int i13 = 0; i13 < size4; i13++) {
                                if (((C17309l) arrayList.get(i13)).f55137Z == null) {
                                    ArrayList arrayList3 = new ArrayList(arrayList.size());
                                    int size5 = arrayList.size();
                                    for (int i14 = 0; i14 < size5; i14++) {
                                        C17309l c17309l = (C17309l) arrayList.get(i14);
                                        if (c17309l.f55137Z == null) {
                                        }
                                    }
                                    synchronized (this.f19647c) {
                                        AbstractC17686t.m19398v(arrayList3, this.f19655k);
                                    }
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size6 = arrayList.size();
                                    for (int i15 = 0; i15 < size6; i15++) {
                                        Object obj3 = arrayList.get(i15);
                                        if (((C17309l) obj3).f55137Z != null) {
                                            arrayList4.add(obj3);
                                        }
                                    }
                                    arrayList = arrayList4;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    c6029t.m6577n(arrayList);
                    AbstractC9556h.m10068p(abstractC9556hM10070j);
                    m6598v(c9550bMo10041C);
                } catch (Throwable th2) {
                    AbstractC9556h.m10068p(abstractC9556hM10070j);
                    throw th2;
                }
            } catch (Throwable th3) {
                m6598v(c9550bMo10041C);
                throw th3;
            }
        }
        return AbstractC17680n.m19322C0(map.keySet());
    }

    /* JADX INFO: renamed from: F */
    public final void m6603F(Exception exc, C6029t c6029t, boolean z6) throws Exception {
        if (!((Boolean) f19644x.get()).booleanValue() || (exc instanceof C6011k)) {
            synchronized (this.f19647c) {
                C13288c c13288c = this.f19661q;
                if (c13288c != null) {
                    throw ((Exception) c13288c.f42001Y);
                }
                this.f19661q = new C13288c(exc);
            }
            throw exc;
        }
        synchronized (this.f19647c) {
            try {
                int i10 = AbstractC5993b.f19471b;
                AbstractC15256t.m16466d("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
                this.f19654j.clear();
                this.f19653i.m7104i();
                this.f19652h = new C12954G();
                this.f19655k.clear();
                this.f19656l.clear();
                this.f19657m.clear();
                this.f19661q = new C13288c(exc);
                if (c6029t != null) {
                    m6604H(c6029t);
                }
                m6608x();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m6604H(C6029t c6029t) {
        ArrayList arrayList = this.f19658n;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f19658n = arrayList;
        }
        if (!arrayList.contains(c6029t)) {
            arrayList.add(c6029t);
        }
        this.f19650f.remove(c6029t);
        this.f19651g = null;
    }

    /* JADX INFO: renamed from: I */
    public final void m6605I() {
        InterfaceC0620k interfaceC0620kM6608x;
        synchronized (this.f19647c) {
            if (this.f19662r) {
                this.f19662r = false;
                interfaceC0620kM6608x = m6608x();
            } else {
                interfaceC0620kM6608x = null;
            }
        }
        if (interfaceC0620kM6608x != null) {
            ((C0624m) interfaceC0620kM6608x).resumeWith(C17296C.f55119a);
        }
    }

    /* JADX INFO: renamed from: J */
    public final Object m6606J(AbstractC19694j abstractC19694j) throws Throwable {
        Object objM1168P = AbstractC0575H.m1168P(this.f19646b, new C6026r0(this, new C6030t0(this, null), C5997d.m6424K(abstractC19694j.getContext()), null), abstractC19694j);
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        C17296C c17296c = C17296C.f55119a;
        if (objM1168P != enumC19250a) {
            objM1168P = c17296c;
        }
        return objM1168P == enumC19250a ? objM1168P : c17296c;
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: a */
    public final void mo6483a(C6029t c6029t, C8410b c8410b) throws Exception {
        C9550b c9550bMo10041C;
        boolean z6 = c6029t.f19614C0.f19553E;
        try {
            C4171z3 c4171z3 = new C4171z3(c6029t, 25);
            C5034f c5034f = new C5034f(c6029t, 11, null);
            AbstractC9556h abstractC9556hM10087k = AbstractC9562n.m10087k();
            C9550b c9550b = abstractC9556hM10087k instanceof C9550b ? (C9550b) abstractC9556hM10087k : null;
            if (c9550b == null || (c9550bMo10041C = c9550b.mo10041C(c4171z3, c5034f)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC9556h abstractC9556hM10070j = c9550bMo10041C.m10070j();
                try {
                    c6029t.m6572i(c8410b);
                    AbstractC9556h.m10068p(abstractC9556hM10070j);
                    m6598v(c9550bMo10041C);
                    if (!z6) {
                        AbstractC9562n.m10087k().mo10052m();
                    }
                    synchronized (this.f19647c) {
                        if (((EnumC6020o0) this.f19663s.getValue()).compareTo(EnumC6020o0.f19543Z) > 0 && !m6599A().contains(c6029t)) {
                            this.f19650f.add(c6029t);
                            this.f19651g = null;
                        }
                    }
                    try {
                        m6601C(c6029t);
                        try {
                            c6029t.m6567d();
                            c6029t.m6569f();
                            if (z6) {
                                return;
                            }
                            AbstractC9562n.m10087k().mo10052m();
                        } catch (Exception e10) {
                            m6591G(this, e10, false, 6);
                        }
                    } catch (Exception e11) {
                        m6603F(e11, c6029t, true);
                    }
                } catch (Throwable th2) {
                    AbstractC9556h.m10068p(abstractC9556hM10070j);
                    throw th2;
                }
            } catch (Throwable th3) {
                m6598v(c9550bMo10041C);
                throw th3;
            }
        } catch (Exception e12) {
            m6603F(e12, c6029t, true);
        }
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: c */
    public final boolean mo6485c() {
        return ((Boolean) f19644x.get()).booleanValue();
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: d */
    public final boolean mo6486d() {
        return false;
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: e */
    public final boolean mo6487e() {
        return false;
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: g */
    public final int mo6489g() {
        return 1000;
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: h */
    public final InterfaceC18776i mo6490h() {
        return this.f19665u;
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: i */
    public final void mo6491i(C6029t c6029t) {
        InterfaceC0620k interfaceC0620kM6608x;
        synchronized (this.f19647c) {
            if (this.f19653i.m7105j(c6029t)) {
                interfaceC0620kM6608x = null;
            } else {
                this.f19653i.m7099c(c6029t);
                interfaceC0620kM6608x = m6608x();
            }
        }
        if (interfaceC0620kM6608x != null) {
            ((C0624m) interfaceC0620kM6608x).resumeWith(C17296C.f55119a);
        }
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: l */
    public final void mo6494l(C6029t c6029t) {
        synchronized (this.f19647c) {
            try {
                LinkedHashSet linkedHashSet = this.f19659o;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f19659o = linkedHashSet;
                }
                linkedHashSet.add(c6029t);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: o */
    public final void mo6497o(C6029t c6029t) {
        synchronized (this.f19647c) {
            this.f19650f.remove(c6029t);
            this.f19651g = null;
            this.f19653i.m7110o(c6029t);
            this.f19654j.remove(c6029t);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m6607w() {
        synchronized (this.f19647c) {
            if (((EnumC6020o0) this.f19663s.getValue()).compareTo(EnumC6020o0.f19546q0) >= 0) {
                C2153Q0 c2153q0 = this.f19663s;
                EnumC6020o0 enumC6020o0 = EnumC6020o0.f19543Z;
                c2153q0.getClass();
                c2153q0.m3251l(null, enumC6020o0);
            }
        }
        this.f19664t.mo1275e(null);
    }

    /* JADX INFO: renamed from: x */
    public final InterfaceC0620k m6608x() {
        C2153Q0 c2153q0 = this.f19663s;
        int iCompareTo = ((EnumC6020o0) c2153q0.getValue()).compareTo(EnumC6020o0.f19543Z);
        ArrayList arrayList = this.f19655k;
        ArrayList arrayList2 = this.f19654j;
        C6546d c6546d = this.f19653i;
        if (iCompareTo <= 0) {
            this.f19650f.clear();
            this.f19651g = C17689w.f56480Y;
            this.f19652h = new C12954G();
            c6546d.m7104i();
            arrayList2.clear();
            arrayList.clear();
            this.f19658n = null;
            C0624m c0624m = this.f19660p;
            if (c0624m != null) {
                c0624m.mo1244b(null);
            }
            this.f19660p = null;
            this.f19661q = null;
            return null;
        }
        C13288c c13288c = this.f19661q;
        EnumC6020o0 enumC6020o0 = EnumC6020o0.f19547r0;
        EnumC6020o0 enumC6020o1 = EnumC6020o0.f19544o0;
        if (c13288c == null) {
            if (this.f19648d == null) {
                this.f19652h = new C12954G();
                c6546d.m7104i();
                if (m6609y()) {
                    enumC6020o1 = EnumC6020o0.f19545p0;
                }
            } else {
                enumC6020o1 = (c6546d.m7109n() || this.f19652h.m14631h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || m6609y()) ? enumC6020o0 : EnumC6020o0.f19546q0;
            }
        }
        c2153q0.getClass();
        c2153q0.m3251l(null, enumC6020o1);
        if (enumC6020o1 != enumC6020o0) {
            return null;
        }
        C0624m c0624m2 = this.f19660p;
        this.f19660p = null;
        return c0624m2;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m6609y() {
        return (this.f19662r || this.f19646b.f19493r0.get() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m6610z() {
        boolean z6;
        synchronized (this.f19647c) {
            z6 = this.f19652h.m14631h() || this.f19653i.m7109n() || m6609y();
        }
        return z6;
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: j */
    public final void mo6492j(Set set) {
    }
}
