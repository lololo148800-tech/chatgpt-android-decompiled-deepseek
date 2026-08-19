package com.revenuecat.purchases.google;

import com.android.billingclient.api.PurchaseHistoryRecord;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "purchasesList", "Lmm/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class BillingWrapper$findPurchaseInPurchaseHistory$1$1 extends AbstractC16546n implements InterfaceC1436k {
    final /* synthetic */ InterfaceC1436k $onCompletion;
    final /* synthetic */ InterfaceC1436k $onError;
    final /* synthetic */ String $productId;
    final /* synthetic */ ProductType $productType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$findPurchaseInPurchaseHistory$1$1(ProductType productType, InterfaceC1436k interfaceC1436k, String str, InterfaceC1436k interfaceC1436k2) {
        super(1);
        this.$productType = productType;
        this.$onCompletion = interfaceC1436k;
        this.$productId = str;
        this.$onError = interfaceC1436k2;
    }

    public final void invoke(List<? extends PurchaseHistoryRecord> purchasesList) {
        Object next;
        AbstractC16544l.m18094g(purchasesList, "purchasesList");
        String str = this.$productId;
        Iterator<T> it = purchasesList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((PurchaseHistoryRecord) next).m13150a().contains(str));
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) next;
        StoreTransaction storeTransaction = purchaseHistoryRecord != null ? StoreTransactionConversionsKt.toStoreTransaction(purchaseHistoryRecord, this.$productType) : null;
        if (storeTransaction != null) {
            this.$onCompletion.invoke(storeTransaction);
        } else {
            this.$onError.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, String.format(PurchaseStrings.NO_EXISTING_PURCHASE, Arrays.copyOf(new Object[]{this.$productId}, 1))));
        }
    }

    @Override // p049Bm.InterfaceC1436k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends PurchaseHistoryRecord>) obj);
        return C17296C.f55119a;
    }
}
