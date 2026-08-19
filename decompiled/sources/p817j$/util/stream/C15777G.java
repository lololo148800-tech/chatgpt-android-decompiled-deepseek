package p817j$.util.stream;

import java.util.function.DoubleConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.C16028z;

/* JADX INFO: renamed from: j$.util.stream.G */
/* JADX INFO: loaded from: classes4.dex */
final class C15777G extends AbstractC15797K implements InterfaceC15945l2 {

    /* JADX INFO: renamed from: c */
    static final C15767E f49070c;

    /* JADX INFO: renamed from: d */
    static final C15767E f49071d;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC15529a.m16737a(this, doubleConsumer);
    }

    @Override // p817j$.util.stream.AbstractC15797K, p817j$.util.stream.InterfaceC15963o2
    public final void accept(double d10) {
        m17405p(Double.valueOf(d10));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f49100a) {
            return C16028z.m17585d(((Double) this.f49101b).doubleValue());
        }
        return null;
    }

    static {
        EnumC15910f3 enumC15910f3 = EnumC15910f3.DOUBLE_VALUE;
        f49070c = new C15767E(true, enumC15910f3, C16028z.m17584a(), new C15936k(24), new C15772F(0));
        f49071d = new C15767E(false, enumC15910f3, C16028z.m17584a(), new C15936k(24), new C15772F(0));
    }
}
