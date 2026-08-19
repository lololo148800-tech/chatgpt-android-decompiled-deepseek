package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;

/* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getProductChangeCompletedCallbacks$onError$1 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "<anonymous parameter 0>", "Lcom/revenuecat/purchases/PurchasesError;", "error", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class C12626xca5e6606 extends AbstractC16546n implements InterfaceC1439n {
    final /* synthetic */ ProductChangeCallback $productChangeListener;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12626xca5e6606(ProductChangeCallback productChangeCallback, PurchasesOrchestrator purchasesOrchestrator) {
        super(2);
        this.$productChangeListener = productChangeCallback;
        this.this$0 = purchasesOrchestrator;
    }

    @Override // p049Bm.InterfaceC1439n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((StoreTransaction) obj, (PurchasesError) obj2);
        return C17296C.f55119a;
    }

    public final void invoke(StoreTransaction storeTransaction, PurchasesError error) {
        AbstractC16544l.m18094g(storeTransaction, "<anonymous parameter 0>");
        AbstractC16544l.m18094g(error, "error");
        ProductChangeCallback productChangeCallback = this.$productChangeListener;
        if (productChangeCallback != null) {
            this.this$0.dispatch(productChangeCallback, error);
        }
    }
}
