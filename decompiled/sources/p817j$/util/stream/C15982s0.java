package p817j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongPredicate;
import p817j$.com.android.tools.p818r8.AbstractC15529a;

/* JADX INFO: renamed from: j$.util.stream.s0 */
/* JADX INFO: loaded from: classes4.dex */
final class C15982s0 extends AbstractC15992u0 implements InterfaceC15957n2 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo17362j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC15529a.m16739c(this, longConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15957n2
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo17362j(Long l4) {
        AbstractC16012y0.m17559i(this, l4);
    }

    @Override // p817j$.util.stream.AbstractC15992u0, p817j$.util.stream.InterfaceC15963o2, p817j$.util.stream.InterfaceC15957n2, java.util.function.LongConsumer
    public final void accept(long j10) {
        if (this.f49410a) {
            return;
        }
        LongPredicate longPredicate = null;
        longPredicate.test(j10);
        throw null;
    }
}
