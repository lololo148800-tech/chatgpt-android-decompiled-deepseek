package androidx.glance.appwidget.protobuf;

import java.util.Arrays;
import p030B2.AbstractC0754e0;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.h */
/* JADX INFO: loaded from: classes.dex */
public final class C11044h extends AbstractC0754e0 {

    /* JADX INFO: renamed from: o0 */
    public final byte[] f33305o0;

    /* JADX INFO: renamed from: p0 */
    public int f33306p0;

    /* JADX INFO: renamed from: q0 */
    public int f33307q0;

    /* JADX INFO: renamed from: r0 */
    public int f33308r0;

    /* JADX INFO: renamed from: s0 */
    public final int f33309s0;

    /* JADX INFO: renamed from: t0 */
    public int f33310t0;

    /* JADX INFO: renamed from: u0 */
    public int f33311u0 = Integer.MAX_VALUE;

    public C11044h(byte[] bArr, int i10, int i11, boolean z6) {
        this.f33305o0 = bArr;
        this.f33306p0 = i11 + i10;
        this.f33308r0 = i10;
        this.f33309s0 = i10;
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: A */
    public final int mo1610A() {
        return m12028E();
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: B */
    public final long mo1611B() {
        return m12029F();
    }

    /* JADX INFO: renamed from: C */
    public final int m12026C() throws C11005A {
        int i10 = this.f33308r0;
        if (this.f33306p0 - i10 < 4) {
            throw C11005A.m11847e();
        }
        this.f33308r0 = i10 + 4;
        byte[] bArr = this.f33305o0;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: D */
    public final long m12027D() throws C11005A {
        int i10 = this.f33308r0;
        if (this.f33306p0 - i10 < 8) {
            throw C11005A.m11847e();
        }
        this.f33308r0 = i10 + 8;
        byte[] bArr = this.f33305o0;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: E */
    public final int m12028E() {
        int i10;
        int i11 = this.f33308r0;
        int i12 = this.f33306p0;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f33305o0;
            byte b = bArr[i11];
            if (b >= 0) {
                this.f33308r0 = i13;
                return b;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b10 = bArr[i18];
                            int i20 = (i19 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f33308r0 = i14;
                return i10;
            }
        }
        return (int) m12030G();
    }

    /* JADX INFO: renamed from: F */
    public final long m12029F() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f33308r0;
        int i11 = this.f33306p0;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f33305o0;
            byte b = bArr[i10];
            if (b >= 0) {
                this.f33308r0 = i12;
                return b;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b;
                if (i14 < 0) {
                    j10 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j10 = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            j13 = (-2080896) ^ i18;
                        } else {
                            long j14 = i18;
                            i13 = i10 + 5;
                            long j15 = j14 ^ (((long) bArr[i17]) << 28);
                            if (j15 >= 0) {
                                j12 = 266354560;
                            } else {
                                i17 = i10 + 6;
                                long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                if (j16 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j15 = j16 ^ (((long) bArr[i17]) << 42);
                                    if (j15 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i17 = i10 + 8;
                                        j16 = j15 ^ (((long) bArr[i13]) << 49);
                                        if (j16 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j17 = (j16 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                int i19 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i19;
                                                }
                                            }
                                            j10 = j17;
                                        }
                                    }
                                }
                                j13 = j11 ^ j16;
                            }
                            j10 = j12 ^ j15;
                        }
                        i13 = i17;
                        j10 = j13;
                    }
                }
                this.f33308r0 = i13;
                return j10;
            }
        }
        return m12030G();
    }

    /* JADX INFO: renamed from: G */
    public final long m12030G() throws C11005A {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f33308r0;
            if (i11 == this.f33306p0) {
                throw C11005A.m11847e();
            }
            this.f33308r0 = i11 + 1;
            byte b = this.f33305o0[i11];
            j10 |= ((long) (b & 127)) << i10;
            if ((b & 128) == 0) {
                return j10;
            }
        }
        throw C11005A.m11845c();
    }

    /* JADX INFO: renamed from: H */
    public final void m12031H() {
        int i10 = this.f33306p0 + this.f33307q0;
        this.f33306p0 = i10;
        int i11 = i10 - this.f33309s0;
        int i12 = this.f33311u0;
        if (i11 <= i12) {
            this.f33307q0 = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f33307q0 = i13;
        this.f33306p0 = i10 - i13;
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: a */
    public final void mo1612a(int i10) throws C11005A {
        if (this.f33310t0 != i10) {
            throw new C11005A("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: b */
    public final int mo1613b() {
        return this.f33308r0 - this.f33309s0;
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: c */
    public final boolean mo1614c() {
        return this.f33308r0 == this.f33306p0;
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: h */
    public final void mo1619h(int i10) {
        this.f33311u0 = i10;
        m12031H();
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: i */
    public final int mo1620i(int i10) throws C11005A {
        if (i10 < 0) {
            throw C11005A.m11846d();
        }
        int iMo1613b = mo1613b() + i10;
        if (iMo1613b < 0) {
            throw new C11005A("Failed to parse the message.");
        }
        int i11 = this.f33311u0;
        if (iMo1613b > i11) {
            throw C11005A.m11847e();
        }
        this.f33311u0 = iMo1613b;
        m12031H();
        return i11;
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: j */
    public final boolean mo1621j() {
        return m12029F() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: k */
    public final C11042g mo1622k() throws C11005A {
        byte[] bArrCopyOfRange;
        int iM12028E = m12028E();
        byte[] bArr = this.f33305o0;
        if (iM12028E > 0) {
            int i10 = this.f33306p0;
            int i11 = this.f33308r0;
            if (iM12028E <= i10 - i11) {
                C11042g c11042gM12020j = C11042g.m12020j(bArr, i11, iM12028E);
                this.f33308r0 += iM12028E;
                return c11042gM12020j;
            }
        }
        if (iM12028E == 0) {
            return C11042g.f33300o0;
        }
        if (iM12028E > 0) {
            int i12 = this.f33306p0;
            int i13 = this.f33308r0;
            if (iM12028E <= i12 - i13) {
                int i14 = iM12028E + i13;
                this.f33308r0 = i14;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, i14);
            } else {
                if (iM12028E <= 0) {
                    throw C11005A.m11847e();
                }
                if (iM12028E == 0) {
                    throw C11005A.m11846d();
                }
                bArrCopyOfRange = AbstractC11063y.f33344b;
            }
        } else {
            if (iM12028E <= 0) {
                throw C11005A.m11847e();
            }
            if (iM12028E == 0) {
                throw C11005A.m11846d();
            }
            bArrCopyOfRange = AbstractC11063y.f33344b;
        }
        C11042g c11042g = C11042g.f33300o0;
        return new C11042g(bArrCopyOfRange);
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: m */
    public final double mo1623m() {
        return Double.longBitsToDouble(m12027D());
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: n */
    public final int mo1624n() {
        return m12028E();
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: o */
    public final int mo1625o() {
        return m12026C();
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: p */
    public final long mo1626p() {
        return m12027D();
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: q */
    public final float mo1627q() {
        return Float.intBitsToFloat(m12026C());
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: r */
    public final int mo1628r() {
        return m12028E();
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: s */
    public final long mo1629s() {
        return m12029F();
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: t */
    public final int mo1630t() {
        return m12026C();
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: u */
    public final long mo1631u() {
        return m12027D();
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: v */
    public final int mo1632v() {
        int iM12028E = m12028E();
        return (-(iM12028E & 1)) ^ (iM12028E >>> 1);
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: w */
    public final long mo1633w() {
        long jM12029F = m12029F();
        return (-(jM12029F & 1)) ^ (jM12029F >>> 1);
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: x */
    public final String mo1634x() throws C11005A {
        int iM12028E = m12028E();
        if (iM12028E > 0) {
            int i10 = this.f33306p0;
            int i11 = this.f33308r0;
            if (iM12028E <= i10 - i11) {
                String str = new String(this.f33305o0, i11, iM12028E, AbstractC11063y.f33343a);
                this.f33308r0 += iM12028E;
                return str;
            }
        }
        if (iM12028E == 0) {
            return "";
        }
        if (iM12028E < 0) {
            throw C11005A.m11846d();
        }
        throw C11005A.m11847e();
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: y */
    public final String mo1635y() throws C11005A {
        int iM12028E = m12028E();
        if (iM12028E > 0) {
            int i10 = this.f33306p0;
            int i11 = this.f33308r0;
            if (iM12028E <= i10 - i11) {
                String strM12024b = AbstractC11047i0.f33320a.m12024b(this.f33305o0, i11, iM12028E);
                this.f33308r0 += iM12028E;
                return strM12024b;
            }
        }
        if (iM12028E == 0) {
            return "";
        }
        if (iM12028E <= 0) {
            throw C11005A.m11846d();
        }
        throw C11005A.m11847e();
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: z */
    public final int mo1636z() throws C11005A {
        if (mo1614c()) {
            this.f33310t0 = 0;
            return 0;
        }
        int iM12028E = m12028E();
        this.f33310t0 = iM12028E;
        if ((iM12028E >>> 3) != 0) {
            return iM12028E;
        }
        throw new C11005A("Protocol message contained an invalid tag (zero).");
    }
}
