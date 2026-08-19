package p594Y9;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.C17958b1;

/* JADX INFO: renamed from: Y9.p3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9948p3 {
    /* JADX INFO: renamed from: a */
    public static C17958b1 m10605a(C3676s c3676s) {
        try {
            String name = c3676s.m4395w(DiagnosticsEntry.NAME_KEY).mo4384r();
            String version = c3676s.m4395w("version").mo4384r();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("build");
            String strMo4384r = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            String versionMajor = c3676s.m4395w("version_major").mo4384r();
            AbstractC16544l.m18093f(name, "name");
            AbstractC16544l.m18093f(version, "version");
            AbstractC16544l.m18093f(versionMajor, "versionMajor");
            return new C17958b1(name, version, strMo4384r, versionMajor);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Os", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Os", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Os", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m10606b(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }
}
