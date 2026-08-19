package p817j$.util.stream;

import java.util.function.IntConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.N */
/* JADX INFO: loaded from: classes4.dex */
final class C15812N extends AbstractC15827Q implements InterfaceC15951m2 {

    /* JADX INFO: renamed from: b */
    final IntConsumer f49126b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m17405p(Object obj) {
        mo17413m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC15529a.m16738b(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // p817j$.util.stream.InterfaceC15951m2
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void mo17413m(Integer num) {
        AbstractC16012y0.m17557g(this, num);
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

    C15812N(IntConsumer intConsumer, boolean z6) {
        super(z6);
        this.f49126b = intConsumer;
    }

    @Override // p817j$.util.stream.AbstractC15827Q, p817j$.util.stream.InterfaceC15963o2
    public final void accept(int i10) {
        this.f49126b.accept(i10);
    }
}
