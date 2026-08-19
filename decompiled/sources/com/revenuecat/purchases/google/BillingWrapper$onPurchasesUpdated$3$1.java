package com.revenuecat.purchases.google;

import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.common.PurchaseExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18067d2 = {"<anonymous>", "", "it", "Lcom/android/billingclient/api/Purchase;", "invoke"}, m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class BillingWrapper$onPurchasesUpdated$3$1 extends AbstractC16546n implements InterfaceC1436k {
    public static final BillingWrapper$onPurchasesUpdated$3$1 INSTANCE = new BillingWrapper$onPurchasesUpdated$3$1();

    public BillingWrapper$onPurchasesUpdated$3$1() {
        super(1);
    }

    @Override // p049Bm.InterfaceC1436k
    public final CharSequence invoke(Purchase it) {
        AbstractC16544l.m18094g(it, "it");
        return PurchaseExtensionsKt.toHumanReadableDescription(it);
    }
}
