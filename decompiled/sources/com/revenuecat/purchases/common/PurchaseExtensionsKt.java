package com.revenuecat.purchases.common;

import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m18067d2 = {"firstProductId", "", "Lcom/android/billingclient/api/Purchase;", "getFirstProductId", "(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;", "toHumanReadableDescription", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PurchaseExtensionsKt {
    public static final String getFirstProductId(Purchase purchase) {
        AbstractC16544l.m18094g(purchase, "<this>");
        Object obj = purchase.m13148a().get(0);
        if (purchase.m13148a().size() > 1) {
            LogWrapperKt.log(LogIntent.GOOGLE_WARNING, "There's more than one sku in the PurchaseHistoryRecord, but only one will be used.");
        }
        AbstractC16544l.m18093f(obj, "products[0].also {\n     …_ONE_SKU)\n        }\n    }");
        return (String) obj;
    }

    public static final String toHumanReadableDescription(Purchase purchase) {
        AbstractC16544l.m18094g(purchase, "<this>");
        StringBuilder sb2 = new StringBuilder("productIds: ");
        sb2.append(AbstractC17680n.m19349Y(purchase.m13148a(), null, "[", "]", 0, null, null, 57));
        sb2.append(", orderId: ");
        String strOptString = purchase.f35952c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = null;
        }
        sb2.append(strOptString);
        sb2.append(", purchaseToken: ");
        sb2.append(purchase.m13149b());
        return sb2.toString();
    }
}
