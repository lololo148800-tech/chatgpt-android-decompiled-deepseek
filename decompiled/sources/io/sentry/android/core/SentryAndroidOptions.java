package io.sentry.android.core;

import io.sentry.C15358g1;
import io.sentry.C15524y1;
import io.sentry.android.core.internal.util.C15240l;
import io.sentry.protocol.C15445r;

/* JADX INFO: loaded from: classes3.dex */
public final class SentryAndroidOptions extends C15524y1 {
    private boolean anrEnabled;
    private boolean anrReportInDebug;
    private long anrTimeoutIntervalMillis;
    private boolean attachAnrThreadDump;
    private boolean attachScreenshot;
    private boolean attachViewHierarchy;
    private InterfaceC15204W beforeScreenshotCaptureCallback;
    private InterfaceC15204W beforeViewHierarchyCaptureCallback;
    private boolean collectAdditionalContext;
    private InterfaceC15190H debugImagesLoader;
    private boolean enableActivityLifecycleBreadcrumbs;
    private boolean enableActivityLifecycleTracingAutoFinish;
    private boolean enableAppComponentBreadcrumbs;
    private boolean enableAppLifecycleBreadcrumbs;
    private boolean enableAutoActivityLifecycleTracing;
    private boolean enableFramesTracking;
    private boolean enableNdk;
    private boolean enableNetworkEventBreadcrumbs;
    private boolean enablePerformanceV2;
    private boolean enableRootCheck;
    private boolean enableScopeSync;
    private boolean enableSystemEventBreadcrumbs;
    private C15240l frameMetricsCollector;
    private String nativeSdkName;
    private EnumC15194L ndkHandlerStrategy;
    private boolean reportHistoricalAnrs;
    private final long startupCrashDurationThresholdMillis;
    private long startupCrashFlushTimeoutMillis;

    public SentryAndroidOptions() {
        super(false);
        this.anrEnabled = true;
        this.anrTimeoutIntervalMillis = 5000L;
        this.anrReportInDebug = false;
        this.enableActivityLifecycleBreadcrumbs = true;
        this.enableAppLifecycleBreadcrumbs = true;
        this.enableSystemEventBreadcrumbs = true;
        this.enableAppComponentBreadcrumbs = true;
        this.enableNetworkEventBreadcrumbs = true;
        this.enableAutoActivityLifecycleTracing = true;
        this.enableActivityLifecycleTracingAutoFinish = true;
        this.debugImagesLoader = C15198P.f47371Y;
        this.collectAdditionalContext = true;
        this.startupCrashFlushTimeoutMillis = 5000L;
        this.startupCrashDurationThresholdMillis = 2000L;
        this.enableFramesTracking = true;
        this.nativeSdkName = null;
        this.enableRootCheck = true;
        this.enableNdk = true;
        this.ndkHandlerStrategy = EnumC15194L.SENTRY_HANDLER_STRATEGY_DEFAULT;
        this.enableScopeSync = true;
        this.reportHistoricalAnrs = false;
        this.attachAnrThreadDump = false;
        this.enablePerformanceV2 = false;
        setSentryClientName("sentry.java.android/7.19.1");
        setSdkVersion(createSdkVersion());
        setAttachServerName(false);
    }

    private C15445r createSdkVersion() {
        C15445r sdkVersion = getSdkVersion();
        if (sdkVersion == null) {
            sdkVersion = new C15445r("sentry.java.android", "7.19.1");
        } else {
            sdkVersion.f48204Y = "sentry.java.android";
            sdkVersion.f48205Z = "7.19.1";
        }
        C15358g1.m16578n().m16580f("maven:io.sentry:sentry-android-core");
        return sdkVersion;
    }

    public void enableAllAutoBreadcrumbs(boolean z6) {
        this.enableActivityLifecycleBreadcrumbs = z6;
        this.enableAppComponentBreadcrumbs = z6;
        this.enableSystemEventBreadcrumbs = z6;
        this.enableAppLifecycleBreadcrumbs = z6;
        this.enableNetworkEventBreadcrumbs = z6;
        setEnableUserInteractionBreadcrumbs(z6);
    }

    public long getAnrTimeoutIntervalMillis() {
        return this.anrTimeoutIntervalMillis;
    }

    public InterfaceC15204W getBeforeScreenshotCaptureCallback() {
        return null;
    }

    public InterfaceC15204W getBeforeViewHierarchyCaptureCallback() {
        return null;
    }

    public InterfaceC15190H getDebugImagesLoader() {
        return this.debugImagesLoader;
    }

    public C15240l getFrameMetricsCollector() {
        return this.frameMetricsCollector;
    }

    public String getNativeSdkName() {
        return this.nativeSdkName;
    }

    public int getNdkHandlerStrategy() {
        return this.ndkHandlerStrategy.getValue();
    }

    @Deprecated
    public int getProfilingTracesIntervalMillis() {
        return 0;
    }

    public long getStartupCrashDurationThresholdMillis() {
        return 2000L;
    }

    public long getStartupCrashFlushTimeoutMillis() {
        return this.startupCrashFlushTimeoutMillis;
    }

    public boolean isAnrEnabled() {
        return this.anrEnabled;
    }

