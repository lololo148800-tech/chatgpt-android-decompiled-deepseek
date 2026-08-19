package p594Y9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p523V9.AbstractC7944N;
import p571X9.InterfaceC9371u;
import p919o8.C17923O1;

/* JADX INFO: renamed from: Y9.d4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9874d4 {
    /* JADX INFO: renamed from: a */
    public static C17923O1 m10530a(C3676s c3676s) {
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("records_count");
            Long lValueOf = abstractC3673pM4395w != null ? Long.valueOf(abstractC3673pM4395w.mo4382p()) : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("segments_count");
            Long lValueOf2 = abstractC3673pM4395w2 != null ? Long.valueOf(abstractC3673pM4395w2.mo4382p()) : null;
            AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("segments_total_raw_size");
            return new C17923O1(lValueOf, lValueOf2, abstractC3673pM4395w3 != null ? Long.valueOf(abstractC3673pM4395w3.mo4382p()) : null);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type ReplayStats", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type ReplayStats", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type ReplayStats", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10531b(AbstractC7944N abstractC7944N, Collection collection) {
        collection.getClass();
        if (collection instanceof InterfaceC9371u) {
            collection = ((InterfaceC9371u) collection).m9951a();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= abstractC7944N.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= abstractC7944N.remove(it.next());
            }
            return zRemove;
        }
        Iterator<E> it2 = abstractC7944N.iterator();
        collection.getClass();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }
}
