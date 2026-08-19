package com.statsig.androidsdk;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p240Jb.InterfaceC4325b;
import p909nm.AbstractC17659D;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b:\u0018\u00002\u00020\u0001Bç\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011\u0012\u001a\b\u0002\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010%¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH\u0000¢\u0006\u0004\b(\u0010'R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010*\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u00101\u001a\u0004\b6\u00103\"\u0004\b7\u00105R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u00101\u001a\u0004\b=\u00103\"\u0004\b>\u00105R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010*\u001a\u0004\b?\u0010,\"\u0004\b@\u0010.R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u00101\u001a\u0004\bA\u00103\"\u0004\bB\u00105R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010'\"\u0004\bE\u0010FR\"\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u00101\u001a\u0004\bG\u00103\"\u0004\bH\u00105R$\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR0\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010N\u001a\u0004\bS\u0010P\"\u0004\bT\u0010RR4\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010\u0019\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u00101\u001a\u0004\bZ\u00103\"\u0004\b[\u00105R\"\u0010\u001a\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u00101\u001a\u0004\b\\\u00103\"\u0004\b]\u00105R$\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010C¨\u0006_"}, m18067d2 = {"Lcom/statsig/androidsdk/StatsigOptions;", "", "", "api", "eventLoggingAPI", "", "disableCurrentActivityLogging", "disableDiagnosticsLogging", "", "initTimeoutMs", "enableAutoValueUpdate", "overrideStableID", "loadCacheAsync", "", "initializeValues", "initializeOffline", "disableHashing", "Lkotlin/Function1;", "Lcom/statsig/androidsdk/StatsigUser;", "Lmm/C;", "userObjectValidator", "Lcom/statsig/androidsdk/BaseConfig;", "evaluationCallback", "Lkotlin/Function2;", "customCacheKey", "disableLogEventRetries", "optOutNonSdkMetadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZJZLjava/lang/String;ZLjava/util/Map;ZLjava/lang/Boolean;LBm/k;LBm/k;LBm/n;ZZ)V", "Lcom/statsig/androidsdk/Tier;", "tier", "setTier", "(Lcom/statsig/androidsdk/Tier;)V", SubscriberAttributeKt.JSON_NAME_KEY, "value", "setEnvironmentParameter", "(Ljava/lang/String;Ljava/lang/String;)V", "", "getEnvironment", "()Ljava/util/Map;", "toMap$build_release", "toMap", "Ljava/lang/String;", "getApi", "()Ljava/lang/String;", "setApi", "(Ljava/lang/String;)V", "getEventLoggingAPI", "setEventLoggingAPI", "Z", "getDisableCurrentActivityLogging", "()Z", "setDisableCurrentActivityLogging", "(Z)V", "getDisableDiagnosticsLogging", "setDisableDiagnosticsLogging", "J", "getInitTimeoutMs", "()J", "setInitTimeoutMs", "(J)V", "getEnableAutoValueUpdate", "setEnableAutoValueUpdate", "getOverrideStableID", "setOverrideStableID", "getLoadCacheAsync", "setLoadCacheAsync", "Ljava/util/Map;", "getInitializeValues", "setInitializeValues", "(Ljava/util/Map;)V", "getInitializeOffline", "setInitializeOffline", "Ljava/lang/Boolean;", "getDisableHashing", "()Ljava/lang/Boolean;", "setDisableHashing", "(Ljava/lang/Boolean;)V", "LBm/k;", "getUserObjectValidator", "()LBm/k;", "setUserObjectValidator", "(LBm/k;)V", "getEvaluationCallback", "setEvaluationCallback", "LBm/n;", "getCustomCacheKey", "()LBm/n;", "setCustomCacheKey", "(LBm/n;)V", "getDisableLogEventRetries", "setDisableLogEventRetries", "getOptOutNonSdkMetadata", "setOptOutNonSdkMetadata", "environment", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class StatsigOptions {

    @InterfaceC4325b("api")
    private String api;
    private InterfaceC1439n customCacheKey;

    @InterfaceC4325b("disableCurrentActivityLogging")
    private boolean disableCurrentActivityLogging;

    @InterfaceC4325b("disableDiagnosticsLogging")
    private boolean disableDiagnosticsLogging;

    @InterfaceC4325b("disableHashing")
    private Boolean disableHashing;
    private boolean disableLogEventRetries;

    @InterfaceC4325b("enableAutoValueUpdate")
    private boolean enableAutoValueUpdate;
    private Map<String, String> environment;
    private InterfaceC1436k evaluationCallback;

    @InterfaceC4325b("eventLoggingAPI")
    private String eventLoggingAPI;

    @InterfaceC4325b("initTimeoutMs")
    private long initTimeoutMs;

    @InterfaceC4325b("initializeOffline")
    private boolean initializeOffline;

    @InterfaceC4325b("initializeValues")
    private Map<String, ? extends Object> initializeValues;

    @InterfaceC4325b("loadCacheAsync")
    private boolean loadCacheAsync;
    private boolean optOutNonSdkMetadata;

    @InterfaceC4325b("overrideStableID")
    private String overrideStableID;

    @InterfaceC4325b("userObjectValidator")
    private InterfaceC1436k userObjectValidator;

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigOptions$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m18067d2 = {"<anonymous>", "", "sdkKey", "user", "Lcom/statsig/androidsdk/StatsigUser;"}, m18068k = 3, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class C128501 extends AbstractC16546n implements InterfaceC1439n {
        public static final C128501 INSTANCE = new C128501();

        public C128501() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final String invoke(String sdkKey, StatsigUser user) {
            AbstractC16544l.m18094g(sdkKey, "sdkKey");
            AbstractC16544l.m18094g(user, "user");
            return user.getCacheKey() + ':' + sdkKey;
        }
    }

    public StatsigOptions() {
        this(null, null, false, false, 0L, false, null, false, null, false, null, null, null, null, false, false, 65535, null);
    }

    public final String getApi() {
        return this.api;
    }

    public final InterfaceC1439n getCustomCacheKey() {
        return this.customCacheKey;
    }

    public final boolean getDisableCurrentActivityLogging() {
        return this.disableCurrentActivityLogging;
    }

    public final boolean getDisableDiagnosticsLogging() {
        return this.disableDiagnosticsLogging;
    }

    public final Boolean getDisableHashing() {
        return this.disableHashing;
    }

    public final boolean getDisableLogEventRetries() {
        return this.disableLogEventRetries;
    }

    public final boolean getEnableAutoValueUpdate() {
        return this.enableAutoValueUpdate;
    }

    public final Map<String, String> getEnvironment() {
        return this.environment;
    }

    public final InterfaceC1436k getEvaluationCallback() {
        return this.evaluationCallback;
    }

    public final String getEventLoggingAPI() {
        return this.eventLoggingAPI;
    }

    public final long getInitTimeoutMs() {
        return this.initTimeoutMs;
    }

    public final boolean getInitializeOffline() {
        return this.initializeOffline;
    }

    public final Map<String, Object> getInitializeValues() {
        return this.initializeValues;
    }

    public final boolean getLoadCacheAsync() {
        return this.loadCacheAsync;
    }

    public final boolean getOptOutNonSdkMetadata() {
        return this.optOutNonSdkMetadata;
    }

    public final String getOverrideStableID() {
        return this.overrideStableID;
    }

    public final InterfaceC1436k getUserObjectValidator() {
        return this.userObjectValidator;
    }

    public final void setApi(String str) {
        AbstractC16544l.m18094g(str, "<set-?>");
        this.api = str;
    }

    public final void setCustomCacheKey(InterfaceC1439n interfaceC1439n) {
        AbstractC16544l.m18094g(interfaceC1439n, "<set-?>");
        this.customCacheKey = interfaceC1439n;
    }

    public final void setDisableCurrentActivityLogging(boolean z6) {
        this.disableCurrentActivityLogging = z6;
    }

    public final void setDisableDiagnosticsLogging(boolean z6) {
        this.disableDiagnosticsLogging = z6;
    }

    public final void setDisableHashing(Boolean bool) {
        this.disableHashing = bool;
    }

    public final void setDisableLogEventRetries(boolean z6) {
        this.disableLogEventRetries = z6;
    }

    public final void setEnableAutoValueUpdate(boolean z6) {
        this.enableAutoValueUpdate = z6;
    }

    public final void setEnvironmentParameter(String key, String value) {
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(value, "value");
        Map<String, String> map = this.environment;
        if (map == null) {
            this.environment = AbstractC17659D.m19246h(new C17309l(key, value));
        } else {
            map.put(key, value);
        }
    }

    public final void setEvaluationCallback(InterfaceC1436k interfaceC1436k) {
        this.evaluationCallback = interfaceC1436k;
    }

    public final void setEventLoggingAPI(String str) {
        AbstractC16544l.m18094g(str, "<set-?>");
        this.eventLoggingAPI = str;
    }

    public final void setInitTimeoutMs(long j10) {
        this.initTimeoutMs = j10;
    }

    public final void setInitializeOffline(boolean z6) {
        this.initializeOffline = z6;
    }

    public final void setInitializeValues(Map<String, ? extends Object> map) {
        this.initializeValues = map;
    }

    public final void setLoadCacheAsync(boolean z6) {
        this.loadCacheAsync = z6;
    }

    public final void setOptOutNonSdkMetadata(boolean z6) {
        this.optOutNonSdkMetadata = z6;
    }

    public final void setOverrideStableID(String str) {
        this.overrideStableID = str;
    }

    public final void setTier(Tier tier) {
        AbstractC16544l.m18094g(tier, "tier");
        String string = tier.toString();
        if (string == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = string.toLowerCase(Locale.ROOT);
        AbstractC16544l.m18093f(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
        setEnvironmentParameter("tier", lowerCase);
    }

    public final void setUserObjectValidator(InterfaceC1436k interfaceC1436k) {
        this.userObjectValidator = interfaceC1436k;
    }

    public final Map<String, Object> toMap$build_release() {
        return AbstractC17659D.m19244f(new C17309l("api", this.api), new C17309l("disableCurrentActivityLogging", Boolean.valueOf(this.disableCurrentActivityLogging)), new C17309l("disableDiagnosticsLogging", Boolean.valueOf(this.disableDiagnosticsLogging)), new C17309l("initTimeoutMs", Long.valueOf(this.initTimeoutMs)), new C17309l("enableAutoValueUpdate", Boolean.valueOf(this.enableAutoValueUpdate)), new C17309l("overrideStableID", this.overrideStableID), new C17309l("loadCacheAsync", Boolean.valueOf(this.loadCacheAsync)), new C17309l("initializeValues", this.initializeValues), new C17309l("disableHashing", this.disableHashing), new C17309l("environment", this.environment));
    }

    public StatsigOptions(String api, String eventLoggingAPI, boolean z6, boolean z10, long j10, boolean z11, String str, boolean z12, Map<String, ? extends Object> map, boolean z13, Boolean bool, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, InterfaceC1439n customCacheKey, boolean z14, boolean z15) {
        AbstractC16544l.m18094g(api, "api");
        AbstractC16544l.m18094g(eventLoggingAPI, "eventLoggingAPI");
        AbstractC16544l.m18094g(customCacheKey, "customCacheKey");
        this.api = api;
        this.eventLoggingAPI = eventLoggingAPI;
        this.disableCurrentActivityLogging = z6;
        this.disableDiagnosticsLogging = z10;
        this.initTimeoutMs = j10;
        this.enableAutoValueUpdate = z11;
        this.overrideStableID = str;
        this.loadCacheAsync = z12;
        this.initializeValues = map;
        this.initializeOffline = z13;
        this.disableHashing = bool;
        this.userObjectValidator = interfaceC1436k;
        this.evaluationCallback = interfaceC1436k2;
        this.customCacheKey = customCacheKey;
        this.disableLogEventRetries = z14;
        this.optOutNonSdkMetadata = z15;
    }

    public /* synthetic */ StatsigOptions(String str, String str2, boolean z6, boolean z10, long j10, boolean z11, String str3, boolean z12, Map map, boolean z13, Boolean bool, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, InterfaceC1439n interfaceC1439n, boolean z14, boolean z15, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "https://api.statsig.com/v1" : str, (i10 & 2) == 0 ? str2 : "https://api.statsig.com/v1", (i10 & 4) != 0 ? false : z6, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? 5000L : j10, (i10 & 32) != 0 ? false : z11, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? false : z12, (i10 & 256) != 0 ? null : map, (i10 & 512) != 0 ? false : z13, (i10 & 1024) != 0 ? Boolean.FALSE : bool, (i10 & 2048) != 0 ? null : interfaceC1436k, (i10 & 4096) == 0 ? interfaceC1436k2 : null, (i10 & 8192) != 0 ? C128501.INSTANCE : interfaceC1439n, (i10 & 16384) != 0 ? false : z14, (i10 & 32768) != 0 ? false : z15);
    }
}
