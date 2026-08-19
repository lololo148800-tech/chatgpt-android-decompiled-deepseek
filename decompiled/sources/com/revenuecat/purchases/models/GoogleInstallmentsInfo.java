package com.revenuecat.purchases.models;

import com.google.protobuf.AbstractC12107L1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m18067d2 = {"Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "Lcom/revenuecat/purchases/models/InstallmentsInfo;", "commitmentPaymentsCount", "", "renewalCommitmentPaymentsCount", "(II)V", "getCommitmentPaymentsCount", "()I", "getRenewalCommitmentPaymentsCount", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class GoogleInstallmentsInfo implements InstallmentsInfo {
    private final int commitmentPaymentsCount;
    private final int renewalCommitmentPaymentsCount;

    public GoogleInstallmentsInfo(int i10, int i11) {
        this.commitmentPaymentsCount = i10;
        this.renewalCommitmentPaymentsCount = i11;
    }

    public static /* synthetic */ GoogleInstallmentsInfo copy$default(GoogleInstallmentsInfo googleInstallmentsInfo, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = googleInstallmentsInfo.commitmentPaymentsCount;
        }
        if ((i12 & 2) != 0) {
            i11 = googleInstallmentsInfo.renewalCommitmentPaymentsCount;
        }
        return googleInstallmentsInfo.copy(i10, i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCommitmentPaymentsCount() {
        return this.commitmentPaymentsCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRenewalCommitmentPaymentsCount() {
        return this.renewalCommitmentPaymentsCount;
    }

    public final GoogleInstallmentsInfo copy(int commitmentPaymentsCount, int renewalCommitmentPaymentsCount) {
        return new GoogleInstallmentsInfo(commitmentPaymentsCount, renewalCommitmentPaymentsCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoogleInstallmentsInfo)) {
            return false;
        }
        GoogleInstallmentsInfo googleInstallmentsInfo = (GoogleInstallmentsInfo) other;
        return this.commitmentPaymentsCount == googleInstallmentsInfo.commitmentPaymentsCount && this.renewalCommitmentPaymentsCount == googleInstallmentsInfo.renewalCommitmentPaymentsCount;
    }

    @Override // com.revenuecat.purchases.models.InstallmentsInfo
    public int getCommitmentPaymentsCount() {
        return this.commitmentPaymentsCount;
    }

    @Override // com.revenuecat.purchases.models.InstallmentsInfo
    public int getRenewalCommitmentPaymentsCount() {
        return this.renewalCommitmentPaymentsCount;
    }

    public int hashCode() {
        return (this.commitmentPaymentsCount * 31) + this.renewalCommitmentPaymentsCount;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GoogleInstallmentsInfo(commitmentPaymentsCount=");
        sb2.append(this.commitmentPaymentsCount);
        sb2.append(", renewalCommitmentPaymentsCount=");
        return AbstractC12107L1.m13826q(sb2, this.renewalCommitmentPaymentsCount, ')');
    }
}
