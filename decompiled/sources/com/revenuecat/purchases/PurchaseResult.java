package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p160G5.p161rK.TVCuK;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchaseResult;", "", "storeTransaction", "Lcom/revenuecat/purchases/models/StoreTransaction;", "customerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/CustomerInfo;)V", "getCustomerInfo", "()Lcom/revenuecat/purchases/CustomerInfo;", "getStoreTransaction", "()Lcom/revenuecat/purchases/models/StoreTransaction;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class PurchaseResult {
    private final CustomerInfo customerInfo;
    private final StoreTransaction storeTransaction;

    public PurchaseResult(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        AbstractC16544l.m18094g(storeTransaction, "storeTransaction");
        AbstractC16544l.m18094g(customerInfo, "customerInfo");
        this.storeTransaction = storeTransaction;
        this.customerInfo = customerInfo;
    }

    public static /* synthetic */ PurchaseResult copy$default(PurchaseResult purchaseResult, StoreTransaction storeTransaction, CustomerInfo customerInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            storeTransaction = purchaseResult.storeTransaction;
        }
        if ((i10 & 2) != 0) {
            customerInfo = purchaseResult.customerInfo;
        }
        return purchaseResult.copy(storeTransaction, customerInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StoreTransaction getStoreTransaction() {
        return this.storeTransaction;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    public final PurchaseResult copy(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        AbstractC16544l.m18094g(storeTransaction, "storeTransaction");
        AbstractC16544l.m18094g(customerInfo, "customerInfo");
        return new PurchaseResult(storeTransaction, customerInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseResult)) {
            return false;
        }
        PurchaseResult purchaseResult = (PurchaseResult) other;
        return AbstractC16544l.m18089b(this.storeTransaction, purchaseResult.storeTransaction) && AbstractC16544l.m18089b(this.customerInfo, purchaseResult.customerInfo);
    }

    public final CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    public final StoreTransaction getStoreTransaction() {
        return this.storeTransaction;
    }

    public int hashCode() {
        return this.customerInfo.hashCode() + (this.storeTransaction.hashCode() * 31);
    }

    public String toString() {
        return TVCuK.avLd + this.storeTransaction + ", customerInfo=" + this.customerInfo + ')';
    }
}
