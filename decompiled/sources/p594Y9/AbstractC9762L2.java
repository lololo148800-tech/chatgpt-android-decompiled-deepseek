package p594Y9;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.AbstractC17962d;
import p919o8.C17880A0;

/* JADX INFO: renamed from: Y9.L2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9762L2 {
    /* JADX INFO: renamed from: a */
    public static C17880A0 m10364a(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            String strMo4384r = c3676s.m4395w("type").mo4384r();
            AbstractC16544l.m18093f(strMo4384r, "jsonObject.get(\"type\").asString");
            for (int i10 : AbstractC0010F.m27k(3)) {
                if (AbstractC17962d.m19654o(i10).equals(strMo4384r)) {
                    AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("has_replay");
                    Boolean boolValueOf = abstractC3673pM4395w != null ? Boolean.valueOf(abstractC3673pM4395w.mo4380f()) : null;
                    AbstractC16544l.m18093f(id2, "id");
                    return new C17880A0(i10, boolValueOf, id2);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type LongTaskEventSession", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type LongTaskEventSession", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type LongTaskEventSession", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10365b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
