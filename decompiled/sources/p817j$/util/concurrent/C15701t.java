package p817j$.util.concurrent;

import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import p817j$.util.function.BiConsumer$CC;
import p817j$.util.function.BiFunction$CC;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.concurrent.t */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15701t implements BiConsumer, BiFunction, Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48942a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f48943b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f48944c;

    public /* synthetic */ C15701t(int i10, Object obj, Object obj2) {
        this.f48942a = i10;
        this.f48943b = obj;
        this.f48944c = obj2;
    }

    public /* synthetic */ C15701t(BiFunction biFunction, Function function) {
        this.f48942a = 2;
        this.f48944c = biFunction;
        this.f48943b = function;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f48942a) {
            case 0:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        ((Consumer) this.f48943b).accept(obj);
        ((Consumer) this.f48944c).accept(obj);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.f48943b).apply(((BiFunction) this.f48944c).apply(obj, obj2));
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f48942a) {
            case 0:
                break;
            default:
                ((BiConsumer) this.f48943b).accept(obj, obj2);
                ((BiConsumer) this.f48944c).accept(obj, obj2);
                return;
        }
        do {
            Object objApply = ((BiFunction) this.f48944c).apply(obj, obj2);
            ConcurrentMap concurrentMap = (ConcurrentMap) this.f48943b;
            if (concurrentMap.replace(obj, obj2, objApply)) {
                return;
            } else {
                obj2 = concurrentMap.get(obj);
            }
        } while (obj2 != null);
    }
}
