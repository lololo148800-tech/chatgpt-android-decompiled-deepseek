package p817j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import p817j$.util.C16024v;
import p817j$.util.C16028z;
import p817j$.util.InterfaceC15655F;
import p817j$.util.InterfaceC15669U;

/* JADX INFO: renamed from: j$.util.stream.D */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC15762D extends InterfaceC15918h {
    /* JADX INFO: renamed from: a */
    InterfaceC15762D mo17347a();

    C16028z average();

    /* JADX INFO: renamed from: b */
    InterfaceC15762D mo17348b();

    Stream boxed();

    /* JADX INFO: renamed from: c */
    InterfaceC15762D mo17349c(C15800K2 c15800k2);

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    /* JADX INFO: renamed from: d */
    InterfaceC15762D mo17350d();

    InterfaceC15762D distinct();

    C16028z findAny();

    C16028z findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    /* JADX INFO: renamed from: h */
    boolean mo17351h();

    /* JADX INFO: renamed from: i */
    InterfaceC15955n0 mo17352i();

    InterfaceC15655F iterator();

    InterfaceC15762D limit(long j10);

    InterfaceC15762D map(DoubleUnaryOperator doubleUnaryOperator);

    Stream mapToObj(DoubleFunction doubleFunction);

    C16028z max();

    C16028z min();

    /* JADX INFO: renamed from: p */
    boolean mo17353p();

    @Override // p817j$.util.stream.InterfaceC15918h
    InterfaceC15762D parallel();

    InterfaceC15762D peek(DoubleConsumer doubleConsumer);

    double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator);

    C16028z reduce(DoubleBinaryOperator doubleBinaryOperator);

    @Override // p817j$.util.stream.InterfaceC15918h
    InterfaceC15762D sequential();

    InterfaceC15762D skip(long j10);

    InterfaceC15762D sorted();

    InterfaceC15669U spliterator();

    double sum();

    C16024v summaryStatistics();

    /* JADX INFO: renamed from: t */
    IntStream mo17354t();

    double[] toArray();

    /* JADX INFO: renamed from: x */
    boolean mo17355x();
}
