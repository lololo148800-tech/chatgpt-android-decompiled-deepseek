package p932on;

import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: on.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C18246f {

    /* JADX INFO: renamed from: a */
    public final Object f58132a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1426a f58133b;

    public C18246f(Object obj, InterfaceC1426a interfaceC1426a) {
        this.f58132a = obj;
        this.f58133b = interfaceC1426a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C18246f.class == obj.getClass() && this.f58132a.equals(((C18246f) obj).f58132a);
    }

    public final int hashCode() {
        return this.f58132a.hashCode();
    }
}
