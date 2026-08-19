package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.C15650A;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.Q1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15829Q1 implements InterfaceC15848U1, InterfaceC15951m2 {

    /* JADX INFO: renamed from: a */
    private boolean f49151a;

    /* JADX INFO: renamed from: b */
    private int f49152b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ IntBinaryOperator f49153c;

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

    C15829Q1(IntBinaryOperator intBinaryOperator) {
        this.f49153c = intBinaryOperator;
    }

    @Override // p817j$.util.stream.InterfaceC15848U1
    /* JADX INFO: renamed from: g */
    public final void mo17361g(InterfaceC15848U1 interfaceC15848U1) {
        C15829Q1 c15829q1 = (C15829Q1) interfaceC15848U1;
        if (c15829q1.f49151a) {
            return;
        }
        accept(c15829q1.f49152b);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        this.f49151a = true;
        this.f49152b = 0;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    public final void accept(int i10) {
        if (this.f49151a) {
            this.f49151a = false;
            this.f49152b = i10;
        } else {
            this.f49152b = this.f49153c.applyAsInt(this.f49152b, i10);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f49151a ? C15650A.m17230a() : C15650A.m17231d(this.f49152b);
    }
}
