package p594Y9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.C17960c0;

/* JADX INFO: renamed from: Y9.O */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9777O {
    /* JADX INFO: renamed from: a */
    public static C17960c0 m10383a(C3676s c3676s) {
        try {
            String name = c3676s.m4395w(DiagnosticsEntry.NAME_KEY).mo4384r();
            String version = c3676s.m4395w("version").mo4384r();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("build");
            String strMo4384r = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            String versionMajor = c3676s.m4395w("version_major").mo4384r();
            AbstractC16544l.m18093f(name, "name");
            AbstractC16544l.m18093f(version, "version");
            AbstractC16544l.m18093f(versionMajor, "versionMajor");
            return new C17960c0(name, version, strMo4384r, versionMajor);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Os", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Os", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Os", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10384b(int i10, int i11) {
        String strM10398b;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strM10398b = AbstractC9783P.m10398b("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "negative size: "));
                }
                strM10398b = AbstractC9783P.m10398b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strM10398b);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m10385c(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(m10387e(i10, i11, "index"));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m10386d(int i10, int i11, int i12) {
        String strM10387e;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strM10387e = m10387e(i10, i12, "start index");
            } else {
                strM10387e = (i11 < 0 || i11 > i12) ? m10387e(i11, i12, "end index") : AbstractC9783P.m10398b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strM10387e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m10387e(int i10, int i11, String str) {
        if (i10 < 0) {
            return AbstractC9783P.m10398b("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return AbstractC9783P.m10398b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "negative size: "));
    }
}
