package p817j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.N1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15814N1 extends AbstractC15853V1 implements InterfaceC15848U1 {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Supplier f49129b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ BiConsumer f49130c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ BiConsumer f49131d;

    @Override // p817j$.util.stream.InterfaceC15963o2
    public final /* synthetic */ void accept(double d10) {
        AbstractC16012y0.m17549a();
        throw null;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    public final /* synthetic */ void accept(int i10) {
        AbstractC16012y0.m17561k();
        throw null;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2, p817j$.util.stream.InterfaceC15957n2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j10) {
        AbstractC16012y0.m17562l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo17363k() {
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean mo17358n() {
        return false;
    }

    @Override // p817j$.util.stream.InterfaceC15848U1
    /* JADX INFO: renamed from: g */
    public final void mo17361g(InterfaceC15848U1 interfaceC15848U1) {
        this.f49131d.accept(this.f49196a, ((C15814N1) interfaceC15848U1).f49196a);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        this.f49196a = this.f49129b.get();
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m17405p(Object obj) {
        this.f49130c.accept(this.f49196a, obj);
    }

    C15814N1(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.f49129b = supplier;
        this.f49130c = biConsumer;
        this.f49131d = biConsumer2;
    }
}
