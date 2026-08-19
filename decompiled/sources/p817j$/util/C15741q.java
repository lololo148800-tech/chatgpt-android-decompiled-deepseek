package p817j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.q */
/* JADX INFO: loaded from: classes4.dex */
final class C15741q implements Spliterator {

    /* JADX INFO: renamed from: a */
    final Spliterator f49011a;

    C15741q(Spliterator spliterator) {
        this.f49011a = spliterator;
    }

    @Override // p817j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return this.f49011a.tryAdvance(new C15737o(consumer));
    }

    @Override // p817j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        this.f49011a.forEachRemaining(new C15737o(consumer));
    }

    @Override // p817j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f49011a.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return new C15741q(spliteratorTrySplit);
    }

    @Override // p817j$.util.Spliterator
    public final long estimateSize() {
        return this.f49011a.estimateSize();
    }

    @Override // p817j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return this.f49011a.getExactSizeIfKnown();
    }

    @Override // p817j$.util.Spliterator
    public final int characteristics() {
        return this.f49011a.characteristics();
    }

    @Override // p817j$.util.Spliterator
    public final boolean hasCharacteristics(int i10) {
        return this.f49011a.hasCharacteristics(i10);
    }

    @Override // p817j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f49011a.getComparator();
    }
}
