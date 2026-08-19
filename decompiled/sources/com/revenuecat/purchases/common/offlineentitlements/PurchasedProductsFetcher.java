package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014JC\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0018\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!¨\u0006\""}, m18067d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProductsFetcher;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/common/DateProvider;)V", "Lcom/revenuecat/purchases/models/StoreTransaction;", "transaction", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "productEntitlementMapping", "Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProduct;", "createPurchasedProduct", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;)Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProduct;", "purchaseAssociatedToProduct", "Ljava/util/Date;", "getExpirationDate", "(Lcom/revenuecat/purchases/models/StoreTransaction;)Ljava/util/Date;", "", "appUserID", "Lkotlin/Function1;", "", "Lmm/C;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "queryActiveProducts", "(Ljava/lang/String;LBm/k;LBm/k;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/common/DateProvider;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PurchasedProductsFetcher {
    private final BillingAbstract billing;
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.SUBS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.PurchasedProductsFetcher$queryActiveProducts$1 */
    @Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "activePurchasesByHashedToken", "Lmm/C;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127091 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $onSuccess;
        final /* synthetic */ ProductEntitlementMapping $productEntitlementMapping;
        final /* synthetic */ PurchasedProductsFetcher this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127091(InterfaceC1436k interfaceC1436k, PurchasedProductsFetcher purchasedProductsFetcher, ProductEntitlementMapping productEntitlementMapping) {
            super(1);
            this.$onSuccess = interfaceC1436k;
            this.this$0 = purchasedProductsFetcher;
            this.$productEntitlementMapping = productEntitlementMapping;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<String, StoreTransaction>) obj);
            return C17296C.f55119a;
        }

        public final void invoke(Map<String, StoreTransaction> activePurchasesByHashedToken) {
            AbstractC16544l.m18094g(activePurchasesByHashedToken, "activePurchasesByHashedToken");
            List listM19322C0 = AbstractC17680n.m19322C0(activePurchasesByHashedToken.values());
            PurchasedProductsFetcher purchasedProductsFetcher = this.this$0;
            ProductEntitlementMapping productEntitlementMapping = this.$productEntitlementMapping;
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listM19322C0, 10));
            Iterator it = listM19322C0.iterator();
            while (it.hasNext()) {
                arrayList.add(purchasedProductsFetcher.createPurchasedProduct((StoreTransaction) it.next(), productEntitlementMapping));
            }
            this.$onSuccess.invoke(arrayList);
        }
    }

    public PurchasedProductsFetcher(DeviceCache deviceCache, BillingAbstract billing, DateProvider dateProvider) {
        AbstractC16544l.m18094g(deviceCache, "deviceCache");
        AbstractC16544l.m18094g(billing, "billing");
        AbstractC16544l.m18094g(dateProvider, "dateProvider");
        this.deviceCache = deviceCache;
        this.billing = billing;
        this.dateProvider = dateProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PurchasedProduct createPurchasedProduct(StoreTransaction transaction, ProductEntitlementMapping productEntitlementMapping) {
        List<String> entitlements;
        Date expirationDate = getExpirationDate(transaction);
        String str = (String) AbstractC17680n.m19341Q(transaction.getProductIds());
        ProductEntitlementMapping.Mapping mapping = productEntitlementMapping.getMappings().get(str);
        String basePlanId = mapping != null ? mapping.getBasePlanId() : null;
        if (mapping == null || (entitlements = mapping.getEntitlements()) == null) {
            entitlements = C17689w.f56480Y;
        }
        return new PurchasedProduct(str, basePlanId, transaction, entitlements, expirationDate);
    }

    private final Date getExpirationDate(StoreTransaction purchaseAssociatedToProduct) {
        if (WhenMappings.$EnumSwitchMapping$0[purchaseAssociatedToProduct.getType().ordinal()] != 1) {
            return null;
        }
        return new Date(TimeUnit.DAYS.toMillis(1L) + this.dateProvider.getNow().getTime());
    }

    public final void queryActiveProducts(String appUserID, InterfaceC1436k onSuccess, InterfaceC1436k onError) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, "onError");
        ProductEntitlementMapping productEntitlementMapping = this.deviceCache.getProductEntitlementMapping();
        if (productEntitlementMapping == null) {
            onError.invoke(new PurchasesError(PurchasesErrorCode.CustomerInfoError, OfflineEntitlementsStrings.PRODUCT_ENTITLEMENT_MAPPING_REQUIRED));
        } else {
            this.billing.queryPurchases(appUserID, new C127091(onSuccess, this, productEntitlementMapping), onError);
        }
    }

    public /* synthetic */ PurchasedProductsFetcher(DeviceCache deviceCache, BillingAbstract billingAbstract, DateProvider dateProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceCache, billingAbstract, (i10 & 4) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
