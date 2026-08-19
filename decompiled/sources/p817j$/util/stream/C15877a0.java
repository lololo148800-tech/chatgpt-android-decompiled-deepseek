package p817j$.util.stream;

import java.util.function.IntConsumer;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.a0 */
/* JADX INFO: loaded from: classes4.dex */
final class C15877a0 extends AbstractC15889c0 {
    @Override // p817j$.util.stream.InterfaceC15918h
    public final InterfaceC15918h unordered() {
        return !m17450K() ? this : new C15991u(this, EnumC15904e3.f49277r, 2);
    }

    @Override // p817j$.util.stream.AbstractC15882b, p817j$.util.stream.InterfaceC15918h
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // p817j$.util.stream.AbstractC15882b, p817j$.util.stream.InterfaceC15918h
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }

    @Override // p817j$.util.stream.AbstractC15882b, p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: P */
    final boolean mo17440P() {
        throw new UnsupportedOperationException();
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: Q */
    final InterfaceC15963o2 mo17378Q(int i10, InterfaceC15963o2 interfaceC15963o2) {
        throw new UnsupportedOperationException();
    }

    @Override // p817j$.util.stream.AbstractC15889c0, p817j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        if (!isParallel()) {
            AbstractC15889c0.m17463Y(m17452S()).forEachRemaining(intConsumer);
        } else {
            super.forEach(intConsumer);
        }
    }

    @Override // p817j$.util.stream.AbstractC15889c0, p817j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        if (!isParallel()) {
            AbstractC15889c0.m17463Y(m17452S()).forEachRemaining(intConsumer);
        } else {
            super.forEachOrdered(intConsumer);
        }
    }
}