    public boolean isAnrReportInDebug() {
        return this.anrReportInDebug;
    }

    public boolean isAttachAnrThreadDump() {
        return this.attachAnrThreadDump;
    }

    public boolean isAttachScreenshot() {
        return this.attachScreenshot;
    }

    public boolean isAttachViewHierarchy() {
        return this.attachViewHierarchy;
    }

    public boolean isCollectAdditionalContext() {
        return this.collectAdditionalContext;
    }

    public boolean isEnableActivityLifecycleBreadcrumbs() {
        return this.enableActivityLifecycleBreadcrumbs;
    }

    public boolean isEnableActivityLifecycleTracingAutoFinish() {
        return this.enableActivityLifecycleTracingAutoFinish;
    }

    public boolean isEnableAppComponentBreadcrumbs() {
        return this.enableAppComponentBreadcrumbs;
    }

    public boolean isEnableAppLifecycleBreadcrumbs() {
        return this.enableAppLifecycleBreadcrumbs;
    }

    public boolean isEnableAutoActivityLifecycleTracing() {
        return this.enableAutoActivityLifecycleTracing;
    }

    public boolean isEnableFramesTracking() {
        return this.enableFramesTracking;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public boolean isEnableNetworkEventBreadcrumbs() {
        return this.enableNetworkEventBreadcrumbs;
    }

    public boolean isEnablePerformanceV2() {
        return this.enablePerformanceV2;
    }

    public boolean isEnableRootCheck() {
        return this.enableRootCheck;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    public boolean isEnableSystemEventBreadcrumbs() {
        return this.enableSystemEventBreadcrumbs;
    }

    public boolean isReportHistoricalAnrs() {
        return this.reportHistoricalAnrs;
    }

    public void setAnrEnabled(boolean z6) {
        this.anrEnabled = z6;
    }

    public void setAnrReportInDebug(boolean z6) {
        this.anrReportInDebug = z6;
    }

    public void setAnrTimeoutIntervalMillis(long j10) {
        this.anrTimeoutIntervalMillis = j10;
    }

    public void setAttachAnrThreadDump(boolean z6) {
        this.attachAnrThreadDump = z6;
    }

    public void setAttachScreenshot(boolean z6) {
        this.attachScreenshot = z6;
    }

    public void setAttachViewHierarchy(boolean z6) {
        this.attachViewHierarchy = z6;
    }

    public void setBeforeScreenshotCaptureCallback(InterfaceC15204W interfaceC15204W) {
    }

    public void setBeforeViewHierarchyCaptureCallback(InterfaceC15204W interfaceC15204W) {
    }

    public void setCollectAdditionalContext(boolean z6) {
        this.collectAdditionalContext = z6;
    }

    public void setDebugImagesLoader(InterfaceC15190H interfaceC15190H) {
        if (interfaceC15190H == null) {
            interfaceC15190H = C15198P.f47371Y;
        }
        this.debugImagesLoader = interfaceC15190H;
    }

    public void setEnableActivityLifecycleBreadcrumbs(boolean z6) {
        this.enableActivityLifecycleBreadcrumbs = z6;
    }

    public void setEnableActivityLifecycleTracingAutoFinish(boolean z6) {
        this.enableActivityLifecycleTracingAutoFinish = z6;
    }

    public void setEnableAppComponentBreadcrumbs(boolean z6) {
        this.enableAppComponentBreadcrumbs = z6;
    }

    public void setEnableAppLifecycleBreadcrumbs(boolean z6) {
        this.enableAppLifecycleBreadcrumbs = z6;
    }

    public void setEnableAutoActivityLifecycleTracing(boolean z6) {
        this.enableAutoActivityLifecycleTracing = z6;
    }

    public void setEnableFramesTracking(boolean z6) {
        this.enableFramesTracking = z6;
    }

    public void setEnableNdk(boolean z6) {
        this.enableNdk = z6;
    }

    public void setEnableNetworkEventBreadcrumbs(boolean z6) {
        this.enableNetworkEventBreadcrumbs = z6;
    }

    public void setEnablePerformanceV2(boolean z6) {
        this.enablePerformanceV2 = z6;
    }

    public void setEnableRootCheck(boolean z6) {
        this.enableRootCheck = z6;
    }

    public void setEnableScopeSync(boolean z6) {
        this.enableScopeSync = z6;
    }

    public void setEnableSystemEventBreadcrumbs(boolean z6) {
        this.enableSystemEventBreadcrumbs = z6;
    }

    public void setFrameMetricsCollector(C15240l c15240l) {
        this.frameMetricsCollector = c15240l;
    }

    public void setNativeHandlerStrategy(EnumC15194L enumC15194L) {
        this.ndkHandlerStrategy = enumC15194L;
    }

    public void setNativeSdkName(String str) {
        this.nativeSdkName = str;
    }

    @Deprecated
    public void setProfilingTracesIntervalMillis(int i10) {
    }

    public void setReportHistoricalAnrs(boolean z6) {
        this.reportHistoricalAnrs = z6;
    }

    public void setStartupCrashFlushTimeoutMillis(long j10) {
        this.startupCrashFlushTimeoutMillis = j10;
    }
}
