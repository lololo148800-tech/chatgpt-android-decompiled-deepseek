package p117Eb;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p001A.C0100z;
import p001A.RunnableC0066i;
import p009A7.ThreadFactoryC0394d;
import p127El.ExecutorC2575a;
import p477Tb.C7296c;
import p746fa.C13599h;
import p746fa.C13606o;

/* JADX INFO: renamed from: Eb.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC2377g extends Service {

    /* JADX INFO: renamed from: Y */
    public final ExecutorService f7392Y;

    /* JADX INFO: renamed from: Z */
    public BinderC2368F f7393Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f7394o0;

    /* JADX INFO: renamed from: p0 */
    public int f7395p0;

    /* JADX INFO: renamed from: q0 */
    public int f7396q0;

    public AbstractServiceC2377g() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0394d("Firebase-Messaging-Intent-Handle", 1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f7392Y = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f7394o0 = new Object();
        this.f7396q0 = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m3474a(Intent intent) {
        if (intent != null) {
            AbstractC2367E.m3465b(intent);
        }
        synchronized (this.f7394o0) {
            try {
                int i10 = this.f7396q0 - 1;
                this.f7396q0 = i10;
                if (i10 == 0) {
                    stopSelfResult(this.f7395p0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo3475b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f7393Z == null) {
                this.f7393Z = new BinderC2368F(new C7296c(this, 9));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f7393Z;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f7392Y.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.f7394o0) {
            this.f7395p0 = i11;
            this.f7396q0++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) C2391u.m3503y().f7432q0).poll();
        if (intent2 == null) {
            m3474a(intent);
            return 2;
        }
        C13599h c13599h = new C13599h();
        this.f7392Y.execute(new RunnableC0066i(this, intent2, c13599h, 8));
        C13606o c13606o = c13599h.f42961a;
        if (c13606o.m15131j()) {
            m3474a(intent);
            return 2;
        }
        c13606o.m15123b(new ExecutorC2575a(1), new C0100z(this, 8, intent));
        return 3;
    }
}
