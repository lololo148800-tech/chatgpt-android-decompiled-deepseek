package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001aC\u0010\t\u001a\u00020\b2\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\u0010\u001a\u00020\u000f2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a;\u0010\u001a\u001a\u00020\u0003*\u00020\u00192\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b\u001a\u0010\u001b\u001aQ\u0010\u001e\u001a\u00020\u0003*\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00002\u001a\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001aO\u0010#\u001a\u00020\u0003*\u00020\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\f2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0018\u0010\"\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b#\u0010$\u001aY\u0010#\u001a\u00020\u0003*\u00020\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\f2\b\u0010&\u001a\u0004\u0018\u00010%2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0018\u0010\"\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b#\u0010'\u001a;\u0010(\u001a\u00020\u0003*\u00020\u00192\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b(\u0010\u001b\"&\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\",\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, m18067d2 = {"Lkotlin/Function2;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lmm/C;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "", "onError", "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "purchaseCompletedCallback", "(LBm/n;LBm/n;)Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "onReceived", "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "getStoreProductsCallback", "(LBm/k;LBm/k;)Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "Lcom/revenuecat/purchases/Offerings;", "Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "receiveOfferingsCallback", "(LBm/k;LBm/k;)Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "receiveCustomerInfoCallback", "(LBm/k;LBm/k;)Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "Lcom/revenuecat/purchases/Purchases;", "getOfferingsWith", "(Lcom/revenuecat/purchases/Purchases;LBm/k;LBm/k;)V", "Lcom/revenuecat/purchases/PurchaseParams;", "purchaseParams", "purchaseWith", "(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/PurchaseParams;LBm/n;LBm/n;)V", "", "productIds", "onGetStoreProducts", "getProductsWith", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;LBm/k;LBm/k;)V", "Lcom/revenuecat/purchases/ProductType;", "type", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;LBm/k;LBm/k;)V", "restorePurchasesWith", "ON_ERROR_STUB", "LBm/k;", "getON_ERROR_STUB", "()LBm/k;", "ON_PURCHASE_ERROR_STUB", "LBm/n;", "getON_PURCHASE_ERROR_STUB", "()LBm/n;", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ListenerConversionsCommonKt {
    private static final InterfaceC1436k ON_ERROR_STUB = ListenerConversionsCommonKt$ON_ERROR_STUB$1.INSTANCE;
    private static final InterfaceC1439n ON_PURCHASE_ERROR_STUB = ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1.INSTANCE;

    public static final InterfaceC1436k getON_ERROR_STUB() {
        return ON_ERROR_STUB;
    }

    public static final InterfaceC1439n getON_PURCHASE_ERROR_STUB() {
        return ON_PURCHASE_ERROR_STUB;
    }

    public static final void getOfferingsWith(Purchases purchases, InterfaceC1436k onError, InterfaceC1436k onSuccess) {
        AbstractC16544l.m18094g(purchases, "<this>");
        AbstractC16544l.m18094g(onError, "onError");
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        purchases.getOfferings(receiveOfferingsCallback(onSuccess, onError));
    }

    public static /* synthetic */ void getOfferingsWith$default(Purchases purchases, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC1436k = ON_ERROR_STUB;
        }
        getOfferingsWith(purchases, interfaceC1436k, interfaceC1436k2);
    }

    public static final void getProductsWith(Purchases purchases, List<String> productIds, InterfaceC1436k onError, InterfaceC1436k onGetStoreProducts) {
        AbstractC16544l.m18094g(purchases, "<this>");
        AbstractC16544l.m18094g(productIds, "productIds");
        AbstractC16544l.m18094g(onError, "onError");
        AbstractC16544l.m18094g(onGetStoreProducts, "onGetStoreProducts");
        purchases.getProducts(productIds, getStoreProductsCallback(onGetStoreProducts, onError));
    }

    public static /* synthetic */ void getProductsWith$default(Purchases purchases, List list, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC1436k = ON_ERROR_STUB;
        }
        getProductsWith(purchases, list, interfaceC1436k, interfaceC1436k2);
    }

    public static final GetStoreProductsCallback getStoreProductsCallback(final InterfaceC1436k onReceived, final InterfaceC1436k onError) {
        AbstractC16544l.m18094g(onReceived, "onReceived");
        AbstractC16544l.m18094g(onError, "onError");
        return new GetStoreProductsCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.getStoreProductsCallback.1
            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onError(PurchasesError error) {
                AbstractC16544l.m18094g(error, "error");
                onError.invoke(error);
            }

            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onReceived(List<? extends StoreProduct> storeProducts) {
                AbstractC16544l.m18094g(storeProducts, "storeProducts");
                onReceived.invoke(storeProducts);
            }
        };
    }

    public static final PurchaseCallback purchaseCompletedCallback(final InterfaceC1439n onSuccess, final InterfaceC1439n onError) {
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, "onError");
        return new PurchaseCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.purchaseCompletedCallback.1
            @Override // com.revenuecat.purchases.interfaces.PurchaseCallback
            public void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
                AbstractC16544l.m18094g(storeTransaction, "storeTransaction");
                AbstractC16544l.m18094g(customerInfo, "customerInfo");
                onSuccess.invoke(storeTransaction, customerInfo);
            }

            @Override // com.revenuecat.purchases.interfaces.PurchaseErrorCallback
            public void onError(PurchasesError error, boolean userCancelled) {
                AbstractC16544l.m18094g(error, "error");
                onError.invoke(error, Boolean.valueOf(userCancelled));
            }
        };
    }

    public static final void purchaseWith(Purchases purchases, PurchaseParams purchaseParams, InterfaceC1439n onError, InterfaceC1439n onSuccess) {
        AbstractC16544l.m18094g(purchases, "<this>");
        AbstractC16544l.m18094g(purchaseParams, "purchaseParams");
        AbstractC16544l.m18094g(onError, "onError");
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        purchases.purchase(purchaseParams, purchaseCompletedCallback(onSuccess, onError));
    }

    public static /* synthetic */ void purchaseWith$default(Purchases purchases, PurchaseParams purchaseParams, InterfaceC1439n interfaceC1439n, InterfaceC1439n interfaceC1439n2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC1439n = ON_PURCHASE_ERROR_STUB;
        }
        purchaseWith(purchases, purchaseParams, interfaceC1439n, interfaceC1439n2);
    }

    public static final ReceiveCustomerInfoCallback receiveCustomerInfoCallback(final InterfaceC1436k onSuccess, final InterfaceC1436k onError) {
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, "onError");
        return new ReceiveCustomerInfoCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.receiveCustomerInfoCallback.1
            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onError(PurchasesError error) {
                AbstractC16544l.m18094g(error, "error");
                InterfaceC1436k interfaceC1436k = onError;
                if (interfaceC1436k != null) {
                }
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onReceived(CustomerInfo customerInfo) {
                AbstractC16544l.m18094g(customerInfo, "customerInfo");
                InterfaceC1436k interfaceC1436k = onSuccess;
                if (interfaceC1436k != null) {
                }
            }
        };
    }

    public static final ReceiveOfferingsCallback receiveOfferingsCallback(final InterfaceC1436k onSuccess, final InterfaceC1436k onError) {
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, "onError");
        return new ReceiveOfferingsCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.receiveOfferingsCallback.1
            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onError(PurchasesError error) {
                AbstractC16544l.m18094g(error, "error");
                onError.invoke(error);
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onReceived(Offerings offerings) {
                AbstractC16544l.m18094g(offerings, "offerings");
                onSuccess.invoke(offerings);
            }
        };
    }

    public static final void restorePurchasesWith(Purchases purchases, InterfaceC1436k onError, InterfaceC1436k onSuccess) {
        AbstractC16544l.m18094g(purchases, "<this>");
        AbstractC16544l.m18094g(onError, "onError");
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        purchases.restorePurchases(receiveCustomerInfoCallback(onSuccess, onError));
    }

    public static /* synthetic */ void restorePurchasesWith$default(Purchases purchases, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC1436k = ON_ERROR_STUB;
        }
        restorePurchasesWith(purchases, interfaceC1436k, interfaceC1436k2);
    }

    public static final void getProductsWith(Purchases purchases, List<String> productIds, ProductType productType, InterfaceC1436k onError, InterfaceC1436k onGetStoreProducts) {
        AbstractC16544l.m18094g(purchases, "<this>");
        AbstractC16544l.m18094g(productIds, "productIds");
        AbstractC16544l.m18094g(onError, "onError");
        AbstractC16544l.m18094g(onGetStoreProducts, "onGetStoreProducts");
        purchases.getProducts(productIds, productType, getStoreProductsCallback(onGetStoreProducts, onError));
    }

    public static /* synthetic */ void getProductsWith$default(Purchases purchases, List list, ProductType productType, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            interfaceC1436k = ON_ERROR_STUB;
        }
        getProductsWith(purchases, list, productType, interfaceC1436k, interfaceC1436k2);
    }
}
