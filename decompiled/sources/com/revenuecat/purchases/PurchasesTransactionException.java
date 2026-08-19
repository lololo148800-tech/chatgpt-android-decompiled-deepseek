package com.revenuecat.purchases;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesTransactionException;", "Lcom/revenuecat/purchases/PurchasesException;", "purchasesError", "Lcom/revenuecat/purchases/PurchasesError;", "userCancelled", "", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "getUserCancelled", "()Z", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PurchasesTransactionException extends PurchasesException {
    private final boolean userCancelled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesTransactionException(PurchasesError purchasesError, boolean z6) {
        super(purchasesError);
        AbstractC16544l.m18094g(purchasesError, "purchasesError");
        this.userCancelled = z6;
    }

    public final boolean getUserCancelled() {
        return this.userCancelled;
    }
}
