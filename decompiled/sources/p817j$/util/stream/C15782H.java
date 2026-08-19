package p817j$.util.stream;

import java.util.function.IntConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.C15650A;

/* JADX INFO: renamed from: j$.util.stream.H */
/* JADX INFO: loaded from: classes4.dex */
final class C15782H extends AbstractC15797K implements InterfaceC15951m2 {

    /* JADX INFO: renamed from: c */
    static final C15767E f49074c;

    /* JADX INFO: renamed from: d */
    static final C15767E f49075d;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC15529a.m16738b(this, intConsumer);
    }

    @Override // p817j$.util.stream.AbstractC15797K, p817j$.util.stream.InterfaceC15963o2
    public final void accept(int i10) {
        m17405p(Integer.valueOf(i10));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f49100a) {
            return C15650A.m17231d(((Integer) this.f49101b).intValue());
        }
        return null;
    }

    static {
        EnumC15910f3 enumC15910f3 = EnumC15910f3.INT_VALUE;
        f49074c = new C15767E(true, enumC15910f3, C15650A.m17230a(), new C15936k(25), new C15772F(1));
        f49075d = new C15767E(false, enumC15910f3, C15650A.m17230a(), new C15936k(25), new C15772F(1));
    }
}
