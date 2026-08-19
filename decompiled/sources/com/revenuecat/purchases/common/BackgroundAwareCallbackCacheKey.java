package com.revenuecat.purchases.common;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p228J.AbstractC3794B0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m18067d2 = {"Lcom/revenuecat/purchases/common/BackgroundAwareCallbackCacheKey;", "", "cacheKey", "", "", "appInBackground", "", "(Ljava/util/List;Z)V", "getAppInBackground", "()Z", "getCacheKey", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class BackgroundAwareCallbackCacheKey {
    private final boolean appInBackground;
    private final List<String> cacheKey;

    public BackgroundAwareCallbackCacheKey(List<String> cacheKey, boolean z6) {
        AbstractC16544l.m18094g(cacheKey, "cacheKey");
        this.cacheKey = cacheKey;
        this.appInBackground = z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BackgroundAwareCallbackCacheKey copy$default(BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey, List list, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = backgroundAwareCallbackCacheKey.cacheKey;
        }
        if ((i10 & 2) != 0) {
            z6 = backgroundAwareCallbackCacheKey.appInBackground;
        }
        return backgroundAwareCallbackCacheKey.copy(list, z6);
    }

    public final List<String> component1() {
        return this.cacheKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final BackgroundAwareCallbackCacheKey copy(List<String> cacheKey, boolean appInBackground) {
        AbstractC16544l.m18094g(cacheKey, "cacheKey");
        return new BackgroundAwareCallbackCacheKey(cacheKey, appInBackground);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackgroundAwareCallbackCacheKey)) {
            return false;
        }
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey = (BackgroundAwareCallbackCacheKey) other;
        return AbstractC16544l.m18089b(this.cacheKey, backgroundAwareCallbackCacheKey.cacheKey) && this.appInBackground == backgroundAwareCallbackCacheKey.appInBackground;
    }

    public final boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final List<String> getCacheKey() {
        return this.cacheKey;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.cacheKey.hashCode() * 31;
        boolean z6 = this.appInBackground;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        return iHashCode + r6;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BackgroundAwareCallbackCacheKey(cacheKey=");
        sb2.append(this.cacheKey);
        sb2.append(", appInBackground=");
        return AbstractC3794B0.m4499x(sb2, this.appInBackground, ')');
    }
}
