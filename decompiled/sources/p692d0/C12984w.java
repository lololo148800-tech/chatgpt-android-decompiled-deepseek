package p692d0;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p714e0.AbstractC13253a;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: d0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C12984w {

    /* JADX INFO: renamed from: a */
    public long[] f41215a = AbstractC12957J.f41150a;

    /* JADX INFO: renamed from: b */
    public long[] f41216b = AbstractC12976o.f41186a;

    /* JADX INFO: renamed from: c */
    public int[] f41217c = AbstractC12973l.f41183a;

    /* JADX INFO: renamed from: d */
    public int f41218d;

    /* JADX INFO: renamed from: e */
    public int f41219e;

    /* JADX INFO: renamed from: f */
    public int f41220f;

    public C12984w(int i10) {
        if (i10 >= 0) {
            m14706c(AbstractC12957J.m14640f(i10));
        } else {
            AbstractC13253a.m14850c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m14704a(int i10) {
        int i11 = this.f41218d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f41215a;
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

    /* JADX INFO: renamed from: b */
    public final int m14705b(long j10) {
        int iNumberOfTrailingZeros;
        int i10 = ((int) ((j10 >>> 32) ^ j10)) * (-862048943);
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & 127;
        int i13 = this.f41218d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f41215a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (((long) i12) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.f41216b[iNumberOfTrailingZeros] == j10) {
                    break loop0;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f41217c[iNumberOfTrailingZeros];
        }
        throw new NoSuchElementException(AbstractC10763a.m11049g(j10, "Cannot find value for key "));
    }

    /* JADX INFO: renamed from: c */
    public final void m14706c(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, AbstractC12957J.m14639e(i10)) : 0;
        this.f41218d = iMax;
        if (iMax == 0) {
            jArr = AbstractC12957J.f41150a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC17678l.m19313t(jArr);
        }
        this.f41215a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f41220f = AbstractC12957J.m14637c(this.f41218d) - this.f41219e;
        this.f41216b = new long[iMax];
        this.f41217c = new int[iMax];
    }

    /* JADX INFO: renamed from: d */
    public final void m14707d(int i10, long j10) {
        long j11;
        int i11;
        int i12;
        long[] jArr;
        int i13;
        char c9 = ' ';
        int i14 = -862048943;
        int i15 = ((int) (j10 ^ (j10 >>> 32))) * (-862048943);
        int i16 = i15 ^ (i15 << 16);
        int i17 = i16 >>> 7;
        int i18 = i16 & 127;
        int i19 = this.f41218d;
        int i20 = i17 & i19;
        int i21 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f41215a;
            int i22 = i20 >> 3;
            int i23 = (i20 & 7) << 3;
            int i24 = i21;
            long j12 = (((-i23) >> 63) & (jArr2[i22 + 1] << (64 - i23))) | (jArr2[i22] >>> i23);
            long j13 = i18;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            for (long j15 = (j14 - 72340172838076673L) & (~j14) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int iNumberOfTrailingZeros = (i20 + (Long.numberOfTrailingZeros(j15) >> 3)) & i19;
                if (this.f41216b[iNumberOfTrailingZeros] == j10) {
                    i12 = iNumberOfTrailingZeros;
                    break loop0;
                }
            }
            if ((j12 & ((~j12) << 6) & (-9187201950435737472L)) != 0) {
                int iM14704a = m14704a(i17);
                long j16 = 128;
                long j17 = 255;
                if (this.f41220f != 0 || ((this.f41215a[iM14704a >> 3] >> ((iM14704a & 7) << 3)) & 255) == 254) {
                    j11 = j13;
                    i11 = 0;
                } else {
                    int i25 = this.f41218d;
                    if (i25 > 8) {
                        j11 = j13;
                        if (Long.compare((((long) this.f41219e) * 32) ^ Long.MIN_VALUE, (((long) i25) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f41215a;
                            int i26 = this.f41218d;
                            long[] jArr4 = this.f41216b;
                            int[] iArr = this.f41217c;
                            AbstractC12957J.m14635a(jArr3, i26);
                            int i27 = -1;
                            int i28 = 0;
                            while (i28 != i26) {
                                int i29 = i28 >> 3;
                                int i30 = (i28 & 7) << 3;
                                long j18 = (jArr3[i29] >> i30) & 255;
                                if (j18 == j16) {
                                    int i31 = i28;
                                    i28++;
                                    i27 = i31;
                                } else if (j18 != 254) {
                                    i28++;
                                } else {
                                    long j19 = jArr4[i28];
                                    int i32 = ((int) (j19 ^ (j19 >>> c9))) * i14;
                                    int i33 = i32 ^ (i32 << 16);
                                    int i34 = i33 >>> 7;
                                    int iM14704a2 = m14704a(i34);
                                    int i35 = i34 & i26;
                                    if (((iM14704a2 - i35) & i26) / 8 == ((i28 - i35) & i26) / 8) {
                                        jArr3[i29] = (((long) (i33 & 127)) << i30) | (jArr3[i29] & (~(255 << i30)));
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i28++;
                                        i27 = i27;
                                    } else {
                                        int i36 = i27;
                                        int i37 = i28;
                                        int i38 = iM14704a2 >> 3;
                                        long j20 = jArr3[i38];
                                        int i39 = (iM14704a2 & 7) << 3;
                                        if (((j20 >> i39) & 255) == 128) {
                                            jArr3[i38] = (j20 & (~(255 << i39))) | (((long) (i33 & 127)) << i39);
                                            jArr3[i29] = (jArr3[i29] & (~(255 << i30))) | (128 << i30);
                                            jArr4[iM14704a2] = jArr4[i37];
                                            jArr4[i37] = 0;
                                            iArr[iM14704a2] = iArr[i37];
                                            iArr[i37] = 0;
                                            jArr = jArr3;
                                            i13 = i37;
                                        } else {
                                            long j21 = i33 & 127;
                                            jArr = jArr3;
                                            jArr[i38] = (j20 & (~(255 << i39))) | (j21 << i39);
                                            int iM14636b = i36 == -1 ? AbstractC12957J.m14636b(jArr, i37 + 1, i26) : i36;
                                            jArr4[iM14636b] = jArr4[iM14704a2];
                                            jArr4[iM14704a2] = jArr4[i37];
                                            jArr4[i37] = jArr4[iM14636b];
                                            iArr[iM14636b] = iArr[iM14704a2];
                                            iArr[iM14704a2] = iArr[i37];
                                            iArr[i37] = iArr[iM14636b];
                                            i13 = i37 - 1;
                                            i37 = iM14636b;
                                        }
                                        jArr[jArr.length - 1] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i28 = i13 + 1;
                                        jArr3 = jArr;
                                        i27 = i37;
                                        i17 = i17;
                                        c9 = ' ';
                                    }
                                    i14 = -862048943;
                                    j16 = 128;
                                }
                            }
                            i17 = i17;
                            i11 = 0;
                            this.f41220f = AbstractC12957J.m14637c(this.f41218d) - this.f41219e;
                        }
                        iM14704a = m14704a(i17);
                    } else {
                        j11 = j13;
                    }
                    i11 = 0;
                    int iM14638d = AbstractC12957J.m14638d(this.f41218d);
                    long[] jArr5 = this.f41215a;
                    long[] jArr6 = this.f41216b;
                    int[] iArr2 = this.f41217c;
                    int i40 = this.f41218d;
                    m14706c(iM14638d);
                    long[] jArr7 = this.f41215a;
                    long[] jArr8 = this.f41216b;
                    int[] iArr3 = this.f41217c;
                    int i41 = this.f41218d;
                    int i42 = 0;
                    while (i42 < i40) {
                        if (((jArr5[i42 >> 3] >> ((i42 & 7) << 3)) & j17) < 128) {
                            long j22 = jArr6[i42];
                            int i43 = ((int) (j22 ^ (j22 >>> 32))) * (-862048943);
                            int i44 = i43 ^ (i43 << 16);
                            int iM14704a3 = m14704a(i44 >>> 7);
                            long j23 = i44 & 127;
                            int i45 = iM14704a3 >> 3;
                            int i46 = (iM14704a3 & 7) << 3;
                            long j24 = (jArr7[i45] & (~(255 << i46))) | (j23 << i46);
                            jArr7[i45] = j24;
                            jArr7[(((iM14704a3 - 7) & i41) + (i41 & 7)) >> 3] = j24;
                            jArr8[iM14704a3] = j22;
                            iArr3[iM14704a3] = iArr2[i42];
                        }
                        i42++;
                        j17 = 255;
                    }
                    iM14704a = m14704a(i17);
                }
                this.f41219e++;
                int i47 = this.f41220f;
                long[] jArr9 = this.f41215a;
                int i48 = iM14704a >> 3;
                long j25 = jArr9[i48];
                int i49 = (iM14704a & 7) << 3;
                this.f41220f = i47 - (((j25 >> i49) & 255) != 128 ? i11 : 1);
                int i50 = this.f41218d;
                long j26 = (j25 & (~(255 << i49))) | (j11 << i49);
                jArr9[i48] = j26;
                jArr9[(((iM14704a - 7) & i50) + (i50 & 7)) >> 3] = j26;
                i12 = ~iM14704a;
                break;
            }
            i21 = i24 + 8;
            i20 = (i20 + i21) & i19;
            c9 = ' ';
            i14 = -862048943;
        }
        if (i12 < 0) {
            i12 = ~i12;
        }
        this.f41216b[i12] = j10;
        this.f41217c[i12] = i10;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0063 A[LOOP:0: B:14:0x0023->B:28:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0066 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12984w)) {
            return false;
        }
        C12984w c12984w = (C12984w) obj;
        if (c12984w.f41219e != this.f41219e) {
            return false;
        }
        long[] jArr = this.f41216b;
        int[] iArr = this.f41217c;
        long[] jArr2 = this.f41215a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr2[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i10 << 3) + i13;
                            if (iArr[i14] != c12984w.m14705b(jArr[i14])) {
                                return false;
                            }
                            i11 = 8;
                        }
                        j10 >>= i11;
                    }
                    if (i12 == i11) {
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

    public final int hashCode() {
        long[] jArr = this.f41216b;
        int[] iArr = this.f41217c;
        long[] jArr2 = this.f41215a;
        int length = jArr2.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j10 = jArr2[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j10) < 128) {
                            int i15 = (i11 << 3) + i14;
                            long j11 = jArr[i15];
                            i12 += iArr[i15] ^ ((int) (j11 ^ (j11 >>> 32)));
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

    public final String toString() {
        int i10;
        int i11;
        if (this.f41219e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        long[] jArr = this.f41216b;
        int[] iArr = this.f41217c;
        long[] jArr2 = this.f41215a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                long j10 = jArr2[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j10) < 128) {
                            int i16 = (i12 << 3) + i15;
                            i11 = i12;
                            long j11 = jArr[i16];
                            int i17 = iArr[i16];
                            sb2.append(j11);
                            sb2.append(Separators.EQUALS);
                            sb2.append(i17);
                            i13++;
                            if (i13 < this.f41219e) {
                                sb2.append(", ");
                            }
                        } else {
                            i11 = i12;
                        }
                        j10 >>= 8;
                        i15++;
                        i12 = i11;
                    }
                    int i18 = i12;
                    if (i14 != 8) {
                        break;
                    }
                    i10 = i18;
                } else {
                    i10 = i12;
                }
                if (i10 == length) {
                    break;
                }
                i12 = i10 + 1;
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "s.append('}').toString()");
        return string;
    }
}
