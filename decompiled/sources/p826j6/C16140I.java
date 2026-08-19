package p826j6;

import java.util.function.Predicate;
import p817j$.util.function.Predicate$CC;

/* JADX INFO: renamed from: j6.I */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16140I implements Predicate {
    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public final /* synthetic */ Predicate m17715or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return false;
    }
}
