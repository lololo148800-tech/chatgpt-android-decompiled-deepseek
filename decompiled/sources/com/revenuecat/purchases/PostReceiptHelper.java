package com.revenuecat.purchases;

import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.networking.PostReceiptProductInfo;
import com.revenuecat.purchases.common.networking.PostReceiptResponse;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.subscriberattributes.BackendHelpersKt;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import org.json.JSONObject;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p138F8.vJO.vRJidSveZHcTw;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0085\u0001\u0010)\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2$\u0010(\u001a \u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020!0#j\u0002`'H\u0002¢\u0006\u0004\b)\u0010*JA\u0010.\u001a\u00020!2\u0006\u0010+\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020!0\u001f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020!0-H\u0002¢\u0006\u0004\b.\u0010/J?\u00100\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020!0\u001f2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020!0\u001fH\u0002¢\u0006\u0004\b0\u00101Jq\u00102\u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020!0\u001f2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0004\b2\u00103J\u007f\u0010;\u001a\u00020!2\u0006\u00105\u001a\u0002042\b\u00107\u001a\u0004\u0018\u0001062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\"\b\u0002\u0010\"\u001a\u001c\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020!\u0018\u000108j\u0004\u0018\u0001`92\"\b\u0002\u0010(\u001a\u001c\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020!\u0018\u000108j\u0004\u0018\u0001`:¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010?R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010@R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010AR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010BR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010CR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010DR\u0014\u0010G\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006H"}, m18067d2 = {"Lcom/revenuecat/purchases/PostReceiptHelper;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "customerInfoUpdateHandler", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "subscriberAttributesManager", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "paywallPresentedCache", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;)V", "", "appUserID", "purchaseToken", "", "isRestore", "Lcom/revenuecat/purchases/common/ReceiptInfo;", "receiptInfo", "storeUserID", "marketplace", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "Lmm/C;", "onSuccess", "Lkotlin/Function3;", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/common/PostReceiptDataErrorCallback;", "onError", "postReceiptAndSubscriberAttributes", "(Ljava/lang/String;Ljava/lang/String;ZLcom/revenuecat/purchases/common/ReceiptInfo;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;LBm/k;LBm/o;)V", "errorHandlingBehavior", "Lcom/revenuecat/purchases/CustomerInfo;", "Lkotlin/Function0;", "useOfflineEntitlementsCustomerInfoIfNeeded", "(Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Ljava/lang/String;LBm/k;LBm/a;)V", "calculateOfflineCustomerInfo", "(Ljava/lang/String;LBm/k;LBm/k;)V", "postTokenWithoutConsuming", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/common/ReceiptInfo;ZLjava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;LBm/k;LBm/k;)V", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchase", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/SuccessfulPurchaseCallback;", "Lcom/revenuecat/purchases/ErrorPurchaseCallback;", "postTransactionAndConsumeIfNeeded", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/models/StoreProduct;ZLjava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;LBm/n;LBm/n;)V", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "getFinishTransactions", "()Z", "finishTransactions", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PostReceiptHelper {
    private final AppConfig appConfig;
    private final Backend backend;
    private final BillingAbstract billing;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DeviceCache deviceCache;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PaywallPresentedCache paywallPresentedCache;
    private final SubscriberAttributesManager subscriberAttributesManager;

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$calculateOfflineCustomerInfo$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126091 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126091(InterfaceC1436k interfaceC1436k) {
            super(1);
            this.$onSuccess = interfaceC1436k;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return C17296C.f55119a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            AbstractC16544l.m18094g(customerInfo, "customerInfo");
            PostReceiptHelper.this.customerInfoUpdateHandler.notifyListeners(customerInfo);
            this.$onSuccess.invoke(customerInfo);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$calculateOfflineCustomerInfo$2 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126102 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126102(InterfaceC1436k interfaceC1436k) {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postReceiptAndSubscriberAttributes$1 */
    @Metadata(m18066d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m18067d2 = {"", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "unsyncedSubscriberAttributesByKey", "Lmm/C;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126111 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ PostReceiptInitiationSource $initiationSource;
        final /* synthetic */ boolean $isRestore;
        final /* synthetic */ String $marketplace;
        final /* synthetic */ InterfaceC1440o $onError;
        final /* synthetic */ InterfaceC1436k $onSuccess;
        final /* synthetic */ PaywallEvent $presentedPaywall;
        final /* synthetic */ String $purchaseToken;
        final /* synthetic */ ReceiptInfo $receiptInfo;
        final /* synthetic */ String $storeUserID;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postReceiptAndSubscriberAttributes$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "postReceiptResponse", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {
            final /* synthetic */ String $appUserID;
            final /* synthetic */ InterfaceC1436k $onSuccess;
            final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedSubscriberAttributesByKey;
            final /* synthetic */ PostReceiptHelper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PostReceiptHelper postReceiptHelper, String str, Map<String, SubscriberAttribute> map, InterfaceC1436k interfaceC1436k) {
                super(1);
                this.this$0 = postReceiptHelper;
                this.$appUserID = str;
                this.$unsyncedSubscriberAttributesByKey = map;
                this.$onSuccess = interfaceC1436k;
            }

            @Override // p049Bm.InterfaceC1436k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PostReceiptResponse) obj);
                return C17296C.f55119a;
            }

            public final void invoke(PostReceiptResponse postReceiptResponse) {
                AbstractC16544l.m18094g(postReceiptResponse, "postReceiptResponse");
                this.this$0.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
                this.this$0.subscriberAttributesManager.markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, BackendHelpersKt.getAttributeErrors(postReceiptResponse.getBody()));
                this.this$0.customerInfoUpdateHandler.cacheAndNotifyListeners(postReceiptResponse.getCustomerInfo());
                this.$onSuccess.invoke(postReceiptResponse);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postReceiptAndSubscriberAttributes$1$2, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "errorHandlingBehavior", "Lorg/json/JSONObject;", "responseBody", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Lorg/json/JSONObject;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1440o {
            final /* synthetic */ String $appUserID;
            final /* synthetic */ InterfaceC1440o $onError;
            final /* synthetic */ PaywallEvent $presentedPaywall;
            final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedSubscriberAttributesByKey;
            final /* synthetic */ PostReceiptHelper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(PaywallEvent paywallEvent, PostReceiptHelper postReceiptHelper, String str, Map<String, SubscriberAttribute> map, InterfaceC1440o interfaceC1440o) {
                super(3);
                this.$presentedPaywall = paywallEvent;
                this.this$0 = postReceiptHelper;
                this.$appUserID = str;
                this.$unsyncedSubscriberAttributesByKey = map;
                this.$onError = interfaceC1440o;
            }

            @Override // p049Bm.InterfaceC1440o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((PurchasesError) obj, (PostReceiptErrorHandlingBehavior) obj2, (JSONObject) obj3);
                return C17296C.f55119a;
            }

            public final void invoke(PurchasesError error, PostReceiptErrorHandlingBehavior errorHandlingBehavior, JSONObject jSONObject) {
                AbstractC16544l.m18094g(error, "error");
                AbstractC16544l.m18094g(errorHandlingBehavior, "errorHandlingBehavior");
                PaywallEvent paywallEvent = this.$presentedPaywall;
                if (paywallEvent != null) {
                    this.this$0.paywallPresentedCache.cachePresentedPaywall(paywallEvent);
                }
                if (errorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED) {
                    this.this$0.subscriberAttributesManager.markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, BackendHelpersKt.getAttributeErrors(jSONObject));
                }
                this.$onError.invoke(error, errorHandlingBehavior, jSONObject);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126111(String str, String str2, boolean z6, ReceiptInfo receiptInfo, String str3, String str4, PostReceiptInitiationSource postReceiptInitiationSource, PaywallEvent paywallEvent, InterfaceC1436k interfaceC1436k, InterfaceC1440o interfaceC1440o) {
            super(1);
            this.$purchaseToken = str;
            this.$appUserID = str2;
            this.$isRestore = z6;
            this.$receiptInfo = receiptInfo;
            this.$storeUserID = str3;
            this.$marketplace = str4;
            this.$initiationSource = postReceiptInitiationSource;
            this.$presentedPaywall = paywallEvent;
            this.$onSuccess = interfaceC1436k;
            this.$onError = interfaceC1440o;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<String, SubscriberAttribute>) obj);
            return C17296C.f55119a;
        }

        public final void invoke(Map<String, SubscriberAttribute> unsyncedSubscriberAttributesByKey) {
            AbstractC16544l.m18094g(unsyncedSubscriberAttributesByKey, "unsyncedSubscriberAttributesByKey");
            Backend backend = PostReceiptHelper.this.backend;
            String str = this.$purchaseToken;
            String str2 = this.$appUserID;
            boolean z6 = this.$isRestore;
            boolean finishTransactions = PostReceiptHelper.this.getFinishTransactions();
            Map<String, Map<String, Object>> backendMap = BackendHelpersKt.toBackendMap(unsyncedSubscriberAttributesByKey);
            ReceiptInfo receiptInfo = this.$receiptInfo;
            String str3 = this.$storeUserID;
            String str4 = this.$marketplace;
            PostReceiptInitiationSource postReceiptInitiationSource = this.$initiationSource;
            PaywallEvent paywallEvent = this.$presentedPaywall;
            backend.postReceiptData(str, str2, z6, finishTransactions, backendMap, receiptInfo, str3, str4, postReceiptInitiationSource, paywallEvent != null ? paywallEvent.m14500x4be5d416() : null, new AnonymousClass1(PostReceiptHelper.this, this.$appUserID, unsyncedSubscriberAttributesByKey, this.$onSuccess), new AnonymousClass2(this.$presentedPaywall, PostReceiptHelper.this, this.$appUserID, unsyncedSubscriberAttributesByKey, this.$onError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "postReceiptResponse", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126121 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $onSuccess;
        final /* synthetic */ String $purchaseToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126121(String str, InterfaceC1436k interfaceC1436k) {
            super(1);
            this.$purchaseToken = str;
            this.$onSuccess = interfaceC1436k;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PostReceiptResponse) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PostReceiptResponse postReceiptResponse) {
            AbstractC16544l.m18094g(postReceiptResponse, "postReceiptResponse");
            PostReceiptHelper.this.deviceCache.addSuccessfullyPostedToken(this.$purchaseToken);
            this.$onSuccess.invoke(postReceiptResponse.getCustomerInfo());
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$2 */
    @Metadata(m18066d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "errorHandlingBehavior", "Lorg/json/JSONObject;", "<anonymous parameter 2>", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Lorg/json/JSONObject;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126132 extends AbstractC16546n implements InterfaceC1440o {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ InterfaceC1436k $onError;
        final /* synthetic */ InterfaceC1436k $onSuccess;
        final /* synthetic */ String $purchaseToken;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$2$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {
            final /* synthetic */ InterfaceC1436k $onSuccess;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC1436k interfaceC1436k) {
                super(1);
                this.$onSuccess = interfaceC1436k;
            }

            @Override // p049Bm.InterfaceC1436k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return C17296C.f55119a;
            }

            public final void invoke(CustomerInfo it) {
                AbstractC16544l.m18094g(it, "it");
                this.$onSuccess.invoke(it);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$2$2, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1426a {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ InterfaceC1436k $onError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC1436k interfaceC1436k, PurchasesError purchasesError) {
                super(0);
                this.$onError = interfaceC1436k;
                this.$backendError = purchasesError;
            }

            @Override // p049Bm.InterfaceC1426a
            public /* bridge */ /* synthetic */ Object invoke() {
                m22476invoke();
                return C17296C.f55119a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m22476invoke() {
                this.$onError.invoke(this.$backendError);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126132(String str, String str2, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
            super(3);
            this.$purchaseToken = str;
            this.$appUserID = str2;
            this.$onSuccess = interfaceC1436k;
            this.$onError = interfaceC1436k2;
        }

        @Override // p049Bm.InterfaceC1440o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((PurchasesError) obj, (PostReceiptErrorHandlingBehavior) obj2, (JSONObject) obj3);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError backendError, PostReceiptErrorHandlingBehavior errorHandlingBehavior, JSONObject jSONObject) {
            AbstractC16544l.m18094g(backendError, "backendError");
            AbstractC16544l.m18094g(errorHandlingBehavior, "errorHandlingBehavior");
            if (errorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED) {
                PostReceiptHelper.this.deviceCache.addSuccessfullyPostedToken(this.$purchaseToken);
            }
            PostReceiptHelper.this.useOfflineEntitlementsCustomerInfoIfNeeded(errorHandlingBehavior, this.$appUserID, new AnonymousClass1(this.$onSuccess), new AnonymousClass2(this.$onError, backendError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "postReceiptResponse", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126141 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ PostReceiptInitiationSource $initiationSource;
        final /* synthetic */ InterfaceC1439n $onSuccess;
        final /* synthetic */ StoreTransaction $purchase;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126141(StoreTransaction storeTransaction, PostReceiptInitiationSource postReceiptInitiationSource, InterfaceC1439n interfaceC1439n) {
            super(1);
            this.$purchase = storeTransaction;
            this.$initiationSource = postReceiptInitiationSource;
            this.$onSuccess = interfaceC1439n;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PostReceiptResponse) obj);
            return C17296C.f55119a;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x005d  */
        public final void invoke(PostReceiptResponse postReceiptResponse) {
            boolean zBooleanValue;
            PostReceiptProductInfo postReceiptProductInfo;
            Boolean shouldConsume;
            AbstractC16544l.m18094g(postReceiptResponse, "postReceiptResponse");
            Map<String, PostReceiptProductInfo> productInfoByProductId = postReceiptResponse.getProductInfoByProductId();
            if (productInfoByProductId != null) {
                StoreTransaction storeTransaction = this.$purchase;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, PostReceiptProductInfo> entry : productInfoByProductId.entrySet()) {
                    if (storeTransaction.getProductIds().contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Collection collectionValues = linkedHashMap.values();
                if (collectionValues == null || (postReceiptProductInfo = (PostReceiptProductInfo) AbstractC17680n.m19342R(collectionValues)) == null || (shouldConsume = postReceiptProductInfo.getShouldConsume()) == null) {
                    zBooleanValue = true;
                } else {
                    zBooleanValue = shouldConsume.booleanValue();
                }
            } else {
                zBooleanValue = true;
            }
            PostReceiptHelper.this.billing.consumeAndSave(PostReceiptHelper.this.getFinishTransactions(), this.$purchase, zBooleanValue, this.$initiationSource);
            InterfaceC1439n interfaceC1439n = this.$onSuccess;
            if (interfaceC1439n != null) {
                interfaceC1439n.invoke(this.$purchase, postReceiptResponse.getCustomerInfo());
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$2 */
    @Metadata(m18066d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "errorHandlingBehavior", "Lorg/json/JSONObject;", "<anonymous parameter 2>", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Lorg/json/JSONObject;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126152 extends AbstractC16546n implements InterfaceC1440o {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ PostReceiptInitiationSource $initiationSource;
        final /* synthetic */ InterfaceC1439n $onError;
        final /* synthetic */ InterfaceC1439n $onSuccess;
        final /* synthetic */ StoreTransaction $purchase;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$2$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {
            final /* synthetic */ InterfaceC1439n $onSuccess;
            final /* synthetic */ StoreTransaction $purchase;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC1439n interfaceC1439n, StoreTransaction storeTransaction) {
                super(1);
                this.$onSuccess = interfaceC1439n;
                this.$purchase = storeTransaction;
            }

            @Override // p049Bm.InterfaceC1436k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return C17296C.f55119a;
            }

            public final void invoke(CustomerInfo customerInfo) {
                AbstractC16544l.m18094g(customerInfo, "customerInfo");
                InterfaceC1439n interfaceC1439n = this.$onSuccess;
                if (interfaceC1439n != null) {
                    interfaceC1439n.invoke(this.$purchase, customerInfo);
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$2$2, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1426a {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ InterfaceC1439n $onError;
            final /* synthetic */ StoreTransaction $purchase;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC1439n interfaceC1439n, StoreTransaction storeTransaction, PurchasesError purchasesError) {
                super(0);
                this.$onError = interfaceC1439n;
                this.$purchase = storeTransaction;
                this.$backendError = purchasesError;
            }

            @Override // p049Bm.InterfaceC1426a
            public /* bridge */ /* synthetic */ Object invoke() {
                m22477invoke();
                return C17296C.f55119a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m22477invoke() {
                InterfaceC1439n interfaceC1439n = this.$onError;
                if (interfaceC1439n != null) {
                    interfaceC1439n.invoke(this.$purchase, this.$backendError);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126152(StoreTransaction storeTransaction, PostReceiptInitiationSource postReceiptInitiationSource, String str, InterfaceC1439n interfaceC1439n, InterfaceC1439n interfaceC1439n2) {
            super(3);
            this.$purchase = storeTransaction;
            this.$initiationSource = postReceiptInitiationSource;
            this.$appUserID = str;
            this.$onSuccess = interfaceC1439n;
            this.$onError = interfaceC1439n2;
        }

        @Override // p049Bm.InterfaceC1440o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((PurchasesError) obj, (PostReceiptErrorHandlingBehavior) obj2, (JSONObject) obj3);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError backendError, PostReceiptErrorHandlingBehavior errorHandlingBehavior, JSONObject jSONObject) {
            AbstractC16544l.m18094g(backendError, "backendError");
            AbstractC16544l.m18094g(errorHandlingBehavior, "errorHandlingBehavior");
            if (errorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED) {
                PostReceiptHelper.this.billing.consumeAndSave(PostReceiptHelper.this.getFinishTransactions(), this.$purchase, false, this.$initiationSource);
            }
            PostReceiptHelper.this.useOfflineEntitlementsCustomerInfoIfNeeded(errorHandlingBehavior, this.$appUserID, new AnonymousClass1(this.$onSuccess, this.$purchase), new AnonymousClass2(this.$onError, this.$purchase, backendError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$useOfflineEntitlementsCustomerInfoIfNeeded$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126161 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1426a $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126161(InterfaceC1426a interfaceC1426a) {
            super(1);
            this.$onError = interfaceC1426a;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC16544l.m18094g(it, "it");
            this.$onError.invoke();
        }
    }

    public PostReceiptHelper(AppConfig appConfig, Backend backend, BillingAbstract billing, CustomerInfoUpdateHandler customerInfoUpdateHandler, DeviceCache deviceCache, SubscriberAttributesManager subscriberAttributesManager, OfflineEntitlementsManager offlineEntitlementsManager, PaywallPresentedCache paywallPresentedCache) {
        AbstractC16544l.m18094g(appConfig, "appConfig");
        AbstractC16544l.m18094g(backend, "backend");
        AbstractC16544l.m18094g(billing, "billing");
        AbstractC16544l.m18094g(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        AbstractC16544l.m18094g(deviceCache, "deviceCache");
        AbstractC16544l.m18094g(subscriberAttributesManager, "subscriberAttributesManager");
        AbstractC16544l.m18094g(offlineEntitlementsManager, "offlineEntitlementsManager");
        AbstractC16544l.m18094g(paywallPresentedCache, "paywallPresentedCache");
        this.appConfig = appConfig;
        this.backend = backend;
        this.billing = billing;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.deviceCache = deviceCache;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.paywallPresentedCache = paywallPresentedCache;
    }

    private final void calculateOfflineCustomerInfo(String appUserID, InterfaceC1436k onSuccess, InterfaceC1436k onError) {
        this.offlineEntitlementsManager.calculateAndCacheOfflineCustomerInfo(appUserID, new C126091(onSuccess), new C126102(onError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getFinishTransactions() {
        return this.appConfig.getFinishTransactions();
    }

    private final void postReceiptAndSubscriberAttributes(String appUserID, String purchaseToken, boolean isRestore, ReceiptInfo receiptInfo, String storeUserID, String marketplace, PostReceiptInitiationSource initiationSource, InterfaceC1436k onSuccess, InterfaceC1440o onError) {
        this.subscriberAttributesManager.getUnsyncedSubscriberAttributes(appUserID, new C126111(purchaseToken, appUserID, isRestore, receiptInfo, storeUserID, marketplace, initiationSource, this.paywallPresentedCache.getAndRemovePresentedEvent(), onSuccess, onError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void useOfflineEntitlementsCustomerInfoIfNeeded(PostReceiptErrorHandlingBehavior errorHandlingBehavior, String appUserID, InterfaceC1436k onSuccess, InterfaceC1426a onError) {
        if (this.offlineEntitlementsManager.shouldCalculateOfflineCustomerInfoInPostReceipt(errorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_USE_OFFLINE_ENTITLEMENTS_AND_NOT_CONSUME)) {
            calculateOfflineCustomerInfo(appUserID, onSuccess, new C126161(onError));
        } else {
            onError.invoke();
        }
    }

    public final void postTokenWithoutConsuming(String purchaseToken, String storeUserID, ReceiptInfo receiptInfo, boolean isRestore, String appUserID, String marketplace, PostReceiptInitiationSource initiationSource, InterfaceC1436k onSuccess, InterfaceC1436k onError) {
        AbstractC16544l.m18094g(purchaseToken, vRJidSveZHcTw.vKTOomKBSbzbRYe);
        AbstractC16544l.m18094g(receiptInfo, "receiptInfo");
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(initiationSource, "initiationSource");
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, "onError");
        postReceiptAndSubscriberAttributes(appUserID, purchaseToken, isRestore, receiptInfo, storeUserID, marketplace, initiationSource, new C126121(purchaseToken, onSuccess), new C126132(purchaseToken, appUserID, onSuccess, onError));
    }

    public final void postTransactionAndConsumeIfNeeded(StoreTransaction purchase, StoreProduct storeProduct, boolean isRestore, String appUserID, PostReceiptInitiationSource initiationSource, InterfaceC1439n onSuccess, InterfaceC1439n onError) {
        AbstractC16544l.m18094g(purchase, "purchase");
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(initiationSource, "initiationSource");
        postReceiptAndSubscriberAttributes(appUserID, purchase.getPurchaseToken(), isRestore, new ReceiptInfo(purchase.getProductIds(), purchase.getPresentedOfferingContext(), purchase.getSubscriptionOptionId(), storeProduct, null, null, purchase.getReplacementMode(), 48, null), purchase.getStoreUserID(), purchase.getMarketplace(), initiationSource, new C126141(purchase, initiationSource, onSuccess), new C126152(purchase, initiationSource, appUserID, onSuccess, onError));
    }
}
