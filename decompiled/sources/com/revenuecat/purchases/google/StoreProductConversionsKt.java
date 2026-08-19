package com.revenuecat.purchases.google;

import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p826j6.C16159m;
import p826j6.C16161o;
import p826j6.C16162p;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lj6/p;", "Lcom/revenuecat/purchases/models/StoreProduct;", "toInAppStoreProduct", "(Lj6/p;)Lcom/revenuecat/purchases/models/StoreProduct;", "", "Lj6/o;", "offerDetails", "Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "toStoreProduct", "(Lj6/p;Ljava/util/List;)Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "Lcom/revenuecat/purchases/models/Price;", "createOneTimeProductPrice", "(Lj6/p;)Lcom/revenuecat/purchases/models/Price;", "toStoreProducts", "(Ljava/util/List;)Ljava/util/List;", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class StoreProductConversionsKt {
    private static final Price createOneTimeProductPrice(C16162p c16162p) {
        C16159m c16159mM17779a;
        if (ProductTypeConversionsKt.toRevenueCatProductType(c16162p.f50178d) != ProductType.INAPP || (c16159mM17779a = c16162p.m17779a()) == null) {
            return null;
        }
        String str = c16159mM17779a.f50157a;
        AbstractC16544l.m18093f(str, "it.formattedPrice");
        String str2 = c16159mM17779a.f50159c;
        AbstractC16544l.m18093f(str2, "it.priceCurrencyCode");
        return new Price(str, c16159mM17779a.f50158b, str2);
    }

    public static final StoreProduct toInAppStoreProduct(C16162p c16162p) {
        AbstractC16544l.m18094g(c16162p, "<this>");
        return toStoreProduct(c16162p, C17689w.f56480Y);
    }

    public static final GoogleStoreProduct toStoreProduct(C16162p c16162p, List<C16161o> offerDetails) {
        SubscriptionOptions subscriptionOptions;
        Price price;
        PricingPhase fullPricePhase;
        AbstractC16544l.m18094g(c16162p, "<this>");
        AbstractC16544l.m18094g(offerDetails, "offerDetails");
        String str = c16162p.f50178d;
        ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(str);
        ProductType productType = ProductType.SUBS;
        String productId = c16162p.f50177c;
        if (revenueCatProductType == productType) {
            List<C16161o> list = offerDetails;
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
            for (C16161o c16161o : list) {
                AbstractC16544l.m18093f(productId, "productId");
                arrayList.add(SubscriptionOptionConversionsKt.toSubscriptionOption(c16161o, productId, c16162p));
            }
            subscriptionOptions = new SubscriptionOptions(arrayList);
        } else {
            subscriptionOptions = null;
        }
        SubscriptionOption basePlan = subscriptionOptions != null ? subscriptionOptions.getBasePlan() : null;
        Price price2 = (basePlan == null || (fullPricePhase = basePlan.getFullPricePhase()) == null) ? null : fullPricePhase.getPrice();
        Price priceCreateOneTimeProductPrice = createOneTimeProductPrice(c16162p);
        if (priceCreateOneTimeProductPrice != null) {
            price = priceCreateOneTimeProductPrice;
        } else {
            if (price2 == null) {
                return null;
            }
            price = price2;
        }
        AbstractC16544l.m18093f(productId, "productId");
        String id2 = basePlan != null ? basePlan.getId() : null;
        ProductType revenueCatProductType2 = ProductTypeConversionsKt.toRevenueCatProductType(str);
        String name = c16162p.f50180f;
        AbstractC16544l.m18093f(name, "name");
        String title = c16162p.f50179e;
        AbstractC16544l.m18093f(title, "title");
        String description = c16162p.f50181g;
        AbstractC16544l.m18093f(description, "description");
        return new GoogleStoreProduct(productId, id2, revenueCatProductType2, price, name, title, description, basePlan != null ? basePlan.getBillingPeriod() : null, subscriptionOptions, subscriptionOptions != null ? subscriptionOptions.getDefaultOffer() : null, c16162p, (PresentedOfferingContext) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v0, types: [nm.x] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.LinkedHashMap, java.util.Map] */
    public static final List<StoreProduct> toStoreProducts(List<C16162p> list) {
        ?? arrayList;
        ?? linkedHashMap;
        AbstractC16544l.m18094g(list, "<this>");
        ArrayList arrayList2 = new ArrayList();
        for (C16162p c16162p : list) {
            ArrayList arrayList3 = c16162p.f50184j;
            C17689w c17689w = C17689w.f56480Y;
            if (arrayList3 != null) {
                arrayList = new ArrayList();
                for (Object obj : arrayList3) {
                    C16161o it = (C16161o) obj;
                    AbstractC16544l.m18093f(it, "it");
                    if (SubscriptionOptionConversionsKt.isBasePlan(it)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = c17689w;
            }
            ArrayList arrayList4 = c16162p.f50184j;
            if (arrayList4 != null) {
                linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList4) {
                    String str = ((C16161o) obj2).f50169a;
                    Object arrayList5 = linkedHashMap.get(str);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        linkedHashMap.put(str, arrayList5);
                    }
                    ((List) arrayList5).add(obj2);
                }
            } else {
                linkedHashMap = C17690x.f56481Y;
            }
            boolean zIsEmpty = arrayList.isEmpty();
            ?? r6 = arrayList;
            if (zIsEmpty) {
                r6 = 0;
            }
            String str2 = c16162p.f50177c;
            if (r6 != 0) {
                Iterator it2 = ((Iterable) r6).iterator();
                while (it2.hasNext()) {
                    List list2 = (List) linkedHashMap.get(((C16161o) it2.next()).f50169a);
                    if (list2 == null) {
                        list2 = c17689w;
                    }
                    GoogleStoreProduct storeProduct = toStoreProduct(c16162p, list2);
                    if (storeProduct != null) {
                        arrayList2.add(storeProduct);
                    } else {
                        AbstractC12107L1.m13831v(new Object[]{str2}, 1, PurchaseStrings.INVALID_PRODUCT_NO_PRICE, LogIntent.RC_ERROR);
                    }
                }
            } else {
                StoreProduct inAppStoreProduct = toInAppStoreProduct(c16162p);
                if (inAppStoreProduct != null) {
                    arrayList2.add(inAppStoreProduct);
                } else {
                    AbstractC12107L1.m13831v(new Object[]{str2}, 1, PurchaseStrings.INVALID_PRODUCT_NO_PRICE, LogIntent.RC_ERROR);
                }
            }
        }
        return arrayList2;
    }
}
