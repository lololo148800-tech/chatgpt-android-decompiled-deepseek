package p817j$.util.stream;

import java.util.function.DoubleConsumer;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.y */
/* JADX INFO: loaded from: classes4.dex */
final class C16011y extends AbstractC15747A {
    @Override // p817j$.util.stream.InterfaceC15918h
    public final InterfaceC15918h unordered() {
        return !m17450K() ? this : new C16006x(this, EnumC15904e3.f49277r, 0);
    }

    @Override // p817j$.util.stream.AbstractC15882b, p817j$.util.stream.InterfaceC15918h
    public final /* bridge */ /* synthetic */ InterfaceC15762D parallel() {
        parallel();
        return this;
    }

    @Override // p817j$.util.stream.AbstractC15882b, p817j$.util.stream.InterfaceC15918h
    public final /* bridge */ /* synthetic */ InterfaceC15762D sequential() {
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

    @Override // p817j$.util.stream.AbstractC15747A, p817j$.util.stream.InterfaceC15762D
    public final void forEach(DoubleConsumer doubleConsumer) {
        if (!isParallel()) {
            AbstractC15747A.m17341Y(m17452S()).forEachRemaining(doubleConsumer);
        } else {
            super.forEach(doubleConsumer);
        }
    }

    @Override // p817j$.util.stream.AbstractC15747A, p817j$.util.stream.InterfaceC15762D
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (!isParallel()) {
            AbstractC15747A.m17341Y(m17452S()).forEachRemaining(doubleConsumer);
        } else {
            super.forEachOrdered(doubleConsumer);
        }
    }
}
