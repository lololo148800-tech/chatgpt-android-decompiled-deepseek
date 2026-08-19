package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15669U;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.B3 */
/* JADX INFO: loaded from: classes4.dex */
final class C15756B3 extends AbstractC15771E3 implements InterfaceC15669U, DoubleConsumer {

    /* JADX INFO: renamed from: f */
    double f49038f;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC15529a.m16737a(this, doubleConsumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC15666Q.m17253a(this, consumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC15666Q.m17258f(this, consumer);
    }

    @Override // p817j$.util.stream.AbstractC15786H3
    /* JADX INFO: renamed from: c */
    protected final Spliterator mo17365c(Spliterator spliterator) {
        return new C15756B3((InterfaceC15669U) spliterator, this);
    }

    @Override // p817j$.util.stream.AbstractC15771E3
    /* JADX INFO: renamed from: e */
    protected final void mo17366e(Object obj) {
        ((DoubleConsumer) obj).accept(this.f49038f);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f49038f = d10;
    }

    @Override // p817j$.util.stream.AbstractC15771E3
    /* JADX INFO: renamed from: h */
    protected final AbstractC15940k3 mo17367h(int i10) {
        return new C15922h3(i10);
    }
}
