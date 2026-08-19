package p817j$.util.stream;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15669U;
import p817j$.util.InterfaceC15672X;
import p817j$.util.InterfaceC15676a0;
import p817j$.util.InterfaceC15709d0;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.n4 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15959n4 implements Spliterator {

    /* JADX INFO: renamed from: a */
    final Spliterator f49356a;

    /* JADX INFO: renamed from: b */
    final AtomicBoolean f49357b;

    /* JADX INFO: renamed from: c */
    boolean f49358c;

    /* JADX INFO: renamed from: d */
    int f49359d;

    /* JADX INFO: renamed from: c */
    abstract Spliterator mo17485c(Spliterator spliterator);

    @Override // p817j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC15666Q.m17257e(this, i10);
    }

    @Override // p817j$.util.Spliterator
    public void forEachRemaining(Consumer consumer) {
        while (tryAdvance(consumer)) {
        }
    }

    AbstractC15959n4(Spliterator spliterator) {
        this.f49358c = true;
        this.f49356a = spliterator;
        this.f49357b = new AtomicBoolean();
    }

    AbstractC15959n4(Spliterator spliterator, AbstractC15959n4 abstractC15959n4) {
        this.f49358c = true;
        this.f49356a = spliterator;
        abstractC15959n4.getClass();
        this.f49357b = abstractC15959n4.f49357b;
    }

    @Override // p817j$.util.Spliterator
    public final long estimateSize() {
        return this.f49356a.estimateSize();
    }

    @Override // p817j$.util.Spliterator
    public final int characteristics() {
        return this.f49356a.characteristics() & (-16449);
    }

    @Override // p817j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f49356a.getComparator();
    }

    @Override // p817j$.util.Spliterator
    public Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f49356a.trySplit();
        if (spliteratorTrySplit != null) {
            return mo17485c(spliteratorTrySplit);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    final boolean m17501b() {
        return (this.f49359d == 0 && this.f49357b.get()) ? false : true;
    }

    @Override // p817j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC15672X trySplit() {
        return (InterfaceC15672X) trySplit();
    }

    @Override // p817j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC15676a0 trySplit() {
        return (InterfaceC15676a0) trySplit();
    }

    @Override // p817j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC15669U trySplit() {
        return (InterfaceC15669U) trySplit();
    }

    @Override // p817j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC15709d0 trySplit() {
        return (InterfaceC15709d0) trySplit();
    }
}
