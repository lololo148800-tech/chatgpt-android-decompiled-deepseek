package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProducts", "Lmm/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class PurchasesOrchestrator$getProductsOfTypes$1$1 extends AbstractC16546n implements InterfaceC1436k {
    final /* synthetic */ GetStoreProductsCallback $callback;
    final /* synthetic */ List<StoreProduct> $collectedStoreProducts;
    final /* synthetic */ Set<String> $productIds;
    final /* synthetic */ Set<ProductType> $typesRemaining;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getProductsOfTypes$1$1$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126301 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ GetStoreProductsCallback $callback;
        final /* synthetic */ List<StoreProduct> $collectedStoreProducts;
        final /* synthetic */ Set<String> $productIds;
        final /* synthetic */ List<StoreProduct> $storeProducts;
        final /* synthetic */ Set<ProductType> $typesRemaining;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C126301(PurchasesOrchestrator purchasesOrchestrator, Set<String> set, Set<ProductType> set2, List<? extends StoreProduct> list, List<? extends StoreProduct> list2, GetStoreProductsCallback getStoreProductsCallback) {
            super(0);
            this.this$0 = purchasesOrchestrator;
            this.$productIds = set;
            this.$typesRemaining = set2;
            this.$collectedStoreProducts = list;
            this.$storeProducts = list2;
            this.$callback = getStoreProductsCallback;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22482invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22482invoke() {
            this.this$0.getProductsOfTypes(this.$productIds, this.$typesRemaining, AbstractC17680n.m19361k0(this.$storeProducts, this.$collectedStoreProducts), this.$callback);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PurchasesOrchestrator$getProductsOfTypes$1$1(PurchasesOrchestrator purchasesOrchestrator, Set<String> set, Set<ProductType> set2, List<? extends StoreProduct> list, GetStoreProductsCallback getStoreProductsCallback) {
        super(1);
        this.this$0 = purchasesOrchestrator;
        this.$productIds = set;
        this.$typesRemaining = set2;
        this.$collectedStoreProducts = list;
        this.$callback = getStoreProductsCallback;
    }

    @Override // p049Bm.InterfaceC1436k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) obj);
        return C17296C.f55119a;
    }

    public final void invoke(List<? extends StoreProduct> storeProducts) {
        AbstractC16544l.m18094g(storeProducts, "storeProducts");
        PurchasesOrchestrator purchasesOrchestrator = this.this$0;
        purchasesOrchestrator.dispatch(new C126301(purchasesOrchestrator, this.$productIds, this.$typesRemaining, this.$collectedStoreProducts, storeProducts, this.$callback));
    }
}
