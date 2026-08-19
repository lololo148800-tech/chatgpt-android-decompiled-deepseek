package p817j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.e2 */
/* JADX INFO: loaded from: classes4.dex */
final class C15903e2 extends AbstractC15915g2 {
    @Override // p817j$.util.stream.InterfaceC15918h
    public final InterfaceC15918h unordered() {
        return !m17450K() ? this : new C15897d2(this, EnumC15904e3.f49277r, 1);
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: P */
    final boolean mo17440P() {
        throw new UnsupportedOperationException();
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: Q */
    final InterfaceC15963o2 mo17378Q(int i10, InterfaceC15963o2 interfaceC15963o2) {
        throw new UnsupportedOperationException();
    }

    @Override // p817j$.util.stream.AbstractC15915g2, p817j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (!isParallel()) {
            m17452S().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // p817j$.util.stream.AbstractC15915g2, p817j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (!isParallel()) {
            m17452S().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }
}
