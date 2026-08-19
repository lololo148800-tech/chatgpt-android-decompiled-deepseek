package p817j$.util.function;

import java.util.function.Predicate;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.util.function.Predicate$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Predicate$CC {
    public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new C15720g(predicate, predicate2, 0);
    }

    public static Predicate $default$negate(Predicate predicate) {
        return new C15714a(2, predicate);
    }

    public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new C15720g(predicate, predicate2, 1);
    }
}
