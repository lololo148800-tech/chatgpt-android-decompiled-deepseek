package p817j$.util.stream;

import java.util.function.LongConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;

/* JADX INFO: renamed from: j$.util.stream.Y1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15868Y1 extends AbstractC15879a2 implements InterfaceC15957n2 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m17405p(Object obj) {
        mo17362j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC15529a.m16739c(this, longConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15957n2
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo17362j(Long l4) {
        AbstractC16012y0.m17559i(this, l4);
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

    @Override // p817j$.util.stream.AbstractC15879a2, p817j$.util.stream.InterfaceC15963o2, p817j$.util.stream.InterfaceC15957n2, java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f49224b++;
    }
}
