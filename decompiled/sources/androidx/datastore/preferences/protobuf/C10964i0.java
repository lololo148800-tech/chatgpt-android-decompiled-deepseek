package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10964i0 {

    /* JADX INFO: renamed from: f */
    public static final C10964i0 f33059f = new C10964i0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f33060a;

    /* JADX INFO: renamed from: b */
    public int[] f33061b;

    /* JADX INFO: renamed from: c */
    public Object[] f33062c;

    /* JADX INFO: renamed from: d */
    public int f33063d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f33064e;

    public C10964i0(int i10, int[] iArr, Object[] objArr, boolean z6) {
        this.f33060a = i10;
        this.f33061b = iArr;
        this.f33062c = objArr;
        this.f33064e = z6;
    }

    /* JADX INFO: renamed from: b */
    public static C10964i0 m11664b() {
        return new C10964i0(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public final int m11665a() {
        int iM11629N;
        int i10 = this.f33063d;
        if (i10 != -1) {
            return i10;
        }
        int iM11665a = 0;
        for (int i11 = 0; i11 < this.f33060a; i11++) {
            int i12 = this.f33061b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                iM11629N = C10963i.m11629N(i13, ((Long) this.f33062c[i11]).longValue());
            } else if (i14 == 1) {
                ((Long) this.f33062c[i11]).getClass();
                iM11629N = C10963i.m11637y(i13);
            } else if (i14 != 2) {
                if (i14 == 3) {
                    iM11665a = ((C10964i0) this.f33062c[i11]).m11665a() + (C10963i.m11626K(i13) * 2) + iM11665a;
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(C10997z.m11727b());
                    }
                    ((Integer) this.f33062c[i11]).getClass();
                    iM11629N = C10963i.m11636x(i13);
                }
            } else {
                iM11629N = C10963i.m11632t(i13, (C10957f) this.f33062c[i11]);
            }
            iM11665a = iM11629N + iM11665a;
        }
        this.f33063d = iM11665a;
        return iM11665a;
    }

    /* JADX INFO: renamed from: c */
    public final void m11666c(int i10, Object obj) {
        if (!this.f33064e) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.f33060a;
        int[] iArr = this.f33061b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.f33061b = Arrays.copyOf(iArr, i12);
            this.f33062c = Arrays.copyOf(this.f33062c, i12);
        }
        int[] iArr2 = this.f33061b;
        int i13 = this.f33060a;
        iArr2[i13] = i10;
        this.f33062c[i13] = obj;
        this.f33060a = i13 + 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m11667d(C10930I c10930i) {
        if (this.f33060a == 0) {
            return;
        }
        c10930i.getClass();
        for (int i10 = 0; i10 < this.f33060a; i10++) {
            int i11 = this.f33061b[i10];
            Object obj = this.f33062c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                c10930i.m11449j(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                c10930i.m11445f(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                c10930i.m11441b(i12, (C10957f) obj);
            } else if (i13 == 3) {
                C10963i c10963i = (C10963i) c10930i.f32971a;
                c10963i.m11654e0(i12, 3);
                ((C10964i0) obj).m11667d(c10930i);
                c10963i.m11654e0(i12, 4);
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(C10997z.m11727b());
                }
                c10930i.m11444e(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C10964i0)) {
            return false;
        }
        C10964i0 c10964i0 = (C10964i0) obj;
        int i10 = this.f33060a;
        if (i10 == c10964i0.f33060a) {
            int[] iArr = this.f33061b;
            int[] iArr2 = c10964i0.f33061b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f33062c;
            Object[] objArr2 = c10964i0.f33062c;
            int i12 = this.f33060a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f33060a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f33061b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f33062c;
        int i15 = this.f33060a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
