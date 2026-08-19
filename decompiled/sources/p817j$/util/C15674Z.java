package p817j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.Z */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15674Z implements Spliterator.OfLong {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC15676a0 f48867a;

    private /* synthetic */ C15674Z(InterfaceC15676a0 interfaceC15676a0) {
        this.f48867a = interfaceC15676a0;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Spliterator.OfLong m17291a(InterfaceC15676a0 interfaceC15676a0) {
        if (interfaceC15676a0 == null) {
            return null;
        }
        return interfaceC15676a0 instanceof C15673Y ? ((C15673Y) interfaceC15676a0).f48866a : new C15674Z(interfaceC15676a0);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f48867a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC15676a0 interfaceC15676a0 = this.f48867a;
        if (obj instanceof C15674Z) {
            obj = ((C15674Z) obj).f48867a;
        }
        return interfaceC15676a0.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f48867a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f48867a.forEachRemaining((Object) longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f48867a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator.OfLong
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.f48867a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f48867a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f48867a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f48867a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f48867a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f48867a.tryAdvance((Object) longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f48867a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfLong
    /* JADX INFO: renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(LongConsumer longConsumer) {
        return this.f48867a.tryAdvance(longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfLong trySplit() {
        return m17291a(this.f48867a.trySplit());
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return C15680c0.m17294a(this.f48867a.trySplit());
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f48867a.trySplit());
    }
}
