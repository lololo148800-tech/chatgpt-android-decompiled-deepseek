package com.revenuecat.purchases;

import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.RestoreStrings;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchasesByHashedToken", "Lmm/C;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$1 extends AbstractC16546n implements InterfaceC1436k {
    final /* synthetic */ boolean $allowSharingPlayStoreAccount;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ InterfaceC1436k $onError;
    final /* synthetic */ InterfaceC1436k $onSuccess;
    final /* synthetic */ PostPendingTransactionsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$1(PostPendingTransactionsHelper postPendingTransactionsHelper, boolean z6, String str, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
        super(1);
        this.this$0 = postPendingTransactionsHelper;
        this.$allowSharingPlayStoreAccount = z6;
        this.$appUserID = str;
        this.$onError = interfaceC1436k;
        this.$onSuccess = interfaceC1436k2;
    }

    @Override // p049Bm.InterfaceC1436k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map<String, StoreTransaction>) obj);
        return C17296C.f55119a;
    }

    public final void invoke(Map<String, StoreTransaction> purchasesByHashedToken) {
        AbstractC16544l.m18094g(purchasesByHashedToken, "purchasesByHashedToken");
        for (Map.Entry<String, StoreTransaction> entry : purchasesByHashedToken.entrySet()) {
            String key = entry.getKey();
            StoreTransaction value = entry.getValue();
            AbstractC12107L1.m13831v(new Object[]{value.getType(), key}, 2, RestoreStrings.QUERYING_PURCHASE_WITH_HASH, LogIntent.DEBUG);
        }
        this.this$0.deviceCache.cleanPreviouslySentTokens(purchasesByHashedToken.keySet());
        this.this$0.postTransactionsWithCompletion(this.this$0.deviceCache.getActivePurchasesNotInCache(purchasesByHashedToken), this.$allowSharingPlayStoreAccount, this.$appUserID, this.$onError, this.$onSuccess);
    }
}
