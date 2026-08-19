package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.p3 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15970p3 implements InterfaceC15945l2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49381a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DoubleConsumer f49382b;

    public /* synthetic */ C15970p3(DoubleConsumer doubleConsumer, int i10) {
        this.f49381a = i10;
        this.f49382b = doubleConsumer;
    }

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ void m17507b(long j10) {
    }

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ void m17508c(long j10) {
    }

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ void m17509d() {
    }

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ void m17510e() {
    }

    @Override // p817j$.util.stream.InterfaceC15945l2, p817j$.util.stream.InterfaceC15963o2
    public final void accept(double d10) {
        switch (this.f49381a) {
            case 0:
                ((C15839S2) this.f49382b).accept(d10);
                break;
            default:
                this.f49382b.accept(d10);
                break;
        }
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    public final /* synthetic */ void accept(int i10) {
        switch (this.f49381a) {
            case 0:
                AbstractC16012y0.m17561k();
                throw null;
            default:
                AbstractC16012y0.m17561k();
                throw null;
        }
    }

    @Override // p817j$.util.stream.InterfaceC15963o2, p817j$.util.stream.InterfaceC15957n2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j10) {
        switch (this.f49381a) {
            case 0:
                AbstractC16012y0.m17562l();
                throw null;
            default:
                AbstractC16012y0.m17562l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m17405p(Object obj) {
        switch (this.f49381a) {
            case 0:
                mo17372p((Double) obj);
                break;
            default:
                mo17372p((Double) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f49381a) {
            case 0:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f49381a) {
            case 0:
                break;
        }
        return AbstractC15529a.m16737a(this, doubleConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo17363k() {
        int i10 = this.f49381a;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void mo17364l(long j10) {
        int i10 = this.f49381a;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean mo17358n() {
        switch (this.f49381a) {
        }
        return false;
    }

    @Override // p817j$.util.stream.InterfaceC15945l2
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void mo17372p(Double d10) {
        switch (this.f49381a) {
            case 0:
                AbstractC16012y0.m17554e(this, d10);
                break;
            default:
                AbstractC16012y0.m17554e(this, d10);
                break;
        }
    }
}
