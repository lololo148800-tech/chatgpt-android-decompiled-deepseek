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
import org.json.JSONException;
import org.json.JSONObject;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lorg/json/JSONObject;", "response", "Lmm/C;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class AmazonBilling$getMissingSkusForReceipts$1$1 extends AbstractC16546n implements InterfaceC1436k {
    final /* synthetic */ Map<String, PurchasesError> $errorMap;
    final /* synthetic */ InterfaceC1439n $onCompletion;
    final /* synthetic */ Receipt $receipt;
    final /* synthetic */ C16558z $receiptsLeft;
    final /* synthetic */ Map<String, String> $successMap;
    final /* synthetic */ AmazonBilling this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling$getMissingSkusForReceipts$1$1(Map<String, String> map, Receipt receipt, C16558z c16558z, AmazonBilling amazonBilling, InterfaceC1439n interfaceC1439n, Map<String, PurchasesError> map2) {
        super(1);
        this.$successMap = map;
        this.$receipt = receipt;
        this.$receiptsLeft = c16558z;
        this.this$0 = amazonBilling;
        this.$onCompletion = interfaceC1439n;
        this.$errorMap = map2;
    }

    @Override // p049Bm.InterfaceC1436k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws JSONException {
        invoke((JSONObject) obj);
        return C17296C.f55119a;
    }

    public final void invoke(JSONObject response) throws JSONException {
        AbstractC16544l.m18094g(response, "response");
        AbstractC12107L1.m13831v(new Object[]{response.toString()}, 1, AmazonStrings.RECEIPT_DATA_RECEIVED, LogIntent.DEBUG);
        Map<String, String> map = this.$successMap;
        String receiptId = this.$receipt.getReceiptId();
        AbstractC16544l.m18093f(receiptId, "receipt.receiptId");
        Object obj = response.get("termSku");
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.String");
        map.put(receiptId, (String) obj);
        C16558z c16558z = this.$receiptsLeft;
        int i10 = c16558z.f51287Y - 1;
        c16558z.f51287Y = i10;
        if (i10 == 0) {
            this.this$0.cache.cacheSkusByToken(this.$successMap);
            this.$onCompletion.invoke(this.$successMap, this.$errorMap);
        }
    }
}
