package p817j$.util.stream;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.O0 */
/* JADX INFO: loaded from: classes4.dex */
final class C15818O0 implements InterfaceC15798K0 {

    /* JADX INFO: renamed from: a */
    private final Collection f49135a;

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC15798K0 mo17406h(long j10, long j11, IntFunction intFunction) {
        return AbstractC16012y0.m17573w(this, j10, j11, intFunction);
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int mo17409q() {
        return 0;
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: b */
    public final InterfaceC15798K0 mo17396b(int i10) {
        throw new IndexOutOfBoundsException();
    }

    C15818O0(Collection collection) {
        this.f49135a = collection;
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    public final Spliterator spliterator() {
        return p817j$.util.Collection.EL.stream(this.f49135a).spliterator();
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: i */
    public final void mo17407i(Object[] objArr, int i10) {
        Iterator it = this.f49135a.iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: o */
    public final Object[] mo17408o(IntFunction intFunction) {
        Collection collection = this.f49135a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    public final long count() {
        return this.f49135a.size();
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    public final void forEach(Consumer consumer) {
        p817j$.util.Collection.EL.m17238a(this.f49135a, consumer);
    }

    public final String toString() {
        Collection collection = this.f49135a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }
}
