package com.revenuecat.purchases.google.usecase;

import java.util.List;
import p826j6.C16155i;
import p826j6.InterfaceC16163q;
import p826j6.InterfaceC16164r;

/* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12746a implements InterfaceC16163q, InterfaceC16164r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BillingClientUseCase f40431a;

    public /* synthetic */ C12746a(BillingClientUseCase billingClientUseCase) {
        this.f40431a = billingClientUseCase;
    }

    @Override // p826j6.InterfaceC16164r
    /* JADX INFO: renamed from: a */
    public void mo14486a(C16155i c16155i, List list) {
        QueryPurchasesByTypeUseCase.C127441.invoke$lambda$1$lambda$0((QueryPurchasesByTypeUseCase) this.f40431a, c16155i, list);
    }

    @Override // p826j6.InterfaceC16163q
    /* JADX INFO: renamed from: b */
    public void mo14487b(C16155i c16155i, List list) {
        BillingClientUseCase.processResult$default((QueryProductDetailsUseCase) this.f40431a, c16155i, list, null, null, 12, null);
    }

    /* JADX INFO: renamed from: c */
    public void m14488c(C16155i c16155i) {
        AcknowledgePurchaseUseCase.C127351.invoke$lambda$0((AcknowledgePurchaseUseCase) this.f40431a, c16155i);
    }

    /* JADX INFO: renamed from: d */
    public void m14489d(C16155i c16155i, String str) {
        ConsumePurchaseUseCase.C127391.invoke$lambda$0((ConsumePurchaseUseCase) this.f40431a, c16155i, str);
    }
}
