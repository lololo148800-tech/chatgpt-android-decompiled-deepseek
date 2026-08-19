package p466T0;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p200Hm.C3506e;
import p349O0.C5975S;
import p349O0.C5997d;
import p515V0.C7735a;
import p515V0.C7736b;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9124E3;
import p826j6.C16137F;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: T0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C7187n {

    /* JADX INFO: renamed from: e */
    public static final C7187n f22836e = new C7187n(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a */
    public int f22837a;

    /* JADX INFO: renamed from: b */
    public int f22838b;

    /* JADX INFO: renamed from: c */
    public final C7736b f22839c;

    /* JADX INFO: renamed from: d */
    public Object[] f22840d;

    public C7187n(int i10, int i11, Object[] objArr, C7736b c7736b) {
        this.f22837a = i10;
        this.f22838b = i11;
        this.f22839c = c7736b;
        this.f22840d = objArr;
    }

    /* JADX INFO: renamed from: j */
    public static C7187n m7562j(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, C7736b c7736b) {
        if (i12 > 30) {
            return new C7187n(0, 0, new Object[]{obj, obj2, obj3, obj4}, c7736b);
        }
        int iM9658d = AbstractC9124E3.m9658d(i10, i12);
        int iM9658d2 = AbstractC9124E3.m9658d(i11, i12);
        if (iM9658d != iM9658d2) {
            return new C7187n((1 << iM9658d) | (1 << iM9658d2), 0, iM9658d < iM9658d2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, c7736b);
        }
        return new C7187n(0, 1 << iM9658d, new Object[]{m7562j(i10, obj, obj2, i11, obj3, obj4, i12 + 5, c7736b)}, c7736b);
    }

    /* JADX INFO: renamed from: a */
    public final Object[] m7563a(int i10, int i11, int i12, Object obj, Object obj2, int i13, C7736b c7736b) {
        Object obj3 = this.f22840d[i10];
        C7187n c7187nM7562j = m7562j(obj3 != null ? obj3.hashCode() : 0, obj3, m7585x(i10), i12, obj, obj2, i13 + 5, c7736b);
        int iM7581t = m7581t(i11);
        int i14 = iM7581t + 1;
        Object[] objArr = this.f22840d;
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC17678l.m19308o(0, i10, 6, objArr, objArr2);
        AbstractC17678l.m19304k(i10, i10 + 2, i14, objArr, objArr2);
        objArr2[iM7581t - 1] = c7187nM7562j;
        AbstractC17678l.m19304k(iM7581t, i14, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: b */
    public final int m7564b() {
        if (this.f22838b == 0) {
            return this.f22840d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f22837a);
        int length = this.f22840d.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += m7580s(i10).m7564b();
        }
        return iBitCount;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7565c(Object obj) {
        C3506e c3506eM8928s = AbstractC8301I.m8928s(AbstractC8301I.m8929t(0, this.f22840d.length), 2);
        int i10 = c3506eM8928s.f10591Y;
        int i11 = c3506eM8928s.f10592Z;
        int i12 = c3506eM8928s.f10593o0;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (!AbstractC16544l.m18089b(obj, this.f22840d[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7566d(int i10, Object obj, int i11) {
        int iM9658d = 1 << AbstractC9124E3.m9658d(i10, i11);
        if (m7570h(iM9658d)) {
            return AbstractC16544l.m18089b(obj, this.f22840d[m7568f(iM9658d)]);
        }
        if (!m7571i(iM9658d)) {
            return false;
        }
        C7187n c7187nM7580s = m7580s(m7581t(iM9658d));
        return i11 == 30 ? c7187nM7580s.m7565c(obj) : c7187nM7580s.m7566d(i10, obj, i11 + 5);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m7567e(C7187n c7187n) {
        if (this == c7187n) {
            return true;
        }
        if (this.f22838b != c7187n.f22838b || this.f22837a != c7187n.f22837a) {
            return false;
        }
        int length = this.f22840d.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f22840d[i10] != c7187n.f22840d[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final int m7568f(int i10) {
        return Integer.bitCount((i10 - 1) & this.f22837a) * 2;
    }

    /* JADX INFO: renamed from: g */
    public final Object m7569g(int i10, Object obj, int i11) {
        int iM9658d = 1 << AbstractC9124E3.m9658d(i10, i11);
        if (m7570h(iM9658d)) {
            int iM7568f = m7568f(iM9658d);
            if (AbstractC16544l.m18089b(obj, this.f22840d[iM7568f])) {
                return m7585x(iM7568f);
            }
            return null;
        }
        if (!m7571i(iM9658d)) {
            return null;
        }
        C7187n c7187nM7580s = m7580s(m7581t(iM9658d));
        if (i11 != 30) {
            return c7187nM7580s.m7569g(i10, obj, i11 + 5);
        }
        C3506e c3506eM8928s = AbstractC8301I.m8928s(AbstractC8301I.m8929t(0, c7187nM7580s.f22840d.length), 2);
        int i12 = c3506eM8928s.f10591Y;
        int i13 = c3506eM8928s.f10592Z;
        int i14 = c3506eM8928s.f10593o0;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return null;
        }
        while (!AbstractC16544l.m18089b(obj, c7187nM7580s.f22840d[i12])) {
            if (i12 == i13) {
                return null;
            }
            i12 += i14;
        }
        return c7187nM7580s.m7585x(i12);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m7570h(int i10) {
        return (i10 & this.f22837a) != 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m7571i(int i10) {
        return (i10 & this.f22838b) != 0;
    }

    /* JADX INFO: renamed from: k */
    public final C7187n m7572k(int i10, C7178e c7178e) {
        c7178e.getClass();
        c7178e.m7559b(c7178e.f22821r0 - 1);
        c7178e.f22819p0 = m7585x(i10);
        Object[] objArr = this.f22840d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f22839c != c7178e.f22817Z) {
            return new C7187n(0, 0, AbstractC9124E3.m9656b(i10, objArr), c7178e.f22817Z);
        }
        this.f22840d = AbstractC9124E3.m9656b(i10, objArr);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final C7187n m7573l(int i10, Object obj, Object obj2, int i11, C7178e c7178e) {
        C7187n c7187nM7573l;
        int iM9658d = 1 << AbstractC9124E3.m9658d(i10, i11);
        boolean zM7570h = m7570h(iM9658d);
        C7736b c7736b = this.f22839c;
        if (zM7570h) {
            int iM7568f = m7568f(iM9658d);
            if (!AbstractC16544l.m18089b(obj, this.f22840d[iM7568f])) {
                c7178e.getClass();
                c7178e.m7559b(c7178e.f22821r0 + 1);
                C7736b c7736b2 = c7178e.f22817Z;
                if (c7736b != c7736b2) {
                    return new C7187n(this.f22837a ^ iM9658d, this.f22838b | iM9658d, m7563a(iM7568f, iM9658d, i10, obj, obj2, i11, c7736b2), c7736b2);
                }
                this.f22840d = m7563a(iM7568f, iM9658d, i10, obj, obj2, i11, c7736b2);
                this.f22837a ^= iM9658d;
                this.f22838b |= iM9658d;
                return this;
            }
            c7178e.f22819p0 = m7585x(iM7568f);
            if (m7585x(iM7568f) == obj2) {
                return this;
            }
            if (c7736b == c7178e.f22817Z) {
                this.f22840d[iM7568f + 1] = obj2;
                return this;
            }
            c7178e.f22820q0++;
            Object[] objArr = this.f22840d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iM7568f + 1] = obj2;
            return new C7187n(this.f22837a, this.f22838b, objArrCopyOf, c7178e.f22817Z);
        }
        if (!m7571i(iM9658d)) {
            c7178e.getClass();
            c7178e.m7559b(c7178e.f22821r0 + 1);
            C7736b c7736b3 = c7178e.f22817Z;
            int iM7568f2 = m7568f(iM9658d);
            if (c7736b != c7736b3) {
                return new C7187n(this.f22837a | iM9658d, this.f22838b, AbstractC9124E3.m9655a(this.f22840d, iM7568f2, obj, obj2), c7736b3);
            }
            this.f22840d = AbstractC9124E3.m9655a(this.f22840d, iM7568f2, obj, obj2);
            this.f22837a |= iM9658d;
            return this;
        }
        int iM7581t = m7581t(iM9658d);
        C7187n c7187nM7580s = m7580s(iM7581t);
        if (i11 == 30) {
            C3506e c3506eM8928s = AbstractC8301I.m8928s(AbstractC8301I.m8929t(0, c7187nM7580s.f22840d.length), 2);
            int i12 = c3506eM8928s.f10591Y;
            int i13 = c3506eM8928s.f10592Z;
            int i14 = c3506eM8928s.f10593o0;
            if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                c7178e.getClass();
                c7178e.m7559b(c7178e.f22821r0 + 1);
                c7187nM7573l = new C7187n(0, 0, AbstractC9124E3.m9655a(c7187nM7580s.f22840d, 0, obj, obj2), c7178e.f22817Z);
            } else {
                while (true) {
                    if (!AbstractC16544l.m18089b(obj, c7187nM7580s.f22840d[i12])) {
                        if (i12 == i13) {
                            break;
                        }
                        i12 += i14;
                    } else {
                        c7178e.f22819p0 = c7187nM7580s.m7585x(i12);
                        if (c7187nM7580s.f22839c == c7178e.f22817Z) {
                            c7187nM7580s.f22840d[i12 + 1] = obj2;
                            c7187nM7573l = c7187nM7580s;
                        } else {
                            c7178e.f22820q0++;
                            Object[] objArr2 = c7187nM7580s.f22840d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            AbstractC16544l.m18093f(objArrCopyOf2, "copyOf(this, size)");
                            objArrCopyOf2[i12 + 1] = obj2;
                            c7187nM7573l = new C7187n(0, 0, objArrCopyOf2, c7178e.f22817Z);
                        }
                    }
                }
                c7178e.getClass();
                c7178e.m7559b(c7178e.f22821r0 + 1);
                c7187nM7573l = new C7187n(0, 0, AbstractC9124E3.m9655a(c7187nM7580s.f22840d, 0, obj, obj2), c7178e.f22817Z);
            }
        } else {
            c7187nM7573l = c7187nM7580s.m7573l(i10, obj, obj2, i11 + 5, c7178e);
        }
        return c7187nM7580s == c7187nM7573l ? this : m7579r(iM7581t, c7187nM7573l, c7178e.f22817Z);
    }

    /* JADX INFO: renamed from: m */
    public final C7187n m7574m(C7187n c7187n, int i10, C7735a c7735a, C7178e c7178e) {
        C7187n c7187n2;
        Object[] objArr;
        int i11;
        C7187n c7187nM7562j;
        if (this == c7187n) {
            c7735a.f24401a += m7564b();
            return this;
        }
        int i12 = 0;
        if (i10 > 30) {
            C7736b c7736b = c7178e.f22817Z;
            int i13 = c7187n.f22838b;
            Object[] objArr2 = this.f22840d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + c7187n.f22840d.length);
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
            int length = this.f22840d.length;
            C3506e c3506eM8928s = AbstractC8301I.m8928s(AbstractC8301I.m8929t(0, c7187n.f22840d.length), 2);
            int i14 = c3506eM8928s.f10591Y;
            int i15 = c3506eM8928s.f10592Z;
            int i16 = c3506eM8928s.f10593o0;
            if ((i16 > 0 && i14 <= i15) || (i16 < 0 && i15 <= i14)) {
                while (true) {
                    if (m7565c(c7187n.f22840d[i14])) {
                        c7735a.f24401a++;
                    } else {
                        Object[] objArr3 = c7187n.f22840d;
                        objArrCopyOf[length] = objArr3[i14];
                        objArrCopyOf[length + 1] = objArr3[i14 + 1];
                        length += 2;
                    }
                    if (i14 == i15) {
                        break;
                    }
                    i14 += i16;
                }
            }
            if (length == this.f22840d.length) {
                return this;
            }
            if (length == c7187n.f22840d.length) {
                return c7187n;
            }
            if (length == objArrCopyOf.length) {
                return new C7187n(0, 0, objArrCopyOf, c7736b);
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
            AbstractC16544l.m18093f(objArrCopyOf2, "copyOf(this, newSize)");
            return new C7187n(0, 0, objArrCopyOf2, c7736b);
        }
        int i17 = this.f22838b | c7187n.f22838b;
        int i18 = this.f22837a;
        int i19 = c7187n.f22837a;
        int i20 = (i18 ^ i19) & (~i17);
        int i21 = i18 & i19;
        int i22 = i20;
        while (i21 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i21);
            if (AbstractC16544l.m18089b(this.f22840d[m7568f(iLowestOneBit)], c7187n.f22840d[c7187n.m7568f(iLowestOneBit)])) {
                i22 |= iLowestOneBit;
            } else {
                i17 |= iLowestOneBit;
            }
            i21 ^= iLowestOneBit;
        }
        if (!((i17 & i22) == 0)) {
            C5997d.m6445c0("Check failed.");
            throw null;
        }
        if (AbstractC16544l.m18089b(this.f22839c, c7178e.f22817Z) && this.f22837a == i22 && this.f22838b == i17) {
            c7187n2 = this;
        } else {
            c7187n2 = new C7187n(i22, i17, new Object[Integer.bitCount(i17) + (Integer.bitCount(i22) * 2)], null);
        }
        int i23 = i17;
        int i24 = 0;
        while (i23 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i23);
            Object[] objArr4 = c7187n2.f22840d;
            int length2 = (objArr4.length - 1) - i24;
            if (m7571i(iLowestOneBit2)) {
                c7187nM7562j = m7580s(m7581t(iLowestOneBit2));
                if (c7187n.m7571i(iLowestOneBit2)) {
                    c7187nM7562j = c7187nM7562j.m7574m(c7187n.m7580s(c7187n.m7581t(iLowestOneBit2)), i10 + 5, c7735a, c7178e);
                } else if (c7187n.m7570h(iLowestOneBit2)) {
                    int iM7568f = c7187n.m7568f(iLowestOneBit2);
                    Object obj = c7187n.f22840d[iM7568f];
                    Object objM7585x = c7187n.m7585x(iM7568f);
                    int i25 = c7178e.f22821r0;
                    objArr = objArr4;
                    c7187nM7562j = c7187nM7562j.m7573l(obj != null ? obj.hashCode() : i12, obj, objM7585x, i10 + 5, c7178e);
                    if (c7178e.f22821r0 == i25) {
                        c7735a.f24401a++;
                    }
                    i11 = iLowestOneBit2;
                }
                objArr = objArr4;
                i11 = iLowestOneBit2;
            } else {
                objArr = objArr4;
                i11 = iLowestOneBit2;
                if (c7187n.m7571i(i11)) {
                    c7187nM7562j = c7187n.m7580s(c7187n.m7581t(i11));
                    if (m7570h(i11)) {
                        int iM7568f2 = m7568f(i11);
                        Object obj2 = this.f22840d[iM7568f2];
                        int i26 = i10 + 5;
                        if (c7187nM7562j.m7566d(obj2 != null ? obj2.hashCode() : 0, obj2, i26)) {
                            c7735a.f24401a++;
                        } else {
                            c7187nM7562j = c7187nM7562j.m7573l(obj2 != null ? obj2.hashCode() : 0, obj2, m7585x(iM7568f2), i26, c7178e);
                        }
                    }
                } else {
                    int iM7568f3 = m7568f(i11);
                    Object obj3 = this.f22840d[iM7568f3];
                    Object objM7585x2 = m7585x(iM7568f3);
                    int iM7568f4 = c7187n.m7568f(i11);
                    Object obj4 = c7187n.f22840d[iM7568f4];
                    c7187nM7562j = m7562j(obj3 != null ? obj3.hashCode() : 0, obj3, objM7585x2, obj4 != null ? obj4.hashCode() : 0, obj4, c7187n.m7585x(iM7568f4), i10 + 5, c7178e.f22817Z);
                }
            }
            objArr[length2] = c7187nM7562j;
            i24++;
            i23 ^= i11;
            i12 = 0;
        }
        int i27 = 0;
        while (i22 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i22);
            int i28 = i27 * 2;
            if (c7187n.m7570h(iLowestOneBit3)) {
                int iM7568f5 = c7187n.m7568f(iLowestOneBit3);
                Object[] objArr5 = c7187n2.f22840d;
                objArr5[i28] = c7187n.f22840d[iM7568f5];
                objArr5[i28 + 1] = c7187n.m7585x(iM7568f5);
                if (m7570h(iLowestOneBit3)) {
                    c7735a.f24401a++;
                }
            } else {
                int iM7568f6 = m7568f(iLowestOneBit3);
                Object[] objArr6 = c7187n2.f22840d;
                objArr6[i28] = this.f22840d[iM7568f6];
                objArr6[i28 + 1] = m7585x(iM7568f6);
            }
            i27++;
            i22 ^= iLowestOneBit3;
        }
        if (m7567e(c7187n2)) {
            return this;
        }
        return c7187n.m7567e(c7187n2) ? c7187n : c7187n2;
    }

    /* JADX INFO: renamed from: n */
    public final C7187n m7575n(int i10, Object obj, int i11, C7178e c7178e) {
        C7187n c7187nM7575n;
        int iM9658d = 1 << AbstractC9124E3.m9658d(i10, i11);
        if (m7570h(iM9658d)) {
            int iM7568f = m7568f(iM9658d);
            return AbstractC16544l.m18089b(obj, this.f22840d[iM7568f]) ? m7577p(iM7568f, iM9658d, c7178e) : this;
        }
        if (!m7571i(iM9658d)) {
            return this;
        }
        int iM7581t = m7581t(iM9658d);
        C7187n c7187nM7580s = m7580s(iM7581t);
        if (i11 == 30) {
            C3506e c3506eM8928s = AbstractC8301I.m8928s(AbstractC8301I.m8929t(0, c7187nM7580s.f22840d.length), 2);
            int i12 = c3506eM8928s.f10591Y;
            int i13 = c3506eM8928s.f10592Z;
            int i14 = c3506eM8928s.f10593o0;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    if (!AbstractC16544l.m18089b(obj, c7187nM7580s.f22840d[i12])) {
                        if (i12 == i13) {
                            c7187nM7575n = c7187nM7580s;
                            break;
                        }
                        i12 += i14;
                    } else {
                        c7187nM7575n = c7187nM7580s.m7572k(i12, c7178e);
                        break;
                    }
                }
            } else {
                c7187nM7575n = c7187nM7580s;
                break;
            }
        } else {
            c7187nM7575n = c7187nM7580s.m7575n(i10, obj, i11 + 5, c7178e);
        }
        return m7578q(c7187nM7580s, c7187nM7575n, iM7581t, iM9658d, c7178e.f22817Z);
    }

    /* JADX INFO: renamed from: o */
    public final C7187n m7576o(int i10, Object obj, Object obj2, int i11, C7178e c7178e) {
        C7187n c7187nM7576o;
        int iM9658d = 1 << AbstractC9124E3.m9658d(i10, i11);
        if (m7570h(iM9658d)) {
            int iM7568f = m7568f(iM9658d);
            return (AbstractC16544l.m18089b(obj, this.f22840d[iM7568f]) && AbstractC16544l.m18089b(obj2, m7585x(iM7568f))) ? m7577p(iM7568f, iM9658d, c7178e) : this;
        }
        if (!m7571i(iM9658d)) {
            return this;
        }
        int iM7581t = m7581t(iM9658d);
        C7187n c7187nM7580s = m7580s(iM7581t);
        if (i11 == 30) {
            C3506e c3506eM8928s = AbstractC8301I.m8928s(AbstractC8301I.m8929t(0, c7187nM7580s.f22840d.length), 2);
            int i12 = c3506eM8928s.f10591Y;
            int i13 = c3506eM8928s.f10592Z;
            int i14 = c3506eM8928s.f10593o0;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    if (!AbstractC16544l.m18089b(obj, c7187nM7580s.f22840d[i12]) || !AbstractC16544l.m18089b(obj2, c7187nM7580s.m7585x(i12))) {
                        if (i12 == i13) {
                            c7187nM7576o = c7187nM7580s;
                            break;
                        }
                        i12 += i14;
                    } else {
                        c7187nM7576o = c7187nM7580s.m7572k(i12, c7178e);
                        break;
                    }
                }
            } else {
                c7187nM7576o = c7187nM7580s;
                break;
            }
        } else {
            c7187nM7576o = c7187nM7580s.m7576o(i10, obj, obj2, i11 + 5, c7178e);
        }
        return m7578q(c7187nM7580s, c7187nM7576o, iM7581t, iM9658d, c7178e.f22817Z);
    }

    /* JADX INFO: renamed from: p */
    public final C7187n m7577p(int i10, int i11, C7178e c7178e) {
        c7178e.getClass();
        c7178e.m7559b(c7178e.f22821r0 - 1);
        c7178e.f22819p0 = m7585x(i10);
        Object[] objArr = this.f22840d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f22839c != c7178e.f22817Z) {
            return new C7187n(i11 ^ this.f22837a, this.f22838b, AbstractC9124E3.m9656b(i10, objArr), c7178e.f22817Z);
        }
        this.f22840d = AbstractC9124E3.m9656b(i10, objArr);
        this.f22837a ^= i11;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public final C7187n m7578q(C7187n c7187n, C7187n c7187n2, int i10, int i11, C7736b c7736b) {
        C7736b c7736b2 = this.f22839c;
        if (c7187n2 == null) {
            Object[] objArr = this.f22840d;
            if (objArr.length == 1) {
                return null;
            }
            if (c7736b2 != c7736b) {
                return new C7187n(this.f22837a, i11 ^ this.f22838b, AbstractC9124E3.m9657c(i10, objArr), c7736b);
            }
            this.f22840d = AbstractC9124E3.m9657c(i10, objArr);
            this.f22838b ^= i11;
        } else if (c7736b2 == c7736b || c7187n != c7187n2) {
            return m7579r(i10, c7187n2, c7736b);
        }
        return this;
    }

    /* JADX INFO: renamed from: r */
    public final C7187n m7579r(int i10, C7187n c7187n, C7736b c7736b) {
        Object[] objArr = this.f22840d;
        if (objArr.length == 1 && c7187n.f22840d.length == 2 && c7187n.f22838b == 0) {
            c7187n.f22837a = this.f22838b;
            return c7187n;
        }
        if (this.f22839c == c7736b) {
            objArr[i10] = c7187n;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10] = c7187n;
        return new C7187n(this.f22837a, this.f22838b, objArrCopyOf, c7736b);
    }

    /* JADX INFO: renamed from: s */
    public final C7187n m7580s(int i10) {
        Object obj = this.f22840d[i10];
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (C7187n) obj;
    }

    /* JADX INFO: renamed from: t */
    public final int m7581t(int i10) {
        return (this.f22840d.length - 1) - Integer.bitCount((i10 - 1) & this.f22838b);
    }

    /* JADX INFO: renamed from: u */
    public final C16137F m7582u(int i10, Object obj, Object obj2, int i11) {
        C16137F c16137fM7582u;
        int i12 = 1;
        int iM9658d = 1 << AbstractC9124E3.m9658d(i10, i11);
        int i13 = 0;
        if (m7570h(iM9658d)) {
            int iM7568f = m7568f(iM9658d);
            if (!AbstractC16544l.m18089b(obj, this.f22840d[iM7568f])) {
                return new C16137F(new C7187n(this.f22837a ^ iM9658d, this.f22838b | iM9658d, m7563a(iM7568f, iM9658d, i10, obj, obj2, i11, null), null), i12, 4);
            }
            if (m7585x(iM7568f) == obj2) {
                return null;
            }
            Object[] objArr = this.f22840d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iM7568f + 1] = obj2;
            return new C16137F(new C7187n(this.f22837a, this.f22838b, objArrCopyOf, null), i13, 4);
        }
        if (!m7571i(iM9658d)) {
            return new C16137F(new C7187n(this.f22837a | iM9658d, this.f22838b, AbstractC9124E3.m9655a(this.f22840d, m7568f(iM9658d), obj, obj2), null), i12, 4);
        }
        int iM7581t = m7581t(iM9658d);
        C7187n c7187nM7580s = m7580s(iM7581t);
        if (i11 == 30) {
            C3506e c3506eM8928s = AbstractC8301I.m8928s(AbstractC8301I.m8929t(0, c7187nM7580s.f22840d.length), 2);
            int i14 = c3506eM8928s.f10591Y;
            int i15 = c3506eM8928s.f10592Z;
            int i16 = c3506eM8928s.f10593o0;
            if ((i16 > 0 && i14 <= i15) || (i16 < 0 && i15 <= i14)) {
                while (true) {
                    if (!AbstractC16544l.m18089b(obj, c7187nM7580s.f22840d[i14])) {
                        if (i14 == i15) {
                            c16137fM7582u = new C16137F(new C7187n(0, 0, AbstractC9124E3.m9655a(c7187nM7580s.f22840d, 0, obj, obj2), null), i12, 4);
                            break;
                        }
                        i14 += i16;
                    } else {
                        if (obj2 != c7187nM7580s.m7585x(i14)) {
                            Object[] objArr2 = c7187nM7580s.f22840d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            AbstractC16544l.m18093f(objArrCopyOf2, "copyOf(this, size)");
                            objArrCopyOf2[i14 + 1] = obj2;
                            c16137fM7582u = new C16137F(new C7187n(0, 0, objArrCopyOf2, null), i13, 4);
                            break;
                        }
                        c16137fM7582u = null;
                        break;
                    }
                }
            } else {
                c16137fM7582u = new C16137F(new C7187n(0, 0, AbstractC9124E3.m9655a(c7187nM7580s.f22840d, 0, obj, obj2), null), i12, 4);
                break;
            }
            if (c16137fM7582u == null) {
                return null;
            }
        } else {
            c16137fM7582u = c7187nM7580s.m7582u(i10, obj, obj2, i11 + 5);
            if (c16137fM7582u == null) {
                return null;
            }
        }
        c16137fM7582u.f50064o0 = m7584w(iM7581t, iM9658d, (C7187n) c16137fM7582u.f50064o0);
        return c16137fM7582u;
    }

    /* JADX INFO: renamed from: v */
    public final C7187n m7583v(int i10, C5975S c5975s, int i11) {
        C7187n c7187nM7583v;
        int iM9658d = 1 << AbstractC9124E3.m9658d(i10, i11);
        if (m7570h(iM9658d)) {
            int iM7568f = m7568f(iM9658d);
            if (!AbstractC16544l.m18089b(c5975s, this.f22840d[iM7568f])) {
                return this;
            }
            Object[] objArr = this.f22840d;
            if (objArr.length == 2) {
                return null;
            }
            return new C7187n(this.f22837a ^ iM9658d, this.f22838b, AbstractC9124E3.m9656b(iM7568f, objArr), null);
        }
        if (!m7571i(iM9658d)) {
            return this;
        }
        int iM7581t = m7581t(iM9658d);
        C7187n c7187nM7580s = m7580s(iM7581t);
        if (i11 == 30) {
            C3506e c3506eM8928s = AbstractC8301I.m8928s(AbstractC8301I.m8929t(0, c7187nM7580s.f22840d.length), 2);
            int i12 = c3506eM8928s.f10591Y;
            int i13 = c3506eM8928s.f10592Z;
            int i14 = c3506eM8928s.f10593o0;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    if (!AbstractC16544l.m18089b(c5975s, c7187nM7580s.f22840d[i12])) {
                        if (i12 == i13) {
                            c7187nM7583v = c7187nM7580s;
                            break;
                        }
                        i12 += i14;
                    } else {
                        Object[] objArr2 = c7187nM7580s.f22840d;
                        if (objArr2.length != 2) {
                            c7187nM7583v = new C7187n(0, 0, AbstractC9124E3.m9656b(i12, objArr2), null);
                            break;
                        }
                        c7187nM7583v = null;
                        break;
                    }
                }
            } else {
                c7187nM7583v = c7187nM7580s;
                break;
            }
        } else {
            c7187nM7583v = c7187nM7580s.m7583v(i10, c5975s, i11 + 5);
        }
        if (c7187nM7583v != null) {
            return c7187nM7580s != c7187nM7583v ? m7584w(iM7581t, iM9658d, c7187nM7583v) : this;
        }
        Object[] objArr3 = this.f22840d;
        if (objArr3.length == 1) {
            return null;
        }
        return new C7187n(this.f22837a, iM9658d ^ this.f22838b, AbstractC9124E3.m9657c(iM7581t, objArr3), null);
    }

    /* JADX INFO: renamed from: w */
    public final C7187n m7584w(int i10, int i11, C7187n c7187n) {
        Object[] objArr = c7187n.f22840d;
        if (objArr.length != 2 || c7187n.f22838b != 0) {
            Object[] objArr2 = this.f22840d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
            objArrCopyOf[i10] = c7187n;
            return new C7187n(this.f22837a, this.f22838b, objArrCopyOf, null);
        }
        if (this.f22840d.length == 1) {
            c7187n.f22837a = this.f22838b;
            return c7187n;
        }
        int iM7568f = m7568f(i11);
        Object[] objArr3 = this.f22840d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        AbstractC16544l.m18093f(objArrCopyOf2, "copyOf(this, newSize)");
        AbstractC17678l.m19304k(i10 + 2, i10 + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        AbstractC17678l.m19304k(iM7568f + 2, iM7568f, i10, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iM7568f] = obj;
        objArrCopyOf2[iM7568f + 1] = obj2;
        return new C7187n(this.f22837a ^ i11, i11 ^ this.f22838b, objArrCopyOf2, null);
    }

    /* JADX INFO: renamed from: x */
    public final Object m7585x(int i10) {
        return this.f22840d[i10 + 1];
    }
}
