package p248Jk;

/* JADX INFO: renamed from: Jk.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C4471b implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public InterfaceC4478i f14613a;

    /* JADX INFO: renamed from: a */
    public static void m5204a(InterfaceC4478i interfaceC4478i, InterfaceC4478i interfaceC4478i2) {
        C4471b c4471b = (C4471b) interfaceC4478i;
        if (c4471b.f14613a != null) {
            throw new IllegalStateException();
        }
        c4471b.f14613a = interfaceC4478i2;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        InterfaceC4478i interfaceC4478i = this.f14613a;
        if (interfaceC4478i != null) {
            return interfaceC4478i.get();
        }
        throw new IllegalStateException();
    }
}
