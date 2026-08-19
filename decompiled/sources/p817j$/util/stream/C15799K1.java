package p817j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import p817j$.util.Optional;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.K1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15799K1 implements InterfaceC15848U1 {

    /* JADX INFO: renamed from: a */
    private boolean f49102a;

    /* JADX INFO: renamed from: b */
    private Object f49103b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ BinaryOperator f49104c;

    @Override // p817j$.util.stream.InterfaceC15963o2
    public final /* synthetic */ void accept(double d10) {
        AbstractC16012y0.m17549a();
        throw null;
    }

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

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
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

    C15799K1(BinaryOperator binaryOperator) {
        this.f49104c = binaryOperator;
    }

    @Override // p817j$.util.stream.InterfaceC15848U1
    /* JADX INFO: renamed from: g */
    public final void mo17361g(InterfaceC15848U1 interfaceC15848U1) {
        C15799K1 c15799k1 = (C15799K1) interfaceC15848U1;
        if (c15799k1.f49102a) {
            return;
        }
        m17405p(c15799k1.f49103b);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        this.f49102a = true;
        this.f49103b = null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m17405p(Object obj) {
        if (this.f49102a) {
            this.f49102a = false;
            this.f49103b = obj;
        } else {
            this.f49103b = this.f49104c.apply(this.f49103b, obj);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f49102a ? Optional.m17249a() : Optional.m17250d(this.f49103b);
    }
}
