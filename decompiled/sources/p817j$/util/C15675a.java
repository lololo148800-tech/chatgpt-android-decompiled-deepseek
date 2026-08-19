package p817j$.util;

import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: j$.util.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C15675a implements Spliterator {

    /* JADX INFO: renamed from: a */
    private final List f48868a;

    /* JADX INFO: renamed from: b */
    private int f48869b;

    /* JADX INFO: renamed from: c */
    private int f48870c;

    @Override // p817j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC15666Q.m17256d(this);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC15666Q.m17257e(this, i10);
    }

    @Override // p817j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    C15675a(List list) {
        this.f48868a = list;
        this.f48869b = 0;
        this.f48870c = -1;
    }

    private C15675a(C15675a c15675a, int i10, int i11) {
        this.f48868a = c15675a.f48868a;
        this.f48869b = i10;
        this.f48870c = i11;
    }

    /* JADX INFO: renamed from: a */
    private int m17292a() {
        int i10 = this.f48870c;
        if (i10 >= 0) {
            return i10;
        }
        int size = this.f48868a.size();
        this.f48870c = size;
        return size;
    }

    @Override // p817j$.util.Spliterator
    public final Spliterator trySplit() {
        int iM17292a = m17292a();
        int i10 = this.f48869b;
        int i11 = (iM17292a + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f48869b = i11;
        return new C15675a(this, i10, i11);
    }

    @Override // p817j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int iM17292a = m17292a();
        int i10 = this.f48869b;
        if (i10 >= iM17292a) {
            return false;
        }
        this.f48869b = i10 + 1;
        try {
            consumer.accept(this.f48868a.get(i10));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // p817j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int iM17292a = m17292a();
        this.f48869b = iM17292a;
        for (int i10 = this.f48869b; i10 < iM17292a; i10++) {
            try {
                consumer.accept(this.f48868a.get(i10));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // p817j$.util.Spliterator
    public final long estimateSize() {
        return m17292a() - this.f48869b;
    }
}
