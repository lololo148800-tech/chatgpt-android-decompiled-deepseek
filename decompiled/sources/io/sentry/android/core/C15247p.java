package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import com.openai.chatgpt.app.MainApplication;
import io.sentry.AbstractC15152P0;
import io.sentry.C15113C0;
import io.sentry.C15116D0;
import io.sentry.C15126G1;
import io.sentry.C15524y1;
import io.sentry.CallableC15519x;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15148O;
import io.sentry.InterfaceC15162T;
import io.sentry.android.core.internal.util.C15240l;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import livekit.org.webrtc.WebrtcBuildVersion;
import p001A.C0012G;
import p057C3.C1563h0;
import p544W9.AbstractC8483G3;
import p544W9.AbstractC8656j3;
import p741f5.RunnableC13542a;

/* JADX INFO: renamed from: io.sentry.android.core.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C15247p implements InterfaceC15162T {

    /* JADX INFO: renamed from: A0 */
    public Date f47586A0;

    /* JADX INFO: renamed from: Y */
    public final Context f47587Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC15127H f47588Z;

    /* JADX INFO: renamed from: o0 */
    public final String f47589o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f47590p0;

    /* JADX INFO: renamed from: q0 */
    public final int f47591q0;

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC15148O f47592r0;

    /* JADX INFO: renamed from: s0 */
    public final C15184B f47593s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f47594t0;

    /* JADX INFO: renamed from: u0 */
    public int f47595u0;

    /* JADX INFO: renamed from: v0 */
    public final C15240l f47596v0;

    /* JADX INFO: renamed from: w0 */
    public C15116D0 f47597w0;

    /* JADX INFO: renamed from: x0 */
    public C15246o f47598x0;

    /* JADX INFO: renamed from: y0 */
    public long f47599y0;

    /* JADX INFO: renamed from: z0 */
    public long f47600z0;

    public C15247p(MainApplication mainApplication, SentryAndroidOptions sentryAndroidOptions, C15184B c15184b, C15240l c15240l) {
        InterfaceC15127H logger = sentryAndroidOptions.getLogger();
        String profilingTracesDirPath = sentryAndroidOptions.getProfilingTracesDirPath();
        boolean zIsProfilingEnabled = sentryAndroidOptions.isProfilingEnabled();
        int profilingTracesHz = sentryAndroidOptions.getProfilingTracesHz();
        InterfaceC15148O executorService = sentryAndroidOptions.getExecutorService();
        this.f47594t0 = false;
        this.f47595u0 = 0;
        this.f47598x0 = null;
        Context applicationContext = mainApplication.getApplicationContext();
        this.f47587Y = applicationContext != null ? applicationContext : mainApplication;
        AbstractC8483G3.m9133c(logger, "ILogger is required");
        this.f47588Z = logger;
        this.f47596v0 = c15240l;
        this.f47593s0 = c15184b;
        this.f47589o0 = profilingTracesDirPath;
        this.f47590p0 = zIsProfilingEnabled;
        this.f47591q0 = profilingTracesHz;
        AbstractC8483G3.m9133c(executorService, "The ISentryExecutorService is required.");
        this.f47592r0 = executorService;
        this.f47586A0 = AbstractC8656j3.m9340h();
    }

    /* JADX INFO: renamed from: a */
    public final void m16448a() {
        if (this.f47594t0) {
            return;
        }
        this.f47594t0 = true;
        boolean z6 = this.f47590p0;
        InterfaceC15127H interfaceC15127H = this.f47588Z;
        if (!z6) {
            interfaceC15127H.mo16298o(EnumC15375i1.INFO, "Profiling is disabled in options.", new Object[0]);
            return;
        }
        String str = this.f47589o0;
        if (str == null) {
            interfaceC15127H.mo16298o(EnumC15375i1.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i10 = this.f47591q0;
        if (i10 <= 0) {
            interfaceC15127H.mo16298o(EnumC15375i1.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i10));
        } else {
            this.f47598x0 = new C15246o(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / i10, this.f47596v0, this.f47592r0, this.f47588Z, this.f47593s0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m16449b() {
        C0012G c0012g;
        String string;
        C15246o c15246o = this.f47598x0;
        if (c15246o == null) {
            return false;
        }
        synchronized (c15246o) {
            try {
                int i10 = c15246o.f47573c;
                c0012g = null;
                if (i10 == 0) {
                    c15246o.f47584n.mo16298o(EnumC15375i1.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i10));
                } else if (c15246o.f47585o) {
                    c15246o.f47584n.mo16298o(EnumC15375i1.WARNING, "Profiling has already started...", new Object[0]);
                } else {
                    c15246o.f47582l.getClass();
                    c15246o.f47575e = new File(c15246o.f47572b, UUID.randomUUID() + ".trace");
                    c15246o.f47581k.clear();
                    c15246o.f47578h.clear();
                    c15246o.f47579i.clear();
                    c15246o.f47580j.clear();
                    C15240l c15240l = c15246o.f47577g;
                    C15245n c15245n = new C15245n(c15246o);
                    if (c15240l.f47560s0) {
                        string = UUID.randomUUID().toString();
                        c15240l.f47559r0.put(string, c15245n);
                        c15240l.m16443c();
                    } else {
                        string = null;
                    }
                    c15246o.f47576f = string;
                    try {
                        c15246o.f47574d = c15246o.f47583m.mo15970r(new RunnableC13542a(c15246o, 6), 30000L);
                    } catch (RejectedExecutionException e10) {
                        c15246o.f47584n.mo16297h(EnumC15375i1.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e10);
                    }
                    c15246o.f47571a = SystemClock.elapsedRealtimeNanos();
                    Date dateM9340h = AbstractC8656j3.m9340h();
                    long elapsedCpuTime = Process.getElapsedCpuTime();
                    try {
                        Debug.startMethodTracingSampling(c15246o.f47575e.getPath(), 3000000, c15246o.f47573c);
                        c15246o.f47585o = true;
                        c0012g = new C0012G(c15246o.f47571a, elapsedCpuTime, dateM9340h);
                    } catch (Throwable th2) {
                        c15246o.m16446a(null, false);
                        c15246o.f47584n.mo16297h(EnumC15375i1.ERROR, "Unable to start a profile: ", th2);
                        c15246o.f47585o = false;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (c0012g == null) {
            return false;
        }
        this.f47599y0 = c0012g.f49a;
        this.f47600z0 = c0012g.f50b;
        this.f47586A0 = (Date) c0012g.f51c;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized C15113C0 m16450c(String str, String str2, String str3, boolean z6, List list, C15524y1 c15524y1) {
        try {
            ActivityManager.MemoryInfo memoryInfo = null;
            if (this.f47598x0 == null) {
                return null;
            }
            this.f47593s0.getClass();
            C15116D0 c15116d0 = this.f47597w0;
            if (c15116d0 != null && c15116d0.f47059Y.equals(str2)) {
                int i10 = this.f47595u0;
                if (i10 > 0) {
                    this.f47595u0 = i10 - 1;
                }
                this.f47588Z.mo16298o(EnumC15375i1.DEBUG, "Transaction %s (%s) finished.", str, str3);
                if (this.f47595u0 != 0) {
                    C15116D0 c15116d1 = this.f47597w0;
                    if (c15116d1 != null) {
                        c15116d1.m16260a(Long.valueOf(SystemClock.elapsedRealtimeNanos()), Long.valueOf(this.f47599y0), Long.valueOf(Process.getElapsedCpuTime()), Long.valueOf(this.f47600z0));
                    }
                    return null;
                }
                C1563h0 c1563h0M16446a = this.f47598x0.m16446a(list, false);
                if (c1563h0M16446a == null) {
                    return null;
                }
                long j10 = c1563h0M16446a.f4360Y - this.f47599y0;
                ArrayList arrayList = new ArrayList(1);
                C15116D0 c15116d2 = this.f47597w0;
                if (c15116d2 != null) {
                    arrayList.add(c15116d2);
                }
                this.f47597w0 = null;
                this.f47595u0 = 0;
                InterfaceC15127H interfaceC15127H = this.f47588Z;
                try {
                    ActivityManager activityManager = (ActivityManager) this.f47587Y.getSystemService("activity");
                    ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                    if (activityManager != null) {
                        activityManager.getMemoryInfo(memoryInfo2);
                        memoryInfo = memoryInfo2;
                    } else {
                        interfaceC15127H.mo16298o(EnumC15375i1.INFO, "Error getting MemoryInfo.", new Object[0]);
                    }
                } catch (Throwable th2) {
                    interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Error getting MemoryInfo.", th2);
                }
                String string = memoryInfo != null ? Long.toString(memoryInfo.totalMem) : WebrtcBuildVersion.maint_version;
                String[] strArr = Build.SUPPORTED_ABIS;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C15116D0) it.next()).m16260a(Long.valueOf(c1563h0M16446a.f4360Y), Long.valueOf(this.f47599y0), Long.valueOf(c1563h0M16446a.f4361Z), Long.valueOf(this.f47600z0));
                }
                File file = (File) c1563h0M16446a.f4363p0;
                Date date = this.f47586A0;
                String string2 = Long.toString(j10);
                this.f47593s0.getClass();
                int i11 = Build.VERSION.SDK_INT;
                String str4 = (strArr == null || strArr.length <= 0) ? "" : strArr[0];
                CallableC15519x callableC15519x = new CallableC15519x(3);
                this.f47593s0.getClass();
                String str5 = Build.MANUFACTURER;
                this.f47593s0.getClass();
                String str6 = Build.MODEL;
                this.f47593s0.getClass();
                return new C15113C0(file, date, arrayList, str, str2, str3, string2, i11, str4, callableC15519x, str5, str6, Build.VERSION.RELEASE, this.f47593s0.m16375b(), string, c15524y1.getProguardUuid(), c15524y1.getRelease(), c15524y1.getEnvironment(), (c1563h0M16446a.f4362o0 || z6) ? "timeout" : "normal", (HashMap) c1563h0M16446a.f4364q0);
            }
            this.f47588Z.mo16298o(EnumC15375i1.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
            return null;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // io.sentry.InterfaceC15162T
    public final void close() {
        C15116D0 c15116d0 = this.f47597w0;
        if (c15116d0 != null) {
            m16450c(c15116d0.f47061o0, c15116d0.f47059Y, c15116d0.f47060Z, true, null, AbstractC15152P0.m16331e().mo16246j());
        } else {
            int i10 = this.f47595u0;
            if (i10 != 0) {
                this.f47595u0 = i10 - 1;
            }
        }
        C15246o c15246o = this.f47598x0;
        if (c15246o != null) {
            synchronized (c15246o) {
                try {
                    Future future = c15246o.f47574d;
                    if (future != null) {
                        future.cancel(true);
                        c15246o.f47574d = null;
                    }
                    if (c15246o.f47585o) {
                        c15246o.m16446a(null, true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // io.sentry.InterfaceC15162T
    public final boolean isRunning() {
        return this.f47595u0 != 0;
    }

    @Override // io.sentry.InterfaceC15162T
    /* JADX INFO: renamed from: j */
    public final synchronized void mo16346j(C15126G1 c15126g1) {
        if (this.f47595u0 > 0 && this.f47597w0 == null) {
            this.f47597w0 = new C15116D0(c15126g1, Long.valueOf(this.f47599y0), Long.valueOf(this.f47600z0));
        }
    }

    @Override // io.sentry.InterfaceC15162T
    /* JADX INFO: renamed from: l */
    public final synchronized C15113C0 mo16347l(C15126G1 c15126g1, List list, C15524y1 c15524y1) {
        return m16450c(c15126g1.f47079e, c15126g1.f47075a.toString(), c15126g1.f47076b.f47133c.f47144Y.toString(), false, list, c15524y1);
    }

    @Override // io.sentry.InterfaceC15162T
    public final synchronized void start() {
        try {
            this.f47593s0.getClass();
            m16448a();
            int i10 = this.f47595u0 + 1;
            this.f47595u0 = i10;
            if (i10 == 1 && m16449b()) {
                this.f47588Z.mo16298o(EnumC15375i1.DEBUG, "Profiler started.", new Object[0]);
            } else {
                this.f47595u0--;
                this.f47588Z.mo16298o(EnumC15375i1.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
