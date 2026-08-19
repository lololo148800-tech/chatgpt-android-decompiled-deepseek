package com.revenuecat.purchases.utils;

import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u001c\u0010\n\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m18067d2 = {"MICRO_MULTIPLIER", "", "pricePerMonth", "Lcom/revenuecat/purchases/models/Price;", "billingPeriod", "Lcom/revenuecat/purchases/models/Period;", "locale", "Ljava/util/Locale;", "pricePerPeriod", "units", "pricePerWeek", "pricePerYear", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PriceExtensionsKt {
    private static final double MICRO_MULTIPLIER = 1000000.0d;

    public static final Price pricePerMonth(Price price, Period billingPeriod, Locale locale) {
        AbstractC16544l.m18094g(price, "<this>");
        AbstractC16544l.m18094g(billingPeriod, "billingPeriod");
        AbstractC16544l.m18094g(locale, "locale");
        return pricePerPeriod(price, billingPeriod.getValueInMonths(), locale);
    }

    private static final Price pricePerPeriod(Price price, double d10, Locale locale) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(Currency.getInstance(price.getCurrencyCode()));
        double amountMicros = price.getAmountMicros() / d10;
        String formatted = currencyInstance.format(amountMicros / 1000000.0d);
        AbstractC16544l.m18093f(formatted, "formatted");
        return new Price(formatted, (long) amountMicros, price.getCurrencyCode());
    }

    public static final Price pricePerWeek(Price price, Period billingPeriod, Locale locale) {
        AbstractC16544l.m18094g(price, "<this>");
        AbstractC16544l.m18094g(billingPeriod, "billingPeriod");
        AbstractC16544l.m18094g(locale, "locale");
        return pricePerPeriod(price, billingPeriod.getValueInWeeks$purchases_customEntitlementComputationRelease(), locale);
    }

    public static final Price pricePerYear(Price price, Period billingPeriod, Locale locale) {
        AbstractC16544l.m18094g(price, "<this>");
        AbstractC16544l.m18094g(billingPeriod, "billingPeriod");
        AbstractC16544l.m18094g(locale, "locale");
        return pricePerPeriod(price, billingPeriod.getValueInYears$purchases_customEntitlementComputationRelease(), locale);
    }
}
