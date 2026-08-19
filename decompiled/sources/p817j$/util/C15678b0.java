package p817j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.b0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15678b0 implements InterfaceC15709d0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Spliterator.OfPrimitive f48873a;

    private /* synthetic */ C15678b0(Spliterator.OfPrimitive ofPrimitive) {
        this.f48873a = ofPrimitive;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC15709d0 m17293a(Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        if (ofPrimitive instanceof C15680c0) {
            return ((C15680c0) ofPrimitive).f48877a;
        }
        if (ofPrimitive instanceof Spliterator.OfDouble) {
            return C15667S.m17272a((Spliterator.OfDouble) ofPrimitive);
        }
        if (ofPrimitive instanceof Spliterator.OfInt) {
            return C15670V.m17288a((Spliterator.OfInt) ofPrimitive);
        }
        return ofPrimitive instanceof Spliterator.OfLong ? C15673Y.m17290a((Spliterator.OfLong) ofPrimitive) : new C15678b0(ofPrimitive);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f48873a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfPrimitive ofPrimitive = this.f48873a;
        if (obj instanceof C15678b0) {
            obj = ((C15678b0) obj).f48873a;
        }
        return ofPrimitive.equals(obj);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f48873a.estimateSize();
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f48873a.forEachRemaining(obj);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f48873a.forEachRemaining(consumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f48873a.getComparator();
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f48873a.getExactSizeIfKnown();
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f48873a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f48873a.hashCode();
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f48873a.tryAdvance(obj);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f48873a.tryAdvance(consumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C15711e0.m17337a(this.f48873a.trySplit());
    }

    @Override // p817j$.util.InterfaceC15709d0, p817j$.util.Spliterator
    public final /* synthetic */ InterfaceC15709d0 trySplit() {
        return m17293a(this.f48873a.trySplit());
    }
}
