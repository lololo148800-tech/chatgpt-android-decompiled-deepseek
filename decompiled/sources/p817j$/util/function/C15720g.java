package p817j$.util.function;

import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.function.g */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15720g implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48974a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Predicate f48975b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Predicate f48976c;

    public /* synthetic */ C15720g(Predicate predicate, Predicate predicate2, int i10) {
        this.f48974a = i10;
        this.f48975b = predicate;
        this.f48976c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f48974a) {
            case 0:
                break;
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f48974a) {
            case 0:
                break;
        }
        return Predicate$CC.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public final /* synthetic */ Predicate m17339or(Predicate predicate) {
        switch (this.f48974a) {
            case 0:
                break;
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f48974a) {
            case 0:
                return this.f48975b.test(obj) && this.f48976c.test(obj);
            default:
                return this.f48975b.test(obj) || this.f48976c.test(obj);
        }
    }
}
