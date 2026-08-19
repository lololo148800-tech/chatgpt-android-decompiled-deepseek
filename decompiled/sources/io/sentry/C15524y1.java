package io.sentry;

import io.sentry.backpressure.C15323b;
import io.sentry.backpressure.InterfaceC15322a;
import io.sentry.cache.InterfaceC15330d;
import io.sentry.clientreport.InterfaceC15339g;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.internal.debugmeta.C15383b;
import io.sentry.internal.debugmeta.InterfaceC15382a;
import io.sentry.internal.gestures.InterfaceC15385a;
import io.sentry.internal.modules.C15392e;
import io.sentry.internal.modules.InterfaceC15388a;
import io.sentry.protocol.C15445r;
import io.sentry.transport.C15481d;
import io.sentry.transport.C15485h;
import io.sentry.transport.InterfaceC15484g;
import io.sentry.util.AbstractC15500e;
import io.sentry.util.AbstractC15503h;
import io.sentry.util.C15498c;
import io.sentry.util.InterfaceC15497b;
import io.sentry.util.thread.C15507c;
import io.sentry.util.thread.InterfaceC15505a;
import java.io.File;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLSocketFactory;
import p1139z0.C21585H;
import p499U9.C7591u;
import p544W9.AbstractC8489H3;
import p561X.C8990d;
import p784hb.C14438g;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.y1 */
/* JADX INFO: loaded from: classes3.dex */
public class C15524y1 {
    static final EnumC15375i1 DEFAULT_DIAGNOSTIC_LEVEL = EnumC15375i1.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private InterfaceC15322a backpressureMonitor;
    private InterfaceC15412n1 beforeBreadcrumb;
    private InterfaceC15415o1 beforeEmitMetricCallback;
    private InterfaceC15418p1 beforeEnvelopeCallback;
    private InterfaceC15456q1 beforeSend;
    private InterfaceC15459r1 beforeSendReplay;
    private InterfaceC15474s1 beforeSendTransaction;
    private final Set<String> bundleIds;
    private String cacheDirPath;
    InterfaceC15339g clientReportRecorder;
    private InterfaceC15118E connectionStatusProvider;
    private int connectionTimeoutMillis;
    private final List<String> contextTags;
    private C15477t1 cron;
    private final C15498c dateProvider;
    private boolean debug;
    private InterfaceC15382a debugMetaLoader;
    private final List<String> defaultTracePropagationTargets;
    private EnumC15375i1 diagnosticLevel;
    private String dist;
    private String distinctId;
    private String dsn;
    private String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableDeduplication;
    private boolean enableDefaultTagsForMetrics;
    private boolean enableExternalConfiguration;
    private boolean enableMetrics;
    private boolean enablePrettySerializationOutput;
    private boolean enableScopePersistence;
    private boolean enableScreenTracking;
    private boolean enableShutdownHook;
    private boolean enableSpanLocalMetricAggregation;
    private boolean enableSpotlight;
    private boolean enableTimeToFullDisplayTracing;
    private Boolean enableTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;
    private InterfaceC15330d envelopeDiskCache;
    private final C15498c envelopeReader;
    private String environment;
    private final List<InterfaceC15472s> eventProcessors;
    private InterfaceC15148O executorService;
    private final C15475t experimental;
    private long flushTimeoutMillis;
    private C15508v fullyDisplayedReporter;
    private final List<InterfaceC15385a> gestureTargetLocators;
    private Long idleTimeout;
    private List<String> ignoredCheckIns;
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private EnumC15168V instrumenter;
    private final List<InterfaceC15171W> integrations;
    private InterfaceC15127H logger;
    private InterfaceC15505a mainThreadChecker;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxQueueSize;
    private EnumC15518w1 maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private InterfaceC15388a modulesLoader;
    private final List<InterfaceC15145N> observers;
    private final List<InterfaceC15133J> optionsObservers;
    private final C15498c parsedDsn;
    private final List<InterfaceC15136K> performanceCollectors;
    private boolean printUncaughtStackTrace;
    private Double profilesSampleRate;
    private InterfaceC15495u1 profilesSampler;
    private int profilingTracesHz;
    private String proguardUuid;
    private C15510v1 proxy;
    private int readTimeoutMillis;
    private String release;
    private InterfaceC15122F0 replayController;
    private Double sampleRate;
    private C15445r sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;
    private String sentryClientName;
    private final C15498c serializer;
    private String serverName;
    private long sessionFlushTimeoutMillis;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;
    private String spotlightConnectionUrl;
    private SSLSocketFactory sslSocketFactory;
    private final Map<String, String> tags;
    private boolean traceOptionsRequests;
    private List<String> tracePropagationTargets;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private InterfaceC15521x1 tracesSampler;
    private InterfaceC15167U1 transactionPerformanceCollector;
    private InterfaceC15162T transactionProfiler;
    private InterfaceC15165U transportFactory;
    private InterfaceC15484g transportGate;
    private final List<ComposeViewHierarchyExporter> viewHierarchyExporters;

