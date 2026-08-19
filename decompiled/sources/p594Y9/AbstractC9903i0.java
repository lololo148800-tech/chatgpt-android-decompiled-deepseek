package p594Y9;

import android.content.Context;
import android.content.Intent;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.Uri;
import com.auth0.android.provider.AuthenticationActivity;
import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p521V6.C7817j;
import p919o8.C17999p0;
import p919o8.C18014u0;
import p919o8.C18017v0;

/* JADX INFO: renamed from: Y9.i0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9903i0 {
    /* JADX INFO: renamed from: a */
    public static void m10566a(Context context, Uri uri, boolean z6, C7817j options) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(options, "options");
        Intent intent = new Intent(context, (Class<?>) AuthenticationActivity.class);
        intent.putExtra("com.auth0.android.EXTRA_AUTHORIZE_URI", uri);
        intent.putExtra("com.auth0.android.EXTRA_LAUNCH_AS_TWA", z6);
        intent.putExtra("com.auth0.android.EXTRA_CT_OPTIONS", options);
        intent.addFlags(67108864);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: b */
    public static C18014u0 m10567b(C3676s c3676s) {
        try {
            long jMo4382p = c3676s.m4395w("format_version").mo4382p();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w(ParameterNames.SESSION);
            C18017v0 c18017v0M10568a = abstractC3673pM4395w != null ? AbstractC9909j0.m10568a(abstractC3673pM4395w.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("configuration");
            C17999p0 c17999p0M10506a = abstractC3673pM4395w2 != null ? AbstractC9856b0.m10506a(abstractC3673pM4395w2.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("browser_sdk_version");
            String strMo4384r = abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w4 = c3676s.m4395w("discarded");
            Boolean boolValueOf = abstractC3673pM4395w4 != null ? Boolean.valueOf(abstractC3673pM4395w4.mo4380f()) : null;
            if (jMo4382p == 2) {
                return new C18014u0(c18017v0M10568a, c17999p0M10506a, strMo4384r, boolValueOf);
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
}
