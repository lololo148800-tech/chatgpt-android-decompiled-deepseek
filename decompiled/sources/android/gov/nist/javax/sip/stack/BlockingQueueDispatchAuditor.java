package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public class BlockingQueueDispatchAuditor extends TimerTask {
    private static StackLogger logger = CommonLogger.getLogger(BlockingQueueDispatchAuditor.class);
    private static int timerThreadCount;
    private Queue<? extends Runnable> queue;
    private Timer timer = null;
    private long totalReject = 0;
    private boolean started = false;
    private int timeout = 8000;

    public BlockingQueueDispatchAuditor(Queue<? extends Runnable> queue) {
        this.queue = queue;
    }

    public int getTimeout() {
        return this.timeout;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        int i10;
        try {
            synchronized (this.queue) {
                try {
                    QueuedMessageDispatchBase queuedMessageDispatchBase = (QueuedMessageDispatchBase) this.queue.peek();
                    i10 = 0;
                    while (queuedMessageDispatchBase != null) {
                        if (System.currentTimeMillis() - queuedMessageDispatchBase.getReceptionTime() > this.timeout) {
                            this.queue.poll();
                            queuedMessageDispatchBase = (QueuedMessageDispatchBase) this.queue.peek();
                            i10++;
                        } else {
                            queuedMessageDispatchBase = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (i10 > 0) {
                this.totalReject += (long) i10;
                StackLogger stackLogger = logger;
                if (stackLogger == null || !stackLogger.isLoggingEnabled(8)) {
                    return;
                }
                logger.logWarning("Removed stuck messages=" + i10 + " total rejected=" + this.totalReject + " stil in queue=" + this.queue.size());
            }
        } catch (Exception e10) {
            StackLogger stackLogger2 = logger;
            if (stackLogger2 == null || !stackLogger2.isLoggingEnabled(8)) {
                return;
            }
            logger.logWarning("Problem reaping old requests. This is not a fatal error." + e10);
        }
    }

    public void setTimeout(int i10) {
        this.timeout = i10;
    }

    public void start(int i10) {
        if (this.started) {
            stop();
        }
        this.started = true;
        StringBuilder sb2 = new StringBuilder("BlockingQueueDispatchAuditor-Timer-");
        int i11 = timerThreadCount;
        timerThreadCount = i11 + 1;
        sb2.append(i11);
        Timer timer = new Timer(sb2.toString(), true);
        this.timer = timer;
        long j10 = i10;
        timer.scheduleAtFixedRate(this, j10, j10);
    }

    public void stop() {
        try {
            this.timer.cancel();
            this.timer = null;
        } catch (Exception unused) {
        } finally {
            this.started = false;
        }
    }
}
