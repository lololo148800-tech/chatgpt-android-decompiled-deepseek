package p817j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.M */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15662M implements PrimitiveIterator.OfLong {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC15663N f48853a;

    private /* synthetic */ C15662M(InterfaceC15663N interfaceC15663N) {
        this.f48853a = interfaceC15663N;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ PrimitiveIterator.OfLong m17247a(InterfaceC15663N interfaceC15663N) {
        if (interfaceC15663N == null) {
            return null;
        }
        return interfaceC15663N instanceof C15661L ? ((C15661L) interfaceC15663N).f48852a : new C15662M(interfaceC15663N);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC15663N interfaceC15663N = this.f48853a;
        if (obj instanceof C15662M) {
            obj = ((C15662M) obj).f48853a;
        }
        return interfaceC15663N.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f48853a.forEachRemaining((Object) longConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f48853a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.f48853a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f48853a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f48853a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f48853a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f48853a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public final /* synthetic */ long nextLong() {
        return this.f48853a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f48853a.remove();
    }
}
