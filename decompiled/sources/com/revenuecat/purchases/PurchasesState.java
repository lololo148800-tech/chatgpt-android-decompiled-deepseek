package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p1071w0.AbstractC20734X;
import p228J.AbstractC3794B0;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JP\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesState;", "", "allowSharingPlayStoreAccount", "", "purchaseCallbacksByProductId", "", "", "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "deprecatedProductChangeCallback", "Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "appInBackground", "firstTimeInForeground", "(Ljava/lang/Boolean;Ljava/util/Map;Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;ZZ)V", "getAllowSharingPlayStoreAccount", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAppInBackground", "()Z", "getDeprecatedProductChangeCallback", "()Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "getFirstTimeInForeground", "getPurchaseCallbacksByProductId", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/util/Map;Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;ZZ)Lcom/revenuecat/purchases/PurchasesState;", "equals", "other", "hashCode", "", "toString", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class PurchasesState {
    private final Boolean allowSharingPlayStoreAccount;
    private final boolean appInBackground;
    private final ProductChangeCallback deprecatedProductChangeCallback;
    private final boolean firstTimeInForeground;
    private final Map<String, PurchaseCallback> purchaseCallbacksByProductId;

    public PurchasesState() {
        this(null, null, null, false, false, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PurchasesState copy$default(PurchasesState purchasesState, Boolean bool, Map map, ProductChangeCallback productChangeCallback, boolean z6, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = purchasesState.allowSharingPlayStoreAccount;
        }
        if ((i10 & 2) != 0) {
            map = purchasesState.purchaseCallbacksByProductId;
        }
        Map map2 = map;
        if ((i10 & 4) != 0) {
            productChangeCallback = purchasesState.deprecatedProductChangeCallback;
        }
        ProductChangeCallback productChangeCallback2 = productChangeCallback;
        if ((i10 & 8) != 0) {
            z6 = purchasesState.appInBackground;
        }
        boolean z11 = z6;
        if ((i10 & 16) != 0) {
            z10 = purchasesState.firstTimeInForeground;
        }
        return purchasesState.copy(bool, map2, productChangeCallback2, z11, z10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAllowSharingPlayStoreAccount() {
        return this.allowSharingPlayStoreAccount;
    }

    public final Map<String, PurchaseCallback> component2() {
        return this.purchaseCallbacksByProductId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ProductChangeCallback getDeprecatedProductChangeCallback() {
        return this.deprecatedProductChangeCallback;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getAppInBackground() {
        return this.appInBackground;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getFirstTimeInForeground() {
        return this.firstTimeInForeground;
    }

    public final PurchasesState copy(Boolean allowSharingPlayStoreAccount, Map<String, ? extends PurchaseCallback> purchaseCallbacksByProductId, ProductChangeCallback deprecatedProductChangeCallback, boolean appInBackground, boolean firstTimeInForeground) {
        AbstractC16544l.m18094g(purchaseCallbacksByProductId, "purchaseCallbacksByProductId");
        return new PurchasesState(allowSharingPlayStoreAccount, purchaseCallbacksByProductId, deprecatedProductChangeCallback, appInBackground, firstTimeInForeground);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchasesState)) {
            return false;
        }
        PurchasesState purchasesState = (PurchasesState) other;
        return AbstractC16544l.m18089b(this.allowSharingPlayStoreAccount, purchasesState.allowSharingPlayStoreAccount) && AbstractC16544l.m18089b(this.purchaseCallbacksByProductId, purchasesState.purchaseCallbacksByProductId) && AbstractC16544l.m18089b(this.deprecatedProductChangeCallback, purchasesState.deprecatedProductChangeCallback) && this.appInBackground == purchasesState.appInBackground && this.firstTimeInForeground == purchasesState.firstTimeInForeground;
    }

    public final Boolean getAllowSharingPlayStoreAccount() {
        return this.allowSharingPlayStoreAccount;
    }

    public final boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final ProductChangeCallback getDeprecatedProductChangeCallback() {
        return this.deprecatedProductChangeCallback;
    }

    public final boolean getFirstTimeInForeground() {
        return this.firstTimeInForeground;
    }

    public final Map<String, PurchaseCallback> getPurchaseCallbacksByProductId() {
        return this.purchaseCallbacksByProductId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        Boolean bool = this.allowSharingPlayStoreAccount;
        int iM21250u = AbstractC20734X.m21250u((bool == null ? 0 : bool.hashCode()) * 31, 31, this.purchaseCallbacksByProductId);
        ProductChangeCallback productChangeCallback = this.deprecatedProductChangeCallback;
        int iHashCode = (iM21250u + (productChangeCallback != null ? productChangeCallback.hashCode() : 0)) * 31;
        boolean z6 = this.appInBackground;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = (iHashCode + r6) * 31;
        boolean z10 = this.firstTimeInForeground;
        return i10 + (z10 ? 1 : z10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PurchasesState(allowSharingPlayStoreAccount=");
        sb2.append(this.allowSharingPlayStoreAccount);
        sb2.append(", purchaseCallbacksByProductId=");
        sb2.append(this.purchaseCallbacksByProductId);
        sb2.append(", deprecatedProductChangeCallback=");
        sb2.append(this.deprecatedProductChangeCallback);
        sb2.append(", appInBackground=");
        sb2.append(this.appInBackground);
        sb2.append(", firstTimeInForeground=");
        return AbstractC3794B0.m4499x(sb2, this.firstTimeInForeground, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PurchasesState(Boolean bool, Map<String, ? extends PurchaseCallback> purchaseCallbacksByProductId, ProductChangeCallback productChangeCallback, boolean z6, boolean z10) {
        AbstractC16544l.m18094g(purchaseCallbacksByProductId, "purchaseCallbacksByProductId");
        this.allowSharingPlayStoreAccount = bool;
        this.purchaseCallbacksByProductId = purchaseCallbacksByProductId;
        this.deprecatedProductChangeCallback = productChangeCallback;
        this.appInBackground = z6;
        this.firstTimeInForeground = z10;
    }

    public /* synthetic */ PurchasesState(Boolean bool, Map map, ProductChangeCallback productChangeCallback, boolean z6, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? C17690x.f56481Y : map, (i10 & 4) == 0 ? productChangeCallback : null, (i10 & 8) != 0 ? true : z6, (i10 & 16) != 0 ? true : z10);
    }
}
