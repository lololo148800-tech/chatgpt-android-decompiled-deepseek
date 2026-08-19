package p349O0;

/* JADX INFO: renamed from: O0.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6014l0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC6012k0 f19515a;

    /* JADX INFO: renamed from: b */
    public final boolean f19516b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5959J0 f19517c;

    /* JADX INFO: renamed from: d */
    public final boolean f19518d;

    /* JADX INFO: renamed from: e */
    public final Object f19519e;

    /* JADX INFO: renamed from: f */
    public boolean f19520f = true;

    public C6014l0(AbstractC6012k0 abstractC6012k0, Object obj, boolean z6, InterfaceC5959J0 interfaceC5959J0, boolean z10) {
        this.f19515a = abstractC6012k0;
        this.f19516b = z6;
        this.f19517c = interfaceC5959J0;
        this.f19518d = z10;
        this.f19519e = obj;
    }

    /* JADX INFO: renamed from: a */
    public final Object m6482a() {
        if (this.f19516b) {
            return null;
        }
        Object obj = this.f19519e;
        if (obj != null) {
            return obj;
        }
        C5997d.m6414A("Unexpected form of a provided value");
        throw null;
    }
}
