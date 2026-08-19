package com.revenuecat.purchases.google.usecase;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p523V9.AbstractC8128k6;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000(\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0017\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u001d\u0010\u0006\u001a\u00020\u00038\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\u0007\u0010\b\"\u001d\u0010\t\u001a\u00020\u00038\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\b*L\b\u0000\u0010\u0010\"\"\u0012\u0004\u0012\u00020\f\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0004\u0012\u00020\u000f0\u000b2\"\u0012\u0004\u0012\u00020\f\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0004\u0012\u00020\u000f0\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m18067d2 = {"", "MAX_RETRIES_DEFAULT", TokenNames.f32012I, "Lyn/b;", "RETRY_TIMER_START", "J", "RETRY_TIMER_MAX_TIME", "getRETRY_TIMER_MAX_TIME", "()J", "RETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND", "getRETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND", "Lkotlin/Function2;", "", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Lmm/C;", "ExecuteRequestOnUIThreadFunction", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class BillingClientUseCaseKt {
    private static final int MAX_RETRIES_DEFAULT = 3;
    private static final long RETRY_TIMER_MAX_TIME;
    private static final long RETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND;
    private static final long RETRY_TIMER_START;

    static {
        C21554a c21554a = C21555b.f68260Z;
        RETRY_TIMER_START = AbstractC8128k6.m8644j(878, EnumC21557d.MILLISECONDS);
        RETRY_TIMER_MAX_TIME = AbstractC8128k6.m8644j(15, EnumC21557d.MINUTES);
        RETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND = AbstractC8128k6.m8644j(4, EnumC21557d.SECONDS);
    }

    public static final long getRETRY_TIMER_MAX_TIME() {
        return RETRY_TIMER_MAX_TIME;
    }

    public static final long getRETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND() {
        return RETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND;
    }
}
