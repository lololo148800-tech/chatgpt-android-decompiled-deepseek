package p817j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import p817j$.com.android.tools.p818r8.AbstractC15529a;

/* JADX INFO: renamed from: j$.util.stream.r0 */
/* JADX INFO: loaded from: classes4.dex */
final class C15977r0 extends AbstractC15992u0 implements InterfaceC15951m2 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo17413m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC15529a.m16738b(this, intConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15951m2
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void mo17413m(Integer num) {
        AbstractC16012y0.m17557g(this, num);
    }

    @Override // p817j$.util.stream.AbstractC15992u0, p817j$.util.stream.InterfaceC15963o2
    public final void accept(int i10) {
        if (this.f49410a) {
            return;
        }
        IntPredicate intPredicate = null;
        intPredicate.test(i10);
        throw null;
    }
}
