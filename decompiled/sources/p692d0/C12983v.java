package p692d0;

import kotlin.jvm.internal.AbstractC16544l;
import p714e0.AbstractC13253a;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: d0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C12983v {

    /* JADX INFO: renamed from: a */
    public long[] f41210a;

    /* JADX INFO: renamed from: b */
    public int[] f41211b;

    /* JADX INFO: renamed from: c */
    public int f41212c;

    /* JADX INFO: renamed from: d */
    public int f41213d;

    /* JADX INFO: renamed from: e */
    public int f41214e;

    public C12983v(int i10) {
        this.f41210a = AbstractC12957J.f41150a;
        this.f41211b = AbstractC12973l.f41183a;
        if (i10 >= 0) {
            m14702e(AbstractC12957J.m14640f(i10));
        } else {
            AbstractC13253a.m14850c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m14698a(int i10) {
        long j10;
        int iM14701d;
        boolean z6;
        int i11;
        int[] iArr;
        int i12;
        int i13 = i10;
        int i14 = this.f41213d;
        int i15 = i13 * (-862048943);
        int i16 = i15 ^ (i15 << 16);
        int i17 = i16 >>> 7;
        int i18 = i16 & 127;
        int i19 = this.f41212c;
        int i20 = i17 & i19;
        int i21 = 0;
        loop0: while (true) {
            long[] jArr = this.f41210a;
            int i22 = i20 >> 3;
            int i23 = (i20 & 7) << 3;
            int i24 = 1;
            int i25 = i21;
            long j11 = (((-i23) >> 63) & (jArr[i22 + 1] << (64 - i23))) | (jArr[i22] >>> i23);
            long j12 = i18;
            int i26 = i18;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                iM14701d = (i20 + (Long.numberOfTrailingZeros(j14) >> 3)) & i19;
                if (this.f41211b[iM14701d] == i13) {
                    i14 = i14;
                    z6 = true;
                    break loop0;
                }
            }
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iM14701d2 = m14701d(i17);
                if (this.f41214e != 0 || ((this.f41210a[iM14701d2 >> 3] >> ((iM14701d2 & 7) << 3)) & 255) == 254) {
                    i14 = i14;
                    j10 = j12;
                    iM14701d = iM14701d2;
                } else {
                    int i27 = this.f41212c;
                    if (i27 > 8) {
                        int i28 = i17;
                        if (Long.compare((((long) this.f41213d) * 32) ^ Long.MIN_VALUE, (((long) i27) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr2 = this.f41210a;
                            int i29 = this.f41212c;
                            int[] iArr2 = this.f41211b;
                            AbstractC12957J.m14635a(jArr2, i29);
                            int i30 = 0;
                            int iM14636b = -1;
                            while (i30 != i29) {
                                int i31 = i30 >> 3;
                                int i32 = (i30 & 7) << 3;
                                long j15 = (jArr2[i31] >> i32) & 255;
                                if (j15 == 128) {
                                    iM14636b = i30;
                                    i30++;
                                } else if (j15 != 254) {
                                    i30++;
                                } else {
                                    int i33 = iArr2[i30] * (-862048943);
                                    int i34 = i33 ^ (i33 << 16);
                                    int i35 = i34 >>> 7;
                                    int iM14701d3 = m14701d(i35);
                                    int i36 = i35 & i29;
                                    if (((iM14701d3 - i36) & i29) / 8 == ((i30 - i36) & i29) / 8) {
                                        jArr2[i31] = (((long) (i34 & 127)) << i32) | (jArr2[i31] & (~(255 << i32)));
                                        jArr2[jArr2.length - i24] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i30++;
                                        i14 = i14;
                                    } else {
                                        int i37 = i14;
                                        int i38 = iM14701d3 >> 3;
                                        long j16 = jArr2[i38];
                                        int i39 = (iM14701d3 & 7) << 3;
                                        if (((j16 >> i39) & 255) == 128) {
                                            jArr2[i38] = (((long) (i34 & 127)) << i39) | (j16 & (~(255 << i39)));
                                            jArr2[i31] = (jArr2[i31] & (~(255 << i32))) | (128 << i32);
                                            iArr2[iM14701d3] = iArr2[i30];
                                            iArr2[i30] = 0;
                                            iArr = iArr2;
                                            i12 = i37;
                                            iM14636b = i30;
                                        } else {
                                            iArr = iArr2;
                                            i12 = i37;
                                            jArr2[i38] = ((~(255 << i39)) & j16) | (((long) (i34 & 127)) << i39);
                                            if (iM14636b == -1) {
                                                iM14636b = AbstractC12957J.m14636b(jArr2, i30 + 1, i29);
                                            }
                                            iArr[iM14636b] = iArr[iM14701d3];
                                            iArr[iM14701d3] = iArr[i30];
                                            iArr[i30] = iArr[iM14636b];
                                            i30--;
                                        }
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i30++;
                                        i24 = 1;
                                        iArr2 = iArr;
                                        i14 = i12;
                                        i28 = i28;
                                    }
                                    j12 = j12;
                                }
                            }
                            i14 = i14;
                            i11 = i28;
                            j10 = j12;
                            this.f41214e = AbstractC12957J.m14637c(this.f41212c) - this.f41213d;
                        } else {
                            i11 = i28;
                        }
                        iM14701d = m14701d(i11);
                    } else {
                        i11 = i17;
                    }
                    j10 = j12;
                    int iM14638d = AbstractC12957J.m14638d(this.f41212c);
                    long[] jArr3 = this.f41210a;
                    int[] iArr3 = this.f41211b;
                    int i40 = this.f41212c;
                    m14702e(iM14638d);
                    long[] jArr4 = this.f41210a;
                    int[] iArr4 = this.f41211b;
                    int i41 = this.f41212c;
                    int i42 = 0;
                    while (i42 < i40) {
                        if (((jArr3[i42 >> 3] >> ((i42 & 7) << 3)) & 255) < 128) {
                            int i43 = iArr3[i42];
                            int i44 = i43 * (-862048943);
                            int i45 = i44 ^ (i44 << 16);
                            int iM14701d4 = m14701d(i45 >>> 7);
                            long j17 = i45 & 127;
                            int i46 = iM14701d4 >> 3;
                            int i47 = (iM14701d4 & 7) << 3;
                            long j18 = (jArr4[i46] & (~(255 << i47))) | (j17 << i47);
                            jArr4[i46] = j18;
                            jArr4[(((iM14701d4 - 7) & i41) + (i41 & 7)) >> 3] = j18;
                            iArr4[iM14701d4] = i43;
                        }
                        i42++;
                        jArr3 = jArr3;
                        iArr3 = iArr3;
                    }
                    iM14701d = m14701d(i11);
                }
                z6 = true;
                this.f41213d++;
                int i48 = this.f41214e;
                long[] jArr5 = this.f41210a;
                int i49 = iM14701d >> 3;
                long j19 = jArr5[i49];
                int i50 = (iM14701d & 7) << 3;
                this.f41214e = i48 - (((j19 >> i50) & 255) == 128 ? 1 : 0);
                int i51 = this.f41212c;
                long j20 = (j19 & (~(255 << i50))) | (j10 << i50);
                jArr5[i49] = j20;
                jArr5[(((iM14701d - 7) & i51) + (i51 & 7)) >> 3] = j20;
                break;
            }
            i21 = i25 + 8;
            i20 = (i20 + i21) & i19;
            i14 = i14;
            i18 = i26;
            i13 = i10;
        }
        this.f41211b[iM14701d] = i10;
        if (this.f41213d != i14) {
            return z6;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m14699b() {
        this.f41213d = 0;
        long[] jArr = this.f41210a;
        if (jArr != AbstractC12957J.f41150a) {
            AbstractC17678l.m19313t(jArr);
            long[] jArr2 = this.f41210a;
            int i10 = this.f41212c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        this.f41214e = AbstractC12957J.m14637c(this.f41212c) - this.f41213d;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m14700c(int i10) {
        int iNumberOfTrailingZeros;
        int i11 = (-862048943) * i10;
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 & 127;
        int i14 = this.f41212c;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f41210a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j11 = (((long) i13) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i14;
                if (this.f41211b[iNumberOfTrailingZeros] == i10) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m14701d(int i10) {
        int i11 = this.f41212c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f41210a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m14702e(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, AbstractC12957J.m14639e(i10)) : 0;
        this.f41212c = iMax;
        if (iMax == 0) {
            jArr = AbstractC12957J.f41150a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC17678l.m19313t(jArr);
        }
        this.f41210a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f41214e = AbstractC12957J.m14637c(this.f41212c) - this.f41213d;
        this.f41211b = new int[iMax];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12983v)) {
            return false;
        }
        C12983v c12983v = (C12983v) obj;
        if (c12983v.f41213d != this.f41213d) {
            return false;
        }
        int[] iArr = this.f41211b;
        long[] jArr = this.f41210a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && !c12983v.m14700c(iArr[(i10 << 3) + i12])) {
                            return false;
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m14703f(int i10) {
        this.f41213d--;
        long[] jArr = this.f41210a;
        int i11 = this.f41212c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
    }

    public final int hashCode() {
        int[] iArr = this.f41211b;
        long[] jArr = this.f41210a;
        int length = jArr.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j10) < 128) {
                            i12 += iArr[(i11 << 3) + i14];
                        }
                        j10 >>= 8;
                    }
                    if (i13 != 8) {
                        return i12;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    i10 = i12;
                }
            }
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d A[DONT_INVERT, PHI: r7
      0x005d: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f A[LOOP:0: B:5:0x0018->B:20:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[SYNTHETIC] */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f41211b;
        long[] jArr = this.f41210a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "]");
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        int i14 = iArr[(i10 << 3) + i13];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append(i14);
                        i11++;
                    }
                    j10 >>= 8;
                }
                if (i12 == 8) {
                    if (i10 == length) {
                        i10++;
                    }
                }
                sb2.append((CharSequence) "]");
                break;
            }
            if (i10 == length) {
                sb2.append((CharSequence) "]");
                break;
            }
            i10++;
        }
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public /* synthetic */ C12983v() {
        this(6);
    }
}
