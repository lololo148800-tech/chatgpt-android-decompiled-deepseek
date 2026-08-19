package p817j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.q0 */
/* JADX INFO: loaded from: classes4.dex */
class C15742q0 implements Spliterator {

    /* JADX INFO: renamed from: a */
    private final Collection f49012a;

    /* JADX INFO: renamed from: b */
    private Iterator f49013b;

    /* JADX INFO: renamed from: c */
    private final int f49014c;

    /* JADX INFO: renamed from: d */
    private long f49015d;

    /* JADX INFO: renamed from: e */
    private int f49016e;

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC15666Q.m17256d(this);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC15666Q.m17257e(this, i10);
    }

    public C15742q0(Collection collection, int i10) {
        this.f49012a = collection;
        this.f49013b = null;
        this.f49014c = (i10 & 4096) == 0 ? i10 | 16448 : i10;
    }

    public C15742q0(Iterator it) {
        this.f49012a = null;
        this.f49013b = it;
        this.f49015d = Long.MAX_VALUE;
        this.f49014c = 272;
    }

    @Override // p817j$.util.Spliterator
    public final Spliterator trySplit() {
        long size;
        Iterator it = this.f49013b;
        if (it == null) {
            Collection collection = this.f49012a;
            Iterator it2 = collection.iterator();
            this.f49013b = it2;
            size = collection.size();
            this.f49015d = size;
            it = it2;
        } else {
            size = this.f49015d;
        }
        if (size <= 1 || !it.hasNext()) {
            return null;
        }
        int i10 = this.f49016e + 1024;
        if (i10 > size) {
            i10 = (int) size;
        }
        if (i10 > 33554432) {
            i10 = 33554432;
        }
        Object[] objArr = new Object[i10];
        int i11 = 0;
        do {
            objArr[i11] = it.next();
            i11++;
            if (i11 >= i10) {
                break;
            }
        } while (it.hasNext());
        this.f49016e = i11;
        long j10 = this.f49015d;
        if (j10 != Long.MAX_VALUE) {
            this.f49015d = j10 - ((long) i11);
        }
        return new C15728j0(objArr, 0, i11, this.f49014c);
    }

    @Override // p817j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f49013b;
        if (it == null) {
            Collection collection = this.f49012a;
            Iterator it2 = collection.iterator();
            this.f49013b = it2;
            this.f49015d = collection.size();
            it = it2;
        }
        AbstractC15666Q.m17269q(it, consumer);
    }

    @Override // p817j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.f49013b == null) {
            Collection collection = this.f49012a;
            this.f49013b = collection.iterator();
            this.f49015d = collection.size();
        }
        if (!this.f49013b.hasNext()) {
            return false;
        }
        consumer.accept(this.f49013b.next());
        return true;
    }

    @Override // p817j$.util.Spliterator
    public final long estimateSize() {
        if (this.f49013b == null) {
            Collection collection = this.f49012a;
            this.f49013b = collection.iterator();
            long size = collection.size();
            this.f49015d = size;
            return size;
        }
        return this.f49015d;
    }

    @Override // p817j$.util.Spliterator
    public final int characteristics() {
        return this.f49014c;
    }

    @Override // p817j$.util.Spliterator
    public Comparator getComparator() {
        if (AbstractC15666Q.m17257e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
