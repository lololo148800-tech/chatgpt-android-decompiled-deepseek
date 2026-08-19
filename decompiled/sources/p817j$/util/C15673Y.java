package p817j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.Y */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15673Y implements InterfaceC15676a0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Spliterator.OfLong f48866a;

    private /* synthetic */ C15673Y(Spliterator.OfLong ofLong) {
        this.f48866a = ofLong;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC15676a0 m17290a(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C15674Z ? ((C15674Z) ofLong).f48867a : new C15673Y(ofLong);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f48866a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfLong ofLong = this.f48866a;
        if (obj instanceof C15673Y) {
            obj = ((C15673Y) obj).f48866a;
        }
        return ofLong.equals(obj);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f48866a.estimateSize();
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f48866a.forEachRemaining(obj);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f48866a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // p817j$.util.InterfaceC15676a0
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f48866a.forEachRemaining(longConsumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f48866a.getComparator();
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f48866a.getExactSizeIfKnown();
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f48866a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f48866a.hashCode();
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f48866a.tryAdvance(obj);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f48866a.tryAdvance((Consumer<? super Long>) consumer);
    }

    @Override // p817j$.util.InterfaceC15676a0
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f48866a.tryAdvance(longConsumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C15711e0.m17337a(this.f48866a.trySplit());
    }

    @Override // p817j$.util.InterfaceC15676a0, p817j$.util.InterfaceC15709d0, p817j$.util.Spliterator
    public final /* synthetic */ InterfaceC15676a0 trySplit() {
        return m17290a(this.f48866a.trySplit());
    }

    @Override // p817j$.util.InterfaceC15709d0, p817j$.util.Spliterator
    public final /* synthetic */ InterfaceC15709d0 trySplit() {
        return C15678b0.m17293a(this.f48866a.trySplit());
    }
}
