package p817j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import p817j$.util.C16024v;
import p817j$.util.C16028z;
import p817j$.util.InterfaceC15655F;
import p817j$.util.InterfaceC15669U;
import p817j$.util.Objects;
import p817j$.util.Spliterator;
import p817j$.util.Spliterators;

/* JADX INFO: renamed from: j$.util.stream.A */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15747A extends AbstractC15882b implements InterfaceC15762D {
    @Override // p817j$.util.stream.InterfaceC15762D
    public final C16028z findAny() {
        return (C16028z) m17445C(C15777G.f49071d);
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final C16028z findFirst() {
        return (C16028z) m17445C(C15777G.f49070c);
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final InterfaceC15762D sorted() {
        return new C15780G2(this, EnumC15904e3.f49276q | EnumC15904e3.f49274o, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static InterfaceC15669U m17341Y(Spliterator spliterator) {
        if (spliterator instanceof InterfaceC15669U) {
            return (InterfaceC15669U) spliterator;
        }
        if (AbstractC15821O3.f49141a) {
            AbstractC15821O3.m17414a(AbstractC15882b.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        m17445C(new C15807M(doubleConsumer, false));
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        m17445C(new C15807M(doubleConsumer, true));
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: H */
    final EnumC15910f3 mo17344H() {
        return EnumC15910f3.DOUBLE_VALUE;
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: E */
    final InterfaceC15798K0 mo17342E(AbstractC15882b abstractC15882b, Spliterator spliterator, boolean z6, IntFunction intFunction) {
        return AbstractC16012y0.m17528F(abstractC15882b, spliterator, z6);
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: T */
    final Spliterator mo17346T(AbstractC15882b abstractC15882b, Supplier supplier, boolean z6) {
        return new C15975q3(abstractC15882b, supplier, z6);
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: G */
    final boolean mo17343G(Spliterator spliterator, InterfaceC15963o2 interfaceC15963o2) {
        DoubleConsumer c15966p;
        boolean zMo17358n;
        InterfaceC15669U interfaceC15669UM17341Y = m17341Y(spliterator);
        if (interfaceC15963o2 instanceof DoubleConsumer) {
            c15966p = (DoubleConsumer) interfaceC15963o2;
        } else {
            if (AbstractC15821O3.f49141a) {
                AbstractC15821O3.m17414a(AbstractC15882b.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC15963o2);
            c15966p = new C15966p(interfaceC15963o2);
        }
        do {
            zMo17358n = interfaceC15963o2.mo17358n();
            if (zMo17358n) {
                break;
            }
        } while (interfaceC15669UM17341Y.tryAdvance(c15966p));
        return zMo17358n;
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: M */
    final InterfaceC15758C0 mo17345M(long j10, IntFunction intFunction) {
        return AbstractC16012y0.m17532J(j10);
    }

    @Override // p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    public final InterfaceC15655F iterator() {
        return Spliterators.m17278f(spliterator());
    }

    @Override // p817j$.util.stream.AbstractC15882b, p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    public final InterfaceC15669U spliterator() {
        return m17341Y(super.spliterator());
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final Stream boxed() {
        return new C15981s(this, 0, new C15936k(20), 0);
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final InterfaceC15762D map(DoubleUnaryOperator doubleUnaryOperator) {
        Objects.requireNonNull(doubleUnaryOperator);
        return new C15986t(this, EnumC15904e3.f49275p | EnumC15904e3.f49273n, doubleUnaryOperator, 0);
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new C15981s(this, EnumC15904e3.f49275p | EnumC15904e3.f49273n, doubleFunction, 0);
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    /* JADX INFO: renamed from: t */
    public final IntStream mo17354t() {
        Objects.requireNonNull(null);
        return new C15991u(this, EnumC15904e3.f49275p | EnumC15904e3.f49273n, 0);
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    /* JADX INFO: renamed from: i */
    public final InterfaceC15955n0 mo17352i() {
        Objects.requireNonNull(null);
        return new C15996v(this, EnumC15904e3.f49275p | EnumC15904e3.f49273n, 0);
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    /* JADX INFO: renamed from: c */
    public final InterfaceC15762D mo17349c(C15800K2 c15800k2) {
        Objects.requireNonNull(c15800k2);
        return new C15986t(this, EnumC15904e3.f49275p | EnumC15904e3.f49273n | EnumC15904e3.f49279t, c15800k2, 1);
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    /* JADX INFO: renamed from: b */
    public final InterfaceC15762D mo17348b() {
        Objects.requireNonNull(null);
        return new C16006x(this, EnumC15904e3.f49279t, 1);
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final InterfaceC15762D peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new C15986t(this, doubleConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final InterfaceC15762D limit(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(Long.toString(j10));
        }
        return AbstractC16012y0.m17545W(this, 0L, j10);
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final InterfaceC15762D skip(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? this : AbstractC16012y0.m17545W(this, j10, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    /* JADX INFO: renamed from: a */
    public final InterfaceC15762D mo17347a() {
        int i10 = AbstractC15965o4.f49371a;
        Objects.requireNonNull(null);
        return new C15893c4(this, AbstractC15965o4.f49371a, 0);
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    /* JADX INFO: renamed from: d */
    public final InterfaceC15762D mo17350d() {
        int i10 = AbstractC15965o4.f49371a;
        Objects.requireNonNull(null);
        return new C15905e4(this, AbstractC15965o4.f49372b, 0);
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final InterfaceC15762D distinct() {
        return ((AbstractC15915g2) boxed()).distinct().mapToDouble(new C15936k(21));
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final double sum() {
        double[] dArr = (double[]) collect(new C15772F(10), new C15936k(5), new C15936k(2));
        Set set = Collectors.f49046a;
        double d10 = dArr[0] + dArr[1];
        double d11 = dArr[dArr.length - 1];
        return (Double.isNaN(d10) && Double.isInfinite(d11)) ? d11 : d10;
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final C16028z min() {
        return reduce(new C15936k(17));
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final C16028z max() {
        return reduce(new C15936k(23));
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final C16028z average() {
        double[] dArr = (double[]) collect(new C15772F(9), new C15936k(3), new C15936k(4));
        if (dArr[2] <= 0.0d) {
            return C16028z.m17584a();
        }
        Set set = Collectors.f49046a;
        double d10 = dArr[0] + dArr[1];
        double d11 = dArr[dArr.length - 1];
        if (Double.isNaN(d10) && Double.isInfinite(d11)) {
            d10 = d11;
        }
        return C16028z.m17585d(d10 / dArr[2]);
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final C16024v summaryStatistics() {
        return (C16024v) collect(new C15772F(4), new C15936k(18), new C15936k(19));
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C15971q c15971q = new C15971q(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(c15971q);
        return m17445C(new C15769E1(EnumC15910f3.DOUBLE_VALUE, c15971q, objDoubleConsumer, supplier, 1));
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    /* JADX INFO: renamed from: p */
    public final boolean mo17353p() {
        return ((Boolean) m17445C(AbstractC16012y0.m17546X(EnumC15997v0.ANY))).booleanValue();
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    /* JADX INFO: renamed from: h */
    public final boolean mo17351h() {
        return ((Boolean) m17445C(AbstractC16012y0.m17546X(EnumC15997v0.ALL))).booleanValue();
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    /* JADX INFO: renamed from: x */
    public final boolean mo17355x() {
        return ((Boolean) m17445C(AbstractC16012y0.m17546X(EnumC15997v0.NONE))).booleanValue();
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final double[] toArray() {
        return (double[]) AbstractC16012y0.m17537O((InterfaceC15768E0) m17446D(new C15936k(22))).mo17398d();
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) m17445C(new C15789I1(EnumC15910f3.DOUBLE_VALUE, doubleBinaryOperator, d10))).doubleValue();
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final C16028z reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (C16028z) m17445C(new C15759C1(EnumC15910f3.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // p817j$.util.stream.InterfaceC15762D
    public final long count() {
        return ((Long) m17445C(new C15779G1(1))).longValue();
    }
}
