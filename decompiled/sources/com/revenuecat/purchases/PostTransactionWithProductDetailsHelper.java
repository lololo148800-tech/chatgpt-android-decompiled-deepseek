package com.revenuecat.purchases;

import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1439n;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J{\u0010\u0019\u001a\u00020\u00132\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\"\b\u0002\u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u00142\"\b\u0002\u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006\u001d"}, m18067d2 = {"Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/PostReceiptHelper;", "postReceiptHelper", "<init>", "(Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/PostReceiptHelper;)V", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "transactions", "", "allowSharingPlayStoreAccount", "", "appUserID", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lmm/C;", "Lcom/revenuecat/purchases/SuccessfulPurchaseCallback;", "transactionPostSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/ErrorPurchaseCallback;", "transactionPostError", "postTransactions", "(Ljava/util/List;ZLjava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;LBm/n;LBm/n;)V", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/PostReceiptHelper;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PostTransactionWithProductDetailsHelper {
    private final BillingAbstract billing;
    private final PostReceiptHelper postReceiptHelper;

    public PostTransactionWithProductDetailsHelper(BillingAbstract billing, PostReceiptHelper postReceiptHelper) {
        AbstractC16544l.m18094g(billing, "billing");
        AbstractC16544l.m18094g(postReceiptHelper, "postReceiptHelper");
        this.billing = billing;
        this.postReceiptHelper = postReceiptHelper;
    }

    public final void postTransactions(List<StoreTransaction> transactions, boolean allowSharingPlayStoreAccount, String appUserID, PostReceiptInitiationSource initiationSource, InterfaceC1439n transactionPostSuccess, InterfaceC1439n transactionPostError) {
        AbstractC16544l.m18094g(transactions, "transactions");
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(initiationSource, "initiationSource");
        for (StoreTransaction storeTransaction : transactions) {
            if (storeTransaction.getPurchaseState() != PurchaseState.PENDING) {
                this.billing.queryProductDetailsAsync(storeTransaction.getType(), AbstractC17680n.m19328G0(storeTransaction.getProductIds()), new PostTransactionWithProductDetailsHelper$postTransactions$1$1(storeTransaction, this, allowSharingPlayStoreAccount, appUserID, initiationSource, transactionPostSuccess, transactionPostError), new PostTransactionWithProductDetailsHelper$postTransactions$1$2(this, storeTransaction, allowSharingPlayStoreAccount, appUserID, initiationSource, transactionPostSuccess, transactionPostError));
            } else if (transactionPostError != null) {
                PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PaymentPendingError, null, 2, null);
                LogUtilsKt.errorLog(purchasesError);
                transactionPostError.invoke(storeTransaction, purchasesError);
            }
        }
    }
}
