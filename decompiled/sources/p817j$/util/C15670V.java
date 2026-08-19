package p817j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.V */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15670V implements InterfaceC15672X {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Spliterator.OfInt f48864a;

    private /* synthetic */ C15670V(Spliterator.OfInt ofInt) {
        this.f48864a = ofInt;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC15672X m17288a(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C15671W ? ((C15671W) ofInt).f48865a : new C15670V(ofInt);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f48864a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfInt ofInt = this.f48864a;
        if (obj instanceof C15670V) {
            obj = ((C15670V) obj).f48864a;
        }
        return ofInt.equals(obj);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f48864a.estimateSize();
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f48864a.forEachRemaining(obj);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f48864a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // p817j$.util.InterfaceC15672X
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f48864a.forEachRemaining(intConsumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f48864a.getComparator();
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f48864a.getExactSizeIfKnown();
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f48864a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f48864a.hashCode();
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f48864a.tryAdvance(obj);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f48864a.tryAdvance((Consumer<? super Integer>) consumer);
    }

    @Override // p817j$.util.InterfaceC15672X
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f48864a.tryAdvance(intConsumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C15711e0.m17337a(this.f48864a.trySplit());
    }

    @Override // p817j$.util.InterfaceC15672X, p817j$.util.InterfaceC15709d0, p817j$.util.Spliterator
    public final /* synthetic */ InterfaceC15672X trySplit() {
        return m17288a(this.f48864a.trySplit());
    }

    @Override // p817j$.util.InterfaceC15709d0, p817j$.util.Spliterator
    public final /* synthetic */ InterfaceC15709d0 trySplit() {
        return C15678b0.m17293a(this.f48864a.trySplit());
    }
}
