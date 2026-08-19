package com.statsig.androidsdk;

import android.content.SharedPreferences;
import com.google.gson.reflect.TypeToken;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p214Ib.C3669l;
import p509Uk.lpqL.SfpOlmlMATQ;
import p571X9.AbstractC9233X;
import p817j$.util.concurrent.ConcurrentHashMap;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0015\u001a\u00020\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00132\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0010J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00132\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\b¢\u0006\u0004\b'\u0010(J\u001d\u0010,\u001a\u00020&2\u0006\u0010)\u001a\u00020\b2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J)\u00102\u001a\u0002012\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u00100\u001a\u00020\b2\b\b\u0002\u0010+\u001a\u00020*¢\u0006\u0004\b2\u00103J\u001d\u00106\u001a\u0002052\u0006\u0010/\u001a\u00020.2\u0006\u00104\u001a\u00020\b¢\u0006\u0004\b6\u00107J\u000f\u0010;\u001a\u000208H\u0000¢\u0006\u0004\b9\u0010:J#\u0010A\u001a\u0002082\u0006\u0010<\u001a\u00020*2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=H\u0000¢\u0006\u0004\b?\u0010@J\u001d\u0010C\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\b2\u0006\u0010B\u001a\u00020*¢\u0006\u0004\bC\u0010DJ)\u0010E\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\b2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0004\bE\u0010FJ)\u0010G\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\b2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0004\bG\u0010FJ\u0015\u0010I\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020\b¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020\u000e¢\u0006\u0004\bK\u0010\u0010J\u0013\u0010L\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\r\u0010O\u001a\u00020N¢\u0006\u0004\bO\u0010PJ\r\u0010R\u001a\u00020Q¢\u0006\u0004\bR\u0010SJ\r\u0010T\u001a\u00020\b¢\u0006\u0004\bT\u0010UJ\r\u0010V\u001a\u00020\u001d¢\u0006\u0004\bV\u0010WJ\u0013\u0010X\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\bX\u0010MJ\u0017\u0010Y\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\bY\u0010ZJ\u0019\u0010\\\u001a\u0004\u0018\u00010[2\u0006\u0010H\u001a\u00020\bH\u0002¢\u0006\u0004\b\\\u0010]J;\u0010a\u001a\u0004\u0018\u00010[2\u0006\u0010H\u001a\u00020\b2\b\u0010^\u001a\u0004\u0018\u00010[2\u0006\u0010+\u001a\u00020*2\u0006\u0010_\u001a\u0002082\u0006\u0010`\u001a\u00020*H\u0002¢\u0006\u0004\ba\u0010bJ)\u0010d\u001a\u00020&2\u0006\u0010H\u001a\u00020\b2\u0006\u0010_\u001a\u0002082\b\u0010c\u001a\u0004\u0018\u00010[H\u0002¢\u0006\u0004\bd\u0010eJ\u000f\u0010g\u001a\u00020fH\u0002¢\u0006\u0004\bg\u0010hJ\u0017\u0010j\u001a\u00020\u000e2\u0006\u0010i\u001a\u00020\bH\u0002¢\u0006\u0004\bj\u0010JJ!\u0010k\u001a\u00020\u000e2\u0006\u0010i\u001a\u00020\b2\b\u0010^\u001a\u0004\u0018\u00010[H\u0002¢\u0006\u0004\bk\u0010lJ\u0019\u0010m\u001a\u0004\u0018\u00010[2\u0006\u0010i\u001a\u00020\bH\u0002¢\u0006\u0004\bm\u0010]R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010oR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010pR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010qR\"\u0010r\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010|\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0016\u0010~\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010pR\u0016\u0010\u007f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010pR&\u0010\u0081\u0001\u001a\u000f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020f0\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0019\u0010\u0083\u0001\u001a\u00020f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R&\u0010\u0085\u0001\u001a\u000f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020[0\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0082\u0001R\u0019\u0010\u0086\u0001\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0088\u0001"}, m18067d2 = {"Lcom/statsig/androidsdk/Store;", "", "LAn/F;", "statsigScope", "Landroid/content/SharedPreferences;", "sharedPrefs", "Lcom/statsig/androidsdk/StatsigUser;", "user", "", "sdkKey", "Lcom/statsig/androidsdk/StatsigOptions;", "options", "<init>", "(LAn/F;Landroid/content/SharedPreferences;Lcom/statsig/androidsdk/StatsigUser;Ljava/lang/String;Lcom/statsig/androidsdk/StatsigOptions;)V", "Lmm/C;", "syncLoadFromLocalStorage", "()V", "resetUser", "(Lcom/statsig/androidsdk/StatsigUser;)V", "", "initializeValues", "bootstrap", "(Ljava/util/Map;Lcom/statsig/androidsdk/StatsigUser;)V", "loadCacheForCurrentUser", "", "getLastUpdateTime", "(Lcom/statsig/androidsdk/StatsigUser;)Ljava/lang/Long;", "getPreviousDerivedFields", "(Lcom/statsig/androidsdk/StatsigUser;)Ljava/util/Map;", "Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "data", "save", "(Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;Lcom/statsig/androidsdk/StatsigUser;Lqm/c;)Ljava/lang/Object;", "gateName", "Lcom/statsig/androidsdk/FeatureGate;", "checkGate", "(Ljava/lang/String;)Lcom/statsig/androidsdk/FeatureGate;", "configName", "Lcom/statsig/androidsdk/DynamicConfig;", "getConfig", "(Ljava/lang/String;)Lcom/statsig/androidsdk/DynamicConfig;", "experimentName", "", "keepDeviceValue", "getExperiment", "(Ljava/lang/String;Z)Lcom/statsig/androidsdk/DynamicConfig;", "Lcom/statsig/androidsdk/StatsigClient;", "client", "layerName", "Lcom/statsig/androidsdk/Layer;", "getLayer", "(Lcom/statsig/androidsdk/StatsigClient;Ljava/lang/String;Z)Lcom/statsig/androidsdk/Layer;", "paramStoreName", "Lcom/statsig/androidsdk/ParameterStore;", "getParamStore", "(Lcom/statsig/androidsdk/StatsigClient;Ljava/lang/String;)Lcom/statsig/androidsdk/ParameterStore;", "Lcom/statsig/androidsdk/EvaluationDetails;", "getGlobalEvaluationDetails$build_release", "()Lcom/statsig/androidsdk/EvaluationDetails;", "getGlobalEvaluationDetails", "valueExists", "Lcom/statsig/androidsdk/EvaluationReason;", "reasonOverride", "getEvaluationDetails$build_release", "(ZLcom/statsig/androidsdk/EvaluationReason;)Lcom/statsig/androidsdk/EvaluationDetails;", "getEvaluationDetails", "value", "overrideGate", "(Ljava/lang/String;Z)V", "overrideConfig", "(Ljava/lang/String;Ljava/util/Map;)V", "overrideLayer", DiagnosticsEntry.NAME_KEY, "removeOverride", "(Ljava/lang/String;)V", "removeAllOverrides", "saveOverridesToLocalStorage", "(Lqm/c;)Ljava/lang/Object;", "Lcom/statsig/androidsdk/StatsigOverrides;", "getAllOverrides", "()Lcom/statsig/androidsdk/StatsigOverrides;", "Lcom/statsig/androidsdk/ExternalInitializeResponse;", "getCurrentCacheValuesAndEvaluationReason", "()Lcom/statsig/androidsdk/ExternalInitializeResponse;", "getCurrentValuesAsString", "()Ljava/lang/String;", "getCachedInitializationResponse", "()Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "persistStickyValues", "getScopedCacheKey", "(Lcom/statsig/androidsdk/StatsigUser;)Ljava/lang/String;", "Lcom/statsig/androidsdk/APIDynamicConfig;", "getConfigData", "(Ljava/lang/String;)Lcom/statsig/androidsdk/APIDynamicConfig;", "latestValue", "details", "isLayer", "getPossiblyStickyValue", "(Ljava/lang/String;Lcom/statsig/androidsdk/APIDynamicConfig;ZLcom/statsig/androidsdk/EvaluationDetails;Z)Lcom/statsig/androidsdk/APIDynamicConfig;", "config", "hydrateDynamicConfig", "(Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationDetails;Lcom/statsig/androidsdk/APIDynamicConfig;)Lcom/statsig/androidsdk/DynamicConfig;", "Lcom/statsig/androidsdk/Cache;", "createEmptyCache", "()Lcom/statsig/androidsdk/Cache;", "expName", "removeStickyValue", "attemptToSaveStickyValue", "(Ljava/lang/String;Lcom/statsig/androidsdk/APIDynamicConfig;)V", "getStickyValue", "LAn/F;", "Landroid/content/SharedPreferences;", "Ljava/lang/String;", "Lcom/statsig/androidsdk/StatsigOptions;", "reason", "Lcom/statsig/androidsdk/EvaluationReason;", "getReason", "()Lcom/statsig/androidsdk/EvaluationReason;", "setReason", "(Lcom/statsig/androidsdk/EvaluationReason;)V", "LIb/l;", "gson", "LIb/l;", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "dispatcherProvider", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "currentUserCacheKeyDeprecated", "currentUserCacheKeyV2", "j$/util/concurrent/ConcurrentHashMap", "cacheById", "Lj$/util/concurrent/ConcurrentHashMap;", "currentCache", "Lcom/statsig/androidsdk/Cache;", "stickyDeviceExperiments", "localOverrides", "Lcom/statsig/androidsdk/StatsigOverrides;", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class Store {
    private ConcurrentHashMap<String, Cache> cacheById;
    private Cache currentCache;
    private String currentUserCacheKeyDeprecated;
    private String currentUserCacheKeyV2;
    private final CoroutineDispatcherProvider dispatcherProvider;
    private final C3669l gson;
    private StatsigOverrides localOverrides;
    private final StatsigOptions options;
    private EvaluationReason reason;
    private final String sdkKey;
    private final SharedPreferences sharedPrefs;
    private final InterfaceC0571F statsigScope;
    private ConcurrentHashMap<String, APIDynamicConfig> stickyDeviceExperiments;

    /* JADX INFO: renamed from: com.statsig.androidsdk.Store$persistStickyValues$1 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.Store", m20656f = "Store.kt", m20657l = {446, 447}, m20658m = "persistStickyValues")
    @Metadata(m18068k = 3, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class C128511 extends AbstractC19687c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C128511(InterfaceC18770c<? super C128511> interfaceC18770c) {
            super(interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Store.this.persistStickyValues(this);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.Store$syncLoadFromLocalStorage$1 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.Store$syncLoadFromLocalStorage$1", m20656f = "Store.kt", m20657l = {68}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128521 extends AbstractC19694j implements InterfaceC1439n {
        int label;

        public C128521(InterfaceC18770c<? super C128521> interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            return Store.this.new C128521(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C128521) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                StatsigUtil statsigUtil = StatsigUtil.INSTANCE;
                SharedPreferences sharedPreferences = Store.this.sharedPrefs;
                this.label = 1;
                if (statsigUtil.removeFromSharedPrefs$build_release(sharedPreferences, "Statsig.CACHE_BY_USER", this) == enumC19250a) {
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

    /* JADX INFO: renamed from: com.statsig.androidsdk.Store$syncLoadFromLocalStorage$2 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.Store$syncLoadFromLocalStorage$2", m20656f = "Store.kt", m20657l = {81}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128532 extends AbstractC19694j implements InterfaceC1439n {
        int label;

        public C128532(InterfaceC18770c<? super C128532> interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            return Store.this.new C128532(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C128532) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                StatsigUtil statsigUtil = StatsigUtil.INSTANCE;
                SharedPreferences sharedPreferences = Store.this.sharedPrefs;
                this.label = 1;
                if (statsigUtil.removeFromSharedPrefs$build_release(sharedPreferences, "Statsig.STICKY_DEVICE_EXPERIMENTS", this) == enumC19250a) {
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

    /* JADX INFO: renamed from: com.statsig.androidsdk.Store$syncLoadFromLocalStorage$3 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.Store$syncLoadFromLocalStorage$3", m20656f = "Store.kt", m20657l = {92}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128543 extends AbstractC19694j implements InterfaceC1439n {
        int label;

        public C128543(InterfaceC18770c<? super C128543> interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            return Store.this.new C128543(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C128543) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                StatsigUtil statsigUtil = StatsigUtil.INSTANCE;
                SharedPreferences sharedPreferences = Store.this.sharedPrefs;
                this.label = 1;
                if (statsigUtil.removeFromSharedPrefs$build_release(sharedPreferences, "Statsig.LOCAL_OVERRIDES", this) == enumC19250a) {
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

    public Store(InterfaceC0571F statsigScope, SharedPreferences sharedPrefs, StatsigUser user, String sdkKey, StatsigOptions options) {
        AbstractC16544l.m18094g(statsigScope, "statsigScope");
        AbstractC16544l.m18094g(sharedPrefs, "sharedPrefs");
        AbstractC16544l.m18094g(user, "user");
        AbstractC16544l.m18094g(sdkKey, "sdkKey");
        AbstractC16544l.m18094g(options, "options");
        this.statsigScope = statsigScope;
        this.sharedPrefs = sharedPrefs;
        this.sdkKey = sdkKey;
        this.options = options;
        this.gson = StatsigUtil.INSTANCE.getGson$build_release();
        this.dispatcherProvider = new CoroutineDispatcherProvider(null, null, null, 7, null);
        this.currentUserCacheKeyDeprecated = user.getCacheKeyDEPRECATED$build_release();
        this.currentUserCacheKeyV2 = getScopedCacheKey(user);
        this.cacheById = new ConcurrentHashMap<>();
        this.currentCache = createEmptyCache();
        this.stickyDeviceExperiments = new ConcurrentHashMap<>();
        this.localOverrides = StatsigOverrides.INSTANCE.empty();
        this.reason = EvaluationReason.Uninitialized;
    }

    private final void attemptToSaveStickyValue(String expName, APIDynamicConfig latestValue) {
        if (latestValue == null) {
            return;
        }
        String hashedString = Hashing.INSTANCE.getHashedString(expName, this.currentCache.getValues().getHashUsed());
        if (latestValue.isExperimentActive() && latestValue.isUserInExperiment()) {
            if (latestValue.isDeviceBased()) {
                this.stickyDeviceExperiments.put(hashedString, latestValue);
            } else {
                this.currentCache.getStickyUserExperiments().getExperiments().put(hashedString, latestValue);
            }
        }
    }

    private final Cache createEmptyCache() {
        C17690x c17690x = C17690x.f56481Y;
        return new Cache(new InitializeResponse.SuccessfulInitializeResponse(c17690x, c17690x, c17690x, false, null, 0L, c17690x, null), new StickyUserExperiments(new LinkedHashMap()), "", Long.valueOf(System.currentTimeMillis()));
    }

    private final APIDynamicConfig getConfigData(String name) {
        InitializeResponse.SuccessfulInitializeResponse values = this.currentCache.getValues();
        Map<String, APIDynamicConfig> configs = values.getConfigs();
        APIDynamicConfig aPIDynamicConfig = configs == null ? null : configs.get(name);
        if (aPIDynamicConfig != null) {
            return aPIDynamicConfig;
        }
        Map<String, APIDynamicConfig> configs2 = values.getConfigs();
        if (configs2 == null) {
            return null;
        }
        return configs2.get(Hashing.INSTANCE.getHashedString(name, this.currentCache.getValues().getHashUsed()));
    }

    public static /* synthetic */ EvaluationDetails getEvaluationDetails$build_release$default(Store store, boolean z6, EvaluationReason evaluationReason, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            evaluationReason = null;
        }
        return store.getEvaluationDetails$build_release(z6, evaluationReason);
    }

    public static /* synthetic */ Layer getLayer$default(Store store, StatsigClient statsigClient, String str, boolean z6, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z6 = false;
        }
        return store.getLayer(statsigClient, str, z6);
    }

    private final APIDynamicConfig getPossiblyStickyValue(String name, APIDynamicConfig latestValue, boolean keepDeviceValue, EvaluationDetails details, boolean isLayer) {
        APIDynamicConfig aPIDynamicConfig;
        Map<String, APIDynamicConfig> configs;
        if (!keepDeviceValue) {
            removeStickyValue(name);
            return latestValue;
        }
        APIDynamicConfig stickyValue = getStickyValue(name);
        if (stickyValue == null) {
            attemptToSaveStickyValue(name, latestValue);
            return latestValue;
        }
        if (isLayer) {
            String allocatedExperimentName = stickyValue.getAllocatedExperimentName();
            aPIDynamicConfig = (allocatedExperimentName == null || (configs = this.currentCache.getValues().getConfigs()) == null) ? null : configs.get(allocatedExperimentName);
        } else {
            aPIDynamicConfig = latestValue;
        }
        Boolean boolValueOf = aPIDynamicConfig == null ? null : Boolean.valueOf(aPIDynamicConfig.isExperimentActive());
        Boolean bool = Boolean.TRUE;
        if (AbstractC16544l.m18089b(boolValueOf, bool)) {
            details.setReason(EvaluationReason.Sticky);
            return stickyValue;
        }
        if (AbstractC16544l.m18089b(latestValue != null ? Boolean.valueOf(latestValue.isExperimentActive()) : null, bool)) {
            attemptToSaveStickyValue(name, latestValue);
        } else {
            removeStickyValue(name);
        }
        return latestValue;
    }

    private final String getScopedCacheKey(StatsigUser user) {
        return (String) this.options.getCustomCacheKey().invoke(this.sdkKey, user);
    }

    private final APIDynamicConfig getStickyValue(String expName) {
        String hashedString = Hashing.INSTANCE.getHashedString(expName, this.currentCache.getValues().getHashUsed());
        APIDynamicConfig aPIDynamicConfig = this.currentCache.getStickyUserExperiments().getExperiments().get(hashedString);
        return aPIDynamicConfig == null ? this.stickyDeviceExperiments.get(hashedString) : aPIDynamicConfig;
    }

    private final DynamicConfig hydrateDynamicConfig(String name, EvaluationDetails details, APIDynamicConfig config) {
        if (config != null) {
            return new DynamicConfig(name, config, details);
        }
        return new DynamicConfig(name, details, null, null, null, null, false, false, false, null, 1020, null);
    }

    private final void removeStickyValue(String expName) {
        String hashedString = Hashing.INSTANCE.getHashedString(expName, this.currentCache.getValues().getHashUsed());
        this.currentCache.getStickyUserExperiments().getExperiments().remove(hashedString);
        this.stickyDeviceExperiments.remove(hashedString);
    }

    public final void bootstrap(Map<String, ? extends Object> initializeValues, StatsigUser user) {
        AbstractC16544l.m18094g(initializeValues, "initializeValues");
        AbstractC16544l.m18094g(user, "user");
        this.reason = BootstrapValidator.INSTANCE.isValid(initializeValues, user) ? EvaluationReason.Bootstrap : EvaluationReason.InvalidBootstrap;
        try {
            Cache cache = this.currentCache;
            C3669l c3669l = this.gson;
            Object objM4371e = c3669l.m4371e(InitializeResponse.SuccessfulInitializeResponse.class, c3669l.m4375i(initializeValues));
            AbstractC16544l.m18093f(objM4371e, "gson.fromJson(\n                gson.toJson(initializeValues),\n                InitializeResponse.SuccessfulInitializeResponse::class.java,\n            )");
            cache.setValues((InitializeResponse.SuccessfulInitializeResponse) objM4371e);
            this.cacheById.put(this.currentUserCacheKeyV2, this.currentCache);
        } catch (Exception unused) {
        }
    }

    public final FeatureGate checkGate(String gateName) {
        AbstractC16544l.m18094g(gateName, "gateName");
        Boolean bool = this.localOverrides.getGates().get(gateName);
        if (bool != null) {
            return new FeatureGate(gateName, getEvaluationDetails$build_release(false, EvaluationReason.LocalOverride), bool.booleanValue(), "override", null, null, null, 112, null);
        }
        Map<String, APIFeatureGate> featureGates = this.currentCache.getValues().getFeatureGates();
        APIFeatureGate aPIFeatureGate = featureGates == null ? null : featureGates.get(gateName);
        if (aPIFeatureGate == null) {
            Map<String, APIFeatureGate> featureGates2 = this.currentCache.getValues().getFeatureGates();
            aPIFeatureGate = featureGates2 == null ? null : featureGates2.get(Hashing.INSTANCE.getHashedString(gateName, this.currentCache.getValues().getHashUsed()));
        }
        return aPIFeatureGate == null ? new FeatureGate(gateName, getEvaluationDetails$build_release$default(this, false, null, 2, null), false, null, null, null, null, 120, null) : new FeatureGate(gateName, aPIFeatureGate, getEvaluationDetails$build_release$default(this, true, null, 2, null));
    }

    public final StatsigOverrides getAllOverrides() {
        return new StatsigOverrides(this.localOverrides.getGates(), this.localOverrides.getConfigs(), this.localOverrides.getLayers());
    }

    public final InitializeResponse.SuccessfulInitializeResponse getCachedInitializationResponse() {
        return this.currentCache.getValues();
    }

    public final DynamicConfig getConfig(String configName) {
        AbstractC16544l.m18094g(configName, "configName");
        Map<String, Object> map = this.localOverrides.getConfigs().get(configName);
        if (map != null) {
            return new DynamicConfig(configName, getEvaluationDetails$build_release(false, EvaluationReason.LocalOverride), map, "override", null, null, false, false, false, null, 1008, null);
        }
        APIDynamicConfig configData = getConfigData(configName);
        return hydrateDynamicConfig(configName, getEvaluationDetails$build_release$default(this, configData != null, null, 2, null), configData);
    }

    public final ExternalInitializeResponse getCurrentCacheValuesAndEvaluationReason() {
        return new ExternalInitializeResponse(this.gson.m4375i(this.currentCache.getValues()), getEvaluationDetails$build_release$default(this, true, null, 2, null));
    }

    public final String getCurrentValuesAsString() {
        String strM4375i = this.gson.m4375i(this.currentCache.getValues());
        AbstractC16544l.m18093f(strM4375i, "gson.toJson(currentCache.values)");
        return strM4375i;
    }

    public final EvaluationDetails getEvaluationDetails$build_release(boolean valueExists, EvaluationReason reasonOverride) {
        if (valueExists) {
            return getGlobalEvaluationDetails$build_release();
        }
        EvaluationReason evaluationReason = EvaluationReason.Unrecognized;
        EvaluationReason evaluationReason2 = this.reason;
        EvaluationReason evaluationReason3 = EvaluationReason.Uninitialized;
        if (evaluationReason2 == evaluationReason3) {
            evaluationReason = evaluationReason3;
        }
        if (reasonOverride == null) {
            reasonOverride = evaluationReason;
        }
        return new EvaluationDetails(reasonOverride, System.currentTimeMillis());
    }

    public final DynamicConfig getExperiment(String experimentName, boolean keepDeviceValue) {
        APIDynamicConfig aPIDynamicConfig;
        AbstractC16544l.m18094g(experimentName, "experimentName");
        Map<String, Object> map = this.localOverrides.getConfigs().get(experimentName);
        if (map != null) {
            return new DynamicConfig(experimentName, getEvaluationDetails$build_release(false, EvaluationReason.LocalOverride), map, "override", null, null, false, false, false, null, 1008, null);
        }
        Map<String, APIDynamicConfig> configs = this.currentCache.getValues().getConfigs();
        APIDynamicConfig aPIDynamicConfig2 = configs == null ? null : configs.get(experimentName);
        if (aPIDynamicConfig2 != null) {
            aPIDynamicConfig = aPIDynamicConfig2;
        } else {
            Map<String, APIDynamicConfig> configs2 = this.currentCache.getValues().getConfigs();
            if (configs2 == null) {
                aPIDynamicConfig = null;
            } else {
                aPIDynamicConfig2 = configs2.get(Hashing.INSTANCE.getHashedString(experimentName, this.currentCache.getValues().getHashUsed()));
                aPIDynamicConfig = aPIDynamicConfig2;
            }
        }
        EvaluationDetails evaluationDetails$build_release$default = getEvaluationDetails$build_release$default(this, aPIDynamicConfig != null, null, 2, null);
        return hydrateDynamicConfig(experimentName, evaluationDetails$build_release$default, getPossiblyStickyValue(experimentName, aPIDynamicConfig, keepDeviceValue, evaluationDetails$build_release$default, false));
    }

    public final EvaluationDetails getGlobalEvaluationDetails$build_release() {
        EvaluationReason evaluationReason = this.reason;
        Long evaluationTime = this.currentCache.getEvaluationTime();
        return new EvaluationDetails(evaluationReason, evaluationTime == null ? System.currentTimeMillis() : evaluationTime.longValue());
    }

    public final Long getLastUpdateTime(StatsigUser user) {
        AbstractC16544l.m18094g(user, "user");
        Cache cache = this.cacheById.get(getScopedCacheKey(user));
        if (cache == null) {
            cache = this.cacheById.get(user.getCacheKeyDEPRECATED$build_release());
        }
        if (AbstractC16544l.m18089b(cache == null ? null : cache.getUserHash(), user.toHashString$build_release()) && cache != null) {
            return Long.valueOf(cache.getValues().getTime());
        }
        return null;
    }

    public final Layer getLayer(StatsigClient client, String layerName, boolean keepDeviceValue) {
        APIDynamicConfig aPIDynamicConfig;
        AbstractC16544l.m18094g(layerName, "layerName");
        Map<String, Object> map = this.localOverrides.getLayers().get(layerName);
        if (map != null) {
            return new Layer(null, layerName, getEvaluationDetails$build_release(false, EvaluationReason.LocalOverride), map, "override", null, null, null, false, false, false, null, null, 8160, null);
        }
        Map<String, APIDynamicConfig> layerConfigs = this.currentCache.getValues().getLayerConfigs();
        APIDynamicConfig aPIDynamicConfig2 = layerConfigs == null ? null : layerConfigs.get(layerName);
        if (aPIDynamicConfig2 != null) {
            aPIDynamicConfig = aPIDynamicConfig2;
        } else {
            Map<String, APIDynamicConfig> layerConfigs2 = this.currentCache.getValues().getLayerConfigs();
            if (layerConfigs2 == null) {
                aPIDynamicConfig = null;
            } else {
                aPIDynamicConfig2 = layerConfigs2.get(Hashing.INSTANCE.getHashedString(layerName, this.currentCache.getValues().getHashUsed()));
                aPIDynamicConfig = aPIDynamicConfig2;
            }
        }
        EvaluationDetails evaluationDetails$build_release$default = getEvaluationDetails$build_release$default(this, aPIDynamicConfig != null, null, 2, null);
        APIDynamicConfig possiblyStickyValue = getPossiblyStickyValue(layerName, aPIDynamicConfig, keepDeviceValue, evaluationDetails$build_release$default, true);
        if (possiblyStickyValue != null) {
            return new Layer(client, layerName, possiblyStickyValue, evaluationDetails$build_release$default);
        }
        return new Layer(client, layerName, evaluationDetails$build_release$default, null, null, null, null, null, false, false, false, null, null, 8184, null);
    }

    public final ParameterStore getParamStore(StatsigClient client, String paramStoreName) {
        AbstractC16544l.m18094g(client, "client");
        AbstractC16544l.m18094g(paramStoreName, "paramStoreName");
        InitializeResponse.SuccessfulInitializeResponse values = this.currentCache.getValues();
        if (values.getParamStores() == null) {
            return new ParameterStore(client, new HashMap(), getEvaluationDetails$build_release$default(this, false, null, 2, null));
        }
        Map<String, Map<String, Object>> map = values.getParamStores().get(paramStoreName);
        if (map != null) {
            return new ParameterStore(client, map, getEvaluationDetails$build_release$default(this, true, null, 2, null));
        }
        Map<String, Map<String, Object>> map2 = values.getParamStores().get(Hashing.INSTANCE.getHashedString(paramStoreName, this.currentCache.getValues().getHashUsed()));
        return new ParameterStore(client, map2 == null ? new HashMap<>() : map2, getEvaluationDetails$build_release$default(this, map2 != null, null, 2, null));
    }

    public final Map<String, String> getPreviousDerivedFields(StatsigUser user) {
        AbstractC16544l.m18094g(user, "user");
        Cache cache = this.cacheById.get(getScopedCacheKey(user));
        if (cache == null) {
            cache = this.cacheById.get(user.getCacheKeyDEPRECATED$build_release());
        }
        boolean zM18089b = AbstractC16544l.m18089b(cache == null ? null : cache.getUserHash(), user.toHashString$build_release());
        C17690x c17690x = C17690x.f56481Y;
        if (!zM18089b) {
            return c17690x;
        }
        Map<String, String> derivedFields = cache != null ? cache.getValues().getDerivedFields() : null;
        return derivedFields == null ? c17690x : derivedFields;
    }

    public final EvaluationReason getReason() {
        return this.reason;
    }

    public final void loadCacheForCurrentUser() {
        Cache cache = this.cacheById.get(this.currentUserCacheKeyV2);
        if (cache == null) {
            cache = this.cacheById.get(this.currentUserCacheKeyDeprecated);
        }
        if (cache == null) {
            this.currentCache = createEmptyCache();
        } else {
            this.reason = EvaluationReason.Cache;
            this.currentCache = cache;
        }
    }

    public final void overrideConfig(String configName, Map<String, ? extends Object> value) {
        AbstractC16544l.m18094g(configName, "configName");
        AbstractC16544l.m18094g(value, "value");
        this.localOverrides.getConfigs().put(configName, value);
    }

    public final void overrideGate(String gateName, boolean value) {
        AbstractC16544l.m18094g(gateName, "gateName");
        this.localOverrides.getGates().put(gateName, Boolean.valueOf(value));
    }

    public final void overrideLayer(String layerName, Map<String, ? extends Object> value) {
        AbstractC16544l.m18094g(layerName, "layerName");
        AbstractC16544l.m18094g(value, "value");
        this.localOverrides.getLayers().put(layerName, value);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object persistStickyValues(InterfaceC18770c<? super C17296C> interfaceC18770c) {
        C128511 c128511;
        Store store;
        if (interfaceC18770c instanceof C128511) {
            c128511 = (C128511) interfaceC18770c;
            int i10 = c128511.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c128511.label = i10 - Integer.MIN_VALUE;
            } else {
                c128511 = new C128511(interfaceC18770c);
            }
        } else {
            c128511 = new C128511(interfaceC18770c);
        }
        Object obj = c128511.result;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c128511.label;
        if (i11 != 0) {
            if (i11 == 1) {
                store = (Store) c128511.L$0;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        StatsigUtil statsigUtil = StatsigUtil.INSTANCE;
        SharedPreferences sharedPreferences = this.sharedPrefs;
        String strM4375i = this.gson.m4375i(this.cacheById);
        AbstractC16544l.m18093f(strM4375i, "gson.toJson(cacheById)");
        c128511.L$0 = this;
        c128511.label = 1;
        if (statsigUtil.saveStringToSharedPrefs$build_release(sharedPreferences, "Statsig.CACHE_BY_USER", strM4375i, c128511) == enumC19250a) {
            return enumC19250a;
        }
        store = this;
        StatsigUtil statsigUtil2 = StatsigUtil.INSTANCE;
        SharedPreferences sharedPreferences2 = store.sharedPrefs;
        String strM4375i2 = store.gson.m4375i(store.stickyDeviceExperiments);
        AbstractC16544l.m18093f(strM4375i2, "gson.toJson(stickyDeviceExperiments)");
        c128511.L$0 = null;
        c128511.label = 2;
        if (statsigUtil2.saveStringToSharedPrefs$build_release(sharedPreferences2, "Statsig.STICKY_DEVICE_EXPERIMENTS", strM4375i2, c128511) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }

    public final void removeAllOverrides() {
        this.localOverrides = StatsigOverrides.INSTANCE.empty();
    }

    public final void removeOverride(String name) {
        AbstractC16544l.m18094g(name, "name");
        this.localOverrides.getConfigs().remove(name);
        this.localOverrides.getGates().remove(name);
        this.localOverrides.getLayers().remove(name);
    }

    public final void resetUser(StatsigUser user) {
        AbstractC16544l.m18094g(user, "user");
        this.reason = EvaluationReason.Uninitialized;
        this.currentUserCacheKeyDeprecated = user.getCacheKeyDEPRECATED$build_release();
        this.currentUserCacheKeyV2 = getScopedCacheKey(user);
    }

    public final Object save(InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse, StatsigUser statsigUser, InterfaceC18770c<? super C17296C> interfaceC18770c) {
        String scopedCacheKey = getScopedCacheKey(statsigUser);
        Cache cacheCreateEmptyCache = this.cacheById.get(scopedCacheKey);
        if (cacheCreateEmptyCache == null) {
            cacheCreateEmptyCache = createEmptyCache();
        }
        AbstractC16544l.m18093f(cacheCreateEmptyCache, "cacheById[cacheKey] ?: createEmptyCache()");
        cacheCreateEmptyCache.setValues(successfulInitializeResponse);
        cacheCreateEmptyCache.setEvaluationTime(new Long(System.currentTimeMillis()));
        cacheCreateEmptyCache.setUserHash(statsigUser.toHashString$build_release());
        this.cacheById.put(scopedCacheKey, cacheCreateEmptyCache);
        if (AbstractC16544l.m18089b(scopedCacheKey, this.currentUserCacheKeyV2)) {
            this.currentCache = cacheCreateEmptyCache;
            setReason(successfulInitializeResponse.getHasUpdates() ? EvaluationReason.Network : EvaluationReason.NetworkNotModified);
        }
        this.cacheById.remove(statsigUser.getCacheKeyDEPRECATED$build_release());
        String cacheString = this.gson.m4375i(this.cacheById);
        if (cacheString.length() / 1024 > 1024 && this.cacheById.size() > 1) {
            ConcurrentHashMap<String, Cache> concurrentHashMap = new ConcurrentHashMap<>();
            this.cacheById = concurrentHashMap;
            concurrentHashMap.put(this.currentUserCacheKeyV2, this.currentCache);
            cacheString = this.gson.m4375i(this.cacheById);
        }
        StatsigUtil statsigUtil = StatsigUtil.INSTANCE;
        SharedPreferences sharedPreferences = this.sharedPrefs;
        AbstractC16544l.m18093f(cacheString, "cacheString");
        Object objSaveStringToSharedPrefs$build_release = statsigUtil.saveStringToSharedPrefs$build_release(sharedPreferences, "Statsig.CACHE_BY_USER", cacheString, interfaceC18770c);
        return objSaveStringToSharedPrefs$build_release == EnumC19250a.f61036Y ? objSaveStringToSharedPrefs$build_release : C17296C.f55119a;
    }

    public final void setReason(EvaluationReason evaluationReason) {
        AbstractC16544l.m18094g(evaluationReason, "<set-?>");
        this.reason = evaluationReason;
    }

    public final void syncLoadFromLocalStorage() {
        StatsigUtil statsigUtil = StatsigUtil.INSTANCE;
        String strSyncGetFromSharedPrefs$build_release = statsigUtil.syncGetFromSharedPrefs$build_release(this.sharedPrefs, "Statsig.CACHE_BY_USER");
        String strSyncGetFromSharedPrefs$build_release2 = statsigUtil.syncGetFromSharedPrefs$build_release(this.sharedPrefs, "Statsig.STICKY_DEVICE_EXPERIMENTS");
        String strSyncGetFromSharedPrefs$build_release3 = statsigUtil.syncGetFromSharedPrefs$build_release(this.sharedPrefs, "Statsig.LOCAL_OVERRIDES");
        if (strSyncGetFromSharedPrefs$build_release != null) {
            Type type = new TypeToken<Map<String, Cache>>() { // from class: com.statsig.androidsdk.Store$syncLoadFromLocalStorage$type$1
            }.getType();
            try {
                C3669l c3669l = this.gson;
                c3669l.getClass();
                Object objM4370d = c3669l.m4370d(new StringReader(strSyncGetFromSharedPrefs$build_release), TypeToken.get(type));
                AbstractC16544l.m18093f(objM4370d, "gson.fromJson(cachedResponse, type)");
                this.cacheById = new ConcurrentHashMap<>((Map) objM4370d);
            } catch (Exception unused) {
                AbstractC0575H.m1156D(this.statsigScope, this.dispatcherProvider.getIo(), null, new C128521(null), 2);
            }
        }
        this.stickyDeviceExperiments = new ConcurrentHashMap<>();
        if (strSyncGetFromSharedPrefs$build_release2 != null) {
            Type type2 = new TypeToken<Map<String, APIDynamicConfig>>() { // from class: com.statsig.androidsdk.Store$syncLoadFromLocalStorage$type$2
            }.getType();
            try {
                C3669l c3669l2 = this.gson;
                c3669l2.getClass();
                Object objM4370d2 = c3669l2.m4370d(new StringReader(strSyncGetFromSharedPrefs$build_release2), TypeToken.get(type2));
                AbstractC16544l.m18093f(objM4370d2, "gson.fromJson(cachedDeviceValues, type)");
                this.stickyDeviceExperiments = new ConcurrentHashMap<>((Map) objM4370d2);
            } catch (Exception unused2) {
                AbstractC0575H.m1156D(this.statsigScope, this.dispatcherProvider.getIo(), null, new C128532(null), 2);
            }
        }
        this.localOverrides = StatsigOverrides.INSTANCE.empty();
        if (strSyncGetFromSharedPrefs$build_release3 != null) {
            try {
                Object objM4371e = this.gson.m4371e(StatsigOverrides.class, strSyncGetFromSharedPrefs$build_release3);
                AbstractC16544l.m18093f(objM4371e, "gson.fromJson(cachedLocalOverrides, StatsigOverrides::class.java)");
                this.localOverrides = (StatsigOverrides) objM4371e;
            } catch (Exception unused3) {
                AbstractC0575H.m1156D(this.statsigScope, this.dispatcherProvider.getIo(), null, new C128543(null), 2);
            }
        }
        loadCacheForCurrentUser();
    }

    public final Object saveOverridesToLocalStorage(InterfaceC18770c<? super C17296C> interfaceC18770c) {
        StatsigUtil statsigUtil = StatsigUtil.INSTANCE;
        SharedPreferences sharedPreferences = this.sharedPrefs;
        String strM4375i = this.gson.m4375i(this.localOverrides);
        AbstractC16544l.m18093f(strM4375i, "gson.toJson(localOverrides)");
        Object objSaveStringToSharedPrefs$build_release = statsigUtil.saveStringToSharedPrefs$build_release(sharedPreferences, SfpOlmlMATQ.MwnaQ, strM4375i, interfaceC18770c);
        return objSaveStringToSharedPrefs$build_release == EnumC19250a.f61036Y ? objSaveStringToSharedPrefs$build_release : C17296C.f55119a;
    }
}
