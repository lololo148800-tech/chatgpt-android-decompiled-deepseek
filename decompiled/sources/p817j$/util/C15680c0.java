package p817j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.c0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15680c0 implements Spliterator.OfPrimitive {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC15709d0 f48877a;

    private /* synthetic */ C15680c0(InterfaceC15709d0 interfaceC15709d0) {
        this.f48877a = interfaceC15709d0;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Spliterator.OfPrimitive m17294a(InterfaceC15709d0 interfaceC15709d0) {
        if (interfaceC15709d0 == null) {
            return null;
        }
        if (interfaceC15709d0 instanceof C15678b0) {
            return ((C15678b0) interfaceC15709d0).f48873a;
        }
        if (interfaceC15709d0 instanceof InterfaceC15669U) {
            return C15668T.m17287a((InterfaceC15669U) interfaceC15709d0);
        }
        if (interfaceC15709d0 instanceof InterfaceC15672X) {
            return C15671W.m17289a((InterfaceC15672X) interfaceC15709d0);
        }
        return interfaceC15709d0 instanceof InterfaceC15676a0 ? C15674Z.m17291a((InterfaceC15676a0) interfaceC15709d0) : new C15680c0(interfaceC15709d0);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f48877a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC15709d0 interfaceC15709d0 = this.f48877a;
        if (obj instanceof C15680c0) {
            obj = ((C15680c0) obj).f48877a;
        }
        return interfaceC15709d0.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f48877a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f48877a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f48877a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f48877a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f48877a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f48877a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f48877a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f48877a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f48877a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return m17294a(this.f48877a.trySplit());
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f48877a.trySplit());
    }
}
