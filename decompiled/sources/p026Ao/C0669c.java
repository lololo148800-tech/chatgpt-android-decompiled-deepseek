package p026Ao;

import android.os.Process;
import io.sentry.hints.C15370i;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: Ao.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C0669c extends Thread {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1947Y = 0;

    public /* synthetic */ C0669c(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f1947Y) {
            case 0:
                break;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
        while (true) {
            try {
                ReentrantLock reentrantLock = C0672f.f1954h;
                ReentrantLock reentrantLock2 = C0672f.f1954h;
                reentrantLock2.lock();
                try {
                    C0672f c0672fM16625k = C15370i.m16625k();
                    if (c0672fM16625k == C0672f.f1958l) {
                        C0672f.f1958l = null;
                        return;
                    } else {
                        reentrantLock2.unlock();
                        if (c0672fM16625k != null) {
                            c0672fM16625k.mo1385k();
                        }
                    }
                } finally {
                    reentrantLock2.unlock();
                }
            } catch (InterruptedException unused2) {
            }
        }
    }

    public /* synthetic */ C0669c(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
