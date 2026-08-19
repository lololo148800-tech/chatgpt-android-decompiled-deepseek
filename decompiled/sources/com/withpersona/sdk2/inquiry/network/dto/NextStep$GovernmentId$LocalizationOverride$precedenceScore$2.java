package com.withpersona.sdk2.inquiry.network.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1426a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class NextStep$GovernmentId$LocalizationOverride$precedenceScore$2 extends AbstractC16546n implements InterfaceC1426a {
    final /* synthetic */ NextStep.GovernmentId.LocalizationOverride this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NextStep$GovernmentId$LocalizationOverride$precedenceScore$2(NextStep.GovernmentId.LocalizationOverride localizationOverride) {
        super(0);
        this.this$0 = localizationOverride;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Integer invoke() {
        int i10 = (this.this$0.getCountryCode() != null ? 1 : 0) * 2;
        if (this.this$0.getIdClass() != null) {
            i10++;
        }
        int i11 = i10 * 2;
        if (this.this$0.getSide() != null) {
            i11++;
        }
        return Integer.valueOf(i11);
    }
}
