package com.revenuecat.purchases.google;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public /* synthetic */ class BillingWrapper$acknowledge$2 extends AbstractC16541i implements InterfaceC1436k {
    public BillingWrapper$acknowledge$2(Object obj) {
        super(1, 0, BillingWrapper.class, obj, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V");
    }

    @Override // p049Bm.InterfaceC1436k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC1436k) obj);
        return C17296C.f55119a;
    }

    public final void invoke(InterfaceC1436k p10) {
        AbstractC16544l.m18094g(p10, "p0");
        ((BillingWrapper) this.receiver).withConnectedClient(p10);
    }
}
