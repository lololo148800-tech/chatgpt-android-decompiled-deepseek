package io.sentry.android.core;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.C15107A0;
import io.sentry.C15356g;
import io.sentry.C15411n0;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15148O;
import io.sentry.android.core.internal.util.C15240l;
import io.sentry.profilemeasurements.C15419a;
import io.sentry.profilemeasurements.C15420b;
import java.io.File;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p057C3.C1563h0;
import p544W9.AbstractC8483G3;

/* JADX INFO: renamed from: io.sentry.android.core.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C15246o {

    /* JADX INFO: renamed from: b */
    public final File f47572b;

    /* JADX INFO: renamed from: c */
    public final int f47573c;

    /* JADX INFO: renamed from: f */
    public String f47576f;

    /* JADX INFO: renamed from: g */
    public final C15240l f47577g;

    /* JADX INFO: renamed from: l */
    public final C15184B f47582l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC15148O f47583m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC15127H f47584n;

    /* JADX INFO: renamed from: a */
    public long f47571a = 0;

    /* JADX INFO: renamed from: d */
    public Future f47574d = null;

    /* JADX INFO: renamed from: e */
    public File f47575e = null;

    /* JADX INFO: renamed from: h */
    public final ArrayDeque f47578h = new ArrayDeque();

    /* JADX INFO: renamed from: i */
    public final ArrayDeque f47579i = new ArrayDeque();

    /* JADX INFO: renamed from: j */
    public final ArrayDeque f47580j = new ArrayDeque();

    /* JADX INFO: renamed from: k */
    public final HashMap f47581k = new HashMap();

    /* JADX INFO: renamed from: o */
    public boolean f47585o = false;

    public C15246o(String str, int i10, C15240l c15240l, InterfaceC15148O interfaceC15148O, InterfaceC15127H interfaceC15127H, C15184B c15184b) {
        AbstractC8483G3.m9133c(str, "TracesFilesDirPath is required");
        this.f47572b = new File(str);
        this.f47573c = i10;
        AbstractC8483G3.m9133c(interfaceC15127H, "Logger is required");
        this.f47584n = interfaceC15127H;
        AbstractC8483G3.m9133c(interfaceC15148O, "ExecutorService is required.");
        this.f47583m = interfaceC15148O;
        AbstractC8483G3.m9133c(c15240l, "SentryFrameMetricsCollector is required");
        this.f47577g = c15240l;
        AbstractC8483G3.m9133c(c15184b, "The BuildInfoProvider is required.");
        this.f47582l = c15184b;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized C1563h0 m16446a(List list, boolean z6) {
        if (!this.f47585o) {
            this.f47584n.mo16298o(EnumC15375i1.WARNING, "Profiler not running", new Object[0]);
            return null;
        }
        this.f47582l.getClass();
        try {
            Debug.stopMethodTracing();
        } catch (Throwable th2) {
            try {
                this.f47584n.mo16297h(EnumC15375i1.ERROR, "Error while stopping profiling: ", th2);
            } catch (Throwable th3) {
                this.f47585o = false;
                throw th3;
            }
        }
        this.f47585o = false;
        this.f47577g.m16441a(this.f47576f);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        if (this.f47575e == null) {
            this.f47584n.mo16298o(EnumC15375i1.ERROR, "Trace file does not exists", new Object[0]);
            return null;
        }
        if (!this.f47579i.isEmpty()) {
            this.f47581k.put("slow_frame_renders", new C15419a("nanosecond", this.f47579i));
        }
        if (!this.f47580j.isEmpty()) {
            this.f47581k.put("frozen_frame_renders", new C15419a("nanosecond", this.f47580j));
        }
        if (!this.f47578h.isEmpty()) {
            this.f47581k.put("screen_frame_rates", new C15419a("hz", this.f47578h));
        }
        m16447b(list);
        Future future = this.f47574d;
        if (future != null) {
            future.cancel(true);
            this.f47574d = null;
        }
        return new C1563h0(jElapsedRealtimeNanos, elapsedCpuTime, z6, this.f47575e, this.f47581k);
    }

    /* JADX INFO: renamed from: b */
    public final void m16447b(List list) {
        this.f47582l.getClass();
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.f47571a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C15107A0 c15107a0 = (C15107A0) it.next();
                        C15356g c15356g = c15107a0.f47005b;
                        C15411n0 c15411n0 = c15107a0.f47004a;
                        if (c15356g != null) {
                            arrayDeque3.add(new C15420b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(c15356g.f47941a) + jElapsedRealtimeNanos), Double.valueOf(c15356g.f47942b)));
                        }
                        if (c15411n0 != null && c15411n0.f48032b > -1) {
                            arrayDeque.add(new C15420b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(c15411n0.f48031a) + jElapsedRealtimeNanos), Long.valueOf(c15411n0.f48032b)));
                        }
                        if (c15411n0 != null && c15411n0.f48033c > -1) {
                            arrayDeque2.add(new C15420b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(c15411n0.f48031a) + jElapsedRealtimeNanos), Long.valueOf(c15411n0.f48033c)));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.f47581k.put("cpu_usage", new C15419a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.f47581k.put("memory_footprint", new C15419a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.f47581k.put("memory_native_footprint", new C15419a("byte", arrayDeque2));
        }
    }
}
