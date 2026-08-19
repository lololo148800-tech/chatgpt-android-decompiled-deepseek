package p817j$.util.concurrent;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15672X;

/* JADX INFO: renamed from: j$.util.concurrent.z */
/* JADX INFO: loaded from: classes4.dex */
final class C15707z implements InterfaceC15672X {

    /* JADX INFO: renamed from: a */
    long f48949a;

    /* JADX INFO: renamed from: b */
    final long f48950b;

    /* JADX INFO: renamed from: c */
    final int f48951c;

    /* JADX INFO: renamed from: d */
    final int f48952d;

    @Override // p817j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

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

    @Override // p817j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    C15707z(long j10, long j11, int i10, int i11) {
        this.f48949a = j10;
        this.f48950b = j11;
        this.f48951c = i10;
        this.f48952d = i11;
    }

    @Override // p817j$.util.InterfaceC15709d0, p817j$.util.Spliterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C15707z trySplit() {
        long j10 = this.f48949a;
        long j11 = (this.f48950b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f48949a = j11;
        return new C15707z(j10, j11, this.f48951c, this.f48952d);
    }

    @Override // p817j$.util.Spliterator
    public final long estimateSize() {
        return this.f48950b - this.f48949a;
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j10 = this.f48949a;
        if (j10 >= this.f48950b) {
            return false;
        }
        intConsumer.accept(ThreadLocalRandom.current().m17318d(this.f48951c, this.f48952d));
        this.f48949a = j10 + 1;
        return true;
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j10 = this.f48949a;
        long j11 = this.f48950b;
        if (j10 < j11) {
            this.f48949a = j11;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                intConsumer.accept(threadLocalRandomCurrent.m17318d(this.f48951c, this.f48952d));
                j10++;
            } while (j10 < j11);
        }
    }
}
