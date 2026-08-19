package p045Bj;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Trace;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import mk.C17282c;
import p006A4.C0362w;
import p021Aj.C0520e;
import p025An.C0644w;
import p1140z1.AbstractC21672S;
import p1140z1.AbstractC21675V;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21679Z;
import p1140z1.AbstractC21690f;
import p1140z1.C21658D;
import p1140z1.C21674U;
import p1140z1.C21684c;
import p1140z1.C21703l0;
import p1140z1.C21715t;
import p1140z1.C21720y;
import p1140z1.InterfaceC21687d0;
import p1140z1.InterfaceC21718w;
import p1156zj.AbstractC22120R0;
import p1156zj.AbstractC22180o0;
import p1156zj.C22090C;
import p1156zj.C22102I;
import p1156zj.C22130W0;
import p1156zj.C22139a1;
import p1156zj.C22173m;
import p1156zj.C22176n;
import p1156zj.C22177n0;
import p1156zj.C22195t0;
import p1156zj.InterfaceC22179o;
import p125Ej.C2563g;
import p140Fa.C2685e;
import p173Gj.EnumC3098e;
import p228J.C3827b0;
import p349O0.C5960K;
import p349O0.InterfaceC6009j;
import p349O0.InterfaceC6034v0;
import p392Q0.C6546d;
import p491U0.C7535c;
import p523V9.AbstractC8111i5;
import p523V9.AbstractC8215v5;
import p531Vj.C8361c0;
import p635a1.AbstractC10458p;
import p635a1.InterfaceC10457o;
import p692d0.C12948A;
import p692d0.C12953F;
import p692d0.C12954G;
import p692d0.C12981t;
import p720e6.C13288c;
import p729ej.C13421l;
import p909nm.AbstractC17681o;
import p949pj.C18428A;
import p949pj.C18433F;
import p993rj.C19026F;
import sj.hJY.CsqksqyPE;

