package com.revenuecat.purchases.google.usecase;

import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p826j6.C16155i;
import p826j6.InterfaceC16163q;
import p826j6.InterfaceC16164r;

/* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12748c implements InterfaceC16163q, InterfaceC16164r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicBoolean f40434a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f40435b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Date f40436c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BillingClientUseCase f40437d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f40438e;

    public /* synthetic */ C12748c(AtomicBoolean atomicBoolean, BillingClientUseCase billingClientUseCase, String str, Date date, Object obj) {
        this.f40434a = atomicBoolean;
        this.f40437d = billingClientUseCase;
        this.f40435b = str;
        this.f40436c = date;
        this.f40438e = obj;
    }

    @Override // p826j6.InterfaceC16164r
    /* JADX INFO: renamed from: a */
    public void mo14486a(C16155i c16155i, List list) {
        QueryPurchasesByTypeUseCase.queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$0(this.f40434a, (QueryPurchasesByTypeUseCase) this.f40437d, this.f40435b, this.f40436c, (InterfaceC16164r) this.f40438e, c16155i, list);
    }

    @Override // p826j6.InterfaceC16163q
    /* JADX INFO: renamed from: b */
    public void mo14487b(C16155i c16155i, List list) {
        QueryProductDetailsUseCase.queryProductDetailsAsyncEnsuringOneResponse$lambda$3(this.f40434a, (QueryProductDetailsUseCase) this.f40437d, this.f40435b, this.f40436c, (InterfaceC16163q) this.f40438e, c16155i, list);
    }
}
