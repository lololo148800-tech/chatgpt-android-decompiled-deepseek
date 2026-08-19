package com.revenuecat.purchases.amazon.handler;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.AmazonStrings;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.amazon.listener.PurchaseResponseListener;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivityBroadcastReceiver;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9239Y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0018\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JU\u0010\u0016\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JM\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0004\b!\u0010 J#\u0010\"\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0004\b\"\u0010 J#\u0010#\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0004\b#\u0010 J#\u0010$\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0004\b$\u0010 J]\u0010'\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\u0006\u0010\r\u001a\u00020\f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R \u00101\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102RJ\u00105\u001a8\u0012\u0004\u0012\u000203\u0012.\u0012,\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013040/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00102¨\u00066"}, m18067d2 = {"Lcom/revenuecat/purchases/amazon/handler/PurchaseHandler;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "purchasingServiceProvider", "Landroid/content/Context;", "applicationContext", "<init>", "(Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;Landroid/content/Context;)V", "Landroid/os/Handler;", "mainHandler", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "Lkotlin/Function2;", "Lcom/amazon/device/iap/model/Receipt;", "Lcom/amazon/device/iap/model/UserData;", "Lmm/C;", "onSuccess", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "startProxyActivity", "(Landroid/os/Handler;Landroid/app/Activity;Lcom/revenuecat/purchases/models/StoreProduct;LBm/n;LBm/k;)V", "com/revenuecat/purchases/amazon/handler/PurchaseHandler$createRequestIdResultReceiver$1", "createRequestIdResultReceiver", "(Landroid/os/Handler;Lcom/revenuecat/purchases/models/StoreProduct;LBm/n;LBm/k;)Lcom/revenuecat/purchases/amazon/handler/PurchaseHandler$createRequestIdResultReceiver$1;", "receipt", "userData", "onSuccessfulPurchase", "(Lcom/amazon/device/iap/model/Receipt;Lcom/amazon/device/iap/model/UserData;LBm/n;)V", "onUnknownError", "(LBm/k;)V", "onNotSupported", "onAlreadyPurchased", "onInvalidSku", "onFailed", "", "appUserID", "purchase", "(Landroid/os/Handler;Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/StoreProduct;LBm/n;LBm/k;)V", "Lcom/amazon/device/iap/model/PurchaseResponse;", "response", "onPurchaseResponse", "(Lcom/amazon/device/iap/model/PurchaseResponse;)V", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "Landroid/content/Context;", "", "Lcom/revenuecat/purchases/ProductType;", "productTypes", "Ljava/util/Map;", "Lcom/amazon/device/iap/model/RequestId;", "Lmm/l;", "purchaseCallbacks", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PurchaseHandler implements PurchaseResponseListener {
    private final Context applicationContext;
    private final Map<String, ProductType> productTypes;
    private final Map<RequestId, C17309l> purchaseCallbacks;
    private final PurchasingServiceProvider purchasingServiceProvider;

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchaseResponse.RequestStatus.values().length];
            try {
                iArr[PurchaseResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseResponse.RequestStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseResponse.RequestStatus.INVALID_SKU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PurchaseResponse.RequestStatus.ALREADY_PURCHASED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PurchaseResponse.RequestStatus.NOT_SUPPORTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PurchaseHandler(PurchasingServiceProvider purchasingServiceProvider, Context applicationContext) {
        AbstractC16544l.m18094g(purchasingServiceProvider, "purchasingServiceProvider");
        AbstractC16544l.m18094g(applicationContext, "applicationContext");
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.applicationContext = applicationContext;
        this.productTypes = new LinkedHashMap();
        this.purchaseCallbacks = new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.revenuecat.purchases.amazon.handler.PurchaseHandler$createRequestIdResultReceiver$1] */
    private final ResultReceiverC126721 createRequestIdResultReceiver(Handler mainHandler, final StoreProduct storeProduct, final InterfaceC1439n onSuccess, final InterfaceC1436k onError) {
        return new ResultReceiver(mainHandler) { // from class: com.revenuecat.purchases.amazon.handler.PurchaseHandler.createRequestIdResultReceiver.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                Object obj;
                PurchaseHandler purchaseHandler = this;
                InterfaceC1439n interfaceC1439n = onSuccess;
                InterfaceC1436k interfaceC1436k = onError;
                StoreProduct storeProduct2 = storeProduct;
                synchronized (purchaseHandler) {
                    if (resultData != null) {
                        try {
                            obj = resultData.get(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } else {
                        obj = null;
                    }
                    RequestId requestId = obj instanceof RequestId ? (RequestId) obj : null;
                    if (requestId != null) {
                        purchaseHandler.purchaseCallbacks.put(requestId, AbstractC9239Y.m9815b(interfaceC1439n, interfaceC1436k));
                        purchaseHandler.productTypes.put(storeProduct2.getId(), storeProduct2.getType());
                    } else {
                        LogUtilsKt.errorLog$default("No RequestId coming from ProxyAmazonBillingActivity", null, 2, null);
                    }
                }
            }
        };
    }

    private final void onAlreadyPurchased(InterfaceC1436k onError) {
        onError.invoke(new PurchasesError(PurchasesErrorCode.ProductAlreadyPurchasedError, AmazonStrings.ERROR_PURCHASE_ALREADY_OWNED));
    }

    private final void onFailed(InterfaceC1436k onError) {
        onError.invoke(new PurchasesError(PurchasesErrorCode.PurchaseCancelledError, AmazonStrings.ERROR_PURCHASE_FAILED));
    }

    private final void onInvalidSku(InterfaceC1436k onError) {
        onError.invoke(new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, AmazonStrings.ERROR_PURCHASE_INVALID_SKU));
    }

    private final void onNotSupported(InterfaceC1436k onError) {
        onError.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, AmazonStrings.ERROR_PURCHASE_NOT_SUPPORTED));
    }

    private final void onSuccessfulPurchase(Receipt receipt, UserData userData, InterfaceC1439n onSuccess) {
        onSuccess.invoke(receipt, userData);
    }

    private final void onUnknownError(InterfaceC1436k onError) {
        onError.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, AmazonStrings.ERROR_PURCHASE_UNKNOWN));
    }

    private final void startProxyActivity(Handler mainHandler, Activity activity, StoreProduct storeProduct, InterfaceC1439n onSuccess, InterfaceC1436k onError) {
        activity.startActivity(ProxyAmazonBillingActivity.INSTANCE.newStartIntent(activity, createRequestIdResultReceiver(mainHandler, storeProduct, onSuccess, onError), storeProduct.getId(), this.purchasingServiceProvider));
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onProductDataResponse(ProductDataResponse productDataResponse) {
        PurchaseResponseListener.DefaultImpls.onProductDataResponse(this, productDataResponse);
    }

    public void onPurchaseResponse(PurchaseResponse response) throws Exception {
        C17309l c17309lRemove;
        AbstractC16544l.m18094g(response, "response");
        try {
            LogWrapperKt.log(LogIntent.DEBUG, String.format(AmazonStrings.PURCHASE_REQUEST_FINISHED, Arrays.copyOf(new Object[]{response.toJSON().toString(1)}, 1)));
            ProxyAmazonBillingActivityBroadcastReceiver.Companion companion = ProxyAmazonBillingActivityBroadcastReceiver.INSTANCE;
            String packageName = this.applicationContext.getPackageName();
            AbstractC16544l.m18093f(packageName, "applicationContext.packageName");
            this.applicationContext.sendBroadcast(companion.newPurchaseFinishedIntent(packageName));
            RequestId requestId = response.getRequestId();
            synchronized (this) {
                c17309lRemove = this.purchaseCallbacks.remove(requestId);
            }
            if (c17309lRemove != null) {
                InterfaceC1439n interfaceC1439n = (InterfaceC1439n) c17309lRemove.m18977a();
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) c17309lRemove.m18978b();
                PurchaseResponse.RequestStatus requestStatus = response.getRequestStatus();
                int i10 = requestStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[requestStatus.ordinal()];
                if (i10 == 1) {
                    Receipt receipt = response.getReceipt();
                    AbstractC16544l.m18093f(receipt, "response.receipt");
                    UserData userData = response.getUserData();
                    AbstractC16544l.m18093f(userData, "response.userData");
                    onSuccessfulPurchase(receipt, userData, interfaceC1439n);
                    return;
                }
                if (i10 == 2) {
                    onFailed(interfaceC1436k);
                    return;
                }
                if (i10 == 3) {
                    onInvalidSku(interfaceC1436k);
                    return;
                }
                if (i10 == 4) {
                    onAlreadyPurchased(interfaceC1436k);
                } else if (i10 != 5) {
                    onUnknownError(interfaceC1436k);
                } else {
                    onNotSupported(interfaceC1436k);
                }
            }
        } catch (Exception e10) {
            LogUtilsKt.errorLog("Exception in onPurchaseResponse", e10);
            throw e10;
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        PurchaseResponseListener.DefaultImpls.onPurchaseUpdatesResponse(this, purchaseUpdatesResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void onUserDataResponse(UserDataResponse userDataResponse) {
        PurchaseResponseListener.DefaultImpls.onUserDataResponse(this, userDataResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseResponseListener
    public void purchase(Handler mainHandler, Activity activity, String appUserID, StoreProduct storeProduct, InterfaceC1439n onSuccess, InterfaceC1436k onError) {
        AbstractC16544l.m18094g(mainHandler, "mainHandler");
        AbstractC16544l.m18094g(activity, "activity");
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(storeProduct, "storeProduct");
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, "onError");
        AbstractC12107L1.m13831v(new Object[]{storeProduct.getId()}, 1, PurchaseStrings.PURCHASING_PRODUCT, LogIntent.PURCHASE);
        startProxyActivity(mainHandler, activity, storeProduct, onSuccess, onError);
    }
}
