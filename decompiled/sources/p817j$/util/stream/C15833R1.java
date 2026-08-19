package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.R1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15833R1 extends AbstractC15853V1 implements InterfaceC15848U1, InterfaceC15951m2 {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Supplier f49167b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ObjIntConsumer f49168c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C15971q f49169d;

    @Override // p817j$.util.stream.InterfaceC15963o2
    public final /* synthetic */ void accept(double d10) {
        AbstractC16012y0.m17549a();
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
        mo17413m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC15529a.m16738b(this, intConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo17363k() {
    }

    @Override // p817j$.util.stream.InterfaceC15951m2
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void mo17413m(Integer num) {
        AbstractC16012y0.m17557g(this, num);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean mo17358n() {
        return false;
    }

    @Override // p817j$.util.stream.InterfaceC15848U1
    /* JADX INFO: renamed from: g */
    public final void mo17361g(InterfaceC15848U1 interfaceC15848U1) {
        this.f49196a = this.f49169d.apply(this.f49196a, ((C15833R1) interfaceC15848U1).f49196a);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        this.f49196a = this.f49167b.get();
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    public final void accept(int i10) {
        this.f49168c.accept(this.f49196a, i10);
    }

    C15833R1(Supplier supplier, ObjIntConsumer objIntConsumer, C15971q c15971q) {
        this.f49167b = supplier;
        this.f49168c = objIntConsumer;
        this.f49169d = c15971q;
    }
}
