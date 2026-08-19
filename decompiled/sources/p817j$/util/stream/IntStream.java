package p817j$.util.stream;

import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p817j$.util.AbstractC15666Q;
import p817j$.util.C15650A;
import p817j$.util.C15657H;
import p817j$.util.C15658I;
import p817j$.util.C15670V;
import p817j$.util.C15671W;
import p817j$.util.C15711e0;
import p817j$.util.C16025w;
import p817j$.util.C16028z;
import p817j$.util.InterfaceC15659J;
import p817j$.util.InterfaceC15672X;

/* JADX INFO: loaded from: classes4.dex */
public interface IntStream extends InterfaceC15918h {
    /* JADX INFO: renamed from: a */
    IntStream mo17386a();

    InterfaceC15762D asDoubleStream();

    InterfaceC15955n0 asLongStream();

    C16028z average();

    /* JADX INFO: renamed from: b */
    IntStream mo17387b();

    Stream boxed();

    Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer);

    long count();

    /* JADX INFO: renamed from: d */
    IntStream mo17388d();

    IntStream distinct();

    /* JADX INFO: renamed from: e */
    IntStream mo17389e();

    /* JADX INFO: renamed from: f */
    InterfaceC15762D mo17390f();

    C15650A findAny();

    C15650A findFirst();

    void forEach(IntConsumer intConsumer);

    void forEachOrdered(IntConsumer intConsumer);

    /* JADX INFO: renamed from: g */
    boolean mo17391g();

    @Override // p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    InterfaceC15659J iterator();

    IntStream limit(long j10);

    /* JADX INFO: renamed from: m */
    InterfaceC15955n0 mo17392m();

    Stream mapToObj(IntFunction intFunction);

    C15650A max();

    C15650A min();

    @Override // p817j$.util.stream.InterfaceC15918h
    IntStream parallel();

    IntStream peek(IntConsumer intConsumer);

    /* JADX INFO: renamed from: q */
    IntStream mo17393q(C15828Q0 c15828q0);

    int reduce(int i10, IntBinaryOperator intBinaryOperator);

    C15650A reduce(IntBinaryOperator intBinaryOperator);

    /* JADX INFO: renamed from: s */
    boolean mo17394s();

    @Override // p817j$.util.stream.InterfaceC15918h
    IntStream sequential();

    IntStream skip(long j10);

    IntStream sorted();

    @Override // p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    InterfaceC15672X spliterator();

    int sum();

    C16025w summaryStatistics();

    int[] toArray();

    /* JADX INFO: renamed from: u */
    boolean mo17395u();

    public final /* synthetic */ class Wrapper implements java.util.stream.IntStream {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.stream.IntStream convert(IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof VivifiedWrapper ? ((VivifiedWrapper) intStream).f49091a : intStream.new Wrapper();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
            return IntStream.this.mo17395u();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
            return IntStream.this.mo17394s();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream asDoubleStream() {
            return C15757C.m17368j(IntStream.this.asDoubleStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream asLongStream() {
            return C15949m0.m17500j(IntStream.this.asLongStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalDouble average() {
            return AbstractC15666Q.m17266n(IntStream.this.average());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ Stream boxed() {
            return Stream.Wrapper.convert(IntStream.this.boxed());
        }

        @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() throws Exception {
            IntStream.this.close();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
            return IntStream.this.collect(supplier, objIntConsumer, biConsumer);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ long count() {
            return IntStream.this.count();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream distinct() {
            return convert(IntStream.this.distinct());
        }

        public final /* synthetic */ java.util.stream.IntStream dropWhile(IntPredicate intPredicate) {
            return convert(IntStream.this.mo17388d());
        }

        public final /* synthetic */ boolean equals(Object obj) {
            IntStream intStream = IntStream.this;
            if (obj instanceof Wrapper) {
                obj = IntStream.this;
            }
            return intStream.equals(obj);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream filter(IntPredicate intPredicate) {
            return convert(IntStream.this.mo17387b());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findAny() {
            return AbstractC15666Q.m17267o(IntStream.this.findAny());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findFirst() {
            return AbstractC15666Q.m17267o(IntStream.this.findFirst());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            IntStream.this.forEach(intConsumer);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            IntStream.this.forEachOrdered(intConsumer);
        }

        public final /* synthetic */ int hashCode() {
            return IntStream.this.hashCode();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return IntStream.this.isParallel();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ Iterator<Integer> iterator() {
            return IntStream.this.iterator();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
        public final /* synthetic */ Iterator<Integer> iterator2() {
            return C15658I.m17245a(IntStream.this.iterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream limit(long j10) {
            return convert(IntStream.this.limit(j10));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream map(IntUnaryOperator intUnaryOperator) {
            return convert(IntStream.this.mo17389e());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
            return C15757C.m17368j(IntStream.this.mo17390f());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream mapToLong(IntToLongFunction intToLongFunction) {
            return C15949m0.m17500j(IntStream.this.mo17392m());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ Stream mapToObj(IntFunction intFunction) {
            return Stream.Wrapper.convert(IntStream.this.mapToObj(intFunction));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt max() {
            return AbstractC15666Q.m17267o(IntStream.this.max());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt min() {
            return AbstractC15666Q.m17267o(IntStream.this.min());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
            return IntStream.this.mo17391g();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream onClose(Runnable runnable) {
            return C15912g.m17478j(IntStream.this.onClose(runnable));
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ BaseStream parallel() {
            return C15912g.m17478j(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream parallel() {
            return convert(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream peek(IntConsumer intConsumer) {
            return convert(IntStream.this.peek(intConsumer));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int reduce(int i10, IntBinaryOperator intBinaryOperator) {
            return IntStream.this.reduce(i10, intBinaryOperator);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
            return AbstractC15666Q.m17267o(IntStream.this.reduce(intBinaryOperator));
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ BaseStream sequential() {
            return C15912g.m17478j(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream sequential() {
            return convert(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream skip(long j10) {
            return convert(IntStream.this.skip(j10));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream sorted() {
            return convert(IntStream.this.sorted());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ Spliterator<Integer> spliterator() {
            return C15671W.m17289a(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* JADX INFO: renamed from: spliterator, reason: avoid collision after fix types in other method */
        public final /* synthetic */ Spliterator<Integer> spliterator2() {
            return j$.util.Spliterator.Wrapper.convert(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return IntStream.this.sum();
        }

        public final /* synthetic */ java.util.stream.IntStream takeWhile(IntPredicate intPredicate) {
            return convert(IntStream.this.mo17386a());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return IntStream.this.toArray();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream unordered() {
            return C15912g.m17478j(IntStream.this.unordered());
        }

        @Override // java.util.stream.IntStream
        public final IntSummaryStatistics summaryStatistics() {
            IntStream.this.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
        }

        @Override // java.util.stream.IntStream
        public final java.util.stream.IntStream flatMap(IntFunction intFunction) {
            IntStream intStream = IntStream.this;
            C15828Q0 c15828q0 = new C15828Q0();
            c15828q0.f49150a = intFunction;
            return convert(intStream.mo17393q(c15828q0));
        }
    }

    public final /* synthetic */ class VivifiedWrapper implements IntStream {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ java.util.stream.IntStream f49091a;

        private /* synthetic */ VivifiedWrapper(java.util.stream.IntStream intStream) {
            this.f49091a = intStream;
        }

        public static /* synthetic */ IntStream convert(java.util.stream.IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof Wrapper ? IntStream.this : new VivifiedWrapper(intStream);
        }

        @Override // p817j$.util.stream.IntStream
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IntStream mo17386a() {
            return convert(this.f49091a.takeWhile(null));
        }

        @Override // p817j$.util.stream.IntStream
        public final /* synthetic */ InterfaceC15762D asDoubleStream() {
            return C15752B.m17360j(this.f49091a.asDoubleStream());
        }

        @Override // p817j$.util.stream.IntStream
        public final /* synthetic */ InterfaceC15955n0 asLongStream() {
            return C15943l0.m17499j(this.f49091a.asLongStream());
        }

        @Override // p817j$.util.stream.IntStream
        public final /* synthetic */ C16028z average() {
            return AbstractC15666Q.m17262j(this.f49091a.average());
        }

        @Override // p817j$.util.stream.IntStream
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ IntStream mo17387b() {
            return convert(this.f49091a.filter(null));
        }

        @Override // p817j$.util.stream.IntStream
        public final /* synthetic */ Stream boxed() {
            return C15880a3.m17441j(this.f49091a.boxed());
        }

        @Override // java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            this.f49091a.close();
        }

        @Override // p817j$.util.stream.IntStream
        public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
            return this.f49091a.collect(supplier, objIntConsumer, biConsumer);
        }

        @Override // p817j$.util.stream.IntStream
        public final /* synthetic */ long count() {
            return this.f49091a.count();
        }

        @Override // p817j$.util.stream.IntStream
        /* JADX INFO: renamed from: d */
        public final /* synthetic */ IntStream mo17388d() {
            return convert(this.f49091a.dropWhile(null));
        }

        @Override // p817j$.util.stream.IntStream
        public final /* synthetic */ IntStream distinct() {
            return convert(this.f49091a.distinct());
        }

        @Override // p817j$.util.stream.IntStream
        /* JADX INFO: renamed from: e */
        public final /* synthetic */ IntStream mo17389e() {
            return convert(this.f49091a.map(null));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.stream.IntStream intStream = this.f49091a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f49091a;
            }
            return intStream.equals(obj);
        }

        @Override // p817j$.util.stream.IntStream
        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InterfaceC15762D mo17390f() {
            return C15752B.m17360j(this.f49091a.mapToDouble(null));
        }

        @Override // p817j$.util.stream.IntStream
        public final /* synthetic */ C15650A findAny() {
            return AbstractC15666Q.m17263k(this.f49091a.findAny());
        }

        @Override // p817j$.util.stream.IntStream
        public final /* synthetic */ C15650A findFirst() {
            return AbstractC15666Q.m17263k(this.f49091a.findFirst());
        }

        @Override // p817j$.util.stream.IntStream
        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            this.f49091a.forEach(intConsumer);
        }

        @Override // p817j$.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            this.f49091a.forEachOrdered(intConsumer);
        }

        @Override // p817j$.util.stream.IntStream
        /* JADX INFO: renamed from: g */
        public final /* synthetic */ boolean mo17391g() {
            return this.f49091a.noneMatch(null);
        }

        public final /* synthetic */ int hashCode() {
            return this.f49091a.hashCode();
        }

        @Override // p817j$.util.stream.InterfaceC15918h
        public final /* synthetic */ boolean isParallel() {
            return this.f49091a.isParallel();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfInt] */
        @Override // p817j$.util.stream.IntStream, p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
        public final /* synthetic */ InterfaceC15659J iterator() {
            return C15657H.m17244a(this.f49091a.iterator());
        }

        @Override // p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
        public final /* synthetic */ Iterator iterator() {
            return this.f49091a.iterator();
        }

        @Override // p817j$.util.stream.IntStream
        public final /* synthetic */ IntStream limit(long j10) {
            return convert(this.f49091a.limit(j10));
        }

        @Override // p817j$.util.stream.IntStream
        /* JADX INFO: renamed from: m */
        public final /* synthetic */ InterfaceC15955n0 mo17392m() {
            return C15943l0.m17499j(this.f49091a.mapToLong(null));
        }

        @Override // p817j$.util.stream.IntStream
        public final /* synthetic */ Stream mapToObj(IntFunction intFunction) {
            return C15880a3.m17441j(this.f49091a.mapToObj(intFunction));
        }

        @Override // p817j$.util.stream.IntStream
        public final /* synthetic */ C15650A max() {
            return AbstractC15666Q.m17263k(this.f49091a.max());
        }

        @Override // p817j$.util.stream.IntStream
        public final /* synthetic */ C15650A min() {
            return AbstractC15666Q.m17263k(this.f49091a.min());
        }

        @Override // p817j$.util.stream.InterfaceC15918h
        public final /* synthetic */ InterfaceC15918h onClose(Runnable runnable) {
            return C15906f.m17477j(this.f49091a.onClose(runnable));
        }

        @Override // p817j$.util.stream.IntStream, p817j$.util.stream.InterfaceC15918h
        public final /* synthetic */ IntStream parallel() {
            return convert(this.f49091a.parallel());
        }

        @Override // p817j$.util.stream.InterfaceC15918h
        public final /* synthetic */ InterfaceC15918h parallel() {
            return C15906f.m17477j(this.f49091a.parallel());
        }

        @Override // p817j$.util.stream.IntStream
        public final /* synthetic */ IntStream peek(IntConsumer intConsumer) {
            return convert(this.f49091a.peek(intConsumer));
        }

        @Override // p817j$.util.stream.IntStream
        public final /* synthetic */ int reduce(int i10, IntBinaryOperator intBinaryOperator) {
            return this.f49091a.reduce(i10, intBinaryOperator);
        }

        @Override // p817j$.util.stream.IntStream
        public final /* synthetic */ C15650A reduce(IntBinaryOperator intBinaryOperator) {
            return AbstractC15666Q.m17263k(this.f49091a.reduce(intBinaryOperator));
        }

        @Override // p817j$.util.stream.IntStream
        /* JADX INFO: renamed from: s */
        public final /* synthetic */ boolean mo17394s() {
            return this.f49091a.anyMatch(null);
        }

        @Override // p817j$.util.stream.IntStream, p817j$.util.stream.InterfaceC15918h
        public final /* synthetic */ IntStream sequential() {
            return convert(this.f49091a.sequential());
        }

        @Override // p817j$.util.stream.InterfaceC15918h
        public final /* synthetic */ InterfaceC15918h sequential() {
            return C15906f.m17477j(this.f49091a.sequential());
        }

        @Override // p817j$.util.stream.IntStream
        public final /* synthetic */ IntStream skip(long j10) {
            return convert(this.f49091a.skip(j10));
        }

        @Override // p817j$.util.stream.IntStream
        public final /* synthetic */ IntStream sorted() {
            return convert(this.f49091a.sorted());
        }

        @Override // p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
        public final /* synthetic */ p817j$.util.Spliterator spliterator() {
            return C15711e0.m17337a(this.f49091a.spliterator());
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfInt] */
        @Override // p817j$.util.stream.IntStream, p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
        public final /* synthetic */ InterfaceC15672X spliterator() {
            return C15670V.m17288a(this.f49091a.spliterator());
        }

        @Override // p817j$.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return this.f49091a.sum();
        }

        @Override // p817j$.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return this.f49091a.toArray();
        }

        @Override // p817j$.util.stream.IntStream
        /* JADX INFO: renamed from: u */
        public final /* synthetic */ boolean mo17395u() {
            return this.f49091a.allMatch(null);
        }

        @Override // p817j$.util.stream.InterfaceC15918h
        public final /* synthetic */ InterfaceC15918h unordered() {
            return C15906f.m17477j(this.f49091a.unordered());
        }

        @Override // p817j$.util.stream.IntStream
        public final C16025w summaryStatistics() {
            this.f49091a.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
        }

        @Override // p817j$.util.stream.IntStream
        /* JADX INFO: renamed from: q */
        public final IntStream mo17393q(C15828Q0 c15828q0) {
            java.util.stream.IntStream intStream = this.f49091a;
            C15828Q0 c15828q1 = new C15828Q0();
            c15828q1.f49150a = c15828q0;
            return convert(intStream.flatMap(c15828q1));
        }
    }
}
