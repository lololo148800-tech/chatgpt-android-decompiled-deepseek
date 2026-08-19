package com.revenuecat.purchases;

import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.RestoreStrings;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p160G5.p161rK.TVCuK;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "<anonymous parameter 0>", "Lcom/revenuecat/purchases/PurchasesError;", "error", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class PurchasesOrchestrator$restorePurchases$1$2$1$2 extends AbstractC16546n implements InterfaceC1439n {
    final /* synthetic */ ReceiveCustomerInfoCallback $callback;
    final /* synthetic */ StoreTransaction $purchase;
    final /* synthetic */ List<StoreTransaction> $sortedByTime;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$1$2$1$2$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126441 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;
        final /* synthetic */ PurchasesError $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126441(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
            super(0);
            this.$callback = receiveCustomerInfoCallback;
            this.$error = purchasesError;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22491invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22491invoke() {
            this.$callback.onError(this.$error);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$restorePurchases$1$2$1$2(StoreTransaction storeTransaction, List<StoreTransaction> list, PurchasesOrchestrator purchasesOrchestrator, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        super(2);
        this.$purchase = storeTransaction;
        this.$sortedByTime = list;
        this.this$0 = purchasesOrchestrator;
        this.$callback = receiveCustomerInfoCallback;
    }

    @Override // p049Bm.InterfaceC1439n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((StoreTransaction) obj, (PurchasesError) obj2);
        return C17296C.f55119a;
    }

    public final void invoke(StoreTransaction storeTransaction, PurchasesError error) {
        AbstractC16544l.m18094g(storeTransaction, TVCuK.warDwebfZii);
        AbstractC16544l.m18094g(error, "error");
        AbstractC12107L1.m13831v(new Object[]{this.$purchase, error}, 2, RestoreStrings.RESTORING_PURCHASE_ERROR, LogIntent.RC_ERROR);
        if (AbstractC16544l.m18089b(AbstractC17680n.m19351a0(this.$sortedByTime), this.$purchase)) {
            this.this$0.dispatch(new C126441(this.$callback, error));
        }
    }
}
