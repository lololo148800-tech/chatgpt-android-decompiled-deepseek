package p594Y9;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.webkit.MimeTypeMap;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p1113xn.AbstractC21322p;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p496U5.AbstractC7565g;
import p919o8.AbstractC17962d;
import p919o8.C17949Y;

/* JADX INFO: renamed from: Y9.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9759L {
    /* JADX INFO: renamed from: a */
    public static C17949Y m10362a(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            String strMo4384r = c3676s.m4395w("type").mo4384r();
            AbstractC16544l.m18093f(strMo4384r, "jsonObject.get(\"type\").asString");
            for (int i10 : AbstractC0010F.m27k(3)) {
                if (AbstractC17962d.m19642d(i10).equals(strMo4384r)) {
                    AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("has_replay");
                    Boolean boolValueOf = abstractC3673pM4395w != null ? Boolean.valueOf(abstractC3673pM4395w.mo4380f()) : null;
                    AbstractC16544l.m18093f(id2, "id");
                    return new C17949Y(i10, boolValueOf, id2);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type ErrorEventSession", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type ErrorEventSession", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type ErrorEventSession", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m10363b(String str) {
        if (AbstractC21322p.m21681O(str)) {
            return null;
        }
        String strM21708p0 = AbstractC21322p.m21708p0(AbstractC21322p.m21708p0(str, '#'), '?');
        String strM21703k0 = AbstractC21322p.m21703k0('.', AbstractC21322p.m21703k0('/', strM21708p0, strM21708p0), "");
        if (AbstractC21322p.m21681O(strM21703k0)) {
            return null;
        }
        String lowerCase = strM21703k0.toLowerCase(Locale.ROOT);
        AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
        String str2 = (String) AbstractC7565g.f23967a.get(lowerCase);
        return str2 == null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase) : str2;
    }
}
