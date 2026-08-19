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
import p817j$.util.Objects;
import p817j$.util.Optional;
import p817j$.util.Spliterator;
import p817j$.util.Spliterators;
import p817j$.util.function.C15714a;

/* JADX INFO: renamed from: j$.util.stream.g2 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15915g2 extends AbstractC15882b implements Stream {
    @Override // p817j$.util.stream.Stream
    public final Stream sorted() {
        return new C15795J2(this);
    }

    @Override // p817j$.util.stream.Stream
    public final Stream distinct() {
        return new C15960o(this, EnumC15904e3.f49272m | EnumC15904e3.f49279t, 0);
    }

    @Override // p817j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new C15714a(1, comparator));
    }

    @Override // p817j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) m17445C(C15792J.f49094d);
    }

    @Override // p817j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) m17445C(C15792J.f49093c);
    }

    @Override // p817j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new C15795J2(this, comparator);
    }

    @Override // p817j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return m17445C(new C15769E1(EnumC15910f3.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // p817j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return m17445C(new C15769E1(EnumC15910f3.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        m17445C(new C15822P(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        m17445C(new C15822P(consumer, true));
    }

    @Override // p817j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new C15714a(0, comparator));
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: H */
    final EnumC15910f3 mo17344H() {
        return EnumC15910f3.REFERENCE;
    }

    @Override // p817j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (Optional) m17445C(new C15759C1(EnumC15910f3.REFERENCE, binaryOperator, 2));
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: E */
    final InterfaceC15798K0 mo17342E(AbstractC15882b abstractC15882b, Spliterator spliterator, boolean z6, IntFunction intFunction) {
        return AbstractC16012y0.m17527E(abstractC15882b, spliterator, z6, intFunction);
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: T */
    final Spliterator mo17346T(AbstractC15882b abstractC15882b, Supplier supplier, boolean z6) {
        return new C15796J3(abstractC15882b, supplier, z6);
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: G */
    final boolean mo17343G(Spliterator spliterator, InterfaceC15963o2 interfaceC15963o2) {
        boolean zMo17358n;
        do {
            zMo17358n = interfaceC15963o2.mo17358n();
            if (zMo17358n) {
                break;
            }
        } while (spliterator.tryAdvance(interfaceC15963o2));
        return zMo17358n;
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: M */
    final InterfaceC15758C0 mo17345M(long j10, IntFunction intFunction) {
        return AbstractC16012y0.m17526D(j10, intFunction);
    }

    @Override // p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    public final Iterator iterator() {
        return Spliterators.m17281i(spliterator());
    }

    @Override // p817j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new C15981s(this, EnumC15904e3.f49279t, predicate, 4);
    }

    @Override // p817j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new C15981s(this, EnumC15904e3.f49275p | EnumC15904e3.f49273n, function, 5);
    }

    @Override // p817j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new C15861X(this, EnumC15904e3.f49275p | EnumC15904e3.f49273n, toIntFunction, 2);
    }

    @Override // p817j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return m17445C(new C15769E1(EnumC15910f3.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // p817j$.util.stream.Stream
    public final InterfaceC15955n0 mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new C15919h0(this, EnumC15904e3.f49275p | EnumC15904e3.f49273n, toLongFunction, 3);
    }

    @Override // p817j$.util.stream.Stream
    public final InterfaceC15762D mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new C15986t(this, EnumC15904e3.f49275p | EnumC15904e3.f49273n, toDoubleFunction, 3);
    }

    @Override // p817j$.util.stream.Stream
    public final long count() {
        return ((Long) m17445C(new C15779G1(2))).longValue();
    }

    @Override // p817j$.util.stream.Stream
    /* JADX INFO: renamed from: c */
    public final Stream mo17428c(C15800K2 c15800k2) {
        Objects.requireNonNull(c15800k2);
        return new C15981s(this, EnumC15904e3.f49275p | EnumC15904e3.f49273n | EnumC15904e3.f49279t, c15800k2, 6);
    }

    @Override // p817j$.util.stream.Stream
    /* JADX INFO: renamed from: y */
    public final IntStream mo17431y(C15800K2 c15800k2) {
        Objects.requireNonNull(c15800k2);
        return new C15861X(this, EnumC15904e3.f49275p | EnumC15904e3.f49273n | EnumC15904e3.f49279t, c15800k2, 3);
    }

    @Override // p817j$.util.stream.Stream
    /* JADX INFO: renamed from: k */
    public final InterfaceC15762D mo17429k(C15800K2 c15800k2) {
        Objects.requireNonNull(c15800k2);
        return new C15986t(this, EnumC15904e3.f49275p | EnumC15904e3.f49273n | EnumC15904e3.f49279t, c15800k2, 4);
    }

    @Override // p817j$.util.stream.Stream
    /* JADX INFO: renamed from: o */
    public final InterfaceC15955n0 mo17430o(C15800K2 c15800k2) {
        Objects.requireNonNull(c15800k2);
        return new C15919h0(this, EnumC15904e3.f49275p | EnumC15904e3.f49273n | EnumC15904e3.f49279t, c15800k2, 2);
    }

    @Override // p817j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C15981s(this, consumer);
    }

    @Override // p817j$.util.stream.Stream
    public final Stream limit(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(Long.toString(j10));
        }
        return AbstractC16012y0.m17553d0(this, 0L, j10);
    }

    @Override // p817j$.util.stream.Stream
    public final Stream skip(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? this : AbstractC16012y0.m17553d0(this, j10, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // p817j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i10 = AbstractC15965o4.f49371a;
        Objects.requireNonNull(predicate);
        return new C15826P3(this, AbstractC15965o4.f49371a, predicate);
    }

    @Override // p817j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i10 = AbstractC15965o4.f49371a;
        Objects.requireNonNull(predicate);
        return new C15835R3(this, AbstractC15965o4.f49372b, predicate);
    }

    @Override // p817j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC16012y0.m17536N(m17446D(intFunction), intFunction).mo17408o(intFunction);
    }

    @Override // p817j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new C15851V(21));
    }

    @Override // p817j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) m17445C(AbstractC16012y0.m17552c0(EnumC15997v0.ANY, predicate))).booleanValue();
    }

    @Override // p817j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) m17445C(AbstractC16012y0.m17552c0(EnumC15997v0.ALL, predicate))).booleanValue();
    }

    @Override // p817j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) m17445C(AbstractC16012y0.m17552c0(EnumC15997v0.NONE, predicate))).booleanValue();
    }

    @Override // p817j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Object objM17445C;
        if (!isParallel() || !collector.characteristics().contains(Collector.Characteristics.CONCURRENT) || (m17450K() && !collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            Supplier supplier = ((Collector) Objects.requireNonNull(collector)).supplier();
            objM17445C = m17445C(new C15804L1(EnumC15910f3.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector));
        } else {
            objM17445C = collector.supplier().get();
            forEach(new C15958n3(2, collector.accumulator(), objM17445C));
        }
        return collector.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? objM17445C : collector.finisher().apply(objM17445C);
    }
}
