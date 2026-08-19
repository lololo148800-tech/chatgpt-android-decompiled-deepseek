package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15676a0;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.D3 */
/* JADX INFO: loaded from: classes4.dex */
final class C15766D3 extends AbstractC15771E3 implements InterfaceC15676a0, LongConsumer {

    /* JADX INFO: renamed from: f */
    long f49053f;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC15529a.m16739c(this, longConsumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC15666Q.m17255c(this, consumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC15666Q.m17260h(this, consumer);
    }

    @Override // p817j$.util.stream.AbstractC15786H3
    /* JADX INFO: renamed from: c */
    protected final Spliterator mo17365c(Spliterator spliterator) {
        return new C15766D3((InterfaceC15676a0) spliterator, this);
    }

    @Override // p817j$.util.stream.AbstractC15771E3
    /* JADX INFO: renamed from: e */
    protected final void mo17366e(Object obj) {
        ((LongConsumer) obj).accept(this.f49053f);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f49053f = j10;
    }

    @Override // p817j$.util.stream.AbstractC15771E3
    /* JADX INFO: renamed from: h */
    protected final AbstractC15940k3 mo17367h(int i10) {
        return new C15934j3(i10);
    }
}
