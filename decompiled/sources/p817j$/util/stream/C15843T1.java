package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.C15651B;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.T1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15843T1 implements InterfaceC15848U1, InterfaceC15957n2 {

    /* JADX INFO: renamed from: a */
    private boolean f49189a;

    /* JADX INFO: renamed from: b */
    private long f49190b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ LongBinaryOperator f49191c;

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

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m17405p(Object obj) {
        mo17362j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC15529a.m16739c(this, longConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15957n2
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo17362j(Long l4) {
        AbstractC16012y0.m17559i(this, l4);
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

    C15843T1(LongBinaryOperator longBinaryOperator) {
        this.f49191c = longBinaryOperator;
    }

    @Override // p817j$.util.stream.InterfaceC15848U1
    /* JADX INFO: renamed from: g */
    public final void mo17361g(InterfaceC15848U1 interfaceC15848U1) {
        C15843T1 c15843t1 = (C15843T1) interfaceC15848U1;
        if (c15843t1.f49189a) {
            return;
        }
        accept(c15843t1.f49190b);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        this.f49189a = true;
        this.f49190b = 0L;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2, p817j$.util.stream.InterfaceC15957n2, java.util.function.LongConsumer
    public final void accept(long j10) {
        if (this.f49189a) {
            this.f49189a = false;
            this.f49190b = j10;
        } else {
            this.f49190b = this.f49191c.applyAsLong(this.f49190b, j10);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f49189a ? C15651B.m17234a() : C15651B.m17235d(this.f49190b);
    }
}
