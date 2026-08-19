package p817j$.util.stream;

import java.util.function.LongConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.C15651B;

/* JADX INFO: renamed from: j$.util.stream.I */
/* JADX INFO: loaded from: classes4.dex */
final class C15787I extends AbstractC15797K implements InterfaceC15957n2 {

    /* JADX INFO: renamed from: c */
    static final C15767E f49085c;

    /* JADX INFO: renamed from: d */
    static final C15767E f49086d;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC15529a.m16739c(this, longConsumer);
    }

    @Override // p817j$.util.stream.AbstractC15797K, p817j$.util.stream.InterfaceC15963o2, p817j$.util.stream.InterfaceC15957n2, java.util.function.LongConsumer
    public final void accept(long j10) {
        m17405p(Long.valueOf(j10));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f49100a) {
            return C15651B.m17235d(((Long) this.f49101b).longValue());
        }
        return null;
    }

    static {
        EnumC15910f3 enumC15910f3 = EnumC15910f3.LONG_VALUE;
        f49085c = new C15767E(true, enumC15910f3, C15651B.m17234a(), new C15936k(26), new C15772F(2));
        f49086d = new C15767E(false, enumC15910f3, C15651B.m17234a(), new C15936k(26), new C15772F(2));
    }
}
