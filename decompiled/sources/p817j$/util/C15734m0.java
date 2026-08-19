package p817j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.m0 */
/* JADX INFO: loaded from: classes4.dex */
final class C15734m0 extends AbstractC15666Q implements InterfaceC15672X {
    @Override // p817j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC15666Q.m17254b(this, consumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC15666Q.m17256d(this);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC15666Q.m17257e(this, i10);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC15666Q.m17259g(this, consumer);
    }

    @Override // p817j$.util.AbstractC15666Q, p817j$.util.InterfaceC15669U, p817j$.util.InterfaceC15709d0, p817j$.util.Spliterator
    public final /* bridge */ /* synthetic */ InterfaceC15672X trySplit() {
        return null;
    }

    @Override // p817j$.util.AbstractC15666Q, p817j$.util.InterfaceC15669U, p817j$.util.InterfaceC15709d0, p817j$.util.Spliterator
    public final /* bridge */ /* synthetic */ InterfaceC15709d0 trySplit() {
        return null;
    }

    @Override // p817j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // p817j$.util.InterfaceC15672X
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return false;
    }

    @Override // p817j$.util.InterfaceC15672X
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
    }
}
