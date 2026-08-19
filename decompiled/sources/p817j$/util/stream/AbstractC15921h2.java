package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.Objects;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.h2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15921h2 implements InterfaceC15945l2 {

    /* JADX INFO: renamed from: a */
    protected final InterfaceC15963o2 f49307a;

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
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo17372p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC15529a.m16737a(this, doubleConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15945l2
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void mo17372p(Double d10) {
        AbstractC16012y0.m17554e(this, d10);
    }

    public AbstractC15921h2(InterfaceC15963o2 interfaceC15963o2) {
        this.f49307a = (InterfaceC15963o2) Objects.requireNonNull(interfaceC15963o2);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public void mo17364l(long j10) {
        this.f49307a.mo17364l(j10);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public void mo17363k() {
        this.f49307a.mo17363k();
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public boolean mo17358n() {
        return this.f49307a.mo17358n();
    }
}
