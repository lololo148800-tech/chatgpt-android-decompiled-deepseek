package com.revenuecat.purchases.amazon;

import com.amazon.device.iap.model.Receipt;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16558z;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class AmazonBilling$getMissingSkusForReceipts$1$2 extends AbstractC16546n implements InterfaceC1436k {
    final /* synthetic */ Map<String, PurchasesError> $errorMap;
    final /* synthetic */ InterfaceC1439n $onCompletion;
    final /* synthetic */ Receipt $receipt;
    final /* synthetic */ C16558z $receiptsLeft;
    final /* synthetic */ Map<String, String> $successMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling$getMissingSkusForReceipts$1$2(Map<String, PurchasesError> map, Receipt receipt, C16558z c16558z, InterfaceC1439n interfaceC1439n, Map<String, String> map2) {
        super(1);
        this.$errorMap = map;
        this.$receipt = receipt;
        this.$receiptsLeft = c16558z;
        this.$onCompletion = interfaceC1439n;
        this.$successMap = map2;
    }

    @Override // p049Bm.InterfaceC1436k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return C17296C.f55119a;
    }

    public final void invoke(PurchasesError error) {
        AbstractC16544l.m18094g(error, "error");
        AbstractC12107L1.m13831v(new Object[]{error}, 1, AmazonStrings.ERROR_FETCHING_RECEIPT_INFO, LogIntent.AMAZON_ERROR);
        Map<String, PurchasesError> map = this.$errorMap;
        String receiptId = this.$receipt.getReceiptId();
        AbstractC16544l.m18093f(receiptId, "receipt.receiptId");
        map.put(receiptId, error);
        C16558z c16558z = this.$receiptsLeft;
        int i10 = c16558z.f51287Y - 1;
        c16558z.f51287Y = i10;
        if (i10 == 0) {
            this.$onCompletion.invoke(this.$successMap, this.$errorMap);
        }
    }
}
