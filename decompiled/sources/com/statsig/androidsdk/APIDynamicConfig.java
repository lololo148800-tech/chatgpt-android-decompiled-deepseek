package com.statsig.androidsdk;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p003A1.AbstractC0168G;
import p1071w0.AbstractC20734X;
import p240Jb.InterfaceC4325b;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\t\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0016\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0015\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\"\u0010'\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001cJ\"\u0010(\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J¼\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\t2\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018R\u0016\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0018R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R,\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR,\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00063"}, m18067d2 = {"Lcom/statsig/androidsdk/APIDynamicConfig;", "", DiagnosticsEntry.NAME_KEY, "", "value", "", "ruleID", "groupName", "secondaryExposures", "", "undelegatedSecondaryExposures", "isDeviceBased", "", "isUserInExperiment", "isExperimentActive", "allocatedExperimentName", "explicitParameters", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;[Ljava/util/Map;[Ljava/util/Map;ZZZLjava/lang/String;[Ljava/lang/String;)V", "getAllocatedExperimentName", "()Ljava/lang/String;", "getExplicitParameters", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getGroupName", "()Z", "getName", "getRuleID", "getSecondaryExposures", "()[Ljava/util/Map;", "[Ljava/util/Map;", "getUndelegatedSecondaryExposures", "getValue", "()Ljava/util/Map;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;[Ljava/util/Map;[Ljava/util/Map;ZZZLjava/lang/String;[Ljava/lang/String;)Lcom/statsig/androidsdk/APIDynamicConfig;", "equals", "other", "hashCode", "", "toString", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class APIDynamicConfig {

    @InterfaceC4325b("allocated_experiment_name")
    private final String allocatedExperimentName;

    @InterfaceC4325b("explicit_parameters")
    private final String[] explicitParameters;

    @InterfaceC4325b("group_name")
    private final String groupName;

    @InterfaceC4325b("is_device_based")
    private final boolean isDeviceBased;

    @InterfaceC4325b("is_experiment_active")
    private final boolean isExperimentActive;

    @InterfaceC4325b("is_user_in_experiment")
    private final boolean isUserInExperiment;

    @InterfaceC4325b(DiagnosticsEntry.NAME_KEY)
    private final String name;

    @InterfaceC4325b("rule_id")
    private final String ruleID;

    @InterfaceC4325b("secondary_exposures")
    private final Map<String, String>[] secondaryExposures;

    @InterfaceC4325b("undelegated_secondary_exposures")
    private final Map<String, String>[] undelegatedSecondaryExposures;

    @InterfaceC4325b("value")
    private final Map<String, Object> value;

    public APIDynamicConfig(String name, Map<String, ? extends Object> value, String ruleID, String str, Map<String, String>[] mapArr, Map<String, String>[] mapArr2, boolean z6, boolean z10, boolean z11, String str2, String[] strArr) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(value, "value");
        AbstractC16544l.m18094g(ruleID, "ruleID");
        this.name = name;
        this.value = value;
        this.ruleID = ruleID;
        this.groupName = str;
        this.secondaryExposures = mapArr;
        this.undelegatedSecondaryExposures = mapArr2;
        this.isDeviceBased = z6;
        this.isUserInExperiment = z10;
        this.isExperimentActive = z11;
        this.allocatedExperimentName = str2;
        this.explicitParameters = strArr;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAllocatedExperimentName() {
        return this.allocatedExperimentName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String[] getExplicitParameters() {
        return this.explicitParameters;
    }

    public final Map<String, Object> component2() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRuleID() {
        return this.ruleID;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    public final Map<String, String>[] component5() {
        return this.secondaryExposures;
    }

    public final Map<String, String>[] component6() {
        return this.undelegatedSecondaryExposures;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsDeviceBased() {
        return this.isDeviceBased;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsUserInExperiment() {
        return this.isUserInExperiment;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsExperimentActive() {
        return this.isExperimentActive;
    }

    public final APIDynamicConfig copy(String name, Map<String, ? extends Object> value, String ruleID, String groupName, Map<String, String>[] secondaryExposures, Map<String, String>[] undelegatedSecondaryExposures, boolean isDeviceBased, boolean isUserInExperiment, boolean isExperimentActive, String allocatedExperimentName, String[] explicitParameters) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(value, "value");
        AbstractC16544l.m18094g(ruleID, "ruleID");
        return new APIDynamicConfig(name, value, ruleID, groupName, secondaryExposures, undelegatedSecondaryExposures, isDeviceBased, isUserInExperiment, isExperimentActive, allocatedExperimentName, explicitParameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APIDynamicConfig)) {
            return false;
        }
        APIDynamicConfig aPIDynamicConfig = (APIDynamicConfig) other;
        return AbstractC16544l.m18089b(this.name, aPIDynamicConfig.name) && AbstractC16544l.m18089b(this.value, aPIDynamicConfig.value) && AbstractC16544l.m18089b(this.ruleID, aPIDynamicConfig.ruleID) && AbstractC16544l.m18089b(this.groupName, aPIDynamicConfig.groupName) && AbstractC16544l.m18089b(this.secondaryExposures, aPIDynamicConfig.secondaryExposures) && AbstractC16544l.m18089b(this.undelegatedSecondaryExposures, aPIDynamicConfig.undelegatedSecondaryExposures) && this.isDeviceBased == aPIDynamicConfig.isDeviceBased && this.isUserInExperiment == aPIDynamicConfig.isUserInExperiment && this.isExperimentActive == aPIDynamicConfig.isExperimentActive && AbstractC16544l.m18089b(this.allocatedExperimentName, aPIDynamicConfig.allocatedExperimentName) && AbstractC16544l.m18089b(this.explicitParameters, aPIDynamicConfig.explicitParameters);
    }

    public final String getAllocatedExperimentName() {
        return this.allocatedExperimentName;
    }

    public final String[] getExplicitParameters() {
        return this.explicitParameters;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRuleID() {
        return this.ruleID;
    }

    public final Map<String, String>[] getSecondaryExposures() {
        return this.secondaryExposures;
    }

    public final Map<String, String>[] getUndelegatedSecondaryExposures() {
        return this.undelegatedSecondaryExposures;
    }

    public final Map<String, Object> getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14, types: [int] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public int hashCode() {
        int iM527p = AbstractC0168G.m527p(AbstractC20734X.m21250u(this.name.hashCode() * 31, 31, this.value), 31, this.ruleID);
        String str = this.groupName;
        int iHashCode = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String>[] mapArr = this.secondaryExposures;
        int iHashCode2 = (iHashCode + (mapArr == null ? 0 : Arrays.hashCode(mapArr))) * 31;
        Map<String, String>[] mapArr2 = this.undelegatedSecondaryExposures;
        int iHashCode3 = (iHashCode2 + (mapArr2 == null ? 0 : Arrays.hashCode(mapArr2))) * 31;
        boolean z6 = this.isDeviceBased;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = (iHashCode3 + r6) * 31;
        boolean z10 = this.isUserInExperiment;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i11 = (i10 + r10) * 31;
        boolean z11 = this.isExperimentActive;
        int i12 = (i11 + (z11 ? 1 : z11)) * 31;
        String str2 = this.allocatedExperimentName;
        int iHashCode4 = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String[] strArr = this.explicitParameters;
        return iHashCode4 + (strArr != null ? Arrays.hashCode(strArr) : 0);
    }

    public final boolean isDeviceBased() {
        return this.isDeviceBased;
    }

    public final boolean isExperimentActive() {
        return this.isExperimentActive;
    }

    public final boolean isUserInExperiment() {
        return this.isUserInExperiment;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("APIDynamicConfig(name=");
        sb2.append(this.name);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", ruleID=");
        sb2.append(this.ruleID);
        sb2.append(", groupName=");
        sb2.append((Object) this.groupName);
        sb2.append(", secondaryExposures=");
        sb2.append(Arrays.toString(this.secondaryExposures));
        sb2.append(", undelegatedSecondaryExposures=");
        sb2.append(Arrays.toString(this.undelegatedSecondaryExposures));
        sb2.append(", isDeviceBased=");
        sb2.append(this.isDeviceBased);
        sb2.append(", isUserInExperiment=");
        sb2.append(this.isUserInExperiment);
        sb2.append(", isExperimentActive=");
        sb2.append(this.isExperimentActive);
        sb2.append(", allocatedExperimentName=");
        sb2.append((Object) this.allocatedExperimentName);
        sb2.append(", explicitParameters=");
        return AbstractC9306j0.m9892k(sb2, Arrays.toString(this.explicitParameters), ')');
    }

    public /* synthetic */ APIDynamicConfig(String str, Map map, String str2, String str3, Map[] mapArr, Map[] mapArr2, boolean z6, boolean z10, boolean z11, String str4, String[] strArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? new Map[0] : mapArr, (i10 & 32) != 0 ? new Map[0] : mapArr2, (i10 & 64) != 0 ? false : z6, (i10 & 128) != 0 ? false : z10, (i10 & 256) != 0 ? false : z11, (i10 & 512) != 0 ? null : str4, (i10 & 1024) != 0 ? new String[0] : strArr);
    }
}
