package p692d0;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p714e0.AbstractC13253a;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: d0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C12987z {

    /* JADX INFO: renamed from: a */
    public long[] f41232a = AbstractC12957J.f41150a;

    /* JADX INFO: renamed from: b */
    public Object[] f41233b = AbstractC13253a.f41867c;

    /* JADX INFO: renamed from: c */
    public float[] f41234c = AbstractC12969h.f41179a;

    /* JADX INFO: renamed from: d */
    public int f41235d;

    /* JADX INFO: renamed from: e */
    public int f41236e;

    /* JADX INFO: renamed from: f */
    public int f41237f;

    public C12987z() {
        m14720d(AbstractC12957J.m14640f(6));
    }

    /* JADX INFO: renamed from: a */
    public final void m14717a() {
        this.f41236e = 0;
        long[] jArr = this.f41232a;
        if (jArr != AbstractC12957J.f41150a) {
            AbstractC17678l.m19313t(jArr);
            long[] jArr2 = this.f41232a;
            int i10 = this.f41235d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        AbstractC17678l.m19311r(this.f41233b, null, 0, this.f41235d);
        this.f41237f = AbstractC12957J.m14637c(this.f41235d) - this.f41236e;
    }

    /* JADX INFO: renamed from: b */
    public final int m14718b(int i10) {
        int i11 = this.f41235d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f41232a;
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
    public final int m14719c(Object obj) {
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f41235d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f41232a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (AbstractC16544l.m18089b(this.f41233b[iNumberOfTrailingZeros], obj)) {
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

    /* JADX INFO: renamed from: d */
    public final void m14720d(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, AbstractC12957J.m14639e(i10)) : 0;
        this.f41235d = iMax;
        if (iMax == 0) {
            jArr = AbstractC12957J.f41150a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC17678l.m19313t(jArr);
        }
        this.f41232a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f41237f = AbstractC12957J.m14637c(this.f41235d) - this.f41236e;
        this.f41233b = new Object[iMax];
        this.f41234c = new float[iMax];
    }

    /* JADX INFO: renamed from: e */
    public final void m14721e(Object obj, float f10) {
        C12987z c12987z;
        long j10;
        int i10;
        int i11;
        int i12;
        int iHashCode;
        float[] fArr;
        C12987z c12987z2 = this;
        Object obj2 = obj;
        int iHashCode2 = (obj2 != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = iHashCode2 ^ (iHashCode2 << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = c12987z2.f41235d;
        int i17 = i14 & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = c12987z2.f41232a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            long j11 = ((jArr[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr[i19] >>> i20);
            long j12 = i15;
            int i21 = i15;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j14) >> 3)) & i16;
                if (AbstractC16544l.m18089b(c12987z2.f41233b[iNumberOfTrailingZeros], obj2)) {
                    c12987z = c12987z2;
                    i10 = iNumberOfTrailingZeros;
                    break loop0;
                }
            }
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iM14718b = c12987z2.m14718b(i14);
                long j15 = 128;
                long j16 = 255;
                if (c12987z2.f41237f != 0 || ((c12987z2.f41232a[iM14718b >> 3] >> ((iM14718b & 7) << 3)) & 255) == 254) {
                    c12987z = c12987z2;
                    j10 = j12;
                } else {
                    int i22 = c12987z2.f41235d;
                    if (i22 <= 8 || Long.compare((((long) c12987z2.f41236e) * 32) ^ Long.MIN_VALUE, (((long) i22) * 25) ^ Long.MIN_VALUE) > 0) {
                        c12987z = c12987z2;
                        i11 = i14;
                        j10 = j12;
                        int i23 = 0;
                        int iM14638d = AbstractC12957J.m14638d(c12987z.f41235d);
                        long[] jArr2 = c12987z.f41232a;
                        Object[] objArr = c12987z.f41233b;
                        float[] fArr2 = c12987z.f41234c;
                        int i24 = c12987z.f41235d;
                        c12987z.m14720d(iM14638d);
                        long[] jArr3 = c12987z.f41232a;
                        Object[] objArr2 = c12987z.f41233b;
                        float[] fArr3 = c12987z.f41234c;
                        int i25 = c12987z.f41235d;
                        int i26 = 0;
                        while (i26 < i24) {
                            if (((jArr2[i26 >> 3] >> ((i26 & 7) << 3)) & j16) < 128) {
                                Object obj3 = objArr[i26];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : i23) * (-862048943);
                                int i27 = iHashCode3 ^ (iHashCode3 << 16);
                                int iM14718b2 = c12987z.m14718b(i27 >>> 7);
                                long j17 = i27 & 127;
                                int i28 = iM14718b2 >> 3;
                                int i29 = (iM14718b2 & 7) << 3;
                                long j18 = (jArr3[i28] & (~(255 << i29))) | (j17 << i29);
                                jArr3[i28] = j18;
                                jArr3[(((iM14718b2 - 7) & i25) + (i25 & 7)) >> 3] = j18;
                                objArr2[iM14718b2] = obj3;
                                fArr3[iM14718b2] = fArr2[i26];
                            }
                            i26++;
                            jArr2 = jArr2;
                            objArr = objArr;
                            j16 = 255;
                            i23 = 0;
                        }
                    } else {
                        long[] jArr4 = c12987z2.f41232a;
                        int i30 = c12987z2.f41235d;
                        Object[] objArr3 = c12987z2.f41233b;
                        float[] fArr4 = c12987z2.f41234c;
                        AbstractC12957J.m14635a(jArr4, i30);
                        int i31 = 0;
                        int i32 = -1;
                        while (i31 != i30) {
                            int i33 = i31 >> 3;
                            int i34 = (i31 & 7) << 3;
                            long j19 = (jArr4[i33] >> i34) & 255;
                            if (j19 == j15) {
                                i32 = i31;
                                i31++;
                            } else if (j19 != 254) {
                                i31++;
                            } else {
                                Object obj4 = objArr3[i31];
                                if (obj4 != null) {
                                    iHashCode = obj4.hashCode();
                                    i12 = -862048943;
                                } else {
                                    i12 = -862048943;
                                    iHashCode = 0;
                                }
                                int i35 = iHashCode * i12;
                                int i36 = i35 ^ (i35 << 16);
                                int i37 = i36 >>> 7;
                                int iM14718b3 = c12987z2.m14718b(i37);
                                int i38 = i37 & i30;
                                if (((iM14718b3 - i38) & i30) / 8 == ((i31 - i38) & i30) / 8) {
                                    jArr4[i33] = (((long) (i36 & 127)) << i34) | (jArr4[i33] & (~(255 << i34)));
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i31++;
                                } else {
                                    int iM14636b = i32;
                                    int i39 = iM14718b3 >> 3;
                                    long j20 = jArr4[i39];
                                    int i40 = (iM14718b3 & 7) << 3;
                                    if (((j20 >> i40) & 255) == 128) {
                                        fArr = fArr4;
                                        jArr4[i39] = (((long) (i36 & 127)) << i40) | ((~(255 << i40)) & j20);
                                        jArr4[i33] = (jArr4[i33] & (~(255 << i34))) | (128 << i34);
                                        objArr3[iM14718b3] = objArr3[i31];
                                        objArr3[i31] = null;
                                        fArr[iM14718b3] = fArr[i31];
                                        fArr[i31] = 0.0f;
                                        iM14636b = i31;
                                    } else {
                                        fArr = fArr4;
                                        jArr4[i39] = (((long) (i36 & 127)) << i40) | ((~(255 << i40)) & j20);
                                        if (iM14636b == -1) {
                                            iM14636b = AbstractC12957J.m14636b(jArr4, i31 + 1, i30);
                                        }
                                        objArr3[iM14636b] = objArr3[iM14718b3];
                                        objArr3[iM14718b3] = objArr3[i31];
                                        objArr3[i31] = objArr3[iM14636b];
                                        fArr[iM14636b] = fArr[iM14718b3];
                                        fArr[iM14718b3] = fArr[i31];
                                        fArr[i31] = fArr[iM14636b];
                                        i31--;
                                    }
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i31++;
                                    c12987z2 = this;
                                    i32 = iM14636b;
                                    i14 = i14;
                                    fArr4 = fArr;
                                }
                                j12 = j12;
                                j15 = 128;
                            }
                        }
                        c12987z = c12987z2;
                        i11 = i14;
                        j10 = j12;
                        c12987z.f41237f = AbstractC12957J.m14637c(c12987z.f41235d) - c12987z.f41236e;
                    }
                    iM14718b = c12987z.m14718b(i11);
                }
                c12987z.f41236e++;
                int i41 = c12987z.f41237f;
                long[] jArr5 = c12987z.f41232a;
                int i42 = iM14718b >> 3;
                long j21 = jArr5[i42];
                int i43 = (iM14718b & 7) << 3;
                c12987z.f41237f = i41 - (((j21 >> i43) & 255) == 128 ? 1 : 0);
                int i44 = c12987z.f41235d;
                long j22 = (j21 & (~(255 << i43))) | (j10 << i43);
                jArr5[i42] = j22;
                jArr5[(((iM14718b - 7) & i44) + (i44 & 7)) >> 3] = j22;
                i10 = ~iM14718b;
                break;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            c12987z2 = c12987z2;
            i15 = i21;
            obj2 = obj;
        }
        if (i10 < 0) {
            i10 = ~i10;
        }
        c12987z.f41233b[i10] = obj;
        c12987z.f41234c[i10] = f10;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0075 A[LOOP:0: B:14:0x0023->B:31:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0078 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12987z)) {
            return false;
        }
        C12987z c12987z = (C12987z) obj;
        if (c12987z.f41236e != this.f41236e) {
            return false;
        }
        Object[] objArr = this.f41233b;
        float[] fArr = this.f41234c;
        long[] jArr = this.f41232a;
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
                            Object obj2 = objArr[i13];
                            float f10 = fArr[i13];
                            int iM14719c = c12987z.m14719c(obj2);
                            if (iM14719c < 0) {
                                throw new NoSuchElementException(AbstractC12107L1.m13824o(obj2, "There is no key ", " in the map"));
                            }
                            if (f10 != c12987z.f41234c[iM14719c]) {
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
        Object[] objArr = this.f41233b;
        float[] fArr = this.f41234c;
        long[] jArr = this.f41232a;
        int length = jArr.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int iFloatToIntBits = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj = objArr[i14];
                            iFloatToIntBits += Float.floatToIntBits(fArr[i14]) ^ (obj != null ? obj.hashCode() : 0);
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return iFloatToIntBits;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    i10 = iFloatToIntBits;
                }
            }
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
      0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    public final String toString() {
        if (this.f41236e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f41233b;
        float[] fArr = this.f41234c;
        long[] jArr = this.f41232a;
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
                            Object obj = objArr[i14];
                            float f10 = fArr[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append(Separators.EQUALS);
                            sb2.append(f10);
                            i11++;
                            if (i11 < this.f41236e) {
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
