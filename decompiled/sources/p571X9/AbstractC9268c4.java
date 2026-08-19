package p571X9;

import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p737f1.C13522n;
import p919o8.C17977i;
import p919o8.C17995o;
import p919o8.C17998p;
import p919o8.C18004r;

/* JADX INFO: renamed from: X9.c4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9268c4 {
    /* JADX INFO: renamed from: a */
    public static C17995o m9840a(C3676s c3676s) {
        try {
            long jMo4382p = c3676s.m4395w("format_version").mo4382p();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w(ParameterNames.SESSION);
            C18004r c18004rM9863d = abstractC3673pM4395w != null ? AbstractC9286f4.m9863d(abstractC3673pM4395w.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("configuration");
            C17977i c17977iM9803a = abstractC3673pM4395w2 != null ? AbstractC9231W3.m9803a(abstractC3673pM4395w2.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("browser_sdk_version");
            String strMo4384r = abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w4 = c3676s.m4395w("action");
            C17998p c17998pM9843b = abstractC3673pM4395w4 != null ? AbstractC9274d4.m9843b(abstractC3673pM4395w4.m4390m()) : null;
            if (jMo4382p == 2) {
                return new C17995o(c18004rM9863d, c17977iM9803a, strMo4384r, c17998pM9843b);
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
    public static final void m9841b(C13522n c13522n) {
        AbstractC16544l.m18094g(c13522n, "<this>");
        try {
            c13522n.m15073b();
        } catch (Exception e10) {
            AbstractC8160o6.m8731f(AbstractC8168p6.m8749b("safeRequestFocus", null), "FocusRequester.requestFocus failed", e10, null, 4);
        }
    }
}
