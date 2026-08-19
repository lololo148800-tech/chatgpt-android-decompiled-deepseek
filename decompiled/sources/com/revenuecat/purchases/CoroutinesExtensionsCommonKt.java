package com.revenuecat.purchases;

import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p523V9.AbstractC8154o0;
import p972qm.C18778k;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t*\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0012\u001a\u00020\u0011*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m18067d2 = {"Lcom/revenuecat/purchases/Purchases;", "Lcom/revenuecat/purchases/Offerings;", "awaitOfferings", "(Lcom/revenuecat/purchases/Purchases;Lqm/c;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/PurchaseParams;", "purchaseParams", "Lcom/revenuecat/purchases/PurchaseResult;", "awaitPurchase", "(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/PurchaseParams;Lqm/c;)Ljava/lang/Object;", "", "", "productIds", "Lcom/revenuecat/purchases/ProductType;", "type", "Lcom/revenuecat/purchases/models/StoreProduct;", "awaitGetProducts", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lqm/c;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/CustomerInfo;", "awaitRestore", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CoroutinesExtensionsCommonKt {
    public static final Object awaitGetProducts(Purchases purchases, List list, ProductType productType, InterfaceC18770c interfaceC18770c) {
        C18778k c18778k = new C18778k(AbstractC8154o0.m8714e(interfaceC18770c));
        ListenerConversionsCommonKt.getProductsWith(purchases, list, productType, new CoroutinesExtensionsCommonKt$awaitGetProducts$2$2(c18778k), new CoroutinesExtensionsCommonKt$awaitGetProducts$2$1(c18778k));
        Object objM20051a = c18778k.m20051a();
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM20051a;
    }

    public static /* synthetic */ Object awaitGetProducts$default(Purchases purchases, List list, ProductType productType, InterfaceC18770c interfaceC18770c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            productType = null;
        }
        return awaitGetProducts(purchases, list, productType, interfaceC18770c);
    }

    public static final Object awaitOfferings(Purchases purchases, InterfaceC18770c interfaceC18770c) {
        C18778k c18778k = new C18778k(AbstractC8154o0.m8714e(interfaceC18770c));
        ListenerConversionsCommonKt.getOfferingsWith(purchases, new CoroutinesExtensionsCommonKt$awaitOfferings$2$2(c18778k), new CoroutinesExtensionsCommonKt$awaitOfferings$2$1(c18778k));
        Object objM20051a = c18778k.m20051a();
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM20051a;
    }

    public static final Object awaitPurchase(Purchases purchases, PurchaseParams purchaseParams, InterfaceC18770c interfaceC18770c) {
        C18778k c18778k = new C18778k(AbstractC8154o0.m8714e(interfaceC18770c));
        purchases.purchase(purchaseParams, ListenerConversionsCommonKt.purchaseCompletedCallback(new CoroutinesExtensionsCommonKt$awaitPurchase$2$1(c18778k), new CoroutinesExtensionsCommonKt$awaitPurchase$2$2(c18778k)));
        Object objM20051a = c18778k.m20051a();
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM20051a;
    }

    public static final Object awaitRestore(Purchases purchases, InterfaceC18770c interfaceC18770c) {
        C18778k c18778k = new C18778k(AbstractC8154o0.m8714e(interfaceC18770c));
        ListenerConversionsCommonKt.restorePurchasesWith(purchases, new CoroutinesExtensionsCommonKt$awaitRestore$2$1(c18778k), new CoroutinesExtensionsCommonKt$awaitRestore$2$2(c18778k));
        Object objM20051a = c18778k.m20051a();
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM20051a;
    }
}
