package p305M3;

import android.os.SystemClock;

/* JADX INFO: renamed from: M3.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5286f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5287g f17409a;

    /* JADX INFO: renamed from: a */
    public final void m5825a(int i10) {
        C5287g c5287g = this.f17409a;
        synchronized (c5287g) {
            int i11 = c5287g.f17429m;
            if (i11 == 0 || c5287g.f17420d) {
                if (i11 == i10) {
                    return;
                }
                c5287g.f17429m = i10;
                if (i10 != 1 && i10 != 0 && i10 != 8) {
                    c5287g.f17427k = c5287g.m5827b(i10);
                    c5287g.f17419c.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    c5287g.m5828c(c5287g.f17424h, c5287g.f17422f > 0 ? (int) (jElapsedRealtime - c5287g.f17423g) : 0, c5287g.f17427k);
                    c5287g.f17423g = jElapsedRealtime;
                    c5287g.f17424h = 0L;
                    c5287g.f17426j = 0L;
                    c5287g.f17425i = 0L;
                    C5294n c5294n = c5287g.f17421e;
                    c5294n.f17453b.clear();
                    c5294n.f17455d = -1;
                    c5294n.f17456e = 0;
                    c5294n.f17457f = 0;
                }
            }
        }
    }
}
