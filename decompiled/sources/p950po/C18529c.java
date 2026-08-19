package p950po;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.AbstractC16544l;
import no.AbstractC17708b;
import p138F8.vJO.vRJidSveZHcTw;
import p178H.AbstractC3137c;
import p784hb.C14437f;

/* JADX INFO: renamed from: po.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C18529c {

    /* JADX INFO: renamed from: a */
    public final C18530d f59033a;

    /* JADX INFO: renamed from: b */
    public final String f59034b;

    /* JADX INFO: renamed from: c */
    public boolean f59035c;

    /* JADX INFO: renamed from: d */
    public AbstractC18527a f59036d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f59037e;

    /* JADX INFO: renamed from: f */
    public boolean f59038f;

    public C18529c(C18530d taskRunner, String name) {
        AbstractC16544l.m18094g(taskRunner, "taskRunner");
        AbstractC16544l.m18094g(name, "name");
        this.f59033a = taskRunner;
        this.f59034b = name;
        this.f59037e = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m19888a() {
        byte[] bArr = AbstractC17708b.f56536a;
        synchronized (this.f59033a) {
            if (m19889b()) {
                this.f59033a.m19896d(this);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m19890c(AbstractC18527a task, long j10) {
        AbstractC16544l.m18094g(task, "task");
        synchronized (this.f59033a) {
            if (!this.f59035c) {
                if (m19891d(task, j10, false)) {
                    this.f59033a.m19896d(this);
                }
            } else if (task.f59028b) {
                if (C18530d.f59040i.isLoggable(Level.FINE)) {
                    AbstractC3137c.m3978a(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (C18530d.f59040i.isLoggable(Level.FINE)) {
                    AbstractC3137c.m3978a(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m19891d(AbstractC18527a task, long j10, boolean z6) {
        AbstractC16544l.m18094g(task, "task");
        C18529c c18529c = task.f59029c;
        if (c18529c != this) {
            if (c18529c != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f59029c = this;
        }
        C14437f c14437f = this.f59033a.f59041a;
        long jNanoTime = System.nanoTime();
        long j11 = jNanoTime + j10;
        ArrayList arrayList = this.f59037e;
        int iIndexOf = arrayList.indexOf(task);
        if (iIndexOf != -1) {
            if (task.f59030d <= j11) {
                if (C18530d.f59040i.isLoggable(Level.FINE)) {
                    AbstractC3137c.m3978a(task, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(iIndexOf);
        }
        task.f59030d = j11;
        if (C18530d.f59040i.isLoggable(Level.FINE)) {
            AbstractC3137c.m3978a(task, this, z6 ? "run again after ".concat(AbstractC3137c.m3980c(j11 - jNanoTime)) : "scheduled after ".concat(AbstractC3137c.m3980c(j11 - jNanoTime)));
        }
        Iterator it = arrayList.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((AbstractC18527a) it.next()).f59030d - jNanoTime > j10) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = arrayList.size();
        }
        arrayList.add(size, task);
        return size == 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m19892e() {
        byte[] bArr = AbstractC17708b.f56536a;
        synchronized (this.f59033a) {
            this.f59035c = true;
            if (m19889b()) {
                this.f59033a.m19896d(this);
            }
        }
    }

    public final String toString() {
        return this.f59034b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m19889b() {
        AbstractC18527a abstractC18527a = this.f59036d;
        if (abstractC18527a != null && abstractC18527a.f59028b) {
            this.f59038f = true;
        }
        ArrayList arrayList = this.f59037e;
        boolean z6 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((AbstractC18527a) arrayList.get(size)).f59028b) {
                AbstractC18527a abstractC18527a2 = (AbstractC18527a) arrayList.get(size);
                if (C18530d.f59040i.isLoggable(Level.FINE)) {
                    AbstractC3137c.m3978a(abstractC18527a2, this, vRJidSveZHcTw.jJALadqaj);
                }
                arrayList.remove(size);
                z6 = true;
            }
        }
        return z6;
    }
}
