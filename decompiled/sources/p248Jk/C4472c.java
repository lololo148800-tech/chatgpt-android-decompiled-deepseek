package p248Jk;

import p223Ik.InterfaceC3740a;

/* JADX INFO: renamed from: Jk.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4472c implements InterfaceC4478i, InterfaceC3740a {

    /* JADX INFO: renamed from: c */
    public static final Object f14614c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC4478i f14615a;

    /* JADX INFO: renamed from: b */
    public volatile Object f14616b = f14614c;

    public C4472c(InterfaceC4478i interfaceC4478i) {
        this.f14615a = interfaceC4478i;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC4478i m5205a(InterfaceC4478i interfaceC4478i) {
        interfaceC4478i.getClass();
        return interfaceC4478i instanceof C4472c ? interfaceC4478i : new C4472c(interfaceC4478i);
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f14616b;
        Object obj2 = f14614c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f14616b;
                if (obj == obj2) {
                    obj = this.f14615a.get();
                    Object obj3 = this.f14616b;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f14616b = obj;
                    this.f14615a = null;
                }
            }
        }
        return obj;
    }
}
