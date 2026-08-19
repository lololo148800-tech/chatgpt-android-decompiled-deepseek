package com.revenuecat.purchases.google;

import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "storeTxn", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class BillingWrapper$onPurchasesUpdated$1$1 extends AbstractC16546n implements InterfaceC1436k {
    final /* synthetic */ List<Purchase> $notNullPurchasesList;
    final /* synthetic */ List<StoreTransaction> $storeTransactions;
    final /* synthetic */ BillingWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BillingWrapper$onPurchasesUpdated$1$1(List<StoreTransaction> list, List<? extends Purchase> list2, BillingWrapper billingWrapper) {
        super(1);
        this.$storeTransactions = list;
        this.$notNullPurchasesList = list2;
        this.this$0 = billingWrapper;
    }

    @Override // p049Bm.InterfaceC1436k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((StoreTransaction) obj);
        return C17296C.f55119a;
    }

    public final void invoke(StoreTransaction storeTxn) {
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener;
        AbstractC16544l.m18094g(storeTxn, "storeTxn");
        this.$storeTransactions.add(storeTxn);
        if (this.$storeTransactions.size() != this.$notNullPurchasesList.size() || (purchasesUpdatedListener = this.this$0.getPurchasesUpdatedListener()) == null) {
            return;
        }
        purchasesUpdatedListener.onPurchasesUpdated(this.$storeTransactions);
    }
}
