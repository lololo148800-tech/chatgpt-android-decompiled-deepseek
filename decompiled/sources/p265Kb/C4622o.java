package p265Kb;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
import p033B5.C0842z;

/* JADX INFO: renamed from: Kb.o */
/* JADX INFO: loaded from: classes.dex */
public final class C4622o extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: u0 */
    public static final C0842z f15064u0 = new C0842z(6);

    /* JADX INFO: renamed from: Y */
    public final Comparator f15065Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f15066Z;

    /* JADX INFO: renamed from: o0 */
    public C4621n f15067o0;

    /* JADX INFO: renamed from: p0 */
    public int f15068p0;

    /* JADX INFO: renamed from: q0 */
    public int f15069q0;

    /* JADX INFO: renamed from: r0 */
    public final C4621n f15070r0;

    /* JADX INFO: renamed from: s0 */
    public C4619l f15071s0;

    /* JADX INFO: renamed from: t0 */
    public C4619l f15072t0;

    public C4622o(boolean z6) {
        C0842z c0842z = f15064u0;
        this.f15068p0 = 0;
        this.f15069q0 = 0;
        this.f15065Y = c0842z;
        this.f15066Z = z6;
        this.f15070r0 = new C4621n(z6);
    }

    /* JADX INFO: renamed from: a */
    public final C4621n m5366a(Object obj, boolean z6) {
        int iCompareTo;
        C4621n c4621n;
        C4621n c4621n2 = this.f15067o0;
        C0842z c0842z = f15064u0;
        Comparator comparator = this.f15065Y;
        if (c4621n2 != null) {
            Comparable comparable = comparator == c0842z ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c4621n2.f15060r0;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return c4621n2;
                }
                C4621n c4621n3 = iCompareTo < 0 ? c4621n2.f15056Z : c4621n2.f15057o0;
                if (c4621n3 == null) {
                    break;
                }
                c4621n2 = c4621n3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z6) {
            return null;
        }
        C4621n c4621n4 = this.f15070r0;
        if (c4621n2 != null) {
            c4621n = new C4621n(this.f15066Z, c4621n2, obj, c4621n4, c4621n4.f15059q0);
            if (iCompareTo < 0) {
                c4621n2.f15056Z = c4621n;
            } else {
                c4621n2.f15057o0 = c4621n;
            }
            m5367b(c4621n2, true);
        } else {
            if (comparator == c0842z && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c4621n = new C4621n(this.f15066Z, c4621n2, obj, c4621n4, c4621n4.f15059q0);
            this.f15067o0 = c4621n;
        }
        this.f15068p0++;
        this.f15069q0++;
        return c4621n;
    }

    /* JADX INFO: renamed from: b */
    public final void m5367b(C4621n c4621n, boolean z6) {
        while (c4621n != null) {
            C4621n c4621n2 = c4621n.f15056Z;
            C4621n c4621n3 = c4621n.f15057o0;
            int i10 = c4621n2 != null ? c4621n2.f15063u0 : 0;
            int i11 = c4621n3 != null ? c4621n3.f15063u0 : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                C4621n c4621n4 = c4621n3.f15056Z;
                C4621n c4621n5 = c4621n3.f15057o0;
                int i13 = (c4621n4 != null ? c4621n4.f15063u0 : 0) - (c4621n5 != null ? c4621n5.f15063u0 : 0);
                if (i13 == -1 || (i13 == 0 && !z6)) {
                    m5370e(c4621n);
                } else {
                    m5371f(c4621n3);
                    m5370e(c4621n);
                }
                if (z6) {
                    return;
                }
            } else if (i12 == 2) {
                C4621n c4621n6 = c4621n2.f15056Z;
                C4621n c4621n7 = c4621n2.f15057o0;
                int i14 = (c4621n6 != null ? c4621n6.f15063u0 : 0) - (c4621n7 != null ? c4621n7.f15063u0 : 0);
                if (i14 == 1 || (i14 == 0 && !z6)) {
                    m5371f(c4621n);
                } else {
                    m5370e(c4621n2);
                    m5371f(c4621n);
                }
                if (z6) {
                    return;
                }
            } else if (i12 == 0) {
                c4621n.f15063u0 = i10 + 1;
                if (z6) {
                    return;
                }
            } else {
                c4621n.f15063u0 = Math.max(i10, i11) + 1;
                if (!z6) {
                    return;
                }
            }
            c4621n = c4621n.f15055Y;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5368c(C4621n c4621n, boolean z6) {
        C4621n c4621n2;
        C4621n c4621n3;
        int i10;
        if (z6) {
            C4621n c4621n4 = c4621n.f15059q0;
            c4621n4.f15058p0 = c4621n.f15058p0;
            c4621n.f15058p0.f15059q0 = c4621n4;
        }
        C4621n c4621n5 = c4621n.f15056Z;
        C4621n c4621n6 = c4621n.f15057o0;
        C4621n c4621n7 = c4621n.f15055Y;
        int i11 = 0;
        if (c4621n5 == null || c4621n6 == null) {
            if (c4621n5 != null) {
                m5369d(c4621n, c4621n5);
                c4621n.f15056Z = null;
            } else if (c4621n6 != null) {
                m5369d(c4621n, c4621n6);
                c4621n.f15057o0 = null;
            } else {
                m5369d(c4621n, null);
            }
            m5367b(c4621n7, false);
            this.f15068p0--;
            this.f15069q0++;
            return;
        }
        if (c4621n5.f15063u0 > c4621n6.f15063u0) {
            C4621n c4621n8 = c4621n5.f15057o0;
            while (true) {
                C4621n c4621n9 = c4621n8;
                c4621n3 = c4621n5;
                c4621n5 = c4621n9;
                if (c4621n5 == null) {
                    break;
                } else {
                    c4621n8 = c4621n5.f15057o0;
                }
            }
        } else {
            C4621n c4621n10 = c4621n6.f15056Z;
            while (true) {
                c4621n2 = c4621n6;
                c4621n6 = c4621n10;
                if (c4621n6 == null) {
                    break;
                } else {
                    c4621n10 = c4621n6.f15056Z;
                }
            }
            c4621n3 = c4621n2;
        }
        m5368c(c4621n3, false);
        C4621n c4621n11 = c4621n.f15056Z;
        if (c4621n11 != null) {
            i10 = c4621n11.f15063u0;
            c4621n3.f15056Z = c4621n11;
            c4621n11.f15055Y = c4621n3;
            c4621n.f15056Z = null;
        } else {
            i10 = 0;
        }
        C4621n c4621n12 = c4621n.f15057o0;
        if (c4621n12 != null) {
            i11 = c4621n12.f15063u0;
            c4621n3.f15057o0 = c4621n12;
            c4621n12.f15055Y = c4621n3;
            c4621n.f15057o0 = null;
        }
        c4621n3.f15063u0 = Math.max(i10, i11) + 1;
        m5369d(c4621n, c4621n3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f15067o0 = null;
        this.f15068p0 = 0;
        this.f15069q0++;
        C4621n c4621n = this.f15070r0;
        c4621n.f15059q0 = c4621n;
        c4621n.f15058p0 = c4621n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C4621n c4621nM5366a = null;
        if (obj != null) {
            try {
                c4621nM5366a = m5366a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c4621nM5366a != null;
    }

    /* JADX INFO: renamed from: d */
    public final void m5369d(C4621n c4621n, C4621n c4621n2) {
        C4621n c4621n3 = c4621n.f15055Y;
        c4621n.f15055Y = null;
        if (c4621n2 != null) {
            c4621n2.f15055Y = c4621n3;
        }
        if (c4621n3 == null) {
            this.f15067o0 = c4621n2;
        } else if (c4621n3.f15056Z == c4621n) {
            c4621n3.f15056Z = c4621n2;
        } else {
            c4621n3.f15057o0 = c4621n2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5370e(C4621n c4621n) {
        C4621n c4621n2 = c4621n.f15056Z;
        C4621n c4621n3 = c4621n.f15057o0;
        C4621n c4621n4 = c4621n3.f15056Z;
        C4621n c4621n5 = c4621n3.f15057o0;
        c4621n.f15057o0 = c4621n4;
        if (c4621n4 != null) {
            c4621n4.f15055Y = c4621n;
        }
        m5369d(c4621n, c4621n3);
        c4621n3.f15056Z = c4621n;
        c4621n.f15055Y = c4621n3;
        int iMax = Math.max(c4621n2 != null ? c4621n2.f15063u0 : 0, c4621n4 != null ? c4621n4.f15063u0 : 0) + 1;
        c4621n.f15063u0 = iMax;
        c4621n3.f15063u0 = Math.max(iMax, c4621n5 != null ? c4621n5.f15063u0 : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C4619l c4619l = this.f15071s0;
        if (c4619l != null) {
            return c4619l;
        }
        C4619l c4619l2 = new C4619l(this, 0);
        this.f15071s0 = c4619l2;
        return c4619l2;
    }

    /* JADX INFO: renamed from: f */
    public final void m5371f(C4621n c4621n) {
        C4621n c4621n2 = c4621n.f15056Z;
        C4621n c4621n3 = c4621n.f15057o0;
        C4621n c4621n4 = c4621n2.f15056Z;
        C4621n c4621n5 = c4621n2.f15057o0;
        c4621n.f15056Z = c4621n5;
        if (c4621n5 != null) {
            c4621n5.f15055Y = c4621n;
        }
        m5369d(c4621n, c4621n2);
        c4621n2.f15057o0 = c4621n;
        c4621n.f15055Y = c4621n2;
        int iMax = Math.max(c4621n3 != null ? c4621n3.f15063u0 : 0, c4621n5 != null ? c4621n5.f15063u0 : 0) + 1;
        c4621n.f15063u0 = iMax;
        c4621n2.f15063u0 = Math.max(iMax, c4621n4 != null ? c4621n4.f15063u0 : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C4621n c4621nM5366a;
        if (obj != null) {
            try {
                c4621nM5366a = m5366a(obj, false);
            } catch (ClassCastException unused) {
                c4621nM5366a = null;
            }
        } else {
            c4621nM5366a = null;
        }
        if (c4621nM5366a != null) {
            return c4621nM5366a.f15062t0;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C4619l c4619l = this.f15072t0;
        if (c4619l != null) {
            return c4619l;
        }
        C4619l c4619l2 = new C4619l(this, 1);
        this.f15072t0 = c4619l2;
        return c4619l2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f15066Z) {
            throw new NullPointerException("value == null");
        }
        C4621n c4621nM5366a = m5366a(obj, true);
        Object obj3 = c4621nM5366a.f15062t0;
        c4621nM5366a.f15062t0 = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        C4621n c4621nM5366a;
        if (obj != null) {
            try {
                c4621nM5366a = m5366a(obj, false);
            } catch (ClassCastException unused) {
                c4621nM5366a = null;
            }
        } else {
            c4621nM5366a = null;
        }
        if (c4621nM5366a != null) {
            m5368c(c4621nM5366a, true);
        }
        if (c4621nM5366a != null) {
            return c4621nM5366a.f15062t0;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f15068p0;
    }
}
