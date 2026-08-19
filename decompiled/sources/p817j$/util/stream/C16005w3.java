package p817j$.util.stream;

import java.util.function.Consumer;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15672X;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.w3 */
/* JADX INFO: loaded from: classes4.dex */
final class C16005w3 extends AbstractC16015y3 implements InterfaceC15672X {
    @Override // p817j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC15666Q.m17254b(this, consumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC15666Q.m17259g(this, consumer);
    }

    @Override // p817j$.util.stream.AbstractC15751A3
    /* JADX INFO: renamed from: a */
    protected final Spliterator mo17359a(Spliterator spliterator, long j10, long j11, long j12, long j13) {
        return new C16005w3((InterfaceC15672X) spliterator, j10, j11, j12, j13);
    }

    @Override // p817j$.util.stream.AbstractC16015y3
    /* JADX INFO: renamed from: b */
    protected final Object mo17522b() {
        return new C15773F0(1);
    }
}
