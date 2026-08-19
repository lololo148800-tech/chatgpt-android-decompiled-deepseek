package com.revenuecat.purchases.google;

import com.revenuecat.purchases.ProductType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"", "subFound", "Lmm/C;", "invoke", "(Z)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class BillingWrapper$getPurchaseType$1 extends AbstractC16546n implements InterfaceC1436k {
    final /* synthetic */ InterfaceC1436k $listener;
    final /* synthetic */ String $purchaseToken;
    final /* synthetic */ BillingWrapper this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$getPurchaseType$1$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"", "inAppFound", "Lmm/C;", "invoke", "(Z)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127161 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127161(InterfaceC1436k interfaceC1436k) {
            super(1);
            this.$listener = interfaceC1436k;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return C17296C.f55119a;
        }

        public final void invoke(boolean z6) {
            if (z6) {
                this.$listener.invoke(ProductType.INAPP);
            } else {
                this.$listener.invoke(ProductType.UNKNOWN);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$getPurchaseType$1(InterfaceC1436k interfaceC1436k, BillingWrapper billingWrapper, String str) {
        super(1);
        this.$listener = interfaceC1436k;
        this.this$0 = billingWrapper;
        this.$purchaseToken = str;
    }

    @Override // p049Bm.InterfaceC1436k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C17296C.f55119a;
    }

    public final void invoke(boolean z6) {
        if (z6) {
            this.$listener.invoke(ProductType.SUBS);
            return;
        }
        BillingWrapper billingWrapper = this.this$0;
        String str = this.$purchaseToken;
        InterfaceC1436k interfaceC1436k = this.$listener;
        billingWrapper.queryPurchaseType("inapp", str, interfaceC1436k, new C127161(interfaceC1436k));
    }
}
