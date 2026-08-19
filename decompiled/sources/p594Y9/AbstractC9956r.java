package p594Y9;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: Y9.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9956r extends AbstractC9926m implements Set {

    /* JADX INFO: renamed from: Z */
    public transient AbstractC9950q f29521Z;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
