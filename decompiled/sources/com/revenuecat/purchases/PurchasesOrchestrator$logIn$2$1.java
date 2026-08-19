package com.revenuecat.purchases;

import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.interfaces.LogInCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "", "created", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;Z)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class PurchasesOrchestrator$logIn$2$1 extends AbstractC16546n implements InterfaceC1439n {
    final /* synthetic */ LogInCallback $callback;
    final /* synthetic */ String $newAppUserID;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$2$1$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126341 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ LogInCallback $callback;
        final /* synthetic */ boolean $created;
        final /* synthetic */ CustomerInfo $customerInfo;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126341(LogInCallback logInCallback, CustomerInfo customerInfo, boolean z6, PurchasesOrchestrator purchasesOrchestrator) {
            super(0);
            this.$callback = logInCallback;
            this.$customerInfo = customerInfo;
            this.$created = z6;
            this.this$0 = purchasesOrchestrator;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22485invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22485invoke() {
            LogInCallback logInCallback = this.$callback;
            if (logInCallback != null) {
                logInCallback.onReceived(this.$customerInfo, this.$created);
            }
            this.this$0.customerInfoUpdateHandler.notifyListeners(this.$customerInfo);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$logIn$2$1(PurchasesOrchestrator purchasesOrchestrator, String str, LogInCallback logInCallback) {
        super(2);
        this.this$0 = purchasesOrchestrator;
        this.$newAppUserID = str;
        this.$callback = logInCallback;
    }

    @Override // p049Bm.InterfaceC1439n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((CustomerInfo) obj, ((Boolean) obj2).booleanValue());
        return C17296C.f55119a;
    }

    public final void invoke(CustomerInfo customerInfo, boolean z6) {
        AbstractC16544l.m18094g(customerInfo, "customerInfo");
        PurchasesOrchestrator purchasesOrchestrator = this.this$0;
        purchasesOrchestrator.dispatch(new C126341(this.$callback, customerInfo, z6, purchasesOrchestrator));
        OfferingsManager.fetchAndCacheOfferings$default(this.this$0.offeringsManager, this.$newAppUserID, this.this$0.getState$purchases_customEntitlementComputationRelease().getAppInBackground(), null, null, 12, null);
    }
}
