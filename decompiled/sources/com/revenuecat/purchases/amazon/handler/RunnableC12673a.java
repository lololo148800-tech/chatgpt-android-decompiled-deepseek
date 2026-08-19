package com.revenuecat.purchases.amazon.handler;

import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.RequestId;

/* JADX INFO: renamed from: com.revenuecat.purchases.amazon.handler.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC12673a implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f40405Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ RequestId f40406Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ PurchasingListener f40407o0;

    public /* synthetic */ RunnableC12673a(PurchasingListener purchasingListener, RequestId requestId, int i10) {
        this.f40405Y = i10;
        this.f40407o0 = purchasingListener;
        this.f40406Z = requestId;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f40405Y) {
            case 0:
                ProductDataHandler.addTimeoutToProductDataRequest$lambda$6((ProductDataHandler) this.f40407o0, this.f40406Z);
                break;
            default:
                UserDataHandler.addTimeoutToUserDataRequest$lambda$5((UserDataHandler) this.f40407o0, this.f40406Z);
                break;
        }
    }
}
