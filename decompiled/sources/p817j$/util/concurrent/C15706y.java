package p817j$.util.concurrent;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15669U;

/* JADX INFO: renamed from: j$.util.concurrent.y */
/* JADX INFO: loaded from: classes4.dex */
final class C15706y implements InterfaceC15669U {

    /* JADX INFO: renamed from: a */
    long f48945a;

    /* JADX INFO: renamed from: b */
    final long f48946b;

    /* JADX INFO: renamed from: c */
    final double f48947c;

    /* JADX INFO: renamed from: d */
    final double f48948d;

    @Override // p817j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

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

    @Override // p817j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    C15706y(long j10, long j11, double d10, double d11) {
        this.f48945a = j10;
        this.f48946b = j11;
        this.f48947c = d10;
        this.f48948d = d11;
    }

    @Override // p817j$.util.InterfaceC15709d0, p817j$.util.Spliterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C15706y trySplit() {
        long j10 = this.f48945a;
        long j11 = (this.f48946b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f48945a = j11;
        return new C15706y(j10, j11, this.f48947c, this.f48948d);
    }

    @Override // p817j$.util.Spliterator
    public final long estimateSize() {
        return this.f48946b - this.f48945a;
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j10 = this.f48945a;
        if (j10 >= this.f48946b) {
            return false;
        }
        doubleConsumer.accept(ThreadLocalRandom.current().m17317c(this.f48947c, this.f48948d));
        this.f48945a = j10 + 1;
        return true;
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j10 = this.f48945a;
        long j11 = this.f48946b;
        if (j10 < j11) {
            this.f48945a = j11;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                doubleConsumer.accept(threadLocalRandomCurrent.m17317c(this.f48947c, this.f48948d));
                j10++;
            } while (j10 < j11);
        }
    }
}
