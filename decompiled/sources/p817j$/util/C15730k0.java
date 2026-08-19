package p817j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.k0 */
/* JADX INFO: loaded from: classes4.dex */
final class C15730k0 implements InterfaceC15669U {

    /* JADX INFO: renamed from: a */
    private final double[] f48998a;

    /* JADX INFO: renamed from: b */
    private int f48999b;

    /* JADX INFO: renamed from: c */
    private final int f49000c;

    /* JADX INFO: renamed from: d */
    private final int f49001d;

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC15666Q.m17253a(this, consumer);
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
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC15666Q.m17258f(this, consumer);
    }

    public C15730k0(double[] dArr, int i10, int i11, int i12) {
        this.f48998a = dArr;
        this.f48999b = i10;
        this.f49000c = i11;
        this.f49001d = i12 | 16448;
    }

    @Override // p817j$.util.InterfaceC15709d0, p817j$.util.Spliterator
    public final InterfaceC15669U trySplit() {
        int i10 = this.f48999b;
        int i11 = (this.f49000c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f48999b = i11;
        return new C15730k0(this.f48998a, i10, i11, this.f49001d);
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        int i10;
        doubleConsumer.getClass();
        double[] dArr = this.f48998a;
        int length = dArr.length;
        int i11 = this.f49000c;
        if (length < i11 || (i10 = this.f48999b) < 0) {
            return;
        }
        this.f48999b = i11;
        if (i10 < i11) {
            do {
                doubleConsumer.accept(dArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        int i10 = this.f48999b;
        if (i10 < 0 || i10 >= this.f49000c) {
            return false;
        }
        this.f48999b = i10 + 1;
        doubleConsumer.accept(this.f48998a[i10]);
        return true;
    }

    @Override // p817j$.util.Spliterator
    public final long estimateSize() {
        return this.f49000c - this.f48999b;
    }

    @Override // p817j$.util.Spliterator
    public final int characteristics() {
        return this.f49001d;
    }

    @Override // p817j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC15666Q.m17257e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
