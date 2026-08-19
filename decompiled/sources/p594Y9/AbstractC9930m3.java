package p594Y9;

import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.C17948X0;

/* JADX INFO: renamed from: Y9.m3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9930m3 {
    /* JADX INFO: renamed from: a */
    public static final float m10587a(float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f10)) & 8589934591L) / ((long) 3))) + 709952852);
        float f11 = fIntBitsToFloat - ((fIntBitsToFloat - (f10 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f11 - ((f11 - (f10 / (f11 * f11))) * 0.33333334f);
    }

    /* JADX INFO: renamed from: b */
    public static C17948X0 m10588b(C3676s c3676s) {
        try {
            return new C17948X0(c3676s.m4395w("duration").mo4382p(), c3676s.m4395w("start").mo4382p());
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Download", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Download", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Download", e12);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final float m10589c(float f10, float f11, float f12) {
        return (f12 * f11) + ((1 - f12) * f10);
    }

    /* JADX INFO: renamed from: d */
    public static final int m10590d(float f10, int i10, int i11) {
        return i10 + ((int) Math.round(((double) (i11 - i10)) * ((double) f10)));
    }
}
