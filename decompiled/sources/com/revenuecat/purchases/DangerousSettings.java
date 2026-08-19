package com.revenuecat.purchases;

import com.revenuecat.purchases.api.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p228J.AbstractC3794B0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u000b\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\fJ\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m18067d2 = {"Lcom/revenuecat/purchases/DangerousSettings;", "", "autoSyncPurchases", "", "(Z)V", BuildConfig.FLAVOR, "(ZZ)V", "getAutoSyncPurchases", "()Z", "getCustomEntitlementComputation$purchases_customEntitlementComputationRelease", "component1", "component2", "component2$purchases_customEntitlementComputationRelease", "copy", "equals", "other", "hashCode", "", "toString", "", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class DangerousSettings {
    private final boolean autoSyncPurchases;
    private final boolean customEntitlementComputation;

    /* JADX WARN: Illegal instructions before constructor call */
    public DangerousSettings() {
        boolean z6 = false;
        this(z6, z6, 3, null);
    }

    public static /* synthetic */ DangerousSettings copy$default(DangerousSettings dangerousSettings, boolean z6, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = dangerousSettings.autoSyncPurchases;
        }
        if ((i10 & 2) != 0) {
            z10 = dangerousSettings.customEntitlementComputation;
        }
        return dangerousSettings.copy(z6, z10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAutoSyncPurchases() {
        return this.autoSyncPurchases;
    }

    /* JADX INFO: renamed from: component2$purchases_customEntitlementComputationRelease, reason: from getter */
    public final boolean getCustomEntitlementComputation() {
        return this.customEntitlementComputation;
    }

    public final DangerousSettings copy(boolean autoSyncPurchases, boolean customEntitlementComputation) {
        return new DangerousSettings(autoSyncPurchases, customEntitlementComputation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DangerousSettings)) {
            return false;
        }
        DangerousSettings dangerousSettings = (DangerousSettings) other;
        return this.autoSyncPurchases == dangerousSettings.autoSyncPurchases && this.customEntitlementComputation == dangerousSettings.customEntitlementComputation;
    }

    public final boolean getAutoSyncPurchases() {
        return this.autoSyncPurchases;
    }

    /* JADX INFO: renamed from: getCustomEntitlementComputation$purchases_customEntitlementComputationRelease */
    public final boolean m14407x834cae6c() {
        return this.customEntitlementComputation;
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
        boolean z6 = this.autoSyncPurchases;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = r6 * 31;
        boolean z10 = this.customEntitlementComputation;
        return i10 + (z10 ? 1 : z10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DangerousSettings(autoSyncPurchases=");
        sb2.append(this.autoSyncPurchases);
        sb2.append(", customEntitlementComputation=");
        return AbstractC3794B0.m4499x(sb2, this.customEntitlementComputation, ')');
    }

    public DangerousSettings(boolean z6, boolean z10) {
        this.autoSyncPurchases = z6;
        this.customEntitlementComputation = z10;
    }

    public /* synthetic */ DangerousSettings(boolean z6, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z6, (i10 & 2) != 0 ? false : z10);
    }

    public DangerousSettings(boolean z6) {
        this(z6, false);
    }

    public /* synthetic */ DangerousSettings(boolean z6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z6);
    }
}
