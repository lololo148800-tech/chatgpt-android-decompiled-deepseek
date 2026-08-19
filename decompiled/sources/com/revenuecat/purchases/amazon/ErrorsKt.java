package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import org.json.JSONObject;
import p882m1.clb.WGTYqNchEpHca;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, m18067d2 = {"errorGettingReceiptInfo", "Lcom/revenuecat/purchases/PurchasesError;", "error", "missingTermSkuError", "response", "Lorg/json/JSONObject;", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ErrorsKt {
    public static final PurchasesError errorGettingReceiptInfo(PurchasesError error) {
        AbstractC16544l.m18094g(error, "error");
        return new PurchasesError(PurchasesErrorCode.InvalidReceiptError, "Couldn't get Amazon receipt data from RevenueCat backend. Error: " + error);
    }

    public static final PurchasesError missingTermSkuError(JSONObject jSONObject) {
        AbstractC16544l.m18094g(jSONObject, WGTYqNchEpHca.ZsioX);
        return new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, "Amazon receipt data response is missing termSku. Response:\n" + jSONObject);
    }
}
