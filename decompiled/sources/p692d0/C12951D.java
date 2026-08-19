package p692d0;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p714e0.AbstractC13253a;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: d0.D */
/* JADX INFO: loaded from: classes.dex */
public final class C12951D {

    /* JADX INFO: renamed from: a */
    public long[] f41123a;

    /* JADX INFO: renamed from: b */
    public Object[] f41124b;

    /* JADX INFO: renamed from: c */
    public Object[] f41125c;

    /* JADX INFO: renamed from: d */
    public int f41126d;

    /* JADX INFO: renamed from: e */
    public int f41127e;

    /* JADX INFO: renamed from: f */
    public int f41128f;

    public C12951D(int i10) {
        this.f41123a = AbstractC12957J.f41150a;
        Object[] objArr = AbstractC13253a.f41867c;
        this.f41124b = objArr;
        this.f41125c = objArr;
        if (i10 >= 0) {
            m14620f(AbstractC12957J.m14640f(i10));
        } else {
            AbstractC13253a.m14850c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14615a() {
        this.f41127e = 0;
        long[] jArr = this.f41123a;
        if (jArr != AbstractC12957J.f41150a) {
            AbstractC17678l.m19313t(jArr);
            long[] jArr2 = this.f41123a;
            int i10 = this.f41126d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        AbstractC17678l.m19311r(this.f41125c, null, 0, this.f41126d);
        AbstractC17678l.m19311r(this.f41124b, null, 0, this.f41126d);
        this.f41128f = AbstractC12957J.m14637c(this.f41126d) - this.f41127e;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m14616b(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f41126d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f41123a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (AbstractC16544l.m18089b(this.f41124b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m14617c(int i10) {
        int i11 = this.f41126d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f41123a;
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

    /* JADX INFO: renamed from: d */
    public final int m14618d(Object obj) {
        long j10;
        int i10;
        int i11;
        int i12 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f41126d;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f41123a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            long j11 = ((jArr[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr[i19] >>> i20);
            long j12 = i15;
            int i21 = i15;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j14) >> 3)) & i16;
                if (AbstractC16544l.m18089b(this.f41124b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            int i22 = 8;
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iM14617c = m14617c(i14);
                long j15 = 128;
                long j16 = 255;
                if (this.f41128f != 0 || ((this.f41123a[iM14617c >> 3] >> ((iM14617c & 7) << 3)) & 255) == 254) {
                    j10 = j12;
                    i10 = 0;
                } else {
                    int i23 = this.f41126d;
                    if (i23 <= 8 || Long.compare((((long) this.f41127e) * 32) ^ Long.MIN_VALUE, (((long) i23) * 25) ^ Long.MIN_VALUE) > 0) {
                        j10 = j12;
                        i10 = 0;
                        int iM14638d = AbstractC12957J.m14638d(this.f41126d);
                        long[] jArr2 = this.f41123a;
                        Object[] objArr = this.f41124b;
                        Object[] objArr2 = this.f41125c;
                        int i24 = this.f41126d;
                        m14620f(iM14638d);
                        long[] jArr3 = this.f41123a;
                        Object[] objArr3 = this.f41124b;
                        Object[] objArr4 = this.f41125c;
                        int i25 = this.f41126d;
                        int i26 = 0;
                        while (i26 < i24) {
                            if (((jArr2[i26 >> 3] >> ((i26 & 7) << 3)) & j16) < 128) {
                                Object obj2 = objArr[i26];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i27 = iHashCode2 ^ (iHashCode2 << 16);
                                int iM14617c2 = m14617c(i27 >>> 7);
                                long j17 = i27 & 127;
                                int i28 = iM14617c2 >> 3;
                                int i29 = (iM14617c2 & 7) << 3;
                                long j18 = (jArr3[i28] & (~(255 << i29))) | (j17 << i29);
                                jArr3[i28] = j18;
                                jArr3[(((iM14617c2 - 7) & i25) + (i25 & 7)) >> 3] = j18;
                                objArr3[iM14617c2] = obj2;
                                objArr4[iM14617c2] = objArr2[i26];
                            }
                            i26++;
                            jArr2 = jArr2;
                            objArr = objArr;
                            j16 = 255;
                        }
                    } else {
                        long[] jArr4 = this.f41123a;
                        int i30 = this.f41126d;
                        Object[] objArr5 = this.f41124b;
                        Object[] objArr6 = this.f41125c;
                        AbstractC12957J.m14635a(jArr4, i30);
                        int i31 = 0;
                        int iM14636b = -1;
                        while (i31 != i30) {
                            int i32 = i31 >> 3;
                            int i33 = (i31 & 7) << 3;
                            long j19 = (jArr4[i32] >> i33) & 255;
                            if (j19 == j15) {
                                iM14636b = i31;
                                i31++;
                            } else if (j19 != 254) {
                                i31++;
                            } else {
                                Object obj3 = objArr5[i31];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i12;
                                int i34 = iHashCode3 ^ (iHashCode3 << 16);
                                int i35 = i34 >>> 7;
                                int iM14617c3 = m14617c(i35);
                                int i36 = i35 & i30;
                                if (((iM14617c3 - i36) & i30) / 8 == ((i31 - i36) & i30) / i22) {
                                    jArr4[i32] = (((long) (i34 & 127)) << i33) | (jArr4[i32] & (~(255 << i33)));
                                    jArr4[jArr4.length - 1] = jArr4[0];
                                    i31++;
                                    i22 = 8;
                                    i12 = -862048943;
                                } else {
                                    int i37 = i31;
                                    int i38 = iM14617c3 >> 3;
                                    long j20 = jArr4[i38];
                                    int i39 = (iM14617c3 & 7) << 3;
                                    if (((j20 >> i39) & 255) == j15) {
                                        jArr4[i38] = (((long) (i34 & 127)) << i39) | (j20 & (~(255 << i39)));
                                        jArr4[i32] = (jArr4[i32] & (~(255 << i33))) | (128 << i33);
                                        objArr5[iM14617c3] = objArr5[i37];
                                        objArr5[i37] = null;
                                        objArr6[iM14617c3] = objArr6[i37];
                                        objArr6[i37] = null;
                                        i11 = i37;
                                        iM14636b = i11;
                                    } else {
                                        jArr4[i38] = (((long) (i34 & 127)) << i39) | (j20 & (~(255 << i39)));
                                        int i40 = iM14636b;
                                        iM14636b = i40 == -1 ? AbstractC12957J.m14636b(jArr4, i37 + 1, i30) : i40;
                                        objArr5[iM14636b] = objArr5[iM14617c3];
                                        objArr5[iM14617c3] = objArr5[i37];
                                        objArr5[i37] = objArr5[iM14636b];
                                        objArr6[iM14636b] = objArr6[iM14617c3];
                                        objArr6[iM14617c3] = objArr6[i37];
                                        objArr6[i37] = objArr6[iM14636b];
                                        i11 = i37 - 1;
                                    }
                                    jArr4[jArr4.length - 1] = jArr4[0];
                                    i31 = i11 + 1;
                                    j12 = j12;
                                    i22 = 8;
                                    i12 = -862048943;
                                    j15 = 128;
                                }
                            }
                        }
                        j10 = j12;
                        i10 = 0;
                        this.f41128f = AbstractC12957J.m14637c(this.f41126d) - this.f41127e;
                    }
                    iM14617c = m14617c(i14);
                }
                this.f41127e++;
                int i41 = this.f41128f;
                long[] jArr5 = this.f41123a;
                int i42 = iM14617c >> 3;
                long j21 = jArr5[i42];
                int i43 = (iM14617c & 7) << 3;
                this.f41128f = i41 - (((j21 >> i43) & 255) != 128 ? i10 : 1);
                int i44 = this.f41126d;
                long j22 = (j21 & (~(255 << i43))) | (j10 << i43);
                jArr5[i42] = j22;
                jArr5[(((iM14617c - 7) & i44) + (i44 & 7)) >> 3] = j22;
                return ~iM14617c;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i15 = i21;
            i12 = -862048943;
        }
    }

    /* JADX INFO: renamed from: e */
    public final Object m14619e(Object obj) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f41126d;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f41123a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (AbstractC16544l.m18089b(this.f41124b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f41125c[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[LOOP:0: B:14:0x0023->B:33:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[EDGE_INSN: B:35:0x0074->B:34:0x0074 BREAK  A[LOOP:0: B:14:0x0023->B:33:0x0071], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12951D)) {
            return false;
        }
        C12951D c12951d = (C12951D) obj;
        if (c12951d.f41127e != this.f41127e) {
            return false;
        }
        Object[] objArr = this.f41124b;
        Object[] objArr2 = this.f41125c;
        long[] jArr = this.f41123a;
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
                            Object obj2 = objArr[i13];
                            Object obj3 = objArr2[i13];
                            if (obj3 == null) {
                                if (c12951d.m14619e(obj2) != null || !c12951d.m14616b(obj2)) {
                                    return false;
                                }
                            } else if (!obj3.equals(c12951d.m14619e(obj2))) {
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
    public final void m14620f(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, AbstractC12957J.m14639e(i10)) : 0;
        this.f41126d = iMax;
        if (iMax == 0) {
            jArr = AbstractC12957J.f41150a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC17678l.m19313t(jArr);
        }
        this.f41123a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f41128f = AbstractC12957J.m14637c(this.f41126d) - this.f41127e;
        this.f41124b = new Object[iMax];
        this.f41125c = new Object[iMax];
    }

    /* JADX INFO: renamed from: g */
    public final Object m14621g(Object obj) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f41126d;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f41123a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (AbstractC16544l.m18089b(this.f41124b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return m14622h(iNumberOfTrailingZeros);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final Object m14622h(int i10) {
        this.f41127e--;
        long[] jArr = this.f41123a;
        int i11 = this.f41126d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f41124b[i10] = null;
        Object[] objArr = this.f41125c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final int hashCode() {
        Object[] objArr = this.f41124b;
        Object[] objArr2 = this.f41125c;
        long[] jArr = this.f41123a;
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
                            Object obj = objArr[i14];
                            Object obj2 = objArr2[i14];
                            iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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
    public final void m14623i(Object obj, Object obj2) {
        int iM14618d = m14618d(obj);
        if (iM14618d < 0) {
            iM14618d = ~iM14618d;
        }
        this.f41124b[iM14618d] = obj;
        this.f41125c[iM14618d] = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070 A[DONT_INVERT, PHI: r8
      0x0070: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:25:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0072 A[LOOP:0: B:9:0x001e->B:27:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0075 A[EDGE_INSN: B:31:0x0075->B:28:0x0075 BREAK  A[LOOP:0: B:9:0x001e->B:27:0x0072], SYNTHETIC] */
    public final String toString() {
        if (this.f41127e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f41124b;
        Object[] objArr2 = this.f41125c;
        long[] jArr = this.f41123a;
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
                            Object obj2 = objArr2[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append(Separators.EQUALS);
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb2.append(obj2);
                            i11++;
                            if (i11 < this.f41127e) {
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

    public /* synthetic */ C12951D() {
        this(6);
    }
}
