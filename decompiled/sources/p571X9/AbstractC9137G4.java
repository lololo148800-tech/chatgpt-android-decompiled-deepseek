package p571X9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p817j$.util.DesugarCollections;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p909nm.C17690x;
import p919o8.AbstractC17962d;
import p919o8.C17938U;
import p919o8.EnumC17963d0;

/* JADX INFO: renamed from: X9.G4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9137G4 {
    /* JADX INFO: renamed from: a */
    public static C17938U m9679a(C3676s c3676s) {
        EnumC17963d0 enumC17963d0;
        String strMo4384r;
        String strMo4384r2;
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("plan");
            int i10 = 0;
            if (abstractC3673pM4395w == null || (strMo4384r2 = abstractC3673pM4395w.mo4384r()) == null) {
                enumC17963d0 = null;
            } else {
                EnumC17963d0[] enumC17963d0ArrValues = EnumC17963d0.values();
                int length = enumC17963d0ArrValues.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    enumC17963d0 = enumC17963d0ArrValues[i11];
                    if (AbstractC16544l.m18089b(enumC17963d0.f57336Y.toString(), strMo4384r2)) {
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
                    if (AbstractC17962d.m19648i(i12).equals(strMo4384r)) {
                        i10 = i12;
                    } else {
                        i10++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new C17938U(enumC17963d0, i10);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type DdSession", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type DdSession", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type DdSession", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final List m9680b(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? DesugarCollections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(AbstractC17680n.m19341Q(list));
        }
        return C17689w.f56480Y;
    }

    /* JADX INFO: renamed from: c */
    public static final Map m9681c(Map map) {
        int size = map.size();
        if (size == 0) {
            return C17690x.f56481Y;
        }
        if (size != 1) {
            return DesugarCollections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) AbstractC17680n.m19340P(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
