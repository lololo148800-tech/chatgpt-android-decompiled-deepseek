package io.sentry;

import io.sentry.metrics.AbstractC15408c;
import io.sentry.metrics.C15406a;
import io.sentry.protocol.C15447t;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p111E5.CallableC2341y;
import p658b5.C11234e;
import p658b5.C11238i;
import p658b5.C11241l;

/* JADX INFO: renamed from: io.sentry.o0 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC15414o0 implements InterfaceC15130I, Runnable, Closeable {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC15127H f48034Y;

    /* JADX INFO: renamed from: Z */
    public final C11238i f48035Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC15172W0 f48036o0;

    /* JADX INFO: renamed from: p0 */
    public volatile C15476t0 f48037p0;

    /* JADX INFO: renamed from: q0 */
    public volatile boolean f48038q0;

    /* JADX INFO: renamed from: r0 */
    public final ConcurrentSkipListMap f48039r0;

    /* JADX INFO: renamed from: s0 */
    public final AtomicInteger f48040s0;

    /* JADX INFO: renamed from: t0 */
    public final int f48041t0;

    static {
        Charset.forName("UTF-8");
    }

    public RunnableC15414o0(C15524y1 c15524y1, C11238i c11238i) {
        InterfaceC15127H logger = c15524y1.getLogger();
        InterfaceC15172W0 dateProvider = c15524y1.getDateProvider();
        c15524y1.getBeforeEmitMetricCallback();
        C15476t0 c15476t0 = C15476t0.f48343p0;
        this.f48038q0 = false;
        this.f48039r0 = new ConcurrentSkipListMap();
        this.f48040s0 = new AtomicInteger();
        this.f48035Z = c11238i;
        this.f48034Y = logger;
        this.f48036o0 = dateProvider;
        this.f48041t0 = 100000;
        this.f48037p0 = c15476t0;
    }

    /* JADX INFO: renamed from: a */
    public final void m16653a(boolean z6) {
        Set<Long> setKeySet;
        if (!z6) {
            if (this.f48040s0.get() + this.f48039r0.size() >= this.f48041t0) {
                this.f48034Y.mo16298o(EnumC15375i1.INFO, "Metrics: total weight exceeded, flushing all buckets", new Object[0]);
                z6 = true;
            }
        }
        ConcurrentSkipListMap concurrentSkipListMap = this.f48039r0;
        if (z6) {
            setKeySet = concurrentSkipListMap.keySet();
        } else {
            long millis = (TimeUnit.NANOSECONDS.toMillis(this.f48036o0.mo16338a().mo16356d()) - 10000) - AbstractC15408c.f48028a;
            long j10 = ((millis / 1000) / 10) * 10;
            if (millis < 0) {
                j10--;
            }
            setKeySet = concurrentSkipListMap.headMap((Object) Long.valueOf(j10), true).keySet();
        }
        if (setKeySet.isEmpty()) {
            this.f48034Y.mo16298o(EnumC15375i1.DEBUG, "Metrics: nothing to flush", new Object[0]);
            return;
        }
        this.f48034Y.mo16298o(EnumC15375i1.DEBUG, "Metrics: flushing " + setKeySet.size() + " buckets", new Object[0]);
        HashMap map = new HashMap();
        int size = 0;
        for (Long l4 : setKeySet) {
            l4.getClass();
            Map map2 = (Map) this.f48039r0.remove(l4);
            if (map2 != null) {
                synchronized (map2) {
                    try {
                        Iterator it = map2.values().iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                        this.f48040s0.addAndGet(0);
                        size += map2.size();
                        map.put(l4, map2);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        if (size == 0) {
            this.f48034Y.mo16298o(EnumC15375i1.DEBUG, "Metrics: only empty buckets found", new Object[0]);
            return;
        }
        this.f48034Y.mo16298o(EnumC15375i1.DEBUG, "Metrics: capturing metrics", new Object[0]);
        C11238i c11238i = this.f48035Z;
        C15406a c15406a = new C15406a(map);
        c11238i.getClass();
        Charset charset = C15321b1.f47862d;
        C11234e c11234e = new C11234e(new CallableC2341y(c15406a, 4));
        c11238i.m12553Y(new C11241l(new C15175X0(new C15447t((UUID) null), ((C15524y1) c11238i.f34008Y).getSdkVersion(), null), (Collection) Collections.singleton(new C15321b1(new C15326c1(EnumC15361h1.Statsd, new CallableC15177Y0(c11234e, 10), "application/octet-stream", (String) null, (String) null), new CallableC15177Y0(c11234e, 11)))), null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f48038q0 = true;
            this.f48037p0.getClass();
        }
        m16653a(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        m16653a(false);
        synchronized (this) {
            try {
                if (!this.f48038q0 && !this.f48039r0.isEmpty()) {
                    this.f48037p0.mo15970r(this, 5000L);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
