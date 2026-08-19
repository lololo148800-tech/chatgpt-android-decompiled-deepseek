package p817j$.util.stream;

import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import p817j$.util.AbstractC15666Q;
import p817j$.util.C15653D;
import p817j$.util.C15667S;
import p817j$.util.C15711e0;
import p817j$.util.C16024v;
import p817j$.util.C16028z;
import p817j$.util.InterfaceC15655F;
import p817j$.util.InterfaceC15669U;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.B */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15752B implements InterfaceC15762D {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DoubleStream f49033a;

    private /* synthetic */ C15752B(DoubleStream doubleStream) {
        this.f49033a = doubleStream;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InterfaceC15762D m17360j(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof C15757C ? ((C15757C) doubleStream).f49039a : new C15752B(doubleStream);
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC15762D mo17347a() {
        return m17360j(this.f49033a.takeWhile(null));
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ C16028z average() {
        return AbstractC15666Q.m17262j(this.f49033a.average());
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC15762D mo17348b() {
        return m17360j(this.f49033a.filter(null));
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ Stream boxed() {
        return C15880a3.m17441j(this.f49033a.boxed());
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f49033a.close();
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f49033a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ long count() {
        return this.f49033a.count();
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC15762D mo17350d() {
        return m17360j(this.f49033a.dropWhile(null));
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ InterfaceC15762D distinct() {
        return m17360j(this.f49033a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.f49033a;
        if (obj instanceof C15752B) {
            obj = ((C15752B) obj).f49033a;
        }
        return doubleStream.equals(obj);
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ C16028z findAny() {
        return AbstractC15666Q.m17262j(this.f49033a.findAny());
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ C16028z findFirst() {
        return AbstractC15666Q.m17262j(this.f49033a.findFirst());
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f49033a.forEach(doubleConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f49033a.forEachOrdered(doubleConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean mo17351h() {
        return this.f49033a.allMatch(null);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49033a.hashCode();
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC15955n0 mo17352i() {
        return C15943l0.m17499j(this.f49033a.mapToLong(null));
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ boolean isParallel() {
        return this.f49033a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ InterfaceC15655F iterator() {
        return C15653D.m17242a(this.f49033a.iterator());
    }

    @Override // p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ Iterator iterator() {
        return this.f49033a.iterator();
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ InterfaceC15762D limit(long j10) {
        return m17360j(this.f49033a.limit(j10));
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ InterfaceC15762D map(DoubleUnaryOperator doubleUnaryOperator) {
        return m17360j(this.f49033a.map(doubleUnaryOperator));
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return C15880a3.m17441j(this.f49033a.mapToObj(doubleFunction));
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ C16028z max() {
        return AbstractC15666Q.m17262j(this.f49033a.max());
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ C16028z min() {
        return AbstractC15666Q.m17262j(this.f49033a.min());
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ InterfaceC15918h onClose(Runnable runnable) {
        return C15906f.m17477j(this.f49033a.onClose(runnable));
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean mo17353p() {
        return this.f49033a.anyMatch(null);
    }

    @Override // p817j$.util.stream.InterfaceC15762D, p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ InterfaceC15762D parallel() {
        return m17360j(this.f49033a.parallel());
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ InterfaceC15918h parallel() {
        return C15906f.m17477j(this.f49033a.parallel());
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ InterfaceC15762D peek(DoubleConsumer doubleConsumer) {
        return m17360j(this.f49033a.peek(doubleConsumer));
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f49033a.reduce(d10, doubleBinaryOperator);
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ C16028z reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC15666Q.m17262j(this.f49033a.reduce(doubleBinaryOperator));
    }

    @Override // p817j$.util.stream.InterfaceC15762D, p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ InterfaceC15762D sequential() {
        return m17360j(this.f49033a.sequential());
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ InterfaceC15918h sequential() {
        return C15906f.m17477j(this.f49033a.sequential());
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ InterfaceC15762D skip(long j10) {
        return m17360j(this.f49033a.skip(j10));
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ InterfaceC15762D sorted() {
        return m17360j(this.f49033a.sorted());
    }

    @Override // p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ Spliterator spliterator() {
        return C15711e0.m17337a(this.f49033a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ InterfaceC15669U spliterator() {
        return C15667S.m17272a(this.f49033a.spliterator());
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ double sum() {
        return this.f49033a.sum();
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    /* JADX INFO: renamed from: t */
    public final /* synthetic */ IntStream mo17354t() {
        return IntStream.VivifiedWrapper.convert(this.f49033a.mapToInt(null));
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ double[] toArray() {
        return this.f49033a.toArray();
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ InterfaceC15918h unordered() {
        return C15906f.m17477j(this.f49033a.unordered());
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean mo17355x() {
        return this.f49033a.noneMatch(null);
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final C16024v summaryStatistics() {
        this.f49033a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    /* JADX INFO: renamed from: c */
    public final InterfaceC15762D mo17349c(C15800K2 c15800k2) {
        DoubleStream doubleStream = this.f49033a;
        C15800K2 c15800k3 = new C15800K2(5);
        c15800k3.f49106b = c15800k2;
        return m17360j(doubleStream.flatMap(c15800k3));
    }
}
