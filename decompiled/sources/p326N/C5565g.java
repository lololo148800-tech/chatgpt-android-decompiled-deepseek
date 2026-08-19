package p326N;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Size;
import io.sentry.C15358g1;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p001A.C0023L0;
import p001A.C0067i0;
import p003A1.AbstractC0168G;
import p084D4.C1920j;
import p1138z.C21572a;
import p117Eb.C2385o;
import p117Eb.C2388r;
import p155G.C2953e;
import p178H.AbstractC3174u0;
import p178H.C3123P;
import p178H.C3130X;
import p178H.C3142e0;
import p178H.InterfaceC3153k;
import p228J.AbstractC3794B0;
import p228J.C3815Q;
import p228J.C3824a;
import p228J.C3825a0;
import p228J.C3828c;
import p228J.C3830d;
import p228J.C3835f0;
import p228J.C3836g;
import p228J.C3837g0;
import p228J.C3838h;
import p228J.C3851n0;
import p228J.C3853o0;
import p228J.C3865u0;
import p228J.EnumC3804G0;
import p228J.InterfaceC3800E0;
import p228J.InterfaceC3805H;
import p228J.InterfaceC3806H0;
import p228J.InterfaceC3856q;
import p228J.InterfaceC3864u;
import p228J.InterfaceC3866v;
import p228J.InterfaceC3870x;
import p253K.AbstractC4503n;
import p283L5.AbstractC4941g;
import p514V.C7729c;
import p514V.C7730d;
import p523V9.AbstractC8072d6;
import p571X9.AbstractC9306j0;
import p720e6.C13287b;
import p720e6.C13288c;
import p817j$.util.Objects;

/* JADX INFO: renamed from: N.g */
/* JADX INFO: loaded from: classes.dex */
public final class C5565g implements InterfaceC3153k {

    /* JADX INFO: renamed from: A0 */
    public C7729c f18035A0;

    /* JADX INFO: renamed from: B0 */
    public final C3851n0 f18036B0;

    /* JADX INFO: renamed from: C0 */
    public final C3853o0 f18037C0;

    /* JADX INFO: renamed from: D0 */
    public final C3853o0 f18038D0;

    /* JADX INFO: renamed from: E0 */
    public final C3130X f18039E0;

    /* JADX INFO: renamed from: F0 */
    public final C3130X f18040F0;

    /* JADX INFO: renamed from: Y */
    public final InterfaceC3870x f18041Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC3870x f18042Z;

    /* JADX INFO: renamed from: o0 */
    public final C15358g1 f18043o0;

    /* JADX INFO: renamed from: p0 */
    public final C0067i0 f18044p0;

    /* JADX INFO: renamed from: q0 */
    public final C5559a f18045q0;

    /* JADX INFO: renamed from: r0 */
    public final ArrayList f18046r0;

    /* JADX INFO: renamed from: s0 */
    public final ArrayList f18047s0;

    /* JADX INFO: renamed from: t0 */
    public final C1920j f18048t0;

    /* JADX INFO: renamed from: u0 */
    public List f18049u0;

    /* JADX INFO: renamed from: v0 */
    public final C13288c f18050v0;

    /* JADX INFO: renamed from: w0 */
    public final Object f18051w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f18052x0;

    /* JADX INFO: renamed from: y0 */
    public InterfaceC3805H f18053y0;

    /* JADX INFO: renamed from: z0 */
    public AbstractC3174u0 f18054z0;

