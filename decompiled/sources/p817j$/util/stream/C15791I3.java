package p817j$.util.stream;

import java.util.function.Consumer;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.I3 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15791I3 implements InterfaceC15963o2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49089a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f49090b;

    public /* synthetic */ C15791I3(Consumer consumer, int i10) {
        this.f49089a = i10;
        this.f49090b = consumer;
    }

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ void m17382b(long j10) {
    }

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ void m17383c(long j10) {
    }

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ void m17384d() {
    }

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ void m17385e() {
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    public final /* synthetic */ void accept(double d10) {
        switch (this.f49089a) {
            case 0:
                AbstractC16012y0.m17549a();
                throw null;
            default:
                AbstractC16012y0.m17549a();
                throw null;
        }
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    public final /* synthetic */ void accept(int i10) {
        switch (this.f49089a) {
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
        switch (this.f49089a) {
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
    public final void m17405p(Object obj) {
        switch (this.f49089a) {
            case 0:
                ((C15874Z2) this.f49090b).m17405p(obj);
                break;
            default:
                this.f49090b.m17405p(obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f49089a) {
            case 0:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo17363k() {
        int i10 = this.f49089a;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void mo17364l(long j10) {
        int i10 = this.f49089a;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean mo17358n() {
        switch (this.f49089a) {
        }
        return false;
    }
}
