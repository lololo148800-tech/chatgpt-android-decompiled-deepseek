package com.statsig.androidsdk;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010$\n\u0002\b\u000b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB[\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00110\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0013J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u0017\u001a\u00020\u0003J\u001d\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00110\u0010¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\fR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00110\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m18067d2 = {"Lcom/statsig/androidsdk/FeatureGate;", "Lcom/statsig/androidsdk/BaseConfig;", "gateName", "", "apiFeatureGate", "Lcom/statsig/androidsdk/APIFeatureGate;", "evalDetails", "Lcom/statsig/androidsdk/EvaluationDetails;", "(Ljava/lang/String;Lcom/statsig/androidsdk/APIFeatureGate;Lcom/statsig/androidsdk/EvaluationDetails;)V", DiagnosticsEntry.NAME_KEY, "details", "value", "", "rule", "groupName", "secondaryExposures", "", "", "idType", "(Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationDetails;ZLjava/lang/String;Ljava/lang/String;[Ljava/util/Map;Ljava/lang/String;)V", "[Ljava/util/Map;", "getGroupName", "getIDType", "getRuleID", "getSecondaryExposures", "()[Ljava/util/Map;", "getValue", "Companion", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class FeatureGate extends BaseConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final EvaluationDetails details;
    private final String groupName;
    private final String idType;
    private final String name;
    private final String rule;
    private final Map<String, String>[] secondaryExposures;
    private final boolean value;

    @Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/statsig/androidsdk/FeatureGate$Companion;", "", "()V", "getError", "Lcom/statsig/androidsdk/FeatureGate;", DiagnosticsEntry.NAME_KEY, "", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FeatureGate getError(String name) {
            AbstractC16544l.m18094g(name, "name");
            return new FeatureGate(name, new EvaluationDetails(EvaluationReason.Error, 0L, 2, null), false, "", null, null, null, 112, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ FeatureGate(String str, EvaluationDetails evaluationDetails, boolean z6, String str2, String str3, Map[] mapArr, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, evaluationDetails, z6, (i10 & 8) != 0 ? "" : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? new Map[0] : mapArr, (i10 & 64) != 0 ? null : str4);
    }

    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX INFO: renamed from: getIDType, reason: from getter */
    public final String getIdType() {
        return this.idType;
    }

    /* JADX INFO: renamed from: getRuleID, reason: from getter */
    public final String getRule() {
        return this.rule;
    }

    public final Map<String, String>[] getSecondaryExposures() {
        return this.secondaryExposures;
    }

    public final boolean getValue() {
        return this.value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureGate(String name, EvaluationDetails details, boolean z6, String rule, String str, Map<String, String>[] secondaryExposures, String str2) {
        super(name, details);
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(details, "details");
        AbstractC16544l.m18094g(rule, "rule");
        AbstractC16544l.m18094g(secondaryExposures, "secondaryExposures");
        this.name = name;
        this.details = details;
        this.value = z6;
        this.rule = rule;
        this.groupName = str;
        this.secondaryExposures = secondaryExposures;
        this.idType = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeatureGate(String gateName, APIFeatureGate apiFeatureGate, EvaluationDetails evalDetails) {
        AbstractC16544l.m18094g(gateName, "gateName");
        AbstractC16544l.m18094g(apiFeatureGate, "apiFeatureGate");
        AbstractC16544l.m18094g(evalDetails, "evalDetails");
        boolean value = apiFeatureGate.getValue();
        String ruleID = apiFeatureGate.getRuleID();
        String groupName = apiFeatureGate.getGroupName();
        Map<String, String>[] secondaryExposures = apiFeatureGate.getSecondaryExposures();
        this(gateName, evalDetails, value, ruleID, groupName, secondaryExposures == null ? new Map[0] : secondaryExposures, apiFeatureGate.getIdType());
    }
}
