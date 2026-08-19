package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.t3 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15990t3 implements InterfaceC15957n2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49407a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LongConsumer f49408b;

    public /* synthetic */ C15990t3(LongConsumer longConsumer, int i10) {
        this.f49407a = i10;
        this.f49408b = longConsumer;
    }

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ void m17516b(long j10) {
    }

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ void m17517c(long j10) {
    }

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ void m17518d() {
    }

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ void m17519e() {
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    public final /* synthetic */ void accept(double d10) {
        switch (this.f49407a) {
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
        switch (this.f49407a) {
            case 0:
                AbstractC16012y0.m17561k();
                throw null;
            default:
                AbstractC16012y0.m17561k();
                throw null;
        }
    }

    @Override // p817j$.util.stream.InterfaceC15957n2, java.util.function.LongConsumer
    public final void accept(long j10) {
        switch (this.f49407a) {
            case 0:
                ((C15859W2) this.f49408b).accept(j10);
                break;
            default:
                this.f49408b.accept(j10);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m17405p(Object obj) {
        switch (this.f49407a) {
            case 0:
                mo17362j((Long) obj);
                break;
            default:
                mo17362j((Long) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f49407a) {
            case 0:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f49407a) {
            case 0:
                break;
        }
        return AbstractC15529a.m16739c(this, longConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15957n2
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo17362j(Long l4) {
        switch (this.f49407a) {
            case 0:
                AbstractC16012y0.m17559i(this, l4);
                break;
            default:
                AbstractC16012y0.m17559i(this, l4);
                break;
        }
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo17363k() {
        int i10 = this.f49407a;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void mo17364l(long j10) {
        int i10 = this.f49407a;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean mo17358n() {
        switch (this.f49407a) {
        }
        return false;
    }
}
