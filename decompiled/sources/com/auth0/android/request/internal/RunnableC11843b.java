package com.auth0.android.request.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.SharedPreferences;
import android.javax.sip.C10808o;
import android.os.Build;
import android.view.Choreographer;
import androidx.activity.AbstractActivityC10817a;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.google.BillingWrapper;
import io.sentry.C15106A;
import io.sentry.C15126G1;
import io.sentry.C15153P1;
import io.sentry.C15397k;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15148O;
import io.sentry.SpotlightIntegration;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.C15198P;
import io.sentry.android.core.PhoneStateBreadcrumbsIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import io.sentry.android.core.TempSensorBreadcrumbsIntegration;
import io.sentry.android.core.internal.util.C15240l;
import io.sentry.cache.AbstractC15327a;
import io.sentry.cache.C15332f;
import io.sentry.protocol.C15425E;
import io.sentry.protocol.C15430c;
import io.sentry.protocol.C15447t;
import io.sentry.util.AbstractC15500e;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.AbstractC16544l;
import p035B7.EnumC0844a;
import p049Bm.InterfaceC1436k;
import p1038uc.C20183a;
import p1104xb.InterfaceC21170a;
import p1139z0.C21585H;
import p236J7.C4277a;
import p421R6.C6815a;
import p444S4.C7007m;
import p474T8.C7273k;
import p477Tb.C7296c;
import p497U6.InterfaceC7569a;
import p501Ub.ExecutorC7613o;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC8119j5;
import p594Y9.C9895g4;
import p658b5.C11241l;
import p661b7.EnumC11255b;
import p697d5.C13027j;
import p741f5.AbstractC13543b;
import p741f5.RunnableC13542a;
import p747fb.InterfaceFutureC13608b;
import p772h.C14215F;
import p775h2.AbstractC14376f;
import p780h7.C14422d;
import p780h7.C14423e;
import p784hb.C14437f;
import p804i8.C14943b;
import p817j$.util.concurrent.ConcurrentHashMap;
import p826j6.C16155i;
import p849k7.C16349b;
import p849k7.C16350c;
import p849k7.C16352e;
import p849k7.C16354g;
import p849k7.C16360m;
import p867l8.C16831c;
import p890mb.C17217n;
import p890mb.C17218o;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import tc.AbstractC19836a;
import vc.C20520d;

