package p817j$.util.stream;

import java.util.function.BiConsumer;
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

/* JADX INFO: renamed from: j$.util.stream.n0 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC15955n0 extends InterfaceC15918h {
    /* JADX INFO: renamed from: a */
    InterfaceC15955n0 mo17489a();

    InterfaceC15762D asDoubleStream();

    C16028z average();

    /* JADX INFO: renamed from: b */
    InterfaceC15955n0 mo17490b();

    Stream boxed();

    /* JADX INFO: renamed from: c */
    InterfaceC15955n0 mo17491c(C15800K2 c15800k2);

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    /* JADX INFO: renamed from: d */
    InterfaceC15955n0 mo17492d();

    InterfaceC15955n0 distinct();

    /* JADX INFO: renamed from: e */
    InterfaceC15955n0 mo17493e();

    C15651B findAny();

    C15651B findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    InterfaceC15663N iterator();

    /* JADX INFO: renamed from: l */
    InterfaceC15762D mo17494l();

    InterfaceC15955n0 limit(long j10);

    Stream mapToObj(LongFunction longFunction);

    C15651B max();

    C15651B min();

    /* JADX INFO: renamed from: n */
    boolean mo17495n();

    @Override // p817j$.util.stream.InterfaceC15918h
    InterfaceC15955n0 parallel();

    InterfaceC15955n0 peek(LongConsumer longConsumer);

    /* JADX INFO: renamed from: r */
    boolean mo17496r();

    long reduce(long j10, LongBinaryOperator longBinaryOperator);

    C15651B reduce(LongBinaryOperator longBinaryOperator);

    @Override // p817j$.util.stream.InterfaceC15918h
    InterfaceC15955n0 sequential();

    InterfaceC15955n0 skip(long j10);

    InterfaceC15955n0 sorted();

    @Override // p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    InterfaceC15676a0 spliterator();

    long sum();

    C16027y summaryStatistics();

    long[] toArray();

    /* JADX INFO: renamed from: v */
    boolean mo17497v();

    /* JADX INFO: renamed from: w */
    IntStream mo17498w();
}
