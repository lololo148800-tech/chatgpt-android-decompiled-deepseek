package p817j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.D */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15653D implements InterfaceC15655F, InterfaceC16026x {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PrimitiveIterator.OfDouble f48846a;

    private /* synthetic */ C15653D(PrimitiveIterator.OfDouble ofDouble) {
        this.f48846a = ofDouble;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC15655F m17242a(PrimitiveIterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C15654E ? ((C15654E) ofDouble).f48847a : new C15653D(ofDouble);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfDouble ofDouble = this.f48846a;
        if (obj instanceof C15653D) {
            obj = ((C15653D) obj).f48846a;
        }
        return ofDouble.equals(obj);
    }

    @Override // p817j$.util.InterfaceC15664O
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f48846a.forEachRemaining(obj);
    }

    @Override // p817j$.util.InterfaceC15655F, java.util.Iterator, p817j$.util.InterfaceC16026x
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f48846a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // p817j$.util.InterfaceC15655F
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f48846a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f48846a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f48846a.hashCode();
    }

    @Override // p817j$.util.InterfaceC15655F, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f48846a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f48846a.next();
    }

    @Override // p817j$.util.InterfaceC15655F
    public final /* synthetic */ double nextDouble() {
        return this.f48846a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f48846a.remove();
    }
}
