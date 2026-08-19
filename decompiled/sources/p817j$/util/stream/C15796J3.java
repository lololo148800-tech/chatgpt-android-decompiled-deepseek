package p817j$.util.stream;

import java.util.function.Consumer;
import p817j$.util.Objects;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.J3 */
/* JADX INFO: loaded from: classes4.dex */
final class C15796J3 extends AbstractC15916g3 {
    @Override // p817j$.util.stream.AbstractC15916g3
    /* JADX INFO: renamed from: e */
    final AbstractC15916g3 mo17402e(Spliterator spliterator) {
        return new C15796J3(this.f49297b, spliterator, this.f49296a);
    }

    @Override // p817j$.util.stream.AbstractC15916g3
    /* JADX INFO: renamed from: d */
    final void mo17401d() {
        C15874Z2 c15874z2 = new C15874Z2();
        this.f49303h = c15874z2;
        Objects.requireNonNull(c15874z2);
        this.f49300e = this.f49297b.m17454V(new C15791I3(c15874z2, 0));
        this.f49301f = new C15800K2(4, this);
    }

    @Override // p817j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean zM17480a = m17480a();
        if (zM17480a) {
            C15874Z2 c15874z2 = (C15874Z2) this.f49303h;
            long j10 = this.f49302g;
            if (c15874z2.f49250c != 0) {
                if (j10 >= c15874z2.count()) {
                    throw new IndexOutOfBoundsException(Long.toString(j10));
                }
                for (int i10 = 0; i10 <= c15874z2.f49250c; i10++) {
                    long j11 = c15874z2.f49251d[i10];
                    Object[] objArr = c15874z2.f49220f[i10];
                    if (j10 < ((long) objArr.length) + j11) {
                        obj = objArr[(int) (j10 - j11)];
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j10));
            }
            if (j10 < c15874z2.f49249b) {
                obj = c15874z2.f49219e[(int) j10];
            } else {
                throw new IndexOutOfBoundsException(Long.toString(j10));
            }
            consumer.m17405p(obj);
        }
        return zM17480a;
    }

    @Override // p817j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f49303h == null && !this.f49304i) {
            Objects.requireNonNull(consumer);
            m17481c();
            Objects.requireNonNull(consumer);
            C15791I3 c15791i3 = new C15791I3(consumer, 1);
            this.f49297b.m17453U(this.f49299d, c15791i3);
            this.f49304i = true;
            return;
        }
        while (tryAdvance(consumer)) {
        }
    }
}
