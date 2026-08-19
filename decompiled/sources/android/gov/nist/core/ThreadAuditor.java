package android.gov.nist.core;

import java.util.Iterator;
import java.util.Map;
import p571X9.AbstractC9306j0;
import p628Zk.GwZB.tpXhEMGxfXFVSh;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ThreadAuditor {
    private Map<Thread, ThreadHandle> threadHandles = new ConcurrentHashMap();
    private long pingIntervalInMillisecs = 0;

    public class ThreadHandle {
        private ThreadAuditor threadAuditor;
        private boolean isThreadActive = false;
        private Thread thread = Thread.currentThread();

        public ThreadHandle(ThreadAuditor threadAuditor) {
            this.threadAuditor = threadAuditor;
        }

        public long getPingIntervalInMillisecs() {
            return this.threadAuditor.getPingIntervalInMillisecs();
        }

        public Thread getThread() {
            return this.thread;
        }

        public boolean isThreadActive() {
            return this.isThreadActive;
        }

        public void ping() {
            this.threadAuditor.ping(this);
        }

        public void setThreadActive(boolean z6) {
            this.isThreadActive = z6;
        }

        public String toString() {
            return "Thread Name: " + this.thread.getName() + ", Alive: " + this.thread.isAlive();
        }
    }

    public ThreadHandle addCurrentThread() {
        ThreadHandle threadHandle = new ThreadHandle(this);
        if (isEnabled()) {
            this.threadHandles.put(Thread.currentThread(), threadHandle);
        }
        return threadHandle;
    }

    public long getPingIntervalInMillisecs() {
        return this.pingIntervalInMillisecs;
    }

    public boolean isEnabled() {
        return this.pingIntervalInMillisecs > 0;
    }

    public void ping(ThreadHandle threadHandle) {
        threadHandle.setThreadActive(true);
    }

    public void removeThread(Thread thread) {
        this.threadHandles.remove(thread);
    }

    public void reset() {
        this.threadHandles.clear();
    }

    public void setPingIntervalInMillisecs(long j10) {
        this.pingIntervalInMillisecs = j10;
    }

    public synchronized String toString() {
        String str;
        str = "Thread Auditor - List of monitored threads:\n";
        Iterator<ThreadHandle> it = this.threadHandles.values().iterator();
        while (it.hasNext()) {
            str = str + "   " + it.next().toString() + Separators.RETURN;
        }
        return str;
    }

    public String auditThreads() {
        String string = null;
        for (ThreadHandle threadHandle : this.threadHandles.values()) {
            if (!threadHandle.isThreadActive()) {
                Thread thread = threadHandle.getThread();
                if (string == null) {
                    string = "Thread Auditor Report:\n";
                }
                StringBuilder sbM9895n = AbstractC9306j0.m9895n(string, "   Thread [");
                sbM9895n.append(thread.getName());
                sbM9895n.append(tpXhEMGxfXFVSh.TZgMBp);
                string = sbM9895n.toString();
            }
            threadHandle.setThreadActive(false);
        }
        return string;
    }
}
