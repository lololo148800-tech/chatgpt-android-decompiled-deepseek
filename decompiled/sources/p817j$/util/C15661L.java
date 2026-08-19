package p817j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.L */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15661L implements InterfaceC15663N, InterfaceC16026x {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PrimitiveIterator.OfLong f48852a;

    private /* synthetic */ C15661L(PrimitiveIterator.OfLong ofLong) {
        this.f48852a = ofLong;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC15663N m17246a(PrimitiveIterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C15662M ? ((C15662M) ofLong).f48853a : new C15661L(ofLong);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfLong ofLong = this.f48852a;
        if (obj instanceof C15661L) {
            obj = ((C15661L) obj).f48852a;
        }
        return ofLong.equals(obj);
    }

    @Override // p817j$.util.InterfaceC15664O
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f48852a.forEachRemaining(obj);
    }

    @Override // p817j$.util.InterfaceC15663N, java.util.Iterator, p817j$.util.InterfaceC16026x
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f48852a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // p817j$.util.InterfaceC15663N
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f48852a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f48852a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f48852a.hashCode();
    }

    @Override // p817j$.util.InterfaceC15663N, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f48852a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f48852a.next();
    }

    @Override // p817j$.util.InterfaceC15663N
    public final /* synthetic */ long nextLong() {
        return this.f48852a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f48852a.remove();
    }
}
