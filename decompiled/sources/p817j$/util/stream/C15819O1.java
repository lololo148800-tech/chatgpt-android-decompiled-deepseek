package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.O1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15819O1 implements InterfaceC15848U1, InterfaceC15951m2 {

    /* JADX INFO: renamed from: a */
    private int f49136a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f49137b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ IntBinaryOperator f49138c;

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

    C15819O1(int i10, IntBinaryOperator intBinaryOperator) {
        this.f49137b = i10;
        this.f49138c = intBinaryOperator;
    }

    @Override // p817j$.util.stream.InterfaceC15848U1
    /* JADX INFO: renamed from: g */
    public final void mo17361g(InterfaceC15848U1 interfaceC15848U1) {
        accept(((C15819O1) interfaceC15848U1).f49136a);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        this.f49136a = this.f49137b;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    public final void accept(int i10) {
        this.f49136a = this.f49138c.applyAsInt(this.f49136a, i10);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Integer.valueOf(this.f49136a);
    }
}
