package p643a9;

import p876lm.InterfaceC17068a;

/* JADX INFO: renamed from: a9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10526a implements InterfaceC17068a {

    /* JADX INFO: renamed from: c */
    public static final Object f31235c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC10527b f31236a;

    /* JADX INFO: renamed from: b */
    public volatile Object f31237b;

    /* JADX INFO: renamed from: a */
    public static InterfaceC17068a m10976a(InterfaceC10527b interfaceC10527b) {
        if (interfaceC10527b instanceof C10526a) {
            return interfaceC10527b;
        }
        C10526a c10526a = new C10526a();
        c10526a.f31237b = f31235c;
        c10526a.f31236a = interfaceC10527b;
        return c10526a;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f31237b;
        Object obj2 = f31235c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f31237b;
                    if (obj == obj2) {
                        obj = this.f31236a.get();
                        Object obj3 = this.f31237b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f31237b = obj;
                        this.f31236a = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return obj;
    }
}