/* JADX INFO: renamed from: Bj.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C1313k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3466a;

    /* JADX INFO: renamed from: b */
    public final Object f3467b;

    /* JADX INFO: renamed from: c */
    public final Object f3468c;

    /* JADX INFO: renamed from: d */
    public Object f3469d;

    /* JADX INFO: renamed from: e */
    public final Object f3470e;

    /* JADX INFO: renamed from: f */
    public Object f3471f;

    /* JADX INFO: renamed from: g */
    public Object f3472g;

    /* JADX INFO: renamed from: h */
    public Object f3473h;

    /* JADX INFO: renamed from: i */
    public Object f3474i;

    public C1313k(C21658D c21658d) {
        this.f3466a = 2;
        this.f3467b = c21658d;
        C21715t c21715t = new C21715t(c21658d);
        this.f3468c = c21715t;
        this.f3469d = c21715t;
        C21703l0 c21703l0 = c21715t.f68892W0;
        this.f3470e = c21703l0;
        this.f3471f = c21703l0;
    }

    /* JADX INFO: renamed from: a */
    public static final void m2013a(C1313k c1313k, C22195t0 c22195t0, AbstractC22180o0 abstractC22180o0, C13421l c13421l, InterfaceC22179o interfaceC22179o, C2685e c2685e, C18428A c18428a, C22090C c22090c) {
        C22130W0 c22130w0;
        AbstractC16544l.m18094g(interfaceC22179o, "<this>");
        if (interfaceC22179o instanceof C22173m) {
            c22130w0 = null;
        } else {
            if (!(interfaceC22179o instanceof C22176n)) {
                throw new C0644w();
            }
            c22130w0 = ((C22176n) interfaceC22179o).f70230Y;
        }
        c2685e.getClass();
        if (C2685e.m3660i(c22195t0) && c22130w0 != null) {
            AbstractC22120R0.m22361h(abstractC22180o0, c13421l, c22195t0, c22090c, c22130w0, c2685e, c18428a, false, null, 0, 1920);
            return;
        }
        if (c22195t0.f70350p && c22130w0 != null) {
            AbstractC22120R0.m22361h(abstractC22180o0, c13421l, c22195t0, c22090c, c22130w0, c2685e, c18428a, false, null, 0, 1792);
            return;
        }
        C22139a1 c22139a1Mo22378d = abstractC22180o0.mo22378d();
        if (!(c22139a1Mo22378d instanceof C22139a1)) {
            c22139a1Mo22378d = null;
        }
        if (c22139a1Mo22378d == null) {
            return;
        }
        c13421l.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(new C0362w(abstractC22180o0, interfaceC22179o, c22090c, new C22177n0(c22139a1Mo22378d, abstractC22180o0.mo22381h(), interfaceC22179o, AbstractC22120R0.m22357d(c22195t0, c22139a1Mo22378d.f69986Y), abstractC22180o0.mo22380g(), abstractC22180o0.mo22379f(), abstractC22180o0.mo22377c(), EnumC3098e.f9323o0, c22195t0.f70351q.f40641d, null, false, false, null, new C0520e(c13421l, c2685e, 2), 7680), c18428a, 1)));
    }

    /* JADX INFO: renamed from: b */
    public static final void m2014b(C1313k c1313k, AbstractC10458p abstractC10458p, AbstractC21678Y abstractC21678Y) {
        c1313k.getClass();
        for (AbstractC10458p abstractC10458p2 = abstractC10458p.f30964q0; abstractC10458p2 != null; abstractC10458p2 = abstractC10458p2.f30964q0) {
            if (abstractC10458p2 == AbstractC21675V.f68780a) {
                C21658D c21658dM22009G = ((C21658D) c1313k.f3467b).m22009G();
                abstractC21678Y.f68821z0 = c21658dM22009G != null ? (C21715t) c21658dM22009G.f68638I0.f3468c : null;
                c1313k.f3469d = abstractC21678Y;
                return;
            } else {
                if ((abstractC10458p2.f30962o0 & 2) != 0) {
                    return;
                }
                abstractC10458p2.mo10934J0(abstractC21678Y);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC10458p m2015c(InterfaceC10457o interfaceC10457o, AbstractC10458p abstractC10458p) {
        AbstractC10458p abstractC10458pMo11196a;
        if (interfaceC10457o instanceof AbstractC21672S) {
            abstractC10458pMo11196a = ((AbstractC21672S) interfaceC10457o).mo11196a();
            abstractC10458pMo11196a.f30962o0 = AbstractC21679Z.m22190g(abstractC10458pMo11196a);
        } else {
            C21684c c21684c = new C21684c();
            c21684c.f30962o0 = AbstractC21679Z.m22188e(interfaceC10457o);
            c21684c.f68828z0 = interfaceC10457o;
            c21684c.f68827B0 = new HashSet();
            abstractC10458pMo11196a = c21684c;
        }
        if (abstractC10458pMo11196a.f30972y0) {
            AbstractC8111i5.m8592c("A ModifierNodeElement cannot return an already attached node from create() ");
            throw null;
        }
        abstractC10458pMo11196a.f30968u0 = true;
        AbstractC10458p abstractC10458p2 = abstractC10458p.f30965r0;
        if (abstractC10458p2 != null) {
            abstractC10458p2.f30964q0 = abstractC10458pMo11196a;
            abstractC10458pMo11196a.f30965r0 = abstractC10458p2;
        }
        abstractC10458p.f30965r0 = abstractC10458pMo11196a;
        abstractC10458pMo11196a.f30964q0 = abstractC10458p;
        return abstractC10458pMo11196a;
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC10458p m2016d(AbstractC10458p abstractC10458p) {
        boolean z6 = abstractC10458p.f30972y0;
        if (z6) {
            C12948A c12948a = AbstractC21679Z.f68822a;
            if (!z6) {
                AbstractC8111i5.m8592c("autoInvalidateRemovedNode called on unattached node");
                throw null;
            }
            AbstractC21679Z.m22185b(abstractC10458p, -1, 2);
            abstractC10458p.mo10932H0();
            abstractC10458p.mo10928B0();
        }
        AbstractC10458p abstractC10458p2 = abstractC10458p.f30965r0;
        AbstractC10458p abstractC10458p3 = abstractC10458p.f30964q0;
        if (abstractC10458p2 != null) {
            abstractC10458p2.f30964q0 = abstractC10458p3;
            abstractC10458p.f30965r0 = null;
        }
        if (abstractC10458p3 != null) {
            abstractC10458p3.f30965r0 = abstractC10458p2;
            abstractC10458p.f30964q0 = null;
        }
        AbstractC16544l.m18091d(abstractC10458p3);
        return abstractC10458p3;
    }

    /* JADX INFO: renamed from: m */
    public static void m2017m(InterfaceC10457o interfaceC10457o, InterfaceC10457o interfaceC10457o2, AbstractC10458p abstractC10458p) {
        if ((interfaceC10457o instanceof AbstractC21672S) && (interfaceC10457o2 instanceof AbstractC21672S)) {
            C21674U c21674u = AbstractC21675V.f68780a;
            AbstractC16544l.m18092e(abstractC10458p, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((AbstractC21672S) interfaceC10457o2).mo11197i(abstractC10458p);
            if (abstractC10458p.f30972y0) {
                AbstractC21679Z.m22187d(abstractC10458p);
                return;
            } else {
                abstractC10458p.f30969v0 = true;
                return;
            }
        }
        if (!(abstractC10458p instanceof C21684c)) {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        C21684c c21684c = (C21684c) abstractC10458p;
        if (c21684c.f30972y0) {
            c21684c.m22193L0();
        }
        c21684c.f68828z0 = interfaceC10457o2;
        c21684c.f30962o0 = AbstractC21679Z.m22188e(interfaceC10457o2);
        if (c21684c.f30972y0) {
            c21684c.m22192K0(false);
        }
        if (abstractC10458p.f30972y0) {
            AbstractC21679Z.m22187d(abstractC10458p);
        } else {
            abstractC10458p.f30969v0 = true;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m2018e() {
        C12953F c12953f = (C12953F) this.f3467b;
        if (c12953f.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = c12953f.iterator();
            while (true) {
                C7535c c7535c = (C7535c) it;
                if (!c7535c.hasNext()) {
                    Trace.endSection();
                    return;
                } else {
                    InterfaceC6034v0 interfaceC6034v0 = (InterfaceC6034v0) c7535c.next();
                    c7535c.remove();
                    interfaceC6034v0.mo2149a();
                }
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m2019f() {
        m2021h(Integer.MIN_VALUE);
        ArrayList arrayList = (ArrayList) this.f3469d;
        boolean zIsEmpty = arrayList.isEmpty();
        C12953F c12953f = (C12953F) this.f3467b;
        if (!zIsEmpty) {
            Trace.beginSection("Compose:onForgotten");
            try {
                C12954G c12954g = (C12954G) this.f3471f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(size);
                    if (obj instanceof InterfaceC6034v0) {
                        c12953f.remove(obj);
                        ((InterfaceC6034v0) obj).mo2150c();
                    }
                    if (obj instanceof InterfaceC6009j) {
                        if (c12954g == null || !c12954g.m14626c(obj)) {
                            ((InterfaceC6009j) obj).mo6478b();
                        } else {
                            ((InterfaceC6009j) obj).mo6477a();
                        }
                    }
                }
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f3468c;
        if (arrayList2.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:onRemembered");
        try {
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                InterfaceC6034v0 interfaceC6034v0 = (InterfaceC6034v0) arrayList2.get(i10);
                c12953f.remove(interfaceC6034v0);
                interfaceC6034v0.mo2151d();
            }
            Trace.endSection();
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m2020g(int i10) {
        return (i10 & ((AbstractC10458p) this.f3471f).f30963p0) != 0;
    }

    /* JADX INFO: renamed from: h */
    public void m2021h(int i10) {
        int i11 = 0;
        ArrayList arrayList = (ArrayList) this.f3472g;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayListM19384m = null;
        int i12 = 0;
        C12981t c12981t = null;
        C12981t c12981t2 = null;
        while (true) {
            C12981t c12981t3 = (C12981t) this.f3474i;
            if (i12 >= c12981t3.f41203b) {
                break;
            }
            if (i10 <= c12981t3.m14686c(i12)) {
                Object objRemove = arrayList.remove(i12);
                int iM14687d = c12981t3.m14687d(i12);
                int iM14687d2 = ((C12981t) this.f3473h).m14687d(i12);
                if (arrayListM19384m == null) {
                    arrayListM19384m = AbstractC17681o.m19384m(objRemove);
                    c12981t2 = new C12981t();
                    c12981t2.m14684a(iM14687d);
                    c12981t = new C12981t();
                    c12981t.m14684a(iM14687d2);
                } else {
                    AbstractC16544l.m18092e(c12981t, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    AbstractC16544l.m18092e(c12981t2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    arrayListM19384m.add(objRemove);
                    c12981t2.m14684a(iM14687d);
                    c12981t.m14684a(iM14687d2);
                }
            } else {
                i12++;
            }
        }
        if (arrayListM19384m != null) {
            AbstractC16544l.m18092e(c12981t, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            AbstractC16544l.m18092e(c12981t2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            int size = arrayListM19384m.size() - 1;
            while (i11 < size) {
                int i13 = i11 + 1;
                int size2 = arrayListM19384m.size();
                for (int i14 = i13; i14 < size2; i14++) {
                    int iM14686c = c12981t2.m14686c(i11);
                    int iM14686c2 = c12981t2.m14686c(i14);
                    if (iM14686c < iM14686c2 || (iM14686c2 == iM14686c && c12981t.m14686c(i11) < c12981t.m14686c(i14))) {
                        Object obj = arrayListM19384m.get(i11);
                        arrayListM19384m.set(i11, arrayListM19384m.get(i14));
                        arrayListM19384m.set(i14, obj);
                        int iM14686c3 = c12981t.m14686c(i11);
                        c12981t.m14688e(i11, c12981t.m14686c(i14));
                        c12981t.m14688e(i14, iM14686c3);
                        int iM14686c4 = c12981t2.m14686c(i11);
                        c12981t2.m14688e(i11, c12981t2.m14686c(i14));
                        c12981t2.m14688e(i14, iM14686c4);
                    }
                }
                i11 = i13;
            }
            ((ArrayList) this.f3469d).addAll(arrayListM19384m);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m2022i(Object obj, int i10, int i11, int i12) {
        m2021h(i10);
        if (i12 < 0 || i12 >= i10) {
            ((ArrayList) this.f3469d).add(obj);
            return;
        }
        ((ArrayList) this.f3472g).add(obj);
        ((C12981t) this.f3473h).m14684a(i11);
        ((C12981t) this.f3474i).m14684a(i12);
    }

    /* JADX INFO: renamed from: j */
    public void m2023j() {
        for (AbstractC10458p abstractC10458p = (AbstractC10458p) this.f3471f; abstractC10458p != null; abstractC10458p = abstractC10458p.f30965r0) {
            abstractC10458p.mo10931G0();
            if (abstractC10458p.f30968u0) {
                AbstractC21679Z.m22184a(abstractC10458p);
            }
            if (abstractC10458p.f30969v0) {
                AbstractC21679Z.m22187d(abstractC10458p);
            }
            abstractC10458p.f30968u0 = false;
            abstractC10458p.f30969v0 = false;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m2025l() {
        C21658D c21658d;
        C21720y c21720y;
        InterfaceC21687d0 interfaceC21687d0;
        AbstractC10458p abstractC10458p = ((C21703l0) this.f3470e).f30964q0;
        AbstractC21678Y abstractC21678Y = (C21715t) this.f3468c;
        while (true) {
            c21658d = (C21658D) this.f3467b;
            if (abstractC10458p == null) {
                break;
            }
            InterfaceC21718w interfaceC21718wM22202g = AbstractC21690f.m22202g(abstractC10458p);
            if (interfaceC21718wM22202g != null) {
                AbstractC21678Y abstractC21678Y2 = abstractC10458p.f30967t0;
                if (abstractC21678Y2 != null) {
                    c21720y = (C21720y) abstractC21678Y2;
                    InterfaceC21718w interfaceC21718w = c21720y.f68905W0;
                    c21720y.m22230h1(interfaceC21718wM22202g);
                    if (interfaceC21718w != abstractC10458p && (interfaceC21687d0 = c21720y.f68817P0) != null) {
                        interfaceC21687d0.invalidate();
                    }
                } else {
                    c21720y = new C21720y(c21658d, interfaceC21718wM22202g);
                    abstractC10458p.mo10934J0(c21720y);
                }
                abstractC21678Y.f68821z0 = c21720y;
                c21720y.f68820y0 = abstractC21678Y;
                abstractC21678Y = c21720y;
            } else {
                abstractC10458p.mo10934J0(abstractC21678Y);
            }
            abstractC10458p = abstractC10458p.f30964q0;
        }
        C21658D c21658dM22009G = c21658d.m22009G();
        abstractC21678Y.f68821z0 = c21658dM22009G != null ? (C21715t) c21658dM22009G.f68638I0.f3468c : null;
        this.f3469d = abstractC21678Y;
    }

    public String toString() {
        switch (this.f3466a) {
            case 2:
                StringBuilder sb2 = new StringBuilder("[");
                AbstractC10458p abstractC10458p = (AbstractC10458p) this.f3471f;
                C21703l0 c21703l0 = (C21703l0) this.f3470e;
                if (abstractC10458p == c21703l0) {
                    sb2.append("]");
                } else {
                    while (abstractC10458p != null && abstractC10458p != c21703l0) {
                        sb2.append(String.valueOf(abstractC10458p));
                        if (abstractC10458p.f30965r0 == c21703l0) {
                            sb2.append("]");
                        } else {
                            sb2.append(Separators.COMMA);
                            abstractC10458p = abstractC10458p.f30965r0;
                        }
                    }
                }
                String string = sb2.toString();
                AbstractC16544l.m18093f(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0138 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x010e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0116  */
    /* JADX WARN: Code duplicated, block: B:52:0x0136  */
    /* JADX INFO: renamed from: k */
    public void m2024k(int i10, C6546d c6546d, C6546d c6546d2, AbstractC10458p abstractC10458p, boolean z6) {
        int i11;
        C1313k c1313k;
        int i12;
        int i13;
        int i14;
        C5960K c5960k;
        C5960K c5960k2;
        C5960K c5960k3;
        C5960K c5960k4;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        char c9;
        char c10;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        C3827b0 c3827b0 = (C3827b0) this.f3474i;
        if (c3827b0 == null) {
            c3827b0 = new C3827b0();
            c3827b0.f11592r0 = this;
            c3827b0.f11589o0 = abstractC10458p;
            c3827b0.f11588Z = i10;
            c3827b0.f11590p0 = c6546d;
            c3827b0.f11591q0 = c6546d2;
            c3827b0.f11587Y = z6;
            this.f3474i = c3827b0;
        } else {
            c3827b0.f11589o0 = abstractC10458p;
            c3827b0.f11588Z = i10;
            c3827b0.f11590p0 = c6546d;
            c3827b0.f11591q0 = c6546d2;
            c3827b0.f11587Y = z6;
        }
        int i26 = c6546d.f21184o0 - i10;
        int i27 = c6546d2.f21184o0 - i10;
        int i28 = 1;
        int i29 = ((i26 + i27) + 1) / 2;
        C5960K c5960k5 = new C5960K(i29 * 3);
        C5960K c5960k6 = new C5960K(i29 * 4);
        c5960k6.m6399f(0, i26, 0, i27);
        int i30 = (i29 * 2) + 1;
        int[] iArr = new int[i30];
        int[] iArr2 = new int[i30];
        int[] iArr3 = new int[5];
        while (true) {
            int i31 = c5960k6.f19404b;
            if (i31 == 0) {
                break;
            }
            int[] iArr4 = c5960k6.f19403a;
            int i32 = i31 - 1;
            c5960k6.f19404b = i32;
            int i33 = iArr4[i32];
            int i34 = i31 - 2;
            c5960k6.f19404b = i34;
            int i35 = iArr4[i34];
            int i36 = i31 - 3;
            c5960k6.f19404b = i36;
            int i37 = iArr4[i36];
            int i38 = i31 - 4;
            c5960k6.f19404b = i38;
            int i39 = iArr4[i38];
            int i40 = i37 - i39;
            int i41 = i33 - i35;
            if (i40 < i28 || i41 < i28) {
                i12 = i30;
            } else {
                int i42 = ((i40 + i41) + 1) / 2;
                int i43 = i30 / 2;
                int i44 = i43 + 1;
                iArr[i44] = i39;
                iArr2[i44] = i37;
                i12 = i30;
                int i45 = 0;
                while (true) {
                    if (i45 < i42) {
                        int i46 = i40 - i41;
                        int i47 = i41;
                        int i48 = i42;
                        boolean z10 = Math.abs(i46) % 2 == 1;
                        int i49 = -i45;
                        int i50 = i40;
                        int i51 = i49;
                        while (true) {
                            if (i51 <= i45) {
                                if (i51 != i49) {
                                    if (i51 != i45) {
                                        i13 = i26;
                                        i14 = i27;
                                        if (iArr[i51 + 1 + i43] > iArr[(i51 - 1) + i43]) {
                                        }
                                        i22 = ((i21 - i39) + i35) - i51;
                                        if (i45 == 0 && i21 == i20) {
                                            i23 = i22 - 1;
                                        } else {
                                            i23 = i22;
                                        }
                                        c5960k4 = c5960k6;
                                        i24 = i22;
                                        while (i21 < i37 && i24 < i33 && c3827b0.m4562d(i21, i24)) {
                                            i21++;
                                            i24++;
                                        }
                                        iArr[i43 + i51] = i21;
                                        boolean z11 = z10;
                                        if (z10) {
                                            i25 = i46 - i51;
                                            c5960k3 = c5960k5;
                                            if (i25 < i49 + 1 && i25 <= i45 - 1 && iArr2[i43 + i25] <= i21) {
                                                iArr3[0] = i20;
                                                iArr3[1] = i23;
                                                iArr3[2] = i21;
                                                iArr3[3] = i24;
                                                iArr3[4] = 0;
                                                i17 = i37;
                                                i18 = i33;
                                                c9 = 1;
                                                c10 = 3;
                                            }
                                        } else {
                                            c5960k3 = c5960k5;
                                        }
                                        i51 += 2;
                                        c5960k6 = c5960k4;
                                        i26 = i13;
                                        i27 = i14;
                                        z10 = z11;
                                        c5960k5 = c5960k3;
                                    } else {
                                        i13 = i26;
                                        i14 = i27;
                                    }
                                    i20 = iArr[(i51 - 1) + i43];
                                    i21 = i20 + 1;
                                    i22 = ((i21 - i39) + i35) - i51;
                                    if (i45 == 0) {
                                        i23 = i22;
                                    } else {
                                        i23 = i22;
                                    }
                                    c5960k4 = c5960k6;
                                    i24 = i22;
                                    while (i21 < i37) {
                                        i21++;
                                        i24++;
                                    }
                                    iArr[i43 + i51] = i21;
                                    boolean z12 = z10;
                                    if (z10) {
                                        i25 = i46 - i51;
                                        c5960k3 = c5960k5;
                                        if (i25 < i49 + 1) {
                                            continue;
                                        }
                                    } else {
                                        c5960k3 = c5960k5;
                                    }
                                    i51 += 2;
                                    c5960k6 = c5960k4;
                                    i26 = i13;
                                    i27 = i14;
                                    z10 = z12;
                                    c5960k5 = c5960k3;
                                } else {
                                    i13 = i26;
                                    i14 = i27;
                                }
                                i20 = iArr[i51 + 1 + i43];
                                i21 = i20;
                                i22 = ((i21 - i39) + i35) - i51;
                                if (i45 == 0) {
                                    i23 = i22;
                                } else {
                                    i23 = i22;
                                }
                                c5960k4 = c5960k6;
                                i24 = i22;
                                while (i21 < i37) {
                                    i21++;
                                    i24++;
                                }
                                iArr[i43 + i51] = i21;
                                boolean z13 = z10;
                                if (z10) {
                                    i25 = i46 - i51;
                                    c5960k3 = c5960k5;
                                    if (i25 < i49 + 1) {
                                        continue;
                                    }
                                } else {
                                    c5960k3 = c5960k5;
                                }
                                i51 += 2;
                                c5960k6 = c5960k4;
                                i26 = i13;
                                i27 = i14;
                                z10 = z13;
                                c5960k5 = c5960k3;
                            } else {
                                i13 = i26;
                                i14 = i27;
                                c5960k3 = c5960k5;
                                c5960k4 = c5960k6;
                                boolean z14 = i46 % 2 == 0;
                                int i52 = i49;
                                while (true) {
                                    if (i52 <= i45) {
                                        if (i52 == i49 || (i52 != i45 && iArr2[i52 + 1 + i43] < iArr2[(i52 - 1) + i43])) {
                                            i15 = iArr2[i52 + 1 + i43];
                                            i16 = i15;
                                        } else {
                                            i15 = iArr2[(i52 - 1) + i43];
                                            i16 = i15 - 1;
                                        }
                                        int i53 = i33 - ((i37 - i16) - i52);
                                        int i54 = (i45 == 0 || i16 != i15) ? i53 : i53 + 1;
                                        while (true) {
                                            if (i16 <= i39 || i53 <= i35) {
                                                i17 = i37;
                                                i18 = i33;
                                                break;
                                            }
                                            i17 = i37;
                                            i18 = i33;
                                            if (!c3827b0.m4562d(i16 - 1, i53 - 1)) {
                                                break;
                                            }
                                            i16--;
                                            i53--;
                                            i37 = i17;
                                            i33 = i18;
                                        }
                                        iArr2[i43 + i52] = i16;
                                        if (!z14 || (i19 = i46 - i52) < i49 || i19 > i45 || iArr[i43 + i19] < i16) {
                                            i52 += 2;
                                            c5960k4 = c5960k4;
                                            c5960k3 = c5960k3;
                                            i33 = i18;
                                            i37 = i17;
                                        } else {
                                            iArr3[0] = i16;
                                            c9 = 1;
                                            iArr3[1] = i53;
                                            iArr3[2] = i15;
                                            c10 = 3;
                                            iArr3[3] = i54;
                                            iArr3[4] = 1;
                                        }
                                    } else {
                                        i45++;
                                        i42 = i48;
                                        i40 = i50;
                                        i41 = i47;
                                        i26 = i13;
                                        c5960k5 = c5960k3;
                                        i37 = i37;
                                        c5960k6 = c5960k4;
                                        i27 = i14;
                                    }
                                }
                            }
                            if (AbstractC21690f.m22208m(iArr3) > 0) {
                                int i55 = iArr3[c10];
                                int i56 = iArr3[c9];
                                int i57 = i55 - i56;
                                int i58 = iArr3[2];
                                int i59 = iArr3[0];
                                int i60 = i58 - i59;
                                if (i57 == i60) {
                                    c5960k = c5960k3;
                                    c5960k.m6398e(i59, i56, i60);
                                } else if (iArr3[4] != 0) {
                                    c5960k = c5960k3;
                                    c5960k.m6398e(i59, i56, AbstractC21690f.m22208m(iArr3));
                                } else {
                                    c5960k = c5960k3;
                                    if (i57 > i60) {
                                        c5960k.m6398e(i59, i56 + 1, AbstractC21690f.m22208m(iArr3));
                                    } else {
                                        c5960k.m6398e(i59 + 1, i56, AbstractC21690f.m22208m(iArr3));
                                    }
                                }
                            } else {
                                c5960k = c5960k3;
                            }
                            c5960k2 = c5960k4;
                            c5960k2.m6399f(i39, iArr3[0], i35, iArr3[1]);
                            c5960k2.m6399f(iArr3[2], i17, iArr3[3], i18);
                        }
                    }
                    i28 = 1;
                    i30 = i12;
                    c5960k6 = c5960k2;
                    c5960k5 = c5960k;
                    i26 = i13;
                    i27 = i14;
                }
            }
            i13 = i26;
            i14 = i27;
            c5960k = c5960k5;
            c5960k2 = c5960k6;
            i28 = 1;
            i30 = i12;
            c5960k6 = c5960k2;
            c5960k5 = c5960k;
            i26 = i13;
            i27 = i14;
        }
        int i61 = i26;
        int i62 = i27;
        C5960K c5960k7 = c5960k5;
        int i63 = c5960k7.f19404b;
        if (i63 % 3 != 0) {
            AbstractC8111i5.m8592c(CsqksqyPE.bxXDCTnFNx);
            throw null;
        }
        if (i63 > 3) {
            i11 = 0;
            c5960k7.m6400g(0, i63 - 3);
        } else {
            i11 = 0;
        }
        c5960k7.m6398e(i61, i62, i11);
        int i64 = i11;
        int i65 = i64;
        int i66 = i65;
        while (i64 < c5960k7.f19404b) {
            int[] iArr5 = c5960k7.f19403a;
            int i67 = iArr5[i64];
            int i68 = iArr5[i64 + 2];
            int i69 = i67 - i68;
            int i70 = iArr5[i64 + 1] - i68;
            i64 += 3;
            while (true) {
                c1313k = (C1313k) c3827b0.f11592r0;
                if (i65 >= i69) {
                    break;
                }
                AbstractC10458p abstractC10458p2 = ((AbstractC10458p) c3827b0.f11589o0).f30965r0;
                AbstractC16544l.m18091d(abstractC10458p2);
                c1313k.getClass();
                if ((abstractC10458p2.f30962o0 & 2) != 0) {
                    AbstractC21678Y abstractC21678Y = abstractC10458p2.f30967t0;
                    AbstractC16544l.m18091d(abstractC21678Y);
                    AbstractC21678Y abstractC21678Y2 = abstractC21678Y.f68821z0;
                    AbstractC21678Y abstractC21678Y3 = abstractC21678Y.f68820y0;
                    AbstractC16544l.m18091d(abstractC21678Y3);
                    if (abstractC21678Y2 != null) {
                        abstractC21678Y2.f68820y0 = abstractC21678Y3;
                    }
                    abstractC21678Y3.f68821z0 = abstractC21678Y2;
                    m2014b(c1313k, (AbstractC10458p) c3827b0.f11589o0, abstractC21678Y3);
                }
                c3827b0.f11589o0 = m2016d(abstractC10458p2);
                i65++;
            }
            while (i66 < i70) {
                int i71 = c3827b0.f11588Z + i66;
                AbstractC10458p abstractC10458p3 = (AbstractC10458p) c3827b0.f11589o0;
                InterfaceC10457o interfaceC10457o = (InterfaceC10457o) ((C6546d) c3827b0.f11591q0).f21182Y[i71];
                c1313k.getClass();
                AbstractC10458p abstractC10458pM2015c = m2015c(interfaceC10457o, abstractC10458p3);
                c3827b0.f11589o0 = abstractC10458pM2015c;
                if (c3827b0.f11587Y) {
                    AbstractC10458p abstractC10458p4 = abstractC10458pM2015c.f30965r0;
                    AbstractC16544l.m18091d(abstractC10458p4);
                    AbstractC21678Y abstractC21678Y4 = abstractC10458p4.f30967t0;
                    AbstractC16544l.m18091d(abstractC21678Y4);
                    InterfaceC21718w interfaceC21718wM22202g = AbstractC21690f.m22202g((AbstractC10458p) c3827b0.f11589o0);
                    if (interfaceC21718wM22202g != null) {
                        C21720y c21720y = new C21720y((C21658D) c1313k.f3467b, interfaceC21718wM22202g);
                        ((AbstractC10458p) c3827b0.f11589o0).mo10934J0(c21720y);
                        m2014b(c1313k, (AbstractC10458p) c3827b0.f11589o0, c21720y);
                        c21720y.f68821z0 = abstractC21678Y4.f68821z0;
                        c21720y.f68820y0 = abstractC21678Y4;
                        abstractC21678Y4.f68821z0 = c21720y;
                    } else {
                        ((AbstractC10458p) c3827b0.f11589o0).mo10934J0(abstractC21678Y4);
                    }
                    ((AbstractC10458p) c3827b0.f11589o0).mo10927A0();
                    ((AbstractC10458p) c3827b0.f11589o0).mo10931G0();
                    AbstractC21679Z.m22184a((AbstractC10458p) c3827b0.f11589o0);
                } else {
                    abstractC10458pM2015c.f30968u0 = true;
                }
                i66++;
            }
            while (true) {
                int i72 = i68 - 1;
                if (i68 > 0) {
                    AbstractC10458p abstractC10458p5 = ((AbstractC10458p) c3827b0.f11589o0).f30965r0;
                    AbstractC16544l.m18091d(abstractC10458p5);
                    c3827b0.f11589o0 = abstractC10458p5;
                    C6546d c6546d3 = (C6546d) c3827b0.f11590p0;
                    int i73 = c3827b0.f11588Z;
                    InterfaceC10457o interfaceC10457o2 = (InterfaceC10457o) c6546d3.f21182Y[i73 + i65];
                    InterfaceC10457o interfaceC10457o3 = (InterfaceC10457o) ((C6546d) c3827b0.f11591q0).f21182Y[i73 + i66];
                    if (AbstractC16544l.m18089b(interfaceC10457o2, interfaceC10457o3)) {
                        c1313k.getClass();
                    } else {
                        AbstractC10458p abstractC10458p6 = (AbstractC10458p) c3827b0.f11589o0;
                        c1313k.getClass();
                        m2017m(interfaceC10457o2, interfaceC10457o3, abstractC10458p6);
                    }
                    i65++;
                    i66++;
                    i68 = i72;
                }
            }
        }
        int i74 = i11;
        for (AbstractC10458p abstractC10458p7 = ((C21703l0) this.f3470e).f30964q0; abstractC10458p7 != null && abstractC10458p7 != AbstractC21675V.f68780a; abstractC10458p7 = abstractC10458p7.f30964q0) {
            i74 |= abstractC10458p7.f30962o0;
            abstractC10458p7.f30963p0 = i74;
        }
    }

    public C1313k(Context context, C8361c0 c8361c0, C22102I governmentIdAnalyzeWorkerFactory, C2563g governmentIdHintWorkerFactory, C13288c c13288c, C18433F cameraXControllerFactory, C19026F camera2ManagerFactoryFactory, C17282c navigationStateManager) {
        this.f3466a = 0;
        AbstractC16544l.m18094g(governmentIdAnalyzeWorkerFactory, "governmentIdAnalyzeWorkerFactory");
        AbstractC16544l.m18094g(governmentIdHintWorkerFactory, "governmentIdHintWorkerFactory");
        AbstractC16544l.m18094g(cameraXControllerFactory, "cameraXControllerFactory");
        AbstractC16544l.m18094g(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
        AbstractC16544l.m18094g(navigationStateManager, "navigationStateManager");
        this.f3467b = context;
        this.f3468c = c8361c0;
        this.f3469d = governmentIdAnalyzeWorkerFactory;
        this.f3470e = governmentIdHintWorkerFactory;
        this.f3471f = c13288c;
        this.f3472g = cameraXControllerFactory;
        this.f3473h = camera2ManagerFactoryFactory;
        this.f3474i = navigationStateManager;
    }

    public C1313k(C12953F c12953f) {
        this.f3466a = 1;
        this.f3467b = c12953f;
        this.f3468c = new ArrayList();
        this.f3469d = new ArrayList();
        this.f3470e = new ArrayList();
        this.f3472g = new ArrayList();
        this.f3473h = new C12981t();
        this.f3474i = new C12981t();
    }
}
