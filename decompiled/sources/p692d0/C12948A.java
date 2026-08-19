package p692d0;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p714e0.AbstractC13253a;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: d0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C12948A {

    /* JADX INFO: renamed from: a */
    public long[] f41109a;

    /* JADX INFO: renamed from: b */
    public Object[] f41110b;

    /* JADX INFO: renamed from: c */
    public int[] f41111c;

    /* JADX INFO: renamed from: d */
    public int f41112d;

    /* JADX INFO: renamed from: e */
    public int f41113e;

    /* JADX INFO: renamed from: f */
    public int f41114f;

    public C12948A(int i10) {
        this.f41109a = AbstractC12957J.f41150a;
        this.f41110b = AbstractC13253a.f41867c;
        this.f41111c = AbstractC12973l.f41183a;
        if (i10 >= 0) {
            m14604d(AbstractC12957J.m14640f(i10));
        } else {
            AbstractC13253a.m14850c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m14601a(int i10) {
        int i11 = this.f41112d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f41109a;
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
    public final int m14602b(Object obj) {
        long j10;
        int i10;
        int i11 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f41112d;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f41109a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j11 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j12 = i14;
            int i20 = i14;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = (i16 + (Long.numberOfTrailingZeros(j14) >> 3)) & i15;
                if (AbstractC16544l.m18089b(this.f41110b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            int i21 = 8;
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iM14601a = m14601a(i13);
                long j15 = 128;
                long j16 = 255;
                if (this.f41114f != 0 || ((this.f41109a[iM14601a >> 3] >> ((iM14601a & 7) << 3)) & 255) == 254) {
                    j10 = j12;
                    i10 = 0;
                } else {
                    int i22 = this.f41112d;
                    if (i22 <= 8 || Long.compare((((long) this.f41113e) * 32) ^ Long.MIN_VALUE, (((long) i22) * 25) ^ Long.MIN_VALUE) > 0) {
                        j10 = j12;
                        i10 = 0;
                        int iM14638d = AbstractC12957J.m14638d(this.f41112d);
                        long[] jArr2 = this.f41109a;
                        Object[] objArr = this.f41110b;
                        int[] iArr = this.f41111c;
                        int i23 = this.f41112d;
                        m14604d(iM14638d);
                        long[] jArr3 = this.f41109a;
                        Object[] objArr2 = this.f41110b;
                        int[] iArr2 = this.f41111c;
                        int i24 = this.f41112d;
                        int i25 = 0;
                        while (i25 < i23) {
                            if (((jArr2[i25 >> 3] >> ((i25 & 7) << 3)) & j16) < 128) {
                                Object obj2 = objArr[i25];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i26 = iHashCode2 ^ (iHashCode2 << 16);
                                int iM14601a2 = m14601a(i26 >>> 7);
                                long j17 = i26 & 127;
                                int i27 = iM14601a2 >> 3;
                                int i28 = (iM14601a2 & 7) << 3;
                                long j18 = (jArr3[i27] & (~(255 << i28))) | (j17 << i28);
                                jArr3[i27] = j18;
                                jArr3[(((iM14601a2 - 7) & i24) + (i24 & 7)) >> 3] = j18;
                                objArr2[iM14601a2] = obj2;
                                iArr2[iM14601a2] = iArr[i25];
                            }
                            i25++;
                            jArr2 = jArr2;
                            objArr = objArr;
                            j16 = 255;
                        }
                    } else {
                        long[] jArr4 = this.f41109a;
                        int i29 = this.f41112d;
                        Object[] objArr3 = this.f41110b;
                        int[] iArr3 = this.f41111c;
                        AbstractC12957J.m14635a(jArr4, i29);
                        int i30 = 0;
                        int iM14636b = -1;
                        while (i30 != i29) {
                            int i31 = i30 >> 3;
                            int i32 = (i30 & 7) << 3;
                            long j19 = (jArr4[i31] >> i32) & 255;
                            if (j19 == j15) {
                                iM14636b = i30;
                                i30++;
                            } else if (j19 != 254) {
                                i30++;
                            } else {
                                Object obj3 = objArr3[i30];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i11;
                                int i33 = iHashCode3 ^ (iHashCode3 << 16);
                                int i34 = i33 >>> 7;
                                int iM14601a3 = m14601a(i34);
                                int i35 = i34 & i29;
                                if (((iM14601a3 - i35) & i29) / 8 == ((i30 - i35) & i29) / i21) {
                                    jArr4[i31] = (((long) (i33 & 127)) << i32) | (jArr4[i31] & (~(255 << i32)));
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i30++;
                                    i21 = 8;
                                    i11 = -862048943;
                                } else {
                                    int i36 = i30;
                                    int i37 = iM14601a3 >> 3;
                                    long j20 = jArr4[i37];
                                    int i38 = (iM14601a3 & 7) << 3;
                                    if (((j20 >> i38) & 255) == j15) {
                                        jArr4[i37] = (((long) (i33 & 127)) << i38) | (j20 & (~(255 << i38)));
                                        jArr4[i31] = (jArr4[i31] & (~(255 << i32))) | (128 << i32);
                                        objArr3[iM14601a3] = objArr3[i36];
                                        objArr3[i36] = null;
                                        iArr3[iM14601a3] = iArr3[i36];
                                        iArr3[i36] = 0;
                                        iM14636b = i36;
                                    } else {
                                        jArr4[i37] = (((long) (i33 & 127)) << i38) | (j20 & (~(255 << i38)));
                                        int i39 = iM14636b;
                                        iM14636b = i39 == -1 ? AbstractC12957J.m14636b(jArr4, i36 + 1, i29) : i39;
                                        objArr3[iM14636b] = objArr3[iM14601a3];
                                        objArr3[iM14601a3] = objArr3[i36];
                                        objArr3[i36] = objArr3[iM14636b];
                                        iArr3[iM14636b] = iArr3[iM14601a3];
                                        iArr3[iM14601a3] = iArr3[i36];
                                        iArr3[i36] = iArr3[iM14636b];
                                        i36--;
                                    }
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i30 = i36 + 1;
                                    j12 = j12;
                                    i21 = 8;
                                    i11 = -862048943;
                                    j15 = 128;
                                }
                            }
                        }
                        j10 = j12;
                        i10 = 0;
                        this.f41114f = AbstractC12957J.m14637c(this.f41112d) - this.f41113e;
                    }
                    iM14601a = m14601a(i13);
                }
                this.f41113e++;
                int i40 = this.f41114f;
                long[] jArr5 = this.f41109a;
                int i41 = iM14601a >> 3;
                long j21 = jArr5[i41];
                int i42 = (iM14601a & 7) << 3;
                this.f41114f = i40 - (((j21 >> i42) & 255) != 128 ? i10 : 1);
                int i43 = this.f41112d;
                long j22 = (j21 & (~(255 << i42))) | (j10 << i42);
                jArr5[i41] = j22;
                jArr5[(((iM14601a - 7) & i43) + (i43 & 7)) >> 3] = j22;
                return ~iM14601a;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i14 = i20;
            i11 = -862048943;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m14603c(Object obj) {
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f41112d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f41109a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (AbstractC16544l.m18089b(this.f41110b[iNumberOfTrailingZeros], obj)) {
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
    public final void m14604d(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, AbstractC12957J.m14639e(i10)) : 0;
        this.f41112d = iMax;
        if (iMax == 0) {
            jArr = AbstractC12957J.f41150a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC17678l.m19313t(jArr);
        }
        this.f41109a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f41114f = AbstractC12957J.m14637c(this.f41112d) - this.f41113e;
        this.f41110b = new Object[iMax];
        this.f41111c = new int[iMax];
    }

    /* JADX INFO: renamed from: e */
    public final void m14605e(int i10) {
        this.f41113e--;
        long[] jArr = this.f41109a;
        int i11 = this.f41112d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f41110b[i10] = null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0072 A[LOOP:0: B:14:0x0023->B:30:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0075 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12948A)) {
            return false;
        }
        C12948A c12948a = (C12948A) obj;
        if (c12948a.f41113e != this.f41113e) {
            return false;
        }
        Object[] objArr = this.f41110b;
        int[] iArr = this.f41111c;
        long[] jArr = this.f41109a;
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
                            int i14 = iArr[i13];
                            int iM14603c = c12948a.m14603c(obj2);
                            if (iM14603c < 0) {
                                throw new NoSuchElementException(AbstractC12107L1.m13824o(obj2, "There is no key ", " in the map"));
                            }
                            if (i14 != c12948a.f41111c[iM14603c]) {
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
    public final void m14606f(int i10, Object obj) {
        int iM14602b = m14602b(obj);
        if (iM14602b < 0) {
            iM14602b = ~iM14602b;
        }
        this.f41110b[iM14602b] = obj;
        this.f41111c[iM14602b] = i10;
    }

    public final int hashCode() {
        Object[] objArr = this.f41110b;
        int[] iArr = this.f41111c;
        long[] jArr = this.f41109a;
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
                            iHashCode += iArr[i14] ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
      0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    public final String toString() {
        if (this.f41113e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f41110b;
        int[] iArr = this.f41111c;
        long[] jArr = this.f41109a;
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
                            int i15 = iArr[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append(Separators.EQUALS);
                            sb2.append(i15);
                            i11++;
                            if (i11 < this.f41113e) {
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

    public /* synthetic */ C12948A() {
        this(6);
    }
}
