package com.revenuecat.purchases;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1426a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m18067d2 = {"<anonymous>", "", "", "invoke"}, m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CustomerInfo$activeSubscriptions$2 extends AbstractC16546n implements InterfaceC1426a {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfo$activeSubscriptions$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Set<String> invoke() {
        CustomerInfo customerInfo = this.this$0;
        return customerInfo.activeIdentifiers(customerInfo.getAllExpirationDatesByProduct());
    }
}
