package p817j$.util.stream;

import java.util.function.DoubleConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.M */
/* JADX INFO: loaded from: classes4.dex */
final class C15807M extends AbstractC15827Q implements InterfaceC15945l2 {

    /* JADX INFO: renamed from: b */
    final DoubleConsumer f49117b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m17405p(Object obj) {
        mo17372p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC15529a.m16737a(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // p817j$.util.stream.InterfaceC15945l2
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void mo17372p(Double d10) {
        AbstractC16012y0.m17554e(this, d10);
    }

    @Override // p817j$.util.stream.InterfaceC15806L3
    /* JADX INFO: renamed from: b */
    public final Object mo17373b(AbstractC15882b abstractC15882b, Spliterator spliterator) {
        abstractC15882b.m17453U(spliterator, this);
        return null;
    }

    @Override // p817j$.util.stream.InterfaceC15806L3
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo17374c(AbstractC15882b abstractC15882b, Spliterator spliterator) {
        m17416e(abstractC15882b, spliterator);
        return null;
    }

    C15807M(DoubleConsumer doubleConsumer, boolean z6) {
        super(z6);
        this.f49117b = doubleConsumer;
    }

    @Override // p817j$.util.stream.AbstractC15827Q, p817j$.util.stream.InterfaceC15963o2
    public final void accept(double d10) {
        this.f49117b.accept(d10);
    }
}
