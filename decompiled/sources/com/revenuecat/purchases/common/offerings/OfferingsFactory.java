package com.revenuecat.purchases.common.offerings;

import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.OfferingStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p559Wn.C8976h;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJW\u0010\u0019\u001a\u00020\u00152\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2$\u0010\u0016\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012\u0012\u0004\u0012\u00020\u00150\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00150\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001d\u001a\u0004\u0018\u00010\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010!\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00150\u00112\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00150\u0011¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%¨\u0006&"}, m18067d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;", "", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/common/OfferingParser;", "offeringParser", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "<init>", "(Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/common/OfferingParser;Lcom/revenuecat/purchases/common/Dispatcher;)V", "Lorg/json/JSONObject;", "offeringsJSON", "", "", "extractProductIdentifiers", "(Lorg/json/JSONObject;)Ljava/util/Set;", "productIds", "Lkotlin/Function1;", "", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lmm/C;", "onCompleted", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "getStoreProductsById", "(Ljava/util/Set;LBm/k;LBm/k;)V", "allProductIdsInOfferings", "storeProductByID", "logMissingProducts", "(Ljava/util/Set;Ljava/util/Map;)Lmm/C;", "Lcom/revenuecat/purchases/Offerings;", "onSuccess", "createOfferings", "(Lorg/json/JSONObject;LBm/k;LBm/k;)V", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/common/OfferingParser;", "Lcom/revenuecat/purchases/common/Dispatcher;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class OfferingsFactory {
    private final BillingAbstract billing;
    private final Dispatcher dispatcher;
    private final OfferingParser offeringParser;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsFactory$createOfferings$1 */
    @Metadata(m18066d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m18067d2 = {"", "", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "productsById", "Lmm/C;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126911 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ Set<String> $allRequestedProductIdentifiers;
        final /* synthetic */ JSONObject $offeringsJSON;
        final /* synthetic */ InterfaceC1436k $onError;
        final /* synthetic */ InterfaceC1436k $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126911(Set<String> set, JSONObject jSONObject, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
            super(1);
            this.$allRequestedProductIdentifiers = set;
            this.$offeringsJSON = jSONObject;
            this.$onError = interfaceC1436k;
            this.$onSuccess = interfaceC1436k2;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Exception {
            invoke((Map<String, ? extends List<? extends StoreProduct>>) obj);
            return C17296C.f55119a;
        }

        public final void invoke(Map<String, ? extends List<? extends StoreProduct>> productsById) throws Exception {
            AbstractC16544l.m18094g(productsById, "productsById");
            try {
                OfferingsFactory.this.logMissingProducts(this.$allRequestedProductIdentifiers, productsById);
                Offerings offeringsCreateOfferings = OfferingsFactory.this.offeringParser.createOfferings(this.$offeringsJSON, productsById);
                if (offeringsCreateOfferings.getAll().isEmpty()) {
                    this.$onError.invoke(new PurchasesError(PurchasesErrorCode.ConfigurationError, OfferingStrings.CONFIGURATION_ERROR_PRODUCTS_NOT_FOUND));
                } else {
                    LogUtilsKt.verboseLog(String.format(OfferingStrings.CREATED_OFFERINGS, Arrays.copyOf(new Object[]{offeringsCreateOfferings}, 1)));
                    this.$onSuccess.invoke(offeringsCreateOfferings);
                }
            } catch (Exception e10) {
                if (!(e10 instanceof JSONException ? true : e10 instanceof C8976h)) {
                    throw e10;
                }
                AbstractC12107L1.m13831v(new Object[]{e10.getLocalizedMessage()}, 1, OfferingStrings.JSON_EXCEPTION_ERROR, LogIntent.RC_ERROR);
                this.$onError.invoke(new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, e10.getLocalizedMessage()));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsFactory$createOfferings$2 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126922 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126922(InterfaceC1436k interfaceC1436k) {
            super(1);
            this.$onError = interfaceC1436k;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError error) {
            AbstractC16544l.m18094g(error, "error");
            this.$onError.invoke(error);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsFactory$getStoreProductsById$1 */
    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "subscriptionProducts", "Lmm/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126931 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $onCompleted;
        final /* synthetic */ InterfaceC1436k $onError;
        final /* synthetic */ Set<String> $productIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126931(Set<String> set, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
            super(1);
            this.$productIds = set;
            this.$onCompleted = interfaceC1436k;
            this.$onError = interfaceC1436k2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1(List subscriptionProducts, Set productIds, OfferingsFactory this$0, InterfaceC1436k onCompleted, InterfaceC1436k onError) {
            AbstractC16544l.m18094g(subscriptionProducts, "$subscriptionProducts");
            AbstractC16544l.m18094g(productIds, "$productIds");
            AbstractC16544l.m18094g(this$0, "this$0");
            AbstractC16544l.m18094g(onCompleted, "$onCompleted");
            AbstractC16544l.m18094g(onError, "$onError");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : subscriptionProducts) {
                String productId = ((StoreProduct) obj).getPurchasingData().getProductId();
                Object arrayList = linkedHashMap.get(productId);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(productId, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(linkedHashMap);
            Set<String> setM19264d = AbstractC17665J.m19264d(productIds, linkedHashMapM19256r.keySet());
            if (setM19264d.isEmpty()) {
                onCompleted.invoke(linkedHashMapM19256r);
            } else {
                this$0.billing.queryProductDetailsAsync(ProductType.INAPP, setM19264d, new OfferingsFactory$getStoreProductsById$1$1$1(this$0, linkedHashMapM19256r, onCompleted), new OfferingsFactory$getStoreProductsById$1$1$2(onError));
            }
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends StoreProduct>) obj);
            return C17296C.f55119a;
        }

        public final void invoke(final List<? extends StoreProduct> subscriptionProducts) {
            AbstractC16544l.m18094g(subscriptionProducts, "subscriptionProducts");
            Dispatcher dispatcher = OfferingsFactory.this.dispatcher;
            final Set<String> set = this.$productIds;
            final OfferingsFactory offeringsFactory = OfferingsFactory.this;
            final InterfaceC1436k interfaceC1436k = this.$onCompleted;
            final InterfaceC1436k interfaceC1436k2 = this.$onError;
            Dispatcher.enqueue$default(dispatcher, new Runnable() { // from class: com.revenuecat.purchases.common.offerings.a
                @Override // java.lang.Runnable
                public final void run() {
                    OfferingsFactory.C126931.invoke$lambda$1(subscriptionProducts, set, offeringsFactory, interfaceC1436k, interfaceC1436k2);
                }
            }, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsFactory$getStoreProductsById$2 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126942 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126942(InterfaceC1436k interfaceC1436k) {
            super(1);
            this.$onError = interfaceC1436k;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC16544l.m18094g(it, "it");
            this.$onError.invoke(it);
        }
    }

    public OfferingsFactory(BillingAbstract billing, OfferingParser offeringParser, Dispatcher dispatcher) {
        AbstractC16544l.m18094g(billing, "billing");
        AbstractC16544l.m18094g(offeringParser, "offeringParser");
        AbstractC16544l.m18094g(dispatcher, "dispatcher");
        this.billing = billing;
        this.offeringParser = offeringParser;
        this.dispatcher = dispatcher;
    }

    private final Set<String> extractProductIdentifiers(JSONObject offeringsJSON) throws JSONException {
        JSONArray jSONArray = offeringsJSON.getJSONArray("offerings");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONArray jSONArray2 = jSONArray.getJSONObject(i10).getJSONArray("packages");
            int length2 = jSONArray2.length();
            for (int i11 = 0; i11 < length2; i11++) {
                String it = jSONArray2.getJSONObject(i11).optString("platform_product_identifier");
                AbstractC16544l.m18093f(it, "it");
                if (AbstractC21322p.m21681O(it)) {
                    it = null;
                }
                if (it != null) {
                    linkedHashSet.add(it);
                }
            }
        }
        return linkedHashSet;
    }

    private final void getStoreProductsById(Set<String> productIds, InterfaceC1436k onCompleted, InterfaceC1436k onError) {
        this.billing.queryProductDetailsAsync(ProductType.SUBS, productIds, new C126931(productIds, onCompleted, onError), new C126942(onError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C17296C logMissingProducts(Set<String> allProductIdsInOfferings, Map<String, ? extends List<? extends StoreProduct>> storeProductByID) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : allProductIdsInOfferings) {
            if (!storeProductByID.containsKey((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
        if (arrayList2 == null) {
            return null;
        }
        AbstractC12107L1.m13831v(new Object[]{AbstractC17680n.m19349Y(arrayList2, ", ", null, null, 0, null, null, 62)}, 1, OfferingStrings.CANNOT_FIND_PRODUCT_CONFIGURATION_ERROR, LogIntent.GOOGLE_WARNING);
        return C17296C.f55119a;
    }

    public final void createOfferings(JSONObject offeringsJSON, InterfaceC1436k onError, InterfaceC1436k onSuccess) {
        AbstractC16544l.m18094g(offeringsJSON, "offeringsJSON");
        AbstractC16544l.m18094g(onError, "onError");
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        try {
            Set<String> setExtractProductIdentifiers = extractProductIdentifiers(offeringsJSON);
            if (setExtractProductIdentifiers.isEmpty()) {
                onError.invoke(new PurchasesError(PurchasesErrorCode.ConfigurationError, OfferingStrings.CONFIGURATION_ERROR_NO_PRODUCTS_FOR_OFFERINGS));
            } else {
                getStoreProductsById(setExtractProductIdentifiers, new C126911(setExtractProductIdentifiers, offeringsJSON, onError, onSuccess), new C126922(onError));
            }
        } catch (JSONException e10) {
            LogWrapperKt.log(LogIntent.RC_ERROR, String.format(OfferingStrings.JSON_EXCEPTION_ERROR, Arrays.copyOf(new Object[]{e10.getLocalizedMessage()}, 1)));
            onError.invoke(new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, e10.getLocalizedMessage()));
        }
    }
}
