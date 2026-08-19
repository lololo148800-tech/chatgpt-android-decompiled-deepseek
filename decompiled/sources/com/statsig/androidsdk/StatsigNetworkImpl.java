package com.statsig.androidsdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.C0574G0;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1113xn.C21307a;
import p200Hm.C3508g;
import p214Ib.C3669l;
import p523V9.AbstractC7942M5;
import p523V9.AbstractC7958O5;
import p571X9.AbstractC9233X;
import p817j$.util.DesugarCollections;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0091\u0001\u0010#\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0016\b\u0006\u0010\"\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020!0 H\u0082Hø\u0001\u0000¢\u0006\u0004\b#\u0010$J_\u0010.\u001a\u00020!2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010%\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u00172\b\u0010)\u001a\u0004\u0018\u00010\u00042\b\u0010*\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b.\u0010/Jk\u0010=\u001a\u00020<2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u00101\u001a\u0002002\b\u00103\u001a\u0004\u0018\u0001022\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u0002062\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u00109\u001a\u0002082\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040:H\u0096@ø\u0001\u0000¢\u0006\u0004\b=\u0010>Jo\u0010A\u001a\u00020<2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u00101\u001a\u0002002\b\u00103\u001a\u0004\u0018\u0001022\u0006\u00105\u001a\u0002042\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00172\u0006\u00109\u001a\u0002082\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040:H\u0080@ø\u0001\u0000¢\u0006\u0004\b?\u0010@J9\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010C0B2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u00101\u001a\u0002002\b\u00103\u001a\u0004\u0018\u0001022\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\bD\u0010EJ-\u0010F\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u001b\u0010K\u001a\u00020!2\u0006\u0010J\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\bK\u0010IR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010LR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010MR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010NR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Y\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010LRV\u0010]\u001aB\u0012\f\u0012\n [*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n [*\u0004\u0018\u00010\\0\\ [* \u0012\f\u0012\n [*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n [*\u0004\u0018\u00010\\0\\\u0018\u00010:0Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006_"}, m18067d2 = {"Lcom/statsig/androidsdk/StatsigNetworkImpl;", "Lcom/statsig/androidsdk/StatsigNetwork;", "Landroid/content/Context;", "context", "", "sdkKey", "Lcom/statsig/androidsdk/ErrorBoundary;", "errorBoundary", "Landroid/content/SharedPreferences;", "sharedPrefs", "Lcom/statsig/androidsdk/StatsigOptions;", "options", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/statsig/androidsdk/ErrorBoundary;Landroid/content/SharedPreferences;Lcom/statsig/androidsdk/StatsigOptions;)V", "", "Lcom/statsig/androidsdk/StatsigOfflineRequest;", "getSavedLogs", "(Lqm/c;)Ljava/lang/Object;", "", TokenNames.f32019T, "api", "endpoint", "bodyString", "", "retries", "Lcom/statsig/androidsdk/ContextType;", "contextType", "Lcom/statsig/androidsdk/Diagnostics;", "diagnostics", "timeout", "eventsCount", "requestCacheKey", "Lkotlin/Function1;", "Lmm/C;", "callback", "postRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/statsig/androidsdk/ContextType;Lcom/statsig/androidsdk/Diagnostics;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;LBm/k;Lqm/c;)Ljava/lang/Object;", "diagnosticsContext", "Lcom/statsig/androidsdk/KeyType;", "keyType", "statusCode", "sdkRegion", "attempt", "Lcom/statsig/androidsdk/Marker$ErrorMessage;", "error", "timeoutMs", "endDiagnostics", "(Lcom/statsig/androidsdk/Diagnostics;Lcom/statsig/androidsdk/ContextType;Lcom/statsig/androidsdk/KeyType;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lcom/statsig/androidsdk/Marker$ErrorMessage;Ljava/lang/Integer;)V", "Lcom/statsig/androidsdk/StatsigUser;", "user", "", "sinceTime", "Lcom/statsig/androidsdk/StatsigMetadata;", "metadata", "LAn/F;", "coroutineScope", "Lcom/statsig/androidsdk/HashAlgorithm;", "hashUsed", "", "previousDerivedFields", "Lcom/statsig/androidsdk/InitializeResponse;", "initialize", "(Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;Ljava/lang/Long;Lcom/statsig/androidsdk/StatsigMetadata;LAn/F;Lcom/statsig/androidsdk/ContextType;Lcom/statsig/androidsdk/Diagnostics;Lcom/statsig/androidsdk/HashAlgorithm;Ljava/util/Map;Lqm/c;)Ljava/lang/Object;", "initializeImpl$build_release", "(Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;Ljava/lang/Long;Lcom/statsig/androidsdk/StatsigMetadata;Lcom/statsig/androidsdk/ContextType;Lcom/statsig/androidsdk/Diagnostics;Ljava/lang/Integer;Lcom/statsig/androidsdk/HashAlgorithm;Ljava/util/Map;Lqm/c;)Ljava/lang/Object;", "initializeImpl", "LDn/i;", "Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "pollForChanges", "(Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;Ljava/lang/Long;Lcom/statsig/androidsdk/StatsigMetadata;)LDn/i;", "apiPostLogs", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm/c;)Ljava/lang/Object;", "apiRetryFailedLogs", "(Ljava/lang/String;Lqm/c;)Ljava/lang/Object;", "requestBody", "addFailedLogRequest", "Ljava/lang/String;", "Lcom/statsig/androidsdk/ErrorBoundary;", "Landroid/content/SharedPreferences;", "Lcom/statsig/androidsdk/StatsigOptions;", "LIb/l;", "gson", "LIb/l;", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "dispatcherProvider", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "Lcom/statsig/androidsdk/StatsigNetworkConnectivityListener;", "connectivityListener", "Lcom/statsig/androidsdk/StatsigNetworkConnectivityListener;", "offlineLogsKeyV2", "", "kotlin.jvm.PlatformType", "Ljava/net/HttpURLConnection;", "initializeRequestsMap", "Ljava/util/Map;", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class StatsigNetworkImpl implements StatsigNetwork {
    private final StatsigNetworkConnectivityListener connectivityListener;
    private final CoroutineDispatcherProvider dispatcherProvider;
    private final ErrorBoundary errorBoundary;
    private final C3669l gson;
    private Map<String, HttpURLConnection> initializeRequestsMap;
    private final String offlineLogsKeyV2;
    private final StatsigOptions options;
    private final String sdkKey;
    private final SharedPreferences sharedPrefs;

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigNetworkImpl$addFailedLogRequest$2 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigNetworkImpl$addFailedLogRequest$2", m20656f = "StatsigNetwork.kt", m20657l = {326, 329, 335}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128412 extends AbstractC19694j implements InterfaceC1439n {
        final /* synthetic */ String $requestBody;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128412(String str, InterfaceC18770c<? super C128412> interfaceC18770c) {
            super(2, interfaceC18770c);
            this.$requestBody = str;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            return StatsigNetworkImpl.this.new C128412(this.$requestBody, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C128412) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC9233X.m9807c(obj);
                    } else if (i10 == 2) {
                        AbstractC9233X.m9807c(obj);
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(obj);
                    }
                    return C17296C.f55119a;
                }
                AbstractC9233X.m9807c(obj);
                StatsigNetworkImpl statsigNetworkImpl = StatsigNetworkImpl.this;
                this.label = 1;
                obj = statsigNetworkImpl.getSavedLogs(this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
                ArrayList arrayListM19362l0 = AbstractC17680n.m19362l0((Collection) obj, new StatsigOfflineRequest(System.currentTimeMillis(), this.$requestBody));
                StatsigUtil statsigUtil = StatsigUtil.INSTANCE;
                SharedPreferences sharedPreferences = StatsigNetworkImpl.this.sharedPrefs;
                String str = StatsigNetworkImpl.this.offlineLogsKeyV2;
                String strM4375i = StatsigNetworkImpl.this.gson.m4375i(new StatsigPendingRequests(arrayListM19362l0));
                AbstractC16544l.m18093f(strM4375i, "gson.toJson(StatsigPendingRequests(savedLogs))");
                this.label = 2;
                if (statsigUtil.saveStringToSharedPrefs$build_release(sharedPreferences, str, strM4375i, this) == enumC19250a) {
                    return enumC19250a;
                }
            } catch (Exception unused) {
                StatsigUtil statsigUtil2 = StatsigUtil.INSTANCE;
                SharedPreferences sharedPreferences2 = StatsigNetworkImpl.this.sharedPrefs;
                String str2 = StatsigNetworkImpl.this.offlineLogsKeyV2;
                this.label = 3;
                if (statsigUtil2.removeFromSharedPrefs$build_release(sharedPreferences2, str2, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigNetworkImpl$apiPostLogs$1 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigNetworkImpl", m20656f = "StatsigNetwork.kt", m20657l = {519, 297, 299, RCHTTPStatusCodes.NOT_MODIFIED}, m20658m = "apiPostLogs")
    @Metadata(m18068k = 3, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class C128421 extends AbstractC19687c {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C128421(InterfaceC18770c<? super C128421> interfaceC18770c) {
            super(interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StatsigNetworkImpl.this.apiPostLogs(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigNetworkImpl$apiRetryFailedLogs$1 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigNetworkImpl", m20656f = "StatsigNetwork.kt", m20657l = {312, 316, 317, 320}, m20658m = "apiRetryFailedLogs")
    @Metadata(m18068k = 3, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class C128431 extends AbstractC19687c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C128431(InterfaceC18770c<? super C128431> interfaceC18770c) {
            super(interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StatsigNetworkImpl.this.apiRetryFailedLogs(null, this);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigNetworkImpl$getSavedLogs$2 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigNetworkImpl$getSavedLogs$2", m20656f = "StatsigNetwork.kt", m20657l = {342, 343}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LAn/F;", "", "Lcom/statsig/androidsdk/StatsigOfflineRequest;", "<anonymous>", "(LAn/F;)Ljava/util/List;"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128442 extends AbstractC19694j implements InterfaceC1439n {
        int label;

        public C128442(InterfaceC18770c<? super C128442> interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            return StatsigNetworkImpl.this.new C128442(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super List<StatsigOfflineRequest>> interfaceC18770c) {
            return ((C128442) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0051  */
        /* JADX WARN: Code duplicated, block: B:24:0x0067  */
        /* JADX WARN: Code duplicated, block: B:25:0x0069 A[Catch: Exception -> 0x00ad, TryCatch #0 {Exception -> 0x00ad, blocks: (B:22:0x0057, B:27:0x006f, B:29:0x0075, B:30:0x0088, B:32:0x008e, B:37:0x00a8, B:25:0x0069), top: B:42:0x0057 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x006f A[Catch: Exception -> 0x00ad, TryCatch #0 {Exception -> 0x00ad, blocks: (B:22:0x0057, B:27:0x006f, B:29:0x0075, B:30:0x0088, B:32:0x008e, B:37:0x00a8, B:25:0x0069), top: B:42:0x0057 }] */
        /* JADX WARN: Code duplicated, block: B:29:0x0075 A[Catch: Exception -> 0x00ad, TryCatch #0 {Exception -> 0x00ad, blocks: (B:22:0x0057, B:27:0x006f, B:29:0x0075, B:30:0x0088, B:32:0x008e, B:37:0x00a8, B:25:0x0069), top: B:42:0x0057 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x008e A[Catch: Exception -> 0x00ad, TryCatch #0 {Exception -> 0x00ad, blocks: (B:22:0x0057, B:27:0x006f, B:29:0x0075, B:30:0x0088, B:32:0x008e, B:37:0x00a8, B:25:0x0069), top: B:42:0x0057 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:43:0x00a8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:46:0x0088 A[SYNTHETIC] */
        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            String str;
            StatsigPendingRequests statsigPendingRequests;
            List<StatsigOfflineRequest> requests;
            long jCurrentTimeMillis;
            ArrayList arrayList;
            boolean z6;
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC9233X.m9807c(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(obj);
                    }
                    str = (String) obj;
                    if (str == null) {
                        return new ArrayList();
                    }
                    statsigPendingRequests = (StatsigPendingRequests) StatsigNetworkImpl.this.gson.m4371e(StatsigPendingRequests.class, str);
                    if (statsigPendingRequests == null) {
                        requests = null;
                    } else {
                        requests = statsigPendingRequests.getRequests();
                    }
                    if (requests == null) {
                        return new ArrayList();
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    List<StatsigOfflineRequest> requests2 = statsigPendingRequests.getRequests();
                    arrayList = new ArrayList();
                    for (Object obj2 : requests2) {
                        if (((StatsigOfflineRequest) obj2).getTimestamp() > jCurrentTimeMillis - StatsigNetworkKt.MAX_LOG_PERIOD) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z6) {
                            arrayList.add(obj2);
                        }
                    }
                    return arrayList;
                }
                AbstractC9233X.m9807c(obj);
                StatsigUtil statsigUtil = StatsigUtil.INSTANCE;
                SharedPreferences sharedPreferences = StatsigNetworkImpl.this.sharedPrefs;
                String str2 = StatsigNetworkImpl.this.offlineLogsKeyV2;
                this.label = 1;
                obj = statsigUtil.getFromSharedPrefs$build_release(sharedPreferences, str2, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
                statsigPendingRequests = (StatsigPendingRequests) StatsigNetworkImpl.this.gson.m4371e(StatsigPendingRequests.class, str);
                if (statsigPendingRequests == null) {
                    requests = null;
                } else {
                    requests = statsigPendingRequests.getRequests();
                }
                if (requests == null) {
                    return new ArrayList();
                }
                jCurrentTimeMillis = System.currentTimeMillis();
                List<StatsigOfflineRequest> requests3 = statsigPendingRequests.getRequests();
                arrayList = new ArrayList();
                while (r10.hasNext()) {
                    if (((StatsigOfflineRequest) obj2).getTimestamp() > jCurrentTimeMillis - StatsigNetworkKt.MAX_LOG_PERIOD) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            } catch (Exception unused) {
                return new ArrayList();
            }
            str = (String) obj;
            if (str == null) {
                StatsigUtil statsigUtil2 = StatsigUtil.INSTANCE;
                SharedPreferences sharedPreferences2 = StatsigNetworkImpl.this.sharedPrefs;
                this.label = 2;
                obj = statsigUtil2.getFromSharedPrefs$build_release(sharedPreferences2, "StatsigNetwork.OFFLINE_LOGS", this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
                str = (String) obj;
                if (str == null) {
                    return new ArrayList();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigNetworkImpl$initialize$2 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigNetworkImpl$initialize$2", m20656f = "StatsigNetwork.kt", m20657l = {152}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lcom/statsig/androidsdk/InitializeResponse;", "<anonymous>", "(LAn/F;)Lcom/statsig/androidsdk/InitializeResponse;"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128452 extends AbstractC19694j implements InterfaceC1439n {
        final /* synthetic */ String $api;
        final /* synthetic */ ContextType $contextType;
        final /* synthetic */ InterfaceC0571F $coroutineScope;
        final /* synthetic */ Diagnostics $diagnostics;
        final /* synthetic */ HashAlgorithm $hashUsed;
        final /* synthetic */ StatsigMetadata $metadata;
        final /* synthetic */ Map<String, String> $previousDerivedFields;
        final /* synthetic */ Long $sinceTime;
        final /* synthetic */ StatsigUser $user;
        Object L$0;
        int label;
        final /* synthetic */ StatsigNetworkImpl this$0;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigNetworkImpl$initialize$2$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigNetworkImpl$initialize$2$1", m20656f = "StatsigNetwork.kt", m20657l = {141}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
        public static final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {
            final /* synthetic */ String $api;
            final /* synthetic */ ContextType $contextType;
            final /* synthetic */ Diagnostics $diagnostics;
            final /* synthetic */ HashAlgorithm $hashUsed;
            final /* synthetic */ StatsigMetadata $metadata;
            final /* synthetic */ Map<String, String> $previousDerivedFields;
            final /* synthetic */ C16525B $response;
            final /* synthetic */ Long $sinceTime;
            final /* synthetic */ StatsigUser $user;
            Object L$0;
            int label;
            final /* synthetic */ StatsigNetworkImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C16525B c16525b, StatsigNetworkImpl statsigNetworkImpl, String str, StatsigUser statsigUser, Long l4, StatsigMetadata statsigMetadata, ContextType contextType, Diagnostics diagnostics, HashAlgorithm hashAlgorithm, Map<String, String> map, InterfaceC18770c<? super AnonymousClass1> interfaceC18770c) {
                super(2, interfaceC18770c);
                this.$response = c16525b;
                this.this$0 = statsigNetworkImpl;
                this.$api = str;
                this.$user = statsigUser;
                this.$sinceTime = l4;
                this.$metadata = statsigMetadata;
                this.$contextType = contextType;
                this.$diagnostics = diagnostics;
                this.$hashUsed = hashAlgorithm;
                this.$previousDerivedFields = map;
            }

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
                return new AnonymousClass1(this.$response, this.this$0, this.$api, this.$user, this.$sinceTime, this.$metadata, this.$contextType, this.$diagnostics, this.$hashUsed, this.$previousDerivedFields, interfaceC18770c);
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
                return ((AnonymousClass1) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) throws Throwable {
                C16525B c16525b;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    C16525B c16525b2 = this.$response;
                    StatsigNetworkImpl statsigNetworkImpl = this.this$0;
                    String str = this.$api;
                    StatsigUser statsigUser = this.$user;
                    Long l4 = this.$sinceTime;
                    StatsigMetadata statsigMetadata = this.$metadata;
                    ContextType contextType = this.$contextType;
                    Diagnostics diagnostics = this.$diagnostics;
                    Integer num = new Integer((int) statsigNetworkImpl.options.getInitTimeoutMs());
                    HashAlgorithm hashAlgorithm = this.$hashUsed;
                    Map<String, String> map = this.$previousDerivedFields;
                    this.L$0 = c16525b2;
                    this.label = 1;
                    Object objInitializeImpl$build_release = statsigNetworkImpl.initializeImpl$build_release(str, statsigUser, l4, statsigMetadata, contextType, diagnostics, num, hashAlgorithm, map, this);
                    if (objInitializeImpl$build_release == enumC19250a) {
                        return enumC19250a;
                    }
                    c16525b = c16525b2;
                    obj = objInitializeImpl$build_release;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c16525b = (C16525B) this.L$0;
                    AbstractC9233X.m9807c(obj);
                }
                c16525b.f51262Y = obj;
                return C17296C.f55119a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128452(InterfaceC0571F interfaceC0571F, StatsigNetworkImpl statsigNetworkImpl, String str, StatsigUser statsigUser, Long l4, StatsigMetadata statsigMetadata, ContextType contextType, Diagnostics diagnostics, HashAlgorithm hashAlgorithm, Map<String, String> map, InterfaceC18770c<? super C128452> interfaceC18770c) {
            super(2, interfaceC18770c);
            this.$coroutineScope = interfaceC0571F;
            this.this$0 = statsigNetworkImpl;
            this.$api = str;
            this.$user = statsigUser;
            this.$sinceTime = l4;
            this.$metadata = statsigMetadata;
            this.$contextType = contextType;
            this.$diagnostics = diagnostics;
            this.$hashUsed = hashAlgorithm;
            this.$previousDerivedFields = map;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            return new C128452(this.$coroutineScope, this.this$0, this.$api, this.$user, this.$sinceTime, this.$metadata, this.$contextType, this.$diagnostics, this.$hashUsed, this.$previousDerivedFields, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super InitializeResponse> interfaceC18770c) {
            return ((C128452) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            C16525B c16525b;
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                c16525b = new C16525B();
                c16525b.f51262Y = new InitializeResponse.FailedInitializeResponse(InitializeFailReason.InternalError, null, null);
                C0564B0 c0564b0M1156D = AbstractC0575H.m1156D(this.$coroutineScope, null, null, new AnonymousClass1(c16525b, this.this$0, this.$api, this.$user, this.$sinceTime, this.$metadata, this.$contextType, this.$diagnostics, this.$hashUsed, this.$previousDerivedFields, null), 3);
                this.L$0 = c16525b;
                this.label = 1;
                if (c0564b0M1156D.mo1272P(this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C16525B c16525b2 = (C16525B) this.L$0;
                AbstractC9233X.m9807c(obj);
                c16525b = c16525b2;
            }
            return c16525b.f51262Y;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigNetworkImpl$pollForChanges$1 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigNetworkImpl$pollForChanges$1", m20656f = "StatsigNetwork.kt", m20657l = {249, 519, 259}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LDn/j;", "Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "Lmm/C;", "<anonymous>", "(LDn/j;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128461 extends AbstractC19694j implements InterfaceC1439n {
        final /* synthetic */ String $api;
        final /* synthetic */ StatsigMetadata $metadata;
        final /* synthetic */ Long $sinceTime;
        final /* synthetic */ StatsigUser $user;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ StatsigNetworkImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128461(StatsigUser statsigUser, StatsigNetworkImpl statsigNetworkImpl, StatsigMetadata statsigMetadata, Long l4, String str, InterfaceC18770c<? super C128461> interfaceC18770c) {
            super(2, interfaceC18770c);
            this.$user = statsigUser;
            this.this$0 = statsigNetworkImpl;
            this.$metadata = statsigMetadata;
            this.$sinceTime = l4;
            this.$api = str;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            C128461 c128461 = new C128461(this.$user, this.this$0, this.$metadata, this.$sinceTime, this.$api, interfaceC18770c);
            c128461.L$0 = obj;
            return c128461;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InterfaceC2186j interfaceC2186j, InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C128461) create(interfaceC2186j, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00c1 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:26:0x010c  */
        /* JADX WARN: Code duplicated, block: B:32:0x017c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:33:0x017d  */
        /* JADX WARN: Code duplicated, block: B:38:0x0195 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0196 -> B:40:0x019c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // sm.AbstractC19685a
        public final java.lang.Object invokeSuspend(java.lang.Object r32) {
            /*
                Method dump skipped, instruction units count: 420
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.StatsigNetworkImpl.C128461.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigNetworkImpl$postRequest$2 */
    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"", TokenNames.f32019T, "", "<anonymous parameter 0>", "Lmm/C;", "<anonymous>", "(I)V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128482 extends AbstractC16546n implements InterfaceC1436k {
        public static final C128482 INSTANCE = new C128482();

        public C128482() {
            super(1);
        }

        public final void invoke(Integer num) {
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Integer) obj);
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigNetworkImpl$postRequest$3 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigNetworkImpl$postRequest$3", m20656f = "StatsigNetwork.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, m18067d2 = {"", TokenNames.f32019T, "LAn/F;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128493 extends AbstractC19694j implements InterfaceC1439n {
        final /* synthetic */ String $api;
        final /* synthetic */ String $bodyString;
        final /* synthetic */ InterfaceC1436k $callback;
        final /* synthetic */ ContextType $contextType;
        final /* synthetic */ Diagnostics $diagnostics;
        final /* synthetic */ String $endpoint;
        final /* synthetic */ String $eventsCount;
        final /* synthetic */ String $requestCacheKey;
        final /* synthetic */ int $retries;
        final /* synthetic */ Integer $timeout;
        int label;
        final /* synthetic */ StatsigNetworkImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128493(String str, String str2, String str3, StatsigNetworkImpl statsigNetworkImpl, Integer num, String str4, Diagnostics diagnostics, int i10, ContextType contextType, InterfaceC1436k interfaceC1436k, String str5, InterfaceC18770c<? super C128493> interfaceC18770c) {
            super(2, interfaceC18770c);
            this.$api = str;
            this.$endpoint = str2;
            this.$requestCacheKey = str3;
            this.this$0 = statsigNetworkImpl;
            this.$timeout = num;
            this.$eventsCount = str4;
            this.$diagnostics = diagnostics;
            this.$retries = i10;
            this.$contextType = contextType;
            this.$callback = interfaceC1436k;
            this.$bodyString = str5;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            return new C128493(this.$api, this.$endpoint, this.$requestCacheKey, this.this$0, this.$timeout, this.$eventsCount, this.$diagnostics, this.$retries, this.$contextType, this.$callback, this.$bodyString, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c interfaceC18770c) {
            return ((C128493) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strM18100m;
            Marker.ErrorMessage errorMessage;
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            HttpURLConnection httpURLConnection = null;
            try {
                try {
                    if (AbstractC21329w.m21725l(this.$api, Separators.SLASH, false)) {
                        strM18100m = AbstractC16544l.m18100m(this.$endpoint, this.$api);
                    } else {
                        strM18100m = this.$api + '/' + this.$endpoint;
                    }
                    URL url = new URL(strM18100m);
                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                    if (uRLConnectionOpenConnection == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                    }
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
                    try {
                        if (this.$requestCacheKey != null && !AbstractC21322p.m21667A(this.$endpoint, "log_event", false)) {
                            if (this.this$0.initializeRequestsMap.size() > 50) {
                                Iterator it = this.this$0.initializeRequestsMap.values().iterator();
                                while (it.hasNext()) {
                                    ((HttpURLConnection) it.next()).disconnect();
                                }
                                this.this$0.initializeRequestsMap = DesugarCollections.synchronizedMap(new LinkedHashMap());
                            }
                            Map initializeRequestsMap = this.this$0.initializeRequestsMap;
                            AbstractC16544l.m18093f(initializeRequestsMap, "initializeRequestsMap");
                            initializeRequestsMap.put(this.$requestCacheKey, httpURLConnection2);
                        }
                        if (AbstractC16544l.m18089b(url.getProtocol(), "http")) {
                            httpURLConnection2.setDoOutput(true);
                        }
                        httpURLConnection2.setRequestMethod("POST");
                        Integer num = this.$timeout;
                        if (num != null) {
                            httpURLConnection2.setConnectTimeout(num.intValue());
                            httpURLConnection2.setReadTimeout(this.$timeout.intValue());
                        }
                        httpURLConnection2.setRequestProperty(SIPHeaderNames.CONTENT_TYPE, "application/json; charset=UTF-8");
                        httpURLConnection2.setRequestProperty("STATSIG-API-KEY", this.this$0.sdkKey);
                        httpURLConnection2.setRequestProperty("STATSIG-SDK-TYPE", "android-client");
                        httpURLConnection2.setRequestProperty("STATSIG-SDK-VERSION", BuildConfig.VERSION_NAME);
                        httpURLConnection2.setRequestProperty("STATSIG-CLIENT-TIME", String.valueOf(System.currentTimeMillis()));
                        String str = this.$eventsCount;
                        if (str != null) {
                            httpURLConnection2.setRequestProperty("STATSIG-EVENT-COUNT", str);
                        }
                        httpURLConnection2.setRequestProperty(SIPHeaderNames.ACCEPT, "application/json");
                        httpURLConnection2.setRequestProperty(SIPHeaderNames.ACCEPT_ENCODING, "gzip");
                        Diagnostics diagnostics = this.$diagnostics;
                        if (diagnostics != null) {
                            diagnostics.markStart(KeyType.INITIALIZE, StepType.NETWORK_REQUEST, new Marker(null, null, null, null, null, null, null, null, null, null, null, new Integer(this.$retries), null, null, null, null, null, null, null, null, 1046527, null), this.$contextType);
                        }
                        OutputStream outputStream = httpURLConnection2.getOutputStream();
                        AbstractC16544l.m18093f(outputStream, "connection.outputStream");
                        Charset charset = C21307a.f67720a;
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
                        try {
                            bufferedWriter.write(this.$bodyString);
                            AbstractC7942M5.m8232a(bufferedWriter, null);
                            int responseCode = httpURLConnection2.getResponseCode();
                            InputStream stream = responseCode < 400 ? httpURLConnection2.getInputStream() : httpURLConnection2.getErrorStream();
                            if (responseCode >= 400) {
                                AbstractC16544l.m18093f(stream, "inputStream");
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream, charset), 8192);
                                try {
                                    String strM8249b = AbstractC7958O5.m8249b(bufferedReader);
                                    AbstractC7942M5.m8232a(bufferedReader, null);
                                    errorMessage = new Marker.ErrorMessage(strM8249b, String.valueOf(responseCode), null);
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        AbstractC7942M5.m8232a(bufferedReader, th2);
                                        throw th3;
                                    }
                                }
                            } else {
                                errorMessage = null;
                            }
                            StatsigNetworkImpl statsigNetworkImpl = this.this$0;
                            Diagnostics diagnostics2 = this.$diagnostics;
                            ContextType contextType = this.$contextType;
                            KeyType keyType = KeyType.INITIALIZE;
                            Integer num2 = new Integer(responseCode);
                            List<String> list = httpURLConnection2.getHeaderFields().get("x-statsig-region");
                            statsigNetworkImpl.endDiagnostics(diagnostics2, contextType, keyType, num2, list == null ? null : list.get(0), new Integer(this.$retries), errorMessage, this.$timeout);
                            this.$callback.invoke(new Integer(responseCode));
                            if (200 > responseCode || responseCode > 299) {
                                httpURLConnection2.disconnect();
                                return null;
                            }
                            if (responseCode == 204 && AbstractC16544l.m18089b(this.$endpoint, "initialize")) {
                                C3669l unused = this.this$0.gson;
                                AbstractC16544l.m18102o();
                                throw null;
                            }
                            String headerField = httpURLConnection2.getHeaderField(SIPHeaderNames.CONTENT_ENCODING);
                            if (headerField != null && headerField.equals("gzip")) {
                                stream = new GZIPInputStream(stream);
                            }
                            AbstractC16544l.m18093f(stream, "stream");
                            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(stream, charset), 8192);
                            try {
                                C3669l unused2 = this.this$0.gson;
                                AbstractC16544l.m18102o();
                                throw null;
                            } catch (Throwable th4) {
                                try {
                                    throw th4;
                                } catch (Throwable th5) {
                                    AbstractC7942M5.m8232a(bufferedReader2, th4);
                                    throw th5;
                                }
                            }
                        } catch (Throwable th6) {
                            try {
                                throw th6;
                            } catch (Throwable th7) {
                                AbstractC7942M5.m8232a(bufferedWriter, th6);
                                throw th7;
                            }
                        }
                    } catch (Exception e10) {
                        throw e10;
                    } catch (Throwable th8) {
                        th = th8;
                        httpURLConnection = httpURLConnection2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                }
            } catch (Exception e11) {
                throw e11;
            }
        }

        public final Object invokeSuspend$$forInline(Object obj) throws Throwable {
            String strM18100m;
            Marker.ErrorMessage errorMessage;
            HttpURLConnection httpURLConnection = null;
            try {
                try {
                    if (AbstractC21329w.m21725l(this.$api, Separators.SLASH, false)) {
                        strM18100m = AbstractC16544l.m18100m(this.$endpoint, this.$api);
                    } else {
                        strM18100m = this.$api + '/' + this.$endpoint;
                    }
                    URL url = new URL(strM18100m);
                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                    if (uRLConnectionOpenConnection == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                    }
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
                    try {
                        if (this.$requestCacheKey != null && !AbstractC21322p.m21667A(this.$endpoint, "log_event", false)) {
                            if (this.this$0.initializeRequestsMap.size() > 50) {
                                Iterator it = this.this$0.initializeRequestsMap.values().iterator();
                                while (it.hasNext()) {
                                    ((HttpURLConnection) it.next()).disconnect();
                                }
                                this.this$0.initializeRequestsMap = DesugarCollections.synchronizedMap(new LinkedHashMap());
                            }
                            Map initializeRequestsMap = this.this$0.initializeRequestsMap;
                            AbstractC16544l.m18093f(initializeRequestsMap, "initializeRequestsMap");
                            initializeRequestsMap.put(this.$requestCacheKey, httpURLConnection2);
                        }
                        if (AbstractC16544l.m18089b(url.getProtocol(), "http")) {
                            httpURLConnection2.setDoOutput(true);
                        }
                        httpURLConnection2.setRequestMethod("POST");
                        Integer num = this.$timeout;
                        if (num != null) {
                            httpURLConnection2.setConnectTimeout(num.intValue());
                            httpURLConnection2.setReadTimeout(this.$timeout.intValue());
                        }
                        httpURLConnection2.setRequestProperty(SIPHeaderNames.CONTENT_TYPE, "application/json; charset=UTF-8");
                        httpURLConnection2.setRequestProperty("STATSIG-API-KEY", this.this$0.sdkKey);
                        httpURLConnection2.setRequestProperty("STATSIG-SDK-TYPE", "android-client");
                        httpURLConnection2.setRequestProperty("STATSIG-SDK-VERSION", BuildConfig.VERSION_NAME);
                        httpURLConnection2.setRequestProperty("STATSIG-CLIENT-TIME", String.valueOf(System.currentTimeMillis()));
                        String str = this.$eventsCount;
                        if (str != null) {
                            httpURLConnection2.setRequestProperty("STATSIG-EVENT-COUNT", str);
                        }
                        httpURLConnection2.setRequestProperty(SIPHeaderNames.ACCEPT, "application/json");
                        httpURLConnection2.setRequestProperty(SIPHeaderNames.ACCEPT_ENCODING, "gzip");
                        Diagnostics diagnostics = this.$diagnostics;
                        if (diagnostics != null) {
                            diagnostics.markStart(KeyType.INITIALIZE, StepType.NETWORK_REQUEST, new Marker(null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(this.$retries), null, null, null, null, null, null, null, null, 1046527, null), this.$contextType);
                        }
                        OutputStream outputStream = httpURLConnection2.getOutputStream();
                        AbstractC16544l.m18093f(outputStream, "connection.outputStream");
                        Charset charset = C21307a.f67720a;
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
                        try {
                            bufferedWriter.write(this.$bodyString);
                            AbstractC7942M5.m8232a(bufferedWriter, null);
                            int responseCode = httpURLConnection2.getResponseCode();
                            InputStream stream = responseCode < 400 ? httpURLConnection2.getInputStream() : httpURLConnection2.getErrorStream();
                            if (responseCode >= 400) {
                                AbstractC16544l.m18093f(stream, "inputStream");
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream, charset), 8192);
                                try {
                                    String strM8249b = AbstractC7958O5.m8249b(bufferedReader);
                                    AbstractC7942M5.m8232a(bufferedReader, null);
                                    errorMessage = new Marker.ErrorMessage(strM8249b, String.valueOf(responseCode), null);
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        AbstractC7942M5.m8232a(bufferedReader, th2);
                                        throw th3;
                                    }
                                }
                            } else {
                                errorMessage = null;
                            }
                            StatsigNetworkImpl statsigNetworkImpl = this.this$0;
                            Diagnostics diagnostics2 = this.$diagnostics;
                            ContextType contextType = this.$contextType;
                            KeyType keyType = KeyType.INITIALIZE;
                            Integer numValueOf = Integer.valueOf(responseCode);
                            List<String> list = httpURLConnection2.getHeaderFields().get("x-statsig-region");
                            statsigNetworkImpl.endDiagnostics(diagnostics2, contextType, keyType, numValueOf, list == null ? null : list.get(0), Integer.valueOf(this.$retries), errorMessage, this.$timeout);
                            this.$callback.invoke(Integer.valueOf(responseCode));
                            if (200 > responseCode || responseCode > 299) {
                                httpURLConnection2.disconnect();
                                return null;
                            }
                            if (responseCode == 204 && AbstractC16544l.m18089b(this.$endpoint, "initialize")) {
                                C3669l unused = this.this$0.gson;
                                AbstractC16544l.m18102o();
                                throw null;
                            }
                            String headerField = httpURLConnection2.getHeaderField(SIPHeaderNames.CONTENT_ENCODING);
                            if (headerField != null && headerField.equals("gzip")) {
                                stream = new GZIPInputStream(stream);
                            }
                            AbstractC16544l.m18093f(stream, "stream");
                            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(stream, charset), 8192);
                            try {
                                C3669l unused2 = this.this$0.gson;
                                AbstractC16544l.m18102o();
                                throw null;
                            } catch (Throwable th4) {
                                try {
                                    throw th4;
                                } catch (Throwable th5) {
                                    AbstractC7942M5.m8232a(bufferedReader2, th4);
                                    throw th5;
                                }
                            }
                        } catch (Throwable th6) {
                            try {
                                throw th6;
                            } catch (Throwable th7) {
                                AbstractC7942M5.m8232a(bufferedWriter, th6);
                                throw th7;
                            }
                        }
                    } catch (Exception e10) {
                        throw e10;
                    } catch (Throwable th8) {
                        th = th8;
                        httpURLConnection = httpURLConnection2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    throw e11;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        }
    }

    public StatsigNetworkImpl(Context context, String sdkKey, ErrorBoundary errorBoundary, SharedPreferences sharedPrefs, StatsigOptions options) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(sdkKey, "sdkKey");
        AbstractC16544l.m18094g(errorBoundary, "errorBoundary");
        AbstractC16544l.m18094g(sharedPrefs, "sharedPrefs");
        AbstractC16544l.m18094g(options, "options");
        this.sdkKey = sdkKey;
        this.errorBoundary = errorBoundary;
        this.sharedPrefs = sharedPrefs;
        this.options = options;
        this.gson = StatsigUtil.INSTANCE.getGson$build_release();
        this.dispatcherProvider = new CoroutineDispatcherProvider(null, null, null, 7, null);
        this.connectivityListener = new StatsigNetworkConnectivityListener(context);
        this.offlineLogsKeyV2 = AbstractC16544l.m18100m(sdkKey, "StatsigNetwork.OFFLINE_LOGS:");
        this.initializeRequestsMap = DesugarCollections.synchronizedMap(new LinkedHashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endDiagnostics(Diagnostics diagnostics, ContextType diagnosticsContext, KeyType keyType, Integer statusCode, String sdkRegion, Integer attempt, Marker.ErrorMessage error, Integer timeoutMs) {
        if (diagnostics == null) {
            return;
        }
        diagnostics.markEnd(keyType, statusCode != null && new C3508g(RCHTTPStatusCodes.SUCCESS, 299, 1).m4200j(statusCode.intValue()), StepType.NETWORK_REQUEST, new Marker(null, null, null, null, statusCode, null, null, null, null, sdkRegion, null, attempt, null, null, null, null, error, Boolean.valueOf(this.connectivityListener.isNetworkAvailable()), timeoutMs, null, 587247, null), diagnosticsContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getSavedLogs(InterfaceC18770c<? super List<StatsigOfflineRequest>> interfaceC18770c) {
        return AbstractC0575H.m1168P(this.dispatcherProvider.getIo(), new C128442(null), interfaceC18770c);
    }

    public static /* synthetic */ Object initializeImpl$build_release$default(StatsigNetworkImpl statsigNetworkImpl, String str, StatsigUser statsigUser, Long l4, StatsigMetadata statsigMetadata, ContextType contextType, Diagnostics diagnostics, Integer num, HashAlgorithm hashAlgorithm, Map map, InterfaceC18770c interfaceC18770c, int i10, Object obj) {
        return statsigNetworkImpl.initializeImpl$build_release(str, statsigUser, l4, statsigMetadata, contextType, diagnostics, (i10 & 64) != 0 ? null : num, hashAlgorithm, map, interfaceC18770c);
    }

    private final Object postRequest(String str, String str2, String str3, int i10, ContextType contextType, Diagnostics diagnostics, Integer num, String str4, String str5, InterfaceC1436k interfaceC1436k, InterfaceC18770c interfaceC18770c) {
        this.dispatcherProvider.getIo();
        AbstractC16544l.m18102o();
        throw null;
    }

    public static Object postRequest$default(StatsigNetworkImpl statsigNetworkImpl, String str, String str2, String str3, int i10, ContextType contextType, Diagnostics diagnostics, Integer num, String str4, String str5, InterfaceC1436k interfaceC1436k, InterfaceC18770c interfaceC18770c, int i11, Object obj) {
        if ((i11 & 512) != 0) {
            C128482 c128482 = C128482.INSTANCE;
        }
        statsigNetworkImpl.dispatcherProvider.getIo();
        AbstractC16544l.m18102o();
        throw null;
    }

    @Override // com.statsig.androidsdk.StatsigNetwork
    public Object addFailedLogRequest(String str, InterfaceC18770c<? super C17296C> interfaceC18770c) throws Throwable {
        Object objM1168P = AbstractC0575H.m1168P(this.dispatcherProvider.getIo(), new C128412(str, null), interfaceC18770c);
        return objM1168P == EnumC19250a.f61036Y ? objM1168P : C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:38:0x010c  */
    /* JADX WARN: Code duplicated, block: B:39:0x010e A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:18:0x0049, B:36:0x0108, B:40:0x0112, B:42:0x011a, B:51:0x0136, B:54:0x013d, B:58:0x0155, B:60:0x015b, B:65:0x0184, B:68:0x018f, B:57:0x0145, B:45:0x0122, B:50:0x0132, B:39:0x010e), top: B:81:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:42:0x011a A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:18:0x0049, B:36:0x0108, B:40:0x0112, B:42:0x011a, B:51:0x0136, B:54:0x013d, B:58:0x0155, B:60:0x015b, B:65:0x0184, B:68:0x018f, B:57:0x0145, B:45:0x0122, B:50:0x0132, B:39:0x010e), top: B:81:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0120  */
    /* JADX WARN: Code duplicated, block: B:45:0x0122 A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:18:0x0049, B:36:0x0108, B:40:0x0112, B:42:0x011a, B:51:0x0136, B:54:0x013d, B:58:0x0155, B:60:0x015b, B:65:0x0184, B:68:0x018f, B:57:0x0145, B:45:0x0122, B:50:0x0132, B:39:0x010e), top: B:81:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:54:0x013d A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:18:0x0049, B:36:0x0108, B:40:0x0112, B:42:0x011a, B:51:0x0136, B:54:0x013d, B:58:0x0155, B:60:0x015b, B:65:0x0184, B:68:0x018f, B:57:0x0145, B:45:0x0122, B:50:0x0132, B:39:0x010e), top: B:81:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0143  */
    /* JADX WARN: Code duplicated, block: B:57:0x0145 A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:18:0x0049, B:36:0x0108, B:40:0x0112, B:42:0x011a, B:51:0x0136, B:54:0x013d, B:58:0x0155, B:60:0x015b, B:65:0x0184, B:68:0x018f, B:57:0x0145, B:45:0x0122, B:50:0x0132, B:39:0x010e), top: B:81:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:60:0x015b A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:18:0x0049, B:36:0x0108, B:40:0x0112, B:42:0x011a, B:51:0x0136, B:54:0x013d, B:58:0x0155, B:60:0x015b, B:65:0x0184, B:68:0x018f, B:57:0x0145, B:45:0x0122, B:50:0x0132, B:39:0x010e), top: B:81:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0176 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x0177  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.statsig.androidsdk.StatsigNetworkImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.statsig.androidsdk.StatsigNetworkImpl] */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.statsig.androidsdk.StatsigNetworkImpl] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.statsig.androidsdk.StatsigNetworkImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0177 -> B:64:0x017f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.statsig.androidsdk.StatsigNetwork
    public java.lang.Object apiPostLogs(java.lang.String r34, java.lang.String r35, java.lang.String r36, p972qm.InterfaceC18770c<? super mm.C17296C> r37) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.StatsigNetworkImpl.apiPostLogs(java.lang.String, java.lang.String, java.lang.String, qm.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:43:0x0113 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0114  */
    /* JADX WARN: Code duplicated, block: B:46:0x011a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0114 -> B:45:0x0115). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.statsig.androidsdk.StatsigNetwork
    public java.lang.Object apiRetryFailedLogs(java.lang.String r10, p972qm.InterfaceC18770c<? super mm.C17296C> r11) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.StatsigNetworkImpl.apiRetryFailedLogs(java.lang.String, qm.c):java.lang.Object");
    }

    @Override // com.statsig.androidsdk.StatsigNetwork
    public Object initialize(String str, StatsigUser statsigUser, Long l4, StatsigMetadata statsigMetadata, InterfaceC0571F interfaceC0571F, ContextType contextType, Diagnostics diagnostics, HashAlgorithm hashAlgorithm, Map<String, String> map, InterfaceC18770c<? super InitializeResponse> interfaceC18770c) {
        return this.options.getInitTimeoutMs() == 0 ? initializeImpl$build_release$default(this, str, statsigUser, l4, statsigMetadata, contextType, diagnostics, null, hashAlgorithm, map, interfaceC18770c, 64, null) : AbstractC0575H.m1169Q(this.options.getInitTimeoutMs(), new C128452(interfaceC0571F, this, str, statsigUser, l4, statsigMetadata, contextType, diagnostics, hashAlgorithm, map, null), interfaceC18770c);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x016c  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public final Object initializeImpl$build_release(String str, StatsigUser statsigUser, Long l4, StatsigMetadata statsigMetadata, ContextType contextType, Diagnostics diagnostics, Integer num, HashAlgorithm hashAlgorithm, Map<String, String> map, InterfaceC18770c<? super InitializeResponse> interfaceC18770c) throws Throwable {
        StatsigNetworkImpl$initializeImpl$1 statsigNetworkImpl$initializeImpl$1;
        ContextType contextType2;
        Diagnostics diagnostics2;
        Integer num2;
        StatsigNetworkImpl statsigNetworkImpl;
        C16525B c16525b;
        ContextType contextType3;
        if (interfaceC18770c instanceof StatsigNetworkImpl$initializeImpl$1) {
            statsigNetworkImpl$initializeImpl$1 = (StatsigNetworkImpl$initializeImpl$1) interfaceC18770c;
            int i10 = statsigNetworkImpl$initializeImpl$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                statsigNetworkImpl$initializeImpl$1.label = i10 - Integer.MIN_VALUE;
            } else {
                statsigNetworkImpl$initializeImpl$1 = new StatsigNetworkImpl$initializeImpl$1(this, interfaceC18770c);
            }
        } else {
            statsigNetworkImpl$initializeImpl$1 = new StatsigNetworkImpl$initializeImpl$1(this, interfaceC18770c);
        }
        StatsigNetworkImpl$initializeImpl$1 statsigNetworkImpl$initializeImpl$2 = statsigNetworkImpl$initializeImpl$1;
        Object obj = statsigNetworkImpl$initializeImpl$2.result;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = statsigNetworkImpl$initializeImpl$2.label;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            try {
                StatsigUser copyForEvaluation$build_release = statsigUser.getCopyForEvaluation$build_release();
                String str2 = (String) this.options.getCustomCacheKey().invoke(this.sdkKey, copyForEvaluation$build_release);
                try {
                    Map mapM19244f = AbstractC17659D.m19244f(new C17309l("user", copyForEvaluation$build_release), new C17309l("statsigMetadata", statsigMetadata.copy((4095 & 1) != 0 ? statsigMetadata.stableID : null, (4095 & 2) != 0 ? statsigMetadata.sdkType : null, (4095 & 4) != 0 ? statsigMetadata.sdkVersion : null, (4095 & 8) != 0 ? statsigMetadata.sessionID : null, (4095 & 16) != 0 ? statsigMetadata.appIdentifier : null, (4095 & 32) != 0 ? statsigMetadata.appVersion : null, (4095 & 64) != 0 ? statsigMetadata.deviceModel : null, (4095 & 128) != 0 ? statsigMetadata.deviceOS : null, (4095 & 256) != 0 ? statsigMetadata.locale : null, (4095 & 512) != 0 ? statsigMetadata.language : null, (4095 & 1024) != 0 ? statsigMetadata.systemVersion : null, (4095 & 2048) != 0 ? statsigMetadata.systemName : null)), new C17309l("sinceTime", l4), new C17309l("hash", hashAlgorithm), new C17309l("previousDerivedFields", map));
                    C16525B c16525b2 = new C16525B();
                    HttpURLConnection httpURLConnection = this.initializeRequestsMap.get(str2);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    String strM4375i = this.gson.m4375i(mapM19244f);
                    AbstractC16544l.m18093f(strM4375i, "gson.toJson(body)");
                    AbstractC0563B io2 = this.dispatcherProvider.getIo();
                    StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1 statsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1 = new StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1(str, "initialize", str2, this, num, null, diagnostics, 1, contextType, strM4375i, null, c16525b2);
                    statsigNetworkImpl$initializeImpl$2.L$0 = this;
                    contextType2 = contextType;
                    try {
                        statsigNetworkImpl$initializeImpl$2.L$1 = contextType2;
                        diagnostics2 = diagnostics;
                        try {
                            statsigNetworkImpl$initializeImpl$2.L$2 = diagnostics2;
                            num2 = num;
                            try {
                                statsigNetworkImpl$initializeImpl$2.L$3 = num2;
                                c16525b = c16525b2;
                                statsigNetworkImpl$initializeImpl$2.L$4 = c16525b;
                                statsigNetworkImpl$initializeImpl$2.label = 1;
                                Object objM1168P = AbstractC0575H.m1168P(io2, statsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1, statsigNetworkImpl$initializeImpl$2);
                                if (objM1168P == enumC19250a) {
                                    return enumC19250a;
                                }
                                contextType3 = contextType2;
                                statsigNetworkImpl = this;
                                obj = objM1168P;
                            } catch (Exception e10) {
                                e = e10;
                                statsigNetworkImpl = this;
                                if (statsigNetworkImpl.connectivityListener.isNetworkAvailable()) {
                                    statsigNetworkImpl.errorBoundary.logException$build_release(e);
                                }
                                statsigNetworkImpl.endDiagnostics(diagnostics2, contextType2, KeyType.INITIALIZE, null, null, new Integer(1), new Marker.ErrorMessage(String.valueOf(e.getMessage()), e.getClass().getName(), e.getClass().getName()), num2);
                                if (e instanceof SocketTimeoutException ? true : e instanceof ConnectException) {
                                    return new InitializeResponse.FailedInitializeResponse(InitializeFailReason.NetworkTimeout, e, null, 4, null);
                                }
                                if (e instanceof C0574G0) {
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            num2 = num;
                            statsigNetworkImpl = this;
                            if (statsigNetworkImpl.connectivityListener.isNetworkAvailable()) {
                                statsigNetworkImpl.errorBoundary.logException$build_release(e);
                            }
                            statsigNetworkImpl.endDiagnostics(diagnostics2, contextType2, KeyType.INITIALIZE, null, null, new Integer(1), new Marker.ErrorMessage(String.valueOf(e.getMessage()), e.getClass().getName(), e.getClass().getName()), num2);
                            if (e instanceof SocketTimeoutException ? true : e instanceof ConnectException) {
                                return new InitializeResponse.FailedInitializeResponse(InitializeFailReason.NetworkTimeout, e, null, 4, null);
                            }
                            if (e instanceof C0574G0) {
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                        diagnostics2 = diagnostics;
                        num2 = num;
                        statsigNetworkImpl = this;
                        if (statsigNetworkImpl.connectivityListener.isNetworkAvailable()) {
                            statsigNetworkImpl.errorBoundary.logException$build_release(e);
                        }
                        statsigNetworkImpl.endDiagnostics(diagnostics2, contextType2, KeyType.INITIALIZE, null, null, new Integer(1), new Marker.ErrorMessage(String.valueOf(e.getMessage()), e.getClass().getName(), e.getClass().getName()), num2);
                        if (e instanceof SocketTimeoutException ? true : e instanceof ConnectException) {
                            return new InitializeResponse.FailedInitializeResponse(InitializeFailReason.NetworkTimeout, e, null, 4, null);
                        }
                        if (e instanceof C0574G0) {
                        }
                    }
                } catch (Exception e13) {
                    e = e13;
                    contextType2 = contextType;
                    diagnostics2 = diagnostics;
                }
            } catch (Exception e14) {
                e = e14;
                contextType2 = contextType;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16525B c16525b3 = (C16525B) statsigNetworkImpl$initializeImpl$2.L$4;
            num2 = (Integer) statsigNetworkImpl$initializeImpl$2.L$3;
            Diagnostics diagnostics3 = (Diagnostics) statsigNetworkImpl$initializeImpl$2.L$2;
            contextType3 = (ContextType) statsigNetworkImpl$initializeImpl$2.L$1;
            statsigNetworkImpl = (StatsigNetworkImpl) statsigNetworkImpl$initializeImpl$2.L$0;
            try {
                AbstractC9233X.m9807c(obj);
                c16525b = c16525b3;
                diagnostics2 = diagnostics3;
            } catch (Exception e15) {
                e = e15;
                diagnostics2 = diagnostics3;
                contextType2 = contextType3;
                if (statsigNetworkImpl.connectivityListener.isNetworkAvailable()) {
                    statsigNetworkImpl.errorBoundary.logException$build_release(e);
                }
                statsigNetworkImpl.endDiagnostics(diagnostics2, contextType2, KeyType.INITIALIZE, null, null, new Integer(1), new Marker.ErrorMessage(String.valueOf(e.getMessage()), e.getClass().getName(), e.getClass().getName()), num2);
                if (e instanceof SocketTimeoutException ? true : e instanceof ConnectException) {
                    return new InitializeResponse.FailedInitializeResponse(InitializeFailReason.NetworkTimeout, e, null, 4, null);
                }
                return e instanceof C0574G0 ? new InitializeResponse.FailedInitializeResponse(InitializeFailReason.CoroutineTimeout, e, null, 4, null) : new InitializeResponse.FailedInitializeResponse(InitializeFailReason.InternalError, e, null, 4, null);
            }
        }
        try {
            InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse = (InitializeResponse.SuccessfulInitializeResponse) obj;
            return successfulInitializeResponse == null ? new InitializeResponse.FailedInitializeResponse(InitializeFailReason.NetworkError, null, (Integer) c16525b.f51262Y) : successfulInitializeResponse;
        } catch (Exception e16) {
            e = e16;
            contextType2 = contextType3;
            if (statsigNetworkImpl.connectivityListener.isNetworkAvailable()) {
                statsigNetworkImpl.errorBoundary.logException$build_release(e);
            }
            statsigNetworkImpl.endDiagnostics(diagnostics2, contextType2, KeyType.INITIALIZE, null, null, new Integer(1), new Marker.ErrorMessage(String.valueOf(e.getMessage()), e.getClass().getName(), e.getClass().getName()), num2);
            if (e instanceof SocketTimeoutException ? true : e instanceof ConnectException) {
                return new InitializeResponse.FailedInitializeResponse(InitializeFailReason.NetworkTimeout, e, null, 4, null);
            }
            if (e instanceof C0574G0) {
            }
        }
    }

    @Override // com.statsig.androidsdk.StatsigNetwork
    public InterfaceC2184i pollForChanges(String api, StatsigUser user, Long sinceTime, StatsigMetadata metadata) {
        AbstractC16544l.m18094g(api, "api");
        AbstractC16544l.m18094g(user, "user");
        AbstractC16544l.m18094g(metadata, "metadata");
        return new C2219z0(new C128461(user, this, metadata, sinceTime, api, null));
    }
}
