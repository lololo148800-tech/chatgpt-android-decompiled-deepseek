package com.google.protobuf;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.protobuf.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C12177o extends AbstractC12186r {

    /* JADX INFO: renamed from: c */
    public final byte[] f37052c;

    /* JADX INFO: renamed from: d */
    public int f37053d;

    /* JADX INFO: renamed from: e */
    public int f37054e;

    /* JADX INFO: renamed from: f */
    public int f37055f;

    /* JADX INFO: renamed from: g */
    public final int f37056g;

    /* JADX INFO: renamed from: h */
    public int f37057h;

    /* JADX INFO: renamed from: i */
    public int f37058i = Integer.MAX_VALUE;

    public C12177o(byte[] bArr, int i10, int i11, boolean z6) {
        this.f37052c = bArr;
        this.f37053d = i11 + i10;
        this.f37055f = i10;
        this.f37056g = i10;
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: A */
    public final int mo14015A() {
        return AbstractC12186r.m14084c(mo14046w());
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: B */
    public final long mo14016B() {
        return AbstractC12186r.m14085d(m14025K());
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: C */
    public final String mo14017C() throws C12181p0 {
        int iMo14046w = mo14046w();
        if (iMo14046w > 0) {
            int i10 = this.f37053d;
            int i11 = this.f37055f;
            if (iMo14046w <= i10 - i11) {
                String str = new String(this.f37052c, i11, iMo14046w, AbstractC12175n0.f37050a);
                this.f37055f += iMo14046w;
                return str;
            }
        }
        if (iMo14046w == 0) {
            return "";
        }
        if (iMo14046w < 0) {
            throw C12181p0.m14064e();
        }
        throw C12181p0.m14066g();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: D */
    public final String mo14018D() throws C12181p0 {
        int iMo14046w = mo14046w();
        if (iMo14046w > 0) {
            int i10 = this.f37053d;
            int i11 = this.f37055f;
            if (iMo14046w <= i10 - i11) {
                String strMo13991K = AbstractC12077B1.f36870a.mo13991K(this.f37052c, i11, iMo14046w);
                this.f37055f += iMo14046w;
                return strMo13991K;
            }
        }
        if (iMo14046w == 0) {
            return "";
        }
        if (iMo14046w <= 0) {
            throw C12181p0.m14064e();
        }
        throw C12181p0.m14066g();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: E */
    public final int mo14019E() throws C12181p0 {
        if (mo14032g()) {
            this.f37057h = 0;
            return 0;
        }
        int iMo14046w = mo14046w();
        this.f37057h = iMo14046w;
        if ((iMo14046w >>> 3) != 0) {
            return iMo14046w;
        }
        throw C12181p0.m14060a();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: F */
    public final int mo14020F() {
        return mo14046w();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: G */
    public final long mo14021G() {
        return m14025K();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: H */
    public final boolean mo14022H(int i10) throws C12181p0 {
        int iMo14019E;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            int i13 = this.f37053d - this.f37055f;
            byte[] bArr = this.f37052c;
            if (i13 >= 10) {
                while (i12 < 10) {
                    int i14 = this.f37055f;
                    this.f37055f = i14 + 1;
                    if (bArr[i14] < 0) {
                        i12++;
                    }
                }
                throw C12181p0.m14063d();
            }
            while (i12 < 10) {
                int i15 = this.f37055f;
                if (i15 == this.f37053d) {
                    throw C12181p0.m14066g();
                }
                this.f37055f = i15 + 1;
                if (bArr[i15] < 0) {
                    i12++;
                }
            }
            throw C12181p0.m14063d();
            return true;
        }
        if (i11 == 1) {
            m14028N(8);
            return true;
        }
        if (i11 == 2) {
            m14028N(mo14046w());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw C12181p0.m14062c();
            }
            m14028N(4);
            return true;
        }
        do {
            iMo14019E = mo14019E();
            if (iMo14019E == 0) {
                break;
            }
        } while (mo14022H(iMo14019E));
        mo14029a(((i10 >>> 3) << 3) | 4);
        return true;
    }

    /* JADX INFO: renamed from: I */
    public final int m14023I() throws C12181p0 {
        int i10 = this.f37055f;
        if (this.f37053d - i10 < 4) {
            throw C12181p0.m14066g();
        }
        this.f37055f = i10 + 4;
        byte[] bArr = this.f37052c;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: J */
    public final long m14024J() throws C12181p0 {
        int i10 = this.f37055f;
        if (this.f37053d - i10 < 8) {
            throw C12181p0.m14066g();
        }
        this.f37055f = i10 + 8;
        byte[] bArr = this.f37052c;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: K */
    public final long m14025K() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f37055f;
        int i11 = this.f37053d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f37052c;
            byte b = bArr[i10];
            if (b >= 0) {
                this.f37055f = i12;
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
                this.f37055f = i13;
                return j10;
            }
        }
        return m14026L();
    }

    /* JADX INFO: renamed from: L */
    public final long m14026L() throws C12181p0 {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f37055f;
            if (i11 == this.f37053d) {
                throw C12181p0.m14066g();
            }
            this.f37055f = i11 + 1;
            byte b = this.f37052c[i11];
            j10 |= ((long) (b & 127)) << i10;
            if ((b & 128) == 0) {
                return j10;
            }
        }
        throw C12181p0.m14063d();
    }

    /* JADX INFO: renamed from: M */
    public final void m14027M() {
        int i10 = this.f37053d + this.f37054e;
        this.f37053d = i10;
        int i11 = i10 - this.f37056g;
        int i12 = this.f37058i;
        if (i11 <= i12) {
            this.f37054e = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f37054e = i13;
        this.f37053d = i10 - i13;
    }

    /* JADX INFO: renamed from: N */
    public final void m14028N(int i10) throws C12181p0 {
        if (i10 >= 0) {
            int i11 = this.f37053d;
            int i12 = this.f37055f;
            if (i10 <= i11 - i12) {
                this.f37055f = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw C12181p0.m14066g();
        }
        throw C12181p0.m14064e();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: a */
    public final void mo14029a(int i10) throws C12181p0 {
        if (this.f37057h != i10) {
            throw new C12181p0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: e */
    public final int mo14030e() {
        int i10 = this.f37058i;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - mo14031f();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: f */
    public final int mo14031f() {
        return this.f37055f - this.f37056g;
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: g */
    public final boolean mo14032g() {
        return this.f37055f == this.f37053d;
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: j */
    public final void mo14033j(int i10) {
        this.f37058i = i10;
        m14027M();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: k */
    public final int mo14034k(int i10) throws C12181p0 {
        if (i10 < 0) {
            throw C12181p0.m14064e();
        }
        int iMo14031f = mo14031f() + i10;
        if (iMo14031f < 0) {
            throw C12181p0.m14065f();
        }
        int i11 = this.f37058i;
        if (iMo14031f > i11) {
            throw C12181p0.m14066g();
        }
        this.f37058i = iMo14031f;
        m14027M();
        return i11;
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: l */
    public final boolean mo14035l() {
        return m14025K() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: m */
    public final C12168l mo14036m() throws C12181p0 {
        byte[] bArrCopyOfRange;
        int iMo14046w = mo14046w();
        byte[] bArr = this.f37052c;
        if (iMo14046w > 0) {
            int i10 = this.f37053d;
            int i11 = this.f37055f;
            if (iMo14046w <= i10 - i11) {
                C12168l c12168lM14010j = AbstractC12171m.m14010j(bArr, i11, iMo14046w);
                this.f37055f += iMo14046w;
                return c12168lM14010j;
            }
        }
        if (iMo14046w == 0) {
            return AbstractC12171m.f37047Z;
        }
        if (iMo14046w > 0) {
            int i12 = this.f37053d;
            int i13 = this.f37055f;
            if (iMo14046w <= i12 - i13) {
                int i14 = iMo14046w + i13;
                this.f37055f = i14;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, i14);
            } else {
                if (iMo14046w <= 0) {
                    throw C12181p0.m14066g();
                }
                if (iMo14046w == 0) {
                    throw C12181p0.m14064e();
                }
                bArrCopyOfRange = AbstractC12175n0.f37051b;
            }
        } else {
            if (iMo14046w <= 0) {
                throw C12181p0.m14066g();
            }
            if (iMo14046w == 0) {
                throw C12181p0.m14064e();
            }
            bArrCopyOfRange = AbstractC12175n0.f37051b;
        }
        C12168l c12168l = AbstractC12171m.f37047Z;
        return new C12168l(bArrCopyOfRange);
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: n */
    public final double mo14037n() {
        return Double.longBitsToDouble(m14024J());
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: o */
    public final int mo14038o() {
        return mo14046w();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: p */
    public final int mo14039p() {
        return m14023I();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: q */
    public final long mo14040q() {
        return m14024J();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: r */
    public final float mo14041r() {
        return Float.intBitsToFloat(m14023I());
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: s */
    public final void mo14042s(int i10, InterfaceC12088F0 interfaceC12088F0, C12087F c12087f) throws C12181p0 {
        m14089b();
        this.f37094a++;
        ((AbstractC12121T) interfaceC12088F0).m13864e(this, c12087f);
        mo14029a((i10 << 3) | 4);
        this.f37094a--;
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: t */
    public final int mo14043t() {
        return mo14046w();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: u */
    public final long mo14044u() {
        return m14025K();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: v */
    public final void mo14045v(InterfaceC12088F0 interfaceC12088F0, C12087F c12087f) throws C12181p0 {
        int iMo14046w = mo14046w();
        m14089b();
        int iMo14034k = mo14034k(iMo14046w);
        this.f37094a++;
        ((AbstractC12121T) interfaceC12088F0).m13864e(this, c12087f);
        mo14029a(0);
        this.f37094a--;
        if (mo14030e() != 0) {
            throw C12181p0.m14066g();
        }
        mo14033j(iMo14034k);
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: w */
    public final int mo14046w() {
        int i10;
        int i11 = this.f37055f;
        int i12 = this.f37053d;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f37052c;
            byte b = bArr[i11];
            if (b >= 0) {
                this.f37055f = i13;
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
                this.f37055f = i14;
                return i10;
            }
        }
        return (int) m14026L();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: y */
    public final int mo14047y() {
        return m14023I();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: z */
    public final long mo14048z() {
        return m14024J();
    }
}
