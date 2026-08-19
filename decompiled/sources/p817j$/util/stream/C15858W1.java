package p817j$.util.stream;

import java.util.function.DoubleConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;

/* JADX INFO: renamed from: j$.util.stream.W1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15858W1 extends AbstractC15879a2 implements InterfaceC15945l2 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m17405p(Object obj) {
        mo17372p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC15529a.m16737a(this, doubleConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15945l2
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void mo17372p(Double d10) {
        AbstractC16012y0.m17554e(this, d10);
    }

    @Override // p817j$.util.stream.AbstractC15853V1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f49224b);
    }

    @Override // p817j$.util.stream.InterfaceC15848U1
    /* JADX INFO: renamed from: g */
    public final void mo17361g(InterfaceC15848U1 interfaceC15848U1) {
        this.f49224b += ((AbstractC15879a2) interfaceC15848U1).f49224b;
    }

    @Override // p817j$.util.stream.AbstractC15879a2, p817j$.util.stream.InterfaceC15963o2
    public final void accept(double d10) {
        this.f49224b++;
    }
}
