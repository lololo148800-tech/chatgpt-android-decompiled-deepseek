package bj;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import p033B5.C0842z;
import p370P0.C6277D;

/* JADX INFO: renamed from: bj.I */
/* JADX INFO: loaded from: classes3.dex */
public final class C11444I extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: u0 */
    public static final C0842z f34592u0 = new C0842z(12);

    /* JADX INFO: renamed from: s0 */
    public C11442G f34599s0;

    /* JADX INFO: renamed from: t0 */
    public C11442G f34600t0;

    /* JADX INFO: renamed from: p0 */
    public int f34596p0 = 0;

    /* JADX INFO: renamed from: q0 */
    public int f34597q0 = 0;

    /* JADX INFO: renamed from: Y */
    public final Comparator f34593Y = f34592u0;

    /* JADX INFO: renamed from: o0 */
    public final C11443H f34595o0 = new C11443H();

    /* JADX INFO: renamed from: Z */
    public C11443H[] f34594Z = new C11443H[16];

    /* JADX INFO: renamed from: r0 */
    public int f34598r0 = 12;

    /* JADX INFO: renamed from: a */
    public final C11443H m12841a(Object obj, boolean z6) {
        C11443H c11443h;
        int i10;
        C11443H c11443h2;
        C11443H c11443h3;
        C11443H c11443h4;
        C11443H c11443h5;
        C11443H c11443h6;
        C11443H c11443h7;
        C11443H[] c11443hArr = this.f34594Z;
        int iHashCode = obj.hashCode();
        int i11 = iHashCode ^ ((iHashCode >>> 20) ^ (iHashCode >>> 12));
        int i12 = ((i11 >>> 7) ^ i11) ^ (i11 >>> 4);
        int length = i12 & (c11443hArr.length - 1);
        C11443H c11443h8 = c11443hArr[length];
        C0842z c0842z = f34592u0;
        C11443H c11443h9 = null;
        Comparator comparator = this.f34593Y;
        if (c11443h8 != null) {
            Comparable comparable = comparator == c0842z ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c11443h8.f34588r0;
                int iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return c11443h8;
                }
                C11443H c11443h10 = iCompareTo < 0 ? c11443h8.f34584Z : c11443h8.f34585o0;
                if (c11443h10 == null) {
                    i10 = iCompareTo;
                    c11443h = c11443h8;
                    break;
                }
                c11443h8 = c11443h10;
            }
        } else {
            c11443h = c11443h8;
            i10 = 0;
        }
        if (!z6) {
            return null;
        }
        C11443H c11443h11 = this.f34595o0;
        if (c11443h != null) {
            C11443H c11443h12 = new C11443H(c11443h, obj, i12, c11443h11, c11443h11.f34587q0);
            if (i10 < 0) {
                c11443h.f34584Z = c11443h12;
            } else {
                c11443h.f34585o0 = c11443h12;
            }
            m12842b(c11443h, true);
            c11443h2 = c11443h12;
        } else {
            if (comparator == c0842z && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c11443h2 = new C11443H(c11443h, obj, i12, c11443h11, c11443h11.f34587q0);
            c11443hArr[length] = c11443h2;
        }
        int i13 = this.f34596p0;
        this.f34596p0 = i13 + 1;
        if (i13 > this.f34598r0) {
            C11443H[] c11443hArr2 = this.f34594Z;
            int length2 = c11443hArr2.length;
            int i14 = length2 * 2;
            C11443H[] c11443hArr3 = new C11443H[i14];
            C6277D c6277d = new C6277D(3);
            C6277D c6277d2 = new C6277D(3);
            int i15 = 0;
            while (i15 < length2) {
                C11443H c11443h13 = c11443hArr2[i15];
                if (c11443h13 == null) {
                    c11443h4 = c11443h9;
                } else {
                    C11443H c11443h14 = c11443h9;
                    for (C11443H c11443h15 = c11443h13; c11443h15 != null; c11443h15 = c11443h15.f34584Z) {
                        c11443h15.f34583Y = c11443h14;
                        c11443h14 = c11443h15;
                    }
                    int i16 = 0;
                    int i17 = 0;
                    while (true) {
                        if (c11443h14 != null) {
                            C11443H c11443h16 = c11443h14.f34583Y;
                            c11443h14.f34583Y = c11443h9;
                            C11443H c11443h17 = c11443h14.f34585o0;
                            while (true) {
                                C11443H c11443h18 = c11443h16;
                                c11443h16 = c11443h17;
                                c11443h3 = c11443h18;
                                if (c11443h16 == null) {
                                    break;
                                }
                                c11443h16.f34583Y = c11443h3;
                                c11443h17 = c11443h16.f34584Z;
                            }
                        } else {
                            C11443H c11443h19 = c11443h14;
                            c11443h14 = c11443h9;
                            c11443h3 = c11443h19;
                        }
                        if (c11443h14 == null) {
                            break;
                        }
                        if ((c11443h14.f34589s0 & length2) == 0) {
                            i16++;
                        } else {
                            i17++;
                        }
                        c11443h14 = c11443h3;
                        c11443h9 = null;
                    }
                    c6277d.f20382b = ((Integer.highestOneBit(i16) * 2) - 1) - i16;
                    c6277d.f20384d = 0;
                    c6277d.f20383c = 0;
                    c11443h4 = null;
                    c6277d.f20385e = null;
                    c6277d2.f20382b = ((Integer.highestOneBit(i17) * 2) - 1) - i17;
                    c6277d2.f20384d = 0;
                    c6277d2.f20383c = 0;
                    c6277d2.f20385e = null;
                    C11443H c11443h20 = null;
                    while (c11443h13 != null) {
                        c11443h13.f34583Y = c11443h20;
                        c11443h20 = c11443h13;
                        c11443h13 = c11443h13.f34584Z;
                    }
                    while (true) {
                        if (c11443h20 != null) {
                            C11443H c11443h21 = c11443h20.f34583Y;
                            c11443h20.f34583Y = null;
                            C11443H c11443h22 = c11443h20.f34585o0;
                            while (true) {
                                C11443H c11443h23 = c11443h22;
                                c11443h5 = c11443h21;
                                c11443h21 = c11443h23;
                                if (c11443h21 == null) {
                                    break;
                                }
                                c11443h21.f34583Y = c11443h5;
                                c11443h22 = c11443h21.f34584Z;
                            }
                        } else {
                            c11443h5 = c11443h20;
                            c11443h20 = null;
                        }
                        if (c11443h20 == null) {
                            break;
                        }
                        if ((c11443h20.f34589s0 & length2) == 0) {
                            c6277d.m6792a(c11443h20);
                        } else {
                            c6277d2.m6792a(c11443h20);
                        }
                        c11443h20 = c11443h5;
                    }
                    if (i16 > 0) {
                        c11443h6 = (C11443H) c6277d.f20385e;
                        if (c11443h6.f34583Y != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        c11443h6 = null;
                    }
                    c11443hArr3[i15] = c11443h6;
                    int i18 = i15 + length2;
                    if (i17 > 0) {
                        c11443h7 = (C11443H) c6277d2.f20385e;
                        if (c11443h7.f34583Y != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        c11443h7 = null;
                    }
                    c11443hArr3[i18] = c11443h7;
                }
                i15++;
                c11443h9 = c11443h4;
            }
            this.f34594Z = c11443hArr3;
            this.f34598r0 = (i14 / 4) + (i14 / 2);
        }
        this.f34597q0++;
        return c11443h2;
    }

    /* JADX INFO: renamed from: b */
    public final void m12842b(C11443H c11443h, boolean z6) {
        while (c11443h != null) {
            C11443H c11443h2 = c11443h.f34584Z;
            C11443H c11443h3 = c11443h.f34585o0;
            int i10 = c11443h2 != null ? c11443h2.f34591u0 : 0;
            int i11 = c11443h3 != null ? c11443h3.f34591u0 : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                C11443H c11443h4 = c11443h3.f34584Z;
                C11443H c11443h5 = c11443h3.f34585o0;
                int i13 = (c11443h4 != null ? c11443h4.f34591u0 : 0) - (c11443h5 != null ? c11443h5.f34591u0 : 0);
                if (i13 != -1 && (i13 != 0 || z6)) {
                    m12846f(c11443h3);
                }
                m12845e(c11443h);
                if (z6) {
                    return;
                }
            } else if (i12 == 2) {
                C11443H c11443h6 = c11443h2.f34584Z;
                C11443H c11443h7 = c11443h2.f34585o0;
                int i14 = (c11443h6 != null ? c11443h6.f34591u0 : 0) - (c11443h7 != null ? c11443h7.f34591u0 : 0);
                if (i14 != 1 && (i14 != 0 || z6)) {
                    m12845e(c11443h2);
                }
                m12846f(c11443h);
                if (z6) {
                    return;
                }
            } else if (i12 == 0) {
                c11443h.f34591u0 = i10 + 1;
                if (z6) {
                    return;
                }
            } else {
                c11443h.f34591u0 = Math.max(i10, i11) + 1;
                if (!z6) {
                    return;
                }
            }
            c11443h = c11443h.f34583Y;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12843c(C11443H c11443h, boolean z6) {
        C11443H c11443h2;
        C11443H c11443h3;
        int i10;
        if (z6) {
            C11443H c11443h4 = c11443h.f34587q0;
            c11443h4.f34586p0 = c11443h.f34586p0;
            c11443h.f34586p0.f34587q0 = c11443h4;
            c11443h.f34587q0 = null;
            c11443h.f34586p0 = null;
        }
        C11443H c11443h5 = c11443h.f34584Z;
        C11443H c11443h6 = c11443h.f34585o0;
        C11443H c11443h7 = c11443h.f34583Y;
        int i11 = 0;
        if (c11443h5 == null || c11443h6 == null) {
            if (c11443h5 != null) {
                m12844d(c11443h, c11443h5);
                c11443h.f34584Z = null;
            } else if (c11443h6 != null) {
                m12844d(c11443h, c11443h6);
                c11443h.f34585o0 = null;
            } else {
                m12844d(c11443h, null);
            }
            m12842b(c11443h7, false);
            this.f34596p0--;
            this.f34597q0++;
            return;
        }
        if (c11443h5.f34591u0 > c11443h6.f34591u0) {
            C11443H c11443h8 = c11443h5.f34585o0;
            while (true) {
                C11443H c11443h9 = c11443h8;
                c11443h3 = c11443h5;
                c11443h5 = c11443h9;
                if (c11443h5 == null) {
                    break;
                } else {
                    c11443h8 = c11443h5.f34585o0;
                }
            }
        } else {
            C11443H c11443h10 = c11443h6.f34584Z;
            while (true) {
                c11443h2 = c11443h6;
                c11443h6 = c11443h10;
                if (c11443h6 == null) {
                    break;
                } else {
                    c11443h10 = c11443h6.f34584Z;
                }
            }
            c11443h3 = c11443h2;
        }
        m12843c(c11443h3, false);
        C11443H c11443h11 = c11443h.f34584Z;
        if (c11443h11 != null) {
            i10 = c11443h11.f34591u0;
            c11443h3.f34584Z = c11443h11;
            c11443h11.f34583Y = c11443h3;
            c11443h.f34584Z = null;
        } else {
            i10 = 0;
        }
        C11443H c11443h12 = c11443h.f34585o0;
        if (c11443h12 != null) {
            i11 = c11443h12.f34591u0;
            c11443h3.f34585o0 = c11443h12;
            c11443h12.f34583Y = c11443h3;
            c11443h.f34585o0 = null;
        }
        c11443h3.f34591u0 = Math.max(i10, i11) + 1;
        m12844d(c11443h, c11443h3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f34594Z, (Object) null);
        this.f34596p0 = 0;
        this.f34597q0++;
        C11443H c11443h = this.f34595o0;
        C11443H c11443h2 = c11443h.f34586p0;
        while (c11443h2 != c11443h) {
            C11443H c11443h3 = c11443h2.f34586p0;
            c11443h2.f34587q0 = null;
            c11443h2.f34586p0 = null;
            c11443h2 = c11443h3;
        }
        c11443h.f34587q0 = c11443h;
        c11443h.f34586p0 = c11443h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C11443H c11443hM12841a = null;
        if (obj != null) {
            try {
                c11443hM12841a = m12841a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c11443hM12841a != null;
    }

    /* JADX INFO: renamed from: d */
    public final void m12844d(C11443H c11443h, C11443H c11443h2) {
        C11443H c11443h3 = c11443h.f34583Y;
        c11443h.f34583Y = null;
        if (c11443h2 != null) {
            c11443h2.f34583Y = c11443h3;
        }
        if (c11443h3 == null) {
            C11443H[] c11443hArr = this.f34594Z;
            c11443hArr[c11443h.f34589s0 & (c11443hArr.length - 1)] = c11443h2;
        } else if (c11443h3.f34584Z == c11443h) {
            c11443h3.f34584Z = c11443h2;
        } else {
            c11443h3.f34585o0 = c11443h2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m12845e(C11443H c11443h) {
        C11443H c11443h2 = c11443h.f34584Z;
        C11443H c11443h3 = c11443h.f34585o0;
        C11443H c11443h4 = c11443h3.f34584Z;
        C11443H c11443h5 = c11443h3.f34585o0;
        c11443h.f34585o0 = c11443h4;
        if (c11443h4 != null) {
            c11443h4.f34583Y = c11443h;
        }
        m12844d(c11443h, c11443h3);
        c11443h3.f34584Z = c11443h;
        c11443h.f34583Y = c11443h3;
        int iMax = Math.max(c11443h2 != null ? c11443h2.f34591u0 : 0, c11443h4 != null ? c11443h4.f34591u0 : 0) + 1;
        c11443h.f34591u0 = iMax;
        c11443h3.f34591u0 = Math.max(iMax, c11443h5 != null ? c11443h5.f34591u0 : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C11442G c11442g = this.f34599s0;
        if (c11442g != null) {
            return c11442g;
        }
        C11442G c11442g2 = new C11442G(this, 0);
        this.f34599s0 = c11442g2;
        return c11442g2;
    }

    /* JADX INFO: renamed from: f */
    public final void m12846f(C11443H c11443h) {
        C11443H c11443h2 = c11443h.f34584Z;
        C11443H c11443h3 = c11443h.f34585o0;
        C11443H c11443h4 = c11443h2.f34584Z;
        C11443H c11443h5 = c11443h2.f34585o0;
        c11443h.f34584Z = c11443h5;
        if (c11443h5 != null) {
            c11443h5.f34583Y = c11443h;
        }
        m12844d(c11443h, c11443h2);
        c11443h2.f34585o0 = c11443h;
        c11443h.f34583Y = c11443h2;
        int iMax = Math.max(c11443h3 != null ? c11443h3.f34591u0 : 0, c11443h5 != null ? c11443h5.f34591u0 : 0) + 1;
        c11443h.f34591u0 = iMax;
        c11443h2.f34591u0 = Math.max(iMax, c11443h4 != null ? c11443h4.f34591u0 : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C11443H c11443hM12841a;
        if (obj != null) {
            try {
                c11443hM12841a = m12841a(obj, false);
            } catch (ClassCastException unused) {
                c11443hM12841a = null;
            }
        } else {
            c11443hM12841a = null;
        }
        if (c11443hM12841a != null) {
            return c11443hM12841a.f34590t0;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C11442G c11442g = this.f34600t0;
        if (c11442g != null) {
            return c11442g;
        }
        C11442G c11442g2 = new C11442G(this, 1);
        this.f34600t0 = c11442g2;
        return c11442g2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        C11443H c11443hM12841a = m12841a(obj, true);
        Object obj3 = c11443hM12841a.f34590t0;
        c11443hM12841a.f34590t0 = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        C11443H c11443hM12841a;
        if (obj != null) {
            try {
                c11443hM12841a = m12841a(obj, false);
            } catch (ClassCastException unused) {
                c11443hM12841a = null;
            }
        } else {
            c11443hM12841a = null;
        }
        if (c11443hM12841a != null) {
            m12843c(c11443hM12841a, true);
        }
        if (c11443hM12841a != null) {
            return c11443hM12841a.f34590t0;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f34596p0;
    }
}
