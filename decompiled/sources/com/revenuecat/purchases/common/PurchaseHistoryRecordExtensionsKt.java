package com.revenuecat.purchases.common;

import com.android.billingclient.api.PurchaseHistoryRecord;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import org.json.JSONObject;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\u0002H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m18067d2 = {"firstSku", "", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "getFirstSku", "(Lcom/android/billingclient/api/PurchaseHistoryRecord;)Ljava/lang/String;", "listOfSkus", "Ljava/util/ArrayList;", "getListOfSkus", "(Lcom/android/billingclient/api/PurchaseHistoryRecord;)Ljava/util/ArrayList;", "toHumanReadableDescription", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PurchaseHistoryRecordExtensionsKt {
    public static final String getFirstSku(PurchaseHistoryRecord purchaseHistoryRecord) {
        AbstractC16544l.m18094g(purchaseHistoryRecord, "<this>");
        Object obj = purchaseHistoryRecord.m13150a().get(0);
        if (purchaseHistoryRecord.m13150a().size() > 1) {
            LogWrapperKt.log(LogIntent.GOOGLE_WARNING, "There's more than one sku in the PurchaseHistoryRecord, but only one will be used.");
        }
        AbstractC16544l.m18093f(obj, "skus[0].also {\n        i…_ONE_SKU)\n        }\n    }");
        return (String) obj;
    }

    public static final ArrayList<String> getListOfSkus(PurchaseHistoryRecord purchaseHistoryRecord) {
        AbstractC16544l.m18094g(purchaseHistoryRecord, "<this>");
        return purchaseHistoryRecord.m13150a();
    }

    public static final String toHumanReadableDescription(PurchaseHistoryRecord purchaseHistoryRecord) {
        AbstractC16544l.m18094g(purchaseHistoryRecord, "<this>");
        StringBuilder sb2 = new StringBuilder("skus: ");
        sb2.append(AbstractC17680n.m19349Y(purchaseHistoryRecord.m13150a(), null, "[", "]", 0, null, null, 57));
        sb2.append(", purchaseTime: ");
        JSONObject jSONObject = purchaseHistoryRecord.f35955c;
        sb2.append(jSONObject.optLong("purchaseTime"));
        sb2.append(", purchaseToken: ");
        sb2.append(jSONObject.optString("token", jSONObject.optString("purchaseToken")));
        return sb2.toString();
    }
}
