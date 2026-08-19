package p817j$.util.stream;

import java.util.function.LongConsumer;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.i0 */
/* JADX INFO: loaded from: classes4.dex */
final class C15925i0 extends AbstractC15937k0 {
    @Override // p817j$.util.stream.InterfaceC15918h
    public final InterfaceC15918h unordered() {
        return !m17450K() ? this : new C15996v(this, EnumC15904e3.f49277r, 4);
    }

    @Override // p817j$.util.stream.AbstractC15882b, p817j$.util.stream.InterfaceC15918h
    public final /* bridge */ /* synthetic */ InterfaceC15955n0 parallel() {
        parallel();
        return this;
    }

    @Override // p817j$.util.stream.AbstractC15882b, p817j$.util.stream.InterfaceC15918h
    public final /* bridge */ /* synthetic */ InterfaceC15955n0 sequential() {
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

    @Override // p817j$.util.stream.AbstractC15937k0, p817j$.util.stream.InterfaceC15955n0
    public final void forEach(LongConsumer longConsumer) {
        if (!isParallel()) {
            AbstractC15937k0.m17488Y(m17452S()).forEachRemaining(longConsumer);
        } else {
            super.forEach(longConsumer);
        }
    }

    @Override // p817j$.util.stream.AbstractC15937k0, p817j$.util.stream.InterfaceC15955n0
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (!isParallel()) {
            AbstractC15937k0.m17488Y(m17452S()).forEachRemaining(longConsumer);
        } else {
            super.forEachOrdered(longConsumer);
        }
    }
}
