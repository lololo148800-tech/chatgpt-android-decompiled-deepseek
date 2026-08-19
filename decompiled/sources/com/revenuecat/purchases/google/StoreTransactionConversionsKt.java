package com.revenuecat.purchases.google;

import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchaseType;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\u0005\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007H\u0000\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0012"}, m18067d2 = {"originalGooglePurchase", "Lcom/android/billingclient/api/Purchase;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "getOriginalGooglePurchase", "(Lcom/revenuecat/purchases/models/StoreTransaction;)Lcom/android/billingclient/api/Purchase;", "toStoreTransaction", "productType", "Lcom/revenuecat/purchases/ProductType;", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "subscriptionOptionId", "", "replacementMode", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "purchaseContext", "Lcom/revenuecat/purchases/google/PurchaseContext;", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "type", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class StoreTransactionConversionsKt {
    public static final Purchase getOriginalGooglePurchase(StoreTransaction storeTransaction) {
        AbstractC16544l.m18094g(storeTransaction, "<this>");
        String signature = storeTransaction.getSignature();
        if (signature == null) {
            return null;
        }
        if (storeTransaction.getPurchaseType() != PurchaseType.GOOGLE_PURCHASE) {
            signature = null;
        }
        if (signature != null) {
            return new Purchase(storeTransaction.getOriginalJson().toString(), signature);
        }
        return null;
    }

    public static final StoreTransaction toStoreTransaction(Purchase purchase, ProductType productType, PresentedOfferingContext presentedOfferingContext, String str, GoogleReplacementMode googleReplacementMode) {
        AbstractC16544l.m18094g(purchase, "<this>");
        AbstractC16544l.m18094g(productType, "productType");
        JSONObject jSONObject = purchase.f35952c;
        String strOptString = jSONObject.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = null;
        }
        ArrayList arrayListM13148a = purchase.m13148a();
        long jOptLong = jSONObject.optLong("purchaseTime");
        String strM13149b = purchase.m13149b();
        AbstractC16544l.m18093f(strM13149b, "this.purchaseToken");
        return new StoreTransaction(strOptString, arrayListM13148a, productType, jOptLong, strM13149b, PurchaseStateConversionsKt.toRevenueCatPurchaseState(jSONObject.optInt("purchaseState", 1) == 4 ? 2 : 1), Boolean.valueOf(jSONObject.optBoolean(YladLSetV.WzsyBSteQFnpDK)), purchase.f35951b, new JSONObject(purchase.f35950a), presentedOfferingContext, (String) null, PurchaseType.GOOGLE_PURCHASE, (String) null, str, googleReplacementMode);
    }

    public static /* synthetic */ StoreTransaction toStoreTransaction$default(Purchase purchase, ProductType productType, PresentedOfferingContext presentedOfferingContext, String str, GoogleReplacementMode googleReplacementMode, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            presentedOfferingContext = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            googleReplacementMode = null;
        }
        return toStoreTransaction(purchase, productType, presentedOfferingContext, str, googleReplacementMode);
    }

    public static final StoreTransaction toStoreTransaction(Purchase purchase, PurchaseContext purchaseContext) {
        AbstractC16544l.m18094g(purchase, "<this>");
        AbstractC16544l.m18094g(purchaseContext, "purchaseContext");
        return toStoreTransaction(purchase, purchaseContext.getProductType(), purchaseContext.getPresentedOfferingContext(), purchaseContext.getSelectedSubscriptionOptionId(), purchaseContext.getReplacementMode());
    }

    public static final StoreTransaction toStoreTransaction(PurchaseHistoryRecord purchaseHistoryRecord, ProductType type) {
        AbstractC16544l.m18094g(purchaseHistoryRecord, "<this>");
        AbstractC16544l.m18094g(type, "type");
        ArrayList arrayListM13150a = purchaseHistoryRecord.m13150a();
        JSONObject jSONObject = purchaseHistoryRecord.f35955c;
        long jOptLong = jSONObject.optLong("purchaseTime");
        String strOptString = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
        AbstractC16544l.m18093f(strOptString, "this.purchaseToken");
        return new StoreTransaction((String) null, arrayListM13150a, type, jOptLong, strOptString, PurchaseState.UNSPECIFIED_STATE, (Boolean) null, purchaseHistoryRecord.f35954b, new JSONObject(purchaseHistoryRecord.f35953a), (PresentedOfferingContext) null, (String) null, PurchaseType.GOOGLE_RESTORED_PURCHASE, (String) null, (String) null, (ReplacementMode) null);
    }
}
