package p817j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import p817j$.util.C15651B;
import p817j$.util.C16027y;
import p817j$.util.C16028z;
import p817j$.util.InterfaceC15663N;
import p817j$.util.InterfaceC15676a0;
import p817j$.util.Objects;
import p817j$.util.Spliterator;
import p817j$.util.Spliterators;

/* JADX INFO: renamed from: j$.util.stream.k0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15937k0 extends AbstractC15882b implements InterfaceC15955n0 {
    @Override // p817j$.util.stream.InterfaceC15955n0
    public final C15651B findAny() {
        return (C15651B) m17445C(C15787I.f49086d);
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final C15651B findFirst() {
        return (C15651B) m17445C(C15787I.f49085c);
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final InterfaceC15955n0 sorted() {
        return new C15790I2(this, EnumC15904e3.f49276q | EnumC15904e3.f49274o, 0);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        m17445C(new C15817O(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        m17445C(new C15817O(longConsumer, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static InterfaceC15676a0 m17488Y(Spliterator spliterator) {
        if (spliterator instanceof InterfaceC15676a0) {
            return (InterfaceC15676a0) spliterator;
        }
        if (AbstractC15821O3.f49141a) {
            AbstractC15821O3.m17414a(AbstractC15882b.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: H */
    final EnumC15910f3 mo17344H() {
        return EnumC15910f3.LONG_VALUE;
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: E */
    final InterfaceC15798K0 mo17342E(AbstractC15882b abstractC15882b, Spliterator spliterator, boolean z6, IntFunction intFunction) {
        return AbstractC16012y0.m17530H(abstractC15882b, spliterator, z6);
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: T */
    final Spliterator mo17346T(AbstractC15882b abstractC15882b, Supplier supplier, boolean z6) {
        return new C15995u3(abstractC15882b, supplier, z6);
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: G */
    final boolean mo17343G(Spliterator spliterator, InterfaceC15963o2 interfaceC15963o2) {
        LongConsumer c15895d0;
        boolean zMo17358n;
        InterfaceC15676a0 interfaceC15676a0M17488Y = m17488Y(spliterator);
        if (interfaceC15963o2 instanceof LongConsumer) {
            c15895d0 = (LongConsumer) interfaceC15963o2;
        } else {
            if (AbstractC15821O3.f49141a) {
                AbstractC15821O3.m17414a(AbstractC15882b.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC15963o2);
            c15895d0 = new C15895d0(interfaceC15963o2);
        }
        do {
            zMo17358n = interfaceC15963o2.mo17358n();
            if (zMo17358n) {
                break;
            }
        } while (interfaceC15676a0M17488Y.tryAdvance(c15895d0));
        return zMo17358n;
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: M */
    final InterfaceC15758C0 mo17345M(long j10, IntFunction intFunction) {
        return AbstractC16012y0.m17543U(j10);
    }

    @Override // p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    public final InterfaceC15663N iterator() {
        return Spliterators.m17280h(spliterator());
    }

    @Override // p817j$.util.stream.AbstractC15882b, p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    public final InterfaceC15676a0 spliterator() {
        return m17488Y(super.spliterator());
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final InterfaceC15762D asDoubleStream() {
        return new C16006x(this, EnumC15904e3.f49273n, 4);
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final Stream boxed() {
        return new C15981s(this, 0, new C15851V(14), 2);
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    /* JADX INFO: renamed from: e */
    public final InterfaceC15955n0 mo17493e() {
        Objects.requireNonNull(null);
        return new C15996v(this, EnumC15904e3.f49275p | EnumC15904e3.f49273n, 3);
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new C15981s(this, EnumC15904e3.f49275p | EnumC15904e3.f49273n, longFunction, 2);
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    /* JADX INFO: renamed from: w */
    public final IntStream mo17498w() {
        Objects.requireNonNull(null);
        return new C15991u(this, EnumC15904e3.f49275p | EnumC15904e3.f49273n, 4);
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    /* JADX INFO: renamed from: l */
    public final InterfaceC15762D mo17494l() {
        Objects.requireNonNull(null);
        return new C16006x(this, EnumC15904e3.f49275p | EnumC15904e3.f49273n, 5);
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    /* JADX INFO: renamed from: c */
    public final InterfaceC15955n0 mo17491c(C15800K2 c15800k2) {
        Objects.requireNonNull(c15800k2);
        return new C15919h0(this, EnumC15904e3.f49275p | EnumC15904e3.f49273n | EnumC15904e3.f49279t, c15800k2, 0);
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    /* JADX INFO: renamed from: b */
    public final InterfaceC15955n0 mo17490b() {
        Objects.requireNonNull(null);
        return new C15996v(this, EnumC15904e3.f49279t, 5);
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final InterfaceC15955n0 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new C15919h0(this, longConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final InterfaceC15955n0 limit(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(Long.toString(j10));
        }
        return AbstractC16012y0.m17550a0(this, 0L, j10);
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final InterfaceC15955n0 skip(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? this : AbstractC16012y0.m17550a0(this, j10, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    /* JADX INFO: renamed from: a */
    public final InterfaceC15955n0 mo17489a() {
        int i10 = AbstractC15965o4.f49371a;
        Objects.requireNonNull(null);
        return new C15865X3(this, AbstractC15965o4.f49371a, 0);
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    /* JADX INFO: renamed from: d */
    public final InterfaceC15955n0 mo17492d() {
        int i10 = AbstractC15965o4.f49371a;
        Objects.requireNonNull(null);
        return new C15881a4(this, AbstractC15965o4.f49372b, 0);
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final InterfaceC15955n0 distinct() {
        return ((AbstractC15915g2) boxed()).distinct().mapToLong(new C15851V(11));
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final long sum() {
        return reduce(0L, new C15851V(18));
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final C15651B min() {
        return reduce(new C15851V(10));
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final C15651B max() {
        return reduce(new C15851V(17));
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final C16028z average() {
        long[] jArr = (long[]) collect(new C15772F(12), new C15851V(15), new C15851V(16));
        long j10 = jArr[0];
        return j10 > 0 ? C16028z.m17585d(jArr[1] / j10) : C16028z.m17584a();
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final long reduce(long j10, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) m17445C(new C15749A1(EnumC15910f3.LONG_VALUE, longBinaryOperator, j10))).longValue();
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final C16027y summaryStatistics() {
        return (C16027y) collect(new C15772F(7), new C15851V(9), new C15851V(12));
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C15971q c15971q = new C15971q(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(c15971q);
        return m17445C(new C15769E1(EnumC15910f3.LONG_VALUE, c15971q, objLongConsumer, supplier, 0));
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    /* JADX INFO: renamed from: v */
    public final boolean mo17497v() {
        return ((Boolean) m17445C(AbstractC16012y0.m17551b0(EnumC15997v0.ANY))).booleanValue();
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    /* JADX INFO: renamed from: r */
    public final boolean mo17496r() {
        return ((Boolean) m17445C(AbstractC16012y0.m17551b0(EnumC15997v0.ALL))).booleanValue();
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final C15651B reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (C15651B) m17445C(new C15759C1(EnumC15910f3.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    /* JADX INFO: renamed from: n */
    public final boolean mo17495n() {
        return ((Boolean) m17445C(AbstractC16012y0.m17551b0(EnumC15997v0.NONE))).booleanValue();
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final long[] toArray() {
        return (long[]) AbstractC16012y0.m17539Q((InterfaceC15788I0) m17446D(new C15851V(13))).mo17398d();
    }

    @Override // p817j$.util.stream.InterfaceC15955n0
    public final long count() {
        return ((Long) m17445C(new C15779G1(0))).longValue();
    }
}
