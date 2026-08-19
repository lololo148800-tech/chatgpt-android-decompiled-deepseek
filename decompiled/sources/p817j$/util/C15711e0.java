package p817j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.e0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15711e0 implements Spliterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Spliterator f48954a;

    private /* synthetic */ C15711e0(Spliterator spliterator) {
        this.f48954a = spliterator;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Spliterator m17337a(Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        if (spliterator instanceof Spliterator.Wrapper) {
            return Spliterator.this;
        }
        return spliterator instanceof Spliterator.OfPrimitive ? C15678b0.m17293a((Spliterator.OfPrimitive) spliterator) : new C15711e0(spliterator);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f48954a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator spliterator = this.f48954a;
        if (obj instanceof C15711e0) {
            obj = ((C15711e0) obj).f48954a;
        }
        return spliterator.equals(obj);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f48954a.estimateSize();
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f48954a.forEachRemaining(consumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f48954a.getComparator();
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f48954a.getExactSizeIfKnown();
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f48954a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f48954a.hashCode();
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f48954a.tryAdvance(consumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return m17337a(this.f48954a.trySplit());
    }
}
