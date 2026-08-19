package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.core.app.FrameMetricsAggregator;
import com.openai.chatgpt.app.MainApplication;
import io.sentry.C15114C1;
import io.sentry.C15358g1;
import io.sentry.C15373i;
import io.sentry.C15397k;
import io.sentry.C15417p0;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.android.core.cache.C15212a;
import io.sentry.android.core.internal.gestures.C15219a;
import io.sentry.android.core.internal.util.C15230b;
import io.sentry.android.core.internal.util.C15240l;
import io.sentry.android.core.performance.C15251d;
import io.sentry.android.core.performance.C15252e;
import io.sentry.cache.C15331e;
import io.sentry.cache.C15332f;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.internal.debugmeta.C15384c;
import io.sentry.internal.modules.C15393f;
import io.sentry.protocol.C15445r;
import io.sentry.transport.C15485h;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import p315Me.Myis.CxcULo;
import p544W9.AbstractC8483G3;
import p544W9.AbstractC8489H3;
import p658b5.C11238i;
import p791hj.C14522e;
import p817j$.util.concurrent.ConcurrentHashMap;
import p849k7.C16349b;

/* JADX INFO: renamed from: io.sentry.android.core.g */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15216g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f47470a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f47471b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f47472c;

    public /* synthetic */ C15216g(Object obj, Object obj2, Object obj3) {
        this.f47470a = obj;
        this.f47471b = obj2;
        this.f47472c = obj3;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX INFO: renamed from: a */
    public void m16424a(C15524y1 c15524y1) {
        boolean z6;
        C16349b c16349b;
        C15198P c15198p = (C15198P) this.f47470a;
        MainApplication mainApplication = (MainApplication) this.f47471b;
        C16349b c16349b2 = (C16349b) this.f47472c;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) c15524y1;
        boolean zM16403a = C15198P.m16403a(sentryAndroidOptions, "timber.log.Timber");
        boolean z10 = C15198P.m16403a(sentryAndroidOptions, "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks") && C15198P.m16403a(sentryAndroidOptions, "io.sentry.android.fragment.FragmentLifecycleIntegration");
        boolean z11 = zM16403a && C15198P.m16403a(sentryAndroidOptions, "io.sentry.android.timber.SentryTimberIntegration");
        boolean zM16403a2 = C15198P.m16403a(sentryAndroidOptions, "io.sentry.android.replay.ReplayIntegration");
        C15184B c15184b = new C15184B(c15198p);
        C15198P c15198p2 = new C15198P();
        C15184B c15184b2 = new C15184B();
        C14522e c14522e = new C14522e();
        c14522e.f45761Y = null;
        c14522e.f45763o0 = new ConcurrentHashMap();
        c14522e.f45764p0 = new WeakHashMap();
        if (C15198P.m16404b("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger()) != null) {
            c14522e.f45761Y = new FrameMetricsAggregator();
        }
        c14522e.f45762Z = sentryAndroidOptions;
        c14522e.f45765q0 = c15184b2;
        Context applicationContext = mainApplication.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = mainApplication;
        }
        sentryAndroidOptions.setLogger(c15198p);
        sentryAndroidOptions.setDateProvider(new C15203V());
        boolean z12 = z10;
        sentryAndroidOptions.setFlushTimeoutMillis(4000L);
        sentryAndroidOptions.setFrameMetricsCollector(new C15240l(applicationContext, c15198p, c15184b));
        try {
            sentryAndroidOptions.getLogger();
            Bundle bundle = (Build.VERSION.SDK_INT >= 33 ? applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128)).metaData;
            InterfaceC15127H logger = sentryAndroidOptions.getLogger();
            try {
                if (bundle != null) {
                    sentryAndroidOptions.setDebug(AbstractC15256t.m16474l(bundle, logger, "io.sentry.debug", sentryAndroidOptions.isDebug()));
                    if (sentryAndroidOptions.isDebug()) {
                        String strName = sentryAndroidOptions.getDiagnosticLevel().name();
                        Locale locale = Locale.ROOT;
                        String strM16479q = AbstractC15256t.m16479q(bundle, logger, "io.sentry.debug.level", strName.toLowerCase(locale));
                        if (strM16479q != null) {
                            sentryAndroidOptions.setDiagnosticLevel(EnumC15375i1.valueOf(strM16479q.toUpperCase(locale)));
                        }
                    }
                    sentryAndroidOptions.setAnrEnabled(AbstractC15256t.m16474l(bundle, logger, "io.sentry.anr.enable", sentryAndroidOptions.isAnrEnabled()));
                    sentryAndroidOptions.setEnableAutoSessionTracking(AbstractC15256t.m16474l(bundle, logger, "io.sentry.auto-session-tracking.enable", AbstractC15256t.m16474l(bundle, logger, "io.sentry.session-tracking.enable", sentryAndroidOptions.isEnableAutoSessionTracking())));
                    if (sentryAndroidOptions.getSampleRate() == null) {
                        Double dM16476n = AbstractC15256t.m16476n(bundle, logger, "io.sentry.sample-rate");
                        if (dM16476n.doubleValue() != -1.0d) {
                            sentryAndroidOptions.setSampleRate(dM16476n);
                        }
                    }
                    sentryAndroidOptions.setAnrReportInDebug(AbstractC15256t.m16474l(bundle, logger, "io.sentry.anr.report-debug", sentryAndroidOptions.isAnrReportInDebug()));
                    z6 = zM16403a2;
                    c16349b = c16349b2;
                    try {
                        sentryAndroidOptions.setAnrTimeoutIntervalMillis(AbstractC15256t.m16478p(bundle, logger, "io.sentry.anr.timeout-interval-millis", sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                        sentryAndroidOptions.setAttachAnrThreadDump(AbstractC15256t.m16474l(bundle, logger, "io.sentry.anr.attach-thread-dumps", sentryAndroidOptions.isAttachAnrThreadDump()));
                        String strM16479q2 = AbstractC15256t.m16479q(bundle, logger, "io.sentry.dsn", sentryAndroidOptions.getDsn());
                        boolean zM16474l = AbstractC15256t.m16474l(bundle, logger, "io.sentry.enabled", sentryAndroidOptions.isEnabled());
                        if (!zM16474l || (strM16479q2 != null && strM16479q2.isEmpty())) {
                            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);
                        } else if (strM16479q2 == null) {
                            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                        }
                        sentryAndroidOptions.setEnabled(zM16474l);
                        sentryAndroidOptions.setDsn(strM16479q2);
                        sentryAndroidOptions.setEnableNdk(AbstractC15256t.m16474l(bundle, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                        sentryAndroidOptions.setEnableScopeSync(AbstractC15256t.m16474l(bundle, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                        sentryAndroidOptions.setRelease(AbstractC15256t.m16479q(bundle, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                        sentryAndroidOptions.setEnvironment(AbstractC15256t.m16479q(bundle, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                        sentryAndroidOptions.setSessionTrackingIntervalMillis(AbstractC15256t.m16478p(bundle, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                        sentryAndroidOptions.setMaxBreadcrumbs((int) AbstractC15256t.m16478p(bundle, logger, "io.sentry.max-breadcrumbs", sentryAndroidOptions.getMaxBreadcrumbs()));
                        sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(AbstractC15256t.m16474l(bundle, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                        sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(AbstractC15256t.m16474l(bundle, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                        sentryAndroidOptions.setEnableSystemEventBreadcrumbs(AbstractC15256t.m16474l(bundle, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                        sentryAndroidOptions.setEnableAppComponentBreadcrumbs(AbstractC15256t.m16474l(bundle, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                        sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(AbstractC15256t.m16474l(bundle, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                        sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(AbstractC15256t.m16474l(bundle, logger, "io.sentry.breadcrumbs.network-events", sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                        sentryAndroidOptions.setEnableUncaughtExceptionHandler(AbstractC15256t.m16474l(bundle, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                        sentryAndroidOptions.setAttachThreads(AbstractC15256t.m16474l(bundle, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                        sentryAndroidOptions.setAttachScreenshot(AbstractC15256t.m16474l(bundle, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                        sentryAndroidOptions.setAttachViewHierarchy(AbstractC15256t.m16474l(bundle, logger, CxcULo.tcWJcoutBrQP, sentryAndroidOptions.isAttachViewHierarchy()));
                        sentryAndroidOptions.setSendClientReports(AbstractC15256t.m16474l(bundle, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                        sentryAndroidOptions.setCollectAdditionalContext(AbstractC15256t.m16474l(bundle, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                        if (sentryAndroidOptions.getEnableTracing() == null) {
                            sentryAndroidOptions.setEnableTracing(AbstractC15256t.m16475m(bundle, logger));
                        }
                        if (sentryAndroidOptions.getTracesSampleRate() == null) {
                            Double dM16476n2 = AbstractC15256t.m16476n(bundle, logger, "io.sentry.traces.sample-rate");
                            if (dM16476n2.doubleValue() != -1.0d) {
                                sentryAndroidOptions.setTracesSampleRate(dM16476n2);
                            }
                        }
                        sentryAndroidOptions.setTraceSampling(AbstractC15256t.m16474l(bundle, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                        sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(AbstractC15256t.m16474l(bundle, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                        sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(AbstractC15256t.m16474l(bundle, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                        sentryAndroidOptions.setProfilingEnabled(AbstractC15256t.m16474l(bundle, logger, "io.sentry.traces.profiling.enable", sentryAndroidOptions.isProfilingEnabled()));
                        if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                            Double dM16476n3 = AbstractC15256t.m16476n(bundle, logger, "io.sentry.traces.profiling.sample-rate");
                            if (dM16476n3.doubleValue() != -1.0d) {
                                sentryAndroidOptions.setProfilesSampleRate(dM16476n3);
                            }
                        }
                        sentryAndroidOptions.setEnableUserInteractionTracing(AbstractC15256t.m16474l(bundle, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                        sentryAndroidOptions.setEnableTimeToFullDisplayTracing(AbstractC15256t.m16474l(bundle, logger, "io.sentry.traces.time-to-full-display.enable", sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                        long jM16478p = AbstractC15256t.m16478p(bundle, logger, "io.sentry.traces.idle-timeout", -1L);
                        if (jM16478p != -1) {
                            sentryAndroidOptions.setIdleTimeout(Long.valueOf(jM16478p));
                        }
                        List<String> listM16477o = AbstractC15256t.m16477o(bundle, logger, "io.sentry.traces.trace-propagation-targets");
                        if (!bundle.containsKey("io.sentry.traces.trace-propagation-targets") && (listM16477o == null || listM16477o.isEmpty())) {
                            listM16477o = AbstractC15256t.m16477o(bundle, logger, "io.sentry.traces.tracing-origins");
                        }
                        if ((bundle.containsKey("io.sentry.traces.trace-propagation-targets") || bundle.containsKey("io.sentry.traces.tracing-origins")) && listM16477o == null) {
                            sentryAndroidOptions.setTracePropagationTargets(Collections.emptyList());
                        } else if (listM16477o != null) {
                            sentryAndroidOptions.setTracePropagationTargets(listM16477o);
                        }
                        sentryAndroidOptions.setEnableFramesTracking(AbstractC15256t.m16474l(bundle, logger, "io.sentry.traces.frames-tracking", true));
                        sentryAndroidOptions.setProguardUuid(AbstractC15256t.m16479q(bundle, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                        C15445r sdkVersion = sentryAndroidOptions.getSdkVersion();
                        if (sdkVersion == null) {
                            sdkVersion = new C15445r("", "");
                        }
                        String strM16480r = AbstractC15256t.m16480r(bundle, logger, "io.sentry.sdk.name", sdkVersion.f48204Y);
                        AbstractC8483G3.m9133c(strM16480r, "name is required.");
                        sdkVersion.f48204Y = strM16480r;
                        String strM16480r2 = AbstractC15256t.m16480r(bundle, logger, "io.sentry.sdk.version", sdkVersion.f48205Z);
                        AbstractC8483G3.m9133c(strM16480r2, "version is required.");
                        sdkVersion.f48205Z = strM16480r2;
                        sentryAndroidOptions.setSdkVersion(sdkVersion);
                        sentryAndroidOptions.setSendDefaultPii(AbstractC15256t.m16474l(bundle, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
                        List listM16477o2 = AbstractC15256t.m16477o(bundle, logger, "io.sentry.gradle-plugin-integrations");
                        if (listM16477o2 != null) {
                            Iterator it = listM16477o2.iterator();
                            while (it.hasNext()) {
                                C15358g1.m16578n().m16579d((String) it.next());
                            }
                        }
                        sentryAndroidOptions.setEnableRootCheck(AbstractC15256t.m16474l(bundle, logger, "io.sentry.enable-root-check", sentryAndroidOptions.isEnableRootCheck()));
                        sentryAndroidOptions.setSendModules(AbstractC15256t.m16474l(bundle, logger, "io.sentry.send-modules", sentryAndroidOptions.isSendModules()));
                        sentryAndroidOptions.setEnablePerformanceV2(AbstractC15256t.m16474l(bundle, logger, "io.sentry.performance-v2.enable", sentryAndroidOptions.isEnablePerformanceV2()));
                        sentryAndroidOptions.setEnableAppStartProfiling(AbstractC15256t.m16474l(bundle, logger, "io.sentry.profiling.enable-app-start", sentryAndroidOptions.isEnableAppStartProfiling()));
                        sentryAndroidOptions.setEnableScopePersistence(AbstractC15256t.m16474l(bundle, logger, "io.sentry.enable-scope-persistence", sentryAndroidOptions.isEnableScopePersistence()));
                        sentryAndroidOptions.setEnableMetrics(AbstractC15256t.m16474l(bundle, logger, "io.sentry.enable-metrics", sentryAndroidOptions.isEnableMetrics()));
                        if (sentryAndroidOptions.getExperimental().f48340a.f47049a == null) {
                            Double dM16476n4 = AbstractC15256t.m16476n(bundle, logger, "io.sentry.session-replay.session-sample-rate");
                            if (dM16476n4.doubleValue() != -1.0d) {
                                C15114C1 c15114c1 = sentryAndroidOptions.getExperimental().f48340a;
                                c15114c1.getClass();
                                if (!AbstractC8489H3.m9146d(dM16476n4, true)) {
                                    throw new IllegalArgumentException("The value " + dM16476n4 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
                                }
                                c15114c1.f47049a = dM16476n4;
                            }
                        }
                        if (sentryAndroidOptions.getExperimental().f48340a.f47050b == null) {
                            Double dM16476n5 = AbstractC15256t.m16476n(bundle, logger, "io.sentry.session-replay.on-error-sample-rate");
                            if (dM16476n5.doubleValue() != -1.0d) {
                                C15114C1 c15114c2 = sentryAndroidOptions.getExperimental().f48340a;
                                c15114c2.getClass();
                                if (!AbstractC8489H3.m9146d(dM16476n5, true)) {
                                    throw new IllegalArgumentException("The value " + dM16476n5 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
                                }
                                c15114c2.f47050b = dM16476n5;
                            }
                        }
                        C15114C1 c15114c3 = sentryAndroidOptions.getExperimental().f48340a;
                        if (AbstractC15256t.m16474l(bundle, logger, "io.sentry.session-replay.mask-all-text", true)) {
                            c15114c3.f47051c.add("android.widget.TextView");
                            c15114c3.f47052d.remove("android.widget.TextView");
                        } else {
                            c15114c3.f47052d.add("android.widget.TextView");
                            c15114c3.f47051c.remove("android.widget.TextView");
                        }
                        C15114C1 c15114c4 = sentryAndroidOptions.getExperimental().f48340a;
                        if (AbstractC15256t.m16474l(bundle, logger, "io.sentry.session-replay.mask-all-images", true)) {
                            c15114c4.f47051c.add("android.widget.ImageView");
                            c15114c4.f47052d.remove("android.widget.ImageView");
                        } else {
                            c15114c4.f47052d.add("android.widget.ImageView");
                            c15114c4.f47051c.remove("android.widget.ImageView");
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c16349b = c16349b;
                        z11 = z11;
                        sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to read configuration from android manifest metadata.", th);
                    }
                } else {
                    c14522e = c14522e;
                    z6 = zM16403a2;
                    c16349b = c16349b2;
                    z11 = z11;
                }
                sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
            } catch (Throwable th3) {
                th = th3;
                sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to read configuration from android manifest metadata.", th);
            }
        } catch (Throwable th4) {
            th = th4;
            z6 = zM16403a2;
            c16349b = c16349b2;
        }
        sentryAndroidOptions.setCacheDirPath(new File(applicationContext.getCacheDir(), "sentry").getAbsolutePath());
        PackageInfo packageInfoM16471i = AbstractC15256t.m16471i(applicationContext, 0, sentryAndroidOptions.getLogger(), c15184b);
        if (packageInfoM16471i != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(packageInfoM16471i.packageName + Separators.f31989AT + packageInfoM16471i.versionName + "+" + AbstractC15256t.m16472j(packageInfoM16471i, c15184b));
            }
            String str = packageInfoM16471i.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(AbstractC15191I.m16393a(applicationContext));
            } catch (RuntimeException e10) {
                sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Could not generate distinct Id.", e10);
            }
        }
        C14522e c14522e2 = c14522e;
        AbstractC15244m.m16445a(mainApplication, sentryAndroidOptions, c15184b, c15198p2, c14522e, z12, z11, z6);
        try {
            c16349b.m17948f(sentryAndroidOptions);
        } catch (Throwable th5) {
            sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th5);
        }
        C15251d c15251dM16451b = C15251d.m16451b();
        if (sentryAndroidOptions.isEnablePerformanceV2() && Build.VERSION.SDK_INT >= 24) {
            C15252e c15252e = c15251dM16451b.f47608o0;
            if (c15252e.f47618o0 == 0) {
                c15252e.m16459d(Process.getStartUptimeMillis());
            }
        }
        if (mainApplication.getApplicationContext() instanceof Application) {
            c15251dM16451b.m16455e((Application) mainApplication.getApplicationContext());
        }
        C15252e c15252e2 = c15251dM16451b.f47609p0;
        if (c15252e2.f47618o0 == 0) {
            c15252e2.m16459d(AbstractC15202U.f47410a);
        }
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof C15485h)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new C15212a(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof C15417p0) {
            InterfaceC15127H logger2 = sentryAndroidOptions.getLogger();
            C11238i c11238i = new C11238i();
            Context applicationContext2 = mainApplication.getApplicationContext();
            if (applicationContext2 == null) {
                applicationContext2 = mainApplication;
            }
            c11238i.f34008Y = applicationContext2;
            c11238i.f34009Z = logger2;
            c11238i.f34010o0 = c15184b;
            c11238i.f34011p0 = new HashMap();
            sentryAndroidOptions.setConnectionStatusProvider(c11238i);
        }
        sentryAndroidOptions.addEventProcessor(new C15373i(sentryAndroidOptions, 0));
        sentryAndroidOptions.addEventProcessor(new C15185C(mainApplication, c15184b, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C15199Q(sentryAndroidOptions, c14522e2));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, c15184b));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C15257u(mainApplication, c15184b, sentryAndroidOptions));
        C15184B c15184b3 = new C15184B();
        c15184b3.f47305a = sentryAndroidOptions;
        sentryAndroidOptions.setTransportGate(c15184b3);
        synchronized (C15251d.m16451b()) {
            C15251d.m16451b().getClass();
            C15240l frameMetricsCollector = sentryAndroidOptions.getFrameMetricsCollector();
            AbstractC8483G3.m9133c(frameMetricsCollector, "options.getFrameMetricsCollector is required");
            sentryAndroidOptions.setTransactionProfiler(new C15247p(mainApplication, sentryAndroidOptions, c15184b, frameMetricsCollector));
        }
        sentryAndroidOptions.setModulesLoader(new C15393f(mainApplication, sentryAndroidOptions.getLogger()));
        sentryAndroidOptions.setDebugMetaLoader(new C15384c(mainApplication, sentryAndroidOptions.getLogger()));
        boolean zM16403a3 = C15198P.m16403a(sentryAndroidOptions, "androidx.core.view.ScrollingView");
        boolean zM16403a4 = C15198P.m16403a(sentryAndroidOptions, "androidx.compose.ui.node.Owner");
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new C15219a(zM16403a3));
            if (zM16403a4 && C15198P.m16403a(sentryAndroidOptions, "io.sentry.compose.gestures.ComposeGestureTargetLocator")) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zM16403a4 && C15198P.m16403a(sentryAndroidOptions, "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter")) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        sentryAndroidOptions.setMainThreadChecker(C15230b.f47527b);
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new C15242k());
            sentryAndroidOptions.addPerformanceCollector(new C15217h(sentryAndroidOptions.getLogger(), c15184b));
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                C15240l frameMetricsCollector2 = sentryAndroidOptions.getFrameMetricsCollector();
                AbstractC8483G3.m9133c(frameMetricsCollector2, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.addPerformanceCollector(new C15206Y(sentryAndroidOptions, frameMetricsCollector2));
            }
        }
        sentryAndroidOptions.setTransactionPerformanceCollector(new C15397k(sentryAndroidOptions));
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            if (sentryAndroidOptions.isEnableScopePersistence()) {
                sentryAndroidOptions.addScopeObserver(new C15332f(sentryAndroidOptions));
            }
            sentryAndroidOptions.addOptionsObserver(new C15331e(sentryAndroidOptions));
        }
        AbstractC15202U.m16413a(sentryAndroidOptions, z12, z11);
    }
}
