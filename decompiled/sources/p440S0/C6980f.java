package p440S0;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.C0742X;
import p049Bm.InterfaceC1436k;
import p076Cm.InterfaceC1724b;
import p1053v3.p1054lN.IGDwkYw;
import p349O0.C5997d;
import p515V0.C7736b;
import p571X9.AbstractC9339o3;
import p594Y9.AbstractC9870d0;
import p720e6.C13288c;
import p909nm.AbstractC17673g;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: S0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C6980f extends AbstractC17673g implements Collection, InterfaceC1724b {

    /* JADX INFO: renamed from: Y */
    public AbstractC6977c f22313Y;

    /* JADX INFO: renamed from: Z */
    public Object[] f22314Z;

    /* JADX INFO: renamed from: o0 */
    public Object[] f22315o0;

    /* JADX INFO: renamed from: p0 */
    public int f22316p0;

    /* JADX INFO: renamed from: q0 */
    public C7736b f22317q0 = new C7736b();

    /* JADX INFO: renamed from: r0 */
    public Object[] f22318r0;

    /* JADX INFO: renamed from: s0 */
    public Object[] f22319s0;

    /* JADX INFO: renamed from: t0 */
    public int f22320t0;

    public C6980f(AbstractC6977c abstractC6977c, Object[] objArr, Object[] objArr2, int i10) {
        this.f22313Y = abstractC6977c;
        this.f22314Z = objArr;
        this.f22315o0 = objArr2;
        this.f22316p0 = i10;
        this.f22318r0 = objArr;
        this.f22319s0 = objArr2;
        this.f22320t0 = abstractC6977c.mo1316f();
    }

    /* JADX INFO: renamed from: p */
    public static void m7353p(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
    }

    /* JADX INFO: renamed from: A */
    public final Object[] m7354A(Object[] objArr, int i10, int i11) {
        if (!(i11 >= 0)) {
            C5997d.m6443b0("shift should be positive");
            throw null;
        }
        if (i11 == 0) {
            return objArr;
        }
        int iM9935a = AbstractC9339o3.m9935a(i10, i11);
        Object obj = objArr[iM9935a];
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objM7354A = m7354A((Object[]) obj, i10, i11 - 5);
        if (iM9935a < 31) {
            int i12 = iM9935a + 1;
            if (objArr[i12] != null) {
                if (m7378u(objArr)) {
                    Arrays.fill(objArr, i12, 32, (Object) null);
                }
                Object[] objArrM7382y = m7382y();
                AbstractC17678l.m19304k(0, 0, i12, objArr, objArrM7382y);
                objArr = objArrM7382y;
            }
        }
        if (objM7354A == objArr[iM9935a]) {
            return objArr;
        }
        Object[] objArrM7380w = m7380w(objArr);
        objArrM7380w[iM9935a] = objM7354A;
        return objArrM7380w;
    }

    /* JADX INFO: renamed from: B */
    public final Object[] m7355B(Object[] objArr, int i10, int i11, C13288c c13288c) {
        Object[] objArrM7355B;
        int iM9935a = AbstractC9339o3.m9935a(i11 - 1, i10);
        if (i10 == 5) {
            c13288c.f42001Y = objArr[iM9935a];
            objArrM7355B = null;
        } else {
            Object obj = objArr[iM9935a];
            AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrM7355B = m7355B((Object[]) obj, i10 - 5, i11, c13288c);
        }
        if (objArrM7355B == null && iM9935a == 0) {
            return null;
        }
        Object[] objArrM7380w = m7380w(objArr);
        objArrM7380w[iM9935a] = objArrM7355B;
        return objArrM7380w;
    }

    /* JADX INFO: renamed from: C */
    public final void m7356C(Object[] objArr, int i10, int i11) {
        Object obj = null;
        if (i11 == 0) {
            this.f22318r0 = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f22319s0 = objArr;
            this.f22320t0 = i10;
            this.f22316p0 = i11;
            return;
        }
        C13288c c13288c = new C13288c(obj);
        AbstractC16544l.m18091d(objArr);
        Object[] objArrM7355B = m7355B(objArr, i11, i10, c13288c);
        AbstractC16544l.m18091d(objArrM7355B);
        Object obj2 = c13288c.f42001Y;
        AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f22319s0 = (Object[]) obj2;
        this.f22320t0 = i10;
        if (objArrM7355B[1] == null) {
            this.f22318r0 = (Object[]) objArrM7355B[0];
            this.f22316p0 = i11 - 5;
        } else {
            this.f22318r0 = objArrM7355B;
            this.f22316p0 = i11;
        }
    }

    /* JADX INFO: renamed from: D */
    public final Object[] m7357D(Object[] objArr, int i10, int i11, Iterator it) {
        if (!it.hasNext()) {
            C5997d.m6443b0("invalid buffersIterator");
            throw null;
        }
        if (!(i11 >= 0)) {
            C5997d.m6443b0("negative shift");
            throw null;
        }
        if (i11 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrM7380w = m7380w(objArr);
        int iM9935a = AbstractC9339o3.m9935a(i10, i11);
        int i12 = i11 - 5;
        objArrM7380w[iM9935a] = m7357D((Object[]) objArrM7380w[iM9935a], i10, i12, it);
        while (true) {
            iM9935a++;
            if (iM9935a >= 32 || !it.hasNext()) {
                break;
            }
            objArrM7380w[iM9935a] = m7357D((Object[]) objArrM7380w[iM9935a], 0, i12, it);
        }
        return objArrM7380w;
    }

    /* JADX INFO: renamed from: E */
    public final Object[] m7358E(Object[] objArr, int i10, Object[][] objArr2) {
        C0742X c0742xM18098k = AbstractC16544l.m18098k(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f22316p0;
        Object[] objArrM7357D = i11 < (1 << i12) ? m7357D(objArr, i10, i12, c0742xM18098k) : m7380w(objArr);
        while (c0742xM18098k.hasNext()) {
            this.f22316p0 += 5;
            objArrM7357D = m7383z(objArrM7357D);
            int i13 = this.f22316p0;
            m7357D(objArrM7357D, 1 << i13, i13, c0742xM18098k);
        }
        return objArrM7357D;
    }

    /* JADX INFO: renamed from: F */
    public final void m7359F(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f22320t0;
        int i11 = i10 >> 5;
        int i12 = this.f22316p0;
        if (i11 > (1 << i12)) {
            this.f22318r0 = m7360G(this.f22316p0 + 5, m7383z(objArr), objArr2);
            this.f22319s0 = objArr3;
            this.f22316p0 += 5;
            this.f22320t0++;
            return;
        }
        if (objArr == null) {
            this.f22318r0 = objArr2;
            this.f22319s0 = objArr3;
            this.f22320t0 = i10 + 1;
        } else {
            this.f22318r0 = m7360G(i12, objArr, objArr2);
            this.f22319s0 = objArr3;
            this.f22320t0++;
        }
    }

    /* JADX INFO: renamed from: G */
    public final Object[] m7360G(int i10, Object[] objArr, Object[] objArr2) {
        int iM9935a = AbstractC9339o3.m9935a(mo7371f() - 1, i10);
        Object[] objArrM7380w = m7380w(objArr);
        if (i10 == 5) {
            objArrM7380w[iM9935a] = objArr2;
        } else {
            objArrM7380w[iM9935a] = m7360G(i10 - 5, (Object[]) objArrM7380w[iM9935a], objArr2);
        }
        return objArrM7380w;
    }

    /* JADX INFO: renamed from: H */
    public final int m7361H(InterfaceC1436k interfaceC1436k, Object[] objArr, int i10, int i11, C13288c c13288c, ArrayList arrayList, ArrayList arrayList2) {
        if (m7378u(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = c13288c.f42001Y;
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrM7382y = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj2 = objArr[i12];
            if (!((Boolean) interfaceC1436k.invoke(obj2)).booleanValue()) {
                if (i11 == 32) {
                    objArrM7382y = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m7382y();
                    i11 = 0;
                }
                objArrM7382y[i11] = obj2;
                i11++;
            }
        }
        c13288c.f42001Y = objArrM7382y;
        if (objArr2 != objArrM7382y) {
            arrayList2.add(objArr2);
        }
        return i11;
    }

    /* JADX INFO: renamed from: I */
    public final int m7362I(InterfaceC1436k interfaceC1436k, Object[] objArr, int i10, C13288c c13288c) {
        Object[] objArrM7380w = objArr;
        int i11 = i10;
        boolean z6 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (((Boolean) interfaceC1436k.invoke(obj)).booleanValue()) {
                if (!z6) {
                    objArrM7380w = m7380w(objArr);
                    z6 = true;
                    i11 = i12;
                }
            } else if (z6) {
                objArrM7380w[i11] = obj;
                i11++;
            }
        }
        c13288c.f42001Y = objArrM7380w;
        return i11;
    }

    /* JADX INFO: renamed from: J */
    public final int m7363J(InterfaceC1436k interfaceC1436k, int i10, C13288c c13288c) {
        int iM7362I = m7362I(interfaceC1436k, this.f22319s0, i10, c13288c);
        if (iM7362I == i10) {
            return i10;
        }
        Object obj = c13288c.f42001Y;
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iM7362I, i10, (Object) null);
        this.f22319s0 = objArr;
        this.f22320t0 -= i10 - iM7362I;
        return iM7362I;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    /* JADX INFO: renamed from: K */
    public final boolean m7364K(InterfaceC1436k interfaceC1436k) {
        Object[] objArrM7357D;
        int i10;
        int iM7370Q = m7370Q();
        Object[] objArrM7354A = null;
        C13288c c13288c = new C13288c(objArrM7354A);
        boolean z6 = false;
        if (this.f22318r0 != null) {
            AbstractC6975a abstractC6975aM7379v = m7379v(0);
            int i11 = 32;
            int iM7362I = 32;
            while (iM7362I == 32 && abstractC6975aM7379v.hasNext()) {
                iM7362I = m7362I(interfaceC1436k, (Object[]) abstractC6975aM7379v.next(), 32, c13288c);
            }
            if (iM7362I == 32) {
                int iM7363J = m7363J(interfaceC1436k, iM7370Q, c13288c);
                if (iM7363J == 0) {
                    m7356C(this.f22318r0, this.f22320t0, this.f22316p0);
                }
                if (iM7363J != iM7370Q) {
                    z6 = true;
                }
            } else {
                int i12 = (abstractC6975aM7379v.f22303Y - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iM7361H = iM7362I;
                while (abstractC6975aM7379v.hasNext()) {
                    iM7361H = m7361H(interfaceC1436k, (Object[]) abstractC6975aM7379v.next(), 32, iM7361H, c13288c, arrayList2, arrayList);
                    i12 = i12;
                    i11 = i11;
                }
                int i13 = i12;
                int iM7361H2 = m7361H(interfaceC1436k, this.f22319s0, iM7370Q, iM7361H, c13288c, arrayList2, arrayList);
                Object obj = c13288c.f42001Y;
                AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iM7361H2, i11, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrM7357D = this.f22318r0;
                    AbstractC16544l.m18091d(objArrM7357D);
                } else {
                    objArrM7357D = m7357D(this.f22318r0, i13, this.f22316p0, arrayList.iterator());
                }
                int size = i13 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    C5997d.m6443b0("invalid size");
                    throw null;
                }
                if (size == 0) {
                    this.f22316p0 = 0;
                } else {
                    int i14 = size - 1;
                    while (true) {
                        i10 = this.f22316p0;
                        if ((i14 >> i10) != 0) {
                            break;
                        }
                        this.f22316p0 = i10 - 5;
                        Object[] objArr2 = objArrM7357D[0];
                        AbstractC16544l.m18092e(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrM7357D = objArr2;
                    }
                    objArrM7354A = m7354A(objArrM7357D, i14, i10);
                }
                this.f22318r0 = objArrM7354A;
                this.f22319s0 = objArr;
                this.f22320t0 = size + iM7361H2;
                z6 = true;
            }
        } else if (m7363J(interfaceC1436k, iM7370Q, c13288c) != iM7370Q) {
            z6 = true;
        }
        if (z6) {
            ((AbstractList) this).modCount++;
        }
        return z6;
    }

    /* JADX INFO: renamed from: L */
    public final Object[] m7365L(Object[] objArr, int i10, int i11, C13288c c13288c) {
        int iM9935a = AbstractC9339o3.m9935a(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[iM9935a];
            Object[] objArrM7380w = m7380w(objArr);
            AbstractC17678l.m19304k(iM9935a, iM9935a + 1, 32, objArr, objArrM7380w);
            objArrM7380w[31] = c13288c.f42001Y;
            c13288c.f42001Y = obj;
            return objArrM7380w;
        }
        int iM9935a2 = objArr[31] == null ? AbstractC9339o3.m9935a(m7367N() - 1, i10) : 31;
        Object[] objArrM7380w2 = m7380w(objArr);
        int i12 = i10 - 5;
        int i13 = iM9935a + 1;
        if (i13 <= iM9935a2) {
            while (true) {
                Object obj2 = objArrM7380w2[iM9935a2];
                AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrM7380w2[iM9935a2] = m7365L((Object[]) obj2, i12, 0, c13288c);
                if (iM9935a2 == i13) {
                    break;
                }
                iM9935a2--;
            }
        }
        Object obj3 = objArrM7380w2[iM9935a];
        AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrM7380w2[iM9935a] = m7365L((Object[]) obj3, i12, i11, c13288c);
        return objArrM7380w2;
    }

    /* JADX INFO: renamed from: M */
    public final Object m7366M(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.f22320t0 - i10;
        if (i13 == 1) {
            Object obj = this.f22319s0[0];
            m7356C(objArr, i10, i11);
            return obj;
        }
        Object[] objArr2 = this.f22319s0;
        Object obj2 = objArr2[i12];
        Object[] objArrM7380w = m7380w(objArr2);
        AbstractC17678l.m19304k(i12, i12 + 1, i13, objArr2, objArrM7380w);
        objArrM7380w[i13 - 1] = null;
        this.f22318r0 = objArr;
        this.f22319s0 = objArrM7380w;
        this.f22320t0 = (i10 + i13) - 1;
        this.f22316p0 = i11;
        return obj2;
    }

    /* JADX INFO: renamed from: N */
    public final int m7367N() {
        int i10 = this.f22320t0;
        if (i10 <= 32) {
            return 0;
        }
        return (i10 - 1) & (-32);
    }

    /* JADX INFO: renamed from: P */
    public final void m7369P(Collection collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrM7382y;
        if (i12 < 1) {
            C5997d.m6443b0("requires at least one nullBuffer");
            throw null;
        }
        Object[] objArrM7380w = m7380w(objArr);
        objArr2[0] = objArrM7380w;
        int i13 = i10 & 31;
        int size = ((collection.size() + i10) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            AbstractC17678l.m19304k(size + 1, i13, i11, objArrM7380w, objArr3);
        } else {
            int i15 = i14 - 31;
            if (i12 == 1) {
                objArrM7382y = objArrM7380w;
            } else {
                objArrM7382y = m7382y();
                i12--;
                objArr2[i12] = objArrM7382y;
            }
            int i16 = i11 - i15;
            AbstractC17678l.m19304k(0, i16, i11, objArrM7380w, objArr3);
            AbstractC17678l.m19304k(size + 1, i13, i16, objArrM7380w, objArrM7382y);
            objArr3 = objArrM7382y;
        }
        Iterator it = collection.iterator();
        m7353p(objArrM7380w, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            Object[] objArrM7382y2 = m7382y();
            m7353p(objArrM7382y2, 0, it);
            objArr2[i17] = objArrM7382y2;
        }
        m7353p(objArr3, 0, it);
    }

    /* JADX INFO: renamed from: Q */
    public final int m7370Q() {
        int i10 = this.f22320t0;
        return i10 <= 32 ? i10 : i10 - ((i10 - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        AbstractC9870d0.m10524b(i10, mo7371f());
        if (i10 == mo7371f()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM7367N = m7367N();
        if (i10 >= iM7367N) {
            m7377t(i10 - iM7367N, obj, this.f22318r0);
            return;
        }
        C13288c c13288c = new C13288c((Object) null);
        Object[] objArr = this.f22318r0;
        AbstractC16544l.m18091d(objArr);
        m7377t(0, c13288c.f42001Y, m7376s(objArr, this.f22316p0, i10, obj, c13288c));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        Object[] objArrM7382y;
        AbstractC9870d0.m10524b(i10, this.f22320t0);
        if (i10 == this.f22320t0) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = ((collection.size() + (this.f22320t0 - i11)) - 1) / 32;
        if (size == 0) {
            int i12 = i10 & 31;
            int size2 = ((collection.size() + i10) - 1) & 31;
            Object[] objArr = this.f22319s0;
            Object[] objArrM7380w = m7380w(objArr);
            AbstractC17678l.m19304k(size2 + 1, i12, m7370Q(), objArr, objArrM7380w);
            m7353p(objArrM7380w, i12, collection.iterator());
            this.f22319s0 = objArrM7380w;
            this.f22320t0 = collection.size() + this.f22320t0;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM7370Q = m7370Q();
        int size3 = collection.size() + this.f22320t0;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i10 >= m7367N()) {
            objArrM7382y = m7382y();
            m7369P(collection, i10, this.f22319s0, iM7370Q, objArr2, size, objArrM7382y);
        } else if (size3 > iM7370Q) {
            int i13 = size3 - iM7370Q;
            objArrM7382y = m7381x(i13, this.f22319s0);
            m7375r(collection, i10, i13, objArr2, size, objArrM7382y);
        } else {
            Object[] objArr3 = this.f22319s0;
            objArrM7382y = m7382y();
            int i14 = iM7370Q - size3;
            AbstractC17678l.m19304k(0, i14, iM7370Q, objArr3, objArrM7382y);
            int i15 = 32 - i14;
            Object[] objArrM7381x = m7381x(i15, this.f22319s0);
            int i16 = size - 1;
            objArr2[i16] = objArrM7381x;
            m7375r(collection, i10, i15, objArr2, i16, objArrM7381x);
        }
        this.f22318r0 = m7358E(this.f22318r0, i11, objArr2);
        this.f22319s0 = objArrM7382y;
        this.f22320t0 = collection.size() + this.f22320t0;
        return true;
    }

    @Override // p909nm.AbstractC17673g
    /* JADX INFO: renamed from: f */
    public final int mo7371f() {
        return this.f22320t0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        Object[] objArr;
        AbstractC9870d0.m10523a(i10, mo7371f());
        if (m7367N() <= i10) {
            objArr = this.f22319s0;
        } else {
            objArr = this.f22318r0;
            AbstractC16544l.m18091d(objArr);
            for (int i11 = this.f22316p0; i11 > 0; i11 -= 5) {
                Object obj = objArr[AbstractC9339o3.m9935a(i10, i11)];
                AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p909nm.AbstractC17673g
    /* JADX INFO: renamed from: j */
    public final Object mo7372j(int i10) {
        AbstractC9870d0.m10523a(i10, mo7371f());
        ((AbstractList) this).modCount++;
        int iM7367N = m7367N();
        if (i10 >= iM7367N) {
            return m7366M(this.f22318r0, iM7367N, this.f22316p0, i10 - iM7367N);
        }
        C13288c c13288c = new C13288c(this.f22319s0[0]);
        Object[] objArr = this.f22318r0;
        AbstractC16544l.m18091d(objArr);
        m7366M(m7365L(objArr, this.f22316p0, i10, c13288c), iM7367N, this.f22316p0, 0);
        return c13288c.f42001Y;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        AbstractC9870d0.m10524b(i10, this.f22320t0);
        return new C6982h(this, i10);
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC6977c m7373m() {
        AbstractC6977c c6979e;
        Object[] objArr = this.f22318r0;
        if (objArr == this.f22314Z && this.f22319s0 == this.f22315o0) {
            c6979e = this.f22313Y;
        } else {
            this.f22317q0 = new C7736b();
            this.f22314Z = objArr;
            Object[] objArr2 = this.f22319s0;
            this.f22315o0 = objArr2;
            if (objArr != null) {
                c6979e = new C6979e(objArr, objArr2, this.f22320t0, this.f22316p0);
            } else if (objArr2.length == 0) {
                c6979e = C6983i.f22327Z;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.f22319s0, this.f22320t0);
                AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
                c6979e = new C6983i(objArrCopyOf);
            }
        }
        this.f22313Y = c6979e;
        return c6979e;
    }

    /* JADX INFO: renamed from: q */
    public final int m7374q() {
        return ((AbstractList) this).modCount;
    }

    /* JADX INFO: renamed from: r */
    public final void m7375r(Collection collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f22318r0 == null) {
            throw new IllegalStateException("root is null");
        }
        int i13 = i10 >> 5;
        AbstractC6975a abstractC6975aM7379v = m7379v(m7367N() >> 5);
        int i14 = i12;
        Object[] objArrM7381x = objArr2;
        while (abstractC6975aM7379v.f22303Y - 1 != i13) {
            Object[] objArr3 = (Object[]) abstractC6975aM7379v.previous();
            AbstractC17678l.m19304k(0, 32 - i11, 32, objArr3, objArrM7381x);
            objArrM7381x = m7381x(i11, objArr3);
            i14--;
            objArr[i14] = objArrM7381x;
        }
        Object[] objArr4 = (Object[]) abstractC6975aM7379v.previous();
        int iM7367N = i12 - (((m7367N() >> 5) - 1) - i13);
        if (iM7367N < i12) {
            objArr2 = objArr[iM7367N];
            AbstractC16544l.m18091d(objArr2);
        }
        m7369P(collection, i10, objArr4, 32, objArr, iM7367N, objArr2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return m7364K(new C6976b(1, collection));
    }

    /* JADX INFO: renamed from: s */
    public final Object[] m7376s(Object[] objArr, int i10, int i11, Object obj, C13288c c13288c) {
        Object obj2;
        int iM9935a = AbstractC9339o3.m9935a(i11, i10);
        if (i10 == 0) {
            c13288c.f42001Y = objArr[31];
            Object[] objArrM7380w = m7380w(objArr);
            AbstractC17678l.m19304k(iM9935a + 1, iM9935a, 31, objArr, objArrM7380w);
            objArrM7380w[iM9935a] = obj;
            return objArrM7380w;
        }
        Object[] objArrM7380w2 = m7380w(objArr);
        int i12 = i10 - 5;
        Object obj3 = objArrM7380w2[iM9935a];
        AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrM7380w2[iM9935a] = m7376s((Object[]) obj3, i12, i11, obj, c13288c);
        while (true) {
            iM9935a++;
            if (iM9935a >= 32 || (obj2 = objArrM7380w2[iM9935a]) == null) {
                break;
            }
            objArrM7380w2[iM9935a] = m7376s((Object[]) obj2, i12, 0, c13288c.f42001Y, c13288c);
        }
        return objArrM7380w2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        AbstractC9870d0.m10523a(i10, mo7371f());
        if (m7367N() > i10) {
            C13288c c13288c = new C13288c((Object) null);
            Object[] objArr = this.f22318r0;
            AbstractC16544l.m18091d(objArr);
            this.f22318r0 = m7368O(objArr, this.f22316p0, i10, obj, c13288c);
            return c13288c.f42001Y;
        }
        Object[] objArrM7380w = m7380w(this.f22319s0);
        if (objArrM7380w != this.f22319s0) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        Object obj2 = objArrM7380w[i11];
        objArrM7380w[i11] = obj;
        this.f22319s0 = objArrM7380w;
        return obj2;
    }

    /* JADX INFO: renamed from: t */
    public final void m7377t(int i10, Object obj, Object[] objArr) {
        int iM7370Q = m7370Q();
        Object[] objArrM7380w = m7380w(this.f22319s0);
        if (iM7370Q >= 32) {
            Object[] objArr2 = this.f22319s0;
            Object obj2 = objArr2[31];
            AbstractC17678l.m19304k(i10 + 1, i10, 31, objArr2, objArrM7380w);
            objArrM7380w[i10] = obj;
            m7359F(objArr, objArrM7380w, m7383z(obj2));
            return;
        }
        AbstractC17678l.m19304k(i10 + 1, i10, iM7370Q, this.f22319s0, objArrM7380w);
        objArrM7380w[i10] = obj;
        this.f22318r0 = objArr;
        this.f22319s0 = objArrM7380w;
        this.f22320t0++;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m7378u(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f22317q0;
    }

    /* JADX INFO: renamed from: v */
    public final AbstractC6975a m7379v(int i10) {
        Object[] objArr = this.f22318r0;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iM7367N = m7367N() >> 5;
        AbstractC9870d0.m10524b(i10, iM7367N);
        int i11 = this.f22316p0;
        return i11 == 0 ? new C6978d(objArr, i10) : new C6984j(objArr, i10, iM7367N, i11 / 5);
    }

    /* JADX INFO: renamed from: w */
    public final Object[] m7380w(Object[] objArr) {
        if (objArr == null) {
            return m7382y();
        }
        if (m7378u(objArr)) {
            return objArr;
        }
        Object[] objArrM7382y = m7382y();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        AbstractC17678l.m19308o(0, length, 6, objArr, objArrM7382y);
        return objArrM7382y;
    }

    /* JADX INFO: renamed from: x */
    public final Object[] m7381x(int i10, Object[] objArr) {
        if (m7378u(objArr)) {
            AbstractC17678l.m19304k(i10, 0, 32 - i10, objArr, objArr);
            return objArr;
        }
        Object[] objArrM7382y = m7382y();
        AbstractC17678l.m19304k(i10, 0, 32 - i10, objArr, objArrM7382y);
        return objArrM7382y;
    }

    /* JADX INFO: renamed from: y */
    public final Object[] m7382y() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f22317q0;
        return objArr;
    }

    /* JADX INFO: renamed from: z */
    public final Object[] m7383z(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f22317q0;
        return objArr;
    }

    /* JADX INFO: renamed from: O */
    public final Object[] m7368O(Object[] objArr, int i10, int i11, Object obj, C13288c c13288c) {
        int iM9935a = AbstractC9339o3.m9935a(i11, i10);
        Object[] objArrM7380w = m7380w(objArr);
        if (i10 == 0) {
            if (objArrM7380w != objArr) {
                ((AbstractList) this).modCount++;
            }
            c13288c.f42001Y = objArrM7380w[iM9935a];
            objArrM7380w[iM9935a] = obj;
            return objArrM7380w;
        }
        Object obj2 = objArrM7380w[iM9935a];
        AbstractC16544l.m18092e(obj2, IGDwkYw.zUQArxVLRhAEcQ);
        objArrM7380w[iM9935a] = m7368O((Object[]) obj2, i10 - 5, i11, obj, c13288c);
        return objArrM7380w;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM7370Q = m7370Q();
        if (iM7370Q < 32) {
            Object[] objArrM7380w = m7380w(this.f22319s0);
            objArrM7380w[iM7370Q] = obj;
            this.f22319s0 = objArrM7380w;
            this.f22320t0 = mo7371f() + 1;
        } else {
            m7359F(this.f22318r0, this.f22319s0, m7383z(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM7370Q = m7370Q();
        Iterator it = collection.iterator();
        if (32 - iM7370Q >= collection.size()) {
            Object[] objArrM7380w = m7380w(this.f22319s0);
            m7353p(objArrM7380w, iM7370Q, it);
            this.f22319s0 = objArrM7380w;
            this.f22320t0 = collection.size() + this.f22320t0;
        } else {
            int size = ((collection.size() + iM7370Q) - 1) / 32;
            Object[][] objArr = new Object[size][];
            Object[] objArrM7380w2 = m7380w(this.f22319s0);
            m7353p(objArrM7380w2, iM7370Q, it);
            objArr[0] = objArrM7380w2;
            for (int i10 = 1; i10 < size; i10++) {
                Object[] objArrM7382y = m7382y();
                m7353p(objArrM7382y, 0, it);
                objArr[i10] = objArrM7382y;
            }
            this.f22318r0 = m7358E(this.f22318r0, m7367N(), objArr);
            Object[] objArrM7382y2 = m7382y();
            m7353p(objArrM7382y2, 0, it);
            this.f22319s0 = objArrM7382y2;
            this.f22320t0 = collection.size() + this.f22320t0;
        }
        return true;
    }
}
