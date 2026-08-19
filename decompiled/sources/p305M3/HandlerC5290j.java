package p305M3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import p1073w3.AbstractC20800b;
import p232J3.C4210J;

/* JADX INFO: renamed from: M3.j */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC5290j extends Handler implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final int f17432Y;

    /* JADX INFO: renamed from: Z */
    public final C4210J f17433Z;

    /* JADX INFO: renamed from: o0 */
    public final long f17434o0;

    /* JADX INFO: renamed from: p0 */
    public Object f17435p0;

    /* JADX INFO: renamed from: q0 */
    public IOException f17436q0;

    /* JADX INFO: renamed from: r0 */
    public int f17437r0;

    /* JADX INFO: renamed from: s0 */
    public Thread f17438s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f17439t0;

    /* JADX INFO: renamed from: u0 */
    public volatile boolean f17440u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ C5292l f17441v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC5290j(C5292l c5292l, Looper looper, C4210J c4210j, InterfaceC5288h interfaceC5288h, int i10, long j10) {
        super(looper);
        this.f17441v0 = c5292l;
        this.f17433Z = c4210j;
        this.f17435p0 = interfaceC5288h;
        this.f17432Y = i10;
        this.f17434o0 = j10;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [M3.h, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final void m5831a(boolean z6) {
        this.f17440u0 = z6;
        this.f17436q0 = null;
        if (hasMessages(1)) {
            this.f17439t0 = true;
            removeMessages(1);
            if (!z6) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f17439t0 = true;
                    this.f17433Z.f13688h = true;
                    Thread thread = this.f17438s0;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z6) {
            this.f17441v0.f17445b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ?? r6 = this.f17435p0;
            r6.getClass();
            r6.mo4948n(this.f17433Z, jElapsedRealtime, jElapsedRealtime - this.f17434o0, true);
            this.f17435p0 = null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [M3.h, java.lang.Object] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f17440u0) {
            return;
        }
        int i10 = message.what;
        if (i10 == 1) {
            this.f17436q0 = null;
            C5292l c5292l = this.f17441v0;
            ExecutorService executorService = c5292l.f17444a;
            HandlerC5290j handlerC5290j = c5292l.f17445b;
            handlerC5290j.getClass();
            executorService.execute(handlerC5290j);
            return;
        }
        if (i10 == 4) {
            throw ((Error) message.obj);
        }
        this.f17441v0.f17445b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.f17434o0;
        ?? r6 = this.f17435p0;
        r6.getClass();
        if (this.f17439t0) {
            r6.mo4948n(this.f17433Z, jElapsedRealtime, j10, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 2) {
            try {
                r6.mo4947h(this.f17433Z, jElapsedRealtime, j10);
                return;
            } catch (RuntimeException e10) {
                AbstractC20800b.m21325m("LoadTask", "Unexpected exception handling load completed", e10);
                this.f17441v0.f17446c = new C5291k(e10);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f17436q0 = iOException;
        int i12 = this.f17437r0 + 1;
        this.f17437r0 = i12;
        C5289i c5289iMo4946b = r6.mo4946b(this.f17433Z, jElapsedRealtime, j10, iOException, i12);
        int i13 = c5289iMo4946b.f17430a;
        if (i13 == 3) {
            this.f17441v0.f17446c = this.f17436q0;
            return;
        }
        if (i13 != 2) {
            if (i13 == 1) {
                this.f17437r0 = 1;
            }
            long jMin = c5289iMo4946b.f17431b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f17437r0 - 1) * 1000, 5000);
            }
            C5292l c5292l2 = this.f17441v0;
            AbstractC20800b.m21320h(c5292l2.f17445b == null);
            c5292l2.f17445b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
            } else {
                this.f17436q0 = null;
                c5292l2.f17444a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        try {
            synchronized (this) {
                z6 = this.f17439t0;
                this.f17438s0 = Thread.currentThread();
            }
            if (!z6) {
                Trace.beginSection("load:".concat(this.f17433Z.getClass().getSimpleName()));
                try {
                    this.f17433Z.m4940b();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            synchronized (this) {
                this.f17438s0 = null;
                Thread.interrupted();
            }
            if (this.f17440u0) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e10) {
            if (this.f17440u0) {
                return;
            }
            obtainMessage(3, e10).sendToTarget();
        } catch (Exception e11) {
            if (this.f17440u0) {
                return;
            }
            AbstractC20800b.m21325m("LoadTask", "Unexpected exception loading stream", e11);
            obtainMessage(3, new C5291k(e11)).sendToTarget();
        } catch (OutOfMemoryError e12) {
            if (this.f17440u0) {
                return;
            }
            AbstractC20800b.m21325m("LoadTask", "OutOfMemory error loading stream", e12);
            obtainMessage(3, new C5291k(e12)).sendToTarget();
        } catch (Error e13) {
            if (!this.f17440u0) {
                AbstractC20800b.m21325m("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(4, e13).sendToTarget();
            }
            throw e13;
        }
    }
}
