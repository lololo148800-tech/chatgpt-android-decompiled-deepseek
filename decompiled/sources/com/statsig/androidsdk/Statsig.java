package com.statsig.androidsdk;

import android.app.Application;
import android.content.Context;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.InterfaceC0571F;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p050Bn.C1451e;
import p1053v3.p1054lN.IGDwkYw;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p571X9.AbstractC9233X;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0012\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0015J-\u0010 \u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00110\u001cj\u0002`\u001e¢\u0006\u0004\b \u0010!JA\u0010#\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u0006H\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u0006H\u0007¢\u0006\u0004\b(\u0010'J\u0017\u0010*\u001a\u00020)2\u0006\u0010%\u001a\u00020\u0006H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020)2\u0006\u0010%\u001a\u00020\u0006H\u0007¢\u0006\u0004\b,\u0010+J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020\u0006H\u0007¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020.2\u0006\u0010-\u001a\u00020\u0006H\u0007¢\u0006\u0004\b1\u00100J!\u00104\u001a\u00020.2\u0006\u00102\u001a\u00020\u00062\b\b\u0002\u00103\u001a\u00020\u001dH\u0007¢\u0006\u0004\b4\u00105J!\u00106\u001a\u00020.2\u0006\u00102\u001a\u00020\u00062\b\b\u0002\u00103\u001a\u00020\u001dH\u0007¢\u0006\u0004\b6\u00105J!\u00109\u001a\u0002082\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00103\u001a\u00020\u001dH\u0007¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020<2\u0006\u0010;\u001a\u00020\u0006H\u0007¢\u0006\u0004\b=\u0010>J!\u0010?\u001a\u0002082\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00103\u001a\u00020\u001dH\u0007¢\u0006\u0004\b?\u0010:J\u0017\u0010@\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0006H\u0007¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u0006H\u0007¢\u0006\u0004\bB\u0010AJ!\u0010C\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u00062\b\b\u0002\u00103\u001a\u00020\u001dH\u0007¢\u0006\u0004\bC\u0010DJ)\u0010F\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00062\b\b\u0002\u00103\u001a\u00020\u001dH\u0007¢\u0006\u0004\bF\u0010GJ;\u0010L\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\u00062\n\b\u0002\u0010J\u001a\u0004\u0018\u00010I2\u0016\b\u0002\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fH\u0007¢\u0006\u0004\bL\u0010MJ7\u0010L\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u00062\u0016\b\u0002\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fH\u0007¢\u0006\u0004\bL\u0010NJ+\u0010L\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\u00062\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000fH\u0007¢\u0006\u0004\bL\u0010OJ=\u0010P\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\"2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fH\u0007¢\u0006\u0004\bP\u0010QJ\u001f\u0010R\u001a\u00020\u00112\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\"H\u0087@ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u0011H\u0007¢\u0006\u0004\bT\u0010\u0003J\u0013\u0010U\u001a\u00020\u0011H\u0087@ø\u0001\u0000¢\u0006\u0004\bU\u0010\u0015J\u000f\u0010V\u001a\u00020\u001dH\u0007¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u0006H\u0007¢\u0006\u0004\bX\u0010YJ\u001f\u0010Z\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u001dH\u0007¢\u0006\u0004\bZ\u0010DJ+\u0010[\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00062\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000fH\u0007¢\u0006\u0004\b[\u0010OJ+\u0010\\\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00062\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000fH\u0007¢\u0006\u0004\b\\\u0010OJ\u0017\u0010^\u001a\u00020\u00112\u0006\u0010]\u001a\u00020\u0006H\u0007¢\u0006\u0004\b^\u0010AJ\u000f\u0010_\u001a\u00020\u0011H\u0007¢\u0006\u0004\b_\u0010\u0003J\u000f\u0010a\u001a\u00020`H\u0007¢\u0006\u0004\ba\u0010bJ\u0017\u0010d\u001a\u00020\u00112\u0006\u0010c\u001a\u00020\u0006H\u0002¢\u0006\u0004\bd\u0010AR(\u0010f\u001a\u00020e8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bf\u0010g\u0012\u0004\bl\u0010\u0003\u001a\u0004\bh\u0010i\"\u0004\bj\u0010k\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006m"}, m18067d2 = {"Lcom/statsig/androidsdk/Statsig;", "", "<init>", "()V", "Landroid/app/Application;", SIPServerTransaction.CONTENT_TYPE_APPLICATION, "", "sdkKey", "Lcom/statsig/androidsdk/StatsigUser;", "user", "Lcom/statsig/androidsdk/StatsigOptions;", "options", "Lcom/statsig/androidsdk/InitializationDetails;", "initialize", "(Landroid/app/Application;Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/StatsigOptions;Lqm/c;)Ljava/lang/Object;", "", "values", "Lmm/C;", "updateUser", "(Lcom/statsig/androidsdk/StatsigUser;Ljava/util/Map;Lqm/c;)Ljava/lang/Object;", "refreshCache", "(Lqm/c;)Ljava/lang/Object;", "Lcom/statsig/androidsdk/ExternalInitializeResponse;", "getInitializeResponseJson", "()Lcom/statsig/androidsdk/ExternalInitializeResponse;", "shutdownSuspend", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "", "Lcom/statsig/androidsdk/DebugViewCallback;", "callback", "openDebugView", "(Landroid/content/Context;LBm/k;)V", "Lcom/statsig/androidsdk/IStatsigCallback;", "initializeAsync", "(Landroid/app/Application;Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/IStatsigCallback;Lcom/statsig/androidsdk/StatsigOptions;)V", "gateName", "checkGate", "(Ljava/lang/String;)Z", "checkGateWithExposureLoggingDisabled", "Lcom/statsig/androidsdk/FeatureGate;", "getFeatureGate", "(Ljava/lang/String;)Lcom/statsig/androidsdk/FeatureGate;", "getFeatureGateWithExposureLoggingDisabled", "configName", "Lcom/statsig/androidsdk/DynamicConfig;", "getConfig", "(Ljava/lang/String;)Lcom/statsig/androidsdk/DynamicConfig;", "getConfigWithExposureLoggingDisabled", "experimentName", "keepDeviceValue", "getExperiment", "(Ljava/lang/String;Z)Lcom/statsig/androidsdk/DynamicConfig;", "getExperimentWithExposureLoggingDisabled", "layerName", "Lcom/statsig/androidsdk/Layer;", "getLayer", "(Ljava/lang/String;Z)Lcom/statsig/androidsdk/Layer;", "parameterStoreName", "Lcom/statsig/androidsdk/ParameterStore;", "getParameterStore", "(Ljava/lang/String;)Lcom/statsig/androidsdk/ParameterStore;", "getLayerWithExposureLoggingDisabled", "manuallyLogGateExposure", "(Ljava/lang/String;)V", "manuallyLogConfigExposure", "manuallyLogExperimentExposure", "(Ljava/lang/String;Z)V", "parameterName", "manuallyLogLayerParameterExposure", "(Ljava/lang/String;Ljava/lang/String;Z)V", "eventName", "", "value", "metadata", "logEvent", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/util/Map;)V", "updateUserAsync", "(Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/IStatsigCallback;Ljava/util/Map;)V", "refreshCacheAsync", "(Lcom/statsig/androidsdk/IStatsigCallback;Lqm/c;)Ljava/lang/Object;", "shutdown", "flush", "isInitialized", "()Z", "getStableID", "()Ljava/lang/String;", "overrideGate", "overrideConfig", "overrideLayer", DiagnosticsEntry.NAME_KEY, "removeOverride", "removeAllOverrides", "Lcom/statsig/androidsdk/StatsigOverrides;", "getAllOverrides", "()Lcom/statsig/androidsdk/StatsigOverrides;", "functionName", "enforceInitialized", "Lcom/statsig/androidsdk/StatsigClient;", "client", "Lcom/statsig/androidsdk/StatsigClient;", "getClient$build_release", "()Lcom/statsig/androidsdk/StatsigClient;", "setClient$build_release", "(Lcom/statsig/androidsdk/StatsigClient;)V", "getClient$build_release$annotations", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class Statsig {
    public static final Statsig INSTANCE = new Statsig();
    private static StatsigClient client = new StatsigClient();

    /* JADX INFO: renamed from: com.statsig.androidsdk.Statsig$shutdown$1 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.Statsig$shutdown$1", m20656f = "Statsig.kt", m20657l = {377}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C127831 extends AbstractC19694j implements InterfaceC1439n {
        int label;

        /* JADX INFO: renamed from: com.statsig.androidsdk.Statsig$shutdown$1$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.statsig.androidsdk.Statsig$shutdown$1$1", m20656f = "Statsig.kt", m20657l = {378}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
        public static final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {
            int label;

            public AnonymousClass1(InterfaceC18770c<? super AnonymousClass1> interfaceC18770c) {
                super(2, interfaceC18770c);
            }

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
                return new AnonymousClass1(interfaceC18770c);
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
                return ((AnonymousClass1) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    Statsig statsig = Statsig.INSTANCE;
                    this.label = 1;
                    if (statsig.shutdownSuspend(this) == enumC19250a) {
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

        public C127831(InterfaceC18770c<? super C127831> interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            return new C127831(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C127831) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C3516e c3516e = AbstractC0593T.f1824a;
                C1451e c1451e = AbstractC2935m.f8797a.f3819q0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                if (AbstractC0575H.m1168P(c1451e, anonymousClass1, this) == enumC19250a) {
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

    /* JADX INFO: renamed from: com.statsig.androidsdk.Statsig$shutdownSuspend$1 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.Statsig", m20656f = "Statsig.kt", m20657l = {365}, m20658m = "shutdownSuspend")
    @Metadata(m18068k = 3, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class C127841 extends AbstractC19687c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C127841(InterfaceC18770c<? super C127841> interfaceC18770c) {
            super(interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Statsig.this.shutdownSuspend(this);
        }
    }

    private Statsig() {
    }

    public static final boolean checkGate(String gateName) {
        AbstractC16544l.m18094g(gateName, "gateName");
        return client.checkGate(gateName);
    }

    public static final boolean checkGateWithExposureLoggingDisabled(String gateName) {
        AbstractC16544l.m18094g(gateName, "gateName");
        return client.checkGateWithExposureLoggingDisabled(gateName);
    }

    private final void enforceInitialized(String functionName) {
        client.enforceInitialized$build_release(functionName);
    }

    public static final Object flush(InterfaceC18770c<? super C17296C> interfaceC18770c) {
        Statsig statsig = INSTANCE;
        statsig.enforceInitialized("flush");
        Object objFlush = statsig.getClient$build_release().flush(interfaceC18770c);
        return objFlush == EnumC19250a.f61036Y ? objFlush : C17296C.f55119a;
    }

    public static final StatsigOverrides getAllOverrides() {
        return client.getAllOverrides();
    }

    public static /* synthetic */ void getClient$build_release$annotations() {
    }

    public static final DynamicConfig getConfig(String configName) {
        AbstractC16544l.m18094g(configName, "configName");
        return client.getConfig(configName);
    }

    public static final DynamicConfig getConfigWithExposureLoggingDisabled(String configName) {
        AbstractC16544l.m18094g(configName, "configName");
        return client.getConfigWithExposureLoggingDisabled(configName);
    }

    public static final DynamicConfig getExperiment(String experimentName) {
        AbstractC16544l.m18094g(experimentName, "experimentName");
        return getExperiment$default(experimentName, false, 2, null);
    }

    public static /* synthetic */ DynamicConfig getExperiment$default(String str, boolean z6, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        return getExperiment(str, z6);
    }

    public static final DynamicConfig getExperimentWithExposureLoggingDisabled(String str) {
        AbstractC16544l.m18094g(str, IGDwkYw.hdMZ);
        return getExperimentWithExposureLoggingDisabled$default(str, false, 2, null);
    }

    public static /* synthetic */ DynamicConfig getExperimentWithExposureLoggingDisabled$default(String str, boolean z6, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        return getExperimentWithExposureLoggingDisabled(str, z6);
    }

    public static final FeatureGate getFeatureGate(String gateName) {
        AbstractC16544l.m18094g(gateName, "gateName");
        return client.getFeatureGate(gateName);
    }

    public static final FeatureGate getFeatureGateWithExposureLoggingDisabled(String gateName) {
        AbstractC16544l.m18094g(gateName, "gateName");
        return client.getFeatureGateWithExposureLoggingDisabled(gateName);
    }

    public static final Layer getLayer(String layerName) {
        AbstractC16544l.m18094g(layerName, "layerName");
        return getLayer$default(layerName, false, 2, null);
    }

    public static /* synthetic */ Layer getLayer$default(String str, boolean z6, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        return getLayer(str, z6);
    }

    public static final Layer getLayerWithExposureLoggingDisabled(String layerName) {
        AbstractC16544l.m18094g(layerName, "layerName");
        return getLayerWithExposureLoggingDisabled$default(layerName, false, 2, null);
    }

    public static /* synthetic */ Layer getLayerWithExposureLoggingDisabled$default(String str, boolean z6, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        return getLayerWithExposureLoggingDisabled(str, z6);
    }

    public static final ParameterStore getParameterStore(String parameterStoreName) {
        AbstractC16544l.m18094g(parameterStoreName, "parameterStoreName");
        return client.getParameterStore(parameterStoreName);
    }

    public static final String getStableID() {
        return client.getStableID();
    }

    public static final void initializeAsync(Application application, String sdkKey) {
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(sdkKey, "sdkKey");
        initializeAsync$default(application, sdkKey, null, null, null, 28, null);
    }

    public static /* synthetic */ void initializeAsync$default(Application application, String str, StatsigUser statsigUser, IStatsigCallback iStatsigCallback, StatsigOptions statsigOptions, int i10, Object obj) {
        initializeAsync(application, str, (i10 & 4) != 0 ? null : statsigUser, (i10 & 8) == 0 ? iStatsigCallback : null, (i10 & 16) != 0 ? new StatsigOptions(null, null, false, false, 0L, false, null, false, null, false, null, null, null, null, false, false, 65535, null) : statsigOptions);
    }

    public static final boolean isInitialized() {
        return client.isInitialized();
    }

    public static final void logEvent(String eventName) {
        AbstractC16544l.m18094g(eventName, "eventName");
        logEvent$default(eventName, (Double) null, (Map) null, 6, (Object) null);
    }

    public static /* synthetic */ void logEvent$default(String str, Double d10, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            d10 = null;
        }
        if ((i10 & 4) != 0) {
            map = null;
        }
        logEvent(str, d10, (Map<String, String>) map);
    }

    public static final void manuallyLogConfigExposure(String configName) {
        AbstractC16544l.m18094g(configName, "configName");
        client.manuallyLogConfigExposure(configName);
    }

    public static final void manuallyLogExperimentExposure(String experimentName, boolean keepDeviceValue) {
        AbstractC16544l.m18094g(experimentName, "experimentName");
        client.manuallyLogExperimentExposure(experimentName, keepDeviceValue);
    }

    public static /* synthetic */ void manuallyLogExperimentExposure$default(String str, boolean z6, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        manuallyLogExperimentExposure(str, z6);
    }

    public static final void manuallyLogGateExposure(String gateName) {
        AbstractC16544l.m18094g(gateName, "gateName");
        client.manuallyLogGateExposure(gateName);
    }

    public static final void manuallyLogLayerParameterExposure(String layerName, String parameterName, boolean keepDeviceValue) {
        AbstractC16544l.m18094g(layerName, "layerName");
        AbstractC16544l.m18094g(parameterName, "parameterName");
        client.manuallyLogLayerParameterExposure(layerName, parameterName, keepDeviceValue);
    }

    public static /* synthetic */ void manuallyLogLayerParameterExposure$default(String str, String str2, boolean z6, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z6 = false;
        }
        manuallyLogLayerParameterExposure(str, str2, z6);
    }

    public static final void overrideConfig(String configName, Map<String, ? extends Object> value) {
        AbstractC16544l.m18094g(configName, "configName");
        AbstractC16544l.m18094g(value, "value");
        client.overrideConfig(configName, value);
    }

    public static final void overrideGate(String gateName, boolean value) {
        AbstractC16544l.m18094g(gateName, "gateName");
        client.overrideGate(gateName, value);
    }

    public static final void overrideLayer(String layerName, Map<String, ? extends Object> value) {
        AbstractC16544l.m18094g(layerName, "layerName");
        AbstractC16544l.m18094g(value, "value");
        client.overrideLayer(layerName, value);
    }

    public static final Object refreshCacheAsync(IStatsigCallback iStatsigCallback, InterfaceC18770c<? super C17296C> interfaceC18770c) {
        Object objRefreshCacheAsync = INSTANCE.getClient$build_release().refreshCacheAsync(iStatsigCallback, interfaceC18770c);
        return objRefreshCacheAsync == EnumC19250a.f61036Y ? objRefreshCacheAsync : C17296C.f55119a;
    }

    public static /* synthetic */ Object refreshCacheAsync$default(IStatsigCallback iStatsigCallback, InterfaceC18770c interfaceC18770c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iStatsigCallback = null;
        }
        return refreshCacheAsync(iStatsigCallback, interfaceC18770c);
    }

    public static final void removeAllOverrides() {
        client.removeAllOverrides();
    }

    public static final void shutdown() throws Throwable {
        INSTANCE.enforceInitialized("shutdown");
        AbstractC0575H.m1161I(C18777j.f59682Y, new C127831(null));
    }

    public static /* synthetic */ Object updateUser$default(Statsig statsig, StatsigUser statsigUser, Map map, InterfaceC18770c interfaceC18770c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = null;
        }
        return statsig.updateUser(statsigUser, map, interfaceC18770c);
    }

    public static final void updateUserAsync(StatsigUser user, IStatsigCallback callback, Map<String, ? extends Object> values) {
        client.updateUserAsync(user, callback, values);
    }

    public static /* synthetic */ void updateUserAsync$default(StatsigUser statsigUser, IStatsigCallback iStatsigCallback, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iStatsigCallback = null;
        }
        if ((i10 & 4) != 0) {
            map = null;
        }
        updateUserAsync(statsigUser, iStatsigCallback, map);
    }

    public final StatsigClient getClient$build_release() {
        return client;
    }

    public final ExternalInitializeResponse getInitializeResponseJson() {
        return client.getInitializeResponseJson();
    }

    public final /* synthetic */ Object initialize(Application application, String str, StatsigUser statsigUser, StatsigOptions statsigOptions, InterfaceC18770c interfaceC18770c) {
        return getClient$build_release().initialize(application, str, statsigUser, statsigOptions, interfaceC18770c);
    }

    public final void openDebugView(Context context, InterfaceC1436k callback) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(callback, "callback");
        client.openDebugView(context, callback);
    }

    public final Object refreshCache(InterfaceC18770c interfaceC18770c) {
        Object objRefreshCache = getClient$build_release().refreshCache(interfaceC18770c);
        return objRefreshCache == EnumC19250a.f61036Y ? objRefreshCache : C17296C.f55119a;
    }

    public final void setClient$build_release(StatsigClient statsigClient) {
        AbstractC16544l.m18094g(statsigClient, "<set-?>");
        client = statsigClient;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object shutdownSuspend(InterfaceC18770c interfaceC18770c) {
        C127841 c127841;
        Statsig statsig;
        if (interfaceC18770c instanceof C127841) {
            c127841 = (C127841) interfaceC18770c;
            int i10 = c127841.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c127841.label = i10 - Integer.MIN_VALUE;
            } else {
                c127841 = new C127841(interfaceC18770c);
            }
        } else {
            c127841 = new C127841(interfaceC18770c);
        }
        Object obj = c127841.result;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c127841.label;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            StatsigClient client$build_release = getClient$build_release();
            c127841.L$0 = this;
            c127841.label = 1;
            if (client$build_release.shutdownSuspend(c127841) == enumC19250a) {
                return enumC19250a;
            }
            statsig = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            statsig = (Statsig) c127841.L$0;
            AbstractC9233X.m9807c(obj);
        }
        statsig.setClient$build_release(new StatsigClient());
        return C17296C.f55119a;
    }

    public final Object updateUser(StatsigUser statsigUser, Map map, InterfaceC18770c interfaceC18770c) {
        Object objUpdateUser = getClient$build_release().updateUser(statsigUser, map, interfaceC18770c);
        return objUpdateUser == EnumC19250a.f61036Y ? objUpdateUser : C17296C.f55119a;
    }

    public static final DynamicConfig getExperiment(String experimentName, boolean keepDeviceValue) {
        AbstractC16544l.m18094g(experimentName, "experimentName");
        return client.getExperiment(experimentName, keepDeviceValue);
    }

    public static final DynamicConfig getExperimentWithExposureLoggingDisabled(String experimentName, boolean keepDeviceValue) {
        AbstractC16544l.m18094g(experimentName, "experimentName");
        return client.getExperimentWithExposureLoggingDisabled(experimentName, keepDeviceValue);
    }

    public static final Layer getLayer(String layerName, boolean keepDeviceValue) {
        AbstractC16544l.m18094g(layerName, "layerName");
        return client.getLayer(layerName, keepDeviceValue);
    }

    public static final Layer getLayerWithExposureLoggingDisabled(String layerName, boolean keepDeviceValue) {
        AbstractC16544l.m18094g(layerName, "layerName");
        return client.getLayerWithExposureLoggingDisabled(layerName, keepDeviceValue);
    }

    public static final void initializeAsync(Application application, String sdkKey, StatsigUser statsigUser) {
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(sdkKey, "sdkKey");
        initializeAsync$default(application, sdkKey, statsigUser, null, null, 24, null);
    }

    public static final void logEvent(String eventName, Double d10) {
        AbstractC16544l.m18094g(eventName, "eventName");
        logEvent$default(eventName, d10, (Map) null, 4, (Object) null);
    }

    public static /* synthetic */ void logEvent$default(String str, String str2, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = null;
        }
        logEvent(str, str2, (Map<String, String>) map);
    }

    public static final void removeOverride(String name) {
        AbstractC16544l.m18094g(name, QzvfuIgrngtl.DcA);
        client.removeOverride(name);
    }

    public static final void initializeAsync(Application application, String sdkKey, StatsigUser statsigUser, IStatsigCallback iStatsigCallback) {
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(sdkKey, "sdkKey");
        initializeAsync$default(application, sdkKey, statsigUser, iStatsigCallback, null, 16, null);
    }

    public static final void logEvent(String eventName, String value) {
        AbstractC16544l.m18094g(eventName, "eventName");
        AbstractC16544l.m18094g(value, "value");
        logEvent$default(eventName, value, (Map) null, 4, (Object) null);
    }

    public static final void initializeAsync(Application application, String sdkKey, StatsigUser user, IStatsigCallback callback, StatsigOptions options) {
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(sdkKey, "sdkKey");
        AbstractC16544l.m18094g(options, "options");
        client.initializeAsync(application, sdkKey, user, callback, options);
    }

    public static final void logEvent(String eventName, Double value, Map<String, String> metadata) {
        AbstractC16544l.m18094g(eventName, "eventName");
        client.logEvent(eventName, value, metadata);
    }

    public static final void logEvent(String eventName, String value, Map<String, String> metadata) {
        AbstractC16544l.m18094g(eventName, "eventName");
        AbstractC16544l.m18094g(value, "value");
        client.logEvent(eventName, value, metadata);
    }

    public static final void logEvent(String eventName, Map<String, String> metadata) {
        AbstractC16544l.m18094g(eventName, "eventName");
        AbstractC16544l.m18094g(metadata, "metadata");
        client.logEvent(eventName, (Double) null, metadata);
    }
}
