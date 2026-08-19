package com.statsig.androidsdk;

import com.google.protobuf.AbstractC12107L1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p011A9.p012Ra.ahZQMZ;
import p240Jb.InterfaceC4325b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m18067d2 = {"Lcom/statsig/androidsdk/DeprecatedStickyUserExperiments;", "", "userID", "", "experiments", "", "Lcom/statsig/androidsdk/APIDynamicConfig;", "(Ljava/lang/String;Ljava/util/Map;)V", "getExperiments", "()Ljava/util/Map;", "getUserID", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class DeprecatedStickyUserExperiments {

    @InterfaceC4325b("values")
    private final Map<String, APIDynamicConfig> experiments;

    @InterfaceC4325b("user_id")
    private final String userID;

    public DeprecatedStickyUserExperiments(String str, Map<String, APIDynamicConfig> experiments) {
        AbstractC16544l.m18094g(experiments, "experiments");
        this.userID = str;
        this.experiments = experiments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeprecatedStickyUserExperiments copy$default(DeprecatedStickyUserExperiments deprecatedStickyUserExperiments, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deprecatedStickyUserExperiments.userID;
        }
        if ((i10 & 2) != 0) {
            map = deprecatedStickyUserExperiments.experiments;
        }
        return deprecatedStickyUserExperiments.copy(str, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserID() {
        return this.userID;
    }

    public final Map<String, APIDynamicConfig> component2() {
        return this.experiments;
    }

    public final DeprecatedStickyUserExperiments copy(String userID, Map<String, APIDynamicConfig> experiments) {
        AbstractC16544l.m18094g(experiments, "experiments");
        return new DeprecatedStickyUserExperiments(userID, experiments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeprecatedStickyUserExperiments)) {
            return false;
        }
        DeprecatedStickyUserExperiments deprecatedStickyUserExperiments = (DeprecatedStickyUserExperiments) other;
        return AbstractC16544l.m18089b(this.userID, deprecatedStickyUserExperiments.userID) && AbstractC16544l.m18089b(this.experiments, deprecatedStickyUserExperiments.experiments);
    }

    public final Map<String, APIDynamicConfig> getExperiments() {
        return this.experiments;
    }

    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        String str = this.userID;
        return this.experiments.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeprecatedStickyUserExperiments(userID=");
        sb2.append((Object) this.userID);
        sb2.append(ahZQMZ.SNrWxUi);
        return AbstractC12107L1.m13827r(sb2, this.experiments, ')');
    }
}
