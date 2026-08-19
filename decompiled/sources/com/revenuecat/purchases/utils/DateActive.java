package com.revenuecat.purchases.utils;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p228J.AbstractC3794B0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007¨\u0006\u0011"}, m18067d2 = {"Lcom/revenuecat/purchases/utils/DateActive;", "", "isActive", "", "inGracePeriod", "(ZZ)V", "getInGracePeriod", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class DateActive {
    private final boolean inGracePeriod;
    private final boolean isActive;

    public DateActive(boolean z6, boolean z10) {
        this.isActive = z6;
        this.inGracePeriod = z10;
    }

    public static /* synthetic */ DateActive copy$default(DateActive dateActive, boolean z6, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = dateActive.isActive;
        }
        if ((i10 & 2) != 0) {
            z10 = dateActive.inGracePeriod;
        }
        return dateActive.copy(z6, z10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getInGracePeriod() {
        return this.inGracePeriod;
    }

    public final DateActive copy(boolean isActive, boolean inGracePeriod) {
        return new DateActive(isActive, inGracePeriod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DateActive)) {
            return false;
        }
        DateActive dateActive = (DateActive) other;
        return this.isActive == dateActive.isActive && this.inGracePeriod == dateActive.inGracePeriod;
    }

    public final boolean getInGracePeriod() {
        return this.inGracePeriod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z6 = this.isActive;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = r6 * 31;
        boolean z10 = this.inGracePeriod;
        return i10 + (z10 ? 1 : z10);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DateActive(isActive=");
        sb2.append(this.isActive);
        sb2.append(", inGracePeriod=");
        return AbstractC3794B0.m4499x(sb2, this.inGracePeriod, ')');
    }
}
