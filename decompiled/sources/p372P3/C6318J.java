package p372P3;

import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;

/* JADX INFO: renamed from: P3.J */
/* JADX INFO: loaded from: classes.dex */
public final class C6318J {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20464a;

    /* JADX INFO: renamed from: b */
    public int f20465b;

    /* JADX INFO: renamed from: c */
    public int f20466c;

    /* JADX INFO: renamed from: d */
    public byte[] f20467d;

    /* JADX INFO: renamed from: e */
    public int f20468e;

    public C6318J() {
        this.f20464a = 2;
        this.f20467d = AbstractC20817s.f66111f;
    }

    /* JADX INFO: renamed from: a */
    public void m6864a() {
        int i10;
        int i11;
        switch (this.f20464a) {
            case 2:
                int i12 = this.f20465b;
                AbstractC20800b.m21320h(i12 >= 0 && (i12 < (i10 = this.f20468e) || (i12 == i10 && this.f20466c == 0)));
                break;
            default:
                int i13 = this.f20466c;
                AbstractC20800b.m21320h(i13 >= 0 && (i13 < (i11 = this.f20465b) || (i13 == i11 && this.f20468e == 0)));
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public int m6865b() {
        return ((this.f20468e - this.f20465b) * 8) - this.f20466c;
    }

    /* JADX INFO: renamed from: c */
    public void m6866c() {
        if (this.f20466c == 0) {
            return;
        }
        this.f20466c = 0;
        this.f20465b++;
        m6864a();
    }

    /* JADX INFO: renamed from: d */
    public boolean m6867d(int i10) {
        int i11 = this.f20466c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f20468e + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f20465b) {
                break;
            }
            if (m6881r(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f20465b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public boolean m6868e() {
        int i10 = this.f20466c;
        int i11 = this.f20468e;
        int i12 = 0;
        while (this.f20466c < this.f20465b && !m6871h()) {
            i12++;
        }
        boolean z6 = this.f20466c == this.f20465b;
        this.f20466c = i10;
        this.f20468e = i11;
        return !z6 && m6867d((i12 * 2) + 1);
    }

    /* JADX INFO: renamed from: f */
    public int m6869f() {
        AbstractC20800b.m21320h(this.f20466c == 0);
        return this.f20465b;
    }

    /* JADX INFO: renamed from: g */
    public int m6870g() {
        return (this.f20465b * 8) + this.f20466c;
    }

    /* JADX INFO: renamed from: h */
    public boolean m6871h() {
        switch (this.f20464a) {
            case 0:
                boolean z6 = (((this.f20467d[this.f20466c] & 255) >> this.f20468e) & 1) == 1;
                m6883t(1);
                return z6;
            case 1:
            default:
                boolean z10 = (this.f20467d[this.f20466c] & (128 >> this.f20468e)) != 0;
                m6882s();
                return z10;
            case 2:
                boolean z11 = (this.f20467d[this.f20465b] & (128 >> this.f20466c)) != 0;
                m6882s();
                return z11;
        }
    }

    /* JADX INFO: renamed from: i */
    public int m6872i(int i10) {
        switch (this.f20464a) {
            case 0:
                int i11 = this.f20466c;
                int iMin = Math.min(i10, 8 - this.f20468e);
                int i12 = i11 + 1;
                byte[] bArr = this.f20467d;
                int i13 = ((bArr[i11] & 255) >> this.f20468e) & (255 >> (8 - iMin));
                while (iMin < i10) {
                    i13 |= (bArr[i12] & 255) << iMin;
                    iMin += 8;
                    i12++;
                }
                int i14 = i13 & ((-1) >>> (32 - i10));
                m6883t(i10);
                return i14;
            case 1:
            default:
                this.f20468e += i10;
                int i15 = 0;
                while (true) {
                    int i16 = this.f20468e;
                    int i17 = 2;
                    if (i16 <= 8) {
                        byte[] bArr2 = this.f20467d;
                        int i18 = this.f20466c;
                        int i19 = ((-1) >>> (32 - i10)) & (i15 | ((bArr2[i18] & 255) >> (8 - i16)));
                        if (i16 == 8) {
                            this.f20468e = 0;
                            this.f20466c = i18 + (m6881r(i18 + 1) ? 2 : 1);
                        }
                        m6864a();
                        return i19;
                    }
                    int i20 = i16 - 8;
                    this.f20468e = i20;
                    byte[] bArr3 = this.f20467d;
                    int i21 = this.f20466c;
                    i15 |= (bArr3[i21] & 255) << i20;
                    if (!m6881r(i21 + 1)) {
                        i17 = 1;
                    }
                    this.f20466c = i21 + i17;
                }
                break;
            case 2:
                if (i10 == 0) {
                    return 0;
                }
                this.f20466c += i10;
                int i22 = 0;
                while (true) {
                    int i23 = this.f20466c;
                    if (i23 <= 8) {
                        byte[] bArr4 = this.f20467d;
                        int i24 = this.f20465b;
                        int i25 = ((-1) >>> (32 - i10)) & (i22 | ((bArr4[i24] & 255) >> (8 - i23)));
                        if (i23 == 8) {
                            this.f20466c = 0;
                            this.f20465b = i24 + 1;
                        }
                        m6864a();
                        return i25;
                    }
                    int i26 = i23 - 8;
                    this.f20466c = i26;
                    byte[] bArr5 = this.f20467d;
                    int i27 = this.f20465b;
                    this.f20465b = i27 + 1;
                    i22 |= (bArr5[i27] & 255) << i26;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m6873j(int i10, byte[] bArr) {
        int i11 = i10 >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f20467d;
            int i13 = this.f20465b;
            int i14 = i13 + 1;
            this.f20465b = i14;
            byte b = bArr2[i13];
            int i15 = this.f20466c;
            byte b10 = (byte) (b << i15);
            bArr[i12] = b10;
            bArr[i12] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b10);
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i11] & (255 >> i16));
        bArr[i11] = b11;
        int i17 = this.f20466c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f20467d;
            int i18 = this.f20465b;
            this.f20465b = i18 + 1;
            bArr[i11] = (byte) (b11 | ((bArr3[i18] & 255) << i17));
            this.f20466c = i17 - 8;
        }
        int i19 = this.f20466c + i16;
        this.f20466c = i19;
        byte[] bArr4 = this.f20467d;
        int i20 = this.f20465b;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.f20466c = 0;
            this.f20465b = i20 + 1;
        }
        m6864a();
    }

    /* JADX INFO: renamed from: k */
    public long m6874k(int i10) {
        if (i10 <= 32) {
            int iM6872i = m6872i(i10);
            int i11 = AbstractC20817s.f66106a;
            return 4294967295L & ((long) iM6872i);
        }
        int iM6872i2 = m6872i(i10 - 32);
        int iM6872i3 = m6872i(32);
        int i12 = AbstractC20817s.f66106a;
        return (4294967295L & ((long) iM6872i3)) | ((((long) iM6872i2) & 4294967295L) << 32);
    }

    /* JADX INFO: renamed from: l */
    public void m6875l(int i10, byte[] bArr) {
        AbstractC20800b.m21320h(this.f20466c == 0);
        System.arraycopy(this.f20467d, this.f20465b, bArr, 0, i10);
        this.f20465b += i10;
        m6864a();
    }

    /* JADX INFO: renamed from: m */
    public int m6876m() {
        int i10 = 0;
        while (!m6871h()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? m6872i(i10) : 0);
    }

    /* JADX INFO: renamed from: n */
    public int m6877n() {
        int iM6876m = m6876m();
        return ((iM6876m + 1) / 2) * (iM6876m % 2 == 0 ? -1 : 1);
    }

    /* JADX INFO: renamed from: o */
    public void m6878o(int i10, byte[] bArr) {
        this.f20467d = bArr;
        this.f20465b = 0;
        this.f20466c = 0;
        this.f20468e = i10;
    }

    /* JADX INFO: renamed from: p */
    public void m6879p(C20811m c20811m) {
        m6878o(c20811m.f66094c, c20811m.f66092a);
        m6880q(c20811m.f66093b * 8);
    }

    /* JADX INFO: renamed from: q */
    public void m6880q(int i10) {
        int i11 = i10 / 8;
        this.f20465b = i11;
        this.f20466c = i10 - (i11 * 8);
        m6864a();
    }

    /* JADX INFO: renamed from: r */
    public boolean m6881r(int i10) {
        if (2 <= i10 && i10 < this.f20465b) {
            byte[] bArr = this.f20467d;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public void m6882s() {
        switch (this.f20464a) {
            case 2:
                int i10 = this.f20466c + 1;
                this.f20466c = i10;
                if (i10 == 8) {
                    this.f20466c = 0;
                    this.f20465b++;
                }
                m6864a();
                break;
            default:
                int i11 = this.f20468e + 1;
                this.f20468e = i11;
                if (i11 == 8) {
                    this.f20468e = 0;
                    int i12 = this.f20466c;
                    this.f20466c = i12 + (m6881r(i12 + 1) ? 2 : 1);
                }
                m6864a();
                break;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m6883t(int i10) {
        int i11;
        switch (this.f20464a) {
            case 0:
                int i12 = i10 / 8;
                int i13 = this.f20466c + i12;
                this.f20466c = i13;
                int i14 = (i10 - (i12 * 8)) + this.f20468e;
                this.f20468e = i14;
                boolean z6 = true;
                if (i14 > 7) {
                    this.f20466c = i13 + 1;
                    this.f20468e = i14 - 8;
                }
                int i15 = this.f20466c;
                if (i15 < 0 || (i15 >= (i11 = this.f20465b) && (i15 != i11 || this.f20468e != 0))) {
                    z6 = false;
                }
                AbstractC20800b.m21320h(z6);
                break;
            case 1:
            default:
                int i16 = this.f20466c;
                int i17 = i10 / 8;
                int i18 = i16 + i17;
                this.f20466c = i18;
                int i19 = (i10 - (i17 * 8)) + this.f20468e;
                this.f20468e = i19;
                if (i19 > 7) {
                    this.f20466c = i18 + 1;
                    this.f20468e = i19 - 8;
                }
                while (true) {
                    i16++;
                    if (i16 > this.f20466c) {
                        m6864a();
                        break;
                    } else if (m6881r(i16)) {
                        this.f20466c++;
                        i16 += 2;
                    }
                }
                break;
            case 2:
                int i20 = i10 / 8;
                int i21 = this.f20465b + i20;
                this.f20465b = i21;
                int i22 = (i10 - (i20 * 8)) + this.f20466c;
                this.f20466c = i22;
                if (i22 > 7) {
                    this.f20465b = i21 + 1;
                    this.f20466c = i22 - 8;
                }
                m6864a();
                break;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m6884u(int i10) {
        AbstractC20800b.m21320h(this.f20466c == 0);
        this.f20465b += i10;
        m6864a();
    }

    public C6318J(byte[] bArr) {
        this.f20464a = 0;
        this.f20467d = bArr;
        this.f20465b = bArr.length;
    }

    public C6318J(byte[] bArr, int i10, int i11) {
        this.f20464a = 3;
        this.f20467d = bArr;
        this.f20466c = i10;
        this.f20465b = i11;
        this.f20468e = 0;
        m6864a();
    }

    public C6318J(int i10, byte[] bArr) {
        this.f20464a = 2;
        this.f20467d = bArr;
        this.f20468e = i10;
    }

    public C6318J(int i10, int i11) {
        this.f20464a = 1;
        this.f20465b = i10;
        this.f20466c = i11;
        this.f20467d = new byte[(i11 * 2) - 1];
        this.f20468e = 0;
    }
}
