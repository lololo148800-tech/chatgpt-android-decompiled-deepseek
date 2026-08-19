package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.H1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15784H1 extends AbstractC15853V1 implements InterfaceC15848U1, InterfaceC15945l2 {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Supplier f49077b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ObjDoubleConsumer f49078c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C15971q f49079d;

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

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m17405p(Object obj) {
        mo17372p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC15529a.m16737a(this, doubleConsumer);
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

    @Override // p817j$.util.stream.InterfaceC15945l2
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void mo17372p(Double d10) {
        AbstractC16012y0.m17554e(this, d10);
    }

    @Override // p817j$.util.stream.InterfaceC15848U1
    /* JADX INFO: renamed from: g */
    public final void mo17361g(InterfaceC15848U1 interfaceC15848U1) {
        this.f49196a = this.f49079d.apply(this.f49196a, ((C15784H1) interfaceC15848U1).f49196a);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        this.f49196a = this.f49077b.get();
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    public final void accept(double d10) {
        this.f49078c.accept(this.f49196a, d10);
    }

    C15784H1(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, C15971q c15971q) {
        this.f49077b = supplier;
        this.f49078c = objDoubleConsumer;
        this.f49079d = c15971q;
    }
}
