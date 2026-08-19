package p692d0;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p714e0.AbstractC13253a;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: d0.C */
/* JADX INFO: loaded from: classes.dex */
public final class C12950C {

    /* JADX INFO: renamed from: a */
    public long[] f41117a = AbstractC12957J.f41150a;

    /* JADX INFO: renamed from: b */
    public Object[] f41118b = AbstractC13253a.f41867c;

    /* JADX INFO: renamed from: c */
    public long[] f41119c = AbstractC12976o.f41186a;

    /* JADX INFO: renamed from: d */
    public int f41120d;

    /* JADX INFO: renamed from: e */
    public int f41121e;

    /* JADX INFO: renamed from: f */
    public int f41122f;

    public C12950C(int i10) {
        if (i10 >= 0) {
            m14613d(AbstractC12957J.m14640f(i10));
        } else {
            AbstractC13253a.m14850c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m14610a(int i10) {
        int i11 = this.f41120d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f41117a;
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
    public final int m14611b(Object obj) {
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f41120d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f41117a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (AbstractC16544l.m18089b(this.f41118b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m14612c(Object obj) {
        int iM14611b = m14611b(obj);
        if (iM14611b >= 0) {
            return this.f41119c[iM14611b];
        }
        throw new NoSuchElementException(AbstractC12107L1.m13824o(obj, "There is no key ", " in the map"));
    }

    /* JADX INFO: renamed from: d */
    public final void m14613d(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, AbstractC12957J.m14639e(i10)) : 0;
        this.f41120d = iMax;
        if (iMax == 0) {
            jArr = AbstractC12957J.f41150a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC17678l.m19313t(jArr);
        }
        this.f41117a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f41122f = AbstractC12957J.m14637c(this.f41120d) - this.f41121e;
        this.f41118b = new Object[iMax];
        this.f41119c = new long[iMax];
    }

    /* JADX INFO: renamed from: e */
    public final void m14614e(long j10, Object obj) {
        long j11;
        int i10;
        int i11;
        long[] jArr;
        int i12;
        C12950C c12950c = this;
        int i13 = -862048943;
        int iHashCode = obj.hashCode() * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = c12950c.f41120d;
        int i18 = i15 & i17;
        int i19 = 0;
        loop0: while (true) {
            long[] jArr2 = c12950c.f41117a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            int i22 = i19;
            long j12 = (((-i21) >> 63) & (jArr2[i20 + 1] << (64 - i21))) | (jArr2[i20] >>> i21);
            long j13 = i16;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            for (long j15 = (j14 - 72340172838076673L) & (~j14) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j15) >> 3)) & i17;
                if (AbstractC16544l.m18089b(c12950c.f41118b[iNumberOfTrailingZeros], obj)) {
                    c12950c = c12950c;
                    i11 = iNumberOfTrailingZeros;
                    break loop0;
                }
            }
            if ((j12 & ((~j12) << 6) & (-9187201950435737472L)) != 0) {
                int iM14610a = c12950c.m14610a(i15);
                long j16 = 128;
                long j17 = 255;
                if (c12950c.f41122f != 0 || ((c12950c.f41117a[iM14610a >> 3] >> ((iM14610a & 7) << 3)) & 255) == 254) {
                    c12950c = c12950c;
                    j11 = j13;
                    i10 = 0;
                } else {
                    int i23 = c12950c.f41120d;
                    if (i23 > 8) {
                        j11 = j13;
                        if (Long.compare((((long) c12950c.f41121e) * 32) ^ Long.MIN_VALUE, (((long) i23) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = c12950c.f41117a;
                            int i24 = c12950c.f41120d;
                            Object[] objArr = c12950c.f41118b;
                            long[] jArr4 = c12950c.f41119c;
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
                                    Object obj2 = objArr[i26];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                    int i30 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i31 = i30 >>> 7;
                                    int iM14610a2 = c12950c.m14610a(i31);
                                    int i32 = i31 & i24;
                                    if (((iM14610a2 - i32) & i24) / 8 == ((i26 - i32) & i24) / 8) {
                                        jArr3[i27] = (jArr3[i27] & (~(255 << i28))) | (((long) (i30 & 127)) << i28);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i26++;
                                        i25 = i25;
                                        i13 = -862048943;
                                    } else {
                                        int i33 = i25;
                                        int i34 = i26;
                                        int i35 = iM14610a2 >> 3;
                                        long j19 = jArr3[i35];
                                        int i36 = (iM14610a2 & 7) << 3;
                                        if (((j19 >> i36) & 255) == 128) {
                                            jArr3[i35] = (j19 & (~(255 << i36))) | (((long) (i30 & 127)) << i36);
                                            jArr3[i27] = (jArr3[i27] & (~(255 << i28))) | (128 << i28);
                                            objArr[iM14610a2] = objArr[i34];
                                            objArr[i34] = null;
                                            jArr4[iM14610a2] = jArr4[i34];
                                            jArr4[i34] = 0;
                                            i12 = i34;
                                            jArr = jArr4;
                                        } else {
                                            jArr = jArr4;
                                            jArr3[i35] = (((long) (i30 & 127)) << i36) | (j19 & (~(255 << i36)));
                                            int iM14636b = i33 == -1 ? AbstractC12957J.m14636b(jArr3, i34 + 1, i24) : i33;
                                            objArr[iM14636b] = objArr[iM14610a2];
                                            objArr[iM14610a2] = objArr[i34];
                                            objArr[i34] = objArr[iM14636b];
                                            jArr[iM14636b] = jArr[iM14610a2];
                                            jArr[iM14610a2] = jArr[i34];
                                            jArr[i34] = jArr[iM14636b];
                                            i12 = i34 - 1;
                                            i34 = iM14636b;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i26 = i12 + 1;
                                        i13 = -862048943;
                                        c12950c = this;
                                        i25 = i34;
                                        jArr4 = jArr;
                                    }
                                    j16 = 128;
                                }
                            }
                            c12950c = c12950c;
                            i10 = 0;
                            c12950c.f41122f = AbstractC12957J.m14637c(c12950c.f41120d) - c12950c.f41121e;
                        }
                        iM14610a = c12950c.m14610a(i15);
                    } else {
                        j11 = j13;
                    }
                    i10 = 0;
                    int iM14638d = AbstractC12957J.m14638d(c12950c.f41120d);
                    long[] jArr5 = c12950c.f41117a;
                    Object[] objArr2 = c12950c.f41118b;
                    long[] jArr6 = c12950c.f41119c;
                    int i37 = c12950c.f41120d;
                    c12950c.m14613d(iM14638d);
                    long[] jArr7 = c12950c.f41117a;
                    Object[] objArr3 = c12950c.f41118b;
                    long[] jArr8 = c12950c.f41119c;
                    int i38 = c12950c.f41120d;
                    int i39 = 0;
                    while (i39 < i37) {
                        if (((jArr5[i39 >> 3] >> ((i39 & 7) << 3)) & j17) < 128) {
                            Object obj3 = objArr2[i39];
                            int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * (-862048943);
                            int i40 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM14610a3 = c12950c.m14610a(i40 >>> 7);
                            long j20 = i40 & 127;
                            int i41 = iM14610a3 >> 3;
                            int i42 = (iM14610a3 & 7) << 3;
                            long j21 = (jArr7[i41] & (~(255 << i42))) | (j20 << i42);
                            jArr7[i41] = j21;
                            jArr7[(((iM14610a3 - 7) & i38) + (i38 & 7)) >> 3] = j21;
                            objArr3[iM14610a3] = obj3;
                            jArr8[iM14610a3] = jArr6[i39];
                        }
                        i39++;
                        jArr5 = jArr5;
                        objArr2 = objArr2;
                        j17 = 255;
                    }
                    iM14610a = c12950c.m14610a(i15);
                }
                c12950c.f41121e++;
                int i43 = c12950c.f41122f;
                long[] jArr9 = c12950c.f41117a;
                int i44 = iM14610a >> 3;
                long j22 = jArr9[i44];
                int i45 = (iM14610a & 7) << 3;
                c12950c.f41122f = i43 - (((j22 >> i45) & 255) != 128 ? i10 : 1);
                int i46 = c12950c.f41120d;
                long j23 = (j22 & (~(255 << i45))) | (j11 << i45);
                jArr9[i44] = j23;
                jArr9[(((iM14610a - 7) & i46) + (i46 & 7)) >> 3] = j23;
                i11 = ~iM14610a;
                break;
            }
            i19 = i22 + 8;
            i18 = (i18 + i19) & i17;
            c12950c = c12950c;
        }
        if (i11 < 0) {
            i11 = ~i11;
        }
        c12950c.f41118b[i11] = obj;
        c12950c.f41119c[i11] = j10;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[LOOP:0: B:14:0x0023->B:26:0x0060, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0063 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12950C)) {
            return false;
        }
        C12950C c12950c = (C12950C) obj;
        if (c12950c.f41121e != this.f41121e) {
            return false;
        }
        Object[] objArr = this.f41118b;
        long[] jArr = this.f41119c;
        long[] jArr2 = this.f41117a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr2[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (jArr[i13] != c12950c.m14612c(objArr[i13])) {
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

    public final int hashCode() {
        Object[] objArr = this.f41118b;
        long[] jArr = this.f41119c;
        long[] jArr2 = this.f41117a;
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
                            Object obj = objArr[i14];
                            long j11 = jArr[i14];
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
        if (this.f41121e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f41118b;
        long[] jArr = this.f41119c;
        long[] jArr2 = this.f41117a;
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
                            Object obj = objArr[i16];
                            i11 = i12;
                            long j11 = jArr[i16];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append(Separators.EQUALS);
                            sb2.append(j11);
                            i13++;
                            if (i13 < this.f41121e) {
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
}
