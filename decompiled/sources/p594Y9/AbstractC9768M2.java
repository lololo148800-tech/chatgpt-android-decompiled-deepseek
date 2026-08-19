package p594Y9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.C17883B0;

/* JADX INFO: renamed from: Y9.M2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9768M2 {
    /* JADX INFO: renamed from: a */
    public static C17883B0 m10370a(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("referrer");
            String strMo4384r = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            String url = c3676s.m4395w("url").mo4384r();
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w(DiagnosticsEntry.NAME_KEY);
            String strMo4384r2 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
            AbstractC16544l.m18093f(id2, "id");
            AbstractC16544l.m18093f(url, "url");
            return new C17883B0(id2, strMo4384r, url, strMo4384r2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type LongTaskEventView", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type LongTaskEventView", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type LongTaskEventView", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10371b(int i10, int i11) {
        String strM10380b;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strM10380b = AbstractC9774N2.m10380b("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "negative size: "));
                }
                strM10380b = AbstractC9774N2.m10380b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strM10380b);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m10372c(int i10, int i11, int i12) {
        String strM10373d;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strM10373d = m10373d(i10, i12, "start index");
            } else {
                strM10373d = (i11 < 0 || i11 > i12) ? m10373d(i11, i12, "end index") : AbstractC9774N2.m10380b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strM10373d);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m10373d(int i10, int i11, String str) {
        if (i10 < 0) {
            return AbstractC9774N2.m10380b("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return AbstractC9774N2.m10380b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "negative size: "));
    }
}
