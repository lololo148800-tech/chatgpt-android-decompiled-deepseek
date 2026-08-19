package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import p232J3.C4206F;

/* JADX INFO: renamed from: com.google.protobuf.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C12192t extends AbstractC12195u {

    /* JADX INFO: renamed from: f */
    public final byte[] f37102f;

    /* JADX INFO: renamed from: g */
    public final int f37103g;

    /* JADX INFO: renamed from: h */
    public int f37104h;

    /* JADX INFO: renamed from: i */
    public final OutputStream f37105i;

    public C12192t(OutputStream outputStream, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i10, 20);
        this.f37102f = new byte[iMax];
        this.f37103g = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f37105i = outputStream;
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: A0 */
    public final void mo14092A0(int i10, boolean z6) {
        m14122b1(11);
        m14118X0(i10, 0);
        byte b = z6 ? (byte) 1 : (byte) 0;
        int i11 = this.f37104h;
        this.f37104h = i11 + 1;
        this.f37102f[i11] = b;
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: B0 */
    public final void mo14093B0(int i10, byte[] bArr) throws IOException {
        mo14110S0(i10);
        m14123c1(bArr, 0, i10);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: C0 */
    public final void mo14094C0(int i10, AbstractC12171m abstractC12171m) {
        mo14108Q0(i10, 2);
        mo14095D0(abstractC12171m);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: D0 */
    public final void mo14095D0(AbstractC12171m abstractC12171m) {
        mo14110S0(abstractC12171m.size());
        abstractC12171m.mo14008x(this);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: E0 */
    public final void mo14096E0(int i10, int i11) {
        m14122b1(14);
        m14118X0(i10, 5);
        m14116V0(i11);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: F0 */
    public final void mo14097F0(int i10) {
        m14122b1(4);
        m14116V0(i10);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: G0 */
    public final void mo14098G0(int i10, long j10) {
        m14122b1(18);
        m14118X0(i10, 1);
        m14117W0(j10);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: H0 */
    public final void mo14099H0(long j10) {
        m14122b1(8);
        m14117W0(j10);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: I0 */
    public final void mo14100I0(int i10, int i11) {
        m14122b1(20);
        m14118X0(i10, 0);
        if (i11 >= 0) {
            m14119Y0(i11);
        } else {
            m14120Z0(i11);
        }
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: J0 */
    public final void mo14101J0(int i10) {
        if (i10 >= 0) {
            mo14110S0(i10);
        } else {
            mo14112U0(i10);
        }
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: K0 */
    public final void mo14102K0(int i10, InterfaceC12091G0 interfaceC12091G0, InterfaceC12134Z0 interfaceC12134Z0) {
        mo14108Q0(i10, 2);
        mo14110S0(((AbstractC12138b) interfaceC12091G0).getSerializedSize(interfaceC12134Z0));
        interfaceC12134Z0.mo13791e(interfaceC12091G0, this.f37110c);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: L0 */
    public final void mo14103L0(InterfaceC12091G0 interfaceC12091G0) {
        mo14110S0(interfaceC12091G0.getSerializedSize());
        interfaceC12091G0.writeTo(this);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: M0 */
    public final void mo14104M0(int i10, InterfaceC12091G0 interfaceC12091G0) {
        mo14108Q0(1, 3);
        mo14109R0(2, i10);
        mo14108Q0(3, 2);
        mo14103L0(interfaceC12091G0);
        mo14108Q0(1, 4);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: N0 */
    public final void mo14105N0(int i10, AbstractC12171m abstractC12171m) {
        mo14108Q0(1, 3);
        mo14109R0(2, i10);
        mo14094C0(3, abstractC12171m);
        mo14108Q0(1, 4);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: O0 */
    public final void mo14106O0(int i10, String str) throws IOException {
        mo14108Q0(i10, 2);
        mo14107P0(str);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: P0 */
    public final void mo14107P0(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iM14148v0 = AbstractC12195u.m14148v0(length);
            int i10 = iM14148v0 + length;
            int i11 = this.f37103g;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iMo13993S = AbstractC12077B1.f36870a.mo13993S(str, bArr, 0, length);
                mo14110S0(iMo13993S);
                m14123c1(bArr, 0, iMo13993S);
                return;
            }
            if (i10 > i11 - this.f37104h) {
                m14121a1();
            }
            int iM14148v1 = AbstractC12195u.m14148v0(str.length());
            int i12 = this.f37104h;
            byte[] bArr2 = this.f37102f;
            try {
                if (iM14148v1 == iM14148v0) {
                    int i13 = i12 + iM14148v1;
                    this.f37104h = i13;
                    int iMo13993S2 = AbstractC12077B1.f36870a.mo13993S(str, bArr2, i13, i11 - i13);
                    this.f37104h = i12;
                    m14119Y0((iMo13993S2 - i12) - iM14148v1);
                    this.f37104h = iMo13993S2;
                } else {
                    int iM13721b = AbstractC12077B1.m13721b(str);
                    m14119Y0(iM13721b);
                    this.f37104h = AbstractC12077B1.f36870a.mo13993S(str, bArr2, this.f37104h, iM13721b);
                }
            } catch (C12074A1 e10) {
                this.f37104h = i12;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new C4206F(e11);
            }
        } catch (C12074A1 e12) {
            m14151y0(str, e12);
        }
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: Q0 */
    public final void mo14108Q0(int i10, int i11) {
        mo14110S0((i10 << 3) | i11);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: R0 */
    public final void mo14109R0(int i10, int i11) {
        m14122b1(20);
        m14118X0(i10, 0);
        m14119Y0(i11);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: S0 */
    public final void mo14110S0(int i10) {
        m14122b1(5);
        m14119Y0(i10);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: T0 */
    public final void mo14111T0(int i10, long j10) {
        m14122b1(20);
        m14118X0(i10, 0);
        m14120Z0(j10);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: U0 */
    public final void mo14112U0(long j10) {
        m14122b1(10);
        m14120Z0(j10);
    }

    /* JADX INFO: renamed from: V0 */
    public final void m14116V0(int i10) {
        int i11 = this.f37104h;
        int i12 = i11 + 1;
        this.f37104h = i12;
        byte[] bArr = this.f37102f;
        bArr[i11] = (byte) (i10 & 255);
        int i13 = i11 + 2;
        this.f37104h = i13;
        bArr[i12] = (byte) ((i10 >> 8) & 255);
        int i14 = i11 + 3;
        this.f37104h = i14;
        bArr[i13] = (byte) ((i10 >> 16) & 255);
        this.f37104h = i11 + 4;
        bArr[i14] = (byte) ((i10 >> 24) & 255);
    }

    /* JADX INFO: renamed from: W0 */
    public final void m14117W0(long j10) {
        int i10 = this.f37104h;
        int i11 = i10 + 1;
        this.f37104h = i11;
        byte[] bArr = this.f37102f;
        bArr[i10] = (byte) (j10 & 255);
        int i12 = i10 + 2;
        this.f37104h = i12;
        bArr[i11] = (byte) ((j10 >> 8) & 255);
        int i13 = i10 + 3;
        this.f37104h = i13;
        bArr[i12] = (byte) ((j10 >> 16) & 255);
        int i14 = i10 + 4;
        this.f37104h = i14;
        bArr[i13] = (byte) (255 & (j10 >> 24));
        int i15 = i10 + 5;
        this.f37104h = i15;
        bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
        int i16 = i10 + 6;
        this.f37104h = i16;
        bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
        int i17 = i10 + 7;
        this.f37104h = i17;
        bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
        this.f37104h = i10 + 8;
        bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m14118X0(int i10, int i11) {
        m14119Y0((i10 << 3) | i11);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m14119Y0(int i10) {
        boolean z6 = AbstractC12195u.f37109e;
        byte[] bArr = this.f37102f;
        if (z6) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f37104h;
                this.f37104h = i11 + 1;
                AbstractC12209y1.m14192o(bArr, i11, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            int i12 = this.f37104h;
            this.f37104h = i12 + 1;
            AbstractC12209y1.m14192o(bArr, i12, (byte) i10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            int i13 = this.f37104h;
            this.f37104h = i13 + 1;
            bArr[i13] = (byte) ((i10 & 127) | 128);
            i10 >>>= 7;
        }
        int i14 = this.f37104h;
        this.f37104h = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m14120Z0(long j10) {
        boolean z6 = AbstractC12195u.f37109e;
        byte[] bArr = this.f37102f;
        if (z6) {
            while ((j10 & (-128)) != 0) {
                int i10 = this.f37104h;
                this.f37104h = i10 + 1;
                AbstractC12209y1.m14192o(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            int i11 = this.f37104h;
            this.f37104h = i11 + 1;
            AbstractC12209y1.m14192o(bArr, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            int i12 = this.f37104h;
            this.f37104h = i12 + 1;
            bArr[i12] = (byte) ((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        int i13 = this.f37104h;
        this.f37104h = i13 + 1;
        bArr[i13] = (byte) j10;
    }

    @Override // com.google.protobuf.AbstractC12153g
    /* JADX INFO: renamed from: a0 */
    public final void mo13995a0(byte[] bArr, int i10, int i11) throws IOException {
        m14123c1(bArr, i10, i11);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m14121a1() {
        this.f37105i.write(this.f37102f, 0, this.f37104h);
        this.f37104h = 0;
    }

    /* JADX INFO: renamed from: b1 */
    public final void m14122b1(int i10) {
        if (this.f37103g - this.f37104h < i10) {
            m14121a1();
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final void m14123c1(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f37104h;
        int i13 = this.f37103g;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f37102f;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f37104h += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f37104h = i13;
        m14121a1();
        if (i16 > i13) {
            this.f37105i.write(bArr, i15, i16);
        } else {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f37104h = i16;
        }
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: z0 */
    public final void mo14115z0(byte b) {
        if (this.f37104h == this.f37103g) {
            m14121a1();
        }
        int i10 = this.f37104h;
        this.f37104h = i10 + 1;
        this.f37102f[i10] = b;
    }
}
