package com.revenuecat.purchases.amazon.listener;

import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.UserDataResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJC\u0010\u0015\u001a\u00020\u00042\u001e\u0010\u0011\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m18067d2 = {"Lcom/revenuecat/purchases/amazon/listener/PurchaseUpdatesResponseListener;", "Lcom/amazon/device/iap/PurchasingListener;", "Lcom/amazon/device/iap/model/UserDataResponse;", "response", "Lmm/C;", "onUserDataResponse", "(Lcom/amazon/device/iap/model/UserDataResponse;)V", "Lcom/amazon/device/iap/model/ProductDataResponse;", "onProductDataResponse", "(Lcom/amazon/device/iap/model/ProductDataResponse;)V", "Lcom/amazon/device/iap/model/PurchaseResponse;", "onPurchaseResponse", "(Lcom/amazon/device/iap/model/PurchaseResponse;)V", "Lkotlin/Function2;", "", "Lcom/amazon/device/iap/model/Receipt;", "Lcom/amazon/device/iap/model/UserData;", "onSuccess", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "queryPurchases", "(LBm/n;LBm/k;)V", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public interface PurchaseUpdatesResponseListener extends PurchasingListener {

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DefaultImpls {
        public static void onProductDataResponse(PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, ProductDataResponse response) {
            AbstractC16544l.m18094g(response, "response");
        }

        public static void onPurchaseResponse(PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, PurchaseResponse response) {
            AbstractC16544l.m18094g(response, "response");
        }

        public static void onUserDataResponse(PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, UserDataResponse response) {
            AbstractC16544l.m18094g(response, "response");
        }
    }

    void onProductDataResponse(ProductDataResponse response);

    void onPurchaseResponse(PurchaseResponse response);

    void onUserDataResponse(UserDataResponse response);

    void queryPurchases(InterfaceC1439n onSuccess, InterfaceC1436k onError);
}
