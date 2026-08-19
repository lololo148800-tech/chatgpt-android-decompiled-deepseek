package com.revenuecat.purchases;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1426a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m18067d2 = {"<anonymous>", "Lcom/revenuecat/purchases/Package;", "invoke"}, m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class Offering$annual$2 extends AbstractC16546n implements InterfaceC1426a {
    final /* synthetic */ Offering this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Offering$annual$2(Offering offering) {
        super(0);
        this.this$0 = offering;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Package invoke() {
        return this.this$0.findPackage(PackageType.ANNUAL);
    }
}
