package p692d0;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: d0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C12980s {

    /* JADX INFO: renamed from: a */
    public long[] f41196a = AbstractC12957J.f41150a;

    /* JADX INFO: renamed from: b */
    public int[] f41197b;

    /* JADX INFO: renamed from: c */
    public int[] f41198c;

    /* JADX INFO: renamed from: d */
    public int f41199d;

    /* JADX INFO: renamed from: e */
    public int f41200e;

    /* JADX INFO: renamed from: f */
    public int f41201f;

    public C12980s() {
        int[] iArr = AbstractC12973l.f41183a;
        this.f41197b = iArr;
        this.f41198c = iArr;
        m14682f(AbstractC12957J.m14640f(6));
    }

    /* JADX INFO: renamed from: a */
    public final void m14677a() {
        this.f41200e = 0;
        long[] jArr = this.f41196a;
        if (jArr != AbstractC12957J.f41150a) {
            AbstractC17678l.m19313t(jArr);
            long[] jArr2 = this.f41196a;
            int i10 = this.f41199d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        this.f41201f = AbstractC12957J.m14637c(this.f41199d) - this.f41200e;
    }

    /* JADX INFO: renamed from: b */
    public final int m14678b(int i10) {
        int i11 = this.f41199d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f41196a;
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

    /* JADX INFO: renamed from: c */
    public final int m14679c(int i10) {
        int i11 = (-862048943) * i10;
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 & 127;
        int i14 = this.f41199d;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f41196a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j11 = (((long) i13) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i14;
                if (this.f41197b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m14680d(int i10) {
        int iM14679c = m14679c(i10);
        if (iM14679c >= 0) {
            return this.f41198c[iM14679c];
        }
        throw new NoSuchElementException(AbstractC10763a.m11048f(i10, "Cannot find value for key "));
    }

    /* JADX INFO: renamed from: e */
    public final int m14681e(int i10) {
        int iM14679c = m14679c(i10);
        if (iM14679c >= 0) {
            return this.f41198c[iM14679c];
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[LOOP:0: B:14:0x0023->B:26:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12980s)) {
            return false;
        }
        C12980s c12980s = (C12980s) obj;
        if (c12980s.f41200e != this.f41200e) {
            return false;
        }
        int[] iArr = this.f41197b;
        int[] iArr2 = this.f41198c;
        long[] jArr = this.f41196a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (iArr2[i13] != c12980s.m14680d(iArr[i13])) {
                                return false;
                            }
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
    public final void m14682f(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, AbstractC12957J.m14639e(i10)) : 0;
        this.f41199d = iMax;
        if (iMax == 0) {
            jArr = AbstractC12957J.f41150a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC17678l.m19313t(jArr);
        }
        this.f41196a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f41201f = AbstractC12957J.m14637c(this.f41199d) - this.f41200e;
        this.f41197b = new int[iMax];
        this.f41198c = new int[iMax];
    }

    /* JADX INFO: renamed from: g */
    public final void m14683g(int i10, int i11) {
        long j10;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        C12980s c12980s = this;
        int i15 = i10;
        int i16 = -862048943;
        int i17 = i15 * (-862048943);
        int i18 = i17 ^ (i17 << 16);
        int i19 = i18 >>> 7;
        int i20 = i18 & 127;
        int i21 = c12980s.f41199d;
        int i22 = i19 & i21;
        int i23 = 0;
        loop0: while (true) {
            long[] jArr = c12980s.f41196a;
            int i24 = i22 >> 3;
            int i25 = (i22 & 7) << 3;
            int i26 = i23;
            long j11 = (((-i25) >> 63) & (jArr[i24 + 1] << (64 - i25))) | (jArr[i24] >>> i25);
            long j12 = i20;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            for (long j14 = (j13 - 72340172838076673L) & (~j13) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = (i22 + (Long.numberOfTrailingZeros(j14) >> 3)) & i21;
                if (c12980s.f41197b[iNumberOfTrailingZeros] == i15) {
                    c12980s = c12980s;
                    i13 = iNumberOfTrailingZeros;
                    break loop0;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                int iM14678b = c12980s.m14678b(i19);
                long j15 = 128;
                long j16 = 255;
                if (c12980s.f41201f != 0 || ((c12980s.f41196a[iM14678b >> 3] >> ((iM14678b & 7) << 3)) & 255) == 254) {
                    c12980s = c12980s;
                    j10 = j12;
                    i12 = 0;
                } else {
                    int i27 = c12980s.f41199d;
                    if (i27 > 8) {
                        j10 = j12;
                        if (Long.compare((((long) c12980s.f41200e) * 32) ^ Long.MIN_VALUE, (((long) i27) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr2 = c12980s.f41196a;
                            int i28 = c12980s.f41199d;
                            int[] iArr2 = c12980s.f41197b;
                            int[] iArr3 = c12980s.f41198c;
                            AbstractC12957J.m14635a(jArr2, i28);
                            int i29 = -1;
                            int i30 = 0;
                            while (i30 != i28) {
                                int i31 = i30 >> 3;
                                int i32 = (i30 & 7) << 3;
                                long j17 = (jArr2[i31] >> i32) & 255;
                                if (j17 == j15) {
                                    int i33 = i30;
                                    i30++;
                                    i29 = i33;
                                } else if (j17 != 254) {
                                    i30++;
                                } else {
                                    int i34 = iArr2[i30] * i16;
                                    int i35 = i34 ^ (i34 << 16);
                                    int i36 = i35 >>> 7;
                                    int iM14678b2 = c12980s.m14678b(i36);
                                    int i37 = i36 & i28;
                                    if (((iM14678b2 - i37) & i28) / 8 == ((i30 - i37) & i28) / 8) {
                                        jArr2[i31] = (jArr2[i31] & (~(255 << i32))) | (((long) (i35 & 127)) << i32);
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i30++;
                                        i29 = i29;
                                        i16 = -862048943;
                                    } else {
                                        int i38 = i29;
                                        int i39 = i30;
                                        int i40 = iM14678b2 >> 3;
                                        long j18 = jArr2[i40];
                                        int i41 = (iM14678b2 & 7) << 3;
                                        if (((j18 >> i41) & 255) == 128) {
                                            jArr2[i40] = (j18 & (~(255 << i41))) | (((long) (i35 & 127)) << i41);
                                            jArr2[i31] = (jArr2[i31] & (~(255 << i32))) | (128 << i32);
                                            iArr2[iM14678b2] = iArr2[i39];
                                            iArr2[i39] = 0;
                                            iArr3[iM14678b2] = iArr3[i39];
                                            iArr3[i39] = 0;
                                            i14 = i39;
                                            iArr = iArr3;
                                        } else {
                                            iArr = iArr3;
                                            jArr2[i40] = (((long) (i35 & 127)) << i41) | (j18 & (~(255 << i41)));
                                            int iM14636b = i38 == -1 ? AbstractC12957J.m14636b(jArr2, i39 + 1, i28) : i38;
                                            iArr2[iM14636b] = iArr2[iM14678b2];
                                            iArr2[iM14678b2] = iArr2[i39];
                                            iArr2[i39] = iArr2[iM14636b];
                                            iArr[iM14636b] = iArr[iM14678b2];
                                            iArr[iM14678b2] = iArr[i39];
                                            iArr[i39] = iArr[iM14636b];
                                            i14 = i39 - 1;
                                            i39 = iM14636b;
                                        }
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i30 = i14 + 1;
                                        i16 = -862048943;
                                        c12980s = this;
                                        i29 = i39;
                                        iArr3 = iArr;
                                    }
                                    j15 = 128;
                                }
                            }
                            c12980s = c12980s;
                            i12 = 0;
                            c12980s.f41201f = AbstractC12957J.m14637c(c12980s.f41199d) - c12980s.f41200e;
                        }
                        iM14678b = c12980s.m14678b(i19);
                    } else {
                        j10 = j12;
                    }
                    i12 = 0;
                    int iM14638d = AbstractC12957J.m14638d(c12980s.f41199d);
                    long[] jArr3 = c12980s.f41196a;
                    int[] iArr4 = c12980s.f41197b;
                    int[] iArr5 = c12980s.f41198c;
                    int i42 = c12980s.f41199d;
                    c12980s.m14682f(iM14638d);
                    long[] jArr4 = c12980s.f41196a;
                    int[] iArr6 = c12980s.f41197b;
                    int[] iArr7 = c12980s.f41198c;
                    int i43 = c12980s.f41199d;
                    int i44 = 0;
                    while (i44 < i42) {
                        if (((jArr3[i44 >> 3] >> ((i44 & 7) << 3)) & j16) < 128) {
                            int i45 = iArr4[i44];
                            int i46 = i45 * (-862048943);
                            int i47 = i46 ^ (i46 << 16);
                            int iM14678b3 = c12980s.m14678b(i47 >>> 7);
                            int i48 = iM14678b3 >> 3;
                            int i49 = (iM14678b3 & 7) << 3;
                            long j19 = (jArr4[i48] & (~(255 << i49))) | (((long) (i47 & 127)) << i49);
                            jArr4[i48] = j19;
                            jArr4[(((iM14678b3 - 7) & i43) + (i43 & 7)) >> 3] = j19;
                            iArr6[iM14678b3] = i45;
                            iArr7[iM14678b3] = iArr5[i44];
                        }
                        i44++;
                        jArr3 = jArr3;
                        iArr4 = iArr4;
                        j16 = 255;
                    }
                    iM14678b = c12980s.m14678b(i19);
                }
                c12980s.f41200e++;
                int i50 = c12980s.f41201f;
                long[] jArr5 = c12980s.f41196a;
                int i51 = iM14678b >> 3;
                long j20 = jArr5[i51];
                int i52 = (iM14678b & 7) << 3;
                c12980s.f41201f = i50 - (((j20 >> i52) & 255) != 128 ? i12 : 1);
                int i53 = c12980s.f41199d;
                long j21 = (j20 & (~(255 << i52))) | (j10 << i52);
                jArr5[i51] = j21;
                jArr5[(((iM14678b - 7) & i53) + (i53 & 7)) >> 3] = j21;
                i13 = ~iM14678b;
                break;
            }
            i23 = i26 + 8;
            i22 = (i22 + i23) & i21;
            c12980s = c12980s;
            i16 = -862048943;
            i15 = i10;
        }
        if (i13 < 0) {
            i13 = ~i13;
        }
        c12980s.f41197b[i13] = i10;
        c12980s.f41198c[i13] = i11;
    }

    public final int hashCode() {
        int[] iArr = this.f41197b;
        int[] iArr2 = this.f41198c;
        long[] jArr = this.f41196a;
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
                            int i15 = (i11 << 3) + i14;
                            i12 += iArr2[i15] ^ iArr[i15];
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

    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[DONT_INVERT, PHI: r8
      0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0068 A[LOOP:0: B:9:0x001e->B:21:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x006b A[EDGE_INSN: B:25:0x006b->B:22:0x006b BREAK  A[LOOP:0: B:9:0x001e->B:21:0x0068], SYNTHETIC] */
    public final String toString() {
        if (this.f41200e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        int[] iArr = this.f41197b;
        int[] iArr2 = this.f41198c;
        long[] jArr = this.f41196a;
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
                            int i16 = iArr2[i14];
                            sb2.append(i15);
                            sb2.append(Separators.EQUALS);
                            sb2.append(i16);
                            i11++;
                            if (i11 < this.f41200e) {
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
}
