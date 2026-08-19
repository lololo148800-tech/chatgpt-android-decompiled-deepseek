package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15672X;
import p817j$.util.InterfaceC15709d0;
import p817j$.util.Objects;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.s3 */
/* JADX INFO: loaded from: classes4.dex */
final class C15985s3 extends AbstractC15916g3 implements InterfaceC15672X {
    @Override // p817j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC15666Q.m17254b(this, consumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC15666Q.m17259g(this, consumer);
    }

    @Override // p817j$.util.stream.AbstractC15916g3
    /* JADX INFO: renamed from: e */
    final AbstractC15916g3 mo17402e(Spliterator spliterator) {
        return new C15985s3(this.f49297b, spliterator, this.f49296a);
    }

    @Override // p817j$.util.stream.AbstractC15916g3
    /* JADX INFO: renamed from: d */
    final void mo17401d() {
        C15849U2 c15849u2 = new C15849U2();
        this.f49303h = c15849u2;
        Objects.requireNonNull(c15849u2);
        this.f49300e = this.f49297b.m17454V(new C15980r3(c15849u2, 0));
        this.f49301f = new C15800K2(2, this);
    }

    @Override // p817j$.util.stream.AbstractC15916g3, p817j$.util.Spliterator
    public final Spliterator trySplit() {
        return (InterfaceC15672X) super.trySplit();
    }

    @Override // p817j$.util.stream.AbstractC15916g3, p817j$.util.Spliterator
    public final InterfaceC15672X trySplit() {
        return (InterfaceC15672X) super.trySplit();
    }

    @Override // p817j$.util.stream.AbstractC15916g3, p817j$.util.Spliterator
    public final InterfaceC15709d0 trySplit() {
        return (InterfaceC15672X) super.trySplit();
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i10;
        Objects.requireNonNull(intConsumer);
        boolean zM17480a = m17480a();
        if (zM17480a) {
            C15849U2 c15849u2 = (C15849U2) this.f49303h;
            long j10 = this.f49302g;
            int iM17436u = c15849u2.m17436u(j10);
            if (c15849u2.f49250c == 0 && iM17436u == 0) {
                i10 = ((int[]) c15849u2.f49213e)[(int) j10];
            } else {
                i10 = ((int[][]) c15849u2.f49214f)[iM17436u][(int) (j10 - c15849u2.f49251d[iM17436u])];
            }
            intConsumer.accept(i10);
        }
        return zM17480a;
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.f49303h == null && !this.f49304i) {
            Objects.requireNonNull(intConsumer);
            m17481c();
            Objects.requireNonNull(intConsumer);
            C15980r3 c15980r3 = new C15980r3(intConsumer, 1);
            this.f49297b.m17453U(this.f49299d, c15980r3);
            this.f49304i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }
}
