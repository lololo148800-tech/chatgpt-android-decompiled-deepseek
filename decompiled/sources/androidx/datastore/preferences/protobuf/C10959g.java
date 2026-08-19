package androidx.datastore.preferences.protobuf;

import io.sentry.instrumentation.file.C15378c;
import java.nio.charset.Charset;
import java.util.ArrayList;
import p001A.AbstractC0010F;
import p370P0.C6277D;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g */
/* JADX INFO: loaded from: classes.dex */
public final class C10959g {

    /* JADX INFO: renamed from: a */
    public int f33035a;

    /* JADX INFO: renamed from: b */
    public C6277D f33036b;

    /* JADX INFO: renamed from: c */
    public final C15378c f33037c;

    /* JADX INFO: renamed from: d */
    public final byte[] f33038d;

    /* JADX INFO: renamed from: e */
    public int f33039e;

    /* JADX INFO: renamed from: f */
    public int f33040f;

    /* JADX INFO: renamed from: g */
    public int f33041g;

    /* JADX INFO: renamed from: h */
    public int f33042h;

    /* JADX INFO: renamed from: i */
    public int f33043i;

    /* JADX INFO: renamed from: j */
    public int f33044j = Integer.MAX_VALUE;

    public C10959g(C15378c c15378c) {
        Charset charset = AbstractC10993x.f33099a;
        this.f33037c = c15378c;
        this.f33038d = new byte[4096];
        this.f33039e = 0;
        this.f33041g = 0;
        this.f33043i = 0;
    }

    /* JADX INFO: renamed from: A */
    public final int m11582A() {
        return m11607s();
    }

    /* JADX INFO: renamed from: B */
    public final long m11583B() {
        return m11608t();
    }

    /* JADX INFO: renamed from: C */
    public final void m11584C() {
        int i10 = this.f33039e + this.f33040f;
        this.f33039e = i10;
        int i11 = this.f33043i + i10;
        int i12 = this.f33044j;
        if (i11 <= i12) {
            this.f33040f = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f33040f = i13;
        this.f33039e = i10 - i13;
    }

    /* JADX INFO: renamed from: D */
    public final void m11585D(int i10) {
        if (m11588G(i10)) {
            return;
        }
        if (i10 <= (Integer.MAX_VALUE - this.f33043i) - this.f33041g) {
            throw C10997z.m11731f();
        }
        throw new C10997z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: E */
    public final boolean m11586E(int i10) throws C10997z {
        int iM11614z;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            int i13 = this.f33039e - this.f33041g;
            byte[] bArr = this.f33038d;
            if (i13 >= 10) {
                while (i12 < 10) {
                    int i14 = this.f33041g;
                    this.f33041g = i14 + 1;
                    if (bArr[i14] < 0) {
                        i12++;
                    }
                }
                throw C10997z.m11728c();
            }
            while (i12 < 10) {
                if (this.f33041g == this.f33039e) {
                    m11585D(1);
                }
                int i15 = this.f33041g;
                this.f33041g = i15 + 1;
                if (bArr[i15] < 0) {
                    i12++;
                }
            }
            throw C10997z.m11728c();
            return true;
        }
        if (i11 == 1) {
            m11587F(8);
            return true;
        }
        if (i11 == 2) {
            m11587F(m11607s());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw C10997z.m11727b();
            }
            m11587F(4);
            return true;
        }
        do {
            iM11614z = m11614z();
            if (iM11614z == 0) {
                break;
            }
        } while (m11586E(iM11614z));
        m11589a(((i10 >>> 3) << 3) | 4);
        return true;
    }

