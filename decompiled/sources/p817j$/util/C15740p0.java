package p817j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.p0 */
/* JADX INFO: loaded from: classes4.dex */
final class C15740p0 implements InterfaceC15672X {

    /* JADX INFO: renamed from: a */
    private final int[] f49007a;

    /* JADX INFO: renamed from: b */
    private int f49008b;

    /* JADX INFO: renamed from: c */
    private final int f49009c;

    /* JADX INFO: renamed from: d */
    private final int f49010d;

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC15666Q.m17254b(this, consumer);
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
        return AbstractC15666Q.m17259g(this, consumer);
    }

    public C15740p0(int[] iArr, int i10, int i11, int i12) {
        this.f49007a = iArr;
        this.f49008b = i10;
        this.f49009c = i11;
        this.f49010d = i12 | 16448;
    }

    @Override // p817j$.util.InterfaceC15709d0, p817j$.util.Spliterator
    public final InterfaceC15672X trySplit() {
        int i10 = this.f49008b;
        int i11 = (this.f49009c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f49008b = i11;
        return new C15740p0(this.f49007a, i10, i11, this.f49010d);
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i10;
        intConsumer.getClass();
        int[] iArr = this.f49007a;
        int length = iArr.length;
        int i11 = this.f49009c;
        if (length < i11 || (i10 = this.f49008b) < 0) {
            return;
        }
        this.f49008b = i11;
        if (i10 < i11) {
            do {
                intConsumer.accept(iArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i10 = this.f49008b;
        if (i10 < 0 || i10 >= this.f49009c) {
            return false;
        }
        this.f49008b = i10 + 1;
        intConsumer.accept(this.f49007a[i10]);
        return true;
    }

    @Override // p817j$.util.Spliterator
    public final long estimateSize() {
        return this.f49009c - this.f49008b;
    }

    @Override // p817j$.util.Spliterator
    public final int characteristics() {
        return this.f49010d;
    }

    @Override // p817j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC15666Q.m17257e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
