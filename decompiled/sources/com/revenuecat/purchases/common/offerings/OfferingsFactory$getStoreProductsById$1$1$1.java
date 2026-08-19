package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "inAppProducts", "Lmm/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class OfferingsFactory$getStoreProductsById$1$1$1 extends AbstractC16546n implements InterfaceC1436k {
    final /* synthetic */ InterfaceC1436k $onCompleted;
    final /* synthetic */ Map<String, List<StoreProduct>> $productsById;
    final /* synthetic */ OfferingsFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsFactory$getStoreProductsById$1$1$1(OfferingsFactory offeringsFactory, Map<String, List<StoreProduct>> map, InterfaceC1436k interfaceC1436k) {
        super(1);
        this.this$0 = offeringsFactory;
        this.$productsById = map;
        this.$onCompleted = interfaceC1436k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(Map productsById, List inAppProducts, InterfaceC1436k onCompleted) {
        AbstractC16544l.m18094g(productsById, "$productsById");
        AbstractC16544l.m18094g(inAppProducts, "$inAppProducts");
        AbstractC16544l.m18094g(onCompleted, "$onCompleted");
        List<StoreProduct> list = inAppProducts;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        for (StoreProduct storeProduct : list) {
            arrayList.add(new C17309l(storeProduct.getPurchasingData().getProductId(), AbstractC9393x3.m9974d(storeProduct)));
        }
        AbstractC17659D.m19251m(productsById, arrayList);
        onCompleted.invoke(productsById);
    }

    @Override // p049Bm.InterfaceC1436k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) obj);
        return C17296C.f55119a;
    }

    public final void invoke(final List<? extends StoreProduct> inAppProducts) {
        AbstractC16544l.m18094g(inAppProducts, "inAppProducts");
        Dispatcher dispatcher = this.this$0.dispatcher;
        final Map<String, List<StoreProduct>> map = this.$productsById;
        final InterfaceC1436k interfaceC1436k = this.$onCompleted;
        Dispatcher.enqueue$default(dispatcher, new Runnable() { // from class: com.revenuecat.purchases.common.offerings.b
            @Override // java.lang.Runnable
            public final void run() {
                OfferingsFactory$getStoreProductsById$1$1$1.invoke$lambda$1(map, inAppProducts, interfaceC1436k);
            }
        }, null, 2, null);
    }
}
