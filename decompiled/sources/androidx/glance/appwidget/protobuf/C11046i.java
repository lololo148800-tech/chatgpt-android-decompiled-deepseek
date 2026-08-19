package androidx.glance.appwidget.protobuf;

import io.sentry.instrumentation.file.C15378c;
import java.nio.charset.Charset;
import java.util.ArrayList;
import p001A.AbstractC0010F;
import p030B2.AbstractC0754e0;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.i */
/* JADX INFO: loaded from: classes.dex */
public final class C11046i extends AbstractC0754e0 {

    /* JADX INFO: renamed from: o0 */
    public final C15378c f33312o0;

    /* JADX INFO: renamed from: p0 */
    public final byte[] f33313p0;

    /* JADX INFO: renamed from: q0 */
    public int f33314q0;

    /* JADX INFO: renamed from: r0 */
    public int f33315r0;

    /* JADX INFO: renamed from: s0 */
    public int f33316s0;

    /* JADX INFO: renamed from: t0 */
    public int f33317t0;

    /* JADX INFO: renamed from: u0 */
    public int f33318u0;

    /* JADX INFO: renamed from: v0 */
    public int f33319v0 = Integer.MAX_VALUE;

    public C11046i(C15378c c15378c) {
        Charset charset = AbstractC11063y.f33343a;
        this.f33312o0 = c15378c;
        this.f33313p0 = new byte[4096];
        this.f33314q0 = 0;
        this.f33316s0 = 0;
        this.f33318u0 = 0;
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: A */
    public final int mo1610A() {
        return m12037H();
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: B */
    public final long mo1611B() {
        return m12038I();
    }

    /* JADX INFO: renamed from: C */
    public final byte[] m12032C(int i10) throws C11005A {
        byte[] bArrM12033D = m12033D(i10);
        if (bArrM12033D != null) {
            return bArrM12033D;
        }
        int i11 = this.f33316s0;
        int i12 = this.f33314q0;
        int length = i12 - i11;
        this.f33318u0 += i12;
        this.f33316s0 = 0;
        this.f33314q0 = 0;
        ArrayList<byte[]> arrayListM12034E = m12034E(i10 - length);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f33313p0, i11, bArr, 0, length);
        for (byte[] bArr2 : arrayListM12034E) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: D */
    public final byte[] m12033D(int i10) throws C11005A {
        if (i10 == 0) {
            return AbstractC11063y.f33344b;
        }
        if (i10 < 0) {
            throw C11005A.m11846d();
        }
        int i11 = this.f33318u0;
        int i12 = this.f33316s0;
        int i13 = i11 + i12 + i10;
        if (i13 - Integer.MAX_VALUE > 0) {
            throw new C11005A("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i14 = this.f33319v0;
        if (i13 > i14) {
            m12042M((i14 - i11) - i12);
            throw C11005A.m11847e();
        }
        int i15 = this.f33314q0 - i12;
        int i16 = i10 - i15;
        C15378c c15378c = this.f33312o0;
        if (i16 >= 4096) {
            try {
                if (i16 > c15378c.available()) {
                    return null;
                }
            } catch (C11005A e10) {
                e10.f33223Y = true;
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f33313p0, this.f33316s0, bArr, 0, i15);
        this.f33318u0 += this.f33314q0;
        this.f33316s0 = 0;
        this.f33314q0 = 0;
        while (i15 < i10) {
            try {
                int i17 = c15378c.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw C11005A.m11847e();
                }
                this.f33318u0 += i17;
                i15 += i17;
            } catch (C11005A e11) {
                e11.f33223Y = true;
                throw e11;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: E */
    public final ArrayList m12034E(int i10) throws C11005A {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.f33312o0.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw C11005A.m11847e();
                }
                this.f33318u0 += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F */
    public final int m12035F() throws C11005A {
        int i10 = this.f33316s0;
        if (this.f33314q0 - i10 < 4) {
            m12041L(4);
            i10 = this.f33316s0;
        }
        this.f33316s0 = i10 + 4;
        byte[] bArr = this.f33313p0;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: G */
    public final long m12036G() throws C11005A {
        int i10 = this.f33316s0;
        if (this.f33314q0 - i10 < 8) {
            m12041L(8);
            i10 = this.f33316s0;
        }
        this.f33316s0 = i10 + 8;
        byte[] bArr = this.f33313p0;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: H */
    public final int m12037H() {
        int i10;
        int i11 = this.f33316s0;
        int i12 = this.f33314q0;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f33313p0;
            byte b = bArr[i11];
            if (b >= 0) {
                this.f33316s0 = i13;
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
                this.f33316s0 = i14;
                return i10;
            }
        }
        return (int) m12039J();
    }

    /* JADX INFO: renamed from: I */
    public final long m12038I() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f33316s0;
        int i11 = this.f33314q0;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f33313p0;
            byte b = bArr[i10];
            if (b >= 0) {
                this.f33316s0 = i12;
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
                this.f33316s0 = i13;
                return j10;
            }
        }
        return m12039J();
    }

    /* JADX INFO: renamed from: J */
    public final long m12039J() throws C11005A {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f33316s0 == this.f33314q0) {
                m12041L(1);
            }
            int i11 = this.f33316s0;
            this.f33316s0 = i11 + 1;
            byte b = this.f33313p0[i11];
            j10 |= ((long) (b & 127)) << i10;
            if ((b & 128) == 0) {
                return j10;
            }
        }
        throw C11005A.m11845c();
    }

    /* JADX INFO: renamed from: K */
    public final void m12040K() {
        int i10 = this.f33314q0 + this.f33315r0;
        this.f33314q0 = i10;
        int i11 = this.f33318u0 + i10;
        int i12 = this.f33319v0;
        if (i11 <= i12) {
            this.f33315r0 = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f33315r0 = i13;
        this.f33314q0 = i10 - i13;
    }

    /* JADX INFO: renamed from: L */
    public final void m12041L(int i10) throws C11005A {
        if (m12043N(i10)) {
            return;
        }
        if (i10 <= (Integer.MAX_VALUE - this.f33318u0) - this.f33316s0) {
            throw C11005A.m11847e();
        }
        throw new C11005A("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: M */
    public final void m12042M(int i10) throws C11005A {
        int i11 = this.f33314q0;
        int i12 = this.f33316s0;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f33316s0 = i12 + i10;
            return;
        }
        C15378c c15378c = this.f33312o0;
        if (i10 < 0) {
            throw C11005A.m11846d();
        }
        int i14 = this.f33318u0;
        int i15 = i14 + i12;
        int i16 = i15 + i10;
        int i17 = this.f33319v0;
        if (i16 > i17) {
            m12042M((i17 - i14) - i12);
            throw C11005A.m11847e();
        }
        this.f33318u0 = i15;
        this.f33314q0 = 0;
        this.f33316s0 = 0;
        while (i13 < i10) {
            long j10 = i10 - i13;
            try {
                try {
                    long jSkip = c15378c.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        throw new IllegalStateException(C15378c.class + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i13 += (int) jSkip;
                    }
                } catch (C11005A e10) {
                    e10.f33223Y = true;
                    throw e10;
                }
            } catch (Throwable th2) {
                this.f33318u0 += i13;
                m12040K();
                throw th2;
            }
        }
        this.f33318u0 += i13;
        m12040K();
        if (i13 >= i10) {
            return;
        }
        int i18 = this.f33314q0;
        int i19 = i18 - this.f33316s0;
        this.f33316s0 = i18;
        m12041L(1);
        while (true) {
            int i20 = i10 - i19;
            int i21 = this.f33314q0;
            if (i20 <= i21) {
                this.f33316s0 = i20;
                return;
            } else {
                i19 += i21;
                this.f33316s0 = i21;
                m12041L(1);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final boolean m12043N(int i10) throws C11005A {
        int i11 = this.f33316s0;
        int i12 = i11 + i10;
        int i13 = this.f33314q0;
        if (i12 <= i13) {
            throw new IllegalStateException(AbstractC0010F.m19c(i10, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i14 = this.f33318u0;
        if (i10 > (Integer.MAX_VALUE - i14) - i11 || i14 + i11 + i10 > this.f33319v0) {
            return false;
        }
        byte[] bArr = this.f33313p0;
        if (i11 > 0) {
            if (i13 > i11) {
                System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
            }
            this.f33318u0 += i11;
            this.f33314q0 -= i11;
            this.f33316s0 = 0;
        }
        int i15 = this.f33314q0;
        int iMin = Math.min(bArr.length - i15, (Integer.MAX_VALUE - this.f33318u0) - i15);
        C15378c c15378c = this.f33312o0;
        try {
            int i16 = c15378c.read(bArr, i15, iMin);
            if (i16 == 0 || i16 < -1 || i16 > bArr.length) {
                throw new IllegalStateException(c15378c.getClass() + "#read(byte[]) returned invalid result: " + i16 + "\nThe InputStream implementation is buggy.");
            }
            if (i16 <= 0) {
                return false;
            }
            this.f33314q0 += i16;
            m12040K();
            if (this.f33314q0 >= i10) {
                return true;
            }
            return m12043N(i10);
        } catch (C11005A e10) {
            e10.f33223Y = true;
            throw e10;
        }
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: a */
    public final void mo1612a(int i10) throws C11005A {
        if (this.f33317t0 != i10) {
            throw new C11005A("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: b */
    public final int mo1613b() {
        return this.f33318u0 + this.f33316s0;
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: c */
    public final boolean mo1614c() {
        return this.f33316s0 == this.f33314q0 && !m12043N(1);
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: h */
    public final void mo1619h(int i10) {
        this.f33319v0 = i10;
        m12040K();
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: i */
    public final int mo1620i(int i10) throws C11005A {
        if (i10 < 0) {
            throw C11005A.m11846d();
        }
        int i11 = this.f33318u0 + this.f33316s0 + i10;
        if (i11 < 0) {
            throw new C11005A("Failed to parse the message.");
        }
        int i12 = this.f33319v0;
        if (i11 > i12) {
            throw C11005A.m11847e();
        }
        this.f33319v0 = i11;
        m12040K();
        return i12;
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: j */
    public final boolean mo1621j() {
        return m12038I() != 0;
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: k */
    public final C11042g mo1622k() throws C11005A {
        int iM12037H = m12037H();
        int i10 = this.f33314q0;
        int i11 = this.f33316s0;
        int i12 = i10 - i11;
        byte[] bArr = this.f33313p0;
        if (iM12037H <= i12 && iM12037H > 0) {
            C11042g c11042gM12020j = C11042g.m12020j(bArr, i11, iM12037H);
            this.f33316s0 += iM12037H;
            return c11042gM12020j;
        }
        if (iM12037H == 0) {
            return C11042g.f33300o0;
        }
        if (iM12037H < 0) {
            throw C11005A.m11846d();
        }
        byte[] bArrM12033D = m12033D(iM12037H);
        if (bArrM12033D != null) {
            return C11042g.m12020j(bArrM12033D, 0, bArrM12033D.length);
        }
        int i13 = this.f33316s0;
        int i14 = this.f33314q0;
        int length = i14 - i13;
        this.f33318u0 += i14;
        this.f33316s0 = 0;
        this.f33314q0 = 0;
        ArrayList<byte[]> arrayListM12034E = m12034E(iM12037H - length);
        byte[] bArr2 = new byte[iM12037H];
        System.arraycopy(bArr, i13, bArr2, 0, length);
        for (byte[] bArr3 : arrayListM12034E) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C11042g c11042g = C11042g.f33300o0;
        return new C11042g(bArr2);
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: m */
    public final double mo1623m() {
        return Double.longBitsToDouble(m12036G());
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: n */
    public final int mo1624n() {
        return m12037H();
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: o */
    public final int mo1625o() {
        return m12035F();
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: p */
    public final long mo1626p() {
        return m12036G();
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: q */
    public final float mo1627q() {
        return Float.intBitsToFloat(m12035F());
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: r */
    public final int mo1628r() {
        return m12037H();
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: s */
    public final long mo1629s() {
        return m12038I();
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: t */
    public final int mo1630t() {
        return m12035F();
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: u */
    public final long mo1631u() {
        return m12036G();
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: v */
    public final int mo1632v() {
        int iM12037H = m12037H();
        return (-(iM12037H & 1)) ^ (iM12037H >>> 1);
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: w */
    public final long mo1633w() {
        long jM12038I = m12038I();
        return (-(jM12038I & 1)) ^ (jM12038I >>> 1);
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: x */
    public final String mo1634x() throws C11005A {
        int iM12037H = m12037H();
        byte[] bArr = this.f33313p0;
        if (iM12037H > 0) {
            int i10 = this.f33314q0;
            int i11 = this.f33316s0;
            if (iM12037H <= i10 - i11) {
                String str = new String(bArr, i11, iM12037H, AbstractC11063y.f33343a);
                this.f33316s0 += iM12037H;
                return str;
            }
        }
        if (iM12037H == 0) {
            return "";
        }
        if (iM12037H < 0) {
            throw C11005A.m11846d();
        }
        if (iM12037H > this.f33314q0) {
            return new String(m12032C(iM12037H), AbstractC11063y.f33343a);
        }
        m12041L(iM12037H);
        String str2 = new String(bArr, this.f33316s0, iM12037H, AbstractC11063y.f33343a);
        this.f33316s0 += iM12037H;
        return str2;
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: y */
    public final String mo1635y() throws C11005A {
        int iM12037H = m12037H();
        int i10 = this.f33316s0;
        int i11 = this.f33314q0;
        int i12 = i11 - i10;
        byte[] bArrM12032C = this.f33313p0;
        if (iM12037H <= i12 && iM12037H > 0) {
            this.f33316s0 = i10 + iM12037H;
        } else {
            if (iM12037H == 0) {
                return "";
            }
            if (iM12037H < 0) {
                throw C11005A.m11846d();
            }
            i10 = 0;
            if (iM12037H <= i11) {
                m12041L(iM12037H);
                this.f33316s0 = iM12037H;
            } else {
                bArrM12032C = m12032C(iM12037H);
            }
        }
        return AbstractC11047i0.f33320a.m12024b(bArrM12032C, i10, iM12037H);
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: z */
    public final int mo1636z() throws C11005A {
        if (mo1614c()) {
            this.f33317t0 = 0;
            return 0;
        }
        int iM12037H = m12037H();
        this.f33317t0 = iM12037H;
        if ((iM12037H >>> 3) != 0) {
            return iM12037H;
        }
        throw new C11005A("Protocol message contained an invalid tag (zero).");
    }
}
