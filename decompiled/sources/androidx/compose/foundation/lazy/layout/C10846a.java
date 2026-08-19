package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p1140z1.AbstractC21672S;
import p1140z1.AbstractC21690f;
import p492U1.C7536a;
import p492U1.C7543h;
import p571X9.AbstractC9101A4;
import p571X9.AbstractC9113C4;
import p635a1.AbstractC10458p;
import p635a1.InterfaceC10459q;
import p692d0.AbstractC12957J;
import p692d0.AbstractC12958K;
import p692d0.C12951D;
import p692d0.C12954G;
import p758g0.InterfaceC13726B;
import p774h1.InterfaceC14324B;
import p843k1.C16308b;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17685s;
import p953q0.C18546D;
import p953q0.C18548F;
import p953q0.C18549G;
import p953q0.C18550H;
import p953q0.C18555M;
import p953q0.C18592m;
import p953q0.C18603x;
import p953q0.C18604y;
import p953q0.InterfaceC18556N;
import p953q0.InterfaceC18559Q;
import p953q0.InterfaceC18560S;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10846a {

    /* JADX INFO: renamed from: a */
    public final C12951D f32533a;

    /* JADX INFO: renamed from: b */
    public InterfaceC18556N f32534b;

    /* JADX INFO: renamed from: c */
    public int f32535c;

    /* JADX INFO: renamed from: d */
    public final C12954G f32536d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f32537e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f32538f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f32539g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f32540h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f32541i;

    /* JADX INFO: renamed from: j */
    public C18548F f32542j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC10459q f32543k;

    public C10846a() {
        long[] jArr = AbstractC12957J.f41150a;
        this.f32533a = new C12951D();
        int i10 = AbstractC12958K.f41151a;
        this.f32536d = new C12954G();
        this.f32537e = new ArrayList();
        this.f32538f = new ArrayList();
        this.f32539g = new ArrayList();
        this.f32540h = new ArrayList();
        this.f32541i = new ArrayList();
        this.f32543k = new AbstractC21672S(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement

            /* JADX INFO: renamed from: Y */
            public final C10846a f32526Y;

            {
                this.f32526Y = this;
            }

            @Override // p1140z1.AbstractC21672S
            /* JADX INFO: renamed from: a */
            public final AbstractC10458p mo11196a() {
                C18548F c18548f = new C18548F();
                c18548f.f59100z0 = this.f32526Y;
                return c18548f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && AbstractC16544l.m18089b(this.f32526Y, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).f32526Y);
            }

            public final int hashCode() {
                return this.f32526Y.hashCode();
            }

            @Override // p1140z1.AbstractC21672S
            /* JADX INFO: renamed from: i */
            public final void mo11197i(AbstractC10458p abstractC10458p) {
                C18548F c18548f = (C18548F) abstractC10458p;
                C10846a c10846a = c18548f.f59100z0;
                C10846a c10846a2 = this.f32526Y;
                if (AbstractC16544l.m18089b(c10846a, c10846a2) || !c18548f.f30960Y.f30972y0) {
                    return;
                }
                c18548f.f59100z0.m11268f();
                c10846a2.f32542j = c18548f;
                c18548f.f59100z0 = c10846a2;
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.f32526Y + ')';
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public static void m11262c(InterfaceC18559Q interfaceC18559Q, int i10, C18549G c18549g) {
        int i11 = 0;
        long jMo19816h = interfaceC18559Q.mo19816h(0);
        long jM7879a = interfaceC18559Q.mo19814f() ? C7543h.m7879a(0, i10, 1, jMo19816h) : C7543h.m7879a(i10, 0, 2, jMo19816h);
        C18546D[] c18546dArr = c18549g.f59101a;
        int length = c18546dArr.length;
        int i12 = 0;
        while (i11 < length) {
            C18546D c18546d = c18546dArr[i11];
            int i13 = i12 + 1;
            if (c18546d != null) {
                c18546d.f59092l = C7543h.m7882d(jM7879a, C7543h.m7881c(interfaceC18559Q.mo19816h(i12), jMo19816h));
            }
            i11++;
            i12 = i13;
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m11263h(int[] iArr, InterfaceC18559Q interfaceC18559Q) {
        int iMo19817i = interfaceC18559Q.mo19817i();
        int iMo19813e = interfaceC18559Q.mo19813e() + iMo19817i;
        int iMax = 0;
        while (iMo19817i < iMo19813e) {
            int iMo19810b = interfaceC18559Q.mo19810b() + iArr[iMo19817i];
            iArr[iMo19817i] = iMo19810b;
            iMax = Math.max(iMax, iMo19810b);
            iMo19817i++;
        }
        return iMax;
    }

    /* JADX INFO: renamed from: a */
    public final C18546D m11264a(int i10, Object obj) {
        C18549G c18549g = (C18549G) this.f32533a.m14619e(obj);
        if (c18549g != null) {
            return c18549g.f59101a[i10];
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final long m11265b() {
        ArrayList arrayList = this.f32541i;
        int size = arrayList.size();
        long jM9643a = 0;
        for (int i10 = 0; i10 < size; i10++) {
            C18546D c18546d = (C18546D) arrayList.get(i10);
            C16308b c16308b = c18546d.f59094n;
            if (c16308b != null) {
                jM9643a = AbstractC9113C4.m9643a(Math.max((int) (jM9643a >> 32), ((int) (c18546d.f59092l >> 32)) + ((int) (c16308b.f50538t >> 32))), Math.max((int) (jM9643a & 4294967295L), ((int) (c18546d.f59092l & 4294967295L)) + ((int) (c16308b.f50538t & 4294967295L))));
            }
        }
        return jM9643a;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x03b4  */
    /* JADX INFO: renamed from: d */
    public final void m11266d(int i10, int i11, int i12, ArrayList arrayList, InterfaceC18556N interfaceC18556N, InterfaceC18560S interfaceC18560S, boolean z6, boolean z10, int i13, boolean z11, int i14, int i15, InterfaceC0571F interfaceC0571F, InterfaceC14324B interfaceC14324B) {
        C12951D c12951d;
        long j10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        C12954G c12954g;
        ArrayList arrayList5;
        C12951D c12951d2;
        ArrayList arrayList6;
        InterfaceC18556N interfaceC18556N2;
        int[] iArr;
        C12951D c12951d3;
        int iMo19810b;
        int i16;
        Object[] objArr;
        int i17;
        int i18;
        C12954G c12954g2;
        Object[] objArr2;
        int i19;
        C12951D c12951d4;
        ArrayList arrayList7;
        int i20;
        int i21;
        C18546D[] c18546dArr;
        int i22;
        int i23;
        C12954G c12954g3;
        long j11;
        C12954G c12954g4;
        C18546D[] c18546dArr2;
        long j12;
        long[] jArr;
        ArrayList arrayList8 = arrayList;
        InterfaceC18556N interfaceC18556N3 = this.f32534b;
        this.f32534b = interfaceC18556N;
        int size = arrayList.size();
        int i24 = 0;
        loop0: while (true) {
            c12951d = this.f32533a;
            if (i24 >= size) {
                if (c12951d.f41127e != 0) {
                    break;
                }
                m11268f();
                return;
            }
            InterfaceC18559Q interfaceC18559Q = (InterfaceC18559Q) arrayList8.get(i24);
            int iMo19809a = interfaceC18559Q.mo19809a();
            for (int i25 = 0; i25 < iMo19809a; i25++) {
                Object objMo19811c = interfaceC18559Q.mo19811c(i25);
                if ((objMo19811c instanceof C18592m ? (C18592m) objMo19811c : null) != null) {
                    break loop0;
                }
            }
            i24++;
        }
        int i26 = this.f32535c;
        InterfaceC18559Q interfaceC18559Q2 = (InterfaceC18559Q) AbstractC17680n.m19343S(arrayList);
        this.f32535c = interfaceC18559Q2 != null ? interfaceC18559Q2.getIndex() : 0;
        long jM9631a = z6 ? AbstractC9101A4.m9631a(0, i10) : AbstractC9101A4.m9631a(i10, 0);
        boolean z12 = z10 || !z11;
        Object[] objArr3 = c12951d.f41124b;
        long[] jArr2 = c12951d.f41123a;
        int length = jArr2.length - 2;
        C12954G c12954g5 = this.f32536d;
        if (length >= 0) {
            int i27 = 0;
            while (true) {
                long j13 = jArr2[i27];
                j10 = jM9631a;
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i28 = 8 - ((~(i27 - length)) >>> 31);
                    int i29 = 0;
                    while (i29 < i28) {
                        if ((j13 & 255) < 128) {
                            c12954g5.m14624a(objArr3[(i27 << 3) + i29]);
                        }
                        j13 >>= 8;
                        i29++;
                        jArr2 = jArr2;
                    }
                    jArr = jArr2;
                    if (i28 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                }
                if (i27 == length) {
                    break;
                }
                i27++;
                jM9631a = j10;
                jArr2 = jArr;
            }
        } else {
            j10 = jM9631a;
        }
        int size2 = arrayList.size();
        int i30 = 0;
        while (true) {
            arrayList2 = this.f32541i;
            arrayList3 = this.f32538f;
            arrayList4 = this.f32537e;
            if (i30 >= size2) {
                break;
            }
            InterfaceC18559Q interfaceC18559Q3 = (InterfaceC18559Q) arrayList8.get(i30);
            c12954g5.m14633j(interfaceC18559Q3.getKey());
            int iMo19809a2 = interfaceC18559Q3.mo19809a();
            int i31 = 0;
            while (true) {
                if (i31 >= iMo19809a2) {
                    i22 = size2;
                    i23 = i26;
                    c12954g3 = c12954g5;
                    j11 = j10;
                    m11267e(interfaceC18559Q3.getKey());
                    break;
                }
                i22 = size2;
                Object objMo19811c2 = interfaceC18559Q3.mo19811c(i31);
                int i32 = iMo19809a2;
                if ((objMo19811c2 instanceof C18592m ? (C18592m) objMo19811c2 : null) != null) {
                    C18549G c18549g = (C18549G) c12951d.m14619e(interfaceC18559Q3.getKey());
                    int iMo1046a = interfaceC18556N3 != null ? interfaceC18556N3.mo1046a(interfaceC18559Q3.getKey()) : -1;
                    boolean z13 = iMo1046a == -1 && interfaceC18556N3 != null;
                    if (c18549g == null) {
                        C18549G c18549g2 = new C18549G(this);
                        C18549G.m19918b(c18549g2, interfaceC18559Q3, interfaceC0571F, interfaceC14324B, i14, i15);
                        c12951d.m14623i(interfaceC18559Q3.getKey(), c18549g2);
                        if (interfaceC18559Q3.getIndex() == iMo1046a || iMo1046a == -1) {
                            long jMo19816h = interfaceC18559Q3.mo19816h(0);
                            m11262c(interfaceC18559Q3, (int) (interfaceC18559Q3.mo19814f() ? jMo19816h & 4294967295L : jMo19816h >> 32), c18549g2);
                            if (z13) {
                                for (C18546D c18546d : c18549g2.f59101a) {
                                    if (c18546d != null) {
                                        c18546d.m19911a();
                                    }
                                }
                            }
                        } else if (iMo1046a < i26) {
                            arrayList4.add(interfaceC18559Q3);
                        } else {
                            arrayList3.add(interfaceC18559Q3);
                        }
                    } else if (z12) {
                        C18549G.m19918b(c18549g, interfaceC18559Q3, interfaceC0571F, interfaceC14324B, i14, i15);
                        C18546D[] c18546dArr3 = c18549g.f59101a;
                        int length2 = c18546dArr3.length;
                        int i33 = 0;
                        while (i33 < length2) {
                            int i34 = i26;
                            C18546D c18546d2 = c18546dArr3[i33];
                            if (c18546d2 != null) {
                                c12954g4 = c12954g5;
                                c18546dArr2 = c18546dArr3;
                                if (!C7543h.m7880b(c18546d2.f59092l, C18546D.f59079s)) {
                                    j12 = j10;
                                    c18546d2.f59092l = C7543h.m7882d(c18546d2.f59092l, j12);
                                }
                                i33++;
                                j10 = j12;
                                c18546dArr3 = c18546dArr2;
                                i26 = i34;
                                c12954g5 = c12954g4;
                            } else {
                                c12954g4 = c12954g5;
                                c18546dArr2 = c18546dArr3;
                            }
                            j12 = j10;
                            i33++;
                            j10 = j12;
                            c18546dArr3 = c18546dArr2;
                            i26 = i34;
                            c12954g5 = c12954g4;
                        }
                        i23 = i26;
                        c12954g3 = c12954g5;
                        long j14 = j10;
                        if (z13) {
                            for (C18546D c18546d3 : c18549g.f59101a) {
                                if (c18546d3 != null) {
                                    if (c18546d3.m19912b()) {
                                        arrayList2.remove(c18546d3);
                                        C18548F c18548f = this.f32542j;
                                        if (c18548f != null) {
                                            AbstractC21690f.m22209n(c18548f);
                                        }
                                    }
                                    c18546d3.m19911a();
                                }
                            }
                        }
                        m11269g(interfaceC18559Q3, false);
                        j11 = j14;
                        break;
                    }
                    i23 = i26;
                    c12954g3 = c12954g5;
                    j11 = j10;
                    break;
                }
                i31++;
                iMo19809a2 = i32;
                size2 = i22;
            }
            i30++;
            arrayList8 = arrayList;
            j10 = j11;
            i26 = i23;
            c12954g5 = c12954g3;
            size2 = i22;
        }
        int i35 = i13;
        C12954G c12954g6 = c12954g5;
        int[] iArr2 = new int[i35];
        for (int i36 = 0; i36 < i35; i36++) {
            iArr2[i36] = 0;
        }
        if (z12 && interfaceC18556N3 != null) {
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() > 1) {
                    AbstractC17685s.m19392u(arrayList4, new C18550H(interfaceC18556N3, 2));
                }
                int size3 = arrayList4.size();
                for (int i37 = 0; i37 < size3; i37++) {
                    InterfaceC18559Q interfaceC18559Q4 = (InterfaceC18559Q) arrayList4.get(i37);
                    int iM11263h = i14 - m11263h(iArr2, interfaceC18559Q4);
                    Object objM14619e = c12951d.m14619e(interfaceC18559Q4.getKey());
                    AbstractC16544l.m18091d(objM14619e);
                    m11262c(interfaceC18559Q4, iM11263h, (C18549G) objM14619e);
                    m11269g(interfaceC18559Q4, false);
                }
                AbstractC17678l.m19312s(iArr2, 0, 0, 6);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    AbstractC17685s.m19392u(arrayList3, new C18550H(interfaceC18556N3, 0));
                }
                int size4 = arrayList3.size();
                for (int i38 = 0; i38 < size4; i38++) {
                    InterfaceC18559Q interfaceC18559Q5 = (InterfaceC18559Q) arrayList3.get(i38);
                    int iM11263h2 = (m11263h(iArr2, interfaceC18559Q5) + i15) - interfaceC18559Q5.mo19810b();
                    Object objM14619e2 = c12951d.m14619e(interfaceC18559Q5.getKey());
                    AbstractC16544l.m18091d(objM14619e2);
                    m11262c(interfaceC18559Q5, iM11263h2, (C18549G) objM14619e2);
                    m11269g(interfaceC18559Q5, false);
                }
                AbstractC17678l.m19312s(iArr2, 0, 0, 6);
            }
        }
        C12954G c12954g7 = c12954g6;
        Object[] objArr4 = c12954g7.f41144b;
        long[] jArr3 = c12954g7.f41143a;
        int length3 = jArr3.length - 2;
        ArrayList arrayList9 = this.f32540h;
        ArrayList arrayList10 = this.f32539g;
        boolean z14 = z12;
        int[] iArr3 = iArr2;
        if (length3 >= 0) {
            int i39 = 0;
            while (true) {
                long j15 = jArr3[i39];
                long[] jArr4 = jArr3;
                arrayList5 = arrayList3;
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i40 = 8 - ((~(i39 - length3)) >>> 31);
                    int i41 = 0;
                    while (i41 < i40) {
                        if ((j15 & 255) < 128) {
                            c12954g2 = c12954g7;
                            Object obj = objArr4[(i39 << 3) + i41];
                            Object objM14619e3 = c12951d.m14619e(obj);
                            AbstractC16544l.m18091d(objM14619e3);
                            objArr2 = objArr4;
                            C18549G c18549g3 = (C18549G) objM14619e3;
                            c12951d4 = c12951d;
                            arrayList7 = arrayList4;
                            int iMo1046a2 = interfaceC18556N.mo1046a(obj);
                            int iMin = Math.min(i35, c18549g3.f59105e);
                            c18549g3.f59105e = iMin;
                            c18549g3.f59104d = Math.min(i35 - iMin, c18549g3.f59104d);
                            if (iMo1046a2 == -1) {
                                C18546D[] c18546dArr4 = c18549g3.f59101a;
                                int length4 = c18546dArr4.length;
                                int i42 = 0;
                                boolean z15 = false;
                                int i43 = 0;
                                while (i42 < length4) {
                                    int i44 = length4;
                                    C18546D c18546d4 = c18546dArr4[i42];
                                    int i45 = i43 + 1;
                                    if (c18546d4 != null) {
                                        if (c18546d4.m19912b()) {
                                            i39 = i39;
                                            i40 = i40;
                                            c18546dArr = c18546dArr4;
                                            length3 = length3;
                                        } else {
                                            c18546dArr = c18546dArr4;
                                            if (((Boolean) c18546d4.f59091k.getValue()).booleanValue()) {
                                                c18546d4.m19913c();
                                                c18549g3.f59101a[i43] = null;
                                                arrayList2.remove(c18546d4);
                                                C18548F c18548f2 = this.f32542j;
                                                if (c18548f2 != null) {
                                                    AbstractC21690f.m22209n(c18548f2);
                                                }
                                            } else {
                                                C16308b c16308b = c18546d4.f59094n;
                                                i39 = i39;
                                                if (c16308b != null) {
                                                    InterfaceC13726B interfaceC13726B = c18546d4.f59086f;
                                                    if (!c18546d4.m19912b() && interfaceC13726B != null) {
                                                        c18546d4.m19915e(true);
                                                        AbstractC0575H.m1156D(c18546d4.f59081a, null, null, new C18603x(c18546d4, interfaceC13726B, c16308b, null), 3);
                                                    }
                                                }
                                                if (c18546d4.m19912b()) {
                                                    arrayList2.add(c18546d4);
                                                    C18548F c18548f3 = this.f32542j;
                                                    if (c18548f3 != null) {
                                                        AbstractC21690f.m22209n(c18548f3);
                                                    }
                                                } else {
                                                    c18546d4.m19913c();
                                                    c18549g3.f59101a[i43] = null;
                                                }
                                            }
                                            i42++;
                                            length4 = i44;
                                            i43 = i45;
                                            c18546dArr4 = c18546dArr;
                                            i39 = i39;
                                            length3 = length3;
                                            i40 = i40;
                                        }
                                        z15 = true;
                                        i42++;
                                        length4 = i44;
                                        i43 = i45;
                                        c18546dArr4 = c18546dArr;
                                        i39 = i39;
                                        length3 = length3;
                                        i40 = i40;
                                    } else {
                                        c18546dArr = c18546dArr4;
                                    }
                                    length3 = length3;
                                    i42++;
                                    length4 = i44;
                                    i43 = i45;
                                    c18546dArr4 = c18546dArr;
                                    i39 = i39;
                                    length3 = length3;
                                    i40 = i40;
                                }
                                i18 = i39;
                                i19 = i40;
                                i20 = length3;
                                if (!z15) {
                                    m11267e(obj);
                                }
                            } else {
                                i18 = i39;
                                i19 = i40;
                                i20 = length3;
                                C7536a c7536a = c18549g3.f59102b;
                                AbstractC16544l.m18091d(c7536a);
                                i21 = i41;
                                InterfaceC18559Q interfaceC18559QMo953e = interfaceC18560S.mo953e(iMo1046a2, c18549g3.f59104d, c18549g3.f59105e, c7536a.f23888a);
                                interfaceC18559QMo953e.mo19815g();
                                C18546D[] c18546dArr5 = c18549g3.f59101a;
                                int length5 = c18546dArr5.length;
                                int i46 = 0;
                                while (true) {
                                    if (i46 < length5) {
                                        C18546D c18546d5 = c18546dArr5[i46];
                                        if (c18546d5 != null && ((Boolean) c18546d5.f59088h.getValue()).booleanValue()) {
                                        }
                                        i46++;
                                        c18546dArr5 = c18546dArr5;
                                    } else if (interfaceC18556N3 != null && iMo1046a2 == interfaceC18556N3.mo1046a(obj)) {
                                        m11267e(obj);
                                    }
                                    c18549g3.m19919a(interfaceC18559QMo953e, interfaceC0571F, interfaceC14324B, i14, i15, c18549g3.f59103c);
                                    if (iMo1046a2 < this.f32535c) {
                                        arrayList10.add(interfaceC18559QMo953e);
                                    } else {
                                        arrayList9.add(interfaceC18559QMo953e);
                                    }
                                }
                            }
                            j15 >>= 8;
                            i41 = i21 + 1;
                            i35 = i13;
                            arrayList4 = arrayList7;
                            c12954g7 = c12954g2;
                            objArr4 = objArr2;
                            c12951d = c12951d4;
                            i39 = i18;
                            length3 = i20;
                            i40 = i19;
                        } else {
                            i18 = i39;
                            c12954g2 = c12954g7;
                            objArr2 = objArr4;
                            i19 = i40;
                            c12951d4 = c12951d;
                            arrayList7 = arrayList4;
                            i20 = length3;
                        }
                        i21 = i41;
                        j15 >>= 8;
                        i41 = i21 + 1;
                        i35 = i13;
                        arrayList4 = arrayList7;
                        c12954g7 = c12954g2;
                        objArr4 = objArr2;
                        c12951d = c12951d4;
                        i39 = i18;
                        length3 = i20;
                        i40 = i19;
                    }
                    int i47 = i39;
                    c12954g = c12954g7;
                    objArr = objArr4;
                    c12951d2 = c12951d;
                    arrayList6 = arrayList4;
                    int i48 = length3;
                    if (i40 != 8) {
                        break;
                    }
                    i17 = i47;
                    length3 = i48;
                } else {
                    c12954g = c12954g7;
                    objArr = objArr4;
                    c12951d2 = c12951d;
                    arrayList6 = arrayList4;
                    i17 = i39;
                }
                if (i17 == length3) {
                    break;
                }
                i35 = i13;
                i39 = i17 + 1;
                arrayList3 = arrayList5;
                jArr3 = jArr4;
                arrayList4 = arrayList6;
                c12954g7 = c12954g;
                objArr4 = objArr;
                c12951d = c12951d2;
            }
        } else {
            c12954g = c12954g7;
            arrayList5 = arrayList3;
            c12951d2 = c12951d;
            arrayList6 = arrayList4;
        }
        if (arrayList10.isEmpty()) {
            interfaceC18556N2 = interfaceC18556N;
            iArr = iArr3;
            c12951d3 = c12951d2;
        } else {
            if (arrayList10.size() > 1) {
                interfaceC18556N2 = interfaceC18556N;
                AbstractC17685s.m19392u(arrayList10, new C18550H(interfaceC18556N2, 3));
            } else {
                interfaceC18556N2 = interfaceC18556N;
            }
            int size5 = arrayList10.size();
            int i49 = 0;
            while (i49 < size5) {
                InterfaceC18559Q interfaceC18559Q6 = (InterfaceC18559Q) arrayList10.get(i49);
                C12951D c12951d5 = c12951d2;
                Object objM14619e4 = c12951d5.m14619e(interfaceC18559Q6.getKey());
                AbstractC16544l.m18091d(objM14619e4);
                C18549G c18549g4 = (C18549G) objM14619e4;
                int[] iArr4 = iArr3;
                int iM11263h3 = m11263h(iArr4, interfaceC18559Q6);
                if (z10) {
                    InterfaceC18559Q interfaceC18559Q7 = (InterfaceC18559Q) AbstractC17680n.m19341Q(arrayList);
                    long jMo19816h2 = interfaceC18559Q7.mo19816h(0);
                    i16 = interfaceC18559Q7.mo19814f() ? (int) (jMo19816h2 & 4294967295L) : (int) (jMo19816h2 >> 32);
                } else {
                    i16 = c18549g4.f59106f;
                }
                interfaceC18559Q6.mo19818j(i16 - iM11263h3, c18549g4.f59103c, i11, i12);
                if (z14) {
                    m11269g(interfaceC18559Q6, true);
                }
                i49++;
                c12951d2 = c12951d5;
                iArr3 = iArr4;
            }
            iArr = iArr3;
            c12951d3 = c12951d2;
            AbstractC17678l.m19312s(iArr, 0, 0, 6);
        }
        if (!arrayList9.isEmpty()) {
            if (arrayList9.size() > 1) {
                AbstractC17685s.m19392u(arrayList9, new C18550H(interfaceC18556N2, 1));
            }
            int size6 = arrayList9.size();
            for (int i50 = 0; i50 < size6; i50++) {
                InterfaceC18559Q interfaceC18559Q8 = (InterfaceC18559Q) arrayList9.get(i50);
                Object objM14619e5 = c12951d3.m14619e(interfaceC18559Q8.getKey());
                AbstractC16544l.m18091d(objM14619e5);
                C18549G c18549g5 = (C18549G) objM14619e5;
                int iM11263h4 = m11263h(iArr, interfaceC18559Q8);
                if (z10) {
                    InterfaceC18559Q interfaceC18559Q9 = (InterfaceC18559Q) AbstractC17680n.m19351a0(arrayList);
                    long jMo19816h3 = interfaceC18559Q9.mo19816h(0);
                    iMo19810b = interfaceC18559Q9.mo19814f() ? (int) (jMo19816h3 & 4294967295L) : (int) (jMo19816h3 >> 32);
                } else {
                    iMo19810b = c18549g5.f59107g - interfaceC18559Q8.mo19810b();
                }
                interfaceC18559Q8.mo19818j(iMo19810b + iM11263h4, c18549g5.f59103c, i11, i12);
                if (z14) {
                    m11269g(interfaceC18559Q8, true);
                }
            }
        }
        Collections.reverse(arrayList10);
        arrayList.addAll(0, arrayList10);
        arrayList.addAll(arrayList9);
        arrayList6.clear();
        arrayList5.clear();
        arrayList10.clear();
        arrayList9.clear();
        c12954g.m14625b();
    }

    /* JADX INFO: renamed from: e */
    public final void m11267e(Object obj) {
        C18546D[] c18546dArr;
        C18549G c18549g = (C18549G) this.f32533a.m14621g(obj);
        if (c18549g == null || (c18546dArr = c18549g.f59101a) == null) {
            return;
        }
        for (C18546D c18546d : c18546dArr) {
            if (c18546d != null) {
                c18546d.m19913c();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0055 A[LOOP:0: B:7:0x0011->B:22:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0058 A[EDGE_INSN: B:27:0x0058->B:23:0x0058 BREAK  A[LOOP:0: B:7:0x0011->B:22:0x0055], SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final void m11268f() {
        C12951D c12951d = this.f32533a;
        if (c12951d.f41127e != 0) {
            Object[] objArr = c12951d.f41125c;
            long[] jArr = c12951d.f41123a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                for (C18546D c18546d : ((C18549G) objArr[(i10 << 3) + i12]).f59101a) {
                                    if (c18546d != null) {
                                        c18546d.m19913c();
                                    }
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 != length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            c12951d.m14615a();
        }
        this.f32534b = C18555M.f59120Y;
        this.f32535c = -1;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006c  */
    /* JADX INFO: renamed from: g */
    public final void m11269g(InterfaceC18559Q interfaceC18559Q, boolean z6) {
        Object objM14619e = this.f32533a.m14619e(interfaceC18559Q.getKey());
        AbstractC16544l.m18091d(objM14619e);
        C18546D[] c18546dArr = ((C18549G) objM14619e).f59101a;
        int length = c18546dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            C18546D c18546d = c18546dArr[i10];
            int i12 = i11 + 1;
            if (c18546d != null) {
                long jMo19816h = interfaceC18559Q.mo19816h(i11);
                long j10 = c18546d.f59092l;
                if (!C7543h.m7880b(j10, C18546D.f59079s) && !C7543h.m7880b(j10, jMo19816h)) {
                    long jM7881c = C7543h.m7881c(jMo19816h, j10);
                    InterfaceC13726B interfaceC13726B = c18546d.f59085e;
                    if (interfaceC13726B != null) {
                        long jM7881c2 = C7543h.m7881c(((C7543h) c18546d.f59097q.getValue()).f23897a, jM7881c);
                        c18546d.m19917g(jM7881c2);
                        c18546d.m19916f(true);
                        c18546d.f59087g = z6;
                        AbstractC0575H.m1156D(c18546d.f59081a, null, null, new C18604y(c18546d, interfaceC13726B, jM7881c2, null), 3);
                    }
                }
                c18546d.f59092l = jMo19816h;
            } else {
                c18546dArr = c18546dArr;
            }
            i10++;
            i11 = i12;
            c18546dArr = c18546dArr;
        }
    }
}
