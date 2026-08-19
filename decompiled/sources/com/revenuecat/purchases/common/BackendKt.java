package com.revenuecat.purchases.common;

import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.PricingPhase;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import p025An.C0644w;
import p909nm.AbstractC17659D;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0007\"\u0018\u0010\r\u001a\u00020\n*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f*\u0018\b\u0000\u0010\u000f\"\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\u0012\u0004\u0012\u00020\u00020\u000e*`\b\u0000\u0010\u0017\",\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u00140\u00102,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u00140\u0010*`\b\u0000\u0010\u0019\",\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u00140\u00102,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u00140\u0010*`\b\u0000\u0010\u001a\",\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00130\u00110\u00102,\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00130\u00110\u0010*`\b\u0000\u0010\u001b\",\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u00140\u00102,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u00140\u0010*T\b\u0000\u0010\u001d\"&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u00140\u00102&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u00140\u0010*R\b\u0000\u0010#\"\u000e\u0012\u0004\u0012\u0002`\u001e\u0012\u0004\u0012\u0002`\u001f0\u00102<\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00130\u0011j\u0002`\u001e\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00130!j\u0002`\u001f0\u0010*@\b\u0000\u0010$\"\u001c\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00130!2\u001c\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00130!*$\b\u0000\u0010%\"\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00130\u00112\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00130\u0011*T\b\u0000\u0010'\"&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00130\u00110\u00102&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00130\u00110\u0010¨\u0006("}, m18067d2 = {"Lcom/revenuecat/purchases/models/PricingPhase;", "", "", "", "toMap", "(Lcom/revenuecat/purchases/models/PricingPhase;)Ljava/util/Map;", "ATTRIBUTES_ERROR_RESPONSE_KEY", "Ljava/lang/String;", "ATTRIBUTE_ERRORS_KEY", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "Lcom/revenuecat/purchases/common/LegacyProrationMode;", "getAsLegacyProrationMode", "(Lcom/revenuecat/purchases/models/GoogleReplacementMode;)Lcom/revenuecat/purchases/common/LegacyProrationMode;", "asLegacyProrationMode", "", "CallbackCacheKey", "Lmm/l;", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lmm/C;", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/PurchasesError;", "", "CustomerInfoCallback", "Lorg/json/JSONObject;", "DiagnosticsCallback", "IdentifyCallback", "OfferingsCallback", "Lkotlin/Function0;", "PaywallEventsCallback", "Lcom/revenuecat/purchases/common/PostReceiptDataSuccessCallback;", "Lcom/revenuecat/purchases/common/PostReceiptDataErrorCallback;", "Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "Lkotlin/Function3;", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "PostReceiptCallback", "PostReceiptDataErrorCallback", "PostReceiptDataSuccessCallback", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "ProductEntitlementCallback", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class BackendKt {
    public static final String ATTRIBUTES_ERROR_RESPONSE_KEY = "attributes_error_response";
    public static final String ATTRIBUTE_ERRORS_KEY = "attribute_errors";

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoogleReplacementMode.values().length];
            try {
                iArr[GoogleReplacementMode.WITHOUT_PRORATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GoogleReplacementMode.WITH_TIME_PRORATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GoogleReplacementMode.CHARGE_FULL_PRICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GoogleReplacementMode.CHARGE_PRORATED_PRICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GoogleReplacementMode.DEFERRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LegacyProrationMode getAsLegacyProrationMode(GoogleReplacementMode googleReplacementMode) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[googleReplacementMode.ordinal()];
        if (i10 == 1) {
            return LegacyProrationMode.IMMEDIATE_WITHOUT_PRORATION;
        }
        if (i10 == 2) {
            return LegacyProrationMode.IMMEDIATE_WITH_TIME_PRORATION;
        }
        if (i10 == 3) {
            return LegacyProrationMode.IMMEDIATE_AND_CHARGE_FULL_PRICE;
        }
        if (i10 == 4) {
            return LegacyProrationMode.IMMEDIATE_AND_CHARGE_PRORATED_PRICE;
        }
        if (i10 == 5) {
            return LegacyProrationMode.DEFERRED;
        }
        throw new C0644w();
    }

    public static final Map<String, Object> toMap(PricingPhase pricingPhase) {
        AbstractC16544l.m18094g(pricingPhase, "<this>");
        return AbstractC17659D.m19244f(new C17309l("billingPeriod", pricingPhase.getBillingPeriod().getIso8601()), new C17309l("billingCycleCount", pricingPhase.getBillingCycleCount()), new C17309l("recurrenceMode", pricingPhase.getRecurrenceMode().getIdentifier()), new C17309l("formattedPrice", pricingPhase.getPrice().getFormatted()), new C17309l("priceAmountMicros", Long.valueOf(pricingPhase.getPrice().getAmountMicros())), new C17309l("priceCurrencyCode", pricingPhase.getPrice().getCurrencyCode()));
    }
}
