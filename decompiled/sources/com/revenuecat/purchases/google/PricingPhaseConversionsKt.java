package com.revenuecat.purchases.google;

import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.RecurrenceMode;
import com.revenuecat.purchases.models.RecurrenceModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p826j6.C16160n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lj6/n;", "Lcom/revenuecat/purchases/models/PricingPhase;", "toRevenueCatPricingPhase", "(Lj6/n;)Lcom/revenuecat/purchases/models/PricingPhase;", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PricingPhaseConversionsKt {
    public static final PricingPhase toRevenueCatPricingPhase(C16160n c16160n) {
        AbstractC16544l.m18094g(c16160n, "<this>");
        Period.Companion companion = Period.INSTANCE;
        String billingPeriod = c16160n.f50166d;
        AbstractC16544l.m18093f(billingPeriod, "billingPeriod");
        Period periodCreate = companion.create(billingPeriod);
        RecurrenceMode recurrenceMode = RecurrenceModeKt.toRecurrenceMode(Integer.valueOf(c16160n.f50168f));
        Integer numValueOf = Integer.valueOf(c16160n.f50167e);
        String formattedPrice = c16160n.f50163a;
        AbstractC16544l.m18093f(formattedPrice, "formattedPrice");
        String priceCurrencyCode = c16160n.f50165c;
        AbstractC16544l.m18093f(priceCurrencyCode, "priceCurrencyCode");
        return new PricingPhase(periodCreate, recurrenceMode, numValueOf, new Price(formattedPrice, c16160n.f50164b, priceCurrencyCode));
    }
}
