package p817j$.util.concurrent;

import java.util.Comparator;
import java.util.function.Consumer;
import p817j$.util.AbstractC15666Q;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.concurrent.f */
/* JADX INFO: loaded from: classes4.dex */
final class C15687f extends C15697p implements Spliterator {

    /* JADX INFO: renamed from: i */
    final ConcurrentHashMap f48907i;

    /* JADX INFO: renamed from: j */
    long f48908j;

    @Override // p817j$.util.Spliterator
    public final int characteristics() {
        return 4353;
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

    C15687f(C15693l[] c15693lArr, int i10, int i11, int i12, long j10, ConcurrentHashMap concurrentHashMap) {
        super(c15693lArr, i10, i11, i12);
        this.f48907i = concurrentHashMap;
        this.f48908j = j10;
    }

    @Override // p817j$.util.Spliterator
    public final Spliterator trySplit() {
        int i10 = this.f48929f;
        int i11 = this.f48930g;
        int i12 = (i10 + i11) >>> 1;
        if (i12 <= i10) {
            return null;
        }
        C15693l[] c15693lArr = this.f48924a;
        this.f48930g = i12;
        long j10 = this.f48908j >>> 1;
        this.f48908j = j10;
        return new C15687f(c15693lArr, this.f48931h, i12, i11, j10, this.f48907i);
    }

    @Override // p817j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            C15693l c15693lM17322a = m17322a();
            if (c15693lM17322a == null) {
                return;
            } else {
                consumer.accept(new C15692k(c15693lM17322a.f48917b, c15693lM17322a.f48918c, this.f48907i));
            }
        }
    }

    @Override // p817j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        C15693l c15693lM17322a = m17322a();
        if (c15693lM17322a == null) {
            return false;
        }
        consumer.accept(new C15692k(c15693lM17322a.f48917b, c15693lM17322a.f48918c, this.f48907i));
        return true;
    }

    @Override // p817j$.util.Spliterator
    public final long estimateSize() {
        return this.f48908j;
    }
}
