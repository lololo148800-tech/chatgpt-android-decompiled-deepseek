package com.statsig.androidsdk;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p037B9.MeDP.MpoABj;
import p909nm.AbstractC17678l;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000 Q2\u00020\u0001:\u0001QBÃ\u0001\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b0\r\u0012\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b0\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B+\b\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!J<\u0010$\u001a\u00028\u0000\"\u0006\b\u0000\u0010\"\u0018\u00012\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010#\u001a\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bH\u0082\b¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b&\u0010'J\u001d\u0010(\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0010¢\u0006\u0004\b(\u0010)J\u001d\u0010+\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010#\u001a\u00020*¢\u0006\u0004\b+\u0010,J\u001d\u0010.\u001a\u00020-2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010#\u001a\u00020-¢\u0006\u0004\b.\u0010/J\u001d\u00101\u001a\u0002002\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010#\u001a\u000200¢\u0006\u0004\b1\u00102J)\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\u00042\f\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r¢\u0006\u0004\b3\u00104J9\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u00042\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0004\u0018\u0001072\u0006\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u0010¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0010¢\u0006\u0004\b<\u0010;J\r\u0010=\u001a\u00020\u0004¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b?\u0010>J!\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b0\rH\u0000¢\u0006\u0004\b@\u0010AJ!\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b0\rH\u0000¢\u0006\u0004\bC\u0010AJ\u0011\u0010F\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\bE\u0010>J\u0017\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0004\bG\u0010HR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010JR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010KR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010LR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010MR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010KR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010KR&\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010NR&\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010NR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010OR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010OR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010OR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010KR\u001c\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010P¨\u0006R"}, m18067d2 = {"Lcom/statsig/androidsdk/Layer;", "Lcom/statsig/androidsdk/BaseConfig;", "Lcom/statsig/androidsdk/StatsigClient;", "client", "", DiagnosticsEntry.NAME_KEY, "Lcom/statsig/androidsdk/EvaluationDetails;", "details", "", "", "jsonValue", "rule", "groupName", "", "secondaryExposures", "undelegatedSecondaryExposures", "", "isUserInExperiment", "isExperimentActive", "isDeviceBased", "allocatedExperimentName", "", "explicitParameters", "<init>", "(Lcom/statsig/androidsdk/StatsigClient;Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationDetails;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;[Ljava/util/Map;[Ljava/util/Map;ZZZLjava/lang/String;Ljava/util/Set;)V", "layerName", "Lcom/statsig/androidsdk/APIDynamicConfig;", "apiDynamicConfig", "evalDetails", "(Lcom/statsig/androidsdk/StatsigClient;Ljava/lang/String;Lcom/statsig/androidsdk/APIDynamicConfig;Lcom/statsig/androidsdk/EvaluationDetails;)V", SubscriberAttributeKt.JSON_NAME_KEY, "Lmm/C;", "logParameterExposure", "(Ljava/lang/String;)V", TokenNames.f32019T, "default", "get", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getBoolean", "(Ljava/lang/String;Z)Z", "", "getDouble", "(Ljava/lang/String;D)D", "", "getInt", "(Ljava/lang/String;I)I", "", "getLong", "(Ljava/lang/String;J)J", "getArray", "(Ljava/lang/String;[Ljava/lang/Object;)[Ljava/lang/Object;", "getDictionary", "(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;", "Lcom/statsig/androidsdk/DynamicConfig;", "getConfig", "(Ljava/lang/String;)Lcom/statsig/androidsdk/DynamicConfig;", "getIsUserInExperiment", "()Z", "getIsExperimentActive", "getRuleID", "()Ljava/lang/String;", "getGroupName", "getSecondaryExposures$build_release", "()[Ljava/util/Map;", "getSecondaryExposures", "getUndelegatedSecondaryExposures$build_release", "getUndelegatedSecondaryExposures", "getAllocatedExperimentName$build_release", "getAllocatedExperimentName", "getExplicitParameters$build_release", "()Ljava/util/Set;", "getExplicitParameters", "Lcom/statsig/androidsdk/StatsigClient;", "Ljava/lang/String;", "Lcom/statsig/androidsdk/EvaluationDetails;", "Ljava/util/Map;", "[Ljava/util/Map;", "Z", "Ljava/util/Set;", "Companion", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class Layer extends BaseConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String allocatedExperimentName;
    private final StatsigClient client;
    private final EvaluationDetails details;
    private final Set<String> explicitParameters;
    private final String groupName;
    private final boolean isDeviceBased;
    private final boolean isExperimentActive;
    private final boolean isUserInExperiment;
    private final Map<String, Object> jsonValue;
    private final String name;
    private final String rule;
    private final Map<String, String>[] secondaryExposures;
    private final Map<String, String>[] undelegatedSecondaryExposures;

    @Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/statsig/androidsdk/Layer$Companion;", "", "()V", "getError", "Lcom/statsig/androidsdk/Layer;", DiagnosticsEntry.NAME_KEY, "", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Layer getError(String name) {
            AbstractC16544l.m18094g(name, "name");
            return new Layer(null, name, new EvaluationDetails(EvaluationReason.Error, 0L, 2, null), null, null, null, null, null, false, false, false, null, null, 8184, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ Layer(StatsigClient statsigClient, String str, EvaluationDetails evaluationDetails, Map map, String str2, String str3, Map[] mapArr, Map[] mapArr2, boolean z6, boolean z10, boolean z11, String str4, Set set, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(statsigClient, str, evaluationDetails, (i10 & 8) != 0 ? C17690x.f56481Y : map, (i10 & 16) != 0 ? "" : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? new Map[0] : mapArr, (i10 & 128) != 0 ? new Map[0] : mapArr2, (i10 & 256) != 0 ? false : z6, (i10 & 512) != 0 ? false : z10, (i10 & 1024) != 0 ? false : z11, (i10 & 2048) != 0 ? null : str4, (i10 & 4096) != 0 ? null : set);
    }

    private final Object get(String key, Object obj, Map jsonValue) {
        jsonValue.get(key);
        AbstractC16544l.m18102o();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logParameterExposure(String key) {
        StatsigClient statsigClient = this.client;
        if (statsigClient == null) {
            return;
        }
        StatsigClient.logLayerParameterExposure$build_release$default(statsigClient, this, key, false, 4, null);
    }

    /* JADX INFO: renamed from: getAllocatedExperimentName$build_release, reason: from getter */
    public final String getAllocatedExperimentName() {
        return this.allocatedExperimentName;
    }

    public final Object[] getArray(String key, Object[] objArr) {
        AbstractC16544l.m18094g(key, "key");
        Object obj = this.jsonValue.get(key);
        Object[] array = null;
        Object[] objArr2 = obj instanceof Object[] ? (Object[]) obj : null;
        if (objArr2 == null) {
            Object obj2 = this.jsonValue.get(key);
            ArrayList arrayList = obj2 instanceof ArrayList ? (ArrayList) obj2 : null;
            if (arrayList != null && (array = arrayList.toArray(new Object[0])) == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            objArr2 = array;
        }
        if (objArr2 != null) {
            logParameterExposure(key);
        }
        return objArr2 == null ? objArr : objArr2;
    }

    public final boolean getBoolean(String key, boolean z6) {
        AbstractC16544l.m18094g(key, "key");
        Boolean boolValueOf = Boolean.valueOf(z6);
        Object obj = this.jsonValue.get(key);
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            logParameterExposure(key);
        }
        if (bool != null) {
            boolValueOf = bool;
        }
        return boolValueOf.booleanValue();
    }

    public final DynamicConfig getConfig(String key) {
        AbstractC16544l.m18094g(key, "key");
        Object obj = this.jsonValue.get(key);
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map = (Map) obj;
        if (map != null) {
            logParameterExposure(key);
        }
        Map map2 = map == null ? null : map;
        if (map2 != null) {
            return new DynamicConfig(key, this.details, map2, this.rule, this.groupName, null, false, false, false, null, 992, null);
        }
        return null;
    }

    public final Map<String, Object> getDictionary(String key, Map<String, ? extends Object> map) {
        AbstractC16544l.m18094g(key, "key");
        Object obj = this.jsonValue.get(key);
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map<String, Object> map2 = (Map) obj;
        if (map2 != null) {
            logParameterExposure(key);
        }
        return map2 == null ? map : map2;
    }

    public final double getDouble(String key, double d10) {
        AbstractC16544l.m18094g(key, "key");
        Number numberValueOf = Double.valueOf(d10);
        Object obj = this.jsonValue.get(key);
        if (!(obj instanceof Number)) {
            obj = null;
        }
        Number number = (Number) obj;
        if (number != null) {
            logParameterExposure(key);
        }
        if (number != null) {
            numberValueOf = number;
        }
        return numberValueOf.doubleValue();
    }

    public final Set<String> getExplicitParameters$build_release() {
        return this.explicitParameters;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final int getInt(String key, int i10) {
        AbstractC16544l.m18094g(key, "key");
        Number numberValueOf = Integer.valueOf(i10);
        Object obj = this.jsonValue.get(key);
        if (!(obj instanceof Number)) {
            obj = null;
        }
        Number number = (Number) obj;
        if (number != null) {
            logParameterExposure(key);
        }
        if (number != null) {
            numberValueOf = number;
        }
        return numberValueOf.intValue();
    }

    public final boolean getIsExperimentActive() {
        return this.isExperimentActive;
    }

    public final boolean getIsUserInExperiment() {
        return this.isUserInExperiment;
    }

    public final long getLong(String key, long j10) {
        AbstractC16544l.m18094g(key, "key");
        Number numberValueOf = Long.valueOf(j10);
        Object obj = this.jsonValue.get(key);
        if (!(obj instanceof Number)) {
            obj = null;
        }
        Number number = (Number) obj;
        if (number != null) {
            logParameterExposure(key);
        }
        if (number != null) {
            numberValueOf = number;
        }
        return numberValueOf.longValue();
    }

    /* JADX INFO: renamed from: getRuleID, reason: from getter */
    public final String getRule() {
        return this.rule;
    }

    public final Map<String, String>[] getSecondaryExposures$build_release() {
        return this.secondaryExposures;
    }

    public final String getString(String key, String str) {
        AbstractC16544l.m18094g(key, "key");
        Object obj = this.jsonValue.get(key);
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str2 = (String) obj;
        if (str2 != null) {
            logParameterExposure(key);
        }
        return str2 == null ? str : str2;
    }

    public final Map<String, String>[] getUndelegatedSecondaryExposures$build_release() {
        return this.undelegatedSecondaryExposures;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Layer(StatsigClient statsigClient, String name, EvaluationDetails evaluationDetails, Map<String, ? extends Object> jsonValue, String rule, String str, Map<String, String>[] secondaryExposures, Map<String, String>[] undelegatedSecondaryExposures, boolean z6, boolean z10, boolean z11, String str2, Set<String> set) {
        super(name, evaluationDetails);
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(evaluationDetails, MpoABj.CjWOVIYiDgQl);
        AbstractC16544l.m18094g(jsonValue, "jsonValue");
        AbstractC16544l.m18094g(rule, "rule");
        AbstractC16544l.m18094g(secondaryExposures, "secondaryExposures");
        AbstractC16544l.m18094g(undelegatedSecondaryExposures, "undelegatedSecondaryExposures");
        this.client = statsigClient;
        this.name = name;
        this.details = evaluationDetails;
        this.jsonValue = jsonValue;
        this.rule = rule;
        this.groupName = str;
        this.secondaryExposures = secondaryExposures;
        this.undelegatedSecondaryExposures = undelegatedSecondaryExposures;
        this.isUserInExperiment = z6;
        this.isExperimentActive = z10;
        this.isDeviceBased = z11;
        this.allocatedExperimentName = str2;
        this.explicitParameters = set;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Layer(StatsigClient statsigClient, String layerName, APIDynamicConfig apiDynamicConfig, EvaluationDetails evalDetails) {
        AbstractC16544l.m18094g(layerName, "layerName");
        AbstractC16544l.m18094g(apiDynamicConfig, "apiDynamicConfig");
        AbstractC16544l.m18094g(evalDetails, "evalDetails");
        Map<String, Object> value = apiDynamicConfig.getValue();
        String ruleID = apiDynamicConfig.getRuleID();
        String groupName = apiDynamicConfig.getGroupName();
        Map<String, String>[] secondaryExposures = apiDynamicConfig.getSecondaryExposures();
        Map<String, String>[] mapArr = secondaryExposures == null ? new Map[0] : secondaryExposures;
        Map<String, String>[] undelegatedSecondaryExposures = apiDynamicConfig.getUndelegatedSecondaryExposures();
        Map<String, String>[] mapArr2 = undelegatedSecondaryExposures == null ? new Map[0] : undelegatedSecondaryExposures;
        boolean zIsUserInExperiment = apiDynamicConfig.isUserInExperiment();
        boolean zIsExperimentActive = apiDynamicConfig.isExperimentActive();
        boolean zIsDeviceBased = apiDynamicConfig.isDeviceBased();
        String allocatedExperimentName = apiDynamicConfig.getAllocatedExperimentName();
        String[] explicitParameters = apiDynamicConfig.getExplicitParameters();
        this(statsigClient, layerName, evalDetails, value, ruleID, groupName, mapArr, mapArr2, zIsUserInExperiment, zIsExperimentActive, zIsDeviceBased, allocatedExperimentName, explicitParameters == null ? null : AbstractC17678l.m19293P(explicitParameters));
    }
}
