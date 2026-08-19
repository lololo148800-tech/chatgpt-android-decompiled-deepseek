package p817j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.E */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15654E implements PrimitiveIterator.OfDouble {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC15655F f48847a;

    private /* synthetic */ C15654E(InterfaceC15655F interfaceC15655F) {
        this.f48847a = interfaceC15655F;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ PrimitiveIterator.OfDouble m17243a(InterfaceC15655F interfaceC15655F) {
        if (interfaceC15655F == null) {
            return null;
        }
        return interfaceC15655F instanceof C15653D ? ((C15653D) interfaceC15655F).f48846a : new C15654E(interfaceC15655F);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC15655F interfaceC15655F = this.f48847a;
        if (obj instanceof C15654E) {
            obj = ((C15654E) obj).f48847a;
        }
        return interfaceC15655F.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f48847a.forEachRemaining((Object) doubleConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f48847a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f48847a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f48847a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f48847a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f48847a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f48847a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public final /* synthetic */ double nextDouble() {
        return this.f48847a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f48847a.remove();
    }
}
