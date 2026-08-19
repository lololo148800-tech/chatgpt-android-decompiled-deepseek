package p817j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.I */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15658I implements PrimitiveIterator.OfInt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC15659J f48850a;

    private /* synthetic */ C15658I(InterfaceC15659J interfaceC15659J) {
        this.f48850a = interfaceC15659J;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ PrimitiveIterator.OfInt m17245a(InterfaceC15659J interfaceC15659J) {
        if (interfaceC15659J == null) {
            return null;
        }
        return interfaceC15659J instanceof C15657H ? ((C15657H) interfaceC15659J).f48849a : new C15658I(interfaceC15659J);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC15659J interfaceC15659J = this.f48850a;
        if (obj instanceof C15658I) {
            obj = ((C15658I) obj).f48850a;
        }
        return interfaceC15659J.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f48850a.forEachRemaining((Object) intConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f48850a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.f48850a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f48850a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f48850a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f48850a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f48850a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt
    public final /* synthetic */ int nextInt() {
        return this.f48850a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f48850a.remove();
    }
}
