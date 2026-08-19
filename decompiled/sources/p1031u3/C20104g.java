package p1031u3;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.Arrays;
import p1073w3.AbstractC20800b;

/* JADX INFO: renamed from: u3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C20104g {

    /* JADX INFO: renamed from: a */
    public final int f63654a;

    /* JADX INFO: renamed from: b */
    public final int f63655b;

    /* JADX INFO: renamed from: c */
    public final float f63656c;

    /* JADX INFO: renamed from: d */
    public final float f63657d;

    /* JADX INFO: renamed from: e */
    public final float f63658e;

    /* JADX INFO: renamed from: f */
    public final int f63659f;

    /* JADX INFO: renamed from: g */
    public final int f63660g;

    /* JADX INFO: renamed from: h */
    public final int f63661h;

    /* JADX INFO: renamed from: i */
    public final short[] f63662i;

    /* JADX INFO: renamed from: j */
    public short[] f63663j;

    /* JADX INFO: renamed from: k */
    public int f63664k;

    /* JADX INFO: renamed from: l */
    public short[] f63665l;

    /* JADX INFO: renamed from: m */
    public int f63666m;

    /* JADX INFO: renamed from: n */
    public short[] f63667n;

    /* JADX INFO: renamed from: o */
    public int f63668o;

    /* JADX INFO: renamed from: p */
    public int f63669p;

    /* JADX INFO: renamed from: q */
    public int f63670q;

    /* JADX INFO: renamed from: r */
    public int f63671r;

    /* JADX INFO: renamed from: s */
    public int f63672s;

    /* JADX INFO: renamed from: t */
    public int f63673t;

    /* JADX INFO: renamed from: u */
    public int f63674u;

    /* JADX INFO: renamed from: v */
    public int f63675v;

    public C20104g(float f10, float f11, int i10, int i11, int i12) {
        this.f63654a = i10;
        this.f63655b = i11;
        this.f63656c = f10;
        this.f63657d = f11;
        this.f63658e = i10 / i12;
        this.f63659f = i10 / RCHTTPStatusCodes.BAD_REQUEST;
        int i13 = i10 / 65;
        this.f63660g = i13;
        int i14 = i13 * 2;
        this.f63661h = i14;
        this.f63662i = new short[i14];
        this.f63663j = new short[i14 * i11];
        this.f63665l = new short[i14 * i11];
        this.f63667n = new short[i14 * i11];
    }

    /* JADX INFO: renamed from: e */
    public static void m20940e(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20941a(short[] sArr, int i10, int i11) {
        short[] sArrM20943c = m20943c(this.f63665l, this.f63666m, i11);
        this.f63665l = sArrM20943c;
        int i12 = this.f63655b;
        System.arraycopy(sArr, i10 * i12, sArrM20943c, this.f63666m * i12, i12 * i11);
        this.f63666m += i11;
    }

    /* JADX INFO: renamed from: b */
    public final void m20942b(short[] sArr, int i10, int i11) {
        int i12 = this.f63661h / i11;
        int i13 = this.f63655b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f63662i[i16] = (short) (i17 / i14);
        }
    }

    /* JADX INFO: renamed from: c */
    public final short[] m20943c(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f63655b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    /* JADX INFO: renamed from: d */
    public final int m20944d(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f63655b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i15 * i11) {
                i16 = i11;
                i15 = iAbs;
            }
            if (iAbs * i14 > i17 * i11) {
                i14 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f63674u = i15 / i16;
        this.f63675v = i17 / i14;
        return i16;
    }

    /* JADX INFO: renamed from: f */
    public final void m20945f() {
        int i10;
        int i11;
        float f10;
        int iM20944d;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = this.f63666m;
        float f11 = this.f63656c;
        float f12 = this.f63657d;
        float f13 = f11 / f12;
        float f14 = this.f63658e * f12;
        double d10 = f13;
        int i21 = this.f63654a;
        int i22 = this.f63655b;
        int i23 = 1;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            int i24 = this.f63664k;
            int i25 = this.f63661h;
            if (i24 >= i25) {
                int i26 = 0;
                while (true) {
                    int i27 = this.f63671r;
                    if (i27 > 0) {
                        int iMin = Math.min(i25, i27);
                        m20941a(this.f63663j, i26, iMin);
                        this.f63671r -= iMin;
                        i26 += iMin;
                        i11 = i20;
                        f10 = f14;
                        i10 = i21;
                    } else {
                        short[] sArr = this.f63663j;
                        int i28 = i21 > 4000 ? i21 / 4000 : i23;
                        int i29 = this.f63660g;
                        int i30 = this.f63659f;
                        if (i22 == i23 && i28 == i23) {
                            iM20944d = m20944d(sArr, i26, i30, i29);
                            i11 = i20;
                            f10 = f14;
                            i10 = i21;
                        } else {
                            m20942b(sArr, i26, i28);
                            i10 = i21;
                            i11 = i20;
                            short[] sArr2 = this.f63662i;
                            f10 = f14;
                            int iM20944d2 = m20944d(sArr2, 0, i30 / i28, i29 / i28);
                            if (i28 != 1) {
                                int i31 = iM20944d2 * i28;
                                int i32 = i28 * 4;
                                int i33 = i31 - i32;
                                int i34 = i31 + i32;
                                if (i33 >= i30) {
                                    i30 = i33;
                                }
                                if (i34 <= i29) {
                                    i29 = i34;
                                }
                                if (i22 == 1) {
                                    iM20944d = m20944d(sArr, i26, i30, i29);
                                } else {
                                    m20942b(sArr, i26, 1);
                                    iM20944d = m20944d(sArr2, 0, i30, i29);
                                }
                            } else {
                                iM20944d = iM20944d2;
                            }
                        }
                        int i35 = this.f63674u;
                        int i36 = this.f63675v;
                        if (i35 == 0 || (i12 = this.f63672s) == 0 || i36 > i35 * 3 || i35 * 2 <= this.f63673t * 3) {
                            i12 = iM20944d;
                        }
                        this.f63673t = i35;
                        this.f63672s = iM20944d;
                        if (d10 > 1.0d) {
                            short[] sArr3 = this.f63663j;
                            if (f13 >= 2.0f) {
                                i14 = (int) (i12 / (f13 - 1.0f));
                            } else {
                                this.f63671r = (int) (((2.0f - f13) * i12) / (f13 - 1.0f));
                                i14 = i12;
                            }
                            short[] sArrM20943c = m20943c(this.f63665l, this.f63666m, i14);
                            this.f63665l = sArrM20943c;
                            int i37 = i26;
                            m20940e(i14, this.f63655b, sArrM20943c, this.f63666m, sArr3, i37, sArr3, i26 + i12);
                            this.f63666m += i14;
                            i26 = i12 + i14 + i37;
                        } else {
                            int i38 = i26;
                            short[] sArr4 = this.f63663j;
                            if (f13 < 0.5f) {
                                i13 = (int) ((i12 * f13) / (1.0f - f13));
                            } else {
                                this.f63671r = (int) ((((2.0f * f13) - 1.0f) * i12) / (1.0f - f13));
                                i13 = i12;
                            }
                            int i39 = i12 + i13;
                            short[] sArrM20943c2 = m20943c(this.f63665l, this.f63666m, i39);
                            this.f63665l = sArrM20943c2;
                            System.arraycopy(sArr4, i38 * i22, sArrM20943c2, this.f63666m * i22, i12 * i22);
                            m20940e(i13, this.f63655b, this.f63665l, this.f63666m + i12, sArr4, i38 + i12, sArr4, i38);
                            this.f63666m += i39;
                            i26 = i38 + i13;
                        }
                    }
                    if (i26 + i25 > i24) {
                        break;
                    }
                    i21 = i10;
                    i20 = i11;
                    f14 = f10;
                    i23 = 1;
                }
                int i40 = this.f63664k - i26;
                short[] sArr5 = this.f63663j;
                System.arraycopy(sArr5, i26 * i22, sArr5, 0, i40 * i22);
                this.f63664k = i40;
            }
            if (f10 != 1.0f || this.f63666m == (i15 = i11)) {
            }
            int i41 = i10;
            int i42 = (int) (i41 / f10);
            int i43 = i41;
            while (true) {
                if (i42 <= 16384 && i43 <= 16384) {
                    break;
                }
                i42 /= 2;
                i43 /= 2;
            }
            int i44 = this.f63666m - i15;
            short[] sArrM20943c3 = m20943c(this.f63667n, this.f63668o, i44);
            this.f63667n = sArrM20943c3;
            System.arraycopy(this.f63665l, i15 * i22, sArrM20943c3, this.f63668o * i22, i44 * i22);
            this.f63666m = i15;
            this.f63668o += i44;
            int i45 = 0;
            while (true) {
                i16 = this.f63668o;
                i17 = i16 - 1;
                if (i45 >= i17) {
                    break;
                }
                while (true) {
                    i18 = this.f63669p + 1;
                    int i46 = i18 * i42;
                    i19 = this.f63670q;
                    if (i46 <= i19 * i43) {
                        break;
                    }
                    this.f63665l = m20943c(this.f63665l, this.f63666m, 1);
                    for (int i47 = 0; i47 < i22; i47++) {
                        short[] sArr6 = this.f63665l;
                        int i48 = (this.f63666m * i22) + i47;
                        short[] sArr7 = this.f63667n;
                        int i49 = (i45 * i22) + i47;
                        short s10 = sArr7[i49];
                        short s11 = sArr7[i49 + i22];
                        int i50 = this.f63670q * i43;
                        int i51 = this.f63669p;
                        int i52 = i51 * i42;
                        int i53 = (i51 + 1) * i42;
                        int i54 = i53 - i50;
                        int i55 = i53 - i52;
                        sArr6[i48] = (short) ((((i55 - i54) * s11) + (s10 * i54)) / i55);
                    }
                    this.f63670q++;
                    this.f63666m++;
                }
                this.f63669p = i18;
                if (i18 == i43) {
                    this.f63669p = 0;
                    AbstractC20800b.m21320h(i19 == i42);
                    this.f63670q = 0;
                }
                i45++;
            }
            if (i17 == 0) {
                return;
            }
            short[] sArr8 = this.f63667n;
            System.arraycopy(sArr8, i17 * i22, sArr8, 0, (i16 - i17) * i22);
            this.f63668o -= i17;
            return;
        }
        m20941a(this.f63663j, 0, this.f63664k);
        this.f63664k = 0;
        i11 = i20;
        f10 = f14;
        i10 = i21;
        if (f10 != 1.0f) {
        }
    }
}
