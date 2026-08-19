package p692d0;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p714e0.AbstractC13253a;
import p882m1.clb.WGTYqNchEpHca;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: d0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C12985x {

    /* JADX INFO: renamed from: a */
    public long[] f41221a;

    /* JADX INFO: renamed from: b */
    public long[] f41222b;

    /* JADX INFO: renamed from: c */
    public Object[] f41223c;

    /* JADX INFO: renamed from: d */
    public int f41224d;

    /* JADX INFO: renamed from: e */
    public int f41225e;

    /* JADX INFO: renamed from: f */
    public int f41226f;

    public C12985x(int i10) {
        this.f41221a = AbstractC12957J.f41150a;
        this.f41222b = AbstractC12976o.f41186a;
        this.f41223c = AbstractC13253a.f41867c;
        if (i10 >= 0) {
            m14713f(AbstractC12957J.m14640f(i10));
        } else {
            AbstractC13253a.m14850c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m14708a(long j10) {
        int iNumberOfTrailingZeros;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * (-862048943);
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & 127;
        int i13 = this.f41224d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f41221a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (((long) i12) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.f41222b[iNumberOfTrailingZeros] == j10) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m14709b(long j10) {
        int iNumberOfTrailingZeros;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * (-862048943);
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & 127;
        int i13 = this.f41224d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f41221a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (((long) i12) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.f41222b[iNumberOfTrailingZeros] == j10) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m14710c(long j10) {
        long j11;
        int i10;
        long[] jArr;
        int i11;
        char c9 = ' ';
        int i12 = -862048943;
        int i13 = ((int) (j10 ^ (j10 >>> 32))) * (-862048943);
        int i14 = i13 ^ (i13 << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f41224d;
        int i18 = i15 & i17;
        int i19 = 0;
        while (true) {
            long[] jArr2 = this.f41221a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            int i22 = i19;
            long j12 = (((-i21) >> 63) & (jArr2[i20 + 1] << (64 - i21))) | (jArr2[i20] >>> i21);
            long j13 = i16;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            for (long j15 = (j14 - 72340172838076673L) & (~j14) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j15) >> 3)) & i17;
                if (this.f41222b[iNumberOfTrailingZeros] == j10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j12 & ((~j12) << 6) & (-9187201950435737472L)) != 0) {
                int iM14711d = m14711d(i15);
                long j16 = 128;
                long j17 = 255;
                if (this.f41226f != 0 || ((this.f41221a[iM14711d >> 3] >> ((iM14711d & 7) << 3)) & 255) == 254) {
                    j11 = j13;
                    i10 = 0;
                } else {
                    int i23 = this.f41224d;
                    if (i23 > 8) {
                        j11 = j13;
                        if (Long.compare((((long) this.f41225e) * 32) ^ Long.MIN_VALUE, (((long) i23) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f41221a;
                            int i24 = this.f41224d;
                            long[] jArr4 = this.f41222b;
                            Object[] objArr = this.f41223c;
                            AbstractC12957J.m14635a(jArr3, i24);
                            int i25 = -1;
                            int i26 = 0;
                            while (i26 != i24) {
                                int i27 = i26 >> 3;
                                int i28 = (i26 & 7) << 3;
                                long j18 = (jArr3[i27] >> i28) & 255;
                                if (j18 == j16) {
                                    int i29 = i26;
                                    i26++;
                                    i25 = i29;
                                } else if (j18 != 254) {
                                    i26++;
                                } else {
                                    long j19 = jArr4[i26];
                                    int i30 = ((int) (j19 ^ (j19 >>> c9))) * i12;
                                    int i31 = i30 ^ (i30 << 16);
                                    int i32 = i31 >>> 7;
                                    int iM14711d2 = m14711d(i32);
                                    int i33 = i32 & i24;
                                    if (((iM14711d2 - i33) & i24) / 8 == ((i26 - i33) & i24) / 8) {
                                        jArr3[i27] = (((long) (i31 & 127)) << i28) | (jArr3[i27] & (~(255 << i28)));
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i26++;
                                        i25 = i25;
                                    } else {
                                        int i34 = i25;
                                        int i35 = i26;
                                        int i36 = iM14711d2 >> 3;
                                        long j20 = jArr3[i36];
                                        int i37 = (iM14711d2 & 7) << 3;
                                        if (((j20 >> i37) & 255) == 128) {
                                            jArr3[i36] = (j20 & (~(255 << i37))) | (((long) (i31 & 127)) << i37);
                                            jArr3[i27] = (jArr3[i27] & (~(255 << i28))) | (128 << i28);
                                            jArr4[iM14711d2] = jArr4[i35];
                                            jArr4[i35] = 0;
                                            objArr[iM14711d2] = objArr[i35];
                                            objArr[i35] = null;
                                            jArr = jArr3;
                                            i11 = i35;
                                        } else {
                                            long j21 = i31 & 127;
                                            jArr = jArr3;
                                            jArr[i36] = (j20 & (~(255 << i37))) | (j21 << i37);
                                            int iM14636b = i34 == -1 ? AbstractC12957J.m14636b(jArr, i35 + 1, i24) : i34;
                                            jArr4[iM14636b] = jArr4[iM14711d2];
                                            jArr4[iM14711d2] = jArr4[i35];
                                            jArr4[i35] = jArr4[iM14636b];
                                            objArr[iM14636b] = objArr[iM14711d2];
                                            objArr[iM14711d2] = objArr[i35];
                                            objArr[i35] = objArr[iM14636b];
                                            i11 = i35 - 1;
                                            i35 = iM14636b;
                                        }
                                        jArr[jArr.length - 1] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i26 = i11 + 1;
                                        jArr3 = jArr;
                                        i25 = i35;
                                        i15 = i15;
                                        c9 = ' ';
                                    }
                                    i12 = -862048943;
                                    j16 = 128;
                                }
                            }
                            i15 = i15;
                            i10 = 0;
                            this.f41226f = AbstractC12957J.m14637c(this.f41224d) - this.f41225e;
                        }
                        iM14711d = m14711d(i15);
                    } else {
                        j11 = j13;
                    }
                    i10 = 0;
                    int iM14638d = AbstractC12957J.m14638d(this.f41224d);
                    long[] jArr5 = this.f41221a;
                    long[] jArr6 = this.f41222b;
                    Object[] objArr2 = this.f41223c;
                    int i38 = this.f41224d;
                    m14713f(iM14638d);
                    long[] jArr7 = this.f41221a;
                    long[] jArr8 = this.f41222b;
                    Object[] objArr3 = this.f41223c;
                    int i39 = this.f41224d;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr5[i40 >> 3] >> ((i40 & 7) << 3)) & j17) < 128) {
                            long j22 = jArr6[i40];
                            int i41 = ((int) (j22 ^ (j22 >>> 32))) * (-862048943);
                            int i42 = i41 ^ (i41 << 16);
                            int iM14711d3 = m14711d(i42 >>> 7);
                            long j23 = i42 & 127;
                            int i43 = iM14711d3 >> 3;
                            int i44 = (iM14711d3 & 7) << 3;
                            long j24 = (jArr7[i43] & (~(255 << i44))) | (j23 << i44);
                            jArr7[i43] = j24;
                            jArr7[(((iM14711d3 - 7) & i39) + (i39 & 7)) >> 3] = j24;
                            jArr8[iM14711d3] = j22;
                            objArr3[iM14711d3] = objArr2[i40];
                        }
                        i40++;
                        j17 = 255;
                    }
                    iM14711d = m14711d(i15);
                }
                this.f41225e++;
                int i45 = this.f41226f;
                long[] jArr9 = this.f41221a;
                int i46 = iM14711d >> 3;
                long j25 = jArr9[i46];
                int i47 = (iM14711d & 7) << 3;
                this.f41226f = i45 - (((j25 >> i47) & 255) != 128 ? i10 : 1);
                int i48 = this.f41224d;
                long j26 = (j25 & (~(255 << i47))) | (j11 << i47);
                jArr9[i46] = j26;
                jArr9[(((iM14711d - 7) & i48) + (i48 & 7)) >> 3] = j26;
                return iM14711d;
            }
            i19 = i22 + 8;
            i18 = (i18 + i19) & i17;
            c9 = ' ';
            i12 = -862048943;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m14711d(int i10) {
        int i11 = this.f41224d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f41221a;
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
    public final Object m14712e(long j10) {
        int iNumberOfTrailingZeros;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * (-862048943);
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & 127;
        int i13 = this.f41224d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f41221a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (((long) i12) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.f41222b[iNumberOfTrailingZeros] == j10) {
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
            return this.f41223c[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0076 A[LOOP:0: B:14:0x0023->B:35:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0079 A[EDGE_INSN: B:38:0x0079->B:36:0x0079 BREAK  A[LOOP:0: B:14:0x0023->B:35:0x0076], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12985x)) {
            return false;
        }
        C12985x c12985x = (C12985x) obj;
        if (c12985x.f41225e != this.f41225e) {
            return false;
        }
        long[] jArr = this.f41222b;
        Object[] objArr = this.f41223c;
        long[] jArr2 = this.f41221a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr2[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i10 << 3) + i13;
                            long j11 = jArr[i14];
                            Object obj2 = objArr[i14];
                            if (obj2 == null) {
                                if (c12985x.m14712e(j11) != null || !c12985x.m14709b(j11)) {
                                    return false;
                                }
                            } else if (!obj2.equals(c12985x.m14712e(j11))) {
                                return false;
                            }
                            i11 = 8;
                        }
                        j10 >>= i11;
                    }
                    if (i12 != i11) {
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
    public final void m14713f(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, AbstractC12957J.m14639e(i10)) : 0;
        this.f41224d = iMax;
        if (iMax == 0) {
            jArr = AbstractC12957J.f41150a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC17678l.m19313t(jArr);
        }
        this.f41221a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f41226f = AbstractC12957J.m14637c(this.f41224d) - this.f41225e;
        this.f41222b = new long[iMax];
        this.f41223c = new Object[iMax];
    }

    public final int hashCode() {
        long[] jArr = this.f41222b;
        Object[] objArr = this.f41223c;
        long[] jArr2 = this.f41221a;
        int length = jArr2.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int iHashCode = 0;
            while (true) {
                long j10 = jArr2[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            long j11 = jArr[i14];
                            Object obj = objArr[i14];
                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ ((int) (j11 ^ (j11 >>> 32)));
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

    public final String toString() {
        int i10;
        int i11;
        if (this.f41225e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(WGTYqNchEpHca.ISFlYasnStiUx);
        long[] jArr = this.f41222b;
        Object[] objArr = this.f41223c;
        long[] jArr2 = this.f41221a;
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
                            Object obj = objArr[i16];
                            sb2.append(j11);
                            sb2.append(Separators.EQUALS);
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            i13++;
                            if (i13 < this.f41225e) {
                                sb2.append(", ");
                            }
                        } else {
                            i11 = i12;
                        }
                        j10 >>= 8;
                        i15++;
                        i12 = i11;
                    }
                    int i17 = i12;
                    if (i14 != 8) {
                        break;
                    }
                    i10 = i17;
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

    public /* synthetic */ C12985x() {
        this(6);
    }
}
