package p259K5;

/* JADX INFO: renamed from: K5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C4541c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4545g f14844a;

    /* JADX INFO: renamed from: b */
    public final C4544f f14845b;

    /* JADX INFO: renamed from: c */
    public final Object f14846c = new Object();

    public C4541c(InterfaceC4545g interfaceC4545g, C4544f c4544f) {
        this.f14844a = interfaceC4545g;
        this.f14845b = c4544f;
    }

    /* JADX INFO: renamed from: a */
    public final void m5303a() {
        synchronized (this.f14846c) {
            this.f14844a.clear();
            C4544f c4544f = this.f14845b;
            c4544f.f14854b = 0;
            c4544f.f14853a.clear();
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m5304b() {
        long jMo5312b;
        synchronized (this.f14846c) {
            jMo5312b = this.f14844a.mo5312b();
        }
        return jMo5312b;
    }

    /* JADX INFO: renamed from: c */
    public final void m5305c(C4539a c4539a) {
        synchronized (this.f14846c) {
            this.f14844a.mo5315n(c4539a);
            if (this.f14845b.f14853a.remove(c4539a) != null) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5306d(long j10) {
        synchronized (this.f14846c) {
            this.f14844a.mo5313i(j10);
        }
    }
}
