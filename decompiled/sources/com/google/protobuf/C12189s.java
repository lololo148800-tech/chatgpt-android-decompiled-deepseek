package com.google.protobuf;

import p232J3.C4206F;

/* JADX INFO: renamed from: com.google.protobuf.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C12189s extends AbstractC12195u {

    /* JADX INFO: renamed from: f */
    public final byte[] f37098f;

    /* JADX INFO: renamed from: g */
    public final int f37099g;

    /* JADX INFO: renamed from: h */
    public int f37100h;

    public C12189s(int i10, byte[] bArr) {
        if (((bArr.length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
        }
        this.f37098f = bArr;
        this.f37100h = 0;
        this.f37099g = i10;
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: A0 */
    public final void mo14092A0(int i10, boolean z6) throws C4206F {
        mo14108Q0(i10, 0);
        mo14115z0(z6 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: B0 */
    public final void mo14093B0(int i10, byte[] bArr) throws C4206F {
        mo14110S0(i10);
        m14114W0(bArr, 0, i10);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: C0 */
    public final void mo14094C0(int i10, AbstractC12171m abstractC12171m) throws C4206F {
        mo14108Q0(i10, 2);
        mo14095D0(abstractC12171m);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: D0 */
    public final void mo14095D0(AbstractC12171m abstractC12171m) throws C4206F {
        mo14110S0(abstractC12171m.size());
        abstractC12171m.mo14008x(this);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: E0 */
    public final void mo14096E0(int i10, int i11) throws C4206F {
        mo14108Q0(i10, 5);
        mo14097F0(i11);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: F0 */
    public final void mo14097F0(int i10) throws C4206F {
        try {
            byte[] bArr = this.f37098f;
            int i11 = this.f37100h;
            int i12 = i11 + 1;
            this.f37100h = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f37100h = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f37100h = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f37100h = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new C4206F(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37100h), Integer.valueOf(this.f37099g), 1), e10);
        }
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: G0 */
    public final void mo14098G0(int i10, long j10) throws C4206F {
        mo14108Q0(i10, 1);
        mo14099H0(j10);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: H0 */
    public final void mo14099H0(long j10) throws C4206F {
        try {
            byte[] bArr = this.f37098f;
            int i10 = this.f37100h;
            int i11 = i10 + 1;
            this.f37100h = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i10 + 2;
            this.f37100h = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i10 + 3;
            this.f37100h = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i10 + 4;
            this.f37100h = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i10 + 5;
            this.f37100h = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f37100h = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f37100h = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f37100h = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new C4206F(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37100h), Integer.valueOf(this.f37099g), 1), e10);
        }
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: I0 */
    public final void mo14100I0(int i10, int i11) throws C4206F {
        mo14108Q0(i10, 0);
        mo14101J0(i11);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: J0 */
    public final void mo14101J0(int i10) throws C4206F {
        if (i10 >= 0) {
            mo14110S0(i10);
        } else {
            mo14112U0(i10);
        }
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: K0 */
    public final void mo14102K0(int i10, InterfaceC12091G0 interfaceC12091G0, InterfaceC12134Z0 interfaceC12134Z0) throws C4206F {
        mo14108Q0(i10, 2);
        mo14110S0(((AbstractC12138b) interfaceC12091G0).getSerializedSize(interfaceC12134Z0));
        interfaceC12134Z0.mo13791e(interfaceC12091G0, this.f37110c);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: L0 */
    public final void mo14103L0(InterfaceC12091G0 interfaceC12091G0) throws C4206F {
        mo14110S0(interfaceC12091G0.getSerializedSize());
        interfaceC12091G0.writeTo(this);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: M0 */
    public final void mo14104M0(int i10, InterfaceC12091G0 interfaceC12091G0) throws C4206F {
        mo14108Q0(1, 3);
        mo14109R0(2, i10);
        mo14108Q0(3, 2);
        mo14103L0(interfaceC12091G0);
        mo14108Q0(1, 4);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: N0 */
    public final void mo14105N0(int i10, AbstractC12171m abstractC12171m) throws C4206F {
        mo14108Q0(1, 3);
        mo14109R0(2, i10);
        mo14094C0(3, abstractC12171m);
        mo14108Q0(1, 4);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: O0 */
    public final void mo14106O0(int i10, String str) throws C4206F {
        mo14108Q0(i10, 2);
        mo14107P0(str);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: P0 */
    public final void mo14107P0(String str) throws C4206F {
        int i10 = this.f37100h;
        try {
            int iM14148v0 = AbstractC12195u.m14148v0(str.length() * 3);
            int iM14148v1 = AbstractC12195u.m14148v0(str.length());
            byte[] bArr = this.f37098f;
            if (iM14148v1 == iM14148v0) {
                int i11 = i10 + iM14148v1;
                this.f37100h = i11;
                int iMo13993S = AbstractC12077B1.f36870a.mo13993S(str, bArr, i11, m14113V0());
                this.f37100h = i10;
                mo14110S0((iMo13993S - i10) - iM14148v1);
                this.f37100h = iMo13993S;
            } else {
                mo14110S0(AbstractC12077B1.m13721b(str));
                this.f37100h = AbstractC12077B1.f36870a.mo13993S(str, bArr, this.f37100h, m14113V0());
            }
        } catch (C12074A1 e10) {
            this.f37100h = i10;
            m14151y0(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new C4206F(e11);
        }
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: Q0 */
    public final void mo14108Q0(int i10, int i11) throws C4206F {
        mo14110S0((i10 << 3) | i11);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: R0 */
    public final void mo14109R0(int i10, int i11) throws C4206F {
        mo14108Q0(i10, 0);
        mo14110S0(i11);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: S0 */
    public final void mo14110S0(int i10) throws C4206F {
        while (true) {
            int i11 = i10 & (-128);
            byte[] bArr = this.f37098f;
            if (i11 == 0) {
                int i12 = this.f37100h;
                this.f37100h = i12 + 1;
                bArr[i12] = (byte) i10;
                return;
            } else {
                try {
                    int i13 = this.f37100h;
                    this.f37100h = i13 + 1;
                    bArr[i13] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new C4206F(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37100h), Integer.valueOf(this.f37099g), 1), e10);
                }
            }
            throw new C4206F(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37100h), Integer.valueOf(this.f37099g), 1), e10);
        }
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: T0 */
    public final void mo14111T0(int i10, long j10) throws C4206F {
        mo14108Q0(i10, 0);
        mo14112U0(j10);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: U0 */
    public final void mo14112U0(long j10) throws C4206F {
        byte[] bArr = this.f37098f;
        if (AbstractC12195u.f37109e && m14113V0() >= 10) {
            while ((j10 & (-128)) != 0) {
                int i10 = this.f37100h;
                this.f37100h = i10 + 1;
                AbstractC12209y1.m14192o(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            int i11 = this.f37100h;
            this.f37100h = 1 + i11;
            AbstractC12209y1.m14192o(bArr, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                int i12 = this.f37100h;
                this.f37100h = i12 + 1;
                bArr[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new C4206F(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37100h), Integer.valueOf(this.f37099g), 1), e10);
            }
        }
        int i13 = this.f37100h;
        this.f37100h = i13 + 1;
        bArr[i13] = (byte) j10;
    }

    /* JADX INFO: renamed from: V0 */
    public final int m14113V0() {
        return this.f37099g - this.f37100h;
    }

    /* JADX INFO: renamed from: W0 */
    public final void m14114W0(byte[] bArr, int i10, int i11) throws C4206F {
        try {
            System.arraycopy(bArr, i10, this.f37098f, this.f37100h, i11);
            this.f37100h += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new C4206F(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37100h), Integer.valueOf(this.f37099g), Integer.valueOf(i11)), e10);
        }
    }

    @Override // com.google.protobuf.AbstractC12153g
    /* JADX INFO: renamed from: a0 */
    public final void mo13995a0(byte[] bArr, int i10, int i11) throws C4206F {
        m14114W0(bArr, i10, i11);
    }

    @Override // com.google.protobuf.AbstractC12195u
    /* JADX INFO: renamed from: z0 */
    public final void mo14115z0(byte b) throws C4206F {
        try {
            byte[] bArr = this.f37098f;
            int i10 = this.f37100h;
            this.f37100h = i10 + 1;
            bArr[i10] = b;
        } catch (IndexOutOfBoundsException e10) {
            throw new C4206F(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37100h), Integer.valueOf(this.f37099g), 1), e10);
        }
    }
}
