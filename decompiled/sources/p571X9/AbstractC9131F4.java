package p571X9;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Bitmap;
import android.os.Build;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.C17918N;
import p919o8.C17935T;
import p919o8.C17938U;

/* JADX INFO: renamed from: X9.F4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9131F4 {
    /* JADX INFO: renamed from: a */
    public static C17935T m9672a(C3676s c3676s) {
        try {
            long jMo4382p = c3676s.m4395w("format_version").mo4382p();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w(ParameterNames.SESSION);
            C17938U c17938uM9679a = abstractC3673pM4395w != null ? AbstractC9137G4.m9679a(abstractC3673pM4395w.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("configuration");
            C17918N c17918nM9632b = abstractC3673pM4395w2 != null ? AbstractC9101A4.m9632b(abstractC3673pM4395w2.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("browser_sdk_version");
            String strMo4384r = abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null;
            if (jMo4382p == 2) {
                return new C17935T(c17938uM9679a, c17918nM9632b, strMo4384r);
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Dd", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Dd", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Dd", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m9673b(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }
}
