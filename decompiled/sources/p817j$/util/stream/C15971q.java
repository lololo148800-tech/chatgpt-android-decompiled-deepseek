package p817j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import p817j$.util.function.BiFunction$CC;

/* JADX INFO: renamed from: j$.util.stream.q */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15971q implements BinaryOperator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49383a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BiConsumer f49384b;

    public /* synthetic */ C15971q(BiConsumer biConsumer, int i10) {
        this.f49383a = i10;
        this.f49384b = biConsumer;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f49383a) {
            case 0:
                break;
            case 1:
                break;
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f49383a) {
            case 0:
                this.f49384b.accept(obj, obj2);
                break;
            case 1:
                this.f49384b.accept(obj, obj2);
                break;
            default:
                this.f49384b.accept(obj, obj2);
                break;
        }
        return obj;
    }
}
