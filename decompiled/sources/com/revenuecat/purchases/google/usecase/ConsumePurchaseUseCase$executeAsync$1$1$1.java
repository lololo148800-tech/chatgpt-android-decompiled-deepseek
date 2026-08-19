package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.BillingResultExtensionsKt;
import com.revenuecat.purchases.google.ErrorsKt;
import com.revenuecat.purchases.strings.PurchaseStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p826j6.C16155i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lj6/i;", "errorBillingResult", "Lmm/C;", "invoke", "(Lj6/i;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class ConsumePurchaseUseCase$executeAsync$1$1$1 extends AbstractC16546n implements InterfaceC1436k {
    final /* synthetic */ ConsumePurchaseUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsumePurchaseUseCase$executeAsync$1$1$1(ConsumePurchaseUseCase consumePurchaseUseCase) {
        super(1);
        this.this$0 = consumePurchaseUseCase;
    }

    public final void invoke(C16155i errorBillingResult) {
        String str;
        AbstractC16544l.m18094g(errorBillingResult, "errorBillingResult");
        if (errorBillingResult.f50151a == 8 && this.this$0.useCaseParams.getInitiationSource() == PostReceiptInitiationSource.RESTORE) {
            LogIntent logIntent = LogIntent.GOOGLE_WARNING;
            str = PurchaseStrings.CONSUMING_PURCHASE_ERROR_RESTORE;
            LogWrapperKt.log(logIntent, PurchaseStrings.CONSUMING_PURCHASE_ERROR_RESTORE);
        } else {
            str = this.this$0.getErrorMessage() + " - " + BillingResultExtensionsKt.toHumanReadableDescription(errorBillingResult);
            LogWrapperKt.log(LogIntent.GOOGLE_ERROR, str);
        }
        this.this$0.getOnError().invoke(ErrorsKt.billingResponseToPurchasesError(errorBillingResult.f50151a, str));
    }

    @Override // p049Bm.InterfaceC1436k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16155i) obj);
        return C17296C.f55119a;
    }
}
