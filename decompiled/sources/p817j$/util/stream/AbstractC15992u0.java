package p817j$.util.stream;

import java.util.function.Consumer;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.u0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15992u0 implements InterfaceC15963o2 {

    /* JADX INFO: renamed from: a */
    boolean f49410a;

    /* JADX INFO: renamed from: b */
    boolean f49411b;

    @Override // p817j$.util.stream.InterfaceC15963o2
    public /* synthetic */ void accept(double d10) {
        AbstractC16012y0.m17549a();
        throw null;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    public /* synthetic */ void accept(int i10) {
        AbstractC16012y0.m17561k();
        throw null;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2, p817j$.util.stream.InterfaceC15957n2, java.util.function.LongConsumer
    public /* synthetic */ void accept(long j10) {
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
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void mo17364l(long j10) {
    }

    AbstractC15992u0(EnumC15997v0 enumC15997v0) {
        this.f49411b = !enumC15997v0.f49418b;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final boolean mo17358n() {
        return this.f49410a;
    }
}
