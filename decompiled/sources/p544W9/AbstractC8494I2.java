package p544W9;

import p254K0.C4504a;
import p530Vi.AbstractC8301I;
import p895n1.C17425e;

/* JADX INFO: renamed from: W9.I2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8494I2 {

    /* JADX INFO: renamed from: a */
    public static C17425e f26314a;

    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d4 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static C4504a m9152a(float f10, float f11, float f12, float f13, float f14, int[] iArr, float f15, int[] iArr2, float f16, int[] iArr3) {
        int i10;
        int i11;
        float fMax;
        int i12;
        C4504a c4504a;
        int[] iArr4 = iArr3;
        int length = iArr4.length;
        C4504a c4504a2 = null;
        int i13 = 1;
        int i14 = 0;
        while (i14 < length) {
            int i15 = iArr4[i14];
            int length2 = iArr2.length;
            int i16 = 0;
            while (i16 < length2) {
                int i17 = iArr2[i16];
                int length3 = iArr.length;
                int i18 = 0;
                while (i18 < length3) {
                    int i19 = iArr[i18];
                    float f17 = f10 - ((((i15 + i17) + i19) - 1) * f11);
                    float fM8920k = AbstractC8301I.m8920k(f12, f13, f14);
                    float f18 = i15;
                    float f19 = i17;
                    float f20 = i19;
                    float f21 = f17 - ((fM8920k * f20) + ((f15 * f19) + (f16 * f18)));
                    if (i19 <= 0 || f21 <= 0.0f) {
                        i10 = length;
                        i11 = i18;
                        if (i19 > 0 && f21 < 0.0f) {
                            fMax = Math.max(f21 / f20, f13 - fM8920k);
                        }
                        if (i19 <= 0) {
                            fM8920k = 0.0f;
                        }
                        float f22 = f19 / 2.0f;
                        float f23 = (f17 - ((f20 + f22) * fM8920k)) / (f22 + f18);
                        float f24 = (f23 + fM8920k) / 2.0f;
                        if (i17 > 0 || f23 == f16) {
                            i12 = length3;
                        } else {
                            float f25 = (f16 - f23) * f18;
                            i12 = length3;
                            float fMin = Math.min(Math.abs(f25), 0.1f * f24 * f19);
                            if (f25 > 0.0f) {
                                f24 -= fMin / f19;
                                f23 = (fMin / f18) + f23;
                            } else {
                                f23 -= fMin / f18;
                                f24 = (fMin / f19) + f24;
                            }
                        }
                        int i20 = i11;
                        int i21 = i12;
                        int i22 = i17;
                        int i23 = i16;
                        int i24 = length2;
                        float f26 = f24;
                        int i25 = i15;
                        c4504a = new C4504a(i13, fM8920k, i19, f26, i22, f23, i25);
                        if (c4504a2 != null || C4504a.m5252a(c4504a, f16) < C4504a.m5252a(c4504a2, f16)) {
                            if (C4504a.m5252a(c4504a, f16) == 0.0f) {
                                return c4504a;
                            }
                            c4504a2 = c4504a;
                        }
                        i13++;
                        i18 = i20 + 1;
                        iArr = iArr;
                        i15 = i25;
                        length3 = i21;
                        length2 = i24;
                        length = i10;
                        i17 = i22;
                        i16 = i23;
                    } else {
                        i10 = length;
                        i11 = i18;
                        fMax = Math.min(f21 / f20, f14 - fM8920k);
                    }
                    fM8920k = fMax + fM8920k;
                    if (i19 <= 0) {
                        fM8920k = 0.0f;
                    }
                    float f27 = f19 / 2.0f;
                    float f28 = (f17 - ((f20 + f27) * fM8920k)) / (f27 + f18);
                    float f29 = (f28 + fM8920k) / 2.0f;
                    if (i17 > 0) {
                        i12 = length3;
                    } else {
                        i12 = length3;
                    }
                    int i26 = i11;
                    int i27 = i12;
                    int i28 = i17;
                    int i29 = i16;
                    int i210 = length2;
                    float f210 = f29;
                    int i211 = i15;
                    c4504a = new C4504a(i13, fM8920k, i19, f210, i28, f28, i211);
                    if (c4504a2 != null) {
                        if (C4504a.m5252a(c4504a, f16) == 0.0f) {
                            return c4504a;
                        }
                        c4504a2 = c4504a;
                    } else {
                        if (C4504a.m5252a(c4504a, f16) == 0.0f) {
                            return c4504a;
                        }
                        c4504a2 = c4504a;
                    }
                    i13++;
                    i18 = i26 + 1;
                    iArr = iArr;
                    i15 = i211;
                    length3 = i27;
                    length2 = i210;
                    length = i10;
                    i17 = i28;
                    i16 = i29;
                }
                i16++;
                iArr = iArr;
                iArr2 = iArr2;
            }
            i14++;
            iArr4 = iArr3;
        }
        return c4504a2;
    }
}
