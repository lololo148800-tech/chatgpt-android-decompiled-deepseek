package p817j$.util.stream;

import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;
import p817j$.util.AbstractC15666Q;
import p817j$.util.C15651B;
import p817j$.util.C15661L;
import p817j$.util.C15673Y;
import p817j$.util.C15711e0;
import p817j$.util.C16027y;
import p817j$.util.C16028z;
import p817j$.util.InterfaceC15663N;
import p817j$.util.InterfaceC15676a0;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.l0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15943l0 implements InterfaceC15955n0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LongStream f49339a;

    private /* synthetic */ C15943l0(LongStream longStream) {
        this.f49339a = longStream;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InterfaceC15955n0 m17499j(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C15949m0 ? ((C15949m0) longStream).f49346a : new C15943l0(longStream);
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC15955n0 mo17489a() {
        return m17499j(this.f49339a.takeWhile(null));
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final /* synthetic */ InterfaceC15762D asDoubleStream() {
        return C15752B.m17360j(this.f49339a.asDoubleStream());
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final /* synthetic */ C16028z average() {
        return AbstractC15666Q.m17262j(this.f49339a.average());
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC15955n0 mo17490b() {
        return m17499j(this.f49339a.filter(null));
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final /* synthetic */ Stream boxed() {
        return C15880a3.m17441j(this.f49339a.boxed());
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f49339a.close();
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f49339a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final /* synthetic */ long count() {
        return this.f49339a.count();
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC15955n0 mo17492d() {
        return m17499j(this.f49339a.dropWhile(null));
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final /* synthetic */ InterfaceC15955n0 distinct() {
        return m17499j(this.f49339a.distinct());
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC15955n0 mo17493e() {
        return m17499j(this.f49339a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.f49339a;
        if (obj instanceof C15943l0) {
            obj = ((C15943l0) obj).f49339a;
        }
        return longStream.equals(obj);
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final /* synthetic */ C15651B findAny() {
        return AbstractC15666Q.m17264l(this.f49339a.findAny());
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final /* synthetic */ C15651B findFirst() {
        return AbstractC15666Q.m17264l(this.f49339a.findFirst());
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f49339a.forEach(longConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f49339a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49339a.hashCode();
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ boolean isParallel() {
        return this.f49339a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // p817j$.util.stream.InterfaceC15955n0, p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ InterfaceC15663N iterator() {
        return C15661L.m17246a(this.f49339a.iterator());
    }

    @Override // p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ Iterator iterator() {
        return this.f49339a.iterator();
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC15762D mo17494l() {
        return C15752B.m17360j(this.f49339a.mapToDouble(null));
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final /* synthetic */ InterfaceC15955n0 limit(long j10) {
        return m17499j(this.f49339a.limit(j10));
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return C15880a3.m17441j(this.f49339a.mapToObj(longFunction));
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final /* synthetic */ C15651B max() {
        return AbstractC15666Q.m17264l(this.f49339a.max());
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final /* synthetic */ C15651B min() {
        return AbstractC15666Q.m17264l(this.f49339a.min());
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean mo17495n() {
        return this.f49339a.noneMatch(null);
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ InterfaceC15918h onClose(Runnable runnable) {
        return C15906f.m17477j(this.f49339a.onClose(runnable));
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ InterfaceC15918h parallel() {
        return C15906f.m17477j(this.f49339a.parallel());
    }

    @Override // p817j$.util.stream.InterfaceC15955n0, p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ InterfaceC15955n0 parallel() {
        return m17499j(this.f49339a.parallel());
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final /* synthetic */ InterfaceC15955n0 peek(LongConsumer longConsumer) {
        return m17499j(this.f49339a.peek(longConsumer));
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ boolean mo17496r() {
        return this.f49339a.allMatch(null);
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final /* synthetic */ long reduce(long j10, LongBinaryOperator longBinaryOperator) {
        return this.f49339a.reduce(j10, longBinaryOperator);
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final /* synthetic */ C15651B reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC15666Q.m17264l(this.f49339a.reduce(longBinaryOperator));
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ InterfaceC15918h sequential() {
        return C15906f.m17477j(this.f49339a.sequential());
    }

    @Override // p817j$.util.stream.InterfaceC15955n0, p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ InterfaceC15955n0 sequential() {
        return m17499j(this.f49339a.sequential());
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final /* synthetic */ InterfaceC15955n0 skip(long j10) {
        return m17499j(this.f49339a.skip(j10));
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final /* synthetic */ InterfaceC15955n0 sorted() {
        return m17499j(this.f49339a.sorted());
    }

    @Override // p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ Spliterator spliterator() {
        return C15711e0.m17337a(this.f49339a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // p817j$.util.stream.InterfaceC15955n0, p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ InterfaceC15676a0 spliterator() {
        return C15673Y.m17290a(this.f49339a.spliterator());
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final /* synthetic */ long sum() {
        return this.f49339a.sum();
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final /* synthetic */ long[] toArray() {
        return this.f49339a.toArray();
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ InterfaceC15918h unordered() {
        return C15906f.m17477j(this.f49339a.unordered());
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    /* JADX INFO: renamed from: v */
    public final /* synthetic */ boolean mo17497v() {
        return this.f49339a.anyMatch(null);
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    /* JADX INFO: renamed from: w */
    public final /* synthetic */ IntStream mo17498w() {
        return IntStream.VivifiedWrapper.convert(this.f49339a.mapToInt(null));
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final C16027y summaryStatistics() {
        this.f49339a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    /* JADX INFO: renamed from: c */
    public final InterfaceC15955n0 mo17491c(C15800K2 c15800k2) {
        LongStream longStream = this.f49339a;
        C15800K2 c15800k3 = new C15800K2(7);
        c15800k3.f49106b = c15800k2;
        return m17499j(longStream.flatMap(c15800k3));
    }
}
