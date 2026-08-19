package p817j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.S */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15667S implements InterfaceC15669U {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Spliterator.OfDouble f48857a;

    private /* synthetic */ C15667S(Spliterator.OfDouble ofDouble) {
        this.f48857a = ofDouble;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC15669U m17272a(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C15668T ? ((C15668T) ofDouble).f48863a : new C15667S(ofDouble);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f48857a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfDouble ofDouble = this.f48857a;
        if (obj instanceof C15667S) {
            obj = ((C15667S) obj).f48857a;
        }
        return ofDouble.equals(obj);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f48857a.estimateSize();
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f48857a.forEachRemaining(obj);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f48857a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // p817j$.util.InterfaceC15669U
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f48857a.forEachRemaining(doubleConsumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f48857a.getComparator();
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f48857a.getExactSizeIfKnown();
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f48857a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f48857a.hashCode();
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f48857a.tryAdvance(obj);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f48857a.tryAdvance((Consumer<? super Double>) consumer);
    }

    @Override // p817j$.util.InterfaceC15669U
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f48857a.tryAdvance(doubleConsumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C15711e0.m17337a(this.f48857a.trySplit());
    }

    @Override // p817j$.util.InterfaceC15669U, p817j$.util.InterfaceC15709d0, p817j$.util.Spliterator
    public final /* synthetic */ InterfaceC15669U trySplit() {
        return m17272a(this.f48857a.trySplit());
    }

    @Override // p817j$.util.InterfaceC15709d0, p817j$.util.Spliterator
    public final /* synthetic */ InterfaceC15709d0 trySplit() {
        return C15678b0.m17293a(this.f48857a.trySplit());
    }
}
