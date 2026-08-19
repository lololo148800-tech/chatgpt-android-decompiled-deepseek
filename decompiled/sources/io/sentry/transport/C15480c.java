package io.sentry.transport;

import io.sentry.AbstractC15169V0;
import io.sentry.C15170V1;
import io.sentry.C15175X0;
import io.sentry.C15321b1;
import io.sentry.C15400l;
import io.sentry.C15516w;
import io.sentry.C15524y1;
import io.sentry.EnumC15359h;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15172W0;
import io.sentry.ThreadFactoryC15522y;
import io.sentry.cache.InterfaceC15330d;
import io.sentry.clientreport.EnumC15337e;
import io.sentry.hints.InterfaceC15365d;
import io.sentry.hints.InterfaceC15368g;
import io.sentry.hints.InterfaceC15371j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p544W9.AbstractC8465D3;
import p544W9.AbstractC8483G3;
import p593Y8.C9683j;
import p658b5.C11232c;
import p658b5.C11241l;
import p784hb.C14438g;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.transport.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C15480c implements InterfaceC15483f {

    /* JADX INFO: renamed from: Y */
    public final C15489l f48359Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC15330d f48360Z;

    /* JADX INFO: renamed from: o0 */
    public final C15524y1 f48361o0;

    /* JADX INFO: renamed from: p0 */
    public final C9683j f48362p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC15484g f48363q0;

    /* JADX INFO: renamed from: r0 */
    public final C15482e f48364r0;

    /* JADX INFO: renamed from: s0 */
    public volatile RunnableC15479b f48365s0;

    /* JADX WARN: Type inference failed for: r3v0, types: [io.sentry.transport.a] */
    public C15480c(C15524y1 c15524y1, C9683j c9683j, InterfaceC15484g interfaceC15484g, C11232c c11232c) {
        int maxQueueSize = c15524y1.getMaxQueueSize();
        final InterfaceC15330d envelopeDiskCache = c15524y1.getEnvelopeDiskCache();
        final InterfaceC15127H logger = c15524y1.getLogger();
        InterfaceC15172W0 dateProvider = c15524y1.getDateProvider();
        C15489l c15489l = new C15489l(maxQueueSize, new ThreadFactoryC15522y(5), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                if (runnable instanceof RunnableC15479b) {
                    RunnableC15479b runnableC15479b = (RunnableC15479b) runnable;
                    boolean zM9089c = AbstractC8465D3.m9089c(runnableC15479b.f48355Z, InterfaceC15365d.class);
                    C15516w c15516w = runnableC15479b.f48355Z;
                    if (!zM9089c) {
                        envelopeDiskCache.mo16422o(runnableC15479b.f48354Y, c15516w);
                    }
                    Object objM9088b = AbstractC8465D3.m9088b(c15516w);
                    if (InterfaceC15371j.class.isInstance(AbstractC8465D3.m9088b(c15516w)) && objM9088b != null) {
                        ((InterfaceC15371j) objM9088b).mo16389b(false);
                    }
                    Object objM9088b2 = AbstractC8465D3.m9088b(c15516w);
                    if (InterfaceC15368g.class.isInstance(AbstractC8465D3.m9088b(c15516w)) && objM9088b2 != null) {
                        ((InterfaceC15368g) objM9088b2).mo16390c(true);
                    }
                    logger.mo16298o(EnumC15375i1.WARNING, "Envelope rejected", new Object[0]);
                }
            }
        }, logger, dateProvider);
        C15482e c15482e = new C15482e(c15524y1, c11232c, c9683j);
        this.f48365s0 = null;
        this.f48359Y = c15489l;
        InterfaceC15330d envelopeDiskCache2 = c15524y1.getEnvelopeDiskCache();
        AbstractC8483G3.m9133c(envelopeDiskCache2, "envelopeCache is required");
        this.f48360Z = envelopeDiskCache2;
        this.f48361o0 = c15524y1;
        this.f48362p0 = c9683j;
        AbstractC8483G3.m9133c(interfaceC15484g, "transportGate is required");
        this.f48363q0 = interfaceC15484g;
        this.f48364r0 = c15482e;
    }

    @Override // io.sentry.transport.InterfaceC15483f
    /* JADX INFO: renamed from: G */
    public final void mo16671G(C11241l c11241l, C15516w c15516w) {
        boolean z6;
        InterfaceC15330d interfaceC15330d;
        C11241l c11241lMo7943p;
        EnumC15359h enumC15359h;
        boolean zIsInstance = InterfaceC15365d.class.isInstance(AbstractC8465D3.m9088b(c15516w));
        C15524y1 c15524y1 = this.f48361o0;
        InterfaceC15330d interfaceC15330d2 = this.f48360Z;
        if (zIsInstance) {
            interfaceC15330d = C15485h.f48373Y;
            c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z6 = true;
        } else {
            z6 = false;
            interfaceC15330d = interfaceC15330d2;
        }
        C9683j c9683j = this.f48362p0;
        c9683j.getClass();
        Collection<C15321b1> collection = (Collection) c11241l.f34017Z;
        Iterator it = collection.iterator();
        ArrayList arrayList = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            C15524y1 c15524y2 = (C15524y1) c9683j.f29193o0;
            if (!zHasNext) {
                if (arrayList != null) {
                    c15524y2.getLogger().mo16298o(EnumC15375i1.INFO, "%d items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
                    ArrayList arrayList2 = new ArrayList();
                    for (C15321b1 c15321b1 : collection) {
                        if (!arrayList.contains(c15321b1)) {
                            arrayList2.add(c15321b1);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        c15524y2.getLogger().mo16298o(EnumC15375i1.INFO, "Envelope discarded due all items rate limited.", new Object[0]);
                        Object objM9088b = AbstractC8465D3.m9088b(c15516w);
                        if (InterfaceC15371j.class.isInstance(AbstractC8465D3.m9088b(c15516w)) && objM9088b != null) {
                            ((InterfaceC15371j) objM9088b).mo16389b(false);
                        }
                        Object objM9088b2 = AbstractC8465D3.m9088b(c15516w);
                        if (InterfaceC15368g.class.isInstance(AbstractC8465D3.m9088b(c15516w)) && objM9088b2 != null) {
                            ((InterfaceC15368g) objM9088b2).mo16390c(false);
                        }
                        c11241lMo7943p = null;
                    } else {
                        c11241lMo7943p = new C11241l((C15175X0) c11241l.f34016Y, (Collection) arrayList2);
                    }
                } else {
                    c11241lMo7943p = c11241l;
                }
                if (c11241lMo7943p == null) {
                    if (z6) {
                        interfaceC15330d2.mo16542n(c11241l);
                        return;
                    }
                    return;
                }
                if (C15170V1.class.isInstance(AbstractC8465D3.m9088b(c15516w))) {
                    c11241lMo7943p = c15524y1.getClientReportRecorder().mo7943p(c11241lMo7943p);
                }
                Future futureSubmit = this.f48359Y.submit(new RunnableC15479b(this, c11241lMo7943p, c15516w, interfaceC15330d));
                if (futureSubmit != null && futureSubmit.isCancelled()) {
                    c15524y1.getClientReportRecorder().mo7940G(EnumC15337e.QUEUE_OVERFLOW, c11241lMo7943p);
                    return;
                }
                Object objM9088b3 = AbstractC8465D3.m9088b(c15516w);
                if (!C15400l.class.isInstance(AbstractC8465D3.m9088b(c15516w)) || objM9088b3 == null) {
                    return;
                }
                C15400l c15400l = (C15400l) objM9088b3;
                c15400l.f48016s0.add(c15400l.f48015r0);
                c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Envelope enqueued", new Object[0]);
                return;
            }
            C15321b1 c15321b2 = (C15321b1) it.next();
            String itemType = c15321b2.f47863a.f47870o0.getItemType();
            itemType.getClass();
            switch (itemType) {
                case "attachment":
                    enumC15359h = EnumC15359h.Attachment;
                    break;
                case "replay_video":
                    enumC15359h = EnumC15359h.Replay;
                    break;
                case "statsd":
                    enumC15359h = EnumC15359h.MetricBucket;
                    break;
                case "profile":
                    enumC15359h = EnumC15359h.Profile;
                    break;
                case "event":
                    enumC15359h = EnumC15359h.Error;
                    break;
                case "check_in":
                    enumC15359h = EnumC15359h.Monitor;
                    break;
                case "session":
                    enumC15359h = EnumC15359h.Session;
                    break;
                case "transaction":
                    enumC15359h = EnumC15359h.Transaction;
                    break;
                default:
                    enumC15359h = EnumC15359h.Unknown;
                    break;
            }
            if (c9683j.m10272P(enumC15359h)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c15321b2);
                c15524y2.getClientReportRecorder().mo7945w(EnumC15337e.RATELIMIT_BACKOFF, c15321b2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        mo16672d(false);
    }

    @Override // io.sentry.transport.InterfaceC15483f
    /* JADX INFO: renamed from: d */
    public final void mo16672d(boolean z6) throws IOException {
        long flushTimeoutMillis;
        this.f48362p0.close();
        this.f48359Y.shutdown();
        this.f48361o0.getLogger().mo16298o(EnumC15375i1.DEBUG, "Shutting down", new Object[0]);
        if (z6) {
            flushTimeoutMillis = 0;
        } else {
            try {
                flushTimeoutMillis = this.f48361o0.getFlushTimeoutMillis();
            } catch (InterruptedException unused) {
                this.f48361o0.getLogger().mo16298o(EnumC15375i1.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
                Thread.currentThread().interrupt();
                return;
            }
        }
        if (this.f48359Y.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
            return;
        }
        this.f48361o0.getLogger().mo16298o(EnumC15375i1.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
        this.f48359Y.shutdownNow();
        if (this.f48365s0 != null) {
            this.f48359Y.getRejectedExecutionHandler().rejectedExecution(this.f48365s0, this.f48359Y);
        }
    }

    @Override // io.sentry.transport.InterfaceC15483f
    /* JADX INFO: renamed from: f */
    public final C9683j mo16673f() {
        return this.f48362p0;
    }

    @Override // io.sentry.transport.InterfaceC15483f
    /* JADX INFO: renamed from: i */
    public final boolean mo16674i() {
        boolean z6;
        C9683j c9683j = this.f48362p0;
        c9683j.getClass();
        ((C15481d) c9683j.f29192Z).getClass();
        Date date = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c9683j.f29194p0;
        Iterator it = concurrentHashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z6 = false;
                break;
            }
            Date date2 = (Date) concurrentHashMap.get((EnumC15359h) it.next());
            if (date2 != null && !date.after(date2)) {
                z6 = true;
                break;
            }
        }
        C15489l c15489l = this.f48359Y;
        AbstractC15169V0 abstractC15169V0 = c15489l.f48378Z;
        return (z6 || (abstractC15169V0 != null && (c15489l.f48380p0.mo16338a().mo16354b(abstractC15169V0) > 2000000000L ? 1 : (c15489l.f48380p0.mo16338a().mo16354b(abstractC15169V0) == 2000000000L ? 0 : -1)) < 0)) ? false : true;
    }

    @Override // io.sentry.transport.InterfaceC15483f
    /* JADX INFO: renamed from: r */
    public final void mo16675r(long j10) {
        C15489l c15489l = this.f48359Y;
        c15489l.getClass();
        try {
            C14438g c14438g = c15489l.f48381q0;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c14438g.getClass();
            ((C15490m) c14438g.f45414Y).tryAcquireSharedNanos(1, timeUnit.toNanos(j10));
        } catch (InterruptedException e10) {
            c15489l.f48379o0.mo16297h(EnumC15375i1.ERROR, "Failed to wait till idle", e10);
            Thread.currentThread().interrupt();
        }
    }
}
