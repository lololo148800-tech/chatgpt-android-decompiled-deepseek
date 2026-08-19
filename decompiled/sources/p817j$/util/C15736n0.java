package p817j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.n0 */
/* JADX INFO: loaded from: classes4.dex */
final class C15736n0 extends AbstractC15666Q implements InterfaceC15676a0 {
    @Override // p817j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC15666Q.m17255c(this, consumer);
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
        return AbstractC15666Q.m17260h(this, consumer);
    }

    @Override // p817j$.util.AbstractC15666Q, p817j$.util.InterfaceC15669U, p817j$.util.InterfaceC15709d0, p817j$.util.Spliterator
    public final /* bridge */ /* synthetic */ InterfaceC15676a0 trySplit() {
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

    @Override // p817j$.util.InterfaceC15676a0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return false;
    }

    @Override // p817j$.util.InterfaceC15676a0
    public final void forEachRemaining(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
    }
}
