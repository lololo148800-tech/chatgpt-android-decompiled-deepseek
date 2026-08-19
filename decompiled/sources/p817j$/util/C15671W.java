package p817j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.W */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15671W implements Spliterator.OfInt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC15672X f48865a;

    private /* synthetic */ C15671W(InterfaceC15672X interfaceC15672X) {
        this.f48865a = interfaceC15672X;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Spliterator.OfInt m17289a(InterfaceC15672X interfaceC15672X) {
        if (interfaceC15672X == null) {
            return null;
        }
        return interfaceC15672X instanceof C15670V ? ((C15670V) interfaceC15672X).f48864a : new C15671W(interfaceC15672X);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f48865a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC15672X interfaceC15672X = this.f48865a;
        if (obj instanceof C15671W) {
            obj = ((C15671W) obj).f48865a;
        }
        return interfaceC15672X.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f48865a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f48865a.forEachRemaining((Object) intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f48865a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator.OfInt
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.f48865a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f48865a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f48865a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f48865a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f48865a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f48865a.tryAdvance((Object) intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f48865a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfInt
    /* JADX INFO: renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(IntConsumer intConsumer) {
        return this.f48865a.tryAdvance(intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfInt trySplit() {
        return m17289a(this.f48865a.trySplit());
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return C15680c0.m17294a(this.f48865a.trySplit());
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f48865a.trySplit());
    }
}
