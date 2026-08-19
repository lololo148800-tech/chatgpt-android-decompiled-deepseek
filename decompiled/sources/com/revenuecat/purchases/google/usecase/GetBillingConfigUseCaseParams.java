package com.revenuecat.purchases.google.usecase;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p228J.AbstractC3794B0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m18067d2 = {"Lcom/revenuecat/purchases/google/usecase/GetBillingConfigUseCaseParams;", "Lcom/revenuecat/purchases/google/usecase/UseCaseParams;", "appInBackground", "", "(Z)V", "getAppInBackground", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class GetBillingConfigUseCaseParams implements UseCaseParams {
    private final boolean appInBackground;

    public GetBillingConfigUseCaseParams(boolean z6) {
        this.appInBackground = z6;
    }

    public static /* synthetic */ GetBillingConfigUseCaseParams copy$default(GetBillingConfigUseCaseParams getBillingConfigUseCaseParams, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = getBillingConfigUseCaseParams.appInBackground;
        }
        return getBillingConfigUseCaseParams.copy(z6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final GetBillingConfigUseCaseParams copy(boolean appInBackground) {
        return new GetBillingConfigUseCaseParams(appInBackground);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetBillingConfigUseCaseParams) && this.appInBackground == ((GetBillingConfigUseCaseParams) other).appInBackground;
    }

    @Override // com.revenuecat.purchases.google.usecase.UseCaseParams
    public boolean getAppInBackground() {
        return this.appInBackground;
    }

    public int hashCode() {
        boolean z6 = this.appInBackground;
        if (z6) {
            return 1;
        }
        return z6 ? 1 : 0;
    }

    public String toString() {
        return AbstractC3794B0.m4499x(new StringBuilder("GetBillingConfigUseCaseParams(appInBackground="), this.appInBackground, ')');
    }
}
