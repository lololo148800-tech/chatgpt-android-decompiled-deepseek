package com.revenuecat.purchases;

import android.gov.nist.javax.sip.header.ParameterNames;
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
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "<anonymous parameter 0>", "Lcom/revenuecat/purchases/CustomerInfo;", ParameterNames.INFO, "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class PurchasesOrchestrator$restorePurchases$1$2$1$1 extends AbstractC16546n implements InterfaceC1439n {
    final /* synthetic */ ReceiveCustomerInfoCallback $callback;
    final /* synthetic */ StoreTransaction $purchase;
    final /* synthetic */ List<StoreTransaction> $sortedByTime;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$1$2$1$1$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126431 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;
        final /* synthetic */ CustomerInfo $info;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126431(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
            super(0);
            this.$callback = receiveCustomerInfoCallback;
            this.$info = customerInfo;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22490invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22490invoke() {
            this.$callback.onReceived(this.$info);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$restorePurchases$1$2$1$1(StoreTransaction storeTransaction, List<StoreTransaction> list, PurchasesOrchestrator purchasesOrchestrator, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        super(2);
        this.$purchase = storeTransaction;
        this.$sortedByTime = list;
        this.this$0 = purchasesOrchestrator;
        this.$callback = receiveCustomerInfoCallback;
    }

    @Override // p049Bm.InterfaceC1439n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((StoreTransaction) obj, (CustomerInfo) obj2);
        return C17296C.f55119a;
    }

    public final void invoke(StoreTransaction storeTransaction, CustomerInfo info) {
        AbstractC16544l.m18094g(storeTransaction, "<anonymous parameter 0>");
        AbstractC16544l.m18094g(info, "info");
        AbstractC12107L1.m13831v(new Object[]{this.$purchase}, 1, RestoreStrings.PURCHASE_RESTORED, LogIntent.DEBUG);
        if (AbstractC16544l.m18089b(AbstractC17680n.m19351a0(this.$sortedByTime), this.$purchase)) {
            this.this$0.dispatch(new C126431(this.$callback, info));
        }
    }
}
