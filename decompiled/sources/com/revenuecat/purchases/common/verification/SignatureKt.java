package com.revenuecat.purchases.common.verification;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p909nm.AbstractC17678l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0004"}, m18067d2 = {"copyOf", "", "component", "Lcom/revenuecat/purchases/common/verification/Signature$Component;", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SignatureKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] copyOf(byte[] bArr, Signature.Component component) {
        return AbstractC17678l.m19309p(bArr, component.getStartByte(), component.getEndByte());
    }
}
