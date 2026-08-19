package com.revenuecat.purchases;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1426a;
import p165G9.AbstractC3021g;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m18067d2 = {"<anonymous>", "Ljava/util/Date;", "invoke"}, m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CustomerInfo$latestExpirationDate$2 extends AbstractC16546n implements InterfaceC1426a {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfo$latestExpirationDate$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Date invoke() {
        List listM19370t0 = AbstractC17680n.m19370t0(this.this$0.getAllExpirationDatesByProduct().values(), new Comparator() { // from class: com.revenuecat.purchases.CustomerInfo$latestExpirationDate$2$invoke$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return AbstractC3021g.m3873a((Date) t10, (Date) t11);
            }
        });
        if (listM19370t0.isEmpty()) {
            listM19370t0 = null;
        }
        if (listM19370t0 != null) {
            return (Date) AbstractC17680n.m19351a0(listM19370t0);
        }
        return null;
    }
}