/* JADX INFO: renamed from: com.auth0.android.request.internal.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC11843b implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f35970Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f35971Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f35972o0;

    public /* synthetic */ RunnableC11843b(Object obj, int i10, Object obj2) {
        this.f35970Y = i10;
        this.f35971Z = obj;
        this.f35972o0 = obj2;
    }

    /* JADX INFO: renamed from: a */
    private final void m13155a() {
        C14943b this$0 = (C14943b) this.f35971Z;
        AbstractC8119j5 abstractC8119j5 = (AbstractC8119j5) this.f35972o0;
        AbstractC16544l.m18094g(this$0, "this$0");
        synchronized (this$0.f46560f) {
            this$0.f46560f.mo14927b(abstractC8119j5, this$0.f46556b);
        }
        this$0.f46557c.postDelayed(this$0.f46561g, C14943b.f46554j);
    }

    /* JADX INFO: renamed from: b */
    private final void m13156b() {
        AnrIntegration anrIntegration = (AnrIntegration) this.f35971Z;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f35972o0;
        synchronized (anrIntegration.f47291o0) {
            try {
                if (!anrIntegration.f47290Z) {
                    anrIntegration.m16369a(sentryAndroidOptions);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m13157c() {
        PhoneStateBreadcrumbsIntegration phoneStateBreadcrumbsIntegration = (PhoneStateBreadcrumbsIntegration) this.f35971Z;
        C15524y1 c15524y1 = (C15524y1) this.f35972o0;
        synchronized (phoneStateBreadcrumbsIntegration.f47377r0) {
            try {
                if (!phoneStateBreadcrumbsIntegration.f47376q0) {
                    phoneStateBreadcrumbsIntegration.m16405a(c15524y1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m13158d() {
        SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.f35971Z;
        C15524y1 c15524y1 = (C15524y1) this.f35972o0;
        synchronized (systemEventsBreadcrumbsIntegration.f47399r0) {
            try {
                if (!systemEventsBreadcrumbsIntegration.f47398q0) {
                    systemEventsBreadcrumbsIntegration.m16411a((SentryAndroidOptions) c15524y1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m13159e() {
        TempSensorBreadcrumbsIntegration tempSensorBreadcrumbsIntegration = (TempSensorBreadcrumbsIntegration) this.f35971Z;
        C15524y1 c15524y1 = (C15524y1) this.f35972o0;
        synchronized (tempSensorBreadcrumbsIntegration.f47409r0) {
            try {
                if (!tempSensorBreadcrumbsIntegration.f47408q0) {
                    tempSensorBreadcrumbsIntegration.m16412a(c15524y1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m13160f() {
        C16349b c16349b;
        C17218o c17218o = (C17218o) this.f35971Z;
        InterfaceC21170a interfaceC21170a = (InterfaceC21170a) this.f35972o0;
        if (c17218o.f54957b != C17218o.f54955d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (c17218o) {
            c16349b = c17218o.f54956a;
            c17218o.f54956a = null;
            c17218o.f54957b = interfaceC21170a;
        }
        c16349b.getClass();
    }

    /* JADX INFO: renamed from: g */
    private final void m13161g() {
        C17217n c17217n = (C17217n) this.f35971Z;
        InterfaceC21170a interfaceC21170a = (InterfaceC21170a) this.f35972o0;
        synchronized (c17217n) {
            try {
                if (c17217n.f54953b == null) {
                    c17217n.f54952a.add(interfaceC21170a);
                } else {
                    c17217n.f54953b.add(interfaceC21170a.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String spotlightConnectionUrl;
        Context contextCreateDeviceProtectedStorageContext;
        int i10 = 2;
        int i11 = 4;
        switch (this.f35970Y) {
            case 0:
                InterfaceC7569a callback = (InterfaceC7569a) this.f35971Z;
                AbstractC16544l.m18094g(callback, "$callback");
                C6815a uError = (C6815a) this.f35972o0;
                AbstractC16544l.m18094g(uError, "$uError");
                callback.mo7759f(uError);
                return;
            case 1:
                Dispatcher.enqueue$lambda$2$lambda$1((Runnable) this.f35971Z, (Dispatcher) this.f35972o0);
                return;
            case 2:
                BillingWrapper.onBillingSetupFinished$lambda$18((C16155i) this.f35971Z, (BillingWrapper) this.f35972o0);
                return;
            case 3:
                BillingWrapper.sendErrorsToAllPendingRequests$lambda$31$lambda$30((InterfaceC1436k) this.f35971Z, (PurchasesError) this.f35972o0);
                return;
            case 4:
                int i12 = JobInfoSchedulerService.f36003Y;
                ((JobInfoSchedulerService) this.f35971Z).jobFinished((JobParameters) this.f35972o0, false);
                return;
            case 5:
                ConstraintTrackingWorker this$0 = (ConstraintTrackingWorker) this.f35971Z;
                InterfaceFutureC13608b interfaceFutureC13608b = (InterfaceFutureC13608b) this.f35972o0;
                AbstractC16544l.m18094g(this$0, "this$0");
                synchronized (this$0.f33738r0) {
                    try {
                        if (this$0.f33739s0) {
                            C13027j future = this$0.f33740t0;
                            AbstractC16544l.m18093f(future, "future");
                            String str = AbstractC13543b.f42866a;
                            future.m14769k(new C7007m());
                        } else {
                            this$0.f33740t0.m14771m(interfaceFutureC13608b);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 6:
                AbstractActivityC10817a abstractActivityC10817a = (AbstractActivityC10817a) this.f35971Z;
                C14215F c14215f = (C14215F) this.f35972o0;
                int i13 = AbstractActivityC10817a.f32056F0;
                abstractActivityC10817a.f55801Y.mo7806a(new C7273k(c14215f, i10, abstractActivityC10817a));
                return;
            case 7:
                m13155a();
                return;
            case 8:
                ((C15397k) this.f35971Z).mo16352n((C15126G1) this.f35972o0);
                return;
            case 9:
                ((InterfaceC15148O) this.f35972o0).mo15965d(((C15106A) this.f35971Z).f46998a.getShutdownTimeoutMillis());
                return;
            case 10:
                C11241l c11241l = (C11241l) this.f35972o0;
                SpotlightIntegration spotlightIntegration = (SpotlightIntegration) this.f35971Z;
                try {
                    C15524y1 c15524y1 = spotlightIntegration.f47216Y;
                    if (c15524y1 == null) {
                        throw new IllegalArgumentException("SentryOptions are required to send envelopes.");
                    }
                    if (c15524y1.getSpotlightConnectionUrl() != null) {
                        spotlightConnectionUrl = spotlightIntegration.f47216Y.getSpotlightConnectionUrl();
                    } else {
                        spotlightConnectionUrl = AbstractC15500e.f48420a ? "http://10.0.2.2:8969/stream" : "http://localhost:8969/stream";
                    }
                    HttpURLConnection httpURLConnectionM16345e = SpotlightIntegration.m16345e(spotlightConnectionUrl);
                    try {
                        OutputStream outputStream = httpURLConnectionM16345e.getOutputStream();
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                            try {
                                spotlightIntegration.f47216Y.getSerializer().mo16322b(c11241l, gZIPOutputStream);
                                gZIPOutputStream.close();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                spotlightIntegration.f47217Z.mo16298o(EnumC15375i1.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionM16345e.getResponseCode()));
                            } catch (Throwable th3) {
                                try {
                                    gZIPOutputStream.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th5) {
                            if (outputStream == null) {
                                throw th5;
                            }
                            try {
                                outputStream.close();
                                throw th5;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                            spotlightIntegration.f47217Z.mo16297h(EnumC15375i1.ERROR, "An exception occurred while creating the connection to spotlight.", e);
                            return;
                        }
                    } catch (Throwable th7) {
                        try {
                            spotlightIntegration.f47217Z.mo16297h(EnumC15375i1.ERROR, "An exception occurred while submitting the envelope to the Sentry server.", th7);
                            spotlightIntegration.f47217Z.mo16298o(EnumC15375i1.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionM16345e.getResponseCode()));
                            return;
                        } finally {
                            spotlightIntegration.f47217Z.mo16298o(EnumC15375i1.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionM16345e.getResponseCode()));
                            SpotlightIntegration.m16344a(httpURLConnectionM16345e);
                        }
                    }
                    return;
                } catch (Exception e10) {
                    spotlightIntegration.f47217Z.mo16297h(EnumC15375i1.ERROR, "An exception occurred while creating the connection to spotlight.", e10);
                    return;
                }
            case 11:
                m13156b();
                return;
            case 12:
                m13157c();
                return;
            case 13:
                m13158d();
                return;
            case 14:
                m13159e();
                return;
            case 15:
                C15240l c15240l = (C15240l) this.f35971Z;
                c15240l.getClass();
                try {
                    c15240l.f47563v0 = Choreographer.getInstance();
                    return;
                } catch (Throwable th8) {
                    ((C15198P) this.f35972o0).mo16297h(EnumC15375i1.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th8);
                    return;
                }
            case 16:
                RunnableC13542a runnableC13542a = (RunnableC13542a) this.f35971Z;
                C15524y1 c15524y2 = (C15524y1) this.f35972o0;
                try {
                    runnableC13542a.run();
                    return;
                } catch (Throwable th9) {
                    c15524y2.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to execute task ".concat("WindowRecorder.capture"), th9);
                    return;
                }
            case 17:
                RunnableC13542a runnableC13542a2 = (RunnableC13542a) this.f35971Z;
                C15524y1 options = (C15524y1) this.f35972o0;
                AbstractC16544l.m18094g(options, "$options");
                try {
                    runnableC13542a2.run();
                    return;
                } catch (Throwable th10) {
                    options.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to execute task ".concat("ReplayIntegration.finalize_previous_replay"), th10);
                    return;
                }
            case 18:
                ((C15332f) this.f35971Z).m16549j((C15425E) this.f35972o0, "user.json");
                return;
            case 19:
                ((C15332f) this.f35971Z).m16549j((ConcurrentHashMap) this.f35972o0, "tags.json");
                return;
            case 20:
                ((C15332f) this.f35971Z).m16549j((C15430c) this.f35972o0, "contexts.json");
                return;
            case 21:
                ((C15332f) this.f35971Z).m16549j((C15153P1) this.f35972o0, "breadcrumbs.json");
                return;
            case 22:
                C15332f c15332f = (C15332f) this.f35971Z;
                String str2 = (String) this.f35972o0;
                if (str2 == null) {
                    AbstractC15327a.m16535a(c15332f.f47884a, ".scope-cache", "transaction.json");
                    return;
                } else {
                    c15332f.m16549j(str2, "transaction.json");
                    return;
                }
            case 23:
                Runnable runnable = (Runnable) this.f35972o0;
                C15332f c15332f2 = (C15332f) this.f35971Z;
                c15332f2.getClass();
                try {
                    runnable.run();
                    return;
                } catch (Throwable th11) {
                    c15332f2.f47884a.getLogger().mo16297h(EnumC15375i1.ERROR, "Serialization task failed", th11);
                    return;
                }
            case 24:
                ((C15332f) this.f35971Z).m16549j((C15447t) this.f35972o0, "replay.json");
                return;
            case 25:
                C16352e c16352e = (C16352e) this.f35971Z;
                Context appContext = (Context) this.f35972o0;
                AbstractC16544l.m18094g(appContext, "$appContext");
                if (Build.VERSION.SDK_INT >= 24 && (contextCreateDeviceProtectedStorageContext = appContext.createDeviceProtectedStorageContext()) != null) {
                    appContext = contextCreateDeviceProtectedStorageContext;
                }
                List listM19382k = AbstractC17681o.m19382k(EnumC0844a.NTP_0, EnumC0844a.NTP_1, EnumC0844a.NTP_2, EnumC0844a.NTP_3);
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listM19382k, 10));
                Iterator it = listM19382k.iterator();
                while (it.hasNext()) {
                    arrayList.add(((EnumC0844a) it.next()).f2355Y);
                }
                TimeUnit timeUnit = TimeUnit.MINUTES;
                long millis = timeUnit.toMillis(30L);
                long millis2 = timeUnit.toMillis(5L);
                C10808o c10808o = new C10808o(c16352e.f50762a);
                long j10 = AbstractC19836a.f62904b;
                long j11 = AbstractC19836a.f62905c;
                C16831c c16831c = new C16831c();
                SharedPreferences sharedPreferences = appContext.getSharedPreferences("com.lyft.kronos.shared_preferences", 0);
                AbstractC16544l.m18093f(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
                C14437f c14437f = new C14437f(sharedPreferences);
                C9895g4 c9895g4 = new C9895g4();
                c9895g4.f29409Y = c16831c;
                C20520d c20520d = new C20520d(c9895g4, c16831c, new C21585H(c14437f, 20, c16831c), c10808o, arrayList, j10, millis2, millis, j11);
                C20183a c20183a = new C20183a(c20520d, c16831c);
                try {
                    c20520d.m21186b();
                    break;
                } catch (IllegalStateException e11) {
                    AbstractC7889G0.m8184b(c16352e.f50762a, 5, EnumC11255b.f34099Z, C16350c.f50732o0, e11, false, 48);
                }
                c16352e.f50769h = new C7296c(c20183a, i11);
                c16352e.f50774m = c20183a;
                return;
            case 26:
                C16354g this$1 = (C16354g) this.f35971Z;
                AbstractC16544l.m18094g(this$1, "this$0");
                C14423e c14423e = (C14423e) this.f35972o0;
                C16360m c16360mMo15458n = this$1.mo15458n("rum");
                if (c16360mMo15458n == null) {
                    return;
                }
                C14422d c14422d = c14423e.f45331a;
                c16360mMo15458n.m17960a(new C4277a(c14423e.f45336f, AbstractC14376f.m15855u(c14422d.f45322d), AbstractC14376f.m15853s(c14422d.f45323e), c14422d.f45324f != null, AbstractC14376f.m15854t(c14422d.f45327i)));
                return;
            case 27:
                m13160f();
                return;
            case 28:
                m13161g();
                return;
            default:
                Runnable runnable2 = (Runnable) this.f35972o0;
                ExecutorC7613o executorC7613o = (ExecutorC7613o) this.f35971Z;
                executorC7613o.getClass();
                try {
                    runnable2.run();
                    return;
                } finally {
                    executorC7613o.m7960c();
                }
        }
    }
}
