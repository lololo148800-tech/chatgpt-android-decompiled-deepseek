package p523V9;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: V9.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7872E extends AbstractC8233y implements Set {

    /* JADX INFO: renamed from: Z */
    public transient AbstractC7864D f24779Z;

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
