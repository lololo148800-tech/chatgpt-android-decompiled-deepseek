package p572Xa;

import java.util.Set;

/* JADX INFO: renamed from: Xa.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9415i extends AbstractC9411e implements Set, p817j$.util.Set {

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ int f28390o0 = 0;

    /* JADX INFO: renamed from: Z */
    public transient C9416j f28391Z;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9415i) {
            ((AbstractC9415i) obj).getClass();
            ((C9417k) obj).getClass();
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (set.size() == 0 && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