    public C15524y1(boolean z6) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.bundleIds = new CopyOnWriteArraySet();
        final int i10 = 0;
        this.parsedDsn = new C15498c(new InterfaceC15497b(this) { // from class: io.sentry.m1

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C15524y1 f48024Z;

            {
                this.f48024Z = this;
            }

            @Override // io.sentry.util.InterfaceC15497b
            /* JADX INFO: renamed from: g */
            public final Object mo5056g() {
                switch (i10) {
                    case 0:
                        return C15524y1.m16730a(this.f48024Z);
                    case 1:
                        C15524y1 c15524y1 = this.f48024Z;
                        c15524y1.getClass();
                        return new C15395j0(c15524y1);
                    default:
                        return C15524y1.m16731b(this.f48024Z);
                }
            }
        });
        this.shutdownTimeoutMillis = 2000L;
        this.flushTimeoutMillis = 15000L;
        this.sessionFlushTimeoutMillis = 15000L;
        this.logger = C15473s0.f48339Y;
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        final int i11 = 1;
        this.serializer = new C15498c(new InterfaceC15497b(this) { // from class: io.sentry.m1

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C15524y1 f48024Z;

            {
                this.f48024Z = this;
            }

            @Override // io.sentry.util.InterfaceC15497b
            /* JADX INFO: renamed from: g */
            public final Object mo5056g() {
                switch (i11) {
                    case 0:
                        return C15524y1.m16730a(this.f48024Z);
                    case 1:
                        C15524y1 c15524y1 = this.f48024Z;
                        c15524y1.getClass();
                        return new C15395j0(c15524y1);
                    default:
                        return C15524y1.m16731b(this.f48024Z);
                }
            }
        });
        final int i12 = 2;
        this.envelopeReader = new C15498c(new InterfaceC15497b(this) { // from class: io.sentry.m1

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C15524y1 f48024Z;

            {
                this.f48024Z = this;
            }

            @Override // io.sentry.util.InterfaceC15497b
            /* JADX INFO: renamed from: g */
            public final Object mo5056g() {
                switch (i12) {
                    case 0:
                        return C15524y1.m16730a(this.f48024Z);
                    case 1:
                        C15524y1 c15524y1 = this.f48024Z;
                        c15524y1.getClass();
                        return new C15395j0(c15524y1);
                    default:
                        return C15524y1.m16731b(this.f48024Z);
                }
            }
        });
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = C15520x0.f48474Y;
        this.transportGate = C15481d.f48367b;
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = C15476t0.f48343p0;
        this.connectionTimeoutMillis = 5000;
        this.readTimeoutMillis = 5000;
        this.envelopeDiskCache = C15485h.f48373Y;
        this.sendDefaultPii = false;
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = EnumC15518w1.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = C15476t0.f48345r0;
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new C15358g1(this);
        this.modulesLoader = C15392e.f47982a;
        this.debugMetaLoader = C15383b.f47965Y;
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = EnumC15168V.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.mainThreadChecker = C15507c.f48431a;
        this.traceOptionsRequests = true;
        this.dateProvider = new C15498c(new C8990d(16));
        this.performanceCollectors = new ArrayList();
        this.transactionPerformanceCollector = C15476t0.f48344q0;
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = C15508v.f48432b;
        this.connectionStatusProvider = new C15417p0();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.enableSpotlight = false;
        this.enableScopePersistence = true;
        this.ignoredCheckIns = null;
        this.backpressureMonitor = C15323b.f47866Y;
        this.enableBackpressureHandling = true;
        this.enableAppStartProfiling = false;
        this.enableMetrics = false;
        this.enableDefaultTagsForMetrics = true;
        this.enableSpanLocalMetricAggregation = true;
        this.profilingTracesHz = 101;
        this.cron = null;
        this.replayController = C15476t0.f48342o0;
        this.enableScreenTracking = true;
        C15475t c15475t = new C15475t();
        C15114C1 c15114c1 = new C15114C1();
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        c15114c1.f47051c = copyOnWriteArraySet;
        c15114c1.f47052d = new CopyOnWriteArraySet();
        c15114c1.f47053e = EnumC15111B1.MEDIUM;
        c15114c1.f47054f = 1;
        c15114c1.f47055g = 30000L;
        c15114c1.f47056h = 5000L;
        c15114c1.f47057i = 3600000L;
        c15114c1.f47058j = true;
        if (!z6) {
            c15114c1.f47051c.add("android.widget.TextView");
            c15114c1.f47052d.remove("android.widget.TextView");
            c15114c1.f47051c.add("android.widget.ImageView");
            c15114c1.f47052d.remove("android.widget.ImageView");
            copyOnWriteArraySet.add("android.webkit.WebView");
            copyOnWriteArraySet.add("android.widget.VideoView");
            copyOnWriteArraySet.add("androidx.media3.ui.PlayerView");
            copyOnWriteArraySet.add("com.google.android.exoplayer2.ui.PlayerView");
            copyOnWriteArraySet.add("com.google.android.exoplayer2.ui.StyledPlayerView");
        }
        c15475t.f48340a = c15114c1;
        this.experimental = c15475t;
        if (z6) {
            return;
        }
        this.executorService = new C14438g(1);
        copyOnWriteArrayList2.add(new UncaughtExceptionHandlerIntegration());
        copyOnWriteArrayList2.add(new ShutdownHookIntegration());
        copyOnWriteArrayList2.add(new SpotlightIntegration());
        copyOnWriteArrayList.add(new C15398k0(this));
        copyOnWriteArrayList.add(new C15373i(this, 1));
        if (!AbstractC15500e.f48420a) {
            copyOnWriteArrayList.add(new C15373i());
        }
        setSentryClientName("sentry.java/7.19.1");
        C15445r c15445r = new C15445r("sentry.java", "7.19.1");
        c15445r.f48205Z = "7.19.1";
        setSdkVersion(c15445r);
        C15358g1.m16578n().m16580f("maven:io.sentry:sentry");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C15416p m16730a(C15524y1 c15524y1) {
        return new C15416p(c15524y1.dsn);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C15454q m16731b(C15524y1 c15524y1) {
        c15524y1.getClass();
        return new C15454q((InterfaceC15151P) c15524y1.serializer.m16684a());
    }

    public static C15524y1 empty() {
        return new C15524y1(true);
    }

    public void addBundleId(String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.bundleIds.add(strTrim);
        }
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(InterfaceC15472s interfaceC15472s) {
        this.eventProcessors.add(interfaceC15472s);
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(InterfaceC15171W interfaceC15171W) {
        this.integrations.add(interfaceC15171W);
    }

    public void addOptionsObserver(InterfaceC15133J interfaceC15133J) {
        this.optionsObservers.add(interfaceC15133J);
    }

    public void addPerformanceCollector(InterfaceC15136K interfaceC15136K) {
        this.performanceCollectors.add(interfaceC15136K);
    }

    public void addScopeObserver(InterfaceC15145N interfaceC15145N) {
        this.observers.add(interfaceC15145N);
    }

    @Deprecated
    public void addTracingOrigin(String str) {
        if (this.tracePropagationTargets == null) {
            this.tracePropagationTargets = new CopyOnWriteArrayList();
        }
        if (str.isEmpty()) {
            return;
        }
        this.tracePropagationTargets.add(str);
    }

    public boolean containsIgnoredExceptionForType(Throwable th2) {
        return this.ignoredExceptionsForType.contains(th2.getClass());
    }

    public InterfaceC15322a getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    public InterfaceC15412n1 getBeforeBreadcrumb() {
        return null;
    }

    public InterfaceC15415o1 getBeforeEmitMetricCallback() {
        return null;
    }

    public InterfaceC15418p1 getBeforeEnvelopeCallback() {
        return this.beforeEnvelopeCallback;
    }

    public InterfaceC15456q1 getBeforeSend() {
        return this.beforeSend;
    }

    public InterfaceC15459r1 getBeforeSendReplay() {
        return null;
    }

    public InterfaceC15474s1 getBeforeSendTransaction() {
        return null;
    }

    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    public String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath;
    }

    public InterfaceC15339g getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public InterfaceC15118E getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public C15477t1 getCron() {
        return this.cron;
    }

    public InterfaceC15172W0 getDateProvider() {
        return (InterfaceC15172W0) this.dateProvider.m16684a();
    }

    public InterfaceC15382a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    public EnumC15375i1 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public String getDsn() {
        return this.dsn;
    }

    @Deprecated
    public Boolean getEnableTracing() {
        return this.enableTracing;
    }

    public InterfaceC15330d getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public InterfaceC15121F getEnvelopeReader() {
        return (InterfaceC15121F) this.envelopeReader.m16684a();
    }

    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    public List<InterfaceC15472s> getEventProcessors() {
        return this.eventProcessors;
    }

    public InterfaceC15148O getExecutorService() {
        return this.executorService;
    }

    public C15475t getExperimental() {
        return this.experimental;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public C15508v getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<InterfaceC15385a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public List<String> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public EnumC15168V getInstrumenter() {
        return this.instrumenter;
    }

    public List<InterfaceC15171W> getIntegrations() {
        return this.integrations;
    }

    public InterfaceC15127H getLogger() {
        return this.logger;
    }

    public InterfaceC15505a getMainThreadChecker() {
        return this.mainThreadChecker;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public EnumC15518w1 getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public InterfaceC15388a getModulesLoader() {
        return this.modulesLoader;
    }

    public List<InterfaceC15133J> getOptionsObservers() {
        return this.optionsObservers;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public List<InterfaceC15136K> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public InterfaceC15495u1 getProfilesSampler() {
        return null;
    }

    public String getProfilingTracesDirPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public C15510v1 getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public InterfaceC15122F0 getReplayController() {
        return this.replayController;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<InterfaceC15145N> getScopeObservers() {
        return this.observers;
    }

    public C15445r getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public InterfaceC15151P getSerializer() {
        return (InterfaceC15151P) this.serializer.m16684a();
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    @Deprecated
    public long getShutdownTimeout() {
        return this.shutdownTimeoutMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public InterfaceC15521x1 getTracesSampler() {
        return null;
    }

    @Deprecated
    public List<String> getTracingOrigins() {
        return getTracePropagationTargets();
    }

    public InterfaceC15167U1 getTransactionPerformanceCollector() {
        return this.transactionPerformanceCollector;
    }

    public InterfaceC15162T getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public InterfaceC15165U getTransportFactory() {
        return this.transportFactory;
    }

    public InterfaceC15484g getTransportGate() {
        return this.transportGate;
    }

    public final List<ComposeViewHierarchyExporter> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        return isProfilingEnabled() && this.enableAppStartProfiling;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableDefaultTagsForMetrics() {
        return isEnableMetrics() && this.enableDefaultTagsForMetrics;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnableMetrics() {
        return this.enableMetrics;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    public boolean isEnableScreenTracking() {
        return this.enableScreenTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableSpanLocalMetricAggregation() {
        return isEnableMetrics() && this.enableSpanLocalMetricAggregation;
    }

    public boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        if (getProfilesSampleRate() != null && getProfilesSampleRate().doubleValue() > 0.0d) {
            return true;
        }
        getProfilesSampler();
        return false;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        Boolean bool = this.enableTracing;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (getTracesSampleRate() != null) {
            return true;
        }
        getTracesSampler();
        return false;
    }

    public void loadLazyFields() {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void merge(C15493u c15493u) {
        String str = c15493u.f48388a;
        if (str != null) {
            setDsn(str);
        }
        String str2 = c15493u.f48389b;
        if (str2 != null) {
            setEnvironment(str2);
        }
        String str3 = c15493u.f48390c;
        if (str3 != null) {
            setRelease(str3);
        }
        String str4 = c15493u.f48391d;
        if (str4 != null) {
            setDist(str4);
        }
        String str5 = c15493u.f48392e;
        if (str5 != null) {
            setServerName(str5);
        }
        C15510v1 c15510v1 = c15493u.f48400m;
        if (c15510v1 != null) {
            setProxy(c15510v1);
        }
        Boolean bool = c15493u.f48393f;
        if (bool != null) {
            setEnableUncaughtExceptionHandler(bool.booleanValue());
        }
        Boolean bool2 = c15493u.f48408u;
        if (bool2 != null) {
            setPrintUncaughtStackTrace(bool2.booleanValue());
        }
        Boolean bool3 = c15493u.f48396i;
        if (bool3 != null) {
            setEnableTracing(bool3);
        }
        Double d10 = c15493u.f48397j;
        if (d10 != null) {
            setTracesSampleRate(d10);
        }
        Double d11 = c15493u.f48398k;
        if (d11 != null) {
            setProfilesSampleRate(d11);
        }
        Boolean bool4 = c15493u.f48394g;
        if (bool4 != null) {
            setDebug(bool4.booleanValue());
        }
        Boolean bool5 = c15493u.f48395h;
        if (bool5 != null) {
            setEnableDeduplication(bool5.booleanValue());
        }
        Boolean bool6 = c15493u.f48409v;
        if (bool6 != null) {
            setSendClientReports(bool6.booleanValue());
        }
        for (Map.Entry entry : new HashMap(c15493u.f48399l).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(c15493u.f48402o).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(c15493u.f48401n).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(c15493u.f48407t).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (c15493u.f48403p != null) {
            setTracePropagationTargets(new ArrayList(c15493u.f48403p));
        }
        Iterator it4 = new ArrayList(c15493u.f48404q).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        String str6 = c15493u.f48405r;
        if (str6 != null) {
            setProguardUuid(str6);
        }
        Long l4 = c15493u.f48406s;
        if (l4 != null) {
            setIdleTimeout(l4);
        }
        Iterator it5 = c15493u.f48410w.iterator();
        while (it5.hasNext()) {
            addBundleId((String) it5.next());
        }
        Boolean bool7 = c15493u.f48411x;
        if (bool7 != null) {
            setEnabled(bool7.booleanValue());
        }
        Boolean bool8 = c15493u.f48412y;
        if (bool8 != null) {
            setEnablePrettySerializationOutput(bool8.booleanValue());
        }
        Boolean bool9 = c15493u.f48385A;
        if (bool9 != null) {
            setSendModules(bool9.booleanValue());
        }
        if (c15493u.f48413z != null) {
            setIgnoredCheckIns(new ArrayList(c15493u.f48413z));
        }
        Boolean bool10 = c15493u.f48386B;
        if (bool10 != null) {
            setEnableBackpressureHandling(bool10.booleanValue());
        }
        if (c15493u.f48387C != null) {
            if (getCron() == null) {
                setCron(c15493u.f48387C);
                return;
            }
            if (c15493u.f48387C.f48347a != null) {
                getCron().f48347a = c15493u.f48387C.f48347a;
            }
            if (c15493u.f48387C.f48348b != null) {
                getCron().f48348b = c15493u.f48387C.f48348b;
            }
            if (c15493u.f48387C.f48349c != null) {
                getCron().f48349c = c15493u.f48387C.f48349c;
            }
            if (c15493u.f48387C.f48350d != null) {
                getCron().f48350d = c15493u.f48387C.f48350d;
            }
            if (c15493u.f48387C.f48351e != null) {
                getCron().f48351e = c15493u.f48387C.f48351e;
            }
        }
    }

    public C15416p retrieveParsedDsn() {
        return (C15416p) this.parsedDsn.m16684a();
    }

    public void setAttachServerName(boolean z6) {
        this.attachServerName = z6;
    }

    public void setAttachStacktrace(boolean z6) {
        this.attachStacktrace = z6;
    }

    public void setAttachThreads(boolean z6) {
        this.attachThreads = z6;
    }

    public void setBackpressureMonitor(InterfaceC15322a interfaceC15322a) {
        this.backpressureMonitor = interfaceC15322a;
    }

    public void setBeforeBreadcrumb(InterfaceC15412n1 interfaceC15412n1) {
    }

    public void setBeforeEmitMetricCallback(InterfaceC15415o1 interfaceC15415o1) {
    }

    public void setBeforeEnvelopeCallback(InterfaceC15418p1 interfaceC15418p1) {
        this.beforeEnvelopeCallback = interfaceC15418p1;
    }

    public void setBeforeSend(InterfaceC15456q1 interfaceC15456q1) {
        this.beforeSend = interfaceC15456q1;
    }

    public void setBeforeSendReplay(InterfaceC15459r1 interfaceC15459r1) {
    }

    public void setBeforeSendTransaction(InterfaceC15474s1 interfaceC15474s1) {
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setConnectionStatusProvider(InterfaceC15118E interfaceC15118E) {
        this.connectionStatusProvider = interfaceC15118E;
    }

    public void setConnectionTimeoutMillis(int i10) {
        this.connectionTimeoutMillis = i10;
    }

    public void setCron(C15477t1 c15477t1) {
        this.cron = c15477t1;
    }

    public void setDateProvider(InterfaceC15172W0 interfaceC15172W0) {
        C15498c c15498c = this.dateProvider;
        synchronized (c15498c) {
            c15498c.f48416a = interfaceC15172W0;
        }
    }

    public void setDebug(boolean z6) {
        this.debug = z6;
    }

    public void setDebugMetaLoader(InterfaceC15382a interfaceC15382a) {
        if (interfaceC15382a == null) {
            interfaceC15382a = C15383b.f47965Y;
        }
        this.debugMetaLoader = interfaceC15382a;
    }

    public void setDiagnosticLevel(EnumC15375i1 enumC15375i1) {
        if (enumC15375i1 == null) {
            enumC15375i1 = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = enumC15375i1;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDsn(String str) {
        String string;
        this.dsn = str;
        C15498c c15498c = this.parsedDsn;
        synchronized (c15498c) {
            string = null;
            c15498c.f48416a = null;
        }
        String str2 = this.dsn;
        InterfaceC15127H interfaceC15127H = this.logger;
        Charset charset = AbstractC15503h.f48425a;
        if (str2 != null && !str2.isEmpty()) {
            try {
                string = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str2.getBytes(AbstractC15503h.f48425a))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e10) {
                interfaceC15127H.mo16297h(EnumC15375i1.INFO, "SHA-1 isn't available to calculate the hash.", e10);
            } catch (Throwable th2) {
                interfaceC15127H.mo16298o(EnumC15375i1.INFO, "string: %s could not calculate its hash", th2, str2);
            }
        }
        this.dsnHash = string;
    }

    public void setEnableAppStartProfiling(boolean z6) {
        this.enableAppStartProfiling = z6;
    }

    public void setEnableAutoSessionTracking(boolean z6) {
        this.enableAutoSessionTracking = z6;
    }

    public void setEnableBackpressureHandling(boolean z6) {
        this.enableBackpressureHandling = z6;
    }

    public void setEnableDeduplication(boolean z6) {
        this.enableDeduplication = z6;
    }

    public void setEnableDefaultTagsForMetrics(boolean z6) {
        this.enableDefaultTagsForMetrics = z6;
    }

    public void setEnableExternalConfiguration(boolean z6) {
        this.enableExternalConfiguration = z6;
    }

    public void setEnableMetrics(boolean z6) {
        this.enableMetrics = z6;
    }

    public void setEnablePrettySerializationOutput(boolean z6) {
        this.enablePrettySerializationOutput = z6;
    }

    public void setEnableScopePersistence(boolean z6) {
        this.enableScopePersistence = z6;
    }

    public void setEnableScreenTracking(boolean z6) {
        this.enableScreenTracking = z6;
    }

    public void setEnableShutdownHook(boolean z6) {
        this.enableShutdownHook = z6;
    }

    public void setEnableSpanLocalMetricAggregation(boolean z6) {
        this.enableSpanLocalMetricAggregation = z6;
    }

    public void setEnableSpotlight(boolean z6) {
        this.enableSpotlight = z6;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z6) {
        this.enableTimeToFullDisplayTracing = z6;
    }

    @Deprecated
    public void setEnableTracing(Boolean bool) {
        this.enableTracing = bool;
    }

    public void setEnableUncaughtExceptionHandler(boolean z6) {
        this.enableUncaughtExceptionHandler = z6;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z6) {
        this.enableUserInteractionBreadcrumbs = z6;
    }

    public void setEnableUserInteractionTracing(boolean z6) {
        this.enableUserInteractionTracing = z6;
    }

    public void setEnabled(boolean z6) {
        this.enabled = z6;
    }

    public void setEnvelopeDiskCache(InterfaceC15330d interfaceC15330d) {
        if (interfaceC15330d == null) {
            interfaceC15330d = C15485h.f48373Y;
        }
        this.envelopeDiskCache = interfaceC15330d;
    }

    public void setEnvelopeReader(InterfaceC15121F interfaceC15121F) {
        C15498c c15498c = this.envelopeReader;
        if (interfaceC15121F == null) {
            interfaceC15121F = C15455q0.f48274a;
        }
        synchronized (c15498c) {
            c15498c.f48416a = interfaceC15121F;
        }
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(InterfaceC15148O interfaceC15148O) {
        if (interfaceC15148O != null) {
            this.executorService = interfaceC15148O;
        }
    }

    public void setFlushTimeoutMillis(long j10) {
        this.flushTimeoutMillis = j10;
    }

    public void setFullyDisplayedReporter(C15508v c15508v) {
        this.fullyDisplayedReporter = c15508v;
    }

    public void setGestureTargetLocators(List<InterfaceC15385a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setIdleTimeout(Long l4) {
        this.idleTimeout = l4;
    }

    public void setIgnoredCheckIns(List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setInstrumenter(EnumC15168V enumC15168V) {
        this.instrumenter = enumC15168V;
    }

    public void setLogger(InterfaceC15127H interfaceC15127H) {
        this.logger = interfaceC15127H == null ? C15473s0.f48339Y : new C21585H(this, interfaceC15127H);
    }

    public void setMainThreadChecker(InterfaceC15505a interfaceC15505a) {
        this.mainThreadChecker = interfaceC15505a;
    }

    public void setMaxAttachmentSize(long j10) {
        this.maxAttachmentSize = j10;
    }

    public void setMaxBreadcrumbs(int i10) {
        this.maxBreadcrumbs = i10;
    }

    public void setMaxCacheItems(int i10) {
        this.maxCacheItems = i10;
    }

    public void setMaxDepth(int i10) {
        this.maxDepth = i10;
    }

    public void setMaxQueueSize(int i10) {
        if (i10 > 0) {
            this.maxQueueSize = i10;
        }
    }

    public void setMaxRequestBodySize(EnumC15518w1 enumC15518w1) {
        this.maxRequestBodySize = enumC15518w1;
    }

    public void setMaxSpans(int i10) {
        this.maxSpans = i10;
    }

    public void setMaxTraceFileSize(long j10) {
        this.maxTraceFileSize = j10;
    }

    public void setModulesLoader(InterfaceC15388a interfaceC15388a) {
        if (interfaceC15388a == null) {
            interfaceC15388a = C15392e.f47982a;
        }
        this.modulesLoader = interfaceC15388a;
    }

    public void setPrintUncaughtStackTrace(boolean z6) {
        this.printUncaughtStackTrace = z6;
    }

    public void setProfilesSampleRate(Double d10) {
        if (AbstractC8489H3.m9146d(d10, true)) {
            this.profilesSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(InterfaceC15495u1 interfaceC15495u1) {
    }

    @Deprecated
    public void setProfilingEnabled(boolean z6) {
        if (getProfilesSampleRate() == null) {
            setProfilesSampleRate(z6 ? Double.valueOf(1.0d) : null);
        }
    }

    public void setProfilingTracesHz(int i10) {
        this.profilingTracesHz = i10;
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setProxy(C15510v1 c15510v1) {
        this.proxy = c15510v1;
    }

    public void setReadTimeoutMillis(int i10) {
        this.readTimeoutMillis = i10;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setReplayController(InterfaceC15122F0 interfaceC15122F0) {
        if (interfaceC15122F0 == null) {
            interfaceC15122F0 = C15476t0.f48342o0;
        }
        this.replayController = interfaceC15122F0;
    }

    public void setSampleRate(Double d10) {
        if (AbstractC8489H3.m9146d(d10, true)) {
            this.sampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setSdkVersion(C15445r c15445r) {
        this.sdkVersion = c15445r;
    }

    public void setSendClientReports(boolean z6) {
        this.sendClientReports = z6;
        if (z6) {
            this.clientReportRecorder = new C15358g1(this);
        } else {
            this.clientReportRecorder = new C7591u(29);
        }
    }

    public void setSendDefaultPii(boolean z6) {
        this.sendDefaultPii = z6;
    }

    public void setSendModules(boolean z6) {
        this.sendModules = z6;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(InterfaceC15151P interfaceC15151P) {
        C15498c c15498c = this.serializer;
        if (interfaceC15151P == null) {
            interfaceC15151P = C15494u0.f48414a;
        }
        synchronized (c15498c) {
            c15498c.f48416a = interfaceC15151P;
        }
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(long j10) {
        this.sessionFlushTimeoutMillis = j10;
    }

    public void setSessionTrackingIntervalMillis(long j10) {
        this.sessionTrackingIntervalMillis = j10;
    }

    @Deprecated
    public void setShutdownTimeout(long j10) {
        this.shutdownTimeoutMillis = j10;
    }

    public void setShutdownTimeoutMillis(long j10) {
        this.shutdownTimeoutMillis = j10;
    }

    public void setSpotlightConnectionUrl(String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setTag(String str, String str2) {
        this.tags.put(str, str2);
    }

    public void setTraceOptionsRequests(boolean z6) {
        this.traceOptionsRequests = z6;
    }

    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z6) {
        this.traceSampling = z6;
    }

    public void setTracesSampleRate(Double d10) {
        if (AbstractC8489H3.m9146d(d10, true)) {
            this.tracesSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(InterfaceC15521x1 interfaceC15521x1) {
    }

    @Deprecated
    public void setTracingOrigins(List<String> list) {
        setTracePropagationTargets(list);
    }

    public void setTransactionPerformanceCollector(InterfaceC15167U1 interfaceC15167U1) {
        this.transactionPerformanceCollector = interfaceC15167U1;
    }

    public void setTransactionProfiler(InterfaceC15162T interfaceC15162T) {
        if (this.transactionProfiler != C15476t0.f48345r0 || interfaceC15162T == null) {
            return;
        }
        this.transactionProfiler = interfaceC15162T;
    }

    public void setTransportFactory(InterfaceC15165U interfaceC15165U) {
        if (interfaceC15165U == null) {
            interfaceC15165U = C15520x0.f48474Y;
        }
        this.transportFactory = interfaceC15165U;
    }

    public void setTransportGate(InterfaceC15484g interfaceC15484g) {
        if (interfaceC15484g == null) {
            interfaceC15484g = C15481d.f48367b;
        }
        this.transportGate = interfaceC15484g;
    }

    public void setViewHierarchyExporters(List<ComposeViewHierarchyExporter> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }
}
