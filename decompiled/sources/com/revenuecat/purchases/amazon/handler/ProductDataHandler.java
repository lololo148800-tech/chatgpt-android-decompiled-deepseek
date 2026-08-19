package com.revenuecat.purchases.amazon.handler;

import android.os.Handler;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataResponse;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.AmazonStrings;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.amazon.StoreProductConversionsKt;
import com.revenuecat.purchases.amazon.listener.ProductDataResponseListener;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p926of.yRae.sVDIzpC;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\b\b\u0000\u0018\u0000 12\u00020\u0001:\u000212B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JI\u0010\u0013\u001a\u00020\u00102\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\f\u001a\u00020\t2\u001c\u0010\u0012\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00100\rj\u0002`\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\rj\u0002`\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\"JS\u0010%\u001a\u00020\u00102\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0#2\u0006\u0010\f\u001a\u00020\t2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00100\r2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\rH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020 0+8BX\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R&\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0+8@X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b/\u00100¨\u00063"}, m18067d2 = {"Lcom/revenuecat/purchases/amazon/handler/ProductDataHandler;", "Lcom/revenuecat/purchases/amazon/listener/ProductDataResponseListener;", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "purchasingServiceProvider", "Landroid/os/Handler;", "mainHandler", "<init>", "(Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;Landroid/os/Handler;)V", "", "", "Lcom/amazon/device/iap/model/Product;", "productData", "marketplace", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lmm/C;", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "onReceive", "handleSuccessfulProductDataResponse", "(Ljava/util/Map;Ljava/lang/String;LBm/k;)V", "Lcom/amazon/device/iap/model/ProductDataResponse;", "response", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "handleUnsuccessfulProductDataResponse", "(Lcom/amazon/device/iap/model/ProductDataResponse;LBm/k;)V", "Lcom/amazon/device/iap/model/RequestId;", "requestId", "addTimeoutToProductDataRequest", "(Lcom/amazon/device/iap/model/RequestId;)V", "Lcom/revenuecat/purchases/amazon/handler/ProductDataHandler$Request;", "getRequest", "(Lcom/amazon/device/iap/model/RequestId;)Lcom/revenuecat/purchases/amazon/handler/ProductDataHandler$Request;", "", "skus", "getProductData", "(Ljava/util/Set;Ljava/lang/String;LBm/k;LBm/k;)V", "onProductDataResponse", "(Lcom/amazon/device/iap/model/ProductDataResponse;)V", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "Landroid/os/Handler;", "", "productDataRequests", "Ljava/util/Map;", "productDataCache", "getProductDataCache$purchases_customEntitlementComputationRelease", "()Ljava/util/Map;", "Companion", "Request", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ProductDataHandler implements ProductDataResponseListener {
    private static final long GET_PRODUCT_DATA_TIMEOUT_MILLIS = 10000;
    private final Handler mainHandler;
    private final Map<String, Product> productDataCache;
    private final Map<RequestId, Request> productDataRequests;
    private final PurchasingServiceProvider purchasingServiceProvider;

    @Metadata(m18066d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001BS\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u001c\u0010\n\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t\u0012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0014\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\fHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015Jd\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u001e\b\u0002\u0010\n\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t2\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\fHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0013R-\u0010\n\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0015R'\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b'\u0010\u0015¨\u0006("}, m18067d2 = {"Lcom/revenuecat/purchases/amazon/handler/ProductDataHandler$Request;", "", "", "", "skuList", "marketplace", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lmm/C;", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "<init>", "(Ljava/util/List;Ljava/lang/String;LBm/k;LBm/k;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()LBm/k;", "component4", "copy", "(Ljava/util/List;Ljava/lang/String;LBm/k;LBm/k;)Lcom/revenuecat/purchases/amazon/handler/ProductDataHandler$Request;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSkuList", "Ljava/lang/String;", "getMarketplace", "LBm/k;", "getOnReceive", "getOnError", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class Request {
        private final String marketplace;
        private final InterfaceC1436k onError;
        private final InterfaceC1436k onReceive;
        private final List<String> skuList;

        public Request(List<String> skuList, String marketplace, InterfaceC1436k onReceive, InterfaceC1436k onError) {
            AbstractC16544l.m18094g(skuList, "skuList");
            AbstractC16544l.m18094g(marketplace, "marketplace");
            AbstractC16544l.m18094g(onReceive, "onReceive");
            AbstractC16544l.m18094g(onError, "onError");
            this.skuList = skuList;
            this.marketplace = marketplace;
            this.onReceive = onReceive;
            this.onError = onError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Request copy$default(Request request, List list, String str, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = request.skuList;
            }
            if ((i10 & 2) != 0) {
                str = request.marketplace;
            }
            if ((i10 & 4) != 0) {
                interfaceC1436k = request.onReceive;
            }
            if ((i10 & 8) != 0) {
                interfaceC1436k2 = request.onError;
            }
            return request.copy(list, str, interfaceC1436k, interfaceC1436k2);
        }

        public final List<String> component1() {
            return this.skuList;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMarketplace() {
            return this.marketplace;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final InterfaceC1436k getOnReceive() {
            return this.onReceive;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final InterfaceC1436k getOnError() {
            return this.onError;
        }

        public final Request copy(List<String> skuList, String marketplace, InterfaceC1436k onReceive, InterfaceC1436k onError) {
            AbstractC16544l.m18094g(skuList, "skuList");
            AbstractC16544l.m18094g(marketplace, "marketplace");
            AbstractC16544l.m18094g(onReceive, "onReceive");
            AbstractC16544l.m18094g(onError, "onError");
            return new Request(skuList, marketplace, onReceive, onError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return AbstractC16544l.m18089b(this.skuList, request.skuList) && AbstractC16544l.m18089b(this.marketplace, request.marketplace) && AbstractC16544l.m18089b(this.onReceive, request.onReceive) && AbstractC16544l.m18089b(this.onError, request.onError);
        }

        public final String getMarketplace() {
            return this.marketplace;
        }

        public final InterfaceC1436k getOnError() {
            return this.onError;
        }

        public final InterfaceC1436k getOnReceive() {
            return this.onReceive;
        }

        public final List<String> getSkuList() {
            return this.skuList;
        }

        public int hashCode() {
            return this.onError.hashCode() + ((this.onReceive.hashCode() + AbstractC0168G.m527p(this.skuList.hashCode() * 31, 31, this.marketplace)) * 31);
        }

        public String toString() {
            return "Request(skuList=" + this.skuList + ", marketplace=" + this.marketplace + ", onReceive=" + this.onReceive + ", onError=" + this.onError + ')';
        }
    }

    public ProductDataHandler(PurchasingServiceProvider purchasingServiceProvider, Handler mainHandler) {
        AbstractC16544l.m18094g(purchasingServiceProvider, "purchasingServiceProvider");
        AbstractC16544l.m18094g(mainHandler, "mainHandler");
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.mainHandler = mainHandler;
        this.productDataRequests = new LinkedHashMap();
        this.productDataCache = new LinkedHashMap();
    }

    private final void addTimeoutToProductDataRequest(RequestId requestId) {
        this.mainHandler.postDelayed(new RunnableC12673a(this, requestId, 0), GET_PRODUCT_DATA_TIMEOUT_MILLIS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addTimeoutToProductDataRequest$lambda$6(ProductDataHandler this$0, RequestId requestId) {
        AbstractC16544l.m18094g(this$0, "this$0");
        AbstractC16544l.m18094g(requestId, "$requestId");
        Request request = this$0.getRequest(requestId);
        if (request == null) {
            return;
        }
        request.getOnError().invoke(new PurchasesError(PurchasesErrorCode.UnknownError, String.format(AmazonStrings.ERROR_TIMEOUT_GETTING_PRODUCT_DATA, Arrays.copyOf(new Object[]{request.getSkuList().toString()}, 1))));
    }

    private final synchronized Request getRequest(RequestId requestId) {
        return this.productDataRequests.remove(requestId);
    }

    private final void handleSuccessfulProductDataResponse(Map<String, Product> productData, String marketplace, InterfaceC1436k onReceive) {
        LogIntent logIntent = LogIntent.DEBUG;
        LogWrapperKt.log(logIntent, String.format(AmazonStrings.RETRIEVED_PRODUCT_DATA, Arrays.copyOf(new Object[]{productData}, 1)));
        if (productData.isEmpty()) {
            LogWrapperKt.log(logIntent, AmazonStrings.RETRIEVED_PRODUCT_DATA_EMPTY);
        }
        Collection<Product> collectionValues = productData.values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            StoreProduct storeProduct = StoreProductConversionsKt.toStoreProduct((Product) it.next(), marketplace);
            if (storeProduct != null) {
                arrayList.add(storeProduct);
            }
        }
        onReceive.invoke(arrayList);
    }

    private final void handleUnsuccessfulProductDataResponse(ProductDataResponse response, InterfaceC1436k onError) {
        onError.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, response.getRequestStatus() == ProductDataResponse.RequestStatus.NOT_SUPPORTED ? "Couldn't fetch product data, since it's not supported." : "Error when fetching product data."));
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener
    public void getProductData(Set<String> skus, String marketplace, InterfaceC1436k onReceive, InterfaceC1436k onError) {
        Map mapM19254p;
        AbstractC16544l.m18094g(skus, "skus");
        AbstractC16544l.m18094g(marketplace, "marketplace");
        AbstractC16544l.m18094g(onReceive, "onReceive");
        AbstractC16544l.m18094g(onError, "onError");
        Set<String> set = skus;
        AbstractC12107L1.m13831v(new Object[]{AbstractC17680n.m19349Y(set, null, null, null, 0, null, null, 63)}, 1, AmazonStrings.REQUESTING_PRODUCTS, LogIntent.DEBUG);
        synchronized (this) {
            mapM19254p = AbstractC17659D.m19254p(this.productDataCache);
        }
        if (!mapM19254p.keySet().containsAll(skus)) {
            RequestId productData = this.purchasingServiceProvider.getProductData(skus);
            Request request = new Request(AbstractC17680n.m19322C0(set), marketplace, onReceive, onError);
            synchronized (this) {
                this.productDataRequests.put(productData, request);
                addTimeoutToProductDataRequest(productData);
            }
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapM19254p.entrySet()) {
            if (skus.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        handleSuccessfulProductDataResponse(linkedHashMap, marketplace, onReceive);
    }

    /* JADX INFO: renamed from: getProductDataCache$purchases_customEntitlementComputationRelease */
    public final synchronized Map<String, Product> m14442x8117b18a() {
        return this.productDataCache;
    }

    public void onProductDataResponse(ProductDataResponse response) throws Exception {
        AbstractC16544l.m18094g(response, sVDIzpC.YIQvozddU);
        try {
            LogIntent logIntent = LogIntent.DEBUG;
            LogWrapperKt.log(logIntent, String.format(AmazonStrings.PRODUCTS_REQUEST_FINISHED, Arrays.copyOf(new Object[]{response.getRequestStatus().name()}, 1)));
            Set unavailableSkus = response.getUnavailableSkus();
            AbstractC16544l.m18093f(unavailableSkus, "response.unavailableSkus");
            if (!unavailableSkus.isEmpty()) {
                LogWrapperKt.log(logIntent, String.format(AmazonStrings.PRODUCTS_REQUEST_UNAVAILABLE, Arrays.copyOf(new Object[]{response.getUnavailableSkus()}, 1)));
            }
            RequestId requestId = response.getRequestId();
            AbstractC16544l.m18093f(requestId, "requestId");
            Request request = getRequest(requestId);
            if (request == null) {
                return;
            }
            if (response.getRequestStatus() != ProductDataResponse.RequestStatus.SUCCESSFUL) {
                handleUnsuccessfulProductDataResponse(response, request.getOnError());
                return;
            }
            synchronized (this) {
                Map<String, Product> map = this.productDataCache;
                Map<? extends String, ? extends Product> productData = response.getProductData();
                AbstractC16544l.m18093f(productData, "response.productData");
                map.putAll(productData);
            }
            Map<String, Product> productData2 = response.getProductData();
            AbstractC16544l.m18093f(productData2, "response.productData");
            handleSuccessfulProductDataResponse(productData2, request.getMarketplace(), request.getOnReceive());
        } catch (Exception e10) {
            LogUtilsKt.errorLog("Exception in onProductDataResponse", e10);
            throw e10;
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
        ProductDataResponseListener.DefaultImpls.onPurchaseResponse(this, purchaseResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        ProductDataResponseListener.DefaultImpls.onPurchaseUpdatesResponse(this, purchaseUpdatesResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void onUserDataResponse(UserDataResponse userDataResponse) {
        ProductDataResponseListener.DefaultImpls.onUserDataResponse(this, userDataResponse);
    }
}