    public C5565g(InterfaceC3870x interfaceC3870x, InterfaceC3870x interfaceC3870x2, C3853o0 c3853o0, C3853o0 c3853o1, C1920j c1920j, C15358g1 c15358g1, C0067i0 c0067i0) {
        C3130X c3130x = C3130X.f9415b;
        this.f18046r0 = new ArrayList();
        this.f18047s0 = new ArrayList();
        this.f18049u0 = Collections.emptyList();
        this.f18051w0 = new Object();
        this.f18052x0 = true;
        this.f18053y0 = null;
        this.f18041Y = interfaceC3870x;
        this.f18042Z = interfaceC3870x2;
        this.f18039E0 = c3130x;
        this.f18040F0 = c3130x;
        this.f18048t0 = c1920j;
        this.f18043o0 = c15358g1;
        this.f18044p0 = c0067i0;
        C13288c c13288c = c3853o0.f11654c;
        this.f18050v0 = c13288c;
        c13288c.m14918X();
        this.f18036B0 = new C3851n0(interfaceC3870x.mo111g());
        this.f18037C0 = c3853o0;
        this.f18038D0 = c3853o1;
        this.f18045q0 = m5954w(c3853o0, c3853o1);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m5951C(C3836g c3836g, C3865u0 c3865u0) {
        C3835f0 c3835f0 = c3865u0.f11683g.f11483b;
        C21572a c21572a = c3836g.f11609d;
        c21572a.getClass();
        if (AbstractC0168G.m517f(c21572a).size() != c3865u0.f11683g.f11483b.mo44k().size()) {
            return true;
        }
        for (C3828c c3828c : AbstractC0168G.m517f(c21572a)) {
            if (!c3835f0.f11604Y.containsKey(c3828c) || !Objects.equals(c3835f0.mo39b(c3828c), AbstractC0168G.m519h(c21572a, c3828c))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public static ArrayList m5952H(List list, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC3174u0) it.next()).getClass();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw AbstractC3794B0.m4497v(it2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: m */
    public static Matrix m5953m(Rect rect, Size size) {
        AbstractC4941g.m5554M("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    /* JADX INFO: renamed from: w */
    public static C5559a m5954w(C3853o0 c3853o0, C3853o0 c3853o1) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c3853o0.f11540a.mo137b());
        sb2.append(c3853o1 == null ? "" : c3853o1.f11540a.mo137b());
        return new C5559a(sb2.toString(), (C3830d) c3853o0.f11654c.f42001Y);
    }

    /* JADX INFO: renamed from: y */
    public static HashMap m5955y(ArrayList arrayList, InterfaceC3806H0 interfaceC3806H0, C0067i0 c0067i0) {
        InterfaceC3800E0 interfaceC3800E0Mo3936e;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC3174u0 abstractC3174u0 = (AbstractC3174u0) it.next();
            if (abstractC3174u0 instanceof C7729c) {
                C7729c c7729c = (C7729c) abstractC3174u0;
                InterfaceC3800E0 interfaceC3800E0Mo3936e2 = new C2953e(2).m3778a().mo3936e(false, interfaceC3806H0);
                if (interfaceC3800E0Mo3936e2 == null) {
                    interfaceC3800E0Mo3936e = null;
                } else {
                    C3825a0 c3825a0M4559o = C3825a0.m4559o(interfaceC3800E0Mo3936e2);
                    c3825a0M4559o.f11604Y.remove(InterfaceC5569k.f18065a0);
                    interfaceC3800E0Mo3936e = ((C7730d) c7729c.mo3937j(c3825a0M4559o)).mo3781x();
                }
            } else {
                interfaceC3800E0Mo3936e = abstractC3174u0.mo3936e(false, interfaceC3806H0);
            }
            InterfaceC3800E0 interfaceC3800E0Mo3936e3 = abstractC3174u0.mo3936e(true, c0067i0);
            C5564f c5564f = new C5564f();
            c5564f.f18033a = interfaceC3800E0Mo3936e;
            c5564f.f18034b = interfaceC3800E0Mo3936e3;
            map.put(abstractC3174u0, c5564f);
        }
        return map;
    }

    /* JADX INFO: renamed from: A */
    public final List m5956A() {
        ArrayList arrayList;
        synchronized (this.f18051w0) {
            arrayList = new ArrayList(this.f18046r0);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: B */
    public final void m5957B() {
        synchronized (this.f18051w0) {
            this.f18050v0.m14918X();
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m5958D() {
        boolean z6;
        synchronized (this.f18051w0) {
            C13288c c13288c = this.f18050v0;
            c13288c.getClass();
            z6 = ((Integer) ((C3835f0) c13288c.getConfig()).mo36M(InterfaceC3856q.f11664e, 0)).intValue() == 1;
        }
        return z6;
    }

    /* JADX INFO: renamed from: E */
    public final void m5959E(ArrayList arrayList) {
        synchronized (this.f18051w0) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f18046r0);
            linkedHashSet.removeAll(arrayList);
            InterfaceC3870x interfaceC3870x = this.f18042Z;
            m5963J(linkedHashSet, interfaceC3870x != null, interfaceC3870x != null);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m5960F() {
        synchronized (this.f18051w0) {
            try {
                if (this.f18053y0 != null) {
                    this.f18041Y.mo111g().mo295C(this.f18053y0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m5961G(List list) {
        synchronized (this.f18051w0) {
            this.f18049u0 = list;
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m5962I() {
        synchronized (this.f18051w0) {
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m5963J(LinkedHashSet linkedHashSet, boolean z6, boolean z10) {
        C3836g c3836g;
        C21572a c21572a;
        synchronized (this.f18051w0) {
            try {
                m5970t(linkedHashSet);
                if (!z6) {
                    m5957B();
                }
                C7729c c7729cM5971u = m5971u(linkedHashSet, z6);
                AbstractC3174u0 abstractC3174u0M5968l = m5968l(linkedHashSet, c7729cM5971u);
                ArrayList arrayList = new ArrayList(linkedHashSet);
                if (abstractC3174u0M5968l != null) {
                    arrayList.add(abstractC3174u0M5968l);
                }
                if (c7729cM5971u != null) {
                    arrayList.add(c7729cM5971u);
                    arrayList.removeAll(c7729cM5971u.f24368p.f24387Y);
                }
                ArrayList<AbstractC3174u0> arrayList2 = new ArrayList(arrayList);
                arrayList2.removeAll(this.f18047s0);
                ArrayList<AbstractC3174u0> arrayList3 = new ArrayList(arrayList);
                arrayList3.retainAll(this.f18047s0);
                ArrayList<AbstractC3174u0> arrayList4 = new ArrayList(this.f18047s0);
                arrayList4.removeAll(arrayList);
                C13288c c13288c = this.f18050v0;
                c13288c.getClass();
                HashMap mapM5955y = m5955y(arrayList2, (InterfaceC3806H0) ((C3835f0) c13288c.getConfig()).mo36M(InterfaceC3856q.f11663d, InterfaceC3806H0.f11514a), this.f18044p0);
                Map mapEmptyMap = Collections.emptyMap();
                try {
                    HashMap mapM5969s = m5969s(m5973x(), this.f18041Y.mo122r(), arrayList2, arrayList3, mapM5955y);
                    if (this.f18042Z != null) {
                        int iM5973x = m5973x();
                        InterfaceC3870x interfaceC3870x = this.f18042Z;
                        Objects.requireNonNull(interfaceC3870x);
                        mapEmptyMap = m5969s(iM5973x, interfaceC3870x.mo122r(), arrayList2, arrayList3, mapM5955y);
                    }
                    Map map = mapEmptyMap;
                    m5964K(mapM5969s, arrayList);
                    ArrayList arrayListM5952H = m5952H(this.f18049u0, arrayList);
                    ArrayList arrayList5 = new ArrayList(linkedHashSet);
                    arrayList5.removeAll(arrayList);
                    ArrayList arrayListM5952H2 = m5952H(arrayListM5952H, arrayList5);
                    if (arrayListM5952H2.size() > 0) {
                        AbstractC8072d6.m8492i("CameraUseCaseAdapter", "Unused effects: " + arrayListM5952H2);
                    }
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        ((AbstractC3174u0) it.next()).m4021z(this.f18041Y);
                    }
                    this.f18041Y.mo118n(arrayList4);
                    if (this.f18042Z != null) {
                        for (AbstractC3174u0 abstractC3174u0 : arrayList4) {
                            InterfaceC3870x interfaceC3870x2 = this.f18042Z;
                            Objects.requireNonNull(interfaceC3870x2);
                            abstractC3174u0.m4021z(interfaceC3870x2);
                        }
                        InterfaceC3870x interfaceC3870x3 = this.f18042Z;
                        Objects.requireNonNull(interfaceC3870x3);
                        interfaceC3870x3.mo118n(arrayList4);
                    }
                    if (arrayList4.isEmpty()) {
                        for (AbstractC3174u0 abstractC3174u1 : arrayList3) {
                            if (mapM5969s.containsKey(abstractC3174u1) && (c21572a = (c3836g = (C3836g) mapM5969s.get(abstractC3174u1)).f11609d) != null && m5951C(c3836g, abstractC3174u1.f9572m)) {
                                abstractC3174u1.f9566g = abstractC3174u1.mo3940u(c21572a);
                                if (this.f18052x0) {
                                    this.f18041Y.mo115k(abstractC3174u1);
                                    InterfaceC3870x interfaceC3870x4 = this.f18042Z;
                                    if (interfaceC3870x4 != null) {
                                        interfaceC3870x4.mo115k(abstractC3174u1);
                                    }
                                }
                            }
                        }
                    }
                    for (AbstractC3174u0 abstractC3174u2 : arrayList2) {
                        C5564f c5564f = (C5564f) mapM5955y.get(abstractC3174u2);
                        Objects.requireNonNull(c5564f);
                        InterfaceC3870x interfaceC3870x5 = this.f18042Z;
                        if (interfaceC3870x5 != null) {
                            abstractC3174u2.m4008a(this.f18041Y, interfaceC3870x5, c5564f.f18033a, c5564f.f18034b);
                            C3836g c3836g2 = (C3836g) mapM5969s.get(abstractC3174u2);
                            c3836g2.getClass();
                            abstractC3174u2.f9566g = abstractC3174u2.mo3941v(c3836g2, (C3836g) map.get(abstractC3174u2));
                        } else {
                            abstractC3174u2.m4008a(this.f18041Y, null, c5564f.f18033a, c5564f.f18034b);
                            C3836g c3836g3 = (C3836g) mapM5969s.get(abstractC3174u2);
                            c3836g3.getClass();
                            abstractC3174u2.f9566g = abstractC3174u2.mo3941v(c3836g3, null);
                        }
                    }
                    if (this.f18052x0) {
                        this.f18041Y.mo119o(arrayList2);
                        InterfaceC3870x interfaceC3870x6 = this.f18042Z;
                        if (interfaceC3870x6 != null) {
                            interfaceC3870x6.mo119o(arrayList2);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((AbstractC3174u0) it2.next()).m4019o();
                    }
                    this.f18046r0.clear();
                    this.f18046r0.addAll(linkedHashSet);
                    this.f18047s0.clear();
                    this.f18047s0.addAll(arrayList);
                    this.f18054z0 = abstractC3174u0M5968l;
                    this.f18035A0 = c7729cM5971u;
                } catch (IllegalArgumentException e10) {
                    if (!z6) {
                        m5957B();
                        if (this.f18048t0.f5617o0 != 2) {
                            m5963J(linkedHashSet, true, z10);
                            return;
                        }
                    }
                    throw e10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m5964K(HashMap map, ArrayList arrayList) {
        synchronized (this.f18051w0) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC3174u0 abstractC3174u0 = (AbstractC3174u0) it.next();
                    Rect rectMo305j = this.f18041Y.mo111g().mo305j();
                    C3836g c3836g = (C3836g) map.get(abstractC3174u0);
                    c3836g.getClass();
                    abstractC3174u0.mo3943x(m5953m(rectMo305j, c3836g.f11606a));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p178H.InterfaceC3153k
    /* JADX INFO: renamed from: a */
    public final InterfaceC3866v mo105a() {
        return this.f18037C0;
    }

    @Override // p178H.InterfaceC3153k
    /* JADX INFO: renamed from: c */
    public final InterfaceC3864u mo107c() {
        return this.f18036B0;
    }

    /* JADX INFO: renamed from: e */
    public final void m5965e(Collection collection) {
        synchronized (this.f18051w0) {
            try {
                this.f18041Y.mo110f(this.f18050v0);
                InterfaceC3870x interfaceC3870x = this.f18042Z;
                if (interfaceC3870x != null) {
                    interfaceC3870x.mo110f(this.f18050v0);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f18046r0);
                linkedHashSet.addAll(collection);
                try {
                    InterfaceC3870x interfaceC3870x2 = this.f18042Z;
                    m5963J(linkedHashSet, interfaceC3870x2 != null, interfaceC3870x2 != null);
                } catch (IllegalArgumentException e10) {
                    throw new C5563e(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5966j() {
        synchronized (this.f18051w0) {
            try {
                if (!this.f18052x0) {
                    if (!this.f18047s0.isEmpty()) {
                        this.f18041Y.mo110f(this.f18050v0);
                        InterfaceC3870x interfaceC3870x = this.f18042Z;
                        if (interfaceC3870x != null) {
                            interfaceC3870x.mo110f(this.f18050v0);
                        }
                    }
                    this.f18041Y.mo119o(this.f18047s0);
                    InterfaceC3870x interfaceC3870x2 = this.f18042Z;
                    if (interfaceC3870x2 != null) {
                        interfaceC3870x2.mo119o(this.f18047s0);
                    }
                    m5960F();
                    Iterator it = this.f18047s0.iterator();
                    while (it.hasNext()) {
                        ((AbstractC3174u0) it.next()).m4019o();
                    }
                    this.f18052x0 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m5967k() {
        synchronized (this.f18051w0) {
            InterfaceC3864u interfaceC3864uMo111g = this.f18041Y.mo111g();
            this.f18053y0 = interfaceC3864uMo111g.mo311r();
            interfaceC3864uMo111g.mo315x();
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b0  */
    /* JADX INFO: renamed from: l */
    public final AbstractC3174u0 m5968l(LinkedHashSet linkedHashSet, C7729c c7729c) {
        AbstractC3174u0 abstractC3174u0M14901e;
        synchronized (this.f18051w0) {
            try {
                ArrayList<AbstractC3174u0> arrayList = new ArrayList(linkedHashSet);
                if (c7729c != null) {
                    arrayList.add(c7729c);
                    arrayList.removeAll(c7729c.f24368p.f24387Y);
                }
                if (m5958D()) {
                    boolean z6 = false;
                    boolean z10 = false;
                    boolean z11 = false;
                    for (AbstractC3174u0 abstractC3174u0 : arrayList) {
                        if ((abstractC3174u0 instanceof C3142e0) || (abstractC3174u0 instanceof C7729c)) {
                            z11 = true;
                        } else if (abstractC3174u0 instanceof C3123P) {
                            z10 = true;
                        }
                    }
                    if (!z10 || z11) {
                        boolean z12 = false;
                        for (AbstractC3174u0 abstractC3174u1 : arrayList) {
                            if ((abstractC3174u1 instanceof C3142e0) || (abstractC3174u1 instanceof C7729c)) {
                                z6 = true;
                            } else if (abstractC3174u1 instanceof C3123P) {
                                z12 = true;
                            }
                        }
                        if (!z6 || z12) {
                            abstractC3174u0M14901e = null;
                        } else {
                            AbstractC3174u0 abstractC3174u2 = this.f18054z0;
                            if (abstractC3174u2 instanceof C3123P) {
                                abstractC3174u0M14901e = abstractC3174u2;
                            } else {
                                C13287b c13287b = new C13287b(11);
                                ((C3825a0) c13287b.f42000Z).m4561x(InterfaceC5569k.f18064W, "ImageCapture-Extra");
                                abstractC3174u0M14901e = c13287b.m14901e();
                            }
                        }
                    } else {
                        AbstractC3174u0 abstractC3174u3 = this.f18054z0;
                        if (abstractC3174u3 instanceof C3142e0) {
                            abstractC3174u0M14901e = abstractC3174u3;
                        } else {
                            C2953e c2953e = new C2953e(2);
                            c2953e.f8836Z.m4561x(InterfaceC5569k.f18064W, "Preview-Extra");
                            C3142e0 c3142e0M3778a = c2953e.m3778a();
                            c3142e0M3778a.m3983C(new C2385o(17));
                            abstractC3174u0M14901e = c3142e0M3778a;
                        }
                    }
                } else {
                    abstractC3174u0M14901e = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC3174u0M14901e;
    }

    /* JADX INFO: renamed from: s */
    public final HashMap m5969s(int i10, InterfaceC3866v interfaceC3866v, ArrayList arrayList, ArrayList arrayList2, HashMap map) {
        C15358g1 c15358g1;
        Rect rectMo305j;
        Iterator it;
        boolean z6;
        ArrayList arrayList3 = new ArrayList();
        String strMo137b = interfaceC3866v.mo137b();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Iterator it2 = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            Size size = null;
            c15358g1 = this.f18043o0;
            if (!zHasNext) {
                break;
            }
            AbstractC3174u0 abstractC3174u0 = (AbstractC3174u0) it2.next();
            int inputFormat = abstractC3174u0.f9565f.getInputFormat();
            C3836g c3836g = abstractC3174u0.f9566g;
            Size size2 = c3836g != null ? c3836g.f11606a : null;
            C0023L0 c0023l0 = (C0023L0) ((HashMap) c15358g1.f47945Y).get(strMo137b);
            C3838h c3838hM4571b = c0023l0 != null ? C3838h.m4571b(i10, inputFormat, size2, c0023l0.m157i(inputFormat)) : null;
            int inputFormat2 = abstractC3174u0.f9565f.getInputFormat();
            C3836g c3836g2 = abstractC3174u0.f9566g;
            if (c3836g2 != null) {
                size = c3836g2.f11606a;
            }
            c3836g2.getClass();
            C3824a c3824a = new C3824a(c3838hM4571b, inputFormat2, size, c3836g2.f11607b, C7729c.m7990F(abstractC3174u0), abstractC3174u0.f9566g.f11609d, abstractC3174u0.f9565f.mo43i());
            arrayList3.add(c3824a);
            map3.put(c3824a, abstractC3174u0);
            map2.put(abstractC3174u0, abstractC3174u0.f9566g);
        }
        if (!arrayList.isEmpty()) {
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            try {
                rectMo305j = this.f18041Y.mo111g().mo305j();
                while (true) {
                    if (!it.hasNext()) {
                        z6 = false;
                        break;
                    }
                    AbstractC3174u0 abstractC3174u1 = (AbstractC3174u0) it.next();
                    if (abstractC3174u1 != null) {
                        if (abstractC3174u1.f9565f.mo37O(InterfaceC3800E0.f11493G)) {
                            if (abstractC3174u1.f9565f.mo31D() == EnumC3804G0.f11510p0) {
                                z6 = true;
                                break;
                            }
                        } else {
                            AbstractC15256t.m16465c("CameraUseCaseAdapter", abstractC3174u1 + " UseCase does not have capture type.");
                        }
                    }
                }
            } catch (NullPointerException unused) {
                rectMo305j = null;
            }
            C2388r c2388r = new C2388r(interfaceC3866v, rectMo305j != null ? AbstractC4503n.m5249e(rectMo305j) : null);
            Iterator it3 = arrayList.iterator();
            boolean z10 = false;
            while (it3.hasNext()) {
                AbstractC3174u0 abstractC3174u2 = (AbstractC3174u0) it3.next();
                C5564f c5564f = (C5564f) map.get(abstractC3174u2);
                InterfaceC3800E0 interfaceC3800E0M4016l = abstractC3174u2.m4016l(interfaceC3866v, c5564f.f18033a, c5564f.f18034b);
                map4.put(interfaceC3800E0M4016l, abstractC3174u2);
                map5.put(interfaceC3800E0M4016l, c2388r.m3497g(interfaceC3800E0M4016l));
                InterfaceC3800E0 interfaceC3800E0 = abstractC3174u2.f9565f;
                if (interfaceC3800E0 instanceof C3837g0) {
                    C3837g0 c3837g0 = (C3837g0) interfaceC3800E0;
                    c3837g0.getClass();
                    z10 = AbstractC3794B0.m4477b(c3837g0) == 2;
                }
            }
            it = arrayList.iterator();
            c15358g1.getClass();
            AbstractC4941g.m5554M("No new use cases to be bound.", !map5.isEmpty());
            C0023L0 c0023l1 = (C0023L0) ((HashMap) c15358g1.f47945Y).get(strMo137b);
            if (c0023l1 == null) {
                throw new IllegalArgumentException(AbstractC9306j0.m9889h("No such camera id in supported combination list: ", strMo137b));
            }
            Pair pairM155g = c0023l1.m155g(i10, arrayList3, map5, z10, z6);
            for (Map.Entry entry : map4.entrySet()) {
                map2.put((AbstractC3174u0) entry.getValue(), (C3836g) ((Map) pairM155g.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) pairM155g.second).entrySet()) {
                if (map3.containsKey(entry2.getKey())) {
                    map2.put((AbstractC3174u0) map3.get(entry2.getKey()), (C3836g) entry2.getValue());
                }
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: t */
    public final void m5970t(LinkedHashSet linkedHashSet) {
        boolean z6;
        m5957B();
        synchronized (this.f18051w0) {
            try {
                if (!this.f18049u0.isEmpty()) {
                    Iterator it = linkedHashSet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z6 = false;
                            break;
                        }
                        AbstractC3174u0 abstractC3174u0 = (AbstractC3174u0) it.next();
                        if (abstractC3174u0 instanceof C3123P) {
                            InterfaceC3800E0 interfaceC3800E0 = abstractC3174u0.f9565f;
                            C3828c c3828c = C3815Q.f11552r0;
                            if (interfaceC3800E0.mo37O(c3828c)) {
                                Integer num = (Integer) interfaceC3800E0.mo39b(c3828c);
                                num.getClass();
                                z6 = true;
                                if (num.intValue() == 1) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    if (z6) {
                        throw new IllegalArgumentException("Ultra HDR image capture does not support for use with CameraEffect.");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final C7729c m5971u(LinkedHashSet linkedHashSet, boolean z6) {
        boolean z10;
        synchronized (this.f18051w0) {
            try {
                HashSet<AbstractC3174u0> hashSetM5974z = m5974z(linkedHashSet, z6);
                if (hashSetM5974z.size() < 2) {
                    m5957B();
                    return null;
                }
                C7729c c7729c = this.f18035A0;
                if (c7729c != null && c7729c.f24368p.f24387Y.equals(hashSetM5974z)) {
                    C7729c c7729c2 = this.f18035A0;
                    Objects.requireNonNull(c7729c2);
                    return c7729c2;
                }
                int[] iArr = {1, 2, 4};
                HashSet hashSet = new HashSet();
                for (AbstractC3174u0 abstractC3174u0 : hashSetM5974z) {
                    for (int i10 = 0; i10 < 3; i10++) {
                        int i11 = iArr[i10];
                        Iterator it = abstractC3174u0.mo3961i().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z10 = false;
                                break;
                            }
                            int iIntValue = ((Integer) it.next()).intValue();
                            if ((i11 & iIntValue) == iIntValue) {
                                z10 = true;
                                break;
                            }
                        }
                        if (z10) {
                            if (hashSet.contains(Integer.valueOf(i11))) {
                                return null;
                            }
                            hashSet.add(Integer.valueOf(i11));
                        }
                    }
                }
                return new C7729c(this.f18041Y, this.f18042Z, this.f18039E0, this.f18040F0, hashSetM5974z, this.f18044p0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m5972v() {
        synchronized (this.f18051w0) {
            try {
                if (this.f18052x0) {
                    this.f18041Y.mo118n(new ArrayList(this.f18047s0));
                    InterfaceC3870x interfaceC3870x = this.f18042Z;
                    if (interfaceC3870x != null) {
                        interfaceC3870x.mo118n(new ArrayList(this.f18047s0));
                    }
                    m5967k();
                    this.f18052x0 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final int m5973x() {
        synchronized (this.f18051w0) {
            try {
                return this.f18048t0.f5617o0 == 2 ? 1 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final HashSet m5974z(LinkedHashSet linkedHashSet, boolean z6) {
        int i10;
        HashSet hashSet = new HashSet();
        synchronized (this.f18051w0) {
            Iterator it = this.f18049u0.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
            i10 = z6 ? 3 : 0;
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            AbstractC3174u0 abstractC3174u0 = (AbstractC3174u0) it2.next();
            AbstractC4941g.m5554M("Only support one level of sharing for now.", !(abstractC3174u0 instanceof C7729c));
            Iterator it3 = abstractC3174u0.mo3961i().iterator();
            while (it3.hasNext()) {
                int iIntValue = ((Integer) it3.next()).intValue();
                if ((i10 & iIntValue) == iIntValue) {
                    hashSet.add(abstractC3174u0);
                    break;
                }
            }
        }
        return hashSet;
    }
}
