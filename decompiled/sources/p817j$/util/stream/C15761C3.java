package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15672X;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.C3 */
/* JADX INFO: loaded from: classes4.dex */
final class C15761C3 extends AbstractC15771E3 implements InterfaceC15672X, IntConsumer {

    /* JADX INFO: renamed from: f */
    int f49044f;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC15529a.m16738b(this, intConsumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC15666Q.m17254b(this, consumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC15666Q.m17259g(this, consumer);
    }

    @Override // p817j$.util.stream.AbstractC15786H3
    /* JADX INFO: renamed from: c */
    protected final Spliterator mo17365c(Spliterator spliterator) {
        return new C15761C3((InterfaceC15672X) spliterator, this);
    }

    @Override // p817j$.util.stream.AbstractC15771E3
    /* JADX INFO: renamed from: e */
    protected final void mo17366e(Object obj) {
        ((IntConsumer) obj).accept(this.f49044f);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        this.f49044f = i10;
    }

    @Override // p817j$.util.stream.AbstractC15771E3
    /* JADX INFO: renamed from: h */
    protected final AbstractC15940k3 mo17367h(int i10) {
        return new C15928i3(i10);
    }
}
