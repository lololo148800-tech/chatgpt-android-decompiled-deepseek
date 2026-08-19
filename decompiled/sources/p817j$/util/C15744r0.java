package p817j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.r0 */
/* JADX INFO: loaded from: classes4.dex */
final class C15744r0 implements InterfaceC15676a0 {

    /* JADX INFO: renamed from: a */
    private final long[] f49017a;

    /* JADX INFO: renamed from: b */
    private int f49018b;

    /* JADX INFO: renamed from: c */
    private final int f49019c;

    /* JADX INFO: renamed from: d */
    private final int f49020d;

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC15666Q.m17255c(this, consumer);
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
        return AbstractC15666Q.m17260h(this, consumer);
    }

    public C15744r0(long[] jArr, int i10, int i11, int i12) {
        this.f49017a = jArr;
        this.f49018b = i10;
        this.f49019c = i11;
        this.f49020d = i12 | 16448;
    }

    @Override // p817j$.util.InterfaceC15709d0, p817j$.util.Spliterator
    public final InterfaceC15676a0 trySplit() {
        int i10 = this.f49018b;
        int i11 = (this.f49019c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f49018b = i11;
        return new C15744r0(this.f49017a, i10, i11, this.f49020d);
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i10;
        longConsumer.getClass();
        long[] jArr = this.f49017a;
        int length = jArr.length;
        int i11 = this.f49019c;
        if (length < i11 || (i10 = this.f49018b) < 0) {
            return;
        }
        this.f49018b = i11;
        if (i10 < i11) {
            do {
                longConsumer.accept(jArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        int i10 = this.f49018b;
        if (i10 < 0 || i10 >= this.f49019c) {
            return false;
        }
        this.f49018b = i10 + 1;
        longConsumer.accept(this.f49017a[i10]);
        return true;
    }

    @Override // p817j$.util.Spliterator
    public final long estimateSize() {
        return this.f49019c - this.f49018b;
    }

    @Override // p817j$.util.Spliterator
    public final int characteristics() {
        return this.f49020d;
    }

    @Override // p817j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC15666Q.m17257e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
