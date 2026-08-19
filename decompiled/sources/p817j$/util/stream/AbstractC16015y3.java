package p817j$.util.stream;

import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15709d0;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.util.stream.y3 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC16015y3 extends AbstractC15751A3 implements InterfaceC15709d0 {
    /* JADX INFO: renamed from: b */
    protected abstract Object mo17522b();

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

    AbstractC16015y3(InterfaceC15709d0 interfaceC15709d0, long j10, long j11) {
        super(interfaceC15709d0, j10, j11, 0L, Math.min(interfaceC15709d0.estimateSize(), j11));
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final boolean tryAdvance(Object obj) {
        long j10;
        Objects.requireNonNull(obj);
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
            ((InterfaceC15709d0) this.f49030c).tryAdvance(mo17522b());
            this.f49031d++;
        }
        if (j10 >= this.f49032e) {
            return false;
        }
        this.f49031d = j10 + 1;
        return ((InterfaceC15709d0) this.f49030c).tryAdvance(obj);
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        long j10 = this.f49032e;
        long j11 = this.f49028a;
        if (j11 >= j10) {
            return;
        }
        long j12 = this.f49031d;
        if (j12 >= j10) {
            return;
        }
        if (j12 >= j11 && ((InterfaceC15709d0) this.f49030c).estimateSize() + j12 <= this.f49029b) {
            ((InterfaceC15709d0) this.f49030c).forEachRemaining(obj);
            this.f49031d = this.f49032e;
            return;
        }
        while (j11 > this.f49031d) {
            ((InterfaceC15709d0) this.f49030c).tryAdvance(mo17522b());
            this.f49031d++;
        }
        while (this.f49031d < this.f49032e) {
            ((InterfaceC15709d0) this.f49030c).tryAdvance(obj);
            this.f49031d++;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
