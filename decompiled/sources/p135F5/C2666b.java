package p135F5;

/* JADX INFO: renamed from: F5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2666b implements AutoCloseable {

    /* JADX INFO: renamed from: Y */
    public final C2665a f8185Y;

    /* JADX INFO: renamed from: Z */
    public boolean f8186Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2669e f8187o0;

    public C2666b(C2669e c2669e, C2665a c2665a) {
        this.f8187o0 = c2669e;
        this.f8185Y = c2665a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f8186Z) {
            return;
        }
        this.f8186Z = true;
        C2669e c2669e = this.f8187o0;
        synchronized (c2669e.f8200t0) {
            C2665a c2665a = this.f8185Y;
            int i10 = c2665a.f8183h - 1;
            c2665a.f8183h = i10;
            if (i10 == 0 && c2665a.f8181f) {
                c2669e.m3647W(c2665a);
            }
        }
    }
}
