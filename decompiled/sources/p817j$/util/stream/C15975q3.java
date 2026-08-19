package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15669U;
import p817j$.util.InterfaceC15709d0;
import p817j$.util.Objects;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.q3 */
/* JADX INFO: loaded from: classes4.dex */
final class C15975q3 extends AbstractC15916g3 implements InterfaceC15669U {
    @Override // p817j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC15666Q.m17253a(this, consumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC15666Q.m17258f(this, consumer);
    }

    @Override // p817j$.util.stream.AbstractC15916g3
    /* JADX INFO: renamed from: e */
    final AbstractC15916g3 mo17402e(Spliterator spliterator) {
        return new C15975q3(this.f49297b, spliterator, this.f49296a);
    }

    @Override // p817j$.util.stream.AbstractC15916g3
    /* JADX INFO: renamed from: d */
    final void mo17401d() {
        C15839S2 c15839s2 = new C15839S2();
        this.f49303h = c15839s2;
        Objects.requireNonNull(c15839s2);
        this.f49300e = this.f49297b.m17454V(new C15970p3(c15839s2, 0));
        this.f49301f = new C15800K2(1, this);
    }

    @Override // p817j$.util.stream.AbstractC15916g3, p817j$.util.Spliterator
    public final Spliterator trySplit() {
        return (InterfaceC15669U) super.trySplit();
    }

    @Override // p817j$.util.stream.AbstractC15916g3, p817j$.util.Spliterator
    public final InterfaceC15669U trySplit() {
        return (InterfaceC15669U) super.trySplit();
    }

    @Override // p817j$.util.stream.AbstractC15916g3, p817j$.util.Spliterator
    public final InterfaceC15709d0 trySplit() {
        return (InterfaceC15669U) super.trySplit();
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        double d10;
        Objects.requireNonNull(doubleConsumer);
        boolean zM17480a = m17480a();
        if (zM17480a) {
            C15839S2 c15839s2 = (C15839S2) this.f49303h;
            long j10 = this.f49302g;
            int iM17436u = c15839s2.m17436u(j10);
            if (c15839s2.f49250c == 0 && iM17436u == 0) {
                d10 = ((double[]) c15839s2.f49213e)[(int) j10];
            } else {
                d10 = ((double[][]) c15839s2.f49214f)[iM17436u][(int) (j10 - c15839s2.f49251d[iM17436u])];
            }
            doubleConsumer.accept(d10);
        }
        return zM17480a;
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.f49303h == null && !this.f49304i) {
            Objects.requireNonNull(doubleConsumer);
            m17481c();
            Objects.requireNonNull(doubleConsumer);
            C15970p3 c15970p3 = new C15970p3(doubleConsumer, 1);
            this.f49297b.m17453U(this.f49299d, c15970p3);
            this.f49304i = true;
            return;
        }
        while (tryAdvance(doubleConsumer)) {
        }
    }
}
