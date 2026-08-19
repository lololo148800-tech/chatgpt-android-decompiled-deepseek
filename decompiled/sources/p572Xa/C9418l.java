package p572Xa;

/* JADX INFO: renamed from: Xa.l */
/* JADX INFO: loaded from: classes.dex */
public final class C9418l implements InterfaceC9420n {

    /* JADX INFO: renamed from: o0 */
    public static final Object f28398o0 = new Object();

    /* JADX INFO: renamed from: Y */
    public volatile InterfaceC9419m f28399Y;

    /* JADX INFO: renamed from: Z */
    public volatile Object f28400Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static C9418l m9995a(InterfaceC9419m interfaceC9419m) {
        if (interfaceC9419m instanceof C9418l) {
            return (C9418l) interfaceC9419m;
        }
        C9418l c9418l = new C9418l();
        c9418l.f28400Z = f28398o0;
        c9418l.f28399Y = interfaceC9419m;
        return c9418l;
    }

    @Override // p572Xa.InterfaceC9420n
    /* JADX INFO: renamed from: d */
    public final Object mo3447d() {
        Object objMo3447d = this.f28400Z;
        Object obj = f28398o0;
        if (objMo3447d == obj) {
            synchronized (this) {
                try {
                    objMo3447d = this.f28400Z;
                    if (objMo3447d == obj) {
                        objMo3447d = this.f28399Y.mo3447d();
                        Object obj2 = this.f28400Z;
                        if (obj2 != obj && obj2 != objMo3447d) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objMo3447d + ". This is likely due to a circular dependency.");
                        }
                        this.f28400Z = objMo3447d;
                        this.f28399Y = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return objMo3447d;
    }
}
