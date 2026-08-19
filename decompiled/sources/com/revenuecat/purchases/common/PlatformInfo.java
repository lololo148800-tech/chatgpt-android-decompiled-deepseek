package com.revenuecat.purchases.common;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m18067d2 = {"Lcom/revenuecat/purchases/common/PlatformInfo;", "", "flavor", "", "version", "(Ljava/lang/String;Ljava/lang/String;)V", "getFlavor", "()Ljava/lang/String;", "getVersion", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class PlatformInfo {
    private final String flavor;
    private final String version;

    public PlatformInfo(String flavor, String str) {
        AbstractC16544l.m18094g(flavor, "flavor");
        this.flavor = flavor;
        this.version = str;
    }

    public static /* synthetic */ PlatformInfo copy$default(PlatformInfo platformInfo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = platformInfo.flavor;
        }
        if ((i10 & 2) != 0) {
            str2 = platformInfo.version;
        }
        return platformInfo.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFlavor() {
        return this.flavor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final PlatformInfo copy(String flavor, String version) {
        AbstractC16544l.m18094g(flavor, "flavor");
        return new PlatformInfo(flavor, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlatformInfo)) {
            return false;
        }
        PlatformInfo platformInfo = (PlatformInfo) other;
        return AbstractC16544l.m18089b(this.flavor, platformInfo.flavor) && AbstractC16544l.m18089b(this.version, platformInfo.version);
    }

    public final String getFlavor() {
        return this.flavor;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = this.flavor.hashCode() * 31;
        String str = this.version;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PlatformInfo(flavor=");
        sb2.append(this.flavor);
        sb2.append(", version=");
        return AbstractC9306j0.m9892k(sb2, this.version, ')');
    }
}
