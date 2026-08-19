package p999s;

/* JADX INFO: renamed from: s.L0 */
/* JADX INFO: loaded from: classes.dex */
public final class C19305L0 {

    /* JADX INFO: renamed from: a */
    public int f61161a;

    /* JADX INFO: renamed from: b */
    public int f61162b;

    /* JADX INFO: renamed from: c */
    public int f61163c;

    /* JADX INFO: renamed from: d */
    public int f61164d;

    /* JADX INFO: renamed from: e */
    public int f61165e;

    /* JADX INFO: renamed from: f */
    public int f61166f;

    /* JADX INFO: renamed from: g */
    public boolean f61167g;

    /* JADX INFO: renamed from: h */
    public boolean f61168h;

    /* JADX INFO: renamed from: a */
    public final void m20391a(int i10, int i11) {
        this.f61163c = i10;
        this.f61164d = i11;
        this.f61168h = true;
        if (this.f61167g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f61161a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f61162b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f61161a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f61162b = i11;
        }
    }
}
