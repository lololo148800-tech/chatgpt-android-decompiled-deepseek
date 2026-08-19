package p610Z1;

/* JADX INFO: renamed from: Z1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C10142i {

    /* JADX INFO: renamed from: a */
    public Object f30064a;

    /* JADX INFO: renamed from: b */
    public C10145l f30065b;

    /* JADX INFO: renamed from: c */
    public C10147n f30066c;

    /* JADX INFO: renamed from: d */
    public boolean f30067d;

    /* JADX INFO: renamed from: a */
    public final boolean m10747a(Object obj) {
        this.f30067d = true;
        C10145l c10145l = this.f30065b;
        boolean z6 = c10145l != null && c10145l.f30070Z.m10745k(obj);
        if (z6) {
            this.f30064a = null;
            this.f30065b = null;
            this.f30066c = null;
        }
        return z6;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10748b(Throwable th2) {
        this.f30067d = true;
        C10145l c10145l = this.f30065b;
        boolean z6 = c10145l != null && c10145l.f30070Z.mo10746l(th2);
        if (z6) {
            this.f30064a = null;
            this.f30065b = null;
            this.f30066c = null;
        }
        return z6;
    }

    public final void finalize() {
        C10147n c10147n;
        C10145l c10145l = this.f30065b;
        if (c10145l != null) {
            C10144k c10144k = c10145l.f30070Z;
            if (!c10144k.isDone()) {
                c10144k.mo10746l(new C10135b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f30064a, 1));
            }
        }
        if (this.f30067d || (c10147n = this.f30066c) == null) {
            return;
        }
        c10147n.m10745k(null);
    }
}
