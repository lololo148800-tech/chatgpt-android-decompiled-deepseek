package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class PostTransactionWithProductDetailsHelper$postTransactions$1$2 extends AbstractC16546n implements InterfaceC1436k {
    final /* synthetic */ boolean $allowSharingPlayStoreAccount;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ PostReceiptInitiationSource $initiationSource;
    final /* synthetic */ StoreTransaction $transaction;
    final /* synthetic */ InterfaceC1439n $transactionPostError;
    final /* synthetic */ InterfaceC1439n $transactionPostSuccess;
    final /* synthetic */ PostTransactionWithProductDetailsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostTransactionWithProductDetailsHelper$postTransactions$1$2(PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, StoreTransaction storeTransaction, boolean z6, String str, PostReceiptInitiationSource postReceiptInitiationSource, InterfaceC1439n interfaceC1439n, InterfaceC1439n interfaceC1439n2) {
        super(1);
        this.this$0 = postTransactionWithProductDetailsHelper;
        this.$transaction = storeTransaction;
        this.$allowSharingPlayStoreAccount = z6;
        this.$appUserID = str;
        this.$initiationSource = postReceiptInitiationSource;
        this.$transactionPostSuccess = interfaceC1439n;
        this.$transactionPostError = interfaceC1439n2;
    }

    @Override // p049Bm.InterfaceC1436k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return C17296C.f55119a;
    }

    public final void invoke(PurchasesError it) {
        AbstractC16544l.m18094g(it, "it");
        this.this$0.postReceiptHelper.postTransactionAndConsumeIfNeeded(this.$transaction, null, this.$allowSharingPlayStoreAccount, this.$appUserID, this.$initiationSource, this.$transactionPostSuccess, this.$transactionPostError);
    }
}
