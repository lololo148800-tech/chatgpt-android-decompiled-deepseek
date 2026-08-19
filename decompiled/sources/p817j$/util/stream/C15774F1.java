package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.C16028z;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.F1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15774F1 implements InterfaceC15848U1, InterfaceC15945l2 {

    /* JADX INFO: renamed from: a */
    private boolean f49065a;

    /* JADX INFO: renamed from: b */
    private double f49066b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ DoubleBinaryOperator f49067c;

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

    C15774F1(DoubleBinaryOperator doubleBinaryOperator) {
        this.f49067c = doubleBinaryOperator;
    }

    @Override // p817j$.util.stream.InterfaceC15848U1
    /* JADX INFO: renamed from: g */
    public final void mo17361g(InterfaceC15848U1 interfaceC15848U1) {
        C15774F1 c15774f1 = (C15774F1) interfaceC15848U1;
        if (c15774f1.f49065a) {
            return;
        }
        accept(c15774f1.f49066b);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        this.f49065a = true;
        this.f49066b = 0.0d;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    public final void accept(double d10) {
        if (this.f49065a) {
            this.f49065a = false;
            this.f49066b = d10;
        } else {
            this.f49066b = this.f49067c.applyAsDouble(this.f49066b, d10);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f49065a ? C16028z.m17584a() : C16028z.m17585d(this.f49066b);
    }
}
