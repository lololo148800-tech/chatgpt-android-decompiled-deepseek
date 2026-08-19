package p817j$.util.function;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.function.a */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15714a implements BinaryOperator, Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48960a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f48961b;

    public /* synthetic */ C15714a(int i10, Object obj) {
        this.f48960a = i10;
        this.f48961b = obj;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f48960a) {
            case 0:
                break;
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m17338or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f48960a) {
            case 0:
                return ((Comparator) this.f48961b).compare(obj, obj2) >= 0 ? obj : obj2;
            default:
                return ((Comparator) this.f48961b).compare(obj, obj2) <= 0 ? obj : obj2;
        }
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.f48961b).test(obj);
    }
}
