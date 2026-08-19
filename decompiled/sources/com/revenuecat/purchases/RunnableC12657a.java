package com.revenuecat.purchases;

import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: com.revenuecat.purchases.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC12657a implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f40400Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f40401Z;

    public /* synthetic */ RunnableC12657a(Object obj, int i10) {
        this.f40400Y = i10;
        this.f40401Z = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f40400Y) {
            case 0:
                CustomerInfoHelper.dispatch$lambda$0((InterfaceC1426a) this.f40401Z);
                break;
            case 1:
                CustomerInfoUpdateHandler.dispatch$lambda$5((InterfaceC1426a) this.f40401Z);
                break;
            case 2:
                PurchasesOrchestrator.dispatch$lambda$17((InterfaceC1426a) this.f40401Z);
                break;
            case 3:
                PurchasesOrchestrator.enqueue$lambda$12((InterfaceC1426a) this.f40401Z);
                break;
            default:
                PurchasesFactory.LowPriorityThreadFactory.newThread$lambda$1((Runnable) this.f40401Z);
                break;
        }
    }
}
