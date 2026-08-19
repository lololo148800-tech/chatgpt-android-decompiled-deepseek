package p817j$.util.stream;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Stream;
import p817j$.util.AbstractC15666Q;
import p817j$.util.C15711e0;
import p817j$.util.Optional;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.a3 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15880a3 implements Stream {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Stream f49225a;

    private /* synthetic */ C15880a3(Stream stream) {
        this.f49225a = stream;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Stream m17441j(Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof Stream.Wrapper ? Stream.this : new C15880a3(stream);
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.f49225a.allMatch(predicate);
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.f49225a.anyMatch(predicate);
    }

    @Override // p817j$.util.stream.Stream
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Stream mo17428c(C15800K2 c15800k2) {
        return m17441j(this.f49225a.flatMap(AbstractC16012y0.m17540R(c15800k2)));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f49225a.close();
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ Object collect(Collector collector) {
        return this.f49225a.collect(C15930j.m17484a(collector));
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f49225a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.f49225a.count();
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return m17441j(this.f49225a.distinct());
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ Stream dropWhile(Predicate predicate) {
        return m17441j(this.f49225a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Stream stream = this.f49225a;
        if (obj instanceof C15880a3) {
            obj = ((C15880a3) obj).f49225a;
        }
        return stream.equals(obj);
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ Stream filter(Predicate predicate) {
        return m17441j(this.f49225a.filter(predicate));
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ Optional findAny() {
        return AbstractC15666Q.m17261i(this.f49225a.findAny());
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ Optional findFirst() {
        return AbstractC15666Q.m17261i(this.f49225a.findFirst());
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.f49225a.forEach(consumer);
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.f49225a.forEachOrdered(consumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49225a.hashCode();
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ boolean isParallel() {
        return this.f49225a.isParallel();
    }

    @Override // p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ Iterator iterator() {
        return this.f49225a.iterator();
    }

    @Override // p817j$.util.stream.Stream
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC15762D mo17429k(C15800K2 c15800k2) {
        return C15752B.m17360j(this.f49225a.flatMapToDouble(AbstractC16012y0.m17540R(c15800k2)));
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ Stream limit(long j10) {
        return m17441j(this.f49225a.limit(j10));
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ Stream map(Function function) {
        return m17441j(this.f49225a.map(function));
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ InterfaceC15762D mapToDouble(ToDoubleFunction toDoubleFunction) {
        return C15752B.m17360j(this.f49225a.mapToDouble(toDoubleFunction));
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        return IntStream.VivifiedWrapper.convert(this.f49225a.mapToInt(toIntFunction));
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ InterfaceC15955n0 mapToLong(ToLongFunction toLongFunction) {
        return C15943l0.m17499j(this.f49225a.mapToLong(toLongFunction));
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ Optional max(Comparator comparator) {
        return AbstractC15666Q.m17261i(this.f49225a.max(comparator));
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ Optional min(Comparator comparator) {
        return AbstractC15666Q.m17261i(this.f49225a.min(comparator));
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.f49225a.noneMatch(predicate);
    }

    @Override // p817j$.util.stream.Stream
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC15955n0 mo17430o(C15800K2 c15800k2) {
        return C15943l0.m17499j(this.f49225a.flatMapToLong(AbstractC16012y0.m17540R(c15800k2)));
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ InterfaceC15918h onClose(Runnable runnable) {
        return C15906f.m17477j(this.f49225a.onClose(runnable));
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ InterfaceC15918h parallel() {
        return C15906f.m17477j(this.f49225a.parallel());
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ Stream peek(Consumer consumer) {
        return m17441j(this.f49225a.peek(consumer));
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
        return AbstractC15666Q.m17261i(this.f49225a.reduce(binaryOperator));
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.f49225a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.f49225a.reduce(obj, binaryOperator);
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ InterfaceC15918h sequential() {
        return C15906f.m17477j(this.f49225a.sequential());
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ Stream skip(long j10) {
        return m17441j(this.f49225a.skip(j10));
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return m17441j(this.f49225a.sorted());
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return m17441j(this.f49225a.sorted(comparator));
    }

    @Override // p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ Spliterator spliterator() {
        return C15711e0.m17337a(this.f49225a.spliterator());
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ Stream takeWhile(Predicate predicate) {
        return m17441j(this.f49225a.takeWhile(predicate));
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.f49225a.toArray();
    }

    @Override // p817j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f49225a.toArray(intFunction);
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ InterfaceC15918h unordered() {
        return C15906f.m17477j(this.f49225a.unordered());
    }

    @Override // p817j$.util.stream.Stream
    /* JADX INFO: renamed from: y */
    public final /* synthetic */ IntStream mo17431y(C15800K2 c15800k2) {
        return IntStream.VivifiedWrapper.convert(this.f49225a.flatMapToInt(AbstractC16012y0.m17540R(c15800k2)));
    }
}
