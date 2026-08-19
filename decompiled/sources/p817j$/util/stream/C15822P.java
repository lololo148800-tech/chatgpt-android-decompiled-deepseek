package p817j$.util.stream;

import java.util.function.Consumer;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.P */
/* JADX INFO: loaded from: classes4.dex */
final class C15822P extends AbstractC15827Q {

    /* JADX INFO: renamed from: b */
    final Consumer f49142b;

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
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

    C15822P(Consumer consumer, boolean z6) {
        super(z6);
        this.f49142b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f49142b.accept(obj);
    }
}
