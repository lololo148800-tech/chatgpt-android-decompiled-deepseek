package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15676a0;
import p817j$.util.InterfaceC15709d0;
import p817j$.util.Objects;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.u3 */
/* JADX INFO: loaded from: classes4.dex */
final class C15995u3 extends AbstractC15916g3 implements InterfaceC15676a0 {
    @Override // p817j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC15666Q.m17255c(this, consumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC15666Q.m17260h(this, consumer);
    }

    @Override // p817j$.util.stream.AbstractC15916g3
    /* JADX INFO: renamed from: e */
    final AbstractC15916g3 mo17402e(Spliterator spliterator) {
        return new C15995u3(this.f49297b, spliterator, this.f49296a);
    }

    @Override // p817j$.util.stream.AbstractC15916g3
    /* JADX INFO: renamed from: d */
    final void mo17401d() {
        C15859W2 c15859w2 = new C15859W2();
        this.f49303h = c15859w2;
        Objects.requireNonNull(c15859w2);
        this.f49300e = this.f49297b.m17454V(new C15990t3(c15859w2, 0));
        this.f49301f = new C15800K2(3, this);
    }

    @Override // p817j$.util.stream.AbstractC15916g3, p817j$.util.Spliterator
    public final Spliterator trySplit() {
        return (InterfaceC15676a0) super.trySplit();
    }

    @Override // p817j$.util.stream.AbstractC15916g3, p817j$.util.Spliterator
    public final InterfaceC15676a0 trySplit() {
        return (InterfaceC15676a0) super.trySplit();
    }

    @Override // p817j$.util.stream.AbstractC15916g3, p817j$.util.Spliterator
    public final InterfaceC15709d0 trySplit() {
        return (InterfaceC15676a0) super.trySplit();
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j10;
        Objects.requireNonNull(longConsumer);
        boolean zM17480a = m17480a();
        if (zM17480a) {
            C15859W2 c15859w2 = (C15859W2) this.f49303h;
            long j11 = this.f49302g;
            int iM17436u = c15859w2.m17436u(j11);
            if (c15859w2.f49250c == 0 && iM17436u == 0) {
                j10 = ((long[]) c15859w2.f49213e)[(int) j11];
            } else {
                j10 = ((long[][]) c15859w2.f49214f)[iM17436u][(int) (j11 - c15859w2.f49251d[iM17436u])];
            }
            longConsumer.accept(j10);
        }
        return zM17480a;
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.f49303h == null && !this.f49304i) {
            Objects.requireNonNull(longConsumer);
            m17481c();
            Objects.requireNonNull(longConsumer);
            C15990t3 c15990t3 = new C15990t3(longConsumer, 1);
            this.f49297b.m17453U(this.f49299d, c15990t3);
            this.f49304i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }
}
