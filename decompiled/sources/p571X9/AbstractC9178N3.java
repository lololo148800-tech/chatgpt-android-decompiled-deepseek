package p571X9;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.AbstractC17962d;
import p919o8.C17953a;
import p919o8.C17956b;
import p919o8.C17992n;
import p919o8.C18013u;
import p919o8.C18016v;
import p919o8.C18022x;

/* JADX INFO: renamed from: X9.N3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9178N3 {
    /* JADX INFO: renamed from: a */
    public static C17953a m9734a(C3676s c3676s) {
        try {
            String strMo4384r = c3676s.m4395w("type").mo4384r();
            AbstractC16544l.m18093f(strMo4384r, "jsonObject.get(\"type\").asString");
            for (int i10 : AbstractC0010F.m27k(7)) {
                if (AbstractC17962d.m19652m(i10).equals(strMo4384r)) {
                    AbstractC3673p abstractC3673pM4395w = c3676s.m4395w(ParameterNames.f31999ID);
                    String strMo4384r2 = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
                    AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("loading_time");
                    Long lValueOf = abstractC3673pM4395w2 != null ? Long.valueOf(abstractC3673pM4395w2.mo4382p()) : null;
                    AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("target");
                    C17956b c17956bM9740a = abstractC3673pM4395w3 != null ? AbstractC9184O3.m9740a(abstractC3673pM4395w3.m4390m()) : null;
                    AbstractC3673p abstractC3673pM4395w4 = c3676s.m4395w("frustration");
                    C18016v c18016vM9907b = abstractC3673pM4395w4 != null ? AbstractC9310j4.m9907b(abstractC3673pM4395w4.m4390m()) : null;
                    AbstractC3673p abstractC3673pM4395w5 = c3676s.m4395w("error");
                    C18013u c18013uM9881b = abstractC3673pM4395w5 != null ? AbstractC9304i4.m9881b(abstractC3673pM4395w5.m4390m()) : null;
                    AbstractC3673p abstractC3673pM4395w6 = c3676s.m4395w("crash");
                    C17992n c17992nM9837b = abstractC3673pM4395w6 != null ? AbstractC9262b4.m9837b(abstractC3673pM4395w6.m4390m()) : null;
                    AbstractC3673p abstractC3673pM4395w7 = c3676s.m4395w("long_task");
                    C18022x c18022xM9910b = abstractC3673pM4395w7 != null ? AbstractC9316k4.m9910b(abstractC3673pM4395w7.m4390m()) : null;
                    AbstractC3673p abstractC3673pM4395w8 = c3676s.m4395w("resource");
                    return new C17953a(i10, strMo4384r2, lValueOf, c17956bM9740a, c18016vM9907b, c18013uM9881b, c17992nM9837b, c18022xM9910b, abstractC3673pM4395w8 != null ? AbstractC9334n4.m9934c(abstractC3673pM4395w8.m4390m()) : null);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type ActionEventAction", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type ActionEventAction", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type ActionEventAction", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Set m9735b() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }
}
