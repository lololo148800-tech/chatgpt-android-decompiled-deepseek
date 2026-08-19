package com.revenuecat.purchases.models;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"toRecurrenceMode", "Lcom/revenuecat/purchases/models/RecurrenceMode;", "", "(Ljava/lang/Integer;)Lcom/revenuecat/purchases/models/RecurrenceMode;", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class RecurrenceModeKt {
    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
    public static final RecurrenceMode toRecurrenceMode(Integer num) {
        for (RecurrenceMode recurrenceMode : RecurrenceMode.values()) {
            if (AbstractC16544l.m18089b(recurrenceMode.getIdentifier(), num)) {
                if (recurrenceMode == null) {
                    return RecurrenceMode.UNKNOWN;
                }
                return recurrenceMode;
            }
        }
        recurrenceMode = null;
        if (recurrenceMode == null) {
            return RecurrenceMode.UNKNOWN;
        }
        return recurrenceMode;
    }
}