    /* JADX INFO: renamed from: F */
    public final void m11587F(int i10) throws C10997z {
        int i11 = this.f33039e;
        int i12 = this.f33041g;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f33041g = i12 + i10;
            return;
        }
        C15378c c15378c = this.f33037c;
        if (i10 < 0) {
            throw C10997z.m11729d();
        }
        int i14 = this.f33043i;
        int i15 = i14 + i12;
        int i16 = i15 + i10;
        int i17 = this.f33044j;
        if (i16 > i17) {
            m11587F((i17 - i14) - i12);
            throw C10997z.m11731f();
        }
        this.f33043i = i15;
        this.f33039e = 0;
        this.f33041g = 0;
        while (i13 < i10) {
            long j10 = i10 - i13;
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
            } finally {
                this.f33043i += i13;
                m11584C();
            }
        }
        if (i13 >= i10) {
            return;
        }
        int i18 = this.f33039e;
        int i19 = i18 - this.f33041g;
        this.f33041g = i18;
        m11585D(1);
        while (true) {
            int i20 = i10 - i19;
            int i21 = this.f33039e;
            if (i20 <= i21) {
                this.f33041g = i20;
                return;
            } else {
                i19 += i21;
                this.f33041g = i21;
                m11585D(1);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final boolean m11588G(int i10) {
        int i11 = this.f33041g;
        int i12 = i11 + i10;
        int i13 = this.f33039e;
        if (i12 <= i13) {
            throw new IllegalStateException(AbstractC0010F.m19c(i10, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i14 = this.f33043i;
        if (i10 > (Integer.MAX_VALUE - i14) - i11 || i14 + i11 + i10 > this.f33044j) {
            return false;
        }
        byte[] bArr = this.f33038d;
        if (i11 > 0) {
            if (i13 > i11) {
                System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
            }
            this.f33043i += i11;
            this.f33039e -= i11;
            this.f33041g = 0;
        }
        int i15 = this.f33039e;
        int i16 = this.f33037c.read(bArr, i15, Math.min(bArr.length - i15, (Integer.MAX_VALUE - this.f33043i) - i15));
        if (i16 == 0 || i16 < -1 || i16 > bArr.length) {
            throw new IllegalStateException(C15378c.class + "#read(byte[]) returned invalid result: " + i16 + "\nThe InputStream implementation is buggy.");
        }
        if (i16 <= 0) {
            return false;
        }
        this.f33039e += i16;
        m11584C();
        if (this.f33039e >= i10) {
            return true;
        }
        return m11588G(i10);
    }

    /* JADX INFO: renamed from: a */
    public final void m11589a(int i10) {
        if (this.f33042h != i10) {
            throw new C10997z("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m11590b() {
        return this.f33043i + this.f33041g;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m11591c() {
        return this.f33041g == this.f33039e && !m11588G(1);
    }

    /* JADX INFO: renamed from: d */
    public final void m11592d(int i10) {
        this.f33044j = i10;
        m11584C();
    }

    /* JADX INFO: renamed from: e */
    public final int m11593e(int i10) {
        if (i10 < 0) {
            throw C10997z.m11729d();
        }
        int i11 = this.f33043i + this.f33041g + i10;
        int i12 = this.f33044j;
        if (i11 > i12) {
            throw C10997z.m11731f();
        }
        this.f33044j = i11;
        m11584C();
        return i12;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m11594f() {
        return m11608t() != 0;
    }

    /* JADX INFO: renamed from: g */
    public final double m11595g() {
        return Double.longBitsToDouble(m11606r());
    }

    /* JADX INFO: renamed from: h */
    public final int m11596h() {
        return m11607s();
    }

    /* JADX INFO: renamed from: i */
    public final int m11597i() {
        return m11605q();
    }

    /* JADX INFO: renamed from: j */
    public final long m11598j() {
        return m11606r();
    }

    /* JADX INFO: renamed from: k */
    public final float m11599k() {
        return Float.intBitsToFloat(m11605q());
    }

    /* JADX INFO: renamed from: l */
    public final int m11600l() {
        return m11607s();
    }

    /* JADX INFO: renamed from: m */
    public final long m11601m() {
        return m11608t();
    }

    /* JADX INFO: renamed from: n */
    public final byte[] m11602n(int i10) {
        byte[] bArrM11603o = m11603o(i10);
        if (bArrM11603o != null) {
            return bArrM11603o;
        }
        int i11 = this.f33041g;
        int i12 = this.f33039e;
        int length = i12 - i11;
        this.f33043i += i12;
        this.f33041g = 0;
        this.f33039e = 0;
        ArrayList<byte[]> arrayListM11604p = m11604p(i10 - length);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f33038d, i11, bArr, 0, length);
        for (byte[] bArr2 : arrayListM11604p) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: o */
    public final byte[] m11603o(int i10) {
        if (i10 == 0) {
            return AbstractC10993x.f33100b;
        }
        if (i10 < 0) {
            throw C10997z.m11729d();
        }
        int i11 = this.f33043i;
        int i12 = this.f33041g;
        int i13 = i11 + i12 + i10;
        if (i13 - Integer.MAX_VALUE > 0) {
            throw new C10997z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i14 = this.f33044j;
        if (i13 > i14) {
            m11587F((i14 - i11) - i12);
            throw C10997z.m11731f();
        }
        int i15 = this.f33039e - i12;
        int i16 = i10 - i15;
        C15378c c15378c = this.f33037c;
        if (i16 >= 4096 && i16 > c15378c.available()) {
            return null;
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f33038d, this.f33041g, bArr, 0, i15);
        this.f33043i += this.f33039e;
        this.f33041g = 0;
        this.f33039e = 0;
        while (i15 < i10) {
            int i17 = c15378c.read(bArr, i15, i10 - i15);
            if (i17 == -1) {
                throw C10997z.m11731f();
            }
            this.f33043i += i17;
            i15 += i17;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: p */
    public final ArrayList m11604p(int i10) {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.f33037c.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw C10997z.m11731f();
                }
                this.f33043i += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public final int m11605q() {
        int i10 = this.f33041g;
        if (this.f33039e - i10 < 4) {
            m11585D(4);
            i10 = this.f33041g;
        }
        this.f33041g = i10 + 4;
        byte[] bArr = this.f33038d;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: r */
    public final long m11606r() {
        int i10 = this.f33041g;
        if (this.f33039e - i10 < 8) {
            m11585D(8);
            i10 = this.f33041g;
        }
        this.f33041g = i10 + 8;
        byte[] bArr = this.f33038d;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: s */
    public final int m11607s() {
        int i10;
        int i11 = this.f33041g;
        int i12 = this.f33039e;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f33038d;
            byte b = bArr[i11];
            if (b >= 0) {
                this.f33041g = i13;
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
                this.f33041g = i14;
                return i10;
            }
        }
        return (int) m11609u();
    }

    /* JADX INFO: renamed from: t */
    public final long m11608t() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f33041g;
        int i11 = this.f33039e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f33038d;
            byte b = bArr[i10];
            if (b >= 0) {
                this.f33041g = i12;
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
                this.f33041g = i13;
                return j10;
            }
        }
        return m11609u();
    }

    /* JADX INFO: renamed from: u */
    public final long m11609u() throws C10997z {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f33041g == this.f33039e) {
                m11585D(1);
            }
            int i11 = this.f33041g;
            this.f33041g = i11 + 1;
            byte b = this.f33038d[i11];
            j10 |= ((long) (b & 127)) << i10;
            if ((b & 128) == 0) {
                return j10;
            }
        }
        throw C10997z.m11728c();
    }

    /* JADX INFO: renamed from: v */
    public final int m11610v() {
        return m11605q();
    }

    /* JADX INFO: renamed from: w */
    public final long m11611w() {
        return m11606r();
    }

    /* JADX INFO: renamed from: x */
    public final int m11612x() {
        int iM11607s = m11607s();
        return (-(iM11607s & 1)) ^ (iM11607s >>> 1);
    }

    /* JADX INFO: renamed from: y */
    public final long m11613y() {
        long jM11608t = m11608t();
        return (-(jM11608t & 1)) ^ (jM11608t >>> 1);
    }

    /* JADX INFO: renamed from: z */
    public final int m11614z() {
        if (m11591c()) {
            this.f33042h = 0;
            return 0;
        }
        int iM11607s = m11607s();
        this.f33042h = iM11607s;
        if ((iM11607s >>> 3) != 0) {
            return iM11607s;
        }
        throw new C10997z("Protocol message contained an invalid tag (zero).");
    }
}
