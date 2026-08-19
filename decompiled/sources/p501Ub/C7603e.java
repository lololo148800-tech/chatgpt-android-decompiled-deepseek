package p501Ub;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Callable;
import p301M.RunnableC5228j;
import p377P9.HandlerC6378d;
import p746fa.C13599h;
import p746fa.C13606o;

/* JADX INFO: renamed from: Ub.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7603e {

    /* JADX INFO: renamed from: b */
    public static final Object f24037b = new Object();

    /* JADX INFO: renamed from: c */
    public static C7603e f24038c;

    /* JADX INFO: renamed from: a */
    public final HandlerC6378d f24039a;

    public C7603e(Looper looper) {
        HandlerC6378d handlerC6378d = new HandlerC6378d(looper);
        Looper.getMainLooper();
        this.f24039a = handlerC6378d;
    }

    /* JADX INFO: renamed from: a */
    public static C7603e m7948a() {
        C7603e c7603e;
        synchronized (f24037b) {
            try {
                if (f24038c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f24038c = new C7603e(handlerThread.getLooper());
                }
                c7603e = f24038c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c7603e;
    }

    /* JADX INFO: renamed from: b */
    public static C13606o m7949b(Callable callable) {
        C13599h c13599h = new C13599h();
        EnumC7610l.f24056Y.execute(new RunnableC5228j(callable, 12, c13599h));
        return c13599h.f42961a;
    }
}
