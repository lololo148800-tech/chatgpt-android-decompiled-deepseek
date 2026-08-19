package p692d0;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p582Xk.HXHG.TfazcFv;
import p714e0.AbstractC13253a;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: d0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C12982u {

    /* JADX INFO: renamed from: a */
    public long[] f41204a;

    /* JADX INFO: renamed from: b */
    public int[] f41205b;

    /* JADX INFO: renamed from: c */
    public Object[] f41206c;

    /* JADX INFO: renamed from: d */
    public int f41207d;

    /* JADX INFO: renamed from: e */
    public int f41208e;

    /* JADX INFO: renamed from: f */
    public int f41209f;

    public C12982u(int i10) {
        this.f41204a = AbstractC12957J.f41150a;
        this.f41205b = AbstractC12973l.f41183a;
        this.f41206c = AbstractC13253a.f41867c;
        if (i10 >= 0) {
            m14695g(AbstractC12957J.m14640f(i10));
        } else {
            AbstractC13253a.m14850c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14689a() {
        this.f41208e = 0;
        long[] jArr = this.f41204a;
        if (jArr != AbstractC12957J.f41150a) {
            AbstractC17678l.m19313t(jArr);
            long[] jArr2 = this.f41204a;
            int i10 = this.f41207d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        AbstractC17678l.m19311r(this.f41206c, null, 0, this.f41207d);
        this.f41209f = AbstractC12957J.m14637c(this.f41207d) - this.f41208e;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m14690b(int i10) {
        int iNumberOfTrailingZeros;
        int i11 = (-862048943) * i10;
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 & 127;
        int i14 = this.f41207d;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f41204a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j11 = (((long) i13) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i14;
                if (this.f41205b[iNumberOfTrailingZeros] == i10) {
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

    /* JADX INFO: renamed from: c */
    public final boolean m14691c(int i10) {
        int iNumberOfTrailingZeros;
        int i11 = (-862048943) * i10;
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 & 127;
        int i14 = this.f41207d;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f41204a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j11 = (((long) i13) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i14;
                if (this.f41205b[iNumberOfTrailingZeros] == i10) {
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
    public final int m14692d(int i10) {
        long j10;
        int i11;
        int iM14636b;
        int i12;
        int i13;
        int i14 = -862048943;
        int i15 = i10 * (-862048943);
        int i16 = i15 ^ (i15 << 16);
        int i17 = i16 >>> 7;
        int i18 = i16 & 127;
        int i19 = this.f41207d;
        int i20 = i17 & i19;
        int i21 = 0;
        while (true) {
            long[] jArr = this.f41204a;
            int i22 = i20 >> 3;
            int i23 = (i20 & 7) << 3;
            int i24 = i21;
            long j11 = (((-i23) >> 63) & (jArr[i22 + 1] << (64 - i23))) | (jArr[i22] >>> i23);
            long j12 = i18;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            for (long j14 = (j13 - 72340172838076673L) & (~j13) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = (i20 + (Long.numberOfTrailingZeros(j14) >> 3)) & i19;
                if (this.f41205b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                int iM14693e = m14693e(i17);
                long j15 = 128;
                long j16 = 255;
                if (this.f41209f != 0 || ((this.f41204a[iM14693e >> 3] >> ((iM14693e & 7) << 3)) & 255) == 254) {
                    j10 = j12;
                } else {
                    int i25 = this.f41207d;
                    if (i25 > 8) {
                        j10 = j12;
                        if (Long.compare((((long) this.f41208e) * 32) ^ Long.MIN_VALUE, (((long) i25) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr2 = this.f41204a;
                            int i26 = this.f41207d;
                            int[] iArr = this.f41205b;
                            Object[] objArr = this.f41206c;
                            AbstractC12957J.m14635a(jArr2, i26);
                            int i27 = -1;
                            int i28 = 0;
                            while (i28 != i26) {
                                int i29 = i28 >> 3;
                                int i30 = (i28 & 7) << 3;
                                long j17 = (jArr2[i29] >> i30) & 255;
                                if (j17 == j15) {
                                    i27 = i28;
                                    i28++;
                                } else if (j17 != 254) {
                                    i28++;
                                } else {
                                    int i31 = iArr[i28] * i14;
                                    int i32 = i31 ^ (i31 << 16);
                                    int i33 = i32 >>> 7;
                                    int iM14693e2 = m14693e(i33);
                                    int i34 = i33 & i26;
                                    if (((iM14693e2 - i34) & i26) / 8 == ((i28 - i34) & i26) / 8) {
                                        jArr2[i29] = (jArr2[i29] & (~(255 << i30))) | (((long) (i32 & 127)) << i30);
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i28++;
                                        iArr = iArr;
                                    } else {
                                        int[] iArr2 = iArr;
                                        int i35 = i27;
                                        int i36 = iM14693e2 >> 3;
                                        long j18 = jArr2[i36];
                                        int i37 = (iM14693e2 & 7) << 3;
                                        if (((j18 >> i37) & 255) == 128) {
                                            i13 = i28;
                                            jArr2[i36] = ((~(255 << i37)) & j18) | (((long) (i32 & 127)) << i37);
                                            jArr2[i29] = (jArr2[i29] & (~(255 << i30))) | (128 << i30);
                                            iArr2[iM14693e2] = iArr2[i13];
                                            iArr2[i13] = 0;
                                            objArr[iM14693e2] = objArr[i13];
                                            objArr[i13] = null;
                                            i11 = i26;
                                            i12 = i13;
                                        } else {
                                            int i38 = i28;
                                            int i39 = i26;
                                            jArr2[i36] = ((~(255 << i37)) & j18) | (((long) (i32 & 127)) << i37);
                                            if (i35 == -1) {
                                                i11 = i39;
                                                iM14636b = AbstractC12957J.m14636b(jArr2, i38 + 1, i11);
                                            } else {
                                                i11 = i39;
                                                iM14636b = i35;
                                            }
                                            iArr2[iM14636b] = iArr2[iM14693e2];
                                            iArr2[iM14693e2] = iArr2[i38];
                                            iArr2[i38] = iArr2[iM14636b];
                                            objArr[iM14636b] = objArr[iM14693e2];
                                            objArr[iM14693e2] = objArr[i38];
                                            objArr[i38] = objArr[iM14636b];
                                            i12 = i38 - 1;
                                            i13 = iM14636b;
                                        }
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i28 = i12 + 1;
                                        i26 = i11;
                                        i27 = i13;
                                        iArr = iArr2;
                                        i17 = i17;
                                    }
                                    i14 = -862048943;
                                    j15 = 128;
                                }
                            }
                            i17 = i17;
                            this.f41209f = AbstractC12957J.m14637c(this.f41207d) - this.f41208e;
                        }
                        iM14693e = m14693e(i17);
                    } else {
                        j10 = j12;
                    }
                    int iM14638d = AbstractC12957J.m14638d(this.f41207d);
                    long[] jArr3 = this.f41204a;
                    int[] iArr3 = this.f41205b;
                    Object[] objArr2 = this.f41206c;
                    int i40 = this.f41207d;
                    m14695g(iM14638d);
                    long[] jArr4 = this.f41204a;
                    int[] iArr4 = this.f41205b;
                    Object[] objArr3 = this.f41206c;
                    int i41 = this.f41207d;
                    int i42 = 0;
                    while (i42 < i40) {
                        if (((jArr3[i42 >> 3] >> ((i42 & 7) << 3)) & j16) < 128) {
                            int i43 = iArr3[i42];
                            int i44 = i43 * (-862048943);
                            int i45 = i44 ^ (i44 << 16);
                            int iM14693e3 = m14693e(i45 >>> 7);
                            int i46 = iM14693e3 >> 3;
                            int i47 = (iM14693e3 & 7) << 3;
                            long j19 = (jArr4[i46] & (~(255 << i47))) | (((long) (i45 & 127)) << i47);
                            jArr4[i46] = j19;
                            jArr4[(((iM14693e3 - 7) & i41) + (i41 & 7)) >> 3] = j19;
                            iArr4[iM14693e3] = i43;
                            objArr3[iM14693e3] = objArr2[i42];
                        }
                        i42++;
                        jArr3 = jArr3;
                        iArr3 = iArr3;
                        j16 = 255;
                    }
                    iM14693e = m14693e(i17);
                }
                this.f41208e++;
                int i48 = this.f41209f;
                long[] jArr5 = this.f41204a;
                int i49 = iM14693e >> 3;
                long j20 = jArr5[i49];
                int i50 = (iM14693e & 7) << 3;
                this.f41209f = i48 - (((j20 >> i50) & 255) != 128 ? 0 : 1);
                int i51 = this.f41207d;
                long j21 = (j20 & (~(255 << i50))) | (j10 << i50);
                jArr5[i49] = j21;
                jArr5[(((iM14693e - 7) & i51) + (i51 & 7)) >> 3] = j21;
                return iM14693e;
            }
            i21 = i24 + 8;
            i20 = (i20 + i21) & i19;
            i17 = i17;
            i14 = i14;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m14693e(int i10) {
        int i11 = this.f41207d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f41204a;
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

    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[LOOP:0: B:14:0x0023->B:33:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[EDGE_INSN: B:35:0x0074->B:34:0x0074 BREAK  A[LOOP:0: B:14:0x0023->B:33:0x0071], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12982u)) {
            return false;
        }
        C12982u c12982u = (C12982u) obj;
        if (c12982u.f41208e != this.f41208e) {
            return false;
        }
        int[] iArr = this.f41205b;
        Object[] objArr = this.f41206c;
        long[] jArr = this.f41204a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            int i14 = iArr[i13];
                            Object obj2 = objArr[i13];
                            if (obj2 == null) {
                                if (c12982u.m14694f(i14) != null || !c12982u.m14691c(i14)) {
                                    return false;
                                }
                            } else if (!obj2.equals(c12982u.m14694f(i14))) {
                                return false;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final Object m14694f(int i10) {
        int iNumberOfTrailingZeros;
        int i11 = (-862048943) * i10;
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 & 127;
        int i14 = this.f41207d;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f41204a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j11 = (((long) i13) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i14;
                if (this.f41205b[iNumberOfTrailingZeros] == i10) {
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
        if (iNumberOfTrailingZeros >= 0) {
            return this.f41206c[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m14695g(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, AbstractC12957J.m14639e(i10)) : 0;
        this.f41207d = iMax;
        if (iMax == 0) {
            jArr = AbstractC12957J.f41150a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC17678l.m19313t(jArr);
        }
        this.f41204a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f41209f = AbstractC12957J.m14637c(this.f41207d) - this.f41208e;
        this.f41205b = new int[iMax];
        this.f41206c = new Object[iMax];
    }

    /* JADX INFO: renamed from: h */
    public final Object m14696h(int i10) {
        int iNumberOfTrailingZeros;
        int i11 = (-862048943) * i10;
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 & 127;
        int i14 = this.f41207d;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f41204a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j11 = (((long) i13) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i14;
                if (this.f41205b[iNumberOfTrailingZeros] == i10) {
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
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f41208e--;
        long[] jArr2 = this.f41204a;
        int i19 = this.f41207d;
        int i20 = iNumberOfTrailingZeros >> 3;
        int i21 = (iNumberOfTrailingZeros & 7) << 3;
        long j13 = (jArr2[i20] & (~(255 << i21))) | (254 << i21);
        jArr2[i20] = j13;
        jArr2[(((iNumberOfTrailingZeros - 7) & i19) + (i19 & 7)) >> 3] = j13;
        Object[] objArr = this.f41206c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    public final int hashCode() {
        int[] iArr = this.f41205b;
        Object[] objArr = this.f41206c;
        long[] jArr = this.f41204a;
        int length = jArr.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int iHashCode = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            int i15 = iArr[i14];
                            Object obj = objArr[i14];
                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ i15;
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return iHashCode;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    i10 = iHashCode;
                }
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: i */
    public final void m14697i(int i10, Object obj) {
        int iM14692d = m14692d(i10);
        this.f41205b[iM14692d] = i10;
        this.f41206c[iM14692d] = obj;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006b A[DONT_INVERT, PHI: r8
      0x006b: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002d, B:22:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006d A[LOOP:0: B:9:0x001f->B:24:0x006d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0070 A[EDGE_INSN: B:28:0x0070->B:25:0x0070 BREAK  A[LOOP:0: B:9:0x001f->B:24:0x006d], SYNTHETIC] */
    public final String toString() {
        if (this.f41208e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(TfazcFv.fZuUbVCFacGk);
        int[] iArr = this.f41205b;
        Object[] objArr = this.f41206c;
        long[] jArr = this.f41204a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i10 << 3) + i13;
                            int i15 = iArr[i14];
                            Object obj = objArr[i14];
                            sb2.append(i15);
                            sb2.append(Separators.EQUALS);
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            i11++;
                            if (i11 < this.f41208e) {
                                sb2.append(", ");
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "s.append('}').toString()");
        return string;
    }

    public /* synthetic */ C12982u() {
        this(6);
    }
}
