package p537W0;

/* JADX INFO: renamed from: W0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C8415g {

    /* JADX INFO: renamed from: a */
    public final int f26161a;

    /* JADX INFO: renamed from: b */
    public final long[] f26162b;

    /* JADX INFO: renamed from: c */
    public final Object[] f26163c;

    public C8415g(int i10, long[] jArr, Object[] objArr) {
        this.f26161a = i10;
        this.f26162b = jArr;
        this.f26163c = objArr;
    }

    /* JADX INFO: renamed from: a */
    public final int m8972a(long j10) {
        int i10 = this.f26161a - 1;
        if (i10 == -1) {
            return -1;
        }
        long[] jArr = this.f26162b;
        int i11 = 0;
        if (i10 == 0) {
            long j11 = jArr[0];
            if (j11 == j10) {
                return 0;
            }
            return j11 > j10 ? -2 : -1;
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            long j12 = jArr[i12] - j10;
            if (j12 < 0) {
                i11 = i12 + 1;
            } else {
                if (j12 <= 0) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: renamed from: b */
    public final C8415g m8973b(long j10, Object obj) {
        long[] jArr;
        int i10;
        Object[] objArr = this.f26163c;
        int i11 = 0;
        int i12 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i12++;
            }
        }
        int i13 = i12 + 1;
        long[] jArr2 = new long[i13];
        Object[] objArr2 = new Object[i13];
        if (i13 > 1) {
            int i14 = 0;
            while (true) {
                jArr = this.f26162b;
                i10 = this.f26161a;
                if (i11 >= i13 || i14 >= i10) {
                    break;
                }
                long j11 = jArr[i14];
                Object obj3 = objArr[i14];
                if (j11 > j10) {
                    jArr2[i11] = j10;
                    objArr2[i11] = obj;
                    i11++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i11] = j11;
                    objArr2[i11] = obj3;
                    i11++;
                }
                i14++;
            }
            if (i14 == i10) {
                jArr2[i12] = j10;
                objArr2[i12] = obj;
            } else {
                while (i11 < i13) {
                    long j12 = jArr[i14];
                    Object obj4 = objArr[i14];
                    if (obj4 != null) {
                        jArr2[i11] = j12;
                        objArr2[i11] = obj4;
                        i11++;
                    }
                    i14++;
                }
            }
        } else {
            jArr2[0] = j10;
            objArr2[0] = obj;
        }
        return new C8415g(i13, jArr2, objArr2);
    }
}
