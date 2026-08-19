package p594Y9;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.AbstractC17962d;
import p919o8.C17966e0;
import p919o8.C17969f0;

/* JADX INFO: renamed from: Y9.Q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9789Q {
    /* JADX INFO: renamed from: a */
    public static C17969f0 m10407a(C3676s c3676s) {
        try {
            String strMo4384r = c3676s.m4395w("method").mo4384r();
            AbstractC16544l.m18093f(strMo4384r, "jsonObject.get(\"method\").asString");
            for (int i10 : AbstractC0010F.m27k(9)) {
                if (AbstractC17962d.m19646g(i10).equals(strMo4384r)) {
                    long jMo4382p = c3676s.m4395w("status_code").mo4382p();
                    String url = c3676s.m4395w("url").mo4384r();
                    AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("provider");
                    C17966e0 c17966e0M10397a = abstractC3673pM4395w != null ? AbstractC9783P.m10397a(abstractC3673pM4395w.m4390m()) : null;
                    AbstractC16544l.m18093f(url, "url");
                    return new C17969f0(i10, jMo4382p, url, c17966e0M10397a);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Resource", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Resource", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Resource", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m10408b(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * (-862048943)), 15)) * 461845907);
    }
}
