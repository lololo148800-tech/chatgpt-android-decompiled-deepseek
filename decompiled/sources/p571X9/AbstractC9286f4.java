package p571X9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p1155zi.C21908E0;
import p1155zi.C21965U0;
import p1155zi.C21984a1;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p381Pe.C6397h;
import p479Td.C7326L;
import p479Td.C7351f0;
import p479Td.EnumC7359j0;
import p909nm.C17689w;
import p919o8.AbstractC17962d;
import p919o8.C18004r;
import p919o8.EnumC18028z;

/* JADX INFO: renamed from: X9.f4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9286f4 {
    /* JADX INFO: renamed from: a */
    public static final C6397h m9860a(C7351f0 message) {
        AbstractC16544l.m18094g(message, "message");
        return new C6397h(new C21984a1(message.f23286a), null, C17689w.f56480Y, message);
    }

    /* JADX INFO: renamed from: b */
    public static final ArrayList m9861b(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C21908E0 c21908e0 = (C21908E0) obj;
            List list3 = list2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it = list3.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!AbstractC16544l.m18089b(((C21965U0) it.next()).f69534a, c21908e0.f69452a));
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static final C7351f0 m9862c(String conversationId, String id2, String model) {
        AbstractC16544l.m18094g(conversationId, "conversationId");
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(model, "model");
        return new C7351f0(id2, null, conversationId, null, EnumC7359j0.f23346q0, new C7326L(""), model, null, null, null, null, null, null, null, model, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, -32886, 511);
    }

    /* JADX INFO: renamed from: d */
    public static C18004r m9863d(C3676s c3676s) {
        EnumC18028z enumC18028z;
        String strMo4384r;
        String strMo4384r2;
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("plan");
            int i10 = 0;
            if (abstractC3673pM4395w == null || (strMo4384r2 = abstractC3673pM4395w.mo4384r()) == null) {
                enumC18028z = null;
            } else {
                EnumC18028z[] enumC18028zArrValues = EnumC18028z.values();
                int length = enumC18028zArrValues.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    enumC18028z = enumC18028zArrValues[i11];
                    if (AbstractC16544l.m18089b(enumC18028z.f57546Y.toString(), strMo4384r2)) {
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
                    if (AbstractC17962d.m19610A(i12).equals(strMo4384r)) {
                        i10 = i12;
                    } else {
                        i10++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new C18004r(enumC18028z, i10);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type DdSession", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type DdSession", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type DdSession", e12);
        }
    }
}
