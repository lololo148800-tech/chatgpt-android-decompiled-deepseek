package com.statsig.androidsdk;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001c\u0018\u0000 L2\u00020\u0001:\u0001LB\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00060\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013B!\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0018J<\u0010\u001d\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c\u0018\u00010\u001b\"\u0006\b\u0000\u0010\u0019\u0018\u0001\"\u0006\b\u0001\u0010\u001a\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001bH\u0082\b¢\u0006\u0004\b\u001d\u0010\u001eJ:\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001c\"\u0006\b\u0000\u0010\u0019\u0018\u0001\"\u0006\b\u0001\u0010\u001a\u0018\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001cH\u0082\b¢\u0006\u0004\b\u001f\u0010 JR\u0010$\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0006\b\u0000\u0010!\u0018\u0001\"\u0006\b\u0001\u0010\"\u0018\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006H\u0082\b¢\u0006\u0004\b$\u0010%J!\u0010'\u001a\u0004\u0018\u00010\u00022\u0006\u0010&\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\r¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010#\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u001d\u0010/\u001a\u00020.2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010#\u001a\u00020.¢\u0006\u0004\b/\u00100J\u001d\u00102\u001a\u0002012\u0006\u0010&\u001a\u00020\u00022\u0006\u0010#\u001a\u000201¢\u0006\u0004\b2\u00103J)\u00104\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020\u00022\f\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b¢\u0006\u0004\b4\u00105J9\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010&\u001a\u00020\u00022\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u0004\u0018\u00010\u00002\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b8\u00109J\u0019\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\r¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\r¢\u0006\u0004\b>\u0010=J\r\u0010?\u001a\u00020\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bA\u0010@J!\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00060\u000bH\u0000¢\u0006\u0004\bB\u0010CJ\u0011\u0010F\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\bE\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010GR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010HR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010IR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010GR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010GR&\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010JR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010KR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010KR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010KR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010G¨\u0006M"}, m18067d2 = {"Lcom/statsig/androidsdk/DynamicConfig;", "Lcom/statsig/androidsdk/BaseConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/statsig/androidsdk/EvaluationDetails;", "details", "", "", "jsonValue", "rule", "groupName", "", "secondaryExposures", "", "isUserInExperiment", "isExperimentActive", "isDeviceBased", "allocatedExperimentName", "<init>", "(Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationDetails;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;[Ljava/util/Map;ZZZLjava/lang/String;)V", "configName", "Lcom/statsig/androidsdk/APIDynamicConfig;", "apiDynamicConfig", "evalDetails", "(Ljava/lang/String;Lcom/statsig/androidsdk/APIDynamicConfig;Lcom/statsig/androidsdk/EvaluationDetails;)V", "A", "B", "", "Lmm/l;", "asListOfPairs", "(Ljava/util/List;)Ljava/util/List;", "asPairOf", "(Lmm/l;)Lmm/l;", TokenNames.f32013K, TokenNames.f32021V, "default", "asMapOf", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", SubscriberAttributeKt.JSON_NAME_KEY, "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getBoolean", "(Ljava/lang/String;Z)Z", "", "getDouble", "(Ljava/lang/String;D)D", "", "getInt", "(Ljava/lang/String;I)I", "", "getLong", "(Ljava/lang/String;J)J", "getArray", "(Ljava/lang/String;[Ljava/lang/Object;)[Ljava/lang/Object;", "getDictionary", "(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;", "getConfig", "(Ljava/lang/String;)Lcom/statsig/androidsdk/DynamicConfig;", "getValue", "()Ljava/util/Map;", "getIsUserInExperiment", "()Z", "getIsExperimentActive", "getRuleID", "()Ljava/lang/String;", "getGroupName", "getSecondaryExposures$build_release", "()[Ljava/util/Map;", "getSecondaryExposures", "getAllocatedExperimentName$build_release", "getAllocatedExperimentName", "Ljava/lang/String;", "Lcom/statsig/androidsdk/EvaluationDetails;", "Ljava/util/Map;", "[Ljava/util/Map;", "Z", "Companion", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DynamicConfig extends BaseConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String allocatedExperimentName;
    private final EvaluationDetails details;
    private final String groupName;
    private final boolean isDeviceBased;
    private final boolean isExperimentActive;
    private final boolean isUserInExperiment;
    private final Map<String, Object> jsonValue;
    private final String name;
    private final String rule;
    private final Map<String, String>[] secondaryExposures;

    @Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/statsig/androidsdk/DynamicConfig$Companion;", "", "()V", "getError", "Lcom/statsig/androidsdk/DynamicConfig;", DiagnosticsEntry.NAME_KEY, "", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DynamicConfig getError(String name) {
            AbstractC16544l.m18094g(name, "name");
            return new DynamicConfig(name, new EvaluationDetails(EvaluationReason.Error, 0L, 2, null), null, null, null, null, false, false, false, null, 1020, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ DynamicConfig(String str, EvaluationDetails evaluationDetails, Map map, String str2, String str3, Map[] mapArr, boolean z6, boolean z10, boolean z11, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, evaluationDetails, (i10 & 4) != 0 ? C17690x.f56481Y : map, (i10 & 8) != 0 ? "" : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? new Map[0] : mapArr, (i10 & 64) != 0 ? false : z6, (i10 & 128) != 0 ? false : z10, (i10 & 256) != 0 ? false : z11, (i10 & 512) != 0 ? null : str4);
    }

    private final List asListOfPairs(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C17309l) {
                Object obj2 = ((C17309l) obj).f55136Y;
                AbstractC16544l.m18102o();
                throw null;
            }
        }
        return arrayList;
    }

    private final Map asMapOf(Map map, Map map2) {
        AbstractC17680n.m19340P(map.keySet());
        AbstractC16544l.m18102o();
        throw null;
    }

    public static Map asMapOf$default(DynamicConfig dynamicConfig, Map map, Map map2, int i10, Object obj) {
        AbstractC17680n.m19340P(map.keySet());
        AbstractC16544l.m18102o();
        throw null;
    }

    private final C17309l asPairOf(C17309l c17309l) {
        Object obj = c17309l.f55136Y;
        AbstractC16544l.m18102o();
        throw null;
    }

    /* JADX INFO: renamed from: getAllocatedExperimentName$build_release, reason: from getter */
    public final String getAllocatedExperimentName() {
        return this.allocatedExperimentName;
    }

    public final Object[] getArray(String key, Object[] objArr) {
        AbstractC16544l.m18094g(key, "key");
        Object obj = this.jsonValue.get(key);
        if (obj instanceof Object[]) {
            return (Object[]) obj;
        }
        if (!(obj instanceof ArrayList)) {
            return objArr;
        }
        Object[] array = ((Collection) obj).toArray(new Object[0]);
        if (array != null) {
            return array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final boolean getBoolean(String key, boolean z6) {
        AbstractC16544l.m18094g(key, "key");
        if (!(this.jsonValue.get(key) instanceof Boolean)) {
            return z6;
        }
        Object obj = this.jsonValue.get(key);
        if (obj != null) {
            return ((Boolean) obj).booleanValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    public final DynamicConfig getConfig(String key) {
        LinkedHashMap linkedHashMap;
        C17309l c17309l;
        AbstractC16544l.m18094g(key, "key");
        Object obj = this.jsonValue.get(key);
        if (!(obj instanceof Map)) {
            return null;
        }
        Map map = (Map) obj;
        if ((AbstractC17680n.m19340P(map.keySet()) instanceof String) && (AbstractC17680n.m19340P(map.values()) instanceof Object)) {
            List listM19252n = AbstractC17659D.m19252n(map);
            ArrayList<C17309l> arrayList = new ArrayList();
            for (Object obj2 : listM19252n) {
                if (obj2 instanceof C17309l) {
                    C17309l c17309l2 = (C17309l) obj2;
                    Object obj3 = c17309l2.f55136Y;
                    if (obj3 instanceof String) {
                        Object obj4 = c17309l2.f55137Z;
                        if (!(obj4 instanceof Object)) {
                            c17309l = null;
                        } else {
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            String str = (String) obj3;
                            if (obj4 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                            }
                            c17309l = new C17309l(str, obj4);
                        }
                    } else {
                        c17309l = null;
                    }
                } else {
                    c17309l = null;
                }
                if (c17309l != null) {
                    arrayList.add(c17309l);
                }
            }
            int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(arrayList, 10));
            if (iM19257b < 16) {
                iM19257b = 16;
            }
            linkedHashMap = new LinkedHashMap(iM19257b);
            for (C17309l c17309l3 : arrayList) {
                linkedHashMap.put(c17309l3.f55136Y, c17309l3.f55137Z);
            }
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        return new DynamicConfig(key, this.details, linkedHashMap, this.rule, this.groupName, null, false, false, false, null, 992, null);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    public final Map<String, Object> getDictionary(String key, Map<String, ? extends Object> map) {
        C17309l c17309l;
        AbstractC16544l.m18094g(key, "key");
        Object obj = this.jsonValue.get(key);
        if (!(obj instanceof Map)) {
            return map;
        }
        Map map2 = (Map) obj;
        LinkedHashMap linkedHashMap = null;
        if ((AbstractC17680n.m19340P(map2.keySet()) instanceof String) && (AbstractC17680n.m19340P(map2.values()) instanceof Object)) {
            List listM19252n = AbstractC17659D.m19252n(map2);
            ArrayList<C17309l> arrayList = new ArrayList();
            for (Object obj2 : listM19252n) {
                if (obj2 instanceof C17309l) {
                    C17309l c17309l2 = (C17309l) obj2;
                    Object obj3 = c17309l2.f55136Y;
                    if (obj3 instanceof String) {
                        Object obj4 = c17309l2.f55137Z;
                        if (!(obj4 instanceof Object)) {
                            c17309l = null;
                        } else {
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            String str = (String) obj3;
                            if (obj4 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                            }
                            c17309l = new C17309l(str, obj4);
                        }
                    } else {
                        c17309l = null;
                    }
                } else {
                    c17309l = null;
                }
                if (c17309l != null) {
                    arrayList.add(c17309l);
                }
            }
            int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(arrayList, 10));
            if (iM19257b < 16) {
                iM19257b = 16;
            }
            linkedHashMap = new LinkedHashMap(iM19257b);
            for (C17309l c17309l3 : arrayList) {
                linkedHashMap.put(c17309l3.f55136Y, c17309l3.f55137Z);
            }
        }
        return linkedHashMap;
    }

    public final double getDouble(String key, double d10) {
        AbstractC16544l.m18094g(key, "key");
        Object obj = this.jsonValue.get(key);
        return obj instanceof Number ? ((Number) obj).doubleValue() : d10;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final int getInt(String key, int i10) {
        AbstractC16544l.m18094g(key, "key");
        Object obj = this.jsonValue.get(key);
        return obj instanceof Number ? ((Number) obj).intValue() : i10;
    }

    public final boolean getIsExperimentActive() {
        return this.isExperimentActive;
    }

    public final boolean getIsUserInExperiment() {
        return this.isUserInExperiment;
    }

    public final long getLong(String key, long j10) {
        AbstractC16544l.m18094g(key, "key");
        Object obj = this.jsonValue.get(key);
        return obj instanceof Number ? ((Number) obj).longValue() : j10;
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
        if (!(this.jsonValue.get(key) instanceof String)) {
            return str;
        }
        Object obj = this.jsonValue.get(key);
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final Map<String, Object> getValue() {
        return this.jsonValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicConfig(String name, EvaluationDetails details, Map<String, ? extends Object> jsonValue, String rule, String str, Map<String, String>[] secondaryExposures, boolean z6, boolean z10, boolean z11, String str2) {
        super(name, details);
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(details, "details");
        AbstractC16544l.m18094g(jsonValue, "jsonValue");
        AbstractC16544l.m18094g(rule, "rule");
        AbstractC16544l.m18094g(secondaryExposures, "secondaryExposures");
        this.name = name;
        this.details = details;
        this.jsonValue = jsonValue;
        this.rule = rule;
        this.groupName = str;
        this.secondaryExposures = secondaryExposures;
        this.isUserInExperiment = z6;
        this.isExperimentActive = z10;
        this.isDeviceBased = z11;
        this.allocatedExperimentName = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DynamicConfig(String configName, APIDynamicConfig apiDynamicConfig, EvaluationDetails evalDetails) {
        AbstractC16544l.m18094g(configName, "configName");
        AbstractC16544l.m18094g(apiDynamicConfig, "apiDynamicConfig");
        AbstractC16544l.m18094g(evalDetails, "evalDetails");
        Map<String, Object> value = apiDynamicConfig.getValue();
        String ruleID = apiDynamicConfig.getRuleID();
        String groupName = apiDynamicConfig.getGroupName();
        Map<String, String>[] secondaryExposures = apiDynamicConfig.getSecondaryExposures();
        this(configName, evalDetails, value, ruleID, groupName, secondaryExposures == null ? new Map[0] : secondaryExposures, apiDynamicConfig.isUserInExperiment(), apiDynamicConfig.isExperimentActive(), apiDynamicConfig.isDeviceBased(), apiDynamicConfig.getAllocatedExperimentName());
    }
}
