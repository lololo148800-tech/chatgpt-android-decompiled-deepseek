package p571X9;

import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.C17968f;

/* JADX INFO: renamed from: X9.R3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9201R3 {
    /* JADX INFO: renamed from: a */
    public static C17968f m9766a(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            AbstractC16544l.m18093f(id2, "id");
            return new C17968f(id2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Application", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Application", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Application", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9767b(int i10, int i11) {
        String strM9774b;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strM9774b = AbstractC9207S3.m9774b("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 15);
                    sb2.append("negative size: ");
                    sb2.append(i11);
                    throw new IllegalArgumentException(sb2.toString());
                }
                strM9774b = AbstractC9207S3.m9774b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strM9774b);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m9768c(int i10, int i11, int i12) {
        String strM9769d;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strM9769d = m9769d(i10, i12, "start index");
            } else {
                strM9769d = (i11 < 0 || i11 > i12) ? m9769d(i11, i12, "end index") : AbstractC9207S3.m9774b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strM9769d);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m9769d(int i10, int i11, String str) {
        if (i10 < 0) {
            return AbstractC9207S3.m9774b("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return AbstractC9207S3.m9774b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 15);
        sb2.append("negative size: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }
}
