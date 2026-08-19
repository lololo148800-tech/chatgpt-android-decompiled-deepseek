package androidx.glance.appwidget.protobuf;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C11029Z {

    /* JADX INFO: renamed from: f */
    public static final C11029Z f33279f = new C11029Z(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f33280a;

    /* JADX INFO: renamed from: b */
    public int[] f33281b;

    /* JADX INFO: renamed from: c */
    public Object[] f33282c;

    /* JADX INFO: renamed from: d */
    public int f33283d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f33284e;

    public C11029Z(int i10, int[] iArr, Object[] objArr, boolean z6) {
        this.f33280a = i10;
        this.f33281b = iArr;
        this.f33282c = objArr;
        this.f33284e = z6;
    }

    /* JADX INFO: renamed from: a */
    public final void m11972a(int i10) {
        int[] iArr = this.f33281b;
        if (i10 > iArr.length) {
            int i11 = this.f33280a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f33281b = Arrays.copyOf(iArr, i10);
            this.f33282c = Arrays.copyOf(this.f33282c, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m11973b() {
        int iM12048D;
        int i10 = this.f33283d;
        if (i10 != -1) {
            return i10;
        }
        int iM11973b = 0;
        for (int i11 = 0; i11 < this.f33280a; i11++) {
            int i12 = this.f33281b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                iM12048D = C11048j.m12048D(i13, ((Long) this.f33282c[i11]).longValue());
            } else if (i14 == 1) {
                ((Long) this.f33282c[i11]).getClass();
                iM12048D = C11048j.m12056p(i13);
            } else if (i14 != 2) {
                if (i14 == 3) {
                    iM11973b = ((C11029Z) this.f33282c[i11]).m11973b() + (C11048j.m12045A(i13) * 2) + iM11973b;
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(C11005A.m11844b());
                    }
                    ((Integer) this.f33282c[i11]).getClass();
                    iM12048D = C11048j.m12055o(i13);
                }
            } else {
                iM12048D = C11048j.m12051k(i13, (C11042g) this.f33282c[i11]);
            }
            iM11973b = iM12048D + iM11973b;
        }
        this.f33283d = iM11973b;
        return iM11973b;
    }

    /* JADX INFO: renamed from: c */
    public final void m11974c(int i10, Object obj) {
        if (!this.f33284e) {
            throw new UnsupportedOperationException();
        }
        m11972a(this.f33280a + 1);
        int[] iArr = this.f33281b;
        int i11 = this.f33280a;
        iArr[i11] = i10;
        this.f33282c[i11] = obj;
        this.f33280a = i11 + 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m11975d(C11012H c11012h) {
        if (this.f33280a == 0) {
            return;
        }
        c11012h.getClass();
        for (int i10 = 0; i10 < this.f33280a; i10++) {
            int i11 = this.f33281b[i10];
            Object obj = this.f33282c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                c11012h.m11862j(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                c11012h.m11858f(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                c11012h.m11854b(i12, (C11042g) obj);
            } else if (i13 == 3) {
                C11048j c11048j = (C11048j) c11012h.f33240a;
                c11048j.m12079R(i12, 3);
                ((C11029Z) obj).m11975d(c11012h);
                c11048j.m12079R(i12, 4);
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(C11005A.m11844b());
                }
                c11012h.m11857e(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C11029Z)) {
            return false;
        }
        C11029Z c11029z = (C11029Z) obj;
        int i10 = this.f33280a;
        if (i10 == c11029z.f33280a) {
            int[] iArr = this.f33281b;
            int[] iArr2 = c11029z.f33281b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f33282c;
            Object[] objArr2 = c11029z.f33282c;
            int i12 = this.f33280a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f33280a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f33281b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f33282c;
        int i15 = this.f33280a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
