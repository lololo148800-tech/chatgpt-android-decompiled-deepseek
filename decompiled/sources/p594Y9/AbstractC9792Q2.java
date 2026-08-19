package p594Y9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p523V9.AbstractC7944N;
import p523V9.InterfaceC7888G;
import p919o8.C17898G0;

/* JADX INFO: renamed from: Y9.Q2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9792Q2 {
    /* JADX INFO: renamed from: a */
    public static C17898G0 m10409a(C3676s c3676s) {
        try {
            Number width = c3676s.m4395w("width").mo4383q();
            Number height = c3676s.m4395w("height").mo4383q();
            AbstractC16544l.m18093f(width, "width");
            AbstractC16544l.m18093f(height, "height");
            return new C17898G0(width, height);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Viewport", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Viewport", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Viewport", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10410b(AbstractC7944N abstractC7944N, Collection collection) {
        collection.getClass();
        if (collection instanceof InterfaceC7888G) {
            collection = ((InterfaceC7888G) collection).m8182a();
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
