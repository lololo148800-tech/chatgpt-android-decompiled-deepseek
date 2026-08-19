package p594Y9;

import android.net.Uri;
import android.util.Log;
import android.webkit.URLUtil;
import io.sentry.android.core.AbstractC15256t;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.AbstractC17962d;
import p919o8.C18017v0;
import p919o8.EnumC17889D0;

/* JADX INFO: renamed from: Y9.j0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9909j0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f29435a = 0;

    /* JADX INFO: renamed from: a */
    public static C18017v0 m10568a(C3676s c3676s) {
        EnumC17889D0 enumC17889D0;
        String strMo4384r;
        String strMo4384r2;
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("plan");
            int i10 = 0;
            if (abstractC3673pM4395w == null || (strMo4384r2 = abstractC3673pM4395w.mo4384r()) == null) {
                enumC17889D0 = null;
            } else {
                EnumC17889D0[] enumC17889D0ArrValues = EnumC17889D0.values();
                int length = enumC17889D0ArrValues.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    enumC17889D0 = enumC17889D0ArrValues[i11];
                    if (AbstractC16544l.m18089b(enumC17889D0.f57013Y.toString(), strMo4384r2)) {
                        break;
                    }
                    i11++;
                }
            }
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("session_precondition");
            if (abstractC3673pM4395w2 != null && (strMo4384r = abstractC3673pM4395w2.mo4384r()) != null) {
                int[] iArrM27k = AbstractC0010F.m27k(7);
                int length2 = iArrM27k.length;
                while (i10 < length2) {
                    int i12 = iArrM27k[i10];
                    if (AbstractC17962d.m19656q(i12).equals(strMo4384r)) {
                        i10 = i12;
                    } else {
                        i10++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new C18017v0(enumC17889D0, i10);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type DdSession", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type DdSession", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type DdSession", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m10569b(String str, String str2, String str3) {
        if (!URLUtil.isValidUrl(str3)) {
            AbstractC15256t.m16465c("j0", "The Domain is invalid and the Callback URI will not be set. You used: ".concat(str3));
            return null;
        }
        Uri uriBuild = Uri.parse(str3).buildUpon().scheme(str).appendPath("android").appendPath(str2).appendPath("callback").build();
        Log.v("j0", "The Callback URI is: " + uriBuild);
        return uriBuild.toString();
    }
}
