package com.revenuecat.purchases.google;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public /* synthetic */ class BillingWrapper$consumePurchase$3 extends AbstractC16541i implements InterfaceC1439n {
    public BillingWrapper$consumePurchase$3(Object obj) {
        super(2, 0, BillingWrapper.class, obj, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V");
    }

    @Override // p049Bm.InterfaceC1439n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Long) obj, (InterfaceC1436k) obj2);
        return C17296C.f55119a;
    }

    public final void invoke(Long l4, InterfaceC1436k p10) {
        AbstractC16544l.m18094g(p10, "p1");
        ((BillingWrapper) this.receiver).executeRequestOnUIThread(l4, p10);
    }
}
