package p248Jk;

import p223Ik.InterfaceC3740a;

/* JADX INFO: renamed from: Jk.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C4474e implements InterfaceC4473d, InterfaceC3740a {

    /* JADX INFO: renamed from: a */
    public final Object f14617a;

    public C4474e(Object obj) {
        this.f14617a = obj;
    }

    /* JADX INFO: renamed from: a */
    public static C4474e m5206a(Object obj) {
        if (obj != null) {
            return new C4474e(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        return this.f14617a;
    }
}
