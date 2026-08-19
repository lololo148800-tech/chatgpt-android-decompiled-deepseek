package p817j$.util.stream;

import p817j$.util.Optional;

/* JADX INFO: renamed from: j$.util.stream.J */
/* JADX INFO: loaded from: classes4.dex */
final class C15792J extends AbstractC15797K {

    /* JADX INFO: renamed from: c */
    static final C15767E f49093c;

    /* JADX INFO: renamed from: d */
    static final C15767E f49094d;

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f49100a) {
            return Optional.m17250d(this.f49101b);
        }
        return null;
    }

    static {
        EnumC15910f3 enumC15910f3 = EnumC15910f3.REFERENCE;
        f49093c = new C15767E(true, enumC15910f3, Optional.m17249a(), new C15936k(27), new C15772F(3));
        f49094d = new C15767E(false, enumC15910f3, Optional.m17249a(), new C15936k(27), new C15772F(3));
    }
}
