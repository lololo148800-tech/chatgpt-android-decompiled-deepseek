package p1012t;

import android.os.Looper;
import p127El.ExecutorC2575a;
import p523V9.AbstractC8158o4;

/* JADX INFO: renamed from: t.a */
/* JADX INFO: loaded from: classes.dex */
public final class C19711a extends AbstractC8158o4 {

    /* JADX INFO: renamed from: b */
    public static volatile C19711a f62402b;

    /* JADX INFO: renamed from: c */
    public static final ExecutorC2575a f62403c = new ExecutorC2575a(3);

    /* JADX INFO: renamed from: a */
    public final C19712b f62404a = new C19712b();

    /* JADX INFO: renamed from: e */
    public static C19711a m20661e() {
        if (f62402b != null) {
            return f62402b;
        }
        synchronized (C19711a.class) {
            try {
                if (f62402b == null) {
                    f62402b = new C19711a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f62402b;
    }

    /* JADX INFO: renamed from: f */
    public final void m20662f(Runnable runnable) {
        C19712b c19712b = this.f62404a;
        if (c19712b.f62407c == null) {
            synchronized (c19712b.f62405a) {
                try {
                    if (c19712b.f62407c == null) {
                        c19712b.f62407c = C19712b.m20663e(Looper.getMainLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        c19712b.f62407c.post(runnable);
    }
}
