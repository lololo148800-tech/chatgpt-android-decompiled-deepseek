package p440S0;

import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC16544l;
import p009A7.FlM.nkFZpTrMPpn;
import p349O0.C5997d;
import p571X9.AbstractC9339o3;
import p594Y9.AbstractC9870d0;
import p720e6.C13288c;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: S0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6979e extends AbstractC6977c {

    /* JADX INFO: renamed from: Y */
    public final Object[] f22309Y;

    /* JADX INFO: renamed from: Z */
    public final Object[] f22310Z;

    /* JADX INFO: renamed from: o0 */
    public final int f22311o0;

    /* JADX INFO: renamed from: p0 */
    public final int f22312p0;

    public C6979e(Object[] objArr, Object[] objArr2, int i10, int i11) {
        this.f22309Y = objArr;
        this.f22310Z = objArr2;
        this.f22311o0 = i10;
        this.f22312p0 = i11;
        if (mo1316f() > 32) {
            int length = objArr2.length;
            return;
        }
        C5997d.m6443b0("Trie-based persistent vector should have at least 33 elements, got " + mo1316f());
        throw null;
    }

    /* JADX INFO: renamed from: C */
    public static Object[] m7344C(Object[] objArr, int i10, int i11, Object obj) {
        int iM9935a = AbstractC9339o3.m9935a(i11, i10);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
        if (i10 == 0) {
            objArrCopyOf[iM9935a] = obj;
        } else {
            Object obj2 = objArrCopyOf[iM9935a];
            AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf[iM9935a] = m7344C((Object[]) obj2, i10 - 5, i11, obj);
        }
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: u */
    public static Object[] m7345u(Object[] objArr, int i10, int i11, Object obj, C13288c c13288c) {
        Object[] objArrCopyOf;
        int iM9935a = AbstractC9339o3.m9935a(i11, i10);
        if (i10 == 0) {
            if (iM9935a == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
            }
            AbstractC17678l.m19304k(iM9935a + 1, iM9935a, 31, objArr, objArrCopyOf);
            c13288c.f42001Y = objArr[31];
            objArrCopyOf[iM9935a] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        AbstractC16544l.m18093f(objArrCopyOf2, "copyOf(this, newSize)");
        int i12 = i10 - 5;
        Object obj2 = objArr[iM9935a];
        AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iM9935a] = m7345u((Object[]) obj2, i12, i11, obj, c13288c);
        while (true) {
            iM9935a++;
            if (iM9935a >= 32 || objArrCopyOf2[iM9935a] == null) {
                break;
            }
            Object obj3 = objArr[iM9935a];
            AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iM9935a] = m7345u((Object[]) obj3, i12, 0, c13288c.f42001Y, c13288c);
        }
        return objArrCopyOf2;
    }

    /* JADX INFO: renamed from: w */
    public static Object[] m7346w(Object[] objArr, int i10, int i11, C13288c c13288c) {
        Object[] objArrM7346w;
        int iM9935a = AbstractC9339o3.m9935a(i11, i10);
        if (i10 == 5) {
            c13288c.f42001Y = objArr[iM9935a];
            objArrM7346w = null;
        } else {
            Object obj = objArr[iM9935a];
            AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrM7346w = m7346w((Object[]) obj, i10 - 5, i11, c13288c);
        }
        if (objArrM7346w == null && iM9935a == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[iM9935a] = objArrM7346w;
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: A */
    public final AbstractC6977c m7347A(Object[] objArr, int i10, int i11, int i12) {
        C6979e c6979e;
        int i13 = this.f22311o0 - i10;
        Object obj = null;
        if (i13 != 1) {
            Object[] objArr2 = this.f22310Z;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
            int i14 = i13 - 1;
            if (i12 < i14) {
                AbstractC17678l.m19304k(i12, i12 + 1, i13, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i14] = null;
            return new C6979e(objArr, objArrCopyOf, (i10 + i13) - 1, i11);
        }
        if (i11 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                AbstractC16544l.m18093f(objArr, "copyOf(this, newSize)");
            }
            return new C6983i(objArr);
        }
        C13288c c13288c = new C13288c(obj);
        Object[] objArrM7346w = m7346w(objArr, i11, i10 - 1, c13288c);
        AbstractC16544l.m18091d(objArrM7346w);
        Object obj2 = c13288c.f42001Y;
        AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj2;
        if (objArrM7346w[1] == null) {
            Object obj3 = objArrM7346w[0];
            AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            c6979e = new C6979e((Object[]) obj3, objArr3, i10, i11 - 5);
        } else {
            c6979e = new C6979e(objArrM7346w, objArr3, i10, i11);
        }
        return c6979e;
    }

    /* JADX INFO: renamed from: B */
    public final int m7348B() {
        return (this.f22311o0 - 1) & (-32);
    }

    @Override // p909nm.AbstractC17667a
    /* JADX INFO: renamed from: f */
    public final int mo1316f() {
        return this.f22311o0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object[] objArr;
        AbstractC9870d0.m10523a(i10, mo1316f());
        if (m7348B() <= i10) {
            objArr = this.f22310Z;
        } else {
            objArr = this.f22309Y;
            for (int i11 = this.f22312p0; i11 > 0; i11 -= 5) {
                Object obj = objArr[AbstractC9339o3.m9935a(i10, i11)];
                AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    @Override // p440S0.AbstractC6977c
    /* JADX INFO: renamed from: j */
    public final AbstractC6977c mo7337j(int i10, Object obj) {
        int i11 = this.f22311o0;
        AbstractC9870d0.m10524b(i10, i11);
        if (i10 == i11) {
            return mo7338m(obj);
        }
        int iM7348B = m7348B();
        Object[] objArr = this.f22309Y;
        if (i10 >= iM7348B) {
            return m7349v(i10 - iM7348B, obj, objArr);
        }
        C13288c c13288c = new C13288c((Object) null);
        return m7349v(0, c13288c.f42001Y, m7345u(objArr, this.f22312p0, i10, obj, c13288c));
    }

    @Override // p909nm.AbstractC17671e, java.util.List
    public final ListIterator listIterator(int i10) {
        AbstractC9870d0.m10524b(i10, this.f22311o0);
        return new C6981g(i10, this.f22311o0, (this.f22312p0 / 5) + 1, this.f22309Y, this.f22310Z);
    }

    @Override // p440S0.AbstractC6977c
    /* JADX INFO: renamed from: m */
    public final AbstractC6977c mo7338m(Object obj) {
        int iM7348B = m7348B();
        int i10 = this.f22311o0;
        int i11 = i10 - iM7348B;
        Object[] objArr = this.f22309Y;
        Object[] objArr2 = this.f22310Z;
        if (i11 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return m7350x(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[i11] = obj;
        return new C6979e(objArr, objArrCopyOf, i10 + 1, this.f22312p0);
    }

    @Override // p440S0.AbstractC6977c
    /* JADX INFO: renamed from: q */
    public final C6980f mo7340q() {
        return new C6980f(this, this.f22309Y, this.f22310Z, this.f22312p0);
    }

    @Override // p440S0.AbstractC6977c
    /* JADX INFO: renamed from: r */
    public final AbstractC6977c mo7341r(C6976b c6976b) {
        C6980f c6980f = new C6980f(this, this.f22309Y, this.f22310Z, this.f22312p0);
        c6980f.m7364K(c6976b);
        return c6980f.m7373m();
    }

    @Override // p440S0.AbstractC6977c
    /* JADX INFO: renamed from: s */
    public final AbstractC6977c mo7342s(int i10) {
        AbstractC9870d0.m10523a(i10, this.f22311o0);
        int iM7348B = m7348B();
        Object[] objArr = this.f22309Y;
        int i11 = this.f22312p0;
        return i10 >= iM7348B ? m7347A(objArr, iM7348B, i11, i10 - iM7348B) : m7347A(m7352z(objArr, i11, i10, new C13288c(this.f22310Z[0])), iM7348B, i11, 0);
    }

    @Override // p440S0.AbstractC6977c
    /* JADX INFO: renamed from: t */
    public final AbstractC6977c mo7343t(int i10, Object obj) {
        int i11 = this.f22311o0;
        AbstractC9870d0.m10523a(i10, i11);
        int iM7348B = m7348B();
        Object[] objArr = this.f22309Y;
        Object[] objArr2 = this.f22310Z;
        int i12 = this.f22312p0;
        if (iM7348B > i10) {
            return new C6979e(m7344C(objArr, i12, i10, obj), objArr2, i11, i12);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[i10 & 31] = obj;
        return new C6979e(objArr, objArrCopyOf, i11, i12);
    }

    /* JADX INFO: renamed from: v */
    public final C6979e m7349v(int i10, Object obj, Object[] objArr) {
        int iM7348B = m7348B();
        int i11 = this.f22311o0;
        int i12 = i11 - iM7348B;
        Object[] objArr2 = this.f22310Z;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
        if (i12 < 32) {
            AbstractC17678l.m19304k(i10 + 1, i10, i12, objArr2, objArrCopyOf);
            objArrCopyOf[i10] = obj;
            return new C6979e(objArr, objArrCopyOf, i11 + 1, this.f22312p0);
        }
        Object obj2 = objArr2[31];
        AbstractC17678l.m19304k(i10 + 1, i10, i12 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return m7350x(objArr, objArrCopyOf, objArr3);
    }

    /* JADX INFO: renamed from: x */
    public final C6979e m7350x(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f22311o0;
        int i11 = i10 >> 5;
        int i12 = this.f22312p0;
        if (i11 <= (1 << i12)) {
            return new C6979e(m7351y(i12, objArr, objArr2), objArr3, i10 + 1, i12);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i13 = i12 + 5;
        return new C6979e(m7351y(i13, objArr4, objArr2), objArr3, i10 + 1, i13);
    }

    /* JADX INFO: renamed from: y */
    public final Object[] m7351y(int i10, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iM9935a = AbstractC9339o3.m9935a(mo1316f() - 1, i10);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i10 == 5) {
            objArrCopyOf[iM9935a] = objArr2;
        } else {
            objArrCopyOf[iM9935a] = m7351y(i10 - 5, (Object[]) objArrCopyOf[iM9935a], objArr2);
        }
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: z */
    public final Object[] m7352z(Object[] objArr, int i10, int i11, C13288c c13288c) {
        Object[] objArrCopyOf;
        int iM9935a = AbstractC9339o3.m9935a(i11, i10);
        int iM9935a2 = 31;
        if (i10 == 0) {
            if (iM9935a == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
            }
            AbstractC17678l.m19304k(iM9935a, iM9935a + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = c13288c.f42001Y;
            c13288c.f42001Y = objArr[iM9935a];
            return objArrCopyOf;
        }
        if (objArr[31] == null) {
            iM9935a2 = AbstractC9339o3.m9935a(m7348B() - 1, i10);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        AbstractC16544l.m18093f(objArrCopyOf2, "copyOf(this, newSize)");
        int i12 = i10 - 5;
        int i13 = iM9935a + 1;
        String str = nkFZpTrMPpn.LbH;
        if (i13 <= iM9935a2) {
            while (true) {
                Object obj = objArrCopyOf2[iM9935a2];
                AbstractC16544l.m18092e(obj, str);
                objArrCopyOf2[iM9935a2] = m7352z((Object[]) obj, i12, 0, c13288c);
                if (iM9935a2 == i13) {
                    break;
                }
                iM9935a2--;
            }
        }
        Object obj2 = objArrCopyOf2[iM9935a];
        AbstractC16544l.m18092e(obj2, str);
        objArrCopyOf2[iM9935a] = m7352z((Object[]) obj2, i12, i11, c13288c);
        return objArrCopyOf2;
    }
}
