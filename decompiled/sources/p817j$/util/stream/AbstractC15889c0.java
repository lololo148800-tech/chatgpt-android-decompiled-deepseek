package p817j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import p817j$.util.C15650A;
import p817j$.util.C16025w;
import p817j$.util.C16028z;
import p817j$.util.InterfaceC15659J;
import p817j$.util.InterfaceC15672X;
import p817j$.util.Objects;
import p817j$.util.Spliterator;
import p817j$.util.Spliterators;

/* JADX INFO: renamed from: j$.util.stream.c0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15889c0 extends AbstractC15882b implements IntStream {
    @Override // p817j$.util.stream.IntStream
    public final C15650A findAny() {
        return (C15650A) m17445C(C15782H.f49075d);
    }

    @Override // p817j$.util.stream.IntStream
    public final C15650A findFirst() {
        return (C15650A) m17445C(C15782H.f49074c);
    }

    @Override // p817j$.util.stream.IntStream
    public final IntStream sorted() {
        return new C15785H2(this, EnumC15904e3.f49276q | EnumC15904e3.f49274o, 0);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        m17445C(new C15812N(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        m17445C(new C15812N(intConsumer, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static InterfaceC15672X m17463Y(Spliterator spliterator) {
        if (spliterator instanceof InterfaceC15672X) {
            return (InterfaceC15672X) spliterator;
        }
        if (AbstractC15821O3.f49141a) {
            AbstractC15821O3.m17414a(AbstractC15882b.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: H */
    final EnumC15910f3 mo17344H() {
        return EnumC15910f3.INT_VALUE;
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: E */
    final InterfaceC15798K0 mo17342E(AbstractC15882b abstractC15882b, Spliterator spliterator, boolean z6, IntFunction intFunction) {
        return AbstractC16012y0.m17529G(abstractC15882b, spliterator, z6);
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: T */
    final Spliterator mo17346T(AbstractC15882b abstractC15882b, Supplier supplier, boolean z6) {
        return new C15985s3(abstractC15882b, supplier, z6);
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: G */
    final boolean mo17343G(Spliterator spliterator, InterfaceC15963o2 interfaceC15963o2) {
        IntConsumer c15846u;
        boolean zMo17358n;
        InterfaceC15672X interfaceC15672XM17463Y = m17463Y(spliterator);
        if (interfaceC15963o2 instanceof IntConsumer) {
            c15846u = (IntConsumer) interfaceC15963o2;
        } else {
            if (AbstractC15821O3.f49141a) {
                AbstractC15821O3.m17414a(AbstractC15882b.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC15963o2);
            c15846u = new C15846U(interfaceC15963o2);
        }
        do {
            zMo17358n = interfaceC15963o2.mo17358n();
            if (zMo17358n) {
                break;
            }
        } while (interfaceC15672XM17463Y.tryAdvance(c15846u));
        return zMo17358n;
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: M */
    final InterfaceC15758C0 mo17345M(long j10, IntFunction intFunction) {
        return AbstractC16012y0.m17541S(j10);
    }

    @Override // p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    public final InterfaceC15659J iterator() {
        return Spliterators.m17279g(spliterator());
    }

    @Override // p817j$.util.stream.AbstractC15882b, p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    public final InterfaceC15672X spliterator() {
        return m17463Y(super.spliterator());
    }

    @Override // p817j$.util.stream.IntStream
    public final InterfaceC15955n0 asLongStream() {
        return new C15996v(this, 0, 1);
    }

    @Override // p817j$.util.stream.IntStream
    public final InterfaceC15762D asDoubleStream() {
        return new C16006x(this, 0, 2);
    }

    @Override // p817j$.util.stream.IntStream
    public final Stream boxed() {
        return new C15981s(this, 0, new C15851V(1), 1);
    }

    @Override // p817j$.util.stream.IntStream
    /* JADX INFO: renamed from: e */
    public final IntStream mo17389e() {
        Objects.requireNonNull(null);
        return new C15991u(this, EnumC15904e3.f49275p | EnumC15904e3.f49273n, 1);
    }

    @Override // p817j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new C15981s(this, EnumC15904e3.f49275p | EnumC15904e3.f49273n, intFunction, 1);
    }

    @Override // p817j$.util.stream.IntStream
    /* JADX INFO: renamed from: m */
    public final InterfaceC15955n0 mo17392m() {
        Objects.requireNonNull(null);
        return new C15996v(this, EnumC15904e3.f49275p | EnumC15904e3.f49273n, 2);
    }

    @Override // p817j$.util.stream.IntStream
    /* JADX INFO: renamed from: f */
    public final InterfaceC15762D mo17390f() {
        Objects.requireNonNull(null);
        return new C16006x(this, EnumC15904e3.f49275p | EnumC15904e3.f49273n, 3);
    }

    @Override // p817j$.util.stream.IntStream
    public final int reduce(int i10, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) m17445C(new C15824P1(EnumC15910f3.INT_VALUE, intBinaryOperator, i10))).intValue();
    }

    @Override // p817j$.util.stream.IntStream
    /* JADX INFO: renamed from: q */
    public final IntStream mo17393q(C15828Q0 c15828q0) {
        Objects.requireNonNull(c15828q0);
        return new C15861X(this, EnumC15904e3.f49275p | EnumC15904e3.f49273n | EnumC15904e3.f49279t, c15828q0, 1);
    }

    @Override // p817j$.util.stream.IntStream
    public final C15650A reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (C15650A) m17445C(new C15759C1(EnumC15910f3.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // p817j$.util.stream.IntStream
    /* JADX INFO: renamed from: b */
    public final IntStream mo17387b() {
        Objects.requireNonNull(null);
        return new C15991u(this, EnumC15904e3.f49279t, 3);
    }

    @Override // p817j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new C15861X(this, intConsumer);
    }

    @Override // p817j$.util.stream.IntStream
    public final IntStream limit(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(Long.toString(j10));
        }
        return AbstractC16012y0.m17547Y(this, 0L, j10);
    }

    @Override // p817j$.util.stream.IntStream
    public final IntStream skip(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? this : AbstractC16012y0.m17547Y(this, j10, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // p817j$.util.stream.IntStream
    /* JADX INFO: renamed from: a */
    public final IntStream mo17386a() {
        int i10 = AbstractC15965o4.f49371a;
        Objects.requireNonNull(null);
        return new C15845T3(this, AbstractC15965o4.f49371a, 0);
    }

    @Override // p817j$.util.stream.IntStream
    /* JADX INFO: renamed from: d */
    public final IntStream mo17388d() {
        int i10 = AbstractC15965o4.f49371a;
        Objects.requireNonNull(null);
        return new C15855V3(this, AbstractC15965o4.f49372b, 0);
    }

    @Override // p817j$.util.stream.IntStream
    public final long count() {
        return ((Long) m17445C(new C15779G1(3))).longValue();
    }

    @Override // p817j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((AbstractC15915g2) boxed()).distinct().mapToInt(new C15851V(0));
    }

    @Override // p817j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new C15851V(5));
    }

    @Override // p817j$.util.stream.IntStream
    public final C15650A min() {
        return reduce(new C15851V(2));
    }

    @Override // p817j$.util.stream.IntStream
    public final C15650A max() {
        return reduce(new C15851V(6));
    }

    @Override // p817j$.util.stream.IntStream
    public final C16028z average() {
        long[] jArr = (long[]) collect(new C15772F(11), new C15851V(7), new C15851V(8));
        long j10 = jArr[0];
        return j10 > 0 ? C16028z.m17585d(jArr[1] / j10) : C16028z.m17584a();
    }

    @Override // p817j$.util.stream.IntStream
    public final C16025w summaryStatistics() {
        return (C16025w) collect(new C15772F(6), new C15851V(3), new C15851V(4));
    }

    @Override // p817j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C15971q c15971q = new C15971q(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(c15971q);
        return m17445C(new C15769E1(EnumC15910f3.INT_VALUE, c15971q, objIntConsumer, supplier, 4));
    }

    @Override // p817j$.util.stream.IntStream
    /* JADX INFO: renamed from: s */
    public final boolean mo17394s() {
        return ((Boolean) m17445C(AbstractC16012y0.m17548Z(EnumC15997v0.ANY))).booleanValue();
    }

    @Override // p817j$.util.stream.IntStream
    /* JADX INFO: renamed from: u */
    public final boolean mo17395u() {
        return ((Boolean) m17445C(AbstractC16012y0.m17548Z(EnumC15997v0.ALL))).booleanValue();
    }

    @Override // p817j$.util.stream.IntStream
    /* JADX INFO: renamed from: g */
    public final boolean mo17391g() {
        return ((Boolean) m17445C(AbstractC16012y0.m17548Z(EnumC15997v0.NONE))).booleanValue();
    }

    @Override // p817j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC16012y0.m17538P((InterfaceC15778G0) m17446D(new C15936k(29))).mo17398d();
    }
}
