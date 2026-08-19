package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import p001A.AbstractC0010F;

/* JADX INFO: renamed from: com.google.protobuf.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C12180p extends AbstractC12186r {

    /* JADX INFO: renamed from: c */
    public final InputStream f37059c;

    /* JADX INFO: renamed from: d */
    public final byte[] f37060d;

    /* JADX INFO: renamed from: e */
    public int f37061e;

    /* JADX INFO: renamed from: f */
    public int f37062f;

    /* JADX INFO: renamed from: g */
    public int f37063g;

    /* JADX INFO: renamed from: h */
    public int f37064h;

    /* JADX INFO: renamed from: i */
    public int f37065i;

    /* JADX INFO: renamed from: j */
    public int f37066j = Integer.MAX_VALUE;

    public C12180p(InputStream inputStream) {
        AbstractC12175n0.m14013a(inputStream, "input");
        this.f37059c = inputStream;
        this.f37060d = new byte[4096];
        this.f37061e = 0;
        this.f37063g = 0;
        this.f37065i = 0;
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: A */
    public final int mo14015A() {
        return AbstractC12186r.m14084c(mo14046w());
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: B */
    public final long mo14016B() {
        return AbstractC12186r.m14085d(m14054N());
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: C */
    public final String mo14017C() throws C12181p0 {
        int iMo14046w = mo14046w();
        byte[] bArr = this.f37060d;
        if (iMo14046w > 0) {
            int i10 = this.f37061e;
            int i11 = this.f37063g;
            if (iMo14046w <= i10 - i11) {
                String str = new String(bArr, i11, iMo14046w, AbstractC12175n0.f37050a);
                this.f37063g += iMo14046w;
                return str;
            }
        }
        if (iMo14046w == 0) {
            return "";
        }
        if (iMo14046w > this.f37061e) {
            return new String(m14049I(iMo14046w), AbstractC12175n0.f37050a);
        }
        m14057Q(iMo14046w);
        String str2 = new String(bArr, this.f37063g, iMo14046w, AbstractC12175n0.f37050a);
        this.f37063g += iMo14046w;
        return str2;
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: D */
    public final String mo14018D() throws IOException {
        int iMo14046w = mo14046w();
        int i10 = this.f37063g;
        int i11 = this.f37061e;
        int i12 = i11 - i10;
        byte[] bArrM14049I = this.f37060d;
        if (iMo14046w <= i12 && iMo14046w > 0) {
            this.f37063g = i10 + iMo14046w;
        } else {
            if (iMo14046w == 0) {
                return "";
            }
            i10 = 0;
            if (iMo14046w <= i11) {
                m14057Q(iMo14046w);
                this.f37063g = iMo14046w;
            } else {
                bArrM14049I = m14049I(iMo14046w);
            }
        }
        return AbstractC12077B1.f36870a.mo13991K(bArrM14049I, i10, iMo14046w);
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: E */
    public final int mo14019E() throws C12181p0 {
        if (mo14032g()) {
            this.f37064h = 0;
            return 0;
        }
        int iMo14046w = mo14046w();
        this.f37064h = iMo14046w;
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
        return m14054N();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: H */
    public final boolean mo14022H(int i10) throws C12181p0 {
        int iMo14019E;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            int i13 = this.f37061e - this.f37063g;
            byte[] bArr = this.f37060d;
            if (i13 >= 10) {
                while (i12 < 10) {
                    int i14 = this.f37063g;
                    this.f37063g = i14 + 1;
                    if (bArr[i14] < 0) {
                        i12++;
                    }
                }
                throw C12181p0.m14063d();
            }
            while (i12 < 10) {
                if (this.f37063g == this.f37061e) {
                    m14057Q(1);
                }
                int i15 = this.f37063g;
                this.f37063g = i15 + 1;
                if (bArr[i15] < 0) {
                    i12++;
                }
            }
            throw C12181p0.m14063d();
            return true;
        }
        if (i11 == 1) {
            m14058R(8);
            return true;
        }
        if (i11 == 2) {
            m14058R(mo14046w());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw C12181p0.m14062c();
            }
            m14058R(4);
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
    public final byte[] m14049I(int i10) throws IOException {
        byte[] bArrM14050J = m14050J(i10);
        if (bArrM14050J != null) {
            return bArrM14050J;
        }
        int i11 = this.f37063g;
        int i12 = this.f37061e;
        int length = i12 - i11;
        this.f37065i += i12;
        this.f37063g = 0;
        this.f37061e = 0;
        ArrayList<byte[]> arrayListM14051K = m14051K(i10 - length);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f37060d, i11, bArr, 0, length);
        for (byte[] bArr2 : arrayListM14051K) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: J */
    public final byte[] m14050J(int i10) throws IOException {
        if (i10 == 0) {
            return AbstractC12175n0.f37051b;
        }
        if (i10 < 0) {
            throw C12181p0.m14064e();
        }
        int i11 = this.f37065i;
        int i12 = this.f37063g;
        int i13 = i11 + i12 + i10;
        if (i13 - Integer.MAX_VALUE > 0) {
            throw new C12181p0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i14 = this.f37066j;
        if (i13 > i14) {
            m14058R((i14 - i11) - i12);
            throw C12181p0.m14066g();
        }
        int i15 = this.f37061e - i12;
        int i16 = i10 - i15;
        InputStream inputStream = this.f37059c;
        if (i16 >= 4096) {
            try {
                if (i16 > inputStream.available()) {
                    return null;
                }
            } catch (C12181p0 e10) {
                e10.f37067Y = true;
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f37060d, this.f37063g, bArr, 0, i15);
        this.f37065i += this.f37061e;
        this.f37063g = 0;
        this.f37061e = 0;
        while (i15 < i10) {
            try {
                int i17 = inputStream.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw C12181p0.m14066g();
                }
                this.f37065i += i17;
                i15 += i17;
            } catch (C12181p0 e11) {
                e11.f37067Y = true;
                throw e11;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: K */
    public final ArrayList m14051K(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.f37059c.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw C12181p0.m14066g();
                }
                this.f37065i += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: L */
    public final int m14052L() throws C12181p0 {
        int i10 = this.f37063g;
        if (this.f37061e - i10 < 4) {
            m14057Q(4);
            i10 = this.f37063g;
        }
        this.f37063g = i10 + 4;
        byte[] bArr = this.f37060d;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: M */
    public final long m14053M() throws C12181p0 {
        int i10 = this.f37063g;
        if (this.f37061e - i10 < 8) {
            m14057Q(8);
            i10 = this.f37063g;
        }
        this.f37063g = i10 + 8;
        byte[] bArr = this.f37060d;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: N */
    public final long m14054N() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f37063g;
        int i11 = this.f37061e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f37060d;
            byte b = bArr[i10];
            if (b >= 0) {
                this.f37063g = i12;
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
                this.f37063g = i13;
                return j10;
            }
        }
        return m14055O();
    }

    /* JADX INFO: renamed from: O */
    public final long m14055O() throws C12181p0 {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f37063g == this.f37061e) {
                m14057Q(1);
            }
            int i11 = this.f37063g;
            this.f37063g = i11 + 1;
            byte b = this.f37060d[i11];
            j10 |= ((long) (b & 127)) << i10;
            if ((b & 128) == 0) {
                return j10;
            }
        }
        throw C12181p0.m14063d();
    }

    /* JADX INFO: renamed from: P */
    public final void m14056P() {
        int i10 = this.f37061e + this.f37062f;
        this.f37061e = i10;
        int i11 = this.f37065i + i10;
        int i12 = this.f37066j;
        if (i11 <= i12) {
            this.f37062f = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f37062f = i13;
        this.f37061e = i10 - i13;
    }

    /* JADX INFO: renamed from: Q */
    public final void m14057Q(int i10) throws C12181p0 {
        if (m14059S(i10)) {
            return;
        }
        if (i10 <= (Integer.MAX_VALUE - this.f37065i) - this.f37063g) {
            throw C12181p0.m14066g();
        }
        throw new C12181p0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: R */
    public final void m14058R(int i10) throws C12181p0 {
        int i11 = this.f37061e;
        int i12 = this.f37063g;
        if (i10 <= i11 - i12 && i10 >= 0) {
            this.f37063g = i12 + i10;
            return;
        }
        InputStream inputStream = this.f37059c;
        if (i10 < 0) {
            throw C12181p0.m14064e();
        }
        int i13 = this.f37065i;
        int i14 = i13 + i12;
        int i15 = i14 + i10;
        int i16 = this.f37066j;
        if (i15 > i16) {
            m14058R((i16 - i13) - i12);
            throw C12181p0.m14066g();
        }
        this.f37065i = i14;
        int i17 = i11 - i12;
        this.f37061e = 0;
        this.f37063g = 0;
        while (i17 < i10) {
            long j10 = i10 - i17;
            try {
                try {
                    long jSkip = inputStream.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i17 += (int) jSkip;
                    }
                } catch (C12181p0 e10) {
                    e10.f37067Y = true;
                    throw e10;
                }
            } catch (Throwable th2) {
                this.f37065i += i17;
                m14056P();
                throw th2;
            }
        }
        this.f37065i += i17;
        m14056P();
        if (i17 >= i10) {
            return;
        }
        int i18 = this.f37061e;
        int i19 = i18 - this.f37063g;
        this.f37063g = i18;
        m14057Q(1);
        while (true) {
            int i20 = i10 - i19;
            int i21 = this.f37061e;
            if (i20 <= i21) {
                this.f37063g = i20;
                return;
            } else {
                i19 += i21;
                this.f37063g = i21;
                m14057Q(1);
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final boolean m14059S(int i10) throws IOException {
        int i11 = this.f37063g;
        int i12 = i11 + i10;
        int i13 = this.f37061e;
        if (i12 <= i13) {
            throw new IllegalStateException(AbstractC0010F.m19c(i10, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i14 = this.f37065i;
        if (i10 > (Integer.MAX_VALUE - i14) - i11 || i14 + i11 + i10 > this.f37066j) {
            return false;
        }
        byte[] bArr = this.f37060d;
        if (i11 > 0) {
            if (i13 > i11) {
                System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
            }
            this.f37065i += i11;
            this.f37061e -= i11;
            this.f37063g = 0;
        }
        int i15 = this.f37061e;
        int iMin = Math.min(bArr.length - i15, (Integer.MAX_VALUE - this.f37065i) - i15);
        InputStream inputStream = this.f37059c;
        try {
            int i16 = inputStream.read(bArr, i15, iMin);
            if (i16 == 0 || i16 < -1 || i16 > bArr.length) {
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i16 + "\nThe InputStream implementation is buggy.");
            }
            if (i16 <= 0) {
                return false;
            }
            this.f37061e += i16;
            m14056P();
            if (this.f37061e >= i10) {
                return true;
            }
            return m14059S(i10);
        } catch (C12181p0 e10) {
            e10.f37067Y = true;
            throw e10;
        }
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: a */
    public final void mo14029a(int i10) throws C12181p0 {
        if (this.f37064h != i10) {
            throw new C12181p0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: e */
    public final int mo14030e() {
        int i10 = this.f37066j;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f37065i + this.f37063g);
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: f */
    public final int mo14031f() {
        return this.f37065i + this.f37063g;
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: g */
    public final boolean mo14032g() {
        return this.f37063g == this.f37061e && !m14059S(1);
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: j */
    public final void mo14033j(int i10) {
        this.f37066j = i10;
        m14056P();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: k */
    public final int mo14034k(int i10) throws C12181p0 {
        if (i10 < 0) {
            throw C12181p0.m14064e();
        }
        int i11 = this.f37065i + this.f37063g + i10;
        int i12 = this.f37066j;
        if (i11 > i12) {
            throw C12181p0.m14066g();
        }
        this.f37066j = i11;
        m14056P();
        return i12;
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: l */
    public final boolean mo14035l() {
        return m14054N() != 0;
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: m */
    public final C12168l mo14036m() throws IOException {
        int iMo14046w = mo14046w();
        int i10 = this.f37061e;
        int i11 = this.f37063g;
        int i12 = i10 - i11;
        byte[] bArr = this.f37060d;
        if (iMo14046w <= i12 && iMo14046w > 0) {
            C12168l c12168lM14010j = AbstractC12171m.m14010j(bArr, i11, iMo14046w);
            this.f37063g += iMo14046w;
            return c12168lM14010j;
        }
        if (iMo14046w == 0) {
            return AbstractC12171m.f37047Z;
        }
        byte[] bArrM14050J = m14050J(iMo14046w);
        if (bArrM14050J != null) {
            return AbstractC12171m.m14010j(bArrM14050J, 0, bArrM14050J.length);
        }
        int i13 = this.f37063g;
        int i14 = this.f37061e;
        int length = i14 - i13;
        this.f37065i += i14;
        this.f37063g = 0;
        this.f37061e = 0;
        ArrayList<byte[]> arrayListM14051K = m14051K(iMo14046w - length);
        byte[] bArr2 = new byte[iMo14046w];
        System.arraycopy(bArr, i13, bArr2, 0, length);
        for (byte[] bArr3 : arrayListM14051K) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C12168l c12168l = AbstractC12171m.f37047Z;
        return new C12168l(bArr2);
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: n */
    public final double mo14037n() {
        return Double.longBitsToDouble(m14053M());
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: o */
    public final int mo14038o() {
        return mo14046w();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: p */
    public final int mo14039p() {
        return m14052L();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: q */
    public final long mo14040q() {
        return m14053M();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: r */
    public final float mo14041r() {
        return Float.intBitsToFloat(m14052L());
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
        return m14054N();
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
        int i11 = this.f37063g;
        int i12 = this.f37061e;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f37060d;
            byte b = bArr[i11];
            if (b >= 0) {
                this.f37063g = i13;
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
                this.f37063g = i14;
                return i10;
            }
        }
        return (int) m14055O();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: y */
    public final int mo14047y() {
        return m14052L();
    }

    @Override // com.google.protobuf.AbstractC12186r
    /* JADX INFO: renamed from: z */
    public final long mo14048z() {
        return m14053M();
    }
}
