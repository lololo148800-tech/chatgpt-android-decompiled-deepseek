package p817j$.util.concurrent;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15676a0;

/* JADX INFO: renamed from: j$.util.concurrent.A */
/* JADX INFO: loaded from: classes4.dex */
final class C15681A implements InterfaceC15676a0 {

    /* JADX INFO: renamed from: a */
    long f48878a;

    /* JADX INFO: renamed from: b */
    final long f48879b;

    /* JADX INFO: renamed from: c */
    final long f48880c;

    /* JADX INFO: renamed from: d */
    final long f48881d;

    @Override // p817j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

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

    @Override // p817j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    C15681A(long j10, long j11, long j12, long j13) {
        this.f48878a = j10;
        this.f48879b = j11;
        this.f48880c = j12;
        this.f48881d = j13;
    }

    @Override // p817j$.util.InterfaceC15709d0, p817j$.util.Spliterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C15681A trySplit() {
        long j10 = this.f48878a;
        long j11 = (this.f48879b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f48878a = j11;
        return new C15681A(j10, j11, this.f48880c, this.f48881d);
    }

    @Override // p817j$.util.Spliterator
    public final long estimateSize() {
        return this.f48879b - this.f48878a;
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j10 = this.f48878a;
        if (j10 >= this.f48879b) {
            return false;
        }
        longConsumer.accept(ThreadLocalRandom.current().m17319e(this.f48880c, this.f48881d));
        this.f48878a = j10 + 1;
        return true;
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j10 = this.f48878a;
        long j11 = this.f48879b;
        if (j10 < j11) {
            this.f48878a = j11;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                longConsumer.accept(threadLocalRandomCurrent.m17319e(this.f48880c, this.f48881d));
                j10++;
            } while (j10 < j11);
        }
    }
}
