package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class PurchasesOrchestrator$1$onConnected$2 extends AbstractC16546n implements InterfaceC1436k {
    public static final PurchasesOrchestrator$1$onConnected$2 INSTANCE = new PurchasesOrchestrator$1$onConnected$2();

    public PurchasesOrchestrator$1$onConnected$2() {
        super(1);
    }

    @Override // p049Bm.InterfaceC1436k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return C17296C.f55119a;
    }

    public final void invoke(PurchasesError error) {
        AbstractC16544l.m18094g(error, "error");
        LogUtilsKt.errorLog(error);
    }
}
