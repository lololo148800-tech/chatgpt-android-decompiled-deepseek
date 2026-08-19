package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p228J.AbstractC3794B0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\fHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m18067d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCaseParams;", "Lcom/revenuecat/purchases/google/usecase/UseCaseParams;", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "productIds", "", "", "productType", "Lcom/revenuecat/purchases/ProductType;", "appInBackground", "", "(Lcom/revenuecat/purchases/common/DateProvider;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Ljava/util/Set;Lcom/revenuecat/purchases/ProductType;Z)V", "getAppInBackground", "()Z", "getDateProvider", "()Lcom/revenuecat/purchases/common/DateProvider;", "getDiagnosticsTrackerIfEnabled", "()Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "getProductIds", "()Ljava/util/Set;", "getProductType", "()Lcom/revenuecat/purchases/ProductType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class QueryProductDetailsUseCaseParams implements UseCaseParams {
    private final boolean appInBackground;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Set<String> productIds;
    private final ProductType productType;

    public QueryProductDetailsUseCaseParams(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, Set<String> productIds, ProductType productType, boolean z6) {
        AbstractC16544l.m18094g(dateProvider, "dateProvider");
        AbstractC16544l.m18094g(productIds, "productIds");
        AbstractC16544l.m18094g(productType, "productType");
        this.dateProvider = dateProvider;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.productIds = productIds;
        this.productType = productType;
        this.appInBackground = z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryProductDetailsUseCaseParams copy$default(QueryProductDetailsUseCaseParams queryProductDetailsUseCaseParams, DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, Set set, ProductType productType, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dateProvider = queryProductDetailsUseCaseParams.dateProvider;
        }
        if ((i10 & 2) != 0) {
            diagnosticsTracker = queryProductDetailsUseCaseParams.diagnosticsTrackerIfEnabled;
        }
        DiagnosticsTracker diagnosticsTracker2 = diagnosticsTracker;
        if ((i10 & 4) != 0) {
            set = queryProductDetailsUseCaseParams.productIds;
        }
        Set set2 = set;
        if ((i10 & 8) != 0) {
            productType = queryProductDetailsUseCaseParams.productType;
        }
        ProductType productType2 = productType;
        if ((i10 & 16) != 0) {
            z6 = queryProductDetailsUseCaseParams.appInBackground;
        }
        return queryProductDetailsUseCaseParams.copy(dateProvider, diagnosticsTracker2, set2, productType2, z6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DateProvider getDateProvider() {
        return this.dateProvider;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DiagnosticsTracker getDiagnosticsTrackerIfEnabled() {
        return this.diagnosticsTrackerIfEnabled;
    }

    public final Set<String> component3() {
        return this.productIds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ProductType getProductType() {
        return this.productType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final QueryProductDetailsUseCaseParams copy(DateProvider dateProvider, DiagnosticsTracker diagnosticsTrackerIfEnabled, Set<String> productIds, ProductType productType, boolean appInBackground) {
        AbstractC16544l.m18094g(dateProvider, "dateProvider");
        AbstractC16544l.m18094g(productIds, "productIds");
        AbstractC16544l.m18094g(productType, "productType");
        return new QueryProductDetailsUseCaseParams(dateProvider, diagnosticsTrackerIfEnabled, productIds, productType, appInBackground);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryProductDetailsUseCaseParams)) {
            return false;
        }
        QueryProductDetailsUseCaseParams queryProductDetailsUseCaseParams = (QueryProductDetailsUseCaseParams) other;
        return AbstractC16544l.m18089b(this.dateProvider, queryProductDetailsUseCaseParams.dateProvider) && AbstractC16544l.m18089b(this.diagnosticsTrackerIfEnabled, queryProductDetailsUseCaseParams.diagnosticsTrackerIfEnabled) && AbstractC16544l.m18089b(this.productIds, queryProductDetailsUseCaseParams.productIds) && this.productType == queryProductDetailsUseCaseParams.productType && this.appInBackground == queryProductDetailsUseCaseParams.appInBackground;
    }

    @Override // com.revenuecat.purchases.google.usecase.UseCaseParams
    public boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final DateProvider getDateProvider() {
        return this.dateProvider;
    }

    public final DiagnosticsTracker getDiagnosticsTrackerIfEnabled() {
        return this.diagnosticsTrackerIfEnabled;
    }

    public final Set<String> getProductIds() {
        return this.productIds;
    }

    public final ProductType getProductType() {
        return this.productType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = this.dateProvider.hashCode() * 31;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        int iHashCode2 = (this.productType.hashCode() + ((this.productIds.hashCode() + ((iHashCode + (diagnosticsTracker == null ? 0 : diagnosticsTracker.hashCode())) * 31)) * 31)) * 31;
        boolean z6 = this.appInBackground;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        return iHashCode2 + r6;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("QueryProductDetailsUseCaseParams(dateProvider=");
        sb2.append(this.dateProvider);
        sb2.append(", diagnosticsTrackerIfEnabled=");
        sb2.append(this.diagnosticsTrackerIfEnabled);
        sb2.append(", productIds=");
        sb2.append(this.productIds);
        sb2.append(", productType=");
        sb2.append(this.productType);
        sb2.append(", appInBackground=");
        return AbstractC3794B0.m4499x(sb2, this.appInBackground, ')');
    }

    public /* synthetic */ QueryProductDetailsUseCaseParams(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, Set set, ProductType productType, boolean z6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new DefaultDateProvider() : dateProvider, diagnosticsTracker, set, productType, z6);
    }
}
