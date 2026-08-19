package io.sentry.android.core;

import android.view.Choreographer;
import io.sentry.AbstractC15169V0;
import io.sentry.C15402l1;
import io.sentry.C15509v0;
import io.sentry.C15517w0;
import io.sentry.InterfaceC15139L;
import io.sentry.InterfaceC15154Q;
import io.sentry.InterfaceC15159S;
import io.sentry.android.core.internal.util.C15240l;
import io.sentry.android.core.internal.util.InterfaceC15239k;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;
import p001A.C0013G0;

/* JADX INFO: renamed from: io.sentry.android.core.Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C15206Y implements InterfaceC15139L, InterfaceC15239k {

    /* JADX INFO: renamed from: h */
    public static final long f47425h = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: i */
    public static final C15402l1 f47426i = new C15402l1(new Date(0), 0);

    /* JADX INFO: renamed from: a */
    public final boolean f47427a;

    /* JADX INFO: renamed from: c */
    public final C15240l f47429c;

    /* JADX INFO: renamed from: d */
    public volatile String f47430d;

    /* JADX INFO: renamed from: b */
    public final Object f47428b = new Object();

    /* JADX INFO: renamed from: e */
    public final TreeSet f47431e = new TreeSet(new C0013G0(15));

    /* JADX INFO: renamed from: f */
    public final ConcurrentSkipListSet f47432f = new ConcurrentSkipListSet();

    /* JADX INFO: renamed from: g */
    public long f47433g = 16666666;

    public C15206Y(SentryAndroidOptions sentryAndroidOptions, C15240l c15240l) {
        this.f47429c = c15240l;
        this.f47427a = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    /* JADX INFO: renamed from: h */
    public static long m16416h(AbstractC15169V0 abstractC15169V0) {
        if (abstractC15169V0 instanceof C15402l1) {
            return abstractC15169V0.mo16354b(f47426i);
        }
        return System.nanoTime() - ((System.currentTimeMillis() * 1000000) - abstractC15169V0.mo16356d());
    }

    @Override // io.sentry.android.core.internal.util.InterfaceC15239k
    /* JADX INFO: renamed from: b */
    public final void mo16417b(long j10, long j11, long j12, long j13, boolean z6, boolean z10, float f10) {
        ConcurrentSkipListSet concurrentSkipListSet = this.f47432f;
        if (concurrentSkipListSet.size() > 3600) {
            return;
        }
        long j14 = (long) (f47425h / ((double) f10));
        this.f47433g = j14;
        if (z6 || z10) {
            concurrentSkipListSet.add(new C15205X(j10, j11, j12, j13, z6, z10, j14));
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x012f  */
    /* JADX INFO: renamed from: d */
    public final void m16418d(InterfaceC15154Q interfaceC15154Q) throws Throwable {
        Object obj;
        int i10;
        int i11;
        long j10;
        long j11;
        long j12;
        long jLongValue;
        int i12;
        Field field;
        Iterator it;
        long j13;
        Object obj2 = this.f47428b;
        synchronized (obj2) {
            try {
                try {
                    if (this.f47431e.remove(interfaceC15154Q)) {
                        AbstractC15169V0 abstractC15169V0Mo16289t = interfaceC15154Q.mo16289t();
                        if (abstractC15169V0Mo16289t == null) {
                            return;
                        }
                        long jM16416h = m16416h(interfaceC15154Q.mo16292w());
                        long jM16416h2 = m16416h(abstractC15169V0Mo16289t);
                        long j14 = jM16416h2 - jM16416h;
                        if (j14 <= 0) {
                            return;
                        }
                        long j15 = this.f47433g;
                        if (!this.f47432f.isEmpty()) {
                            Iterator it2 = this.f47432f.tailSet(new C15205X(jM16416h)).iterator();
                            j10 = 0;
                            j11 = 0;
                            j12 = 0;
                            i10 = 0;
                            i11 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj = obj2;
                                    break;
                                }
                                C15205X c15205x = (C15205X) it2.next();
                                obj = obj2;
                                long j16 = c15205x.f47418Y;
                                if (j16 > jM16416h2) {
                                    break;
                                }
                                if (j16 < jM16416h || c15205x.f47419Z > jM16416h2) {
                                    it = it2;
                                    if ((jM16416h > j16 && jM16416h < c15205x.f47419Z) || (jM16416h2 > j16 && jM16416h2 < c15205x.f47419Z)) {
                                        long jMin = Math.min(c15205x.f47421p0 - Math.max(0L, Math.max(0L, jM16416h - j16) - c15205x.f47424s0), j14);
                                        j13 = jM16416h;
                                        long jMin2 = Math.min(jM16416h2, c15205x.f47419Z) - Math.max(jM16416h, c15205x.f47418Y);
                                        long j17 = c15205x.f47424s0;
                                        int i13 = C15240l.f47552B0;
                                        boolean z6 = jMin2 > j17;
                                        j10 += jMin2;
                                        if (jMin2 > C15240l.f47551A0) {
                                            j12 += jMin;
                                            i11++;
                                        } else if (z6) {
                                            j11 += jMin;
                                            i10++;
                                        }
                                    }
                                    j15 = c15205x.f47424s0;
                                    obj2 = obj;
                                    it2 = it;
                                    jM16416h = j13;
                                } else {
                                    long j18 = c15205x.f47420o0;
                                    long j19 = c15205x.f47421p0;
                                    boolean z10 = c15205x.f47422q0;
                                    it = it2;
                                    j10 += j18;
                                    if (c15205x.f47423r0) {
                                        j12 += j19;
                                        i11++;
                                    } else if (z10) {
                                        j11 += j19;
                                        i10++;
                                    }
                                }
                                j13 = jM16416h;
                                j15 = c15205x.f47424s0;
                                obj2 = obj;
                                it2 = it;
                                jM16416h = j13;
                            }
                        } else {
                            obj = obj2;
                            i10 = 0;
                            i11 = 0;
                            j10 = 0;
                            j11 = 0;
                            j12 = 0;
                        }
                        int iCeil = i10 + i11;
                        C15240l c15240l = this.f47429c;
                        Choreographer choreographer = c15240l.f47563v0;
                        if (choreographer == null || (field = c15240l.f47564w0) == null) {
                            jLongValue = -1;
                        } else {
                            try {
                                Long l4 = (Long) field.get(choreographer);
                                if (l4 != null) {
                                    jLongValue = l4.longValue();
                                } else {
                                    jLongValue = -1;
                                }
                            } catch (IllegalAccessException unused) {
                            }
                        }
                        if (jLongValue != -1) {
                            long jMax = Math.max(0L, jM16416h2 - jLongValue);
                            if (jMax > j15) {
                                boolean z11 = jMax > C15240l.f47551A0;
                                long jMax2 = Math.max(0L, jMax - j15);
                                j10 += jMax;
                                if (z11) {
                                    j12 += jMax2;
                                    i12 = 1;
                                    i11++;
                                } else {
                                    i12 = 1;
                                    j11 += jMax2;
                                    i10++;
                                }
                            } else {
                                i12 = 0;
                            }
                            long j20 = j14 - j10;
                            iCeil = iCeil + i12 + (j20 > 0 ? (int) Math.ceil(j20 / j15) : 0);
                        }
                        double d10 = (j11 + j12) / 1.0E9d;
                        interfaceC15154Q.mo16280k(Integer.valueOf(iCeil), "frames.total");
                        interfaceC15154Q.mo16280k(Integer.valueOf(i10), "frames.slow");
                        interfaceC15154Q.mo16280k(Integer.valueOf(i11), "frames.frozen");
                        interfaceC15154Q.mo16280k(Double.valueOf(d10), "frames.delay");
                        if (interfaceC15154Q instanceof InterfaceC15159S) {
                            interfaceC15154Q.mo16277h(Integer.valueOf(iCeil), "frames_total");
                            interfaceC15154Q.mo16277h(Integer.valueOf(i10), "frames_slow");
                            interfaceC15154Q.mo16277h(Integer.valueOf(i11), "frames_frozen");
                            interfaceC15154Q.mo16277h(Double.valueOf(d10), "frames_delay");
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m16419e() {
        synchronized (this.f47428b) {
            try {
                if (this.f47430d != null) {
                    this.f47429c.m16441a(this.f47430d);
                    this.f47430d = null;
                }
                this.f47432f.clear();
                this.f47431e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m16420f(InterfaceC15154Q interfaceC15154Q) throws Throwable {
        if (!this.f47427a || (interfaceC15154Q instanceof C15509v0) || (interfaceC15154Q instanceof C15517w0)) {
            return;
        }
        synchronized (this.f47428b) {
            try {
                if (this.f47431e.contains(interfaceC15154Q)) {
                    m16418d(interfaceC15154Q);
                    synchronized (this.f47428b) {
                        try {
                            if (this.f47431e.isEmpty()) {
                                m16419e();
                            } else {
                                this.f47432f.headSet(new C15205X(m16416h(((InterfaceC15154Q) this.f47431e.first()).mo16292w()))).clear();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m16421g(InterfaceC15154Q interfaceC15154Q) {
        String str;
        if (!this.f47427a || (interfaceC15154Q instanceof C15509v0) || (interfaceC15154Q instanceof C15517w0)) {
            return;
        }
        synchronized (this.f47428b) {
            try {
                this.f47431e.add(interfaceC15154Q);
                if (this.f47430d == null) {
                    C15240l c15240l = this.f47429c;
                    if (c15240l.f47560s0) {
                        String string = UUID.randomUUID().toString();
                        c15240l.f47559r0.put(string, this);
                        c15240l.m16443c();
                        str = string;
                    } else {
                        str = null;
                    }
                    this.f47430d = str;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
