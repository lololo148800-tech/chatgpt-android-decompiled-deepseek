package p817j$.util.stream;

import java.util.function.LongConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.O */
/* JADX INFO: loaded from: classes4.dex */
final class C15817O extends AbstractC15827Q implements InterfaceC15957n2 {

    /* JADX INFO: renamed from: b */
    final LongConsumer f49134b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m17405p(Object obj) {
        mo17362j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC15529a.m16739c(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // p817j$.util.stream.InterfaceC15957n2
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo17362j(Long l4) {
        AbstractC16012y0.m17559i(this, l4);
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

    C15817O(LongConsumer longConsumer, boolean z6) {
        super(z6);
        this.f49134b = longConsumer;
    }

    @Override // p817j$.util.stream.AbstractC15827Q, p817j$.util.stream.InterfaceC15963o2, p817j$.util.stream.InterfaceC15957n2, java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f49134b.accept(j10);
    }
}
