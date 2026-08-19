package p449S9;

import java.io.Serializable;

/* JADX INFO: renamed from: S9.v */
/* JADX INFO: loaded from: classes.dex */
public final class C7096v extends AbstractC7097w implements Serializable {

    /* JADX INFO: renamed from: Y */
    public static final C7096v f22584Y = new C7096v();

    @Override // p449S9.AbstractC7097w
    /* JADX INFO: renamed from: a */
    public final AbstractC7097w mo7426a() {
        return C7032A.f22487Y;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
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
