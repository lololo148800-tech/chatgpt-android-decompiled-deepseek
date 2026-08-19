package p444S4;

import android.util.Log;
import io.sentry.android.core.AbstractC15256t;

/* JADX INFO: renamed from: S4.q */
/* JADX INFO: loaded from: classes.dex */
public final class C7011q {

    /* JADX INFO: renamed from: b */
    public static final Object f22420b = new Object();

    /* JADX INFO: renamed from: c */
    public static volatile C7011q f22421c;

    /* JADX INFO: renamed from: a */
    public final int f22422a;

    public C7011q(int i10) {
        this.f22422a = i10;
    }

    /* JADX INFO: renamed from: d */
    public static C7011q m7408d() {
        C7011q c7011q;
        synchronized (f22420b) {
            try {
                if (f22421c == null) {
                    f22421c = new C7011q(3);
                }
                c7011q = f22421c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c7011q;
    }

    /* JADX INFO: renamed from: f */
    public static String m7409f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m7410a(String str, String str2) {
        if (this.f22422a <= 3) {
            Log.d(str, str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7411b(String str, String str2) {
        if (this.f22422a <= 6) {
            AbstractC15256t.m16465c(str, str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7412c(String str, String str2, Throwable th2) {
        if (this.f22422a <= 6) {
            AbstractC15256t.m16466d(str, str2, th2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7413e(String str, String str2) {
        if (this.f22422a <= 4) {
            Log.i(str, str2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7414g(String str, String str2) {
        if (this.f22422a <= 5) {
            AbstractC15256t.m16482t(str, str2);
        }
    }
}
