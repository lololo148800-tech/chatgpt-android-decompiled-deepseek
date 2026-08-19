package com.statsig.androidsdk;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import mm.C17312o;
import p025An.AbstractC0575H;
import p025An.AbstractC0609e0;
import p025An.C0611f0;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1439n;
import p214Ib.C3669l;
import p571X9.AbstractC9233X;
import p817j$.util.concurrent.ConcurrentHashMap;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17678l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010$J\u001b\u0010'\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\"¢\u0006\u0004\b)\u0010$J\u0013\u0010*\u001a\u00020\"H\u0086@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J-\u00100\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b0\u00101J-\u00100\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u00042\u0006\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b0\u00104Ji\u0010?\u001a\u00020\"2\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00042\u0018\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000408072\b\u0010/\u001a\u0004\u0018\u00010\u000b2\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00132\u0006\u0010>\u001a\u00020=2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b?\u0010@J\u0013\u0010A\u001a\u00020\"H\u0086@ø\u0001\u0000¢\u0006\u0004\bA\u0010+J\u0019\u0010C\u001a\u00020\"2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u00020\"2\u0006\u00105\u001a\u00020\u0004¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010GR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010HR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010HR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010IR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010JR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010KR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001c\u0010R\u001a\n Q*\u0004\u0018\u00010P0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001c\u0010[\u001a\b\u0012\u0004\u0012\u00020\u001f0Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\"\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020^0]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\"\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020^0]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010`\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006b"}, m18067d2 = {"Lcom/statsig/androidsdk/StatsigLogger;", "", "LAn/F;", "coroutineScope", "", "sdkKey", "api", "Lcom/statsig/androidsdk/StatsigMetadata;", "statsigMetadata", "Lcom/statsig/androidsdk/StatsigNetwork;", "statsigNetwork", "Lcom/statsig/androidsdk/StatsigUser;", "statsigUser", "Lcom/statsig/androidsdk/Diagnostics;", "diagnostics", "<init>", "(LAn/F;Ljava/lang/String;Ljava/lang/String;Lcom/statsig/androidsdk/StatsigMetadata;Lcom/statsig/androidsdk/StatsigNetwork;Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/Diagnostics;)V", "", "metadata", "", "isManual", "addManualFlag", "(Ljava/util/Map;Z)Ljava/util/Map;", SubscriberAttributeKt.JSON_NAME_KEY, "shouldLogExposure", "(Ljava/lang/String;)Z", "Lcom/statsig/androidsdk/ContextType;", "context", "", "Lcom/statsig/androidsdk/Marker;", "markers", "Lcom/statsig/androidsdk/LogEvent;", "makeDiagnosticsEvent", "(Lcom/statsig/androidsdk/ContextType;Ljava/util/Collection;)Lcom/statsig/androidsdk/LogEvent;", "Lmm/C;", "addNonExposedChecksEvent", "()V", "addErrorBoundaryDiagnostics", "event", "log", "(Lcom/statsig/androidsdk/LogEvent;Lqm/c;)Ljava/lang/Object;", "onUpdateUser", "flush", "(Lqm/c;)Ljava/lang/Object;", DiagnosticsEntry.NAME_KEY, "Lcom/statsig/androidsdk/FeatureGate;", "gate", "user", "logExposure", "(Ljava/lang/String;Lcom/statsig/androidsdk/FeatureGate;Lcom/statsig/androidsdk/StatsigUser;Z)V", "Lcom/statsig/androidsdk/DynamicConfig;", "config", "(Ljava/lang/String;Lcom/statsig/androidsdk/DynamicConfig;Lcom/statsig/androidsdk/StatsigUser;Z)V", "configName", "ruleID", "", "", "secondaryExposures", "allocatedExperiment", "parameterName", "isExplicitParameter", "Lcom/statsig/androidsdk/EvaluationDetails;", "details", "logLayerExposure", "(Ljava/lang/String;Ljava/lang/String;[Ljava/util/Map;Lcom/statsig/androidsdk/StatsigUser;Ljava/lang/String;Ljava/lang/String;ZLcom/statsig/androidsdk/EvaluationDetails;Z)V", "shutdown", "overrideContext", "logDiagnostics", "(Lcom/statsig/androidsdk/ContextType;)V", "addNonExposedCheck", "(Ljava/lang/String;)V", "LAn/F;", "Ljava/lang/String;", "Lcom/statsig/androidsdk/StatsigMetadata;", "Lcom/statsig/androidsdk/StatsigNetwork;", "Lcom/statsig/androidsdk/StatsigUser;", "Lcom/statsig/androidsdk/Diagnostics;", "LIb/l;", "gson", "LIb/l;", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "executor", "Ljava/util/concurrent/ExecutorService;", "LAn/e0;", "singleThreadDispatcher", "LAn/e0;", "LAn/n0;", "timer", "LAn/n0;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "events", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "j$/util/concurrent/ConcurrentHashMap", "", "loggedExposures", "Lj$/util/concurrent/ConcurrentHashMap;", "nonExposedChecks", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class StatsigLogger {
    private final String api;
    private final InterfaceC0571F coroutineScope;
    private final Diagnostics diagnostics;
    private ConcurrentLinkedQueue<LogEvent> events;
    private final ExecutorService executor;
    private final C3669l gson;
    private ConcurrentHashMap<String, Long> loggedExposures;
    private ConcurrentHashMap<String, Long> nonExposedChecks;
    private final String sdkKey;
    private final AbstractC0609e0 singleThreadDispatcher;
    private final StatsigMetadata statsigMetadata;
    private final StatsigNetwork statsigNetwork;
    private final StatsigUser statsigUser;
    private final InterfaceC0627n0 timer;

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigLogger$flush$2 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigLogger$flush$2", m20656f = "StatsigLogger.kt", m20657l = {77}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128342 extends AbstractC19694j implements InterfaceC1439n {
        int label;

        public C128342(InterfaceC18770c<? super C128342> interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            return StatsigLogger.this.new C128342(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C128342) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            C17296C c17296c = C17296C.f55119a;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                StatsigLogger.this.addErrorBoundaryDiagnostics();
                StatsigLogger.this.addNonExposedChecksEvent();
                if (StatsigLogger.this.events.size() == 0) {
                    return c17296c;
                }
                String strValueOf = String.valueOf(StatsigLogger.this.events.size());
                ArrayList arrayList = new ArrayList(StatsigLogger.this.events);
                StatsigLogger.this.events = new ConcurrentLinkedQueue();
                StatsigNetwork statsigNetwork = StatsigLogger.this.statsigNetwork;
                String str = StatsigLogger.this.api;
                String strM4375i = StatsigLogger.this.gson.m4375i(new LogEventData(arrayList, StatsigLogger.this.statsigMetadata));
                AbstractC16544l.m18093f(strM4375i, "gson.toJson(LogEventData(flushEvents, statsigMetadata))");
                this.label = 1;
                if (statsigNetwork.apiPostLogs(str, strM4375i, strValueOf, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return c17296c;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigLogger$log$2 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigLogger$log$2", m20656f = "StatsigLogger.kt", m20657l = {57}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128352 extends AbstractC19694j implements InterfaceC1439n {
        final /* synthetic */ LogEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128352(LogEvent logEvent, InterfaceC18770c<? super C128352> interfaceC18770c) {
            super(2, interfaceC18770c);
            this.$event = logEvent;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            return StatsigLogger.this.new C128352(this.$event, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C128352) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                StatsigLogger.this.events.add(this.$event);
                if (StatsigLogger.this.events.size() >= 50) {
                    StatsigLogger statsigLogger = StatsigLogger.this;
                    this.label = 1;
                    if (statsigLogger.flush(this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigLogger$logDiagnostics$1 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigLogger$logDiagnostics$1", m20656f = "StatsigLogger.kt", m20657l = {197}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128361 extends AbstractC19694j implements InterfaceC1439n {
        final /* synthetic */ LogEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128361(LogEvent logEvent, InterfaceC18770c<? super C128361> interfaceC18770c) {
            super(2, interfaceC18770c);
            this.$event = logEvent;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            return StatsigLogger.this.new C128361(this.$event, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C128361) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                StatsigLogger statsigLogger = StatsigLogger.this;
                LogEvent logEvent = this.$event;
                this.label = 1;
                if (statsigLogger.log(logEvent, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigLogger$logExposure$1 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigLogger$logExposure$1", m20656f = "StatsigLogger.kt", m20657l = {102}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128371 extends AbstractC19694j implements InterfaceC1439n {
        final /* synthetic */ FeatureGate $gate;
        final /* synthetic */ boolean $isManual;
        final /* synthetic */ String $name;
        final /* synthetic */ StatsigUser $user;
        int label;
        final /* synthetic */ StatsigLogger this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128371(StatsigUser statsigUser, String str, FeatureGate featureGate, StatsigLogger statsigLogger, boolean z6, InterfaceC18770c<? super C128371> interfaceC18770c) {
            super(2, interfaceC18770c);
            this.$user = statsigUser;
            this.$name = str;
            this.$gate = featureGate;
            this.this$0 = statsigLogger;
            this.$isManual = z6;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            return new C128371(this.$user, this.$name, this.$gate, this.this$0, this.$isManual, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C128371) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                LogEvent logEvent = new LogEvent(StatsigLoggerKt.GATE_EXPOSURE);
                logEvent.setUser(this.$user);
                LinkedHashMap linkedHashMapM19246h = AbstractC17659D.m19246h(new C17309l("gate", this.$name), new C17309l("gateValue", String.valueOf(this.$gate.getValue())), new C17309l("ruleID", this.$gate.getRule()), new C17309l("reason", this.$gate.getDetails().getReason().toString()), new C17309l("time", String.valueOf(this.$gate.getDetails().getTime())));
                this.this$0.addManualFlag(linkedHashMapM19246h, this.$isManual);
                logEvent.setMetadata(linkedHashMapM19246h);
                logEvent.setSecondaryExposures(this.$gate.getSecondaryExposures());
                StatsigLogger statsigLogger = this.this$0;
                this.label = 1;
                if (statsigLogger.log(logEvent, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigLogger$logExposure$2 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigLogger$logExposure$2", m20656f = "StatsigLogger.kt", m20657l = {126}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128382 extends AbstractC19694j implements InterfaceC1439n {
        final /* synthetic */ DynamicConfig $config;
        final /* synthetic */ boolean $isManual;
        final /* synthetic */ String $name;
        final /* synthetic */ StatsigUser $user;
        int label;
        final /* synthetic */ StatsigLogger this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128382(StatsigUser statsigUser, String str, DynamicConfig dynamicConfig, StatsigLogger statsigLogger, boolean z6, InterfaceC18770c<? super C128382> interfaceC18770c) {
            super(2, interfaceC18770c);
            this.$user = statsigUser;
            this.$name = str;
            this.$config = dynamicConfig;
            this.this$0 = statsigLogger;
            this.$isManual = z6;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            return new C128382(this.$user, this.$name, this.$config, this.this$0, this.$isManual, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C128382) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                LogEvent logEvent = new LogEvent(StatsigLoggerKt.CONFIG_EXPOSURE);
                logEvent.setUser(this.$user);
                LinkedHashMap linkedHashMapM19246h = AbstractC17659D.m19246h(new C17309l("config", this.$name), new C17309l("ruleID", this.$config.getRule()), new C17309l("reason", this.$config.getDetails().getReason().toString()), new C17309l("time", String.valueOf(this.$config.getDetails().getTime())));
                this.this$0.addManualFlag(linkedHashMapM19246h, this.$isManual);
                logEvent.setMetadata(linkedHashMapM19246h);
                logEvent.setSecondaryExposures(this.$config.getSecondaryExposures$build_release());
                StatsigLogger statsigLogger = this.this$0;
                this.label = 1;
                if (statsigLogger.log(logEvent, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigLogger$logLayerExposure$1 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigLogger$logLayerExposure$1", m20656f = "StatsigLogger.kt", m20657l = {169}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128391 extends AbstractC19694j implements InterfaceC1439n {
        final /* synthetic */ Map<String, String> $metadata;
        final /* synthetic */ Map<String, String>[] $secondaryExposures;
        final /* synthetic */ StatsigUser $user;
        int label;
        final /* synthetic */ StatsigLogger this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128391(StatsigUser statsigUser, Map<String, String> map, Map<String, String>[] mapArr, StatsigLogger statsigLogger, InterfaceC18770c<? super C128391> interfaceC18770c) {
            super(2, interfaceC18770c);
            this.$user = statsigUser;
            this.$metadata = map;
            this.$secondaryExposures = mapArr;
            this.this$0 = statsigLogger;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            return new C128391(this.$user, this.$metadata, this.$secondaryExposures, this.this$0, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C128391) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                LogEvent logEvent = new LogEvent(StatsigLoggerKt.LAYER_EXPOSURE);
                logEvent.setUser(this.$user);
                logEvent.setMetadata(this.$metadata);
                logEvent.setSecondaryExposures(this.$secondaryExposures);
                StatsigLogger statsigLogger = this.this$0;
                this.label = 1;
                if (statsigLogger.log(logEvent, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigLogger$shutdown$1 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigLogger", m20656f = "StatsigLogger.kt", m20657l = {175}, m20658m = "shutdown")
    @Metadata(m18068k = 3, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class C128401 extends AbstractC19687c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C128401(InterfaceC18770c<? super C128401> interfaceC18770c) {
            super(interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StatsigLogger.this.shutdown(this);
        }
    }

    public StatsigLogger(InterfaceC0571F coroutineScope, String sdkKey, String api, StatsigMetadata statsigMetadata, StatsigNetwork statsigNetwork, StatsigUser statsigUser, Diagnostics diagnostics) {
        AbstractC16544l.m18094g(coroutineScope, "coroutineScope");
        AbstractC16544l.m18094g(sdkKey, "sdkKey");
        AbstractC16544l.m18094g(api, "api");
        AbstractC16544l.m18094g(statsigMetadata, "statsigMetadata");
        AbstractC16544l.m18094g(statsigNetwork, "statsigNetwork");
        AbstractC16544l.m18094g(statsigUser, "statsigUser");
        AbstractC16544l.m18094g(diagnostics, "diagnostics");
        this.coroutineScope = coroutineScope;
        this.sdkKey = sdkKey;
        this.api = api;
        this.statsigMetadata = statsigMetadata;
        this.statsigNetwork = statsigNetwork;
        this.statsigUser = statsigUser;
        this.diagnostics = diagnostics;
        this.gson = StatsigUtil.INSTANCE.getGson$build_release();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        this.executor = executor;
        AbstractC16544l.m18093f(executor, "executor");
        this.singleThreadDispatcher = new C0611f0(executor);
        this.timer = AbstractC0575H.m1156D(coroutineScope, null, null, new StatsigLogger$timer$1(this, null), 3);
        this.events = new ConcurrentLinkedQueue<>();
        this.loggedExposures = new ConcurrentHashMap<>();
        this.nonExposedChecks = new ConcurrentHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addErrorBoundaryDiagnostics() {
        Diagnostics diagnostics = this.diagnostics;
        ContextType contextType = ContextType.API_CALL;
        List<Marker> markers = diagnostics.getMarkers(contextType);
        if (markers.isEmpty()) {
            return;
        }
        this.events.add(makeDiagnosticsEvent(contextType, markers));
        this.diagnostics.clearContext(contextType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> addManualFlag(Map<String, String> metadata, boolean isManual) {
        if (isManual) {
            metadata.put("isManualExposure", "true");
        }
        return metadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addNonExposedChecksEvent() {
        if (this.nonExposedChecks.isEmpty()) {
            return;
        }
        LogEvent logEvent = new LogEvent(StatsigLoggerKt.NON_EXPOSED_CHECKS_EVENT);
        logEvent.setMetadata(AbstractC17660E.m19258c(new C17309l("checks", this.gson.m4375i(this.nonExposedChecks))));
        this.events.add(logEvent);
        this.nonExposedChecks.clear();
    }

    public static /* synthetic */ void logDiagnostics$default(StatsigLogger statsigLogger, ContextType contextType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            contextType = null;
        }
        statsigLogger.logDiagnostics(contextType);
    }

    private final LogEvent makeDiagnosticsEvent(ContextType context, Collection<Marker> markers) {
        LogEvent logEvent = new LogEvent(StatsigLoggerKt.DIAGNOSTICS_EVENT);
        logEvent.setUser(this.statsigUser);
        String string = context.toString();
        if (string == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = string.toLowerCase(Locale.ROOT);
        AbstractC16544l.m18093f(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
        logEvent.setMetadata(AbstractC17659D.m19244f(new C17309l("context", lowerCase), new C17309l("markers", this.gson.m4375i(markers))));
        return logEvent;
    }

    private final boolean shouldLogExposure(String key) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l4 = this.loggedExposures.get(key);
        if (l4 == null) {
            l4 = 0L;
        }
        if (l4.longValue() >= jCurrentTimeMillis - 600000) {
            return false;
        }
        this.loggedExposures.put(key, Long.valueOf(jCurrentTimeMillis));
        return true;
    }

    public final void addNonExposedCheck(String configName) {
        AbstractC16544l.m18094g(configName, "configName");
        Long l4 = this.nonExposedChecks.get(configName);
        if (l4 == null) {
            l4 = 0L;
        }
        this.nonExposedChecks.put(configName, Long.valueOf(l4.longValue() + 1));
    }

    public final Object flush(InterfaceC18770c<? super C17296C> interfaceC18770c) throws Throwable {
        Object objM1168P = AbstractC0575H.m1168P(this.singleThreadDispatcher, new C128342(null), interfaceC18770c);
        return objM1168P == EnumC19250a.f61036Y ? objM1168P : C17296C.f55119a;
    }

    public final Object log(LogEvent logEvent, InterfaceC18770c<? super C17296C> interfaceC18770c) throws Throwable {
        Object objM1168P = AbstractC0575H.m1168P(this.singleThreadDispatcher, new C128352(logEvent, null), interfaceC18770c);
        return objM1168P == EnumC19250a.f61036Y ? objM1168P : C17296C.f55119a;
    }

    public final void logDiagnostics(ContextType overrideContext) {
        if (overrideContext == null) {
            overrideContext = this.diagnostics.getDiagnosticsContext();
        }
        List<Marker> markers = this.diagnostics.getMarkers(overrideContext);
        if (markers.isEmpty()) {
            return;
        }
        AbstractC0575H.m1156D(this.coroutineScope, this.singleThreadDispatcher, null, new C128361(makeDiagnosticsEvent(overrideContext, markers), null), 2);
        Diagnostics.clearContext$default(this.diagnostics, null, 1, null);
    }

    public final void logExposure(String name, FeatureGate gate, StatsigUser user, boolean isManual) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(gate, "gate");
        AbstractC16544l.m18094g(user, "user");
        if (shouldLogExposure(name + gate.getValue() + gate.getRule() + gate.getDetails().getReason())) {
            AbstractC0575H.m1156D(this.coroutineScope, this.singleThreadDispatcher, null, new C128371(user, name, gate, this, isManual, null), 2);
        }
    }

    public final void logLayerExposure(String configName, String ruleID, Map<String, String>[] secondaryExposures, StatsigUser user, String allocatedExperiment, String parameterName, boolean isExplicitParameter, EvaluationDetails details, boolean isManual) {
        AbstractC16544l.m18094g(configName, "configName");
        AbstractC16544l.m18094g(ruleID, "ruleID");
        AbstractC16544l.m18094g(secondaryExposures, "secondaryExposures");
        AbstractC16544l.m18094g(allocatedExperiment, "allocatedExperiment");
        AbstractC16544l.m18094g(parameterName, "parameterName");
        AbstractC16544l.m18094g(details, "details");
        LinkedHashMap linkedHashMapM19246h = AbstractC17659D.m19246h(new C17309l("config", configName), new C17309l("ruleID", ruleID), new C17309l("allocatedExperiment", allocatedExperiment), new C17309l("parameterName", parameterName), new C17309l("isExplicitParameter", String.valueOf(isExplicitParameter)), new C17309l("reason", details.getReason().toString()), new C17309l("time", String.valueOf(details.getTime())));
        addManualFlag(linkedHashMapM19246h, isManual);
        if (shouldLogExposure(AbstractC17678l.m19283F(new String[]{configName, ruleID, allocatedExperiment, parameterName, String.valueOf(isExplicitParameter), details.getReason().toString()}, "|", null, null, null, 62))) {
            AbstractC0575H.m1156D(this.coroutineScope, this.singleThreadDispatcher, null, new C128391(user, linkedHashMapM19246h, secondaryExposures, this, null), 2);
        }
    }

    public final void onUpdateUser() {
        this.loggedExposures = new ConcurrentHashMap<>();
        this.diagnostics.clearContext(ContextType.API_CALL);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object shutdown(InterfaceC18770c<? super C17296C> interfaceC18770c) {
        C128401 c128401;
        StatsigLogger statsigLogger;
        Object objM9806b;
        C17296C c17296c = C17296C.f55119a;
        if (interfaceC18770c instanceof C128401) {
            c128401 = (C128401) interfaceC18770c;
            int i10 = c128401.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c128401.label = i10 - Integer.MIN_VALUE;
            } else {
                c128401 = new C128401(interfaceC18770c);
            }
        } else {
            c128401 = new C128401(interfaceC18770c);
        }
        Object obj = c128401.result;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c128401.label;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            this.timer.mo1275e(null);
            c128401.L$0 = this;
            c128401.label = 1;
            if (flush(c128401) == enumC19250a) {
                return enumC19250a;
            }
            statsigLogger = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            statsigLogger = (StatsigLogger) c128401.L$0;
            AbstractC9233X.m9807c(obj);
        }
        statsigLogger.executor.shutdown();
        try {
            if (!statsigLogger.executor.awaitTermination(3L, TimeUnit.SECONDS)) {
                statsigLogger.executor.shutdownNow();
            }
            objM9806b = c17296c;
        } catch (Throwable th2) {
            objM9806b = AbstractC9233X.m9806b(th2);
        }
        if (C17312o.m18979a(objM9806b) != null) {
            statsigLogger.executor.shutdownNow();
        }
        return c17296c;
    }

    public final void logExposure(String name, DynamicConfig config, StatsigUser user, boolean isManual) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(config, "config");
        AbstractC16544l.m18094g(user, "user");
        if (shouldLogExposure(name + config.getRule() + config.getDetails().getReason())) {
            AbstractC0575H.m1156D(this.coroutineScope, this.singleThreadDispatcher, null, new C128382(user, name, config, this, isManual, null), 2);
        }
    }
}
