package p817j$.util.stream;

import java.util.Comparator;
import java.util.function.Consumer;
import p817j$.util.AbstractC15666Q;
import p817j$.util.Objects;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.z3 */
/* JADX INFO: loaded from: classes4.dex */
final class C16020z3 extends AbstractC15751A3 implements Spliterator {
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

    C16020z3(Spliterator spliterator, long j10, long j11) {
        super(spliterator, j10, j11, 0L, Math.min(spliterator.estimateSize(), j11));
    }

    @Override // p817j$.util.stream.AbstractC15751A3
    /* JADX INFO: renamed from: a */
    protected final Spliterator mo17359a(Spliterator spliterator, long j10, long j11, long j12, long j13) {
        return new C16020z3(spliterator, j10, j11, j12, j13);
    }

    @Override // p817j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        long j10;
        Objects.requireNonNull(consumer);
        long j11 = this.f49032e;
        long j12 = this.f49028a;
        if (j12 >= j11) {
            return false;
        }
        while (true) {
            j10 = this.f49031d;
            if (j12 <= j10) {
                break;
            }
            this.f49030c.tryAdvance(new C15851V(25));
            this.f49031d++;
        }
        if (j10 >= this.f49032e) {
            return false;
        }
        this.f49031d = j10 + 1;
        return this.f49030c.tryAdvance(consumer);
    }

    @Override // p817j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j10 = this.f49032e;
        long j11 = this.f49028a;
        if (j11 >= j10) {
            return;
        }
        long j12 = this.f49031d;
        if (j12 >= j10) {
            return;
        }
        if (j12 >= j11 && this.f49030c.estimateSize() + j12 <= this.f49029b) {
            this.f49030c.forEachRemaining(consumer);
            this.f49031d = this.f49032e;
            return;
        }
        while (j11 > this.f49031d) {
            this.f49030c.tryAdvance(new C15851V(26));
            this.f49031d++;
        }
        while (this.f49031d < this.f49032e) {
            this.f49030c.tryAdvance(consumer);
            this.f49031d++;
        }
    }
}
