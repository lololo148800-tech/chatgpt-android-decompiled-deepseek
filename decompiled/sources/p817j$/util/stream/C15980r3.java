package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.r3 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15980r3 implements InterfaceC15951m2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49394a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IntConsumer f49395b;

    public /* synthetic */ C15980r3(IntConsumer intConsumer, int i10) {
        this.f49394a = i10;
        this.f49395b = intConsumer;
    }

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ void m17511b(long j10) {
    }

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ void m17512c(long j10) {
    }

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ void m17513d() {
    }

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ void m17514e() {
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    public final /* synthetic */ void accept(double d10) {
        switch (this.f49394a) {
            case 0:
                AbstractC16012y0.m17549a();
                throw null;
            default:
                AbstractC16012y0.m17549a();
                throw null;
        }
    }

    @Override // p817j$.util.stream.InterfaceC15951m2, p817j$.util.stream.InterfaceC15963o2
    public final void accept(int i10) {
        switch (this.f49394a) {
            case 0:
                ((C15849U2) this.f49395b).accept(i10);
                break;
            default:
                this.f49395b.accept(i10);
                break;
        }
    }

    @Override // p817j$.util.stream.InterfaceC15963o2, p817j$.util.stream.InterfaceC15957n2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j10) {
        switch (this.f49394a) {
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
        switch (this.f49394a) {
            case 0:
                mo17413m((Integer) obj);
                break;
            default:
                mo17413m((Integer) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f49394a) {
            case 0:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f49394a) {
            case 0:
                break;
        }
        return AbstractC15529a.m16738b(this, intConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo17363k() {
        int i10 = this.f49394a;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void mo17364l(long j10) {
        int i10 = this.f49394a;
    }

    @Override // p817j$.util.stream.InterfaceC15951m2
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void mo17413m(Integer num) {
        switch (this.f49394a) {
            case 0:
                AbstractC16012y0.m17557g(this, num);
                break;
            default:
                AbstractC16012y0.m17557g(this, num);
                break;
        }
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean mo17358n() {
        switch (this.f49394a) {
        }
        return false;
    }
}
