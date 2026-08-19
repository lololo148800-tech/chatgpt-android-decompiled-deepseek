package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.LogInCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class PurchasesOrchestrator$logIn$2$2 extends AbstractC16546n implements InterfaceC1436k {
    final /* synthetic */ LogInCallback $callback;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$2$2$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126351 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ LogInCallback $callback;
        final /* synthetic */ PurchasesError $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126351(LogInCallback logInCallback, PurchasesError purchasesError) {
            super(0);
            this.$callback = logInCallback;
            this.$error = purchasesError;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22486invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22486invoke() {
            LogInCallback logInCallback = this.$callback;
            if (logInCallback != null) {
                logInCallback.onError(this.$error);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$logIn$2$2(PurchasesOrchestrator purchasesOrchestrator, LogInCallback logInCallback) {
        super(1);
        this.this$0 = purchasesOrchestrator;
        this.$callback = logInCallback;
    }

    @Override // p049Bm.InterfaceC1436k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return C17296C.f55119a;
    }

    public final void invoke(PurchasesError error) {
        AbstractC16544l.m18094g(error, "error");
        this.this$0.dispatch(new C126351(this.$callback, error));
    }
}
