package com.revenuecat.purchases.google;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p826j6.C16155i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lj6/i;", "", "toHumanReadableDescription", "(Lj6/i;)Ljava/lang/String;", "", "isSuccessful", "(Lj6/i;)Z", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class BillingResultExtensionsKt {
    public static final boolean isSuccessful(C16155i c16155i) {
        AbstractC16544l.m18094g(c16155i, "<this>");
        return c16155i.f50151a == 0;
    }

    public static final String toHumanReadableDescription(C16155i c16155i) {
        AbstractC16544l.m18094g(c16155i, "<this>");
        return "DebugMessage: " + c16155i.f50152b + ". ErrorCode: " + ErrorsKt.getBillingResponseCodeName(c16155i.f50151a) + '.';
    }
}
