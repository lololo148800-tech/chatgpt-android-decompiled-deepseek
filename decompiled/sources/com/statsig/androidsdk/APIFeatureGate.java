package com.statsig.androidsdk;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p003A1.AbstractC0168G;
import p240Jb.InterfaceC4325b;
import sj.hJY.CsqksqyPE;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010$\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\"\u0010\u001b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jb\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR,\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m18067d2 = {"Lcom/statsig/androidsdk/APIFeatureGate;", "", DiagnosticsEntry.NAME_KEY, "", "value", "", "ruleID", "groupName", "secondaryExposures", "", "", "idType", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;[Ljava/util/Map;Ljava/lang/String;)V", "getGroupName", "()Ljava/lang/String;", "getIdType", "getName", "getRuleID", "getSecondaryExposures", "()[Ljava/util/Map;", "[Ljava/util/Map;", "getValue", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;[Ljava/util/Map;Ljava/lang/String;)Lcom/statsig/androidsdk/APIFeatureGate;", "equals", "other", "hashCode", "", "toString", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class APIFeatureGate {

    @InterfaceC4325b("group_name")
    private final String groupName;

    @InterfaceC4325b("id_type")
    private final String idType;

    @InterfaceC4325b(DiagnosticsEntry.NAME_KEY)
    private final String name;

    @InterfaceC4325b("rule_id")
    private final String ruleID;

    @InterfaceC4325b("secondary_exposures")
    private final Map<String, String>[] secondaryExposures;

    @InterfaceC4325b("value")
    private final boolean value;

    public APIFeatureGate(String str, boolean z6, String ruleID, String str2, Map<String, String>[] mapArr, String str3) {
        AbstractC16544l.m18094g(str, CsqksqyPE.MaI);
        AbstractC16544l.m18094g(ruleID, "ruleID");
        this.name = str;
        this.value = z6;
        this.ruleID = ruleID;
        this.groupName = str2;
        this.secondaryExposures = mapArr;
        this.idType = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ APIFeatureGate copy$default(APIFeatureGate aPIFeatureGate, String str, boolean z6, String str2, String str3, Map[] mapArr, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aPIFeatureGate.name;
        }
        if ((i10 & 2) != 0) {
            z6 = aPIFeatureGate.value;
        }
        boolean z10 = z6;
        if ((i10 & 4) != 0) {
            str2 = aPIFeatureGate.ruleID;
        }
        String str5 = str2;
        if ((i10 & 8) != 0) {
            str3 = aPIFeatureGate.groupName;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            mapArr = aPIFeatureGate.secondaryExposures;
        }
        Map[] mapArr2 = mapArr;
        if ((i10 & 32) != 0) {
            str4 = aPIFeatureGate.idType;
        }
        return aPIFeatureGate.copy(str, z10, str5, str6, mapArr2, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getValue() {
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

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIdType() {
        return this.idType;
    }

    public final APIFeatureGate copy(String name, boolean value, String ruleID, String groupName, Map<String, String>[] secondaryExposures, String idType) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(ruleID, "ruleID");
        return new APIFeatureGate(name, value, ruleID, groupName, secondaryExposures, idType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APIFeatureGate)) {
            return false;
        }
        APIFeatureGate aPIFeatureGate = (APIFeatureGate) other;
        return AbstractC16544l.m18089b(this.name, aPIFeatureGate.name) && this.value == aPIFeatureGate.value && AbstractC16544l.m18089b(this.ruleID, aPIFeatureGate.ruleID) && AbstractC16544l.m18089b(this.groupName, aPIFeatureGate.groupName) && AbstractC16544l.m18089b(this.secondaryExposures, aPIFeatureGate.secondaryExposures) && AbstractC16544l.m18089b(this.idType, aPIFeatureGate.idType);
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final String getIdType() {
        return this.idType;
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

    public final boolean getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        boolean z6 = this.value;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int iM527p = AbstractC0168G.m527p((iHashCode + r6) * 31, 31, this.ruleID);
        String str = this.groupName;
        int iHashCode2 = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String>[] mapArr = this.secondaryExposures;
        int iHashCode3 = (iHashCode2 + (mapArr == null ? 0 : Arrays.hashCode(mapArr))) * 31;
        String str2 = this.idType;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "APIFeatureGate(name=" + this.name + ", value=" + this.value + ", ruleID=" + this.ruleID + ", groupName=" + ((Object) this.groupName) + ", secondaryExposures=" + Arrays.toString(this.secondaryExposures) + ", idType=" + ((Object) this.idType) + ')';
    }

    public /* synthetic */ APIFeatureGate(String str, boolean z6, String str2, String str3, Map[] mapArr, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? false : z6, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? new Map[0] : mapArr, (i10 & 32) == 0 ? str4 : null);
    }
}
