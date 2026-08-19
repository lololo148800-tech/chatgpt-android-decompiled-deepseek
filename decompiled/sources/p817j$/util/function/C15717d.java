package p817j$.util.function;

import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.function.d */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15717d implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48967a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function f48968b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function f48969c;

    public /* synthetic */ C15717d(Function function, Function function2, int i10) {
        this.f48967a = i10;
        this.f48968b = function;
        this.f48969c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f48967a) {
            case 0:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f48967a) {
            case 0:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f48967a) {
            case 0:
                return this.f48969c.apply(this.f48968b.apply(obj));
            default:
                return this.f48968b.apply(this.f48969c.apply(obj));
        }
    }
}
