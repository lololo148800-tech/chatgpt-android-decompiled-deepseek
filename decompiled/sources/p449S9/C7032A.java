package p449S9;

import java.io.Serializable;

/* JADX INFO: renamed from: S9.A */
/* JADX INFO: loaded from: classes.dex */
public final class C7032A extends AbstractC7097w implements Serializable {

    /* JADX INFO: renamed from: Y */
    public static final C7032A f22487Y = new C7032A();

    @Override // p449S9.AbstractC7097w
    /* JADX INFO: renamed from: a */
    public final AbstractC7097w mo7426a() {
        return C7096v.f22584Y;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
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
