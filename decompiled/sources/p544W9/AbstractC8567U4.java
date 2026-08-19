package p544W9;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: W9.U4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8567U4 extends AbstractC8669l4 implements Set {

    /* JADX INFO: renamed from: Z */
    public transient AbstractC8561T4 f26393Z;

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
