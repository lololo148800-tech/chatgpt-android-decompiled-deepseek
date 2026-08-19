package p950po;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.statsig.androidsdk.ErrorBoundaryKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC16544l;
import no.AbstractC17708b;
import no.ThreadFactoryC17707a;
import p784hb.C14437f;
import p935p.RunnableC18260f;

/* JADX INFO: renamed from: po.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C18530d {

    /* JADX INFO: renamed from: h */
    public static final C18530d f59039h;

    /* JADX INFO: renamed from: i */
    public static final Logger f59040i;

    /* JADX INFO: renamed from: a */
    public final C14437f f59041a;

    /* JADX INFO: renamed from: c */
    public boolean f59043c;

    /* JADX INFO: renamed from: d */
    public long f59044d;

    /* JADX INFO: renamed from: b */
    public int f59042b = ErrorBoundaryKt.SAMPLING_RATE;

    /* JADX INFO: renamed from: e */
    public final ArrayList f59045e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f59046f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final RunnableC18260f f59047g = new RunnableC18260f(this, 2);

    static {
        String name = AbstractC17708b.f56542g + " TaskRunner";
        AbstractC16544l.m18094g(name, "name");
        f59039h = new C18530d(new C14437f(new ThreadFactoryC17707a(name, true)));
        Logger logger = Logger.getLogger(C18530d.class.getName());
        AbstractC16544l.m18093f(logger, "getLogger(TaskRunner::class.java.name)");
        f59040i = logger;
    }

    public C18530d(C14437f c14437f) {
        this.f59041a = c14437f;
    }

    /* JADX INFO: renamed from: a */
    public static final void m19893a(C18530d c18530d, AbstractC18527a abstractC18527a) {
        c18530d.getClass();
        byte[] bArr = AbstractC17708b.f56536a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(abstractC18527a.f59027a);
        try {
            long jMo19887a = abstractC18527a.mo19887a();
            synchronized (c18530d) {
                c18530d.m19894b(abstractC18527a, jMo19887a);
            }
        } finally {
            synchronized (c18530d) {
                c18530d.m19894b(abstractC18527a, -1L);
                threadCurrentThread.setName(name);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m19894b(AbstractC18527a abstractC18527a, long j10) {
        byte[] bArr = AbstractC17708b.f56536a;
        C18529c c18529c = abstractC18527a.f59029c;
        AbstractC16544l.m18091d(c18529c);
        if (c18529c.f59036d != abstractC18527a) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z6 = c18529c.f59038f;
        c18529c.f59038f = false;
        c18529c.f59036d = null;
        this.f59045e.remove(c18529c);
        if (j10 != -1 && !z6 && !c18529c.f59035c) {
            c18529c.m19891d(abstractC18527a, j10, true);
        }
        if (c18529c.f59037e.isEmpty()) {
            return;
        }
        this.f59046f.add(c18529c);
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC18527a m19895c() {
        boolean z6;
        this = this;
        byte[] bArr = AbstractC17708b.f56536a;
        while (true) {
            ArrayList arrayList = this.f59046f;
            if (arrayList.isEmpty()) {
                return null;
            }
            C14437f c14437f = this.f59041a;
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC18527a abstractC18527a = null;
            while (true) {
                if (!it.hasNext()) {
                    z6 = false;
                    break;
                }
                AbstractC18527a abstractC18527a2 = (AbstractC18527a) ((C18529c) it.next()).f59037e.get(0);
                long jMax = Math.max(0L, abstractC18527a2.f59030d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC18527a != null) {
                        z6 = true;
                        break;
                    }
                    abstractC18527a = abstractC18527a2;
                }
            }
            ArrayList arrayList2 = this.f59045e;
            if (abstractC18527a != null) {
                byte[] bArr2 = AbstractC17708b.f56536a;
                abstractC18527a.f59030d = -1L;
                C18529c c18529c = abstractC18527a.f59029c;
                AbstractC16544l.m18091d(c18529c);
                c18529c.f59037e.remove(abstractC18527a);
                arrayList.remove(c18529c);
                c18529c.f59036d = abstractC18527a;
                arrayList2.add(c18529c);
                if (z6 || (!this.f59043c && !arrayList.isEmpty())) {
                    RunnableC18260f runnable = this.f59047g;
                    AbstractC16544l.m18094g(runnable, "runnable");
                    ((ThreadPoolExecutor) c14437f.f45413Y).execute(runnable);
                }
                return abstractC18527a;
            }
            if (this.f59043c) {
                if (jMin < this.f59044d - jNanoTime) {
                    notify();
                }
                return null;
            }
            this.f59043c = true;
            this.f59044d = jNanoTime + jMin;
            try {
                try {
                    long j10 = jMin / 1000000;
                    Long.signum(j10);
                    long j11 = jMin - (1000000 * j10);
                    if (j10 > 0 || jMin > 0) {
                        wait(j10, (int) j11);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((C18529c) arrayList2.get(size)).m19889b();
                    }
                    int i10 = -1;
                    for (int size2 = arrayList.size() - 1; i10 < size2; size2--) {
                        C18529c c18529c2 = (C18529c) arrayList.get(size2);
                        c18529c2.m19889b();
                        if (c18529c2.f59037e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                        i10 = -1;
                    }
                }
                this.f59043c = false;
            } catch (Throwable th2) {
                this.f59043c = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m19896d(C18529c taskQueue) {
        AbstractC16544l.m18094g(taskQueue, "taskQueue");
        byte[] bArr = AbstractC17708b.f56536a;
        if (taskQueue.f59036d == null) {
            boolean zIsEmpty = taskQueue.f59037e.isEmpty();
            ArrayList arrayList = this.f59046f;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                AbstractC16544l.m18094g(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        boolean z6 = this.f59043c;
        C14437f c14437f = this.f59041a;
        if (z6) {
            notify();
            return;
        }
        RunnableC18260f runnable = this.f59047g;
        AbstractC16544l.m18094g(runnable, "runnable");
        ((ThreadPoolExecutor) c14437f.f45413Y).execute(runnable);
    }

    /* JADX INFO: renamed from: e */
    public final C18529c m19897e() {
        int i10;
        synchronized (this) {
            i10 = this.f59042b;
            this.f59042b = i10 + 1;
        }
        return new C18529c(this, AbstractC10763a.m11048f(i10, "Q"));
    }
}
