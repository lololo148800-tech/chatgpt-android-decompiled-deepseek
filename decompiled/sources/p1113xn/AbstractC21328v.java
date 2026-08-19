package p1113xn;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: xn.v */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC21328v extends AbstractC21327u {
    /* JADX INFO: renamed from: f */
    public static Double m21719f(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        try {
            if (AbstractC21321o.f67762a.m21664d(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static Float m21720g(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        try {
            if (AbstractC21321o.f67762a.m21664d(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
