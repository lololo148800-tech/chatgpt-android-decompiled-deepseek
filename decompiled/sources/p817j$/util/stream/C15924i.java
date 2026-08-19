package p817j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: renamed from: j$.util.stream.i */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15924i implements Collector {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Collector f49314a;

    private /* synthetic */ C15924i(Collector collector) {
        this.f49314a = collector;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Collector m17483a(Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C15930j ? ((C15930j) collector).f49323a : new C15924i(collector);
    }

    @Override // p817j$.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return this.f49314a.accumulator();
    }

    @Override // p817j$.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return AbstractC15886b3.m17457a(this.f49314a.characteristics());
    }

    @Override // p817j$.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return this.f49314a.combiner();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.f49314a;
        if (obj instanceof C15924i) {
            obj = ((C15924i) obj).f49314a;
        }
        return collector.equals(obj);
    }

    @Override // p817j$.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return this.f49314a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.f49314a.hashCode();
    }

    @Override // p817j$.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return this.f49314a.supplier();
    }
}
