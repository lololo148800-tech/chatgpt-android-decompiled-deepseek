package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.PostReceiptInitiationSource;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/revenuecat/purchases/google/usecase/ConsumePurchaseUseCaseParams;", "Lcom/revenuecat/purchases/google/usecase/UseCaseParams;", "purchaseToken", "", "initiationSource", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "appInBackground", "", "(Ljava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Z)V", "getAppInBackground", "()Z", "getInitiationSource", "()Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "getPurchaseToken", "()Ljava/lang/String;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ConsumePurchaseUseCaseParams implements UseCaseParams {
    private final boolean appInBackground;
    private final PostReceiptInitiationSource initiationSource;
    private final String purchaseToken;

    public ConsumePurchaseUseCaseParams(String purchaseToken, PostReceiptInitiationSource initiationSource, boolean z6) {
        AbstractC16544l.m18094g(purchaseToken, "purchaseToken");
        AbstractC16544l.m18094g(initiationSource, "initiationSource");
        this.purchaseToken = purchaseToken;
        this.initiationSource = initiationSource;
        this.appInBackground = z6;
    }

    @Override // com.revenuecat.purchases.google.usecase.UseCaseParams
    public boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final PostReceiptInitiationSource getInitiationSource() {
        return this.initiationSource;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }
}
