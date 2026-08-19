package p594Y9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p1053v3.p1054lN.IGDwkYw;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.C17908J1;

/* JADX INFO: renamed from: Y9.Z3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9846Z3 {
    /* JADX INFO: renamed from: a */
    public static C17908J1 m10494a(C3676s c3676s) {
        try {
            return new C17908J1(c3676s.m4395w("count").mo4382p());
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type LongTask", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type LongTask", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type LongTask", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10495b(int i10, int i11) {
        String strM10505b;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strM10505b = AbstractC9853a4.m10505b("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "negative size: "));
                }
                strM10505b = AbstractC9853a4.m10505b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strM10505b);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m10496c(int i10, int i11, int i12) {
        String strM10497d;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strM10497d = m10497d(i10, i12, "start index");
            } else {
                strM10497d = (i11 < 0 || i11 > i12) ? m10497d(i11, i12, "end index") : AbstractC9853a4.m10505b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strM10497d);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m10497d(int i10, int i11, String str) {
        if (i10 < 0) {
            return AbstractC9853a4.m10505b("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return AbstractC9853a4.m10505b(IGDwkYw.rfcHtzpKR, str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "negative size: "));
    }
}
