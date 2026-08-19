package bb;

import java.io.Serializable;

/* JADX INFO: renamed from: bb.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C11292Q extends AbstractC11293S implements Serializable {

    /* JADX INFO: renamed from: Y */
    public static final C11292Q f34184Y = new C11292Q();

    @Override // bb.AbstractC11293S
    /* JADX INFO: renamed from: a */
    public final AbstractC11293S mo12712a() {
        return C11302a0.f34216Y;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
