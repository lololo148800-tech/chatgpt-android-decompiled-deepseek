package p817j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: renamed from: j$.util.stream.j */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15930j implements Collector {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Collector f49323a;

    private /* synthetic */ C15930j(Collector collector) {
        this.f49323a = collector;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Collector m17484a(Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C15924i ? ((C15924i) collector).f49314a : new C15930j(collector);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return this.f49323a.accumulator();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return AbstractC15886b3.m17457a(this.f49323a.characteristics());
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return this.f49323a.combiner();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.f49323a;
        if (obj instanceof C15930j) {
            obj = ((C15930j) obj).f49323a;
        }
        return collector.equals(obj);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return this.f49323a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.f49323a.hashCode();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return this.f49323a.supplier();
    }
}
