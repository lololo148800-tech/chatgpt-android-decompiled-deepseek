package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.strings.BillingStrings;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"", "countryCode", "Lmm/C;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class PurchasesOrchestrator$1$onConnected$1 extends AbstractC16546n implements InterfaceC1436k {
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$1$onConnected$1(PurchasesOrchestrator purchasesOrchestrator) {
        super(1);
        this.this$0 = purchasesOrchestrator;
    }

    @Override // p049Bm.InterfaceC1436k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C17296C.f55119a;
    }

    public final void invoke(String countryCode) {
        AbstractC16544l.m18094g(countryCode, "countryCode");
        this.this$0.storefrontCountryCode = countryCode;
        LogUtilsKt.debugLog(String.format(BillingStrings.BILLING_COUNTRY_CODE, Arrays.copyOf(new Object[]{countryCode}, 1)));
    }
}
