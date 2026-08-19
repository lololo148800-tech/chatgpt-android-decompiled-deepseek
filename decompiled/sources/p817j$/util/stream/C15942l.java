package p817j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.l */
/* JADX INFO: loaded from: classes4.dex */
final class C15942l implements Collector {

    /* JADX INFO: renamed from: a */
    private final Supplier f49334a;

    /* JADX INFO: renamed from: b */
    private final BiConsumer f49335b;

    /* JADX INFO: renamed from: c */
    private final BinaryOperator f49336c;

    /* JADX INFO: renamed from: d */
    private final Function f49337d;

    /* JADX INFO: renamed from: e */
    private final Set f49338e;

    C15942l(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, Set set) {
        this.f49334a = supplier;
        this.f49335b = biConsumer;
        this.f49336c = binaryOperator;
        this.f49337d = function;
        this.f49338e = set;
    }

    @Override // p817j$.util.stream.Collector
    public final BiConsumer accumulator() {
        return this.f49335b;
    }

    @Override // p817j$.util.stream.Collector
    public final Supplier supplier() {
        return this.f49334a;
    }

    @Override // p817j$.util.stream.Collector
    public final BinaryOperator combiner() {
        return this.f49336c;
    }

    @Override // p817j$.util.stream.Collector
    public final Function finisher() {
        return this.f49337d;
    }

    @Override // p817j$.util.stream.Collector
    public final Set characteristics() {
        return this.f49338e;
    }
}
