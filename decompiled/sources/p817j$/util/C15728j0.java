package p817j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.j0 */
/* JADX INFO: loaded from: classes4.dex */
final class C15728j0 implements Spliterator {

    /* JADX INFO: renamed from: a */
    private final Object[] f48992a;

    /* JADX INFO: renamed from: b */
    private int f48993b;

    /* JADX INFO: renamed from: c */
    private final int f48994c;

    /* JADX INFO: renamed from: d */
    private final int f48995d;

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC15666Q.m17256d(this);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC15666Q.m17257e(this, i10);
    }

    public C15728j0(Object[] objArr, int i10, int i11, int i12) {
        this.f48992a = objArr;
        this.f48993b = i10;
        this.f48994c = i11;
        this.f48995d = i12 | 16448;
    }

    @Override // p817j$.util.Spliterator
    public final Spliterator trySplit() {
        int i10 = this.f48993b;
        int i11 = (this.f48994c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f48993b = i11;
        return new C15728j0(this.f48992a, i10, i11, this.f48995d);
    }

    @Override // p817j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i10;
        consumer.getClass();
        Object[] objArr = this.f48992a;
        int length = objArr.length;
        int i11 = this.f48994c;
        if (length < i11 || (i10 = this.f48993b) < 0) {
            return;
        }
        this.f48993b = i11;
        if (i10 < i11) {
            do {
                consumer.accept(objArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    @Override // p817j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i10 = this.f48993b;
        if (i10 < 0 || i10 >= this.f48994c) {
            return false;
        }
        this.f48993b = i10 + 1;
        consumer.accept(this.f48992a[i10]);
        return true;
    }

    @Override // p817j$.util.Spliterator
    public final long estimateSize() {
        return this.f48994c - this.f48993b;
    }

    @Override // p817j$.util.Spliterator
    public final int characteristics() {
        return this.f48995d;
    }

    @Override // p817j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC15666Q.m17257e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
