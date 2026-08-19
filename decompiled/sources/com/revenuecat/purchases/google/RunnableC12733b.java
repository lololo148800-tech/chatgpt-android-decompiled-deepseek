package com.revenuecat.purchases.google;

/* JADX INFO: renamed from: com.revenuecat.purchases.google.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC12733b implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f40428Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ BillingWrapper f40429Z;

    public /* synthetic */ RunnableC12733b(BillingWrapper billingWrapper, int i10) {
        this.f40428Y = i10;
        this.f40429Z = billingWrapper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f40428Y) {
            case 0:
                BillingWrapper.endConnection$lambda$9(this.f40429Z);
                break;
            default:
                BillingWrapper.startConnectionOnMainThread$lambda$4(this.f40429Z);
                break;
        }
    }
}
