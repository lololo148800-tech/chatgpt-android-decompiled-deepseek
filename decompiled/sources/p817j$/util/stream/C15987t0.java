package p817j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
import p817j$.com.android.tools.p818r8.AbstractC15529a;

/* JADX INFO: renamed from: j$.util.stream.t0 */
/* JADX INFO: loaded from: classes4.dex */
final class C15987t0 extends AbstractC15992u0 implements InterfaceC15945l2 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo17372p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC15529a.m16737a(this, doubleConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15945l2
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void mo17372p(Double d10) {
        AbstractC16012y0.m17554e(this, d10);
    }

    @Override // p817j$.util.stream.AbstractC15992u0, p817j$.util.stream.InterfaceC15963o2
    public final void accept(double d10) {
        if (this.f49410a) {
            return;
        }
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d10);
        throw null;
    }
}
