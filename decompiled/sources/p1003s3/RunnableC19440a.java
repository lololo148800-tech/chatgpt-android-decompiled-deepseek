package p1003s3;

import android.os.Handler;
import android.os.Looper;
import io.sentry.android.core.RunnableC15195M;
import java.util.concurrent.atomic.AtomicBoolean;
import p277L.CallableC4829b;
import p520V5.C7765C;
import p960q9.C18650d;

/* JADX INFO: renamed from: s3.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC19440a implements Runnable {

    /* JADX INFO: renamed from: r0 */
    public static Handler f61640r0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C18650d f61645q0;

    /* JADX INFO: renamed from: Z */
    public volatile int f61642Z = 1;

    /* JADX INFO: renamed from: o0 */
    public final AtomicBoolean f61643o0 = new AtomicBoolean();

    /* JADX INFO: renamed from: p0 */
    public final AtomicBoolean f61644p0 = new AtomicBoolean();

    /* JADX INFO: renamed from: Y */
    public final C7765C f61641Y = new C7765C(this, new CallableC4829b(this, 8));

    public RunnableC19440a(C18650d c18650d) {
        this.f61645q0 = c18650d;
    }

    /* JADX INFO: renamed from: a */
    public final void m20517a(Object obj) {
        Handler handler;
        synchronized (RunnableC19440a.class) {
            try {
                if (f61640r0 == null) {
                    f61640r0 = new Handler(Looper.getMainLooper());
                }
                handler = f61640r0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new RunnableC15195M(this, 14, obj));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f61645q0.m20013b();
    }
}
