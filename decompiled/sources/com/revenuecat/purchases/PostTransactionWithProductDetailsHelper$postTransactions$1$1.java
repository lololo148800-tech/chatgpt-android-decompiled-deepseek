package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProducts", "Lmm/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class PostTransactionWithProductDetailsHelper$postTransactions$1$1 extends AbstractC16546n implements InterfaceC1436k {
    final /* synthetic */ boolean $allowSharingPlayStoreAccount;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ PostReceiptInitiationSource $initiationSource;
    final /* synthetic */ StoreTransaction $transaction;
    final /* synthetic */ InterfaceC1439n $transactionPostError;
    final /* synthetic */ InterfaceC1439n $transactionPostSuccess;
    final /* synthetic */ PostTransactionWithProductDetailsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostTransactionWithProductDetailsHelper$postTransactions$1$1(StoreTransaction storeTransaction, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, boolean z6, String str, PostReceiptInitiationSource postReceiptInitiationSource, InterfaceC1439n interfaceC1439n, InterfaceC1439n interfaceC1439n2) {
        super(1);
        this.$transaction = storeTransaction;
        this.this$0 = postTransactionWithProductDetailsHelper;
        this.$allowSharingPlayStoreAccount = z6;
        this.$appUserID = str;
        this.$initiationSource = postReceiptInitiationSource;
        this.$transactionPostSuccess = interfaceC1439n;
        this.$transactionPostError = interfaceC1439n2;
    }

    @Override // p049Bm.InterfaceC1436k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) obj);
        return C17296C.f55119a;
    }

    public final void invoke(List<? extends StoreProduct> storeProducts) {
        StoreProduct storeProduct;
        AbstractC16544l.m18094g(storeProducts, "storeProducts");
        Object obj = null;
        if (this.$transaction.getType() == ProductType.SUBS && this.$transaction.getMarketplace() == null) {
            StoreTransaction storeTransaction = this.$transaction;
            loop0: for (Object obj2 : storeProducts) {
                SubscriptionOptions subscriptionOptions = ((StoreProduct) obj2).getSubscriptionOptions();
                if (subscriptionOptions != null && !subscriptionOptions.isEmpty()) {
                    Iterator<SubscriptionOption> it = subscriptionOptions.iterator();
                    while (it.hasNext()) {
                        if (AbstractC16544l.m18089b(it.next().getId(), storeTransaction.getSubscriptionOptionId())) {
                            obj = obj2;
                            break loop0;
                        }
                    }
                }
            }
            storeProduct = (StoreProduct) obj;
        } else {
            StoreTransaction storeTransaction2 = this.$transaction;
            for (Object obj3 : storeProducts) {
                if (AbstractC16544l.m18089b(((StoreProduct) obj3).getId(), AbstractC17680n.m19343S(storeTransaction2.getProductIds()))) {
                    obj = obj3;
                    break;
                }
            }
            storeProduct = (StoreProduct) obj;
        }
        StoreProduct storeProduct2 = storeProduct;
        LogUtilsKt.debugLog("Store product found for transaction: " + storeProduct2);
        this.this$0.postReceiptHelper.postTransactionAndConsumeIfNeeded(this.$transaction, storeProduct2, this.$allowSharingPlayStoreAccount, this.$appUserID, this.$initiationSource, this.$transactionPostSuccess, this.$transactionPostError);
    }
}
