package p692d0;

import kotlin.jvm.internal.AbstractC16544l;
import p349O0.C5974R0;
import p714e0.AbstractC13253a;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: d0.G */
/* JADX INFO: loaded from: classes.dex */
public final class C12954G {

    /* JADX INFO: renamed from: a */
    public long[] f41143a;

    /* JADX INFO: renamed from: b */
    public Object[] f41144b;

    /* JADX INFO: renamed from: c */
    public int f41145c;

    /* JADX INFO: renamed from: d */
    public int f41146d;

    /* JADX INFO: renamed from: e */
    public int f41147e;

    public C12954G(int i10) {
        this.f41143a = AbstractC12957J.f41150a;
        this.f41144b = AbstractC13253a.f41867c;
        if (i10 >= 0) {
            m14629f(AbstractC12957J.m14640f(i10));
        } else {
            AbstractC13253a.m14850c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m14624a(Object obj) {
        int i10 = this.f41146d;
        this.f41144b[m14627d(obj)] = obj;
        return this.f41146d != i10;
    }

    /* JADX INFO: renamed from: b */
    public final void m14625b() {
        this.f41146d = 0;
        long[] jArr = this.f41143a;
        if (jArr != AbstractC12957J.f41150a) {
            AbstractC17678l.m19313t(jArr);
            long[] jArr2 = this.f41143a;
            int i10 = this.f41145c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        AbstractC17678l.m19311r(this.f41144b, null, 0, this.f41145c);
        this.f41147e = AbstractC12957J.m14637c(this.f41145c) - this.f41146d;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m14626c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f41145c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f41143a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (AbstractC16544l.m18089b(this.f41144b[iNumberOfTrailingZeros], obj)) {
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

    /* JADX INFO: renamed from: d */
    public final int m14627d(Object obj) {
        long j10;
        int i10;
        int i11;
        int i12;
        int i13 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f41145c;
        int i18 = i15 & i17;
        int i19 = 0;
        while (true) {
            long[] jArr = this.f41143a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            long j11 = ((jArr[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr[i20] >>> i21);
            long j12 = i16;
            int i22 = i16;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j14) >> 3)) & i17;
                if (AbstractC16544l.m18089b(this.f41144b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            int i23 = 8;
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iM14628e = m14628e(i15);
                long j15 = 128;
                long j16 = 255;
                if (this.f41147e != 0 || ((this.f41143a[iM14628e >> 3] >> ((iM14628e & 7) << 3)) & 255) == 254) {
                    j10 = j12;
                    i10 = 0;
                } else {
                    int i24 = this.f41145c;
                    if (i24 <= 8 || Long.compare((((long) this.f41146d) * 32) ^ Long.MIN_VALUE, (((long) i24) * 25) ^ Long.MIN_VALUE) > 0) {
                        j10 = j12;
                        i10 = 0;
                        int iM14638d = AbstractC12957J.m14638d(this.f41145c);
                        long[] jArr2 = this.f41143a;
                        Object[] objArr = this.f41144b;
                        int i25 = this.f41145c;
                        m14629f(iM14638d);
                        long[] jArr3 = this.f41143a;
                        Object[] objArr2 = this.f41144b;
                        int i26 = this.f41145c;
                        int i27 = 0;
                        while (i27 < i25) {
                            if (((jArr2[i27 >> 3] >> ((i27 & 7) << 3)) & j16) < 128) {
                                Object obj2 = objArr[i27];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i28 = iHashCode2 ^ (iHashCode2 << 16);
                                int iM14628e2 = m14628e(i28 >>> 7);
                                long j17 = i28 & 127;
                                int i29 = iM14628e2 >> 3;
                                int i30 = (iM14628e2 & 7) << 3;
                                long j18 = (j17 << i30) | (jArr3[i29] & (~(255 << i30)));
                                jArr3[i29] = j18;
                                jArr3[(((iM14628e2 - 7) & i26) + (i26 & 7)) >> 3] = j18;
                                objArr2[iM14628e2] = obj2;
                            }
                            i27++;
                            j16 = 255;
                        }
                    } else {
                        long[] jArr4 = this.f41143a;
                        int i31 = this.f41145c;
                        Object[] objArr3 = this.f41144b;
                        AbstractC12957J.m14635a(jArr4, i31);
                        int i32 = 0;
                        int i33 = -1;
                        while (i32 != i31) {
                            int i34 = i32 >> 3;
                            int i35 = (i32 & 7) << 3;
                            long j19 = (jArr4[i34] >> i35) & 255;
                            if (j19 == j15) {
                                i33 = i32;
                                i32++;
                            } else if (j19 != 254) {
                                i32++;
                            } else {
                                Object obj3 = objArr3[i32];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i13;
                                int i36 = iHashCode3 ^ (iHashCode3 << 16);
                                int i37 = i36 >>> 7;
                                int iM14628e3 = m14628e(i37);
                                int i38 = i37 & i31;
                                if (((iM14628e3 - i38) & i31) / 8 == ((i32 - i38) & i31) / i23) {
                                    jArr4[i34] = (((long) (i36 & 127)) << i35) | (jArr4[i34] & (~(255 << i35)));
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i32++;
                                } else {
                                    int iM14636b = i33;
                                    int i39 = iM14628e3 >> 3;
                                    long j20 = jArr4[i39];
                                    int i40 = (iM14628e3 & 7) << 3;
                                    if (((j20 >> i40) & 255) == 128) {
                                        i12 = i32;
                                        jArr4[i39] = (j20 & (~(255 << i40))) | (((long) (i36 & 127)) << i40);
                                        jArr4[i34] = (jArr4[i34] & (~(255 << i35))) | (128 << i35);
                                        objArr3[iM14628e3] = objArr3[i12];
                                        objArr3[i12] = null;
                                        i11 = i12;
                                    } else {
                                        int i41 = i32;
                                        jArr4[i39] = (j20 & (~(255 << i40))) | (((long) (i36 & 127)) << i40);
                                        if (iM14636b == -1) {
                                            iM14636b = AbstractC12957J.m14636b(jArr4, i41 + 1, i31);
                                        }
                                        objArr3[iM14636b] = objArr3[iM14628e3];
                                        objArr3[iM14628e3] = objArr3[i41];
                                        objArr3[i41] = objArr3[iM14636b];
                                        i11 = i41 - 1;
                                        i12 = iM14636b;
                                    }
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i32 = i11 + 1;
                                    i33 = i12;
                                    j12 = j12;
                                }
                                i23 = 8;
                                i13 = -862048943;
                                j15 = 128;
                            }
                        }
                        j10 = j12;
                        i10 = 0;
                        this.f41147e = AbstractC12957J.m14637c(this.f41145c) - this.f41146d;
                    }
                    iM14628e = m14628e(i15);
                }
                this.f41146d++;
                int i42 = this.f41147e;
                long[] jArr5 = this.f41143a;
                int i43 = iM14628e >> 3;
                long j21 = jArr5[i43];
                int i44 = (iM14628e & 7) << 3;
                this.f41147e = i42 - (((j21 >> i44) & 255) != 128 ? i10 : 1);
                int i45 = this.f41145c;
                long j22 = (j21 & (~(255 << i44))) | (j10 << i44);
                jArr5[i43] = j22;
                jArr5[(((iM14628e - 7) & i45) + (i45 & 7)) >> 3] = j22;
                return iM14628e;
            }
            i19 += 8;
            i18 = (i18 + i19) & i17;
            i16 = i22;
            i13 = -862048943;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m14628e(int i10) {
        int i11 = this.f41145c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f41143a;
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

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12954G)) {
            return false;
        }
        C12954G c12954g = (C12954G) obj;
        if (c12954g.f41146d != this.f41146d) {
            return false;
        }
        Object[] objArr = this.f41144b;
        long[] jArr = this.f41143a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && !c12954g.m14626c(objArr[(i10 << 3) + i12])) {
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
    public final void m14629f(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, AbstractC12957J.m14639e(i10)) : 0;
        this.f41145c = iMax;
        if (iMax == 0) {
            jArr = AbstractC12957J.f41150a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC17678l.m19313t(jArr);
        }
        this.f41143a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f41147e = AbstractC12957J.m14637c(this.f41145c) - this.f41146d;
        this.f41144b = new Object[iMax];
    }

    /* JADX INFO: renamed from: g */
    public final boolean m14630g() {
        return this.f41146d == 0;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m14631h() {
        return this.f41146d != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f41144b;
        long[] jArr = this.f41143a;
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
                            Object obj = objArr[(i11 << 3) + i13];
                            iHashCode += obj != null ? obj.hashCode() : 0;
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
    public final void m14632i(C12954G elements) {
        AbstractC16544l.m18094g(elements, "elements");
        Object[] objArr = elements.f41144b;
        long[] jArr = elements.f41143a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        Object obj = objArr[(i10 << 3) + i12];
                        this.f41144b[m14627d(obj)] = obj;
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m14633j(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f41145c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f41143a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (AbstractC16544l.m18089b(this.f41144b[iNumberOfTrailingZeros], obj)) {
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
        boolean z6 = iNumberOfTrailingZeros >= 0;
        if (z6) {
            m14634k(iNumberOfTrailingZeros);
        }
        return z6;
    }

    /* JADX INFO: renamed from: k */
    public final void m14634k(int i10) {
        this.f41146d--;
        long[] jArr = this.f41143a;
        int i11 = this.f41145c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f41144b[i10] = null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0066 A[DONT_INVERT, PHI: r8
      0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:6:0x0029, B:18:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0068 A[LOOP:0: B:5:0x001b->B:20:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x006b A[SYNTHETIC] */
    public final String toString() {
        C5974R0 c5974r0 = new C5974R0(this, 1);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f41144b;
        long[] jArr = this.f41143a;
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
                        Object obj = objArr[(i10 << 3) + i13];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append((CharSequence) c5974r0.invoke(obj));
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

    public /* synthetic */ C12954G() {
        this(6);
    }
}
