package bb;

import java.io.Serializable;

/* JADX INFO: renamed from: bb.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11302a0 extends AbstractC11293S implements Serializable {

    /* JADX INFO: renamed from: Y */
    public static final C11302a0 f34216Y = new C11302a0();

    @Override // bb.AbstractC11293S
    /* JADX INFO: renamed from: a */
    public final AbstractC11293S mo12712a() {
        return C11292Q.f34184Y;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
