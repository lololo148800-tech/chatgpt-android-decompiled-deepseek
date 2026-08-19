package p736f0;

import com.google.protobuf.AbstractC12107L1;
import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: f0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13484b {

    /* JADX INFO: renamed from: a */
    public static final float[] f42668a;

    static {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float[] fArr = new float[101];
        f42668a = fArr;
        float[] fArr2 = new float[101];
        float f18 = 0.0f;
        float f19 = 0.0f;
        for (int i10 = 0; i10 < 100; i10++) {
            float f20 = i10 / 100;
            float f21 = 1.0f;
            while (true) {
                f10 = ((f21 - f18) / 2.0f) + f18;
                f11 = 1.0f - f10;
                f12 = f10 * 3.0f * f11;
                f13 = f10 * f10 * f10;
                float f22 = (((f10 * 0.35000002f) + (f11 * 0.175f)) * f12) + f13;
                if (Math.abs(f22 - f20) < 1.0E-5d) {
                    break;
                } else if (f22 > f20) {
                    f21 = f10;
                } else {
                    f18 = f10;
                }
            }
            float f23 = 0.5f;
            fArr[i10] = (((f11 * 0.5f) + f10) * f12) + f13;
            float f24 = 1.0f;
            while (true) {
                f14 = ((f24 - f19) / 2.0f) + f19;
                f15 = 1.0f - f14;
                f16 = f14 * 3.0f * f15;
                f17 = f14 * f14 * f14;
                float f25 = (((f15 * f23) + f14) * f16) + f17;
                if (Math.abs(f25 - f20) >= 1.0E-5d) {
                    if (f25 > f20) {
                        f24 = f14;
                    } else {
                        f19 = f14;
                    }
                    f23 = 0.5f;
                }
            }
            fArr2[i10] = (((f14 * 0.35000002f) + (f15 * 0.175f)) * f16) + f17;
        }
        fArr2[100] = 1.0f;
        fArr[100] = 1.0f;
    }

    /* JADX INFO: renamed from: a */
    public static C13483a m15001a(float f10) {
        float f11 = 0.0f;
        float f12 = 1.0f;
        float fM8920k = AbstractC8301I.m8920k(f10, 0.0f, 1.0f);
        float f13 = 100;
        int i10 = (int) (f13 * fM8920k);
        if (i10 < 100) {
            float f14 = i10 / f13;
            int i11 = i10 + 1;
            float f15 = i11 / f13;
            float[] fArr = f42668a;
            float f16 = fArr[i10];
            float f17 = (fArr[i11] - f16) / (f15 - f14);
            float fM13818i = AbstractC12107L1.m13818i(fM8920k, f14, f17, f16);
            f11 = f17;
            f12 = fM13818i;
        }
        return new C13483a(f12, f11);
    }
}
