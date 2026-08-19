package com.statsig.androidsdk;

import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0574G0;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$setupAsync$2", m20656f = "StatsigClient.kt", m20657l = {726}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lcom/statsig/androidsdk/InitializationDetails;", "<anonymous>", "(LAn/F;)Lcom/statsig/androidsdk/InitializationDetails;"}, m18068k = 3, m18069mv = {1, 5, 1})
public final class StatsigClient$setupAsync$2 extends AbstractC19694j implements InterfaceC1439n {
    final /* synthetic */ StatsigUser $user;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StatsigClient this$0;

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$setupAsync$2$1 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$setupAsync$2$1", m20656f = "StatsigClient.kt", m20657l = {749, 763}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m18067d2 = {"<anonymous>", "Lcom/statsig/androidsdk/InitializationDetails;"}, m18068k = 3, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class C128251 extends AbstractC19694j implements InterfaceC1436k {
        final /* synthetic */ InterfaceC0571F $$this$withContext;
        final /* synthetic */ StatsigUser $user;
        Object L$0;
        int label;
        final /* synthetic */ StatsigClient this$0;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$setupAsync$2$1$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$setupAsync$2$1$1", m20656f = "StatsigClient.kt", m20657l = {776}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
        public static final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StatsigClient statsigClient, InterfaceC18770c<? super AnonymousClass1> interfaceC18770c) {
                super(2, interfaceC18770c);
                this.this$0 = statsigClient;
            }

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
                return new AnonymousClass1(this.this$0, interfaceC18770c);
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
                return ((AnonymousClass1) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.label;
                try {
                    if (i10 == 0) {
                        AbstractC9233X.m9807c(obj);
                        StatsigNetwork statsigNetwork$build_release = this.this$0.getStatsigNetwork$build_release();
                        String eventLoggingAPI = this.this$0.getOptions$build_release().getEventLoggingAPI();
                        this.label = 1;
                        if (statsigNetwork$build_release.apiRetryFailedLogs(eventLoggingAPI, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(obj);
                    }
                } catch (Exception unused) {
                }
                return C17296C.f55119a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128251(StatsigClient statsigClient, StatsigUser statsigUser, InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C128251> interfaceC18770c) {
            super(1, interfaceC18770c);
            this.this$0 = statsigClient;
            this.$user = statsigUser;
            this.$$this$withContext = interfaceC0571F;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(InterfaceC18770c<?> interfaceC18770c) {
            return new C128251(this.this$0, this.$user, this.$$this$withContext, interfaceC18770c);
        }

        /* JADX WARN: Code duplicated, block: B:101:0x027e  */
        /* JADX WARN: Code duplicated, block: B:102:0x0284  */
        /* JADX WARN: Code duplicated, block: B:76:0x01e2  */
        /* JADX WARN: Code duplicated, block: B:82:0x01ff  */
        /* JADX WARN: Code duplicated, block: B:84:0x0213  */
        /* JADX WARN: Code duplicated, block: B:86:0x0220 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:89:0x0229  */
        /* JADX WARN: Code duplicated, block: B:90:0x0237  */
        /* JADX WARN: Code duplicated, block: B:92:0x023c  */
        /* JADX WARN: Code duplicated, block: B:94:0x0241  */
        /* JADX WARN: Code duplicated, block: B:98:0x0257  */
        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            Object objInitialize;
            InitializeResponse cachedInitializationResponse;
            InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse;
            Diagnostics diagnostics;
            Store store;
            StatsigUser statsigUser;
            long j10;
            InitializeResponse.FailedInitializeResponse failedInitializeResponse;
            Diagnostics diagnostics2;
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            boolean z6 = true;
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC9233X.m9807c(obj);
                    objInitialize = obj;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cachedInitializationResponse = (InitializeResponse) this.L$0;
                    AbstractC9233X.m9807c(obj);
                    z6 = true;
                }
                diagnostics2 = this.this$0.diagnostics;
                if (diagnostics2 == null) {
                    AbstractC16544l.m18103p("diagnostics");
                    throw null;
                }
                diagnostics2.markEnd(KeyType.INITIALIZE, true, (8 & 4) != 0 ? null : StepType.PROCESS, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : null);
                this.this$0.pollForUpdates();
                if (this.this$0.getOptions$build_release().getDisableLogEventRetries() != z6) {
                    AbstractC0575H.m1156D(this.$$this$withContext, this.this$0.dispatcherProvider.getIo(), null, new AnonymousClass1(this.this$0, null), 2);
                }
                boolean z10 = cachedInitializationResponse instanceof InitializeResponse.SuccessfulInitializeResponse;
                this.this$0.logEndDiagnostics(z10, ContextType.INITIALIZE, cachedInitializationResponse);
                if (cachedInitializationResponse instanceof InitializeResponse.FailedInitializeResponse) {
                    failedInitializeResponse = (InitializeResponse.FailedInitializeResponse) cachedInitializationResponse;
                    j10 = 0;
                } else {
                    j10 = 0;
                    failedInitializeResponse = null;
                }
                return new InitializationDetails(j10, z10, failedInitializeResponse);
            }
            AbstractC9233X.m9807c(obj);
            if (this.this$0.isBootstrapped.get()) {
                Store store2 = this.this$0.store;
                if (store2 == null) {
                    AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                    throw null;
                }
                EvaluationDetails globalEvaluationDetails$build_release = store2.getGlobalEvaluationDetails$build_release();
                Diagnostics diagnostics3 = this.this$0.diagnostics;
                if (diagnostics3 == null) {
                    AbstractC16544l.m18103p("diagnostics");
                    throw null;
                }
                diagnostics3.markEnd(KeyType.OVERALL, globalEvaluationDetails$build_release.getReason() == EvaluationReason.Bootstrap, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : new Marker(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, globalEvaluationDetails$build_release, null, null, null, null, 1015807, null), (8 & 16) != 0 ? null : null);
                StatsigLogger statsigLogger = this.this$0.logger;
                if (statsigLogger != null) {
                    StatsigLogger.logDiagnostics$default(statsigLogger, null, 1, null);
                    return new InitializationDetails(0L, true, null);
                }
                AbstractC16544l.m18103p("logger");
                throw null;
            }
            if (this.this$0.getOptions$build_release().getLoadCacheAsync()) {
                Diagnostics diagnostics4 = this.this$0.diagnostics;
                if (diagnostics4 == null) {
                    AbstractC16544l.m18103p("diagnostics");
                    throw null;
                }
                KeyType keyType = KeyType.INITIALIZE;
                StepType stepType = StepType.LOAD_CACHE;
                Diagnostics.markStart$default(diagnostics4, keyType, stepType, new Marker(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.FALSE, 524287, null), null, 8, null);
                Store store3 = this.this$0.store;
                if (store3 == null) {
                    AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                    throw null;
                }
                store3.syncLoadFromLocalStorage();
                Diagnostics diagnostics5 = this.this$0.diagnostics;
                if (diagnostics5 == null) {
                    AbstractC16544l.m18103p("diagnostics");
                    throw null;
                }
                diagnostics5.markEnd(keyType, true, (8 & 4) != 0 ? null : stepType, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : null);
            }
            if (this.this$0.getOptions$build_release().getInitializeOffline()) {
                Store store4 = this.this$0.store;
                if (store4 == null) {
                    AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                    throw null;
                }
                cachedInitializationResponse = store4.getCachedInitializationResponse();
                z6 = true;
            } else {
                StatsigNetwork statsigNetwork$build_release = this.this$0.getStatsigNetwork$build_release();
                String api = this.this$0.getOptions$build_release().getApi();
                StatsigUser statsigUser2 = this.$user;
                Store store5 = this.this$0.store;
                if (store5 == null) {
                    AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                    throw null;
                }
                StatsigUser statsigUser3 = this.this$0.user;
                if (statsigUser3 == null) {
                    AbstractC16544l.m18103p("user");
                    throw null;
                }
                Long lastUpdateTime = store5.getLastUpdateTime(statsigUser3);
                StatsigMetadata statsigMetadata = this.this$0.statsigMetadata;
                if (statsigMetadata == null) {
                    AbstractC16544l.m18103p("statsigMetadata");
                    throw null;
                }
                InterfaceC0571F interfaceC0571F = this.this$0.statsigScope;
                if (interfaceC0571F == null) {
                    AbstractC16544l.m18103p("statsigScope");
                    throw null;
                }
                ContextType contextType = ContextType.INITIALIZE;
                Diagnostics diagnostics6 = this.this$0.diagnostics;
                if (diagnostics6 == null) {
                    AbstractC16544l.m18103p("diagnostics");
                    throw null;
                }
                HashAlgorithm hashAlgorithm = AbstractC16544l.m18089b(this.this$0.getOptions$build_release().getDisableHashing(), Boolean.TRUE) ? HashAlgorithm.NONE : HashAlgorithm.DJB2;
                Store store6 = this.this$0.store;
                if (store6 == null) {
                    AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                    throw null;
                }
                StatsigUser statsigUser4 = this.this$0.user;
                if (statsigUser4 == null) {
                    AbstractC16544l.m18103p("user");
                    throw null;
                }
                Map<String, String> previousDerivedFields = store6.getPreviousDerivedFields(statsigUser4);
                this.label = 1;
                objInitialize = statsigNetwork$build_release.initialize(api, statsigUser2, lastUpdateTime, statsigMetadata, interfaceC0571F, contextType, diagnostics6, hashAlgorithm, previousDerivedFields, this);
                if (objInitialize == enumC19250a) {
                    return enumC19250a;
                }
            }
            if (cachedInitializationResponse instanceof InitializeResponse.SuccessfulInitializeResponse) {
                successfulInitializeResponse = (InitializeResponse.SuccessfulInitializeResponse) cachedInitializationResponse;
                if (successfulInitializeResponse.getHasUpdates() && !this.this$0.getOptions$build_release().getInitializeOffline()) {
                    diagnostics = this.this$0.diagnostics;
                    if (diagnostics != null) {
                        AbstractC16544l.m18103p("diagnostics");
                        throw null;
                    }
                    Diagnostics.markStart$default(diagnostics, KeyType.INITIALIZE, StepType.PROCESS, null, null, 12, null);
                    store = this.this$0.store;
                    if (store != null) {
                        AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                        throw null;
                    }
                    statsigUser = this.$user;
                    this.L$0 = cachedInitializationResponse;
                    this.label = 2;
                    if (store.save(successfulInitializeResponse, statsigUser, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    diagnostics2 = this.this$0.diagnostics;
                    if (diagnostics2 == null) {
                        AbstractC16544l.m18103p("diagnostics");
                        throw null;
                    }
                    diagnostics2.markEnd(KeyType.INITIALIZE, true, (8 & 4) != 0 ? null : StepType.PROCESS, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : null);
                }
            }
            this.this$0.pollForUpdates();
            if (this.this$0.getOptions$build_release().getDisableLogEventRetries() != z6) {
                AbstractC0575H.m1156D(this.$$this$withContext, this.this$0.dispatcherProvider.getIo(), null, new AnonymousClass1(this.this$0, null), 2);
            }
            boolean z11 = cachedInitializationResponse instanceof InitializeResponse.SuccessfulInitializeResponse;
            this.this$0.logEndDiagnostics(z11, ContextType.INITIALIZE, cachedInitializationResponse);
            if (cachedInitializationResponse instanceof InitializeResponse.FailedInitializeResponse) {
                failedInitializeResponse = (InitializeResponse.FailedInitializeResponse) cachedInitializationResponse;
                j10 = 0;
            } else {
                j10 = 0;
                failedInitializeResponse = null;
            }
            return new InitializationDetails(j10, z11, failedInitializeResponse);
            cachedInitializationResponse = (InitializeResponse) objInitialize;
            if (cachedInitializationResponse instanceof InitializeResponse.SuccessfulInitializeResponse) {
                successfulInitializeResponse = (InitializeResponse.SuccessfulInitializeResponse) cachedInitializationResponse;
                if (successfulInitializeResponse.getHasUpdates()) {
                    diagnostics = this.this$0.diagnostics;
                    if (diagnostics != null) {
                        AbstractC16544l.m18103p("diagnostics");
                        throw null;
                    }
                    Diagnostics.markStart$default(diagnostics, KeyType.INITIALIZE, StepType.PROCESS, null, null, 12, null);
                    store = this.this$0.store;
                    if (store != null) {
                        AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                        throw null;
                    }
                    statsigUser = this.$user;
                    this.L$0 = cachedInitializationResponse;
                    this.label = 2;
                    if (store.save(successfulInitializeResponse, statsigUser, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    diagnostics2 = this.this$0.diagnostics;
                    if (diagnostics2 == null) {
                        AbstractC16544l.m18103p("diagnostics");
                        throw null;
                    }
                    diagnostics2.markEnd(KeyType.INITIALIZE, true, (8 & 4) != 0 ? null : StepType.PROCESS, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : null);
                }
            }
            this.this$0.pollForUpdates();
            if (this.this$0.getOptions$build_release().getDisableLogEventRetries() != z6) {
                AbstractC0575H.m1156D(this.$$this$withContext, this.this$0.dispatcherProvider.getIo(), null, new AnonymousClass1(this.this$0, null), 2);
            }
            boolean z12 = cachedInitializationResponse instanceof InitializeResponse.SuccessfulInitializeResponse;
            this.this$0.logEndDiagnostics(z12, ContextType.INITIALIZE, cachedInitializationResponse);
            if (cachedInitializationResponse instanceof InitializeResponse.FailedInitializeResponse) {
                failedInitializeResponse = (InitializeResponse.FailedInitializeResponse) cachedInitializationResponse;
                j10 = 0;
            } else {
                j10 = 0;
                failedInitializeResponse = null;
            }
            return new InitializationDetails(j10, z12, failedInitializeResponse);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(InterfaceC18770c<? super InitializationDetails> interfaceC18770c) {
            return ((C128251) create(interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$setupAsync$2$2 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$setupAsync$2$2", m20656f = "StatsigClient.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u008a@"}, m18067d2 = {"<anonymous>", "Lcom/statsig/androidsdk/InitializationDetails;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;"}, m18068k = 3, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class C128262 extends AbstractC19694j implements InterfaceC1439n {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ StatsigClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128262(StatsigClient statsigClient, InterfaceC18770c<? super C128262> interfaceC18770c) {
            super(2, interfaceC18770c);
            this.this$0 = statsigClient;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            C128262 c128262 = new C128262(this.this$0, interfaceC18770c);
            c128262.L$0 = obj;
            return c128262;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Exception exc, InterfaceC18770c<? super InitializationDetails> interfaceC18770c) {
            return ((C128262) create(exc, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            Exception exc = (Exception) this.L$0;
            this.this$0.logEndDiagnosticsWhenException(ContextType.INITIALIZE, exc);
            return new InitializationDetails(0L, false, new InitializeResponse.FailedInitializeResponse(exc instanceof C0574G0 ? InitializeFailReason.CoroutineTimeout : InitializeFailReason.InternalError, exc, null, 4, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigClient$setupAsync$2(StatsigClient statsigClient, StatsigUser statsigUser, InterfaceC18770c<? super StatsigClient$setupAsync$2> interfaceC18770c) {
        super(2, interfaceC18770c);
        this.this$0 = statsigClient;
        this.$user = statsigUser;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
        StatsigClient$setupAsync$2 statsigClient$setupAsync$2 = new StatsigClient$setupAsync$2(this.this$0, this.$user, interfaceC18770c);
        statsigClient$setupAsync$2.L$0 = obj;
        return statsigClient$setupAsync$2;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super InitializationDetails> interfaceC18770c) {
        return ((StatsigClient$setupAsync$2) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.L$0;
            ErrorBoundary errorBoundary = this.this$0.getErrorBoundary();
            C128251 c128251 = new C128251(this.this$0, this.$user, interfaceC0571F, null);
            C128262 c128262 = new C128262(this.this$0, null);
            this.label = 1;
            obj = errorBoundary.captureAsync(c128251, c128262, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
