package p594Y9;

import android.gov.nist.javax.sip.header.ParameterNames;
import bf.C11349D;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p001A.AbstractC0010F;
import p1155zi.C21936L0;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p919o8.AbstractC17976h1;
import p919o8.C17937T1;

/* JADX INFO: renamed from: Y9.n4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9937n4 {
    /* JADX INFO: renamed from: a */
    public static final List m10598a(List list, C11349D c11349d) {
        List list2 = list;
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(list2, 10));
        if (iM19257b < 16) {
            iM19257b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
        for (Object obj : list2) {
            linkedHashMap.put(new C21936L0(((C11349D) obj).f34318a), obj);
        }
        return AbstractC17680n.m19322C0(AbstractC17659D.m19249k(linkedHashMap, new C17309l(new C21936L0(c11349d.f34318a), c11349d)).values());
    }

    /* JADX INFO: renamed from: b */
    public static C17937T1 m10599b(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            String strMo4384r = c3676s.m4395w("type").mo4384r();
            AbstractC16544l.m18093f(strMo4384r, "jsonObject.get(\"type\").asString");
            for (int i10 : AbstractC0010F.m27k(3)) {
                if (AbstractC17976h1.m19670e(i10).equals(strMo4384r)) {
                    AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("has_replay");
                    Boolean boolValueOf = abstractC3673pM4395w != null ? Boolean.valueOf(abstractC3673pM4395w.mo4380f()) : null;
                    AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("is_active");
                    Boolean boolValueOf2 = abstractC3673pM4395w2 != null ? Boolean.valueOf(abstractC3673pM4395w2.mo4380f()) : null;
                    AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("sampled_for_replay");
                    Boolean boolValueOf3 = abstractC3673pM4395w3 != null ? Boolean.valueOf(abstractC3673pM4395w3.mo4380f()) : null;
                    AbstractC16544l.m18093f(id2, "id");
                    return new C17937T1(id2, i10, boolValueOf, boolValueOf2, boolValueOf3);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type ViewEventSession", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type ViewEventSession", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type ViewEventSession", e12);
        }
    }
}
