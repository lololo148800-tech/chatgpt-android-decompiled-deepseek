package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.M1 */
/* JADX INFO: loaded from: classes.dex */
public final class C11892M1 {

    /* JADX INFO: renamed from: f */
    public static final C11892M1 f36161f = new C11892M1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f36162a;

    /* JADX INFO: renamed from: b */
    public int[] f36163b;

    /* JADX INFO: renamed from: c */
    public Object[] f36164c;

    /* JADX INFO: renamed from: d */
    public int f36165d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f36166e;

    public C11892M1(int i10, int[] iArr, Object[] objArr, boolean z6) {
        this.f36162a = i10;
        this.f36163b = iArr;
        this.f36164c = objArr;
        this.f36166e = z6;
    }

    /* JADX INFO: renamed from: b */
    public static C11892M1 m13307b() {
        return new C11892M1(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public final int m13308a() {
        int iM13386n0;
        int iM13382V;
        int iM13386n1;
        int i10 = this.f36165d;
        if (i10 != -1) {
            return i10;
        }
        int iM13386n2 = 0;
        for (int i11 = 0; i11 < this.f36162a; i11++) {
            int i12 = this.f36163b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 == 2) {
                        int i15 = i13 << 3;
                        C11929Z0 c11929z0 = (C11929Z0) this.f36164c[i11];
                        int iM13386n3 = C11933a1.m13386n0(i15);
                        int iMo13368j = c11929z0.mo13368j();
                        iM13386n2 = C11933a1.m13386n0(iMo13368j) + iMo13368j + iM13386n3 + iM13386n2;
                    } else if (i14 == 3) {
                        int iM13386n4 = C11933a1.m13386n0(i13 << 3);
                        iM13386n0 = iM13386n4 + iM13386n4;
                        iM13382V = ((C11892M1) this.f36164c[i11]).m13308a();
                    } else {
                        if (i14 != 5) {
                            throw new IllegalStateException(new C11993p1());
                        }
                        ((Integer) this.f36164c[i11]).getClass();
                        iM13386n1 = C11933a1.m13386n0(i13 << 3) + 4;
                    }
                } else {
                    ((Long) this.f36164c[i11]).getClass();
                    iM13386n1 = C11933a1.m13386n0(i13 << 3) + 8;
                }
                iM13386n2 = iM13386n1 + iM13386n2;
            } else {
                int i16 = i13 << 3;
                long jLongValue = ((Long) this.f36164c[i11]).longValue();
                iM13386n0 = C11933a1.m13386n0(i16);
                iM13382V = C11933a1.m13382V(jLongValue);
            }
            iM13386n2 = iM13382V + iM13386n0 + iM13386n2;
        }
        this.f36165d = iM13386n2;
        return iM13386n2;
    }

    /* JADX INFO: renamed from: c */
    public final void m13309c(int i10, Object obj) {
        if (!this.f36166e) {
            throw new UnsupportedOperationException();
        }
        m13311e(this.f36162a + 1);
        int[] iArr = this.f36163b;
        int i11 = this.f36162a;
        iArr[i11] = i10;
        this.f36164c[i11] = obj;
        this.f36162a = i11 + 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m13310d(C12021w1 c12021w1) {
        if (this.f36162a != 0) {
            for (int i10 = 0; i10 < this.f36162a; i10++) {
                int i11 = this.f36163b[i10];
                Object obj = this.f36164c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    c12021w1.m13546r(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    c12021w1.m13542n(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    c12021w1.m13537i(i13, (C11929Z0) obj);
                } else if (i12 == 3) {
                    ((C11933a1) c12021w1.f36344a).m13396f0(i13, 3);
                    ((C11892M1) obj).m13310d(c12021w1);
                    ((C11933a1) c12021w1.f36344a).m13396f0(i13, 4);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new C11993p1());
                    }
                    c12021w1.m13541m(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m13311e(int i10) {
        int[] iArr = this.f36163b;
        if (i10 > iArr.length) {
            int i11 = this.f36162a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f36163b = Arrays.copyOf(iArr, i10);
            this.f36164c = Arrays.copyOf(this.f36164c, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C11892M1)) {
            return false;
        }
        C11892M1 c11892m1 = (C11892M1) obj;
        int i10 = this.f36162a;
        if (i10 == c11892m1.f36162a) {
            int[] iArr = this.f36163b;
            int[] iArr2 = c11892m1.f36163b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f36164c;
            Object[] objArr2 = c11892m1.f36164c;
            int i12 = this.f36162a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f36162a;
        int i11 = i10 + 527;
        int[] iArr = this.f36163b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f36164c;
        int i15 = this.f36162a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
