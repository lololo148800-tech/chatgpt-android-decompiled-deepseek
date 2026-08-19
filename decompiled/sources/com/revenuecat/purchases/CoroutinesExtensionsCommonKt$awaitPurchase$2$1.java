package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p972qm.InterfaceC18770c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "storeTransaction", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class CoroutinesExtensionsCommonKt$awaitPurchase$2$1 extends AbstractC16546n implements InterfaceC1439n {
    final /* synthetic */ InterfaceC18770c<PurchaseResult> $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutinesExtensionsCommonKt$awaitPurchase$2$1(InterfaceC18770c<? super PurchaseResult> interfaceC18770c) {
        super(2);
        this.$continuation = interfaceC18770c;
    }

    @Override // p049Bm.InterfaceC1439n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((StoreTransaction) obj, (CustomerInfo) obj2);
        return C17296C.f55119a;
    }

    public final void invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        AbstractC16544l.m18094g(storeTransaction, "storeTransaction");
        AbstractC16544l.m18094g(customerInfo, "customerInfo");
        this.$continuation.resumeWith(new PurchaseResult(storeTransaction, customerInfo));
    }
}
