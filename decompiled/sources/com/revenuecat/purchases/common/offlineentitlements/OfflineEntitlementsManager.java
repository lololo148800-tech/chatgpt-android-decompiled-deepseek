package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010 \u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00110\u001b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001b¢\u0006\u0004\b \u0010!J'\u0010#\u001a\u00020\u00112\u0018\b\u0002\u0010\"\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001b¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\"\u0010+\u001a\u0004\u0018\u00010\u001c2\b\u0010*\u001a\u0004\u0018\u00010\u001c8B@BX\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,RN\u00101\u001a<\u0012\u0004\u0012\u00020\u0015\u00122\u00120\u0012,\u0012*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00110\u001b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001b0/j\u0002`00.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0013\u00105\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, m18067d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCalculator;", "offlineCustomerInfoCalculator", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTracker", "<init>", "(Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCalculator;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;)V", "", "isOfflineEntitlementsEnabled", "()Z", "Lmm/C;", "resetOfflineCustomerInfoCache", "()V", "isServerError", "", "appUserId", "shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest", "(ZLjava/lang/String;)Z", "shouldCalculateOfflineCustomerInfoInPostReceipt", "(Z)Z", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "calculateAndCacheOfflineCustomerInfo", "(Ljava/lang/String;LBm/k;LBm/k;)V", "completion", "updateProductEntitlementMappingCacheIfStale", "(LBm/k;)V", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCalculator;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "<set-?>", "_offlineCustomerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "", "", "Lmm/l;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCallback;", "offlineCustomerInfoCallbackCache", "Ljava/util/Map;", "getOfflineCustomerInfo", "()Lcom/revenuecat/purchases/CustomerInfo;", "offlineCustomerInfo", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class OfflineEntitlementsManager {
    private CustomerInfo _offlineCustomerInfo;
    private final AppConfig appConfig;
    private final Backend backend;
    private final DeviceCache deviceCache;
    private final DiagnosticsTracker diagnosticsTracker;
    private final OfflineCustomerInfoCalculator offlineCustomerInfoCalculator;
    private final Map<String, List<C17309l>> offlineCustomerInfoCallbackCache;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager$calculateAndCacheOfflineCustomerInfo$2 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127052 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ String $appUserId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127052(String str) {
            super(1);
            this.$appUserId = str;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return C17296C.f55119a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            AbstractC16544l.m18094g(customerInfo, "customerInfo");
            OfflineEntitlementsManager offlineEntitlementsManager = OfflineEntitlementsManager.this;
            String str = this.$appUserId;
            synchronized (offlineEntitlementsManager) {
                try {
                    LogUtilsKt.warnLog(OfflineEntitlementsStrings.USING_OFFLINE_ENTITLEMENTS_CUSTOMER_INFO);
                    DiagnosticsTracker diagnosticsTracker = offlineEntitlementsManager.diagnosticsTracker;
                    if (diagnosticsTracker != null) {
                        diagnosticsTracker.trackEnteredOfflineEntitlementsMode();
                    }
                    offlineEntitlementsManager._offlineCustomerInfo = customerInfo;
                    String cachedAppUserID = offlineEntitlementsManager.deviceCache.getCachedAppUserID();
                    if (cachedAppUserID != null) {
                        offlineEntitlementsManager.deviceCache.clearCustomerInfoCache(cachedAppUserID);
                    }
                    List list = (List) offlineEntitlementsManager.offlineCustomerInfoCallbackCache.remove(str);
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC1436k) ((C17309l) it.next()).f55136Y).invoke(customerInfo);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager$calculateAndCacheOfflineCustomerInfo$3 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127063 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ String $appUserId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127063(String str) {
            super(1);
            this.$appUserId = str;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC16544l.m18094g(it, "it");
            OfflineEntitlementsManager offlineEntitlementsManager = OfflineEntitlementsManager.this;
            String str = this.$appUserId;
            synchronized (offlineEntitlementsManager) {
                List list = (List) offlineEntitlementsManager.offlineCustomerInfoCallbackCache.remove(str);
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1436k) ((C17309l) it2.next()).f55137Z).invoke(it);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager$updateProductEntitlementMappingCacheIfStale$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "productEntitlementMapping", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127071 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127071(InterfaceC1436k interfaceC1436k) {
            super(1);
            this.$completion = interfaceC1436k;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ProductEntitlementMapping) obj);
            return C17296C.f55119a;
        }

        public final void invoke(ProductEntitlementMapping productEntitlementMapping) {
            AbstractC16544l.m18094g(productEntitlementMapping, "productEntitlementMapping");
            OfflineEntitlementsManager.this.deviceCache.cacheProductEntitlementMapping(productEntitlementMapping);
            LogUtilsKt.debugLog(OfflineEntitlementsStrings.SUCCESSFULLY_UPDATED_PRODUCT_ENTITLEMENTS);
            InterfaceC1436k interfaceC1436k = this.$completion;
            if (interfaceC1436k != null) {
                interfaceC1436k.invoke(null);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager$updateProductEntitlementMappingCacheIfStale$2 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "e", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127082 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127082(InterfaceC1436k interfaceC1436k) {
            super(1);
            this.$completion = interfaceC1436k;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError e10) {
            AbstractC16544l.m18094g(e10, "e");
            LogUtilsKt.errorLog$default(String.format(OfflineEntitlementsStrings.ERROR_UPDATING_PRODUCT_ENTITLEMENTS, Arrays.copyOf(new Object[]{e10}, 1)), null, 2, null);
            InterfaceC1436k interfaceC1436k = this.$completion;
            if (interfaceC1436k != null) {
                interfaceC1436k.invoke(e10);
            }
        }
    }

    public OfflineEntitlementsManager(Backend backend, OfflineCustomerInfoCalculator offlineCustomerInfoCalculator, DeviceCache deviceCache, AppConfig appConfig, DiagnosticsTracker diagnosticsTracker) {
        AbstractC16544l.m18094g(backend, "backend");
        AbstractC16544l.m18094g(offlineCustomerInfoCalculator, "offlineCustomerInfoCalculator");
        AbstractC16544l.m18094g(deviceCache, "deviceCache");
        AbstractC16544l.m18094g(appConfig, "appConfig");
        this.backend = backend;
        this.offlineCustomerInfoCalculator = offlineCustomerInfoCalculator;
        this.deviceCache = deviceCache;
        this.appConfig = appConfig;
        this.diagnosticsTracker = diagnosticsTracker;
        this.offlineCustomerInfoCallbackCache = new LinkedHashMap();
    }

    private final boolean isOfflineEntitlementsEnabled() {
        return this.appConfig.getFinishTransactions() && this.appConfig.getEnableOfflineEntitlements() && !this.appConfig.getCustomEntitlementComputation();
    }

    public static /* synthetic */ void updateProductEntitlementMappingCacheIfStale$default(OfflineEntitlementsManager offlineEntitlementsManager, InterfaceC1436k interfaceC1436k, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC1436k = null;
        }
        offlineEntitlementsManager.updateProductEntitlementMappingCacheIfStale(interfaceC1436k);
    }

    public final void calculateAndCacheOfflineCustomerInfo(String appUserId, InterfaceC1436k onSuccess, InterfaceC1436k onError) {
        AbstractC16544l.m18094g(appUserId, "appUserId");
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, "onError");
        if (!this.appConfig.getEnableOfflineEntitlements()) {
            onError.invoke(new PurchasesError(PurchasesErrorCode.UnsupportedError, OfflineEntitlementsStrings.OFFLINE_ENTITLEMENTS_NOT_ENABLED));
            return;
        }
        synchronized (this) {
            boolean zContainsKey = this.offlineCustomerInfoCallbackCache.containsKey(appUserId);
            List<C17309l> list = this.offlineCustomerInfoCallbackCache.get(appUserId);
            if (list == null) {
                list = C17689w.f56480Y;
            }
            this.offlineCustomerInfoCallbackCache.put(appUserId, AbstractC17680n.m19361k0(AbstractC9393x3.m9974d(new C17309l(onSuccess, onError)), list));
            if (zContainsKey) {
                LogUtilsKt.debugLog(String.format(OfflineEntitlementsStrings.ALREADY_CALCULATING_OFFLINE_CUSTOMER_INFO, Arrays.copyOf(new Object[]{appUserId}, 1)));
            } else {
                this.offlineCustomerInfoCalculator.computeOfflineCustomerInfo(appUserId, new C127052(appUserId), new C127063(appUserId));
            }
        }
    }

    /* JADX INFO: renamed from: getOfflineCustomerInfo, reason: from getter */
    public final CustomerInfo get_offlineCustomerInfo() {
        return this._offlineCustomerInfo;
    }

    public final synchronized void resetOfflineCustomerInfoCache() {
        if (this._offlineCustomerInfo != null) {
            LogUtilsKt.debugLog(OfflineEntitlementsStrings.RESETTING_OFFLINE_CUSTOMER_INFO_CACHE);
            this._offlineCustomerInfo = null;
        }
    }

    public final boolean shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest(boolean isServerError, String appUserId) {
        AbstractC16544l.m18094g(appUserId, "appUserId");
        return isServerError && isOfflineEntitlementsEnabled() && this.deviceCache.getCachedCustomerInfo(appUserId) == null;
    }

    public final boolean shouldCalculateOfflineCustomerInfoInPostReceipt(boolean isServerError) {
        return isServerError && isOfflineEntitlementsEnabled();
    }

    public final void updateProductEntitlementMappingCacheIfStale(InterfaceC1436k completion) {
        if (isOfflineEntitlementsEnabled() && this.deviceCache.isProductEntitlementMappingCacheStale()) {
            LogUtilsKt.debugLog(OfflineEntitlementsStrings.UPDATING_PRODUCT_ENTITLEMENT_MAPPING);
            this.backend.getProductEntitlementMapping(new C127071(completion), new C127082(completion));
        } else if (completion != null) {
            completion.invoke(null);
        }
    }
}
