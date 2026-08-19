package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import p817j$.util.InterfaceC15669U;
import p817j$.util.InterfaceC15672X;
import p817j$.util.InterfaceC15676a0;
import p817j$.util.Objects;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.y0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC16012y0 implements InterfaceC15806L3 {

    /* JADX INFO: renamed from: a */
    private static final C15896d1 f49440a = new C15896d1();

    /* JADX INFO: renamed from: b */
    private static final InterfaceC15778G0 f49441b = new C15884b1();

    /* JADX INFO: renamed from: c */
    private static final InterfaceC15788I0 f49442c = new C15890c1();

    /* JADX INFO: renamed from: d */
    private static final InterfaceC15768E0 f49443d = new C15878a1();

    /* JADX INFO: renamed from: e */
    private static final int[] f49444e = new int[0];

    /* JADX INFO: renamed from: f */
    private static final long[] f49445f = new long[0];

    /* JADX INFO: renamed from: g */
    private static final double[] f49446g = new double[0];

    /* JADX INFO: renamed from: B */
    static long m17524B(long j10, long j11) {
        long j12 = j11 >= 0 ? j10 + j11 : Long.MAX_VALUE;
        if (j12 >= 0) {
            return j12;
        }
        return Long.MAX_VALUE;
    }

    @Override // p817j$.util.stream.InterfaceC15806L3
    /* JADX INFO: renamed from: d */
    public /* synthetic */ int mo17375d() {
        return 0;
    }

    /* JADX INFO: renamed from: e0 */
    public abstract InterfaceC15848U1 mo17357e0();

    /* JADX INFO: renamed from: R */
    public static C15800K2 m17540R(Function function) {
        C15800K2 c15800k2 = new C15800K2(6);
        c15800k2.f49106b = function;
        return c15800k2;
    }

    /* JADX INFO: renamed from: A */
    static long m17523A(long j10, long j11, long j12) {
        if (j10 >= 0) {
            return Math.max(-1L, Math.min(j10 - j11, j12));
        }
        return -1L;
    }

    /* JADX INFO: renamed from: f0 */
    public static Stream m17556f0(Spliterator spliterator, boolean z6) {
        Objects.requireNonNull(spliterator);
        return new C15903e2(spliterator, EnumC15904e3.m17473q(spliterator), z6);
    }

    /* JADX INFO: renamed from: C */
    static Spliterator m17525C(EnumC15910f3 enumC15910f3, Spliterator spliterator, long j10, long j11) {
        long j12 = j11 >= 0 ? j10 + j11 : Long.MAX_VALUE;
        long j13 = j12 >= 0 ? j12 : Long.MAX_VALUE;
        int i10 = AbstractC16009x2.f49439a[enumC15910f3.ordinal()];
        if (i10 == 1) {
            return new C16020z3(spliterator, j10, j13);
        }
        if (i10 == 2) {
            return new C16005w3((InterfaceC15672X) spliterator, j10, j13);
        }
        if (i10 == 3) {
            return new C16010x3((InterfaceC15676a0) spliterator, j10, j13);
        }
        if (i10 != 4) {
            throw new IllegalStateException("Unknown shape " + enumC15910f3);
        }
        return new C16000v3((InterfaceC15669U) spliterator, j10, j13);
    }

    /* JADX INFO: renamed from: c0 */
    public static C16002w0 m17552c0(final EnumC15997v0 enumC15997v0, final Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(enumC15997v0);
        return new C16002w0(EnumC15910f3.REFERENCE, enumC15997v0, new Supplier() { // from class: j$.util.stream.p0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new C15972q0(enumC15997v0, predicate);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    static AbstractC15902e1 m17534L(EnumC15910f3 enumC15910f3) {
        int i10 = AbstractC15803L0.f49111a[enumC15910f3.ordinal()];
        if (i10 == 1) {
            return f49440a;
        }
        if (i10 == 2) {
            return (AbstractC15902e1) f49441b;
        }
        if (i10 == 3) {
            return (AbstractC15902e1) f49442c;
        }
        if (i10 == 4) {
            return (AbstractC15902e1) f49443d;
        }
        throw new IllegalStateException("Unknown shape " + enumC15910f3);
    }

    /* JADX INFO: renamed from: Z */
    public static C16002w0 m17548Z(EnumC15997v0 enumC15997v0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC15997v0);
        return new C16002w0(EnumC15910f3.INT_VALUE, enumC15997v0, new C15961o0(enumC15997v0, 1));
    }

    /* JADX INFO: renamed from: d0 */
    public static Stream m17553d0(AbstractC15915g2 abstractC15915g2, long j10, long j11) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j10);
        }
        return new C15974q2(abstractC15915g2, m17535M(j11), j10, j11);
    }

    /* JADX INFO: renamed from: w */
    public static InterfaceC15798K0 m17573w(InterfaceC15798K0 interfaceC15798K0, long j10, long j11, IntFunction intFunction) {
        if (j10 == 0 && j11 == interfaceC15798K0.count()) {
            return interfaceC15798K0;
        }
        Spliterator spliterator = interfaceC15798K0.spliterator();
        long j12 = j11 - j10;
        InterfaceC15758C0 interfaceC15758C0M17526D = m17526D(j12, intFunction);
        interfaceC15758C0M17526D.mo17364l(j12);
        for (int i10 = 0; i10 < j10 && spliterator.tryAdvance(new C15851V(19)); i10++) {
        }
        if (j11 == interfaceC15798K0.count()) {
            spliterator.forEachRemaining(interfaceC15758C0M17526D);
        } else {
            for (int i11 = 0; i11 < j12 && spliterator.tryAdvance(interfaceC15758C0M17526D); i11++) {
            }
        }
        interfaceC15758C0M17526D.mo17363k();
        return interfaceC15758C0M17526D.mo17356a();
    }

    /* JADX INFO: renamed from: I */
    static AbstractC15808M0 m17531I(EnumC15910f3 enumC15910f3, InterfaceC15798K0 interfaceC15798K0, InterfaceC15798K0 interfaceC15798K1) {
        int i10 = AbstractC15803L0.f49111a[enumC15910f3.ordinal()];
        if (i10 == 1) {
            return new C15857W0(interfaceC15798K0, interfaceC15798K1);
        }
        if (i10 == 2) {
            return new C15842T0((InterfaceC15778G0) interfaceC15798K0, (InterfaceC15778G0) interfaceC15798K1);
        }
        if (i10 == 3) {
            return new C15847U0((InterfaceC15788I0) interfaceC15798K0, (InterfaceC15788I0) interfaceC15798K1);
        }
        if (i10 != 4) {
            throw new IllegalStateException("Unknown shape " + enumC15910f3);
        }
        return new C15837S0((InterfaceC15768E0) interfaceC15798K0, (InterfaceC15768E0) interfaceC15798K1);
    }

    /* JADX INFO: renamed from: T */
    public static IntStream m17542T(InterfaceC15672X interfaceC15672X) {
        return new C15877a0(interfaceC15672X, EnumC15904e3.m17473q(interfaceC15672X), false);
    }

    /* JADX INFO: renamed from: b0 */
    public static C16002w0 m17551b0(EnumC15997v0 enumC15997v0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC15997v0);
        return new C16002w0(EnumC15910f3.LONG_VALUE, enumC15997v0, new C15961o0(enumC15997v0, 0));
    }

    /* JADX INFO: renamed from: k */
    public static void m17561k() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* JADX INFO: renamed from: X */
    public static C16002w0 m17546X(EnumC15997v0 enumC15997v0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC15997v0);
        return new C16002w0(EnumC15910f3.DOUBLE_VALUE, enumC15997v0, new C15961o0(enumC15997v0, 2));
    }

    /* JADX INFO: renamed from: l */
    public static void m17562l() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* JADX INFO: renamed from: D */
    static InterfaceC15758C0 m17526D(long j10, IntFunction intFunction) {
        if (j10 >= 0 && j10 < 2147483639) {
            return new C15908f1(j10, intFunction);
        }
        return new C16008x1();
    }

    /* JADX INFO: renamed from: a */
    public static void m17549a() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* JADX INFO: renamed from: g */
    public static void m17557g(InterfaceC15951m2 interfaceC15951m2, Integer num) {
        if (AbstractC15821O3.f49141a) {
            AbstractC15821O3.m17414a(interfaceC15951m2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC15951m2.accept(num.intValue());
    }

    /* JADX INFO: renamed from: V */
    public static InterfaceC15955n0 m17544V(InterfaceC15676a0 interfaceC15676a0) {
        return new C15925i0(interfaceC15676a0, EnumC15904e3.m17473q(interfaceC15676a0), false);
    }

    /* JADX INFO: renamed from: i */
    public static void m17559i(InterfaceC15957n2 interfaceC15957n2, Long l4) {
        if (AbstractC15821O3.f49141a) {
            AbstractC15821O3.m17414a(interfaceC15957n2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC15957n2.accept(l4.longValue());
    }

    /* JADX INFO: renamed from: S */
    static InterfaceC15748A0 m17541S(long j10) {
        if (j10 < 0 || j10 >= 2147483639) {
            return new C15926i1();
        }
        return new C15920h1(j10);
    }

    /* JADX INFO: renamed from: e */
    public static void m17554e(InterfaceC15945l2 interfaceC15945l2, Double d10) {
        if (AbstractC15821O3.f49141a) {
            AbstractC15821O3.m17414a(interfaceC15945l2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        interfaceC15945l2.accept(d10.doubleValue());
    }

    /* JADX INFO: renamed from: Y */
    public static IntStream m17547Y(AbstractC15889c0 abstractC15889c0, long j10, long j11) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j10);
        }
        return new C15984s2(abstractC15889c0, m17535M(j11), j10, j11);
    }

    /* JADX INFO: renamed from: U */
    static InterfaceC15753B0 m17543U(long j10) {
        if (j10 < 0 || j10 >= 2147483639) {
            return new C15978r1();
        }
        return new C15973q1(j10);
    }

    /* JADX INFO: renamed from: m */
    public static Object[] m17563m(InterfaceC15793J0 interfaceC15793J0, IntFunction intFunction) {
        if (AbstractC15821O3.f49141a) {
            AbstractC15821O3.m17414a(interfaceC15793J0.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (interfaceC15793J0.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) interfaceC15793J0.count());
        interfaceC15793J0.mo17407i(objArr, 0);
        return objArr;
    }

    /* JADX INFO: renamed from: K */
    public static InterfaceC15762D m17533K(InterfaceC15669U interfaceC15669U) {
        return new C16011y(interfaceC15669U, EnumC15904e3.m17473q(interfaceC15669U), false);
    }

    /* JADX INFO: renamed from: J */
    static InterfaceC16017z0 m17532J(long j10) {
        if (j10 < 0 || j10 >= 2147483639) {
            return new C15872Z0();
        }
        return new C15867Y0(j10);
    }

    /* JADX INFO: renamed from: E */
    public static InterfaceC15798K0 m17527E(AbstractC15882b abstractC15882b, Spliterator spliterator, boolean z6, IntFunction intFunction) {
        long jM17447F = abstractC15882b.m17447F(spliterator);
        if (jM17447F < 0 || !spliterator.hasCharacteristics(16384)) {
            C15828Q0 c15828q0 = new C15828Q0();
            c15828q0.f49150a = intFunction;
            InterfaceC15798K0 interfaceC15798K0 = (InterfaceC15798K0) new C15823P0(abstractC15882b, spliterator, c15828q0, new C15936k(12), 3).invoke();
            return z6 ? m17536N(interfaceC15798K0, intFunction) : interfaceC15798K0;
        }
        if (jM17447F >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jM17447F);
        new C15998v1(spliterator, abstractC15882b, objArr).invoke();
        return new C15813N0(objArr);
    }

    /* JADX INFO: renamed from: r */
    public static void m17568r(InterfaceC15778G0 interfaceC15778G0, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            interfaceC15778G0.mo17399e((IntConsumer) consumer);
        } else {
            if (AbstractC15821O3.f49141a) {
                AbstractC15821O3.m17414a(interfaceC15778G0.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((InterfaceC15672X) interfaceC15778G0.spliterator()).forEachRemaining(consumer);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static InterfaceC15955n0 m17550a0(AbstractC15937k0 abstractC15937k0, long j10, long j11) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j10);
        }
        return new C15994u2(abstractC15937k0, m17535M(j11), j10, j11);
    }

    /* JADX INFO: renamed from: o */
    public static void m17565o(InterfaceC15778G0 interfaceC15778G0, Integer[] numArr, int i10) {
        if (AbstractC15821O3.f49141a) {
            AbstractC15821O3.m17414a(interfaceC15778G0.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) interfaceC15778G0.mo17398d();
        for (int i11 = 0; i11 < iArr.length; i11++) {
            numArr[i10 + i11] = Integer.valueOf(iArr[i11]);
        }
    }

    /* JADX INFO: renamed from: u */
    public static InterfaceC15778G0 m17571u(InterfaceC15778G0 interfaceC15778G0, long j10, long j11) {
        if (j10 == 0 && j11 == interfaceC15778G0.count()) {
            return interfaceC15778G0;
        }
        long j12 = j11 - j10;
        InterfaceC15672X interfaceC15672X = (InterfaceC15672X) interfaceC15778G0.spliterator();
        InterfaceC15748A0 interfaceC15748A0M17541S = m17541S(j12);
        interfaceC15748A0M17541S.mo17364l(j12);
        for (int i10 = 0; i10 < j10 && interfaceC15672X.tryAdvance((IntConsumer) new C15773F0(0)); i10++) {
        }
        if (j11 == interfaceC15778G0.count()) {
            interfaceC15672X.forEachRemaining((IntConsumer) interfaceC15748A0M17541S);
        } else {
            for (int i11 = 0; i11 < j12 && interfaceC15672X.tryAdvance((IntConsumer) interfaceC15748A0M17541S); i11++) {
            }
        }
        interfaceC15748A0M17541S.mo17363k();
        return interfaceC15748A0M17541S.mo17356a();
    }

    /* JADX INFO: renamed from: G */
    public static InterfaceC15778G0 m17529G(AbstractC15882b abstractC15882b, Spliterator spliterator, boolean z6) {
        long jM17447F = abstractC15882b.m17447F(spliterator);
        if (jM17447F < 0 || !spliterator.hasCharacteristics(16384)) {
            InterfaceC15778G0 interfaceC15778G0 = (InterfaceC15778G0) new C15823P0(abstractC15882b, spliterator, new C15936k(8), new C15936k(9), 1).invoke();
            return z6 ? m17538P(interfaceC15778G0) : interfaceC15778G0;
        }
        if (jM17447F >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jM17447F];
        new C15988t1(spliterator, abstractC15882b, iArr).invoke();
        return new C15914g1(iArr);
    }

    /* JADX INFO: renamed from: H */
    public static InterfaceC15788I0 m17530H(AbstractC15882b abstractC15882b, Spliterator spliterator, boolean z6) {
        long jM17447F = abstractC15882b.m17447F(spliterator);
        if (jM17447F < 0 || !spliterator.hasCharacteristics(16384)) {
            InterfaceC15788I0 interfaceC15788I0 = (InterfaceC15788I0) new C15823P0(abstractC15882b, spliterator, new C15936k(10), new C15936k(11), 2).invoke();
            return z6 ? m17539Q(interfaceC15788I0) : interfaceC15788I0;
        }
        if (jM17447F >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jM17447F];
        new C15993u1(spliterator, abstractC15882b, jArr).invoke();
        return new C15968p1(jArr);
    }

    /* JADX INFO: renamed from: s */
    public static void m17569s(InterfaceC15788I0 interfaceC15788I0, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            interfaceC15788I0.mo17399e((LongConsumer) consumer);
        } else {
            if (AbstractC15821O3.f49141a) {
                AbstractC15821O3.m17414a(interfaceC15788I0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((InterfaceC15676a0) interfaceC15788I0.spliterator()).forEachRemaining(consumer);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m17566p(InterfaceC15788I0 interfaceC15788I0, Long[] lArr, int i10) {
        if (AbstractC15821O3.f49141a) {
            AbstractC15821O3.m17414a(interfaceC15788I0.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) interfaceC15788I0.mo17398d();
        for (int i11 = 0; i11 < jArr.length; i11++) {
            lArr[i10 + i11] = Long.valueOf(jArr[i11]);
        }
    }

    /* JADX INFO: renamed from: v */
    public static InterfaceC15788I0 m17572v(InterfaceC15788I0 interfaceC15788I0, long j10, long j11) {
        if (j10 == 0 && j11 == interfaceC15788I0.count()) {
            return interfaceC15788I0;
        }
        long j12 = j11 - j10;
        InterfaceC15676a0 interfaceC15676a0 = (InterfaceC15676a0) interfaceC15788I0.spliterator();
        InterfaceC15753B0 interfaceC15753B0M17543U = m17543U(j12);
        interfaceC15753B0M17543U.mo17364l(j12);
        for (int i10 = 0; i10 < j10 && interfaceC15676a0.tryAdvance((LongConsumer) new C15783H0(0)); i10++) {
        }
        if (j11 == interfaceC15788I0.count()) {
            interfaceC15676a0.forEachRemaining((LongConsumer) interfaceC15753B0M17543U);
        } else {
            for (int i11 = 0; i11 < j12 && interfaceC15676a0.tryAdvance((LongConsumer) interfaceC15753B0M17543U); i11++) {
            }
        }
        interfaceC15753B0M17543U.mo17363k();
        return interfaceC15753B0M17543U.mo17356a();
    }

    /* JADX INFO: renamed from: F */
    public static InterfaceC15768E0 m17528F(AbstractC15882b abstractC15882b, Spliterator spliterator, boolean z6) {
        long jM17447F = abstractC15882b.m17447F(spliterator);
        if (jM17447F < 0 || !spliterator.hasCharacteristics(16384)) {
            InterfaceC15768E0 interfaceC15768E0 = (InterfaceC15768E0) new C15823P0(abstractC15882b, spliterator, new C15936k(6), new C15936k(7), 0).invoke();
            return z6 ? m17537O(interfaceC15768E0) : interfaceC15768E0;
        }
        if (jM17447F >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jM17447F];
        new C15983s1(spliterator, abstractC15882b, dArr).invoke();
        return new C15862X0(dArr);
    }

    /* JADX INFO: renamed from: W */
    public static InterfaceC15762D m17545W(AbstractC15747A abstractC15747A, long j10, long j11) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j10);
        }
        return new C16004w2(abstractC15747A, m17535M(j11), j10, j11);
    }

    /* JADX INFO: renamed from: N */
    public static InterfaceC15798K0 m17536N(InterfaceC15798K0 interfaceC15798K0, IntFunction intFunction) {
        if (interfaceC15798K0.mo17409q() <= 0) {
            return interfaceC15798K0;
        }
        long jCount = interfaceC15798K0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new C16018z1(interfaceC15798K0, objArr, 1).invoke();
        return new C15813N0(objArr);
    }

    /* JADX INFO: renamed from: q */
    public static void m17567q(InterfaceC15768E0 interfaceC15768E0, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            interfaceC15768E0.mo17399e((DoubleConsumer) consumer);
        } else {
            if (AbstractC15821O3.f49141a) {
                AbstractC15821O3.m17414a(interfaceC15768E0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((InterfaceC15669U) interfaceC15768E0.spliterator()).forEachRemaining(consumer);
        }
    }

    /* JADX INFO: renamed from: P */
    public static InterfaceC15778G0 m17538P(InterfaceC15778G0 interfaceC15778G0) {
        if (interfaceC15778G0.mo17409q() <= 0) {
            return interfaceC15778G0;
        }
        long jCount = interfaceC15778G0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jCount];
        new C16013y1(interfaceC15778G0, iArr, 0).invoke();
        return new C15914g1(iArr);
    }

    /* JADX INFO: renamed from: n */
    public static void m17564n(InterfaceC15768E0 interfaceC15768E0, Double[] dArr, int i10) {
        if (AbstractC15821O3.f49141a) {
            AbstractC15821O3.m17414a(interfaceC15768E0.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) interfaceC15768E0.mo17398d();
        for (int i11 = 0; i11 < dArr2.length; i11++) {
            dArr[i10 + i11] = Double.valueOf(dArr2[i11]);
        }
    }

    /* JADX INFO: renamed from: t */
    public static InterfaceC15768E0 m17570t(InterfaceC15768E0 interfaceC15768E0, long j10, long j11) {
        if (j10 == 0 && j11 == interfaceC15768E0.count()) {
            return interfaceC15768E0;
        }
        long j12 = j11 - j10;
        InterfaceC15669U interfaceC15669U = (InterfaceC15669U) interfaceC15768E0.spliterator();
        InterfaceC16017z0 interfaceC16017z0M17532J = m17532J(j12);
        interfaceC16017z0M17532J.mo17364l(j12);
        for (int i10 = 0; i10 < j10 && interfaceC15669U.tryAdvance((DoubleConsumer) new C15763D0(0)); i10++) {
        }
        if (j11 == interfaceC15768E0.count()) {
            interfaceC15669U.forEachRemaining((DoubleConsumer) interfaceC16017z0M17532J);
        } else {
            for (int i11 = 0; i11 < j12 && interfaceC15669U.tryAdvance((DoubleConsumer) interfaceC16017z0M17532J); i11++) {
            }
        }
        interfaceC16017z0M17532J.mo17363k();
        return interfaceC16017z0M17532J.mo17356a();
    }

    /* JADX INFO: renamed from: Q */
    public static InterfaceC15788I0 m17539Q(InterfaceC15788I0 interfaceC15788I0) {
        if (interfaceC15788I0.mo17409q() <= 0) {
            return interfaceC15788I0;
        }
        long jCount = interfaceC15788I0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jCount];
        new C16013y1(interfaceC15788I0, jArr, 0).invoke();
        return new C15968p1(jArr);
    }

    /* JADX INFO: renamed from: M */
    private static int m17535M(long j10) {
        return (j10 != -1 ? EnumC15904e3.f49280u : 0) | EnumC15904e3.f49279t;
    }

    /* JADX INFO: renamed from: O */
    public static InterfaceC15768E0 m17537O(InterfaceC15768E0 interfaceC15768E0) {
        if (interfaceC15768E0.mo17409q() <= 0) {
            return interfaceC15768E0;
        }
        long jCount = interfaceC15768E0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jCount];
        new C16013y1(interfaceC15768E0, dArr, 0).invoke();
        return new C15862X0(dArr);
    }

    @Override // p817j$.util.stream.InterfaceC15806L3
    /* JADX INFO: renamed from: b */
    public Object mo17373b(AbstractC15882b abstractC15882b, Spliterator spliterator) {
        InterfaceC15848U1 interfaceC15848U1Mo17357e0 = mo17357e0();
        abstractC15882b.m17453U(spliterator, interfaceC15848U1Mo17357e0);
        return interfaceC15848U1Mo17357e0.get();
    }

    @Override // p817j$.util.stream.InterfaceC15806L3
    /* JADX INFO: renamed from: c */
    public Object mo17374c(AbstractC15882b abstractC15882b, Spliterator spliterator) {
        return ((InterfaceC15848U1) new C15885b2(this, abstractC15882b, spliterator).invoke()).get();
    }
}
