package p594Y9;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.segment.analytics.kotlin.core.Settings;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p775h2.AbstractC14376f;
import p919o8.AbstractC17976h1;
import p919o8.C17884B1;

/* JADX INFO: renamed from: Y9.S3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9804S3 {
    /* JADX INFO: renamed from: a */
    public static C17884B1 m10427a(C3676s c3676s) {
        try {
            String strMo4384r = c3676s.m4395w("type").mo4384r();
            AbstractC16544l.m18093f(strMo4384r, "jsonObject.get(\"type\").asString");
            for (int i10 : AbstractC0010F.m27k(7)) {
                if (AbstractC17976h1.m19675j(i10).equals(strMo4384r)) {
                    AbstractC3673p abstractC3673pM4395w = c3676s.m4395w(DiagnosticsEntry.NAME_KEY);
                    String strMo4384r2 = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
                    AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("model");
                    String strMo4384r3 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
                    AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("brand");
                    String strMo4384r4 = abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null;
                    AbstractC3673p abstractC3673pM4395w4 = c3676s.m4395w("architecture");
                    return new C17884B1(i10, strMo4384r2, strMo4384r3, strMo4384r4, abstractC3673pM4395w4 != null ? abstractC3673pM4395w4.mo4384r() : null);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Device", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Device", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Device", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10428b(Settings settings, int i10) {
        AbstractC16544l.m18094g(settings, "settings");
        AbstractC14376f.m15825D(i10, "type");
    }
}
