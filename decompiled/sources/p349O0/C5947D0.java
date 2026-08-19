package p349O0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p692d0.C12949B;
import p692d0.C12982u;
import p720e6.C13287b;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: O0.D0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5947D0 {

    /* JADX INFO: renamed from: a */
    public final C5943B0 f19364a;

    /* JADX INFO: renamed from: b */
    public int[] f19365b;

    /* JADX INFO: renamed from: c */
    public Object[] f19366c;

    /* JADX INFO: renamed from: d */
    public ArrayList f19367d;

    /* JADX INFO: renamed from: e */
    public HashMap f19368e;

    /* JADX INFO: renamed from: f */
    public C12982u f19369f;

    /* JADX INFO: renamed from: g */
    public int f19370g;

    /* JADX INFO: renamed from: h */
    public int f19371h;

    /* JADX INFO: renamed from: i */
    public int f19372i;

    /* JADX INFO: renamed from: j */
    public int f19373j;

    /* JADX INFO: renamed from: k */
    public int f19374k;

    /* JADX INFO: renamed from: l */
    public int f19375l;

    /* JADX INFO: renamed from: m */
    public int f19376m;

    /* JADX INFO: renamed from: n */
    public int f19377n;

    /* JADX INFO: renamed from: o */
    public int f19378o;

    /* JADX INFO: renamed from: p */
    public final C5960K f19379p;

    /* JADX INFO: renamed from: q */
    public final C5960K f19380q;

    /* JADX INFO: renamed from: r */
    public final C5960K f19381r;

    /* JADX INFO: renamed from: s */
    public C12982u f19382s;

    /* JADX INFO: renamed from: t */
    public int f19383t;

    /* JADX INFO: renamed from: u */
    public int f19384u;

    /* JADX INFO: renamed from: v */
    public int f19385v;

    /* JADX INFO: renamed from: w */
    public boolean f19386w;

    /* JADX INFO: renamed from: x */
    public C13287b f19387x;

    public C5947D0(C5943B0 c5943b0) {
        this.f19364a = c5943b0;
        int[] iArr = c5943b0.f19346Y;
        this.f19365b = iArr;
        Object[] objArr = c5943b0.f19348o0;
        this.f19366c = objArr;
        this.f19367d = c5943b0.f19353t0;
        this.f19368e = c5943b0.f19354u0;
        this.f19369f = c5943b0.f19355v0;
        int i10 = c5943b0.f19347Z;
        this.f19370g = i10;
        this.f19371h = (iArr.length / 5) - i10;
        int i11 = c5943b0.f19349p0;
        this.f19374k = i11;
        this.f19375l = objArr.length - i11;
        this.f19376m = i10;
        this.f19379p = new C5960K();
        this.f19380q = new C5960K();
        this.f19381r = new C5960K();
        this.f19384u = i10;
        this.f19385v = -1;
    }

    /* JADX INFO: renamed from: h */
    public static int m6349h(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    /* JADX INFO: renamed from: A */
    public final void m6350A() {
        boolean z6;
        C13287b c13287b = this.f19387x;
        if (c13287b != null) {
            while (!((List) c13287b.f42000Z).isEmpty()) {
                int iM14910u = c13287b.m14910u();
                int iM6378p = m6378p(iM14910u);
                int iM6379q = iM14910u + 1;
                int iM6379q2 = m6379q(iM14910u) + iM14910u;
                while (true) {
                    if (iM6379q >= iM6379q2) {
                        z6 = false;
                        break;
                    } else {
                        if ((this.f19365b[(m6378p(iM6379q) * 5) + 1] & 201326592) != 0) {
                            z6 = true;
                            break;
                        }
                        iM6379q += m6379q(iM6379q);
                    }
                }
                if (C5997d.m6455k(this.f19365b, iM6378p) != z6) {
                    int[] iArr = this.f19365b;
                    int i10 = (iM6378p * 5) + 1;
                    if (z6) {
                        iArr[i10] = iArr[i10] | 67108864;
                    } else {
                        iArr[i10] = iArr[i10] & (-67108865);
                    }
                    int iM6387y = m6387y(iArr, iM14910u);
                    if (iM6387y >= 0) {
                        c13287b.m14900c(iM6387y);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m6351B() {
        if (this.f19377n != 0) {
            C5997d.m6470z("Cannot remove group while inserting");
            throw null;
        }
        int i10 = this.f19383t;
        int i11 = this.f19372i;
        int iM6369f = m6369f(this.f19365b, m6378p(i10));
        int iM6378p = m6378p(this.f19383t);
        int iM6457m = C5997d.m6457m(this.f19365b, iM6378p) + this.f19383t;
        this.f19383t = iM6457m;
        this.f19372i = m6369f(this.f19365b, m6378p(iM6457m));
        int iM6462r = C5997d.m6460p(this.f19365b, iM6378p) ? 1 : C5997d.m6462r(this.f19365b, iM6378p);
        m6357H(this.f19385v);
        C13287b c13287b = this.f19387x;
        if (c13287b != null) {
            while (true) {
                List list = (List) c13287b.f42000Z;
                if (list.isEmpty() || ((Number) AbstractC17680n.m19341Q(list)).intValue() < i10) {
                    break;
                }
                c13287b.m14910u();
            }
        }
        boolean zM6352C = m6352C(i10, this.f19383t - i10);
        m6353D(iM6369f, this.f19372i - iM6369f, i10 - 1);
        this.f19383t = i10;
        this.f19372i = i11;
        this.f19378o -= iM6462r;
        return zM6352C;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m6352C(int i10, int i11) {
        boolean z6 = false;
        if (i11 > 0) {
            ArrayList arrayList = this.f19367d;
            m6384v(i10);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f19368e;
                int i12 = i10 + i11;
                int iM6461q = C5997d.m6461q(this.f19367d, i12, m6375m() - this.f19371h);
                if (iM6461q >= this.f19367d.size()) {
                    iM6461q--;
                }
                int i13 = iM6461q + 1;
                int i14 = 0;
                while (iM6461q >= 0) {
                    C5995c c5995c = (C5995c) this.f19367d.get(iM6461q);
                    int iM6366c = m6366c(c5995c);
                    if (iM6366c < i10) {
                        break;
                    }
                    if (iM6366c < i12) {
                        c5995c.f19473a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i14 == 0) {
                            i14 = iM6461q + 1;
                        }
                        i13 = iM6461q;
                    }
                    iM6461q--;
                }
                z6 = i13 < i14;
                if (z6) {
                    this.f19367d.subList(i13, i14).clear();
                }
            }
            this.f19370g = i10;
            this.f19371h += i11;
            int i15 = this.f19376m;
            if (i15 > i10) {
                this.f19376m = Math.max(i10, i15 - i11);
            }
            int i16 = this.f19384u;
            if (i16 >= this.f19370g) {
                this.f19384u = i16 - i11;
            }
            int i17 = this.f19385v;
            if (i17 >= 0 && C5997d.m6455k(this.f19365b, m6378p(i17))) {
                m6362M(i17);
            }
        }
        return z6;
    }

    /* JADX INFO: renamed from: D */
    public final void m6353D(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f19375l;
            int i14 = i10 + i11;
            m6385w(i14, i12);
            this.f19374k = i10;
            this.f19375l = i13 + i11;
            Arrays.fill(this.f19366c, i10, i14, (Object) null);
            int i15 = this.f19373j;
            if (i15 >= i10) {
                this.f19373j = i15 - i11;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m6354E() {
        int i10 = this.f19384u;
        this.f19383t = i10;
        this.f19372i = m6369f(this.f19365b, m6378p(i10));
    }

    /* JADX INFO: renamed from: F */
    public final int m6355F(int[] iArr, int i10) {
        if (i10 >= m6375m()) {
            return this.f19366c.length - this.f19375l;
        }
        int iM6465u = C5997d.m6465u(iArr, i10);
        return iM6465u < 0 ? (this.f19366c.length - this.f19375l) + iM6465u + 1 : iM6465u;
    }

    /* JADX INFO: renamed from: G */
    public final int m6356G(int i10, int i11) {
        int iM6355F = m6355F(this.f19365b, m6378p(i10));
        int i12 = iM6355F + i11;
        if (i12 >= iM6355F && i12 < m6369f(this.f19365b, m6378p(i10 + 1))) {
            return i12;
        }
        C5997d.m6470z("Write to an invalid slot index " + i11 + " for group " + i10);
        throw null;
    }

    /* JADX INFO: renamed from: H */
    public final AbstractC5958J m6357H(int i10) {
        C5995c c5995cM6360K;
        HashMap map = this.f19368e;
        if (map == null || (c5995cM6360K = m6360K(i10)) == null) {
            return null;
        }
        return (AbstractC5958J) map.get(c5995cM6360K);
    }

    /* JADX INFO: renamed from: I */
    public final void m6358I() {
        if (this.f19377n != 0) {
            C5997d.m6470z("Key must be supplied when inserting");
            throw null;
        }
        C5975S c5975s = C6013l.f19514a;
        m6359J(c5975s, c5975s, false, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    public final void m6359J(Object obj, Object obj2, boolean z6, int i10) {
        int i11;
        int i12 = this.f19385v;
        Object[] objArr = this.f19377n > 0;
        this.f19381r.m6397d(this.f19378o);
        C5975S c5975s = C6013l.f19514a;
        if (objArr == true) {
            int i13 = this.f19383t;
            int iM6369f = m6369f(this.f19365b, m6378p(i13));
            m6380r(1);
            this.f19372i = iM6369f;
            this.f19373j = iM6369f;
            int iM6378p = m6378p(i13);
            int i14 = obj != c5975s ? 1 : 0;
            int i15 = (z6 || obj2 == c5975s) ? 0 : 1;
            int iM6349h = m6349h(iM6369f, this.f19374k, this.f19375l, this.f19366c.length);
            if (iM6349h >= 0 && this.f19376m < i13) {
                iM6349h = -(((this.f19366c.length - this.f19375l) - iM6349h) + 1);
            }
            int[] iArr = this.f19365b;
            int i16 = this.f19385v;
            int i17 = z6 ? 1073741824 : 0;
            int i18 = i14 != 0 ? 536870912 : 0;
            int i19 = i15 != 0 ? 268435456 : 0;
            int i20 = iM6378p * 5;
            iArr[i20] = i10;
            iArr[i20 + 1] = i17 | i18 | i19;
            iArr[i20 + 2] = i16;
            iArr[i20 + 3] = 0;
            iArr[i20 + 4] = iM6349h;
            int i21 = (z6 ? 1 : 0) + i14 + i15;
            if (i21 > 0) {
                m6381s(i21, i13);
                Object[] objArr2 = this.f19366c;
                int i22 = this.f19372i;
                if (z6) {
                    objArr2[i22] = obj2;
                    i22++;
                }
                if (i14 != 0) {
                    objArr2[i22] = obj;
                    i22++;
                }
                if (i15 != 0) {
                    objArr2[i22] = obj2;
                    i22++;
                }
                this.f19372i = i22;
            }
            this.f19378o = 0;
            i11 = i13 + 1;
            this.f19385v = i13;
            this.f19383t = i11;
            if (i12 >= 0) {
                m6357H(i12);
            }
        } else {
            this.f19379p.m6397d(i12);
            this.f19380q.m6397d((m6375m() - this.f19371h) - this.f19384u);
            int i23 = this.f19383t;
            int iM6378p2 = m6378p(i23);
            if (!AbstractC16544l.m18089b(obj2, c5975s)) {
                if (z6) {
                    m6363N(this.f19383t, obj2);
                } else {
                    m6361L(obj2);
                }
            }
            this.f19372i = m6355F(this.f19365b, iM6378p2);
            this.f19373j = m6369f(this.f19365b, m6378p(this.f19383t + 1));
            this.f19378o = C5997d.m6462r(this.f19365b, iM6378p2);
            this.f19385v = i23;
            this.f19383t = i23 + 1;
            i11 = i23 + this.f19365b[(iM6378p2 * 5) + 3];
        }
        this.f19384u = i11;
    }

    /* JADX INFO: renamed from: K */
    public final C5995c m6360K(int i10) {
        ArrayList arrayList;
        int iM6438Y;
        if (i10 < 0 || i10 >= m6376n() || (iM6438Y = C5997d.m6438Y((arrayList = this.f19367d), i10, m6376n())) < 0) {
            return null;
        }
        return (C5995c) arrayList.get(iM6438Y);
    }

    /* JADX INFO: renamed from: L */
    public final void m6361L(Object obj) {
        int iM6378p = m6378p(this.f19383t);
        if (!C5997d.m6458n(this.f19365b, iM6378p)) {
            C5997d.m6470z("Updating the data of a group that was not created with a data slot");
            throw null;
        }
        Object[] objArr = this.f19366c;
        int[] iArr = this.f19365b;
        objArr[m6370g(C5997d.m6416C(iArr[(iM6378p * 5) + 1] >> 29) + m6369f(iArr, iM6378p))] = obj;
    }

    /* JADX INFO: renamed from: M */
    public final void m6362M(int i10) {
        if (i10 >= 0) {
            C13287b c13287b = this.f19387x;
            if (c13287b == null) {
                c13287b = new C13287b(20);
                this.f19387x = c13287b;
            }
            c13287b.m14900c(i10);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m6363N(int i10, Object obj) {
        int iM6378p = m6378p(i10);
        int[] iArr = this.f19365b;
        if (iM6378p < iArr.length && C5997d.m6460p(iArr, iM6378p)) {
            this.f19366c[m6370g(m6369f(this.f19365b, iM6378p))] = obj;
            return;
        }
        C5997d.m6470z("Updating the node of a group at " + i10 + " that was not created with as a node group");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final void m6364a(int i10) {
        boolean z6 = false;
        if (!(i10 >= 0)) {
            C5997d.m6470z("Cannot seek backwards");
            throw null;
        }
        if (!(this.f19377n <= 0)) {
            C5997d.m6445c0("Cannot call seek() while inserting");
            throw null;
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f19383t + i10;
        if (i11 >= this.f19385v && i11 <= this.f19384u) {
            z6 = true;
        }
        if (z6) {
            this.f19383t = i11;
            int iM6369f = m6369f(this.f19365b, m6378p(i11));
            this.f19372i = iM6369f;
            this.f19373j = iM6369f;
            return;
        }
        C5997d.m6470z("Cannot seek outside the current group (" + this.f19385v + '-' + this.f19384u + ')');
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final C5995c m6365b(int i10) {
        ArrayList arrayList = this.f19367d;
        int iM6438Y = C5997d.m6438Y(arrayList, i10, m6376n());
        if (iM6438Y >= 0) {
            return (C5995c) arrayList.get(iM6438Y);
        }
        if (i10 > this.f19370g) {
            i10 = -(m6376n() - i10);
        }
        C5995c c5995c = new C5995c(i10);
        arrayList.add(-(iM6438Y + 1), c5995c);
        return c5995c;
    }

    /* JADX INFO: renamed from: c */
    public final int m6366c(C5995c c5995c) {
        int i10 = c5995c.f19473a;
        return i10 < 0 ? i10 + m6376n() : i10;
    }

    /* JADX INFO: renamed from: d */
    public final void m6367d() {
        int i10 = this.f19377n;
        this.f19377n = i10 + 1;
        if (i10 == 0) {
            this.f19380q.m6397d((m6375m() - this.f19371h) - this.f19384u);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6368e(boolean z6) {
        this.f19386w = true;
        if (z6 && this.f19379p.f19404b == 0) {
            m6384v(m6376n());
            m6385w(this.f19366c.length - this.f19375l, this.f19370g);
            int i10 = this.f19374k;
            Arrays.fill(this.f19366c, i10, this.f19375l + i10, (Object) null);
            m6350A();
        }
        int[] iArr = this.f19365b;
        int i11 = this.f19370g;
        Object[] objArr = this.f19366c;
        int i12 = this.f19374k;
        ArrayList arrayList = this.f19367d;
        HashMap map = this.f19368e;
        C12982u c12982u = this.f19369f;
        C5943B0 c5943b0 = this.f19364a;
        c5943b0.getClass();
        if (!c5943b0.f19351r0) {
            C5997d.m6443b0("Unexpected writer close()");
            throw null;
        }
        c5943b0.f19351r0 = false;
        c5943b0.f19346Y = iArr;
        c5943b0.f19347Z = i11;
        c5943b0.f19348o0 = objArr;
        c5943b0.f19349p0 = i12;
        c5943b0.f19353t0 = arrayList;
        c5943b0.f19354u0 = map;
        c5943b0.f19355v0 = c12982u;
    }

    /* JADX INFO: renamed from: f */
    public final int m6369f(int[] iArr, int i10) {
        if (i10 >= m6375m()) {
            return this.f19366c.length - this.f19375l;
        }
        int iM6456l = C5997d.m6456l(iArr, i10);
        return iM6456l < 0 ? (this.f19366c.length - this.f19375l) + iM6456l + 1 : iM6456l;
    }

    /* JADX INFO: renamed from: g */
    public final int m6370g(int i10) {
        return i10 < this.f19374k ? i10 : i10 + this.f19375l;
    }

    /* JADX INFO: renamed from: i */
    public final void m6371i() {
        C12949B c12949b;
        boolean z6 = this.f19377n > 0;
        int i10 = this.f19383t;
        int i11 = this.f19384u;
        int i12 = this.f19385v;
        int iM6378p = m6378p(i12);
        int i13 = this.f19378o;
        int i14 = i10 - i12;
        boolean zM6460p = C5997d.m6460p(this.f19365b, iM6378p);
        C5960K c5960k = this.f19381r;
        if (z6) {
            C12982u c12982u = this.f19382s;
            if (c12982u != null && (c12949b = (C12949B) c12982u.m14694f(i12)) != null) {
                Object[] objArr = c12949b.f41115a;
                int i15 = c12949b.f41116b;
                for (int i16 = 0; i16 < i15; i16++) {
                    m6388z(objArr[i16]);
                }
            }
            C5997d.m6466v(iM6378p, i14, this.f19365b);
            C5997d.m6467w(iM6378p, i13, this.f19365b);
            int iM6396c = c5960k.m6396c();
            if (zM6460p) {
                i13 = 1;
            }
            this.f19378o = iM6396c + i13;
            int iM6387y = m6387y(this.f19365b, i12);
            this.f19385v = iM6387y;
            int iM6376n = iM6387y < 0 ? m6376n() : m6378p(iM6387y + 1);
            int iM6369f = iM6376n >= 0 ? m6369f(this.f19365b, iM6376n) : 0;
            this.f19372i = iM6369f;
            this.f19373j = iM6369f;
            return;
        }
        if (i10 != i11) {
            C5997d.m6470z("Expected to be at the end of a group");
            throw null;
        }
        int[] iArr = this.f19365b;
        int i17 = iArr[(iM6378p * 5) + 3];
        int iM6462r = C5997d.m6462r(iArr, iM6378p);
        C5997d.m6466v(iM6378p, i14, this.f19365b);
        C5997d.m6467w(iM6378p, i13, this.f19365b);
        int iM6396c2 = this.f19379p.m6396c();
        this.f19384u = (m6375m() - this.f19371h) - this.f19380q.m6396c();
        this.f19385v = iM6396c2;
        int iM6387y2 = m6387y(this.f19365b, i12);
        int iM6396c3 = c5960k.m6396c();
        this.f19378o = iM6396c3;
        if (iM6387y2 == iM6396c2) {
            this.f19378o = iM6396c3 + (zM6460p ? 0 : i13 - iM6462r);
            return;
        }
        int i18 = i14 - i17;
        int i19 = zM6460p ? 0 : i13 - iM6462r;
        if (i18 != 0 || i19 != 0) {
            while (iM6387y2 != 0 && iM6387y2 != iM6396c2 && (i19 != 0 || i18 != 0)) {
                int iM6378p2 = m6378p(iM6387y2);
                if (i18 != 0) {
                    int[] iArr2 = this.f19365b;
                    C5997d.m6466v(iM6378p2, iArr2[(iM6378p2 * 5) + 3] + i18, iArr2);
                }
                if (i19 != 0) {
                    int[] iArr3 = this.f19365b;
                    C5997d.m6467w(iM6378p2, C5997d.m6462r(iArr3, iM6378p2) + i19, iArr3);
                }
                if (C5997d.m6460p(this.f19365b, iM6378p2)) {
                    i19 = 0;
                }
                iM6387y2 = m6387y(this.f19365b, iM6387y2);
            }
        }
        this.f19378o += i19;
    }

    /* JADX INFO: renamed from: j */
    public final void m6372j() {
        int i10 = this.f19377n;
        if (!(i10 > 0)) {
            C5997d.m6445c0("Unbalanced begin/end insert");
            throw null;
        }
        int i11 = i10 - 1;
        this.f19377n = i11;
        if (i11 == 0) {
            if (this.f19381r.f19404b == this.f19379p.f19404b) {
                this.f19384u = (m6375m() - this.f19371h) - this.f19380q.m6396c();
            } else {
                C5997d.m6470z("startGroup/endGroup mismatch while inserting");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m6373k(int i10) {
        boolean z6 = false;
        if (!(this.f19377n <= 0)) {
            C5997d.m6470z("Cannot call ensureStarted() while inserting");
            throw null;
        }
        int i11 = this.f19385v;
        if (i11 != i10) {
            if (i10 >= i11 && i10 < this.f19384u) {
                z6 = true;
            }
            if (!z6) {
                C5997d.m6470z("Started group at " + i10 + " must be a subgroup of the group at " + i11);
                throw null;
            }
            int i12 = this.f19383t;
            int i13 = this.f19372i;
            int i14 = this.f19373j;
            this.f19383t = i10;
            m6358I();
            this.f19383t = i12;
            this.f19372i = i13;
            this.f19373j = i14;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m6374l(int i10, int i11, int i12) {
        if (i10 >= this.f19370g) {
            i10 = -((m6376n() - i10) + 2);
        }
        while (i12 < i11) {
            this.f19365b[(m6378p(i12) * 5) + 2] = i10;
            int i13 = this.f19365b[(m6378p(i12) * 5) + 3] + i12;
            m6374l(i12, i13, i12 + 1);
            i12 = i13;
        }
    }

    /* JADX INFO: renamed from: m */
    public final int m6375m() {
        return this.f19365b.length / 5;
    }

    /* JADX INFO: renamed from: n */
    public final int m6376n() {
        return m6375m() - this.f19371h;
    }

    /* JADX INFO: renamed from: o */
    public final int m6377o() {
        return this.f19366c.length - this.f19375l;
    }

    /* JADX INFO: renamed from: p */
    public final int m6378p(int i10) {
        return i10 < this.f19370g ? i10 : i10 + this.f19371h;
    }

    /* JADX INFO: renamed from: q */
    public final int m6379q(int i10) {
        return C5997d.m6457m(this.f19365b, m6378p(i10));
    }

    /* JADX INFO: renamed from: r */
    public final void m6380r(int i10) {
        if (i10 > 0) {
            int i11 = this.f19383t;
            m6384v(i11);
            int i12 = this.f19370g;
            int i13 = this.f19371h;
            int[] iArr = this.f19365b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < i10) {
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[iMax * 5];
                int i15 = iMax - i14;
                AbstractC17678l.m19303j(0, 0, i12 * 5, iArr, iArr2);
                AbstractC17678l.m19303j((i12 + i15) * 5, (i13 + i12) * 5, length * 5, iArr, iArr2);
                this.f19365b = iArr2;
                i13 = i15;
            }
            int i16 = this.f19384u;
            if (i16 >= i12) {
                this.f19384u = i16 + i10;
            }
            int i17 = i12 + i10;
            this.f19370g = i17;
            this.f19371h = i13 - i10;
            int iM6349h = m6349h(i14 > 0 ? m6369f(this.f19365b, m6378p(i11 + i10)) : 0, this.f19376m >= i12 ? this.f19374k : 0, this.f19375l, this.f19366c.length);
            for (int i18 = i12; i18 < i17; i18++) {
                this.f19365b[(i18 * 5) + 4] = iM6349h;
            }
            int i19 = this.f19376m;
            if (i19 >= i12) {
                this.f19376m = i19 + i10;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m6381s(int i10, int i11) {
        if (i10 > 0) {
            m6385w(this.f19372i, i11);
            int i12 = this.f19374k;
            int i13 = this.f19375l;
            if (i13 < i10) {
                Object[] objArr = this.f19366c;
                int length = objArr.length;
                int i14 = length - i13;
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = iMax - i14;
                AbstractC17678l.m19304k(0, 0, i12, objArr, objArr2);
                AbstractC17678l.m19304k(i12 + i16, i13 + i12, length, objArr, objArr2);
                this.f19366c = objArr2;
                i13 = i16;
            }
            int i17 = this.f19373j;
            if (i17 >= i12) {
                this.f19373j = i17 + i10;
            }
            this.f19374k = i12 + i10;
            this.f19375l = i13 - i10;
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m6382t(int i10) {
        return C5997d.m6460p(this.f19365b, m6378p(i10));
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f19383t + " end=" + this.f19384u + " size = " + m6376n() + " gap=" + this.f19370g + '-' + (this.f19370g + this.f19371h) + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public final void m6383u(C5943B0 c5943b0, int i10) {
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        boolean z6 = false;
        C5997d.m6437X(this.f19377n > 0);
        if (i10 == 0 && this.f19383t == 0 && this.f19364a.f19347Z == 0) {
            int[] iArr = c5943b0.f19346Y;
            int i11 = iArr[(i10 * 5) + 3];
            int i12 = c5943b0.f19347Z;
            if (i11 == i12) {
                int[] iArr2 = this.f19365b;
                Object[] objArr3 = this.f19366c;
                ArrayList arrayList = this.f19367d;
                HashMap map = this.f19368e;
                C12982u c12982u = this.f19369f;
                Object[] objArr4 = c5943b0.f19348o0;
                int i13 = c5943b0.f19349p0;
                HashMap map2 = c5943b0.f19354u0;
                C12982u c12982u2 = c5943b0.f19355v0;
                this.f19365b = iArr;
                this.f19366c = objArr4;
                this.f19367d = c5943b0.f19353t0;
                this.f19370g = i12;
                this.f19371h = (iArr.length / 5) - i12;
                this.f19374k = i13;
                this.f19375l = objArr4.length - i13;
                this.f19376m = i12;
                this.f19368e = map2;
                this.f19369f = c12982u2;
                c5943b0.f19346Y = iArr2;
                c5943b0.f19347Z = objArr2 == true ? 1 : 0;
                c5943b0.f19348o0 = objArr3;
                c5943b0.f19349p0 = objArr == true ? 1 : 0;
                c5943b0.f19353t0 = arrayList;
                c5943b0.f19354u0 = map;
                c5943b0.f19355v0 = c12982u;
                return;
            }
        }
        C5947D0 c5947d0M6344p = c5943b0.m6344p();
        try {
            C5997d.m6427N(c5947d0M6344p, i10, this, true, true, false);
        } finally {
            c5947d0M6344p.m6368e(z6);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m6384v(int i10) {
        C5995c c5995c;
        int i11;
        C5995c c5995c2;
        int i12;
        int i13;
        int i14 = this.f19371h;
        int i15 = this.f19370g;
        if (i15 != i10) {
            if (!this.f19367d.isEmpty()) {
                int iM6375m = m6375m() - this.f19371h;
                if (i15 < i10) {
                    for (int iM6461q = C5997d.m6461q(this.f19367d, i15, iM6375m); iM6461q < this.f19367d.size() && (i12 = (c5995c2 = (C5995c) this.f19367d.get(iM6461q)).f19473a) < 0 && (i13 = i12 + iM6375m) < i10; iM6461q++) {
                        c5995c2.f19473a = i13;
                    }
                } else {
                    for (int iM6461q2 = C5997d.m6461q(this.f19367d, i10, iM6375m); iM6461q2 < this.f19367d.size() && (i11 = (c5995c = (C5995c) this.f19367d.get(iM6461q2)).f19473a) >= 0; iM6461q2++) {
                        c5995c.f19473a = -(iM6375m - i11);
                    }
                }
            }
            if (i14 > 0) {
                int[] iArr = this.f19365b;
                int i16 = i10 * 5;
                int i17 = i14 * 5;
                int i18 = i15 * 5;
                if (i10 < i15) {
                    AbstractC17678l.m19303j(i17 + i16, i16, i18, iArr, iArr);
                } else {
                    AbstractC17678l.m19303j(i18, i18 + i17, i16 + i17, iArr, iArr);
                }
            }
            if (i10 < i15) {
                i15 = i10 + i14;
            }
            int iM6375m2 = m6375m();
            C5997d.m6437X(i15 < iM6375m2);
            while (i15 < iM6375m2) {
                int i19 = (i15 * 5) + 2;
                int i20 = this.f19365b[i19];
                int iM6376n = i20 > -2 ? i20 : (m6376n() + i20) - (-2);
                if (iM6376n >= i10) {
                    iM6376n = -((m6376n() - iM6376n) - (-2));
                }
                if (iM6376n != i20) {
                    this.f19365b[i19] = iM6376n;
                }
                i15++;
                if (i15 == i10) {
                    i15 += i14;
                }
            }
        }
        this.f19370g = i10;
    }

    /* JADX INFO: renamed from: w */
    public final void m6385w(int i10, int i11) {
        int i12 = this.f19375l;
        int i13 = this.f19374k;
        int i14 = this.f19376m;
        if (i13 != i10) {
            Object[] objArr = this.f19366c;
            if (i10 < i13) {
                AbstractC17678l.m19304k(i10 + i12, i10, i13, objArr, objArr);
            } else {
                AbstractC17678l.m19304k(i13, i13 + i12, i10 + i12, objArr, objArr);
            }
        }
        int iMin = Math.min(i11 + 1, m6376n());
        if (i14 != iMin) {
            int length = this.f19366c.length - i12;
            if (iMin < i14) {
                int iM6378p = m6378p(iMin);
                int iM6378p2 = m6378p(i14);
                int i15 = this.f19370g;
                while (iM6378p < iM6378p2) {
                    int[] iArr = this.f19365b;
                    int i16 = (iM6378p * 5) + 4;
                    int i17 = iArr[i16];
                    if (i17 < 0) {
                        C5997d.m6470z("Unexpected anchor value, expected a positive anchor");
                        throw null;
                    }
                    iArr[i16] = -((length - i17) + 1);
                    iM6378p++;
                    if (iM6378p == i15) {
                        iM6378p += this.f19371h;
                    }
                }
            } else {
                int iM6378p3 = m6378p(i14);
                int iM6378p4 = m6378p(iMin);
                while (iM6378p3 < iM6378p4) {
                    int[] iArr2 = this.f19365b;
                    int i18 = (iM6378p3 * 5) + 4;
                    int i19 = iArr2[i18];
                    if (i19 >= 0) {
                        C5997d.m6470z("Unexpected anchor value, expected a negative anchor");
                        throw null;
                    }
                    iArr2[i18] = i19 + length + 1;
                    iM6378p3++;
                    if (iM6378p3 == this.f19370g) {
                        iM6378p3 += this.f19371h;
                    }
                }
            }
            this.f19376m = iMin;
        }
        this.f19374k = i10;
    }

    /* JADX INFO: renamed from: x */
    public final Object m6386x(int i10) {
        int iM6378p = m6378p(i10);
        if (C5997d.m6460p(this.f19365b, iM6378p)) {
            return this.f19366c[m6370g(m6369f(this.f19365b, iM6378p))];
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public final int m6387y(int[] iArr, int i10) {
        int iM6463s = C5997d.m6463s(iArr, m6378p(i10));
        return iM6463s > -2 ? iM6463s : m6376n() + iM6463s + 2;
    }

    /* JADX INFO: renamed from: z */
    public final Object m6388z(Object obj) {
        if (this.f19377n > 0) {
            m6381s(1, this.f19385v);
        }
        Object[] objArr = this.f19366c;
        int i10 = this.f19372i;
        this.f19372i = i10 + 1;
        Object obj2 = objArr[m6370g(i10)];
        int i11 = this.f19372i;
        if (i11 <= this.f19373j) {
            this.f19366c[m6370g(i11 - 1)] = obj;
            return obj2;
        }
        C5997d.m6470z("Writing to an invalid slot");
        throw null;
    }
}
