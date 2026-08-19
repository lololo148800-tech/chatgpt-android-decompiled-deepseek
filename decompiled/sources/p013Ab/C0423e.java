package p013Ab;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p1061vb.C20513d;
import p1125yb.C21404j;

/* JADX INFO: renamed from: Ab.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0423e {

    /* JADX INFO: renamed from: d */
    public static final long f1392d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e */
    public static final long f1393e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a */
    public final C21404j f1394a;

    /* JADX INFO: renamed from: b */
    public long f1395b;

    /* JADX INFO: renamed from: c */
    public int f1396c;

    public C0423e() {
        if (C20513d.f65129Y == null) {
            Pattern pattern = C21404j.f67946c;
            C20513d.f65129Y = new C20513d();
        }
        C20513d c20513d = C20513d.f65129Y;
        if (C21404j.f67947d == null) {
            C21404j.f67947d = new C21404j(c20513d);
        }
        this.f1394a = C21404j.f67947d;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m1080a(int i10) {
        try {
            if (!(i10 == 429 || (i10 >= 500 && i10 < 600))) {
                return f1392d;
            }
            double dPow = Math.pow(2.0d, this.f1396c);
            this.f1394a.getClass();
            return (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f1393e);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    /* JADX INFO: renamed from: b */
    public final synchronized boolean m1081b() {
        boolean z6;
        if (this.f1396c != 0) {
            this.f1394a.f67948a.getClass();
            if (System.currentTimeMillis() > this.f1395b) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = true;
        }
        return z6;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m1082c() {
        this.f1396c = 0;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m1083d(int i10) {
        try {
            if ((i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404) {
                m1082c();
                return;
            }
            this.f1396c++;
            long jM1080a = m1080a(i10);
            this.f1394a.f67948a.getClass();
            this.f1395b = System.currentTimeMillis() + jM1080a;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
