package com.revenuecat.purchases.models;

import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import p909nm.AbstractC17659D;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m18067d2 = {"DAYS_IN_DAY", "", "DAYS_IN_MONTH", "DAYS_IN_UNIT", "", "Lcom/revenuecat/purchases/models/Period$Unit;", "DAYS_IN_WEEK", "DAYS_IN_YEAR", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SubscriptionOptionsKt {
    private static final int DAYS_IN_DAY = 1;
    private static final int DAYS_IN_MONTH = 30;
    private static final int DAYS_IN_WEEK = 7;
    private static final int DAYS_IN_YEAR = 365;
    private static final Map<Period.Unit, Integer> DAYS_IN_UNIT = AbstractC17659D.m19244f(new C17309l(Period.Unit.DAY, 1), new C17309l(Period.Unit.WEEK, 7), new C17309l(Period.Unit.MONTH, 30), new C17309l(Period.Unit.YEAR, Integer.valueOf(DAYS_IN_YEAR)));
}
