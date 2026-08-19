package com.revenuecat.purchases.models;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"<no name provided>", "", "part", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Integer;"}, m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PeriodKt$toPeriod$1$toInt$1 extends AbstractC16546n implements InterfaceC1436k {
    public static final PeriodKt$toPeriod$1$toInt$1 INSTANCE = new PeriodKt$toPeriod$1$toInt$1();

    public PeriodKt$toPeriod$1$toInt$1() {
        super(1);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Integer invoke(String part) {
        AbstractC16544l.m18094g(part, "part");
        Integer numM21736w = AbstractC21329w.m21736w(AbstractC21322p.m21670D(1, part));
        return Integer.valueOf(numM21736w != null ? numM21736w.intValue() : 0);
    }
}
