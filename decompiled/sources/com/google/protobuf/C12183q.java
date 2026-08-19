package com.google.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.protobuf.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C12183q extends AbstractC12186r {

    /* JADX INFO: renamed from: c */
    public final ByteBuffer f37074c;

    /* JADX INFO: renamed from: d */
    public final long f37075d;

    /* JADX INFO: renamed from: e */
    public long f37076e;

    /* JADX INFO: renamed from: f */
    public long f37077f;

    /* JADX INFO: renamed from: g */
    public final long f37078g;

    /* JADX INFO: renamed from: h */
    public int f37079h;

    /* JADX INFO: renamed from: i */
    public int f37080i;

    /* JADX INFO: renamed from: j */
    public int f37081j = Integer.MAX_VALUE;

    public C12183q(ByteBuffer byteBuffer, boolean z6) {
        this.f37074c = byteBuffer;
        long jM14172j = AbstractC12209y1.f37124c.m14172j(AbstractC12209y1.f37128g, byteBuffer);
        this.f37075d = jM14172j;
        this.f37076e = ((long) byteBuffer.limit()) + jM14172j;
        long jPosition = jM14172j + ((long) byteBuffer.position());
        this.f37077f = jPosition;
        this.f37078g = jPosition;
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: A */
    public final int mo14015A() {
        return AbstractC12186r.m14084c(mo14046w());
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: B */
    public final long mo14016B() {
        return AbstractC12186r.m14085d(m14076K());
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: C */
    public final String mo14017C() throws C12181p0 {
        int iMo14046w = mo14046w();
        if (iMo14046w > 0) {
            long j10 = this.f37076e;
            long j11 = this.f37077f;
            if (iMo14046w <= ((int) (j10 - j11))) {
                byte[] bArr = new byte[iMo14046w];
                long j12 = iMo14046w;
                AbstractC12209y1.f37124c.mo14155c(j11, bArr, j12);
                String str = new String(bArr, AbstractC12175n0.f37050a);
                this.f37077f += j12;
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
        String strMo13992M;
        int iMo14046w = mo14046w();
        if (iMo14046w > 0) {
            long j10 = this.f37076e;
            long j11 = this.f37077f;
            if (iMo14046w <= ((int) (j10 - j11))) {
                int i10 = (int) (j11 - this.f37075d);
                AbstractC12153g abstractC12153g = AbstractC12077B1.f36870a;
                abstractC12153g.getClass();
                ByteBuffer byteBuffer = this.f37074c;
                if (byteBuffer.hasArray()) {
                    strMo13992M = abstractC12153g.mo13991K(byteBuffer.array(), byteBuffer.arrayOffset() + i10, iMo14046w);
                } else {
                    strMo13992M = byteBuffer.isDirect() ? abstractC12153g.mo13992M(i10, iMo14046w, byteBuffer) : AbstractC12153g.m13953L(i10, iMo14046w, byteBuffer);
                }
                this.f37077f += (long) iMo14046w;
                return strMo13992M;
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
            this.f37080i = 0;
            return 0;
        }
        int iMo14046w = mo14046w();
        this.f37080i = iMo14046w;
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
        return m14076K();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: H */
    public final boolean mo14022H(int i10) throws C12181p0 {
        int iMo14019E;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (((int) (this.f37076e - this.f37077f)) >= 10) {
                while (i12 < 10) {
                    long j10 = this.f37077f;
                    this.f37077f = j10 + 1;
                    if (AbstractC12209y1.f37124c.mo14157e(j10) < 0) {
                        i12++;
                    }
                }
                throw C12181p0.m14063d();
            }
            while (i12 < 10) {
                long j11 = this.f37077f;
                if (j11 == this.f37076e) {
                    throw C12181p0.m14066g();
                }
                this.f37077f = j11 + 1;
                if (AbstractC12209y1.f37124c.mo14157e(j11) < 0) {
                    i12++;
                }
            }
            throw C12181p0.m14063d();
            return true;
        }
        if (i11 == 1) {
            m14079N(8);
            return true;
        }
        if (i11 == 2) {
            m14079N(mo14046w());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw C12181p0.m14062c();
            }
            m14079N(4);
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
    public final int m14074I() throws C12181p0 {
        long j10 = this.f37077f;
        if (this.f37076e - j10 < 4) {
            throw C12181p0.m14066g();
        }
        this.f37077f = 4 + j10;
        AbstractC12206x1 abstractC12206x1 = AbstractC12209y1.f37124c;
        return ((abstractC12206x1.mo14157e(j10 + 3) & 255) << 24) | (abstractC12206x1.mo14157e(j10) & 255) | ((abstractC12206x1.mo14157e(1 + j10) & 255) << 8) | ((abstractC12206x1.mo14157e(2 + j10) & 255) << 16);
    }

    /* JADX INFO: renamed from: J */
    public final long m14075J() throws C12181p0 {
        long j10 = this.f37077f;
        if (this.f37076e - j10 < 8) {
            throw C12181p0.m14066g();
        }
        this.f37077f = 8 + j10;
        AbstractC12206x1 abstractC12206x1 = AbstractC12209y1.f37124c;
        return ((((long) abstractC12206x1.mo14157e(j10 + 7)) & 255) << 56) | (((long) abstractC12206x1.mo14157e(j10)) & 255) | ((((long) abstractC12206x1.mo14157e(1 + j10)) & 255) << 8) | ((((long) abstractC12206x1.mo14157e(2 + j10)) & 255) << 16) | ((((long) abstractC12206x1.mo14157e(3 + j10)) & 255) << 24) | ((((long) abstractC12206x1.mo14157e(4 + j10)) & 255) << 32) | ((((long) abstractC12206x1.mo14157e(5 + j10)) & 255) << 40) | ((((long) abstractC12206x1.mo14157e(6 + j10)) & 255) << 48);
    }

    /* JADX INFO: renamed from: K */
    public final long m14076K() {
        long j10;
        long j11;
        long j12;
        int i10;
        long j13 = this.f37077f;
        if (this.f37076e != j13) {
            long j14 = 1 + j13;
            AbstractC12206x1 abstractC12206x1 = AbstractC12209y1.f37124c;
            byte bMo14157e = abstractC12206x1.mo14157e(j13);
            if (bMo14157e >= 0) {
                this.f37077f = j14;
                return bMo14157e;
            }
            if (this.f37076e - j14 >= 9) {
                long j15 = 2 + j13;
                int iMo14157e = (abstractC12206x1.mo14157e(j14) << 7) ^ bMo14157e;
                if (iMo14157e >= 0) {
                    long j16 = 3 + j13;
                    int iMo14157e2 = iMo14157e ^ (abstractC12206x1.mo14157e(j15) << 14);
                    if (iMo14157e2 < 0) {
                        j15 = j13 + 4;
                        int iMo14157e3 = iMo14157e2 ^ (abstractC12206x1.mo14157e(j16) << 21);
                        if (iMo14157e3 < 0) {
                            i10 = (-2080896) ^ iMo14157e3;
                        } else {
                            j16 = 5 + j13;
                            long jMo14157e = ((long) iMo14157e3) ^ (((long) abstractC12206x1.mo14157e(j15)) << 28);
                            if (jMo14157e >= 0) {
                                j12 = 266354560;
                            } else {
                                long j17 = 6 + j13;
                                long jMo14157e2 = jMo14157e ^ (((long) abstractC12206x1.mo14157e(j16)) << 35);
                                if (jMo14157e2 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    j16 = 7 + j13;
                                    jMo14157e = jMo14157e2 ^ (((long) abstractC12206x1.mo14157e(j17)) << 42);
                                    if (jMo14157e >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        j17 = 8 + j13;
                                        jMo14157e2 = jMo14157e ^ (((long) abstractC12206x1.mo14157e(j16)) << 49);
                                        if (jMo14157e2 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            long j18 = j13 + 9;
                                            long jMo14157e3 = (jMo14157e2 ^ (((long) abstractC12206x1.mo14157e(j17)) << 56)) ^ 71499008037633920L;
                                            if (jMo14157e3 < 0) {
                                                long j19 = j13 + 10;
                                                if (abstractC12206x1.mo14157e(j18) >= 0) {
                                                    j15 = j19;
                                                    j10 = jMo14157e3;
                                                }
                                            } else {
                                                j10 = jMo14157e3;
                                                j15 = j18;
                                            }
                                        }
                                    }
                                }
                                j10 = j11 ^ jMo14157e2;
                                j15 = j17;
                            }
                            j10 = j12 ^ jMo14157e;
                        }
                        this.f37077f = j15;
                        return j10;
                    }
                    j10 = iMo14157e2 ^ 16256;
                    j15 = j16;
                    this.f37077f = j15;
                    return j10;
                }
                i10 = iMo14157e ^ (-128);
                j10 = i10;
                this.f37077f = j15;
                return j10;
            }
        }
        return m14077L();
    }

    /* JADX INFO: renamed from: L */
    public final long m14077L() throws C12181p0 {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            long j11 = this.f37077f;
            if (j11 == this.f37076e) {
                throw C12181p0.m14066g();
            }
            this.f37077f = 1 + j11;
            byte bMo14157e = AbstractC12209y1.f37124c.mo14157e(j11);
            j10 |= ((long) (bMo14157e & 127)) << i10;
            if ((bMo14157e & 128) == 0) {
                return j10;
            }
        }
        throw C12181p0.m14063d();
    }

    /* JADX INFO: renamed from: M */
    public final void m14078M() {
        long j10 = this.f37076e + ((long) this.f37079h);
        this.f37076e = j10;
        int i10 = (int) (j10 - this.f37078g);
        int i11 = this.f37081j;
        if (i10 <= i11) {
            this.f37079h = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f37079h = i12;
        this.f37076e = j10 - ((long) i12);
    }

    /* JADX INFO: renamed from: N */
    public final void m14079N(int i10) throws C12181p0 {
        if (i10 >= 0) {
            long j10 = this.f37076e;
            long j11 = this.f37077f;
            if (i10 <= ((int) (j10 - j11))) {
                this.f37077f = j11 + ((long) i10);
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
        if (this.f37080i != i10) {
            throw new C12181p0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: e */
    public final int mo14030e() {
        int i10 = this.f37081j;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - mo14031f();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: f */
    public final int mo14031f() {
        return (int) (this.f37077f - this.f37078g);
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: g */
    public final boolean mo14032g() {
        return this.f37077f == this.f37076e;
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: j */
    public final void mo14033j(int i10) {
        this.f37081j = i10;
        m14078M();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: k */
    public final int mo14034k(int i10) throws C12181p0 {
        if (i10 < 0) {
            throw C12181p0.m14064e();
        }
        int iMo14031f = mo14031f() + i10;
        int i11 = this.f37081j;
        if (iMo14031f > i11) {
            throw C12181p0.m14066g();
        }
        this.f37081j = iMo14031f;
        m14078M();
        return i11;
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: l */
    public final boolean mo14035l() {
        return m14076K() != 0;
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: m */
    public final C12168l mo14036m() throws C12181p0 {
        int iMo14046w = mo14046w();
        if (iMo14046w > 0) {
            long j10 = this.f37076e;
            long j11 = this.f37077f;
            if (iMo14046w <= ((int) (j10 - j11))) {
                byte[] bArr = new byte[iMo14046w];
                long j12 = iMo14046w;
                AbstractC12209y1.f37124c.mo14155c(j11, bArr, j12);
                this.f37077f += j12;
                C12168l c12168l = AbstractC12171m.f37047Z;
                return new C12168l(bArr);
            }
        }
        if (iMo14046w == 0) {
            return AbstractC12171m.f37047Z;
        }
        if (iMo14046w < 0) {
            throw C12181p0.m14064e();
        }
        throw C12181p0.m14066g();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: n */
    public final double mo14037n() {
        return Double.longBitsToDouble(m14075J());
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: o */
    public final int mo14038o() {
        return mo14046w();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: p */
    public final int mo14039p() {
        return m14074I();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: q */
    public final long mo14040q() {
        return m14075J();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: r */
    public final float mo14041r() {
        return Float.intBitsToFloat(m14074I());
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
        return m14076K();
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

    /* JADX WARN: Code duplicated, block: B:36:0x0099 A[PHI: r6
      0x0099: PHI (r6v7 long) = (r6v6 long), (r6v8 long), (r6v10 long) binds: [B:25:0x006d, B:29:0x0080, B:33:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r4.mo14157e(r8) < 0) goto L34;
     */
    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo14046w() {
        int i10;
        long j10 = this.f37077f;
        if (this.f37076e != j10) {
            long j11 = 1 + j10;
            AbstractC12206x1 abstractC12206x1 = AbstractC12209y1.f37124c;
            byte bMo14157e = abstractC12206x1.mo14157e(j10);
            if (bMo14157e >= 0) {
                this.f37077f = j11;
                return bMo14157e;
            }
            if (this.f37076e - j11 >= 9) {
                long j12 = 2 + j10;
                int iMo14157e = (abstractC12206x1.mo14157e(j11) << 7) ^ bMo14157e;
                if (iMo14157e < 0) {
                    i10 = iMo14157e ^ (-128);
                } else {
                    long j13 = 3 + j10;
                    int iMo14157e2 = iMo14157e ^ (abstractC12206x1.mo14157e(j12) << 14);
                    if (iMo14157e2 >= 0) {
                        i10 = iMo14157e2 ^ 16256;
                    } else {
                        j12 = j10 + 4;
                        int iMo14157e3 = iMo14157e2 ^ (abstractC12206x1.mo14157e(j13) << 21);
                        if (iMo14157e3 < 0) {
                            i10 = (-2080896) ^ iMo14157e3;
                        } else {
                            j13 = 5 + j10;
                            byte bMo14157e2 = abstractC12206x1.mo14157e(j12);
                            int i11 = (iMo14157e3 ^ (bMo14157e2 << 28)) ^ 266354560;
                            if (bMo14157e2 < 0) {
                                j12 = j10 + 6;
                                if (abstractC12206x1.mo14157e(j13) < 0) {
                                    j13 = 7 + j10;
                                    if (abstractC12206x1.mo14157e(j12) < 0) {
                                        j12 = j10 + 8;
                                        if (abstractC12206x1.mo14157e(j13) < 0) {
                                            long j14 = 9 + j10;
                                            if (abstractC12206x1.mo14157e(j12) < 0) {
                                                j12 = j10 + 10;
                                            } else {
                                                i10 = i11;
                                                j12 = j14;
                                            }
                                        } else {
                                            i10 = i11;
                                        }
                                    }
                                } else {
                                    i10 = i11;
                                }
                            }
                            i10 = i11;
                        }
                    }
                    j12 = j13;
                }
                this.f37077f = j12;
                return i10;
            }
        }
        return (int) m14077L();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: y */
    public final int mo14047y() {
        return m14074I();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: z */
    public final long mo14048z() {
        return m14075J();
    }
}
