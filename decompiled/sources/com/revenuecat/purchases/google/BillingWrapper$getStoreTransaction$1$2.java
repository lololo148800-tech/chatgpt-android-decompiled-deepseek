package com.revenuecat.purchases.google;

import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.ProductType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/ProductType;", "type", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/ProductType;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class BillingWrapper$getStoreTransaction$1$2 extends AbstractC16546n implements InterfaceC1436k {
    final /* synthetic */ InterfaceC1436k $completion;
    final /* synthetic */ Purchase $purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$getStoreTransaction$1$2(InterfaceC1436k interfaceC1436k, Purchase purchase) {
        super(1);
        this.$completion = interfaceC1436k;
        this.$purchase = purchase;
    }

    @Override // p049Bm.InterfaceC1436k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ProductType) obj);
        return C17296C.f55119a;
    }

    public final void invoke(ProductType type) {
        AbstractC16544l.m18094g(type, "type");
        this.$completion.invoke(StoreTransactionConversionsKt.toStoreTransaction$default(this.$purchase, type, null, null, null, 14, null));
    }
}
