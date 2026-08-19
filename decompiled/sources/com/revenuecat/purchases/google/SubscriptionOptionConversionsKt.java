package com.revenuecat.purchases.google;

import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import com.revenuecat.purchases.models.GoogleInstallmentsInfo;
import com.revenuecat.purchases.models.GoogleSubscriptionOption;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p826j6.C16158l;
import p826j6.C16160n;
import p826j6.C16161o;
import p826j6.C16162p;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0018\u0010\f\u001a\u00020\u000b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u0012\u001a\u00020\u000f*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m18067d2 = {"Lj6/o;", "", "productId", "Lj6/p;", "productDetails", "Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "toSubscriptionOption", "(Lj6/o;Ljava/lang/String;Lj6/p;)Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "getSubscriptionBillingPeriod", "(Lj6/o;)Ljava/lang/String;", "subscriptionBillingPeriod", "", "isBasePlan", "(Lj6/o;)Z", "Lj6/l;", "Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "getInstallmentsInfo", "(Lj6/l;)Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "installmentsInfo", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SubscriptionOptionConversionsKt {
    private static final GoogleInstallmentsInfo getInstallmentsInfo(C16158l c16158l) {
        return new GoogleInstallmentsInfo(c16158l.f50155a, c16158l.f50156b);
    }

    public static final boolean isBasePlan(C16161o c16161o) {
        AbstractC16544l.m18094g(c16161o, "<this>");
        return c16161o.f50172d.f11629a.size() == 1;
    }

    public static final GoogleSubscriptionOption toSubscriptionOption(C16161o c16161o, String productId, C16162p productDetails) {
        AbstractC16544l.m18094g(c16161o, "<this>");
        AbstractC16544l.m18094g(productId, "productId");
        AbstractC16544l.m18094g(productDetails, "productDetails");
        ArrayList<C16160n> arrayList = c16161o.f50172d.f11629a;
        AbstractC16544l.m18093f(arrayList, "pricingPhases.pricingPhaseList");
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        for (C16160n it : arrayList) {
            AbstractC16544l.m18093f(it, "it");
            arrayList2.add(PricingPhaseConversionsKt.toRevenueCatPricingPhase(it));
        }
        String basePlanId = c16161o.f50169a;
        AbstractC16544l.m18093f(basePlanId, "basePlanId");
        ArrayList offerTags = c16161o.f50173e;
        AbstractC16544l.m18093f(offerTags, "offerTags");
        String offerToken = c16161o.f50171c;
        AbstractC16544l.m18093f(offerToken, "offerToken");
        C16158l c16158l = c16161o.f50174f;
        return new GoogleSubscriptionOption(productId, basePlanId, c16161o.f50170b, arrayList2, offerTags, productDetails, offerToken, null, c16158l != null ? getInstallmentsInfo(c16158l) : null);
    }

    public static final String getSubscriptionBillingPeriod(C16161o c16161o) {
        AbstractC16544l.m18094g(c16161o, "<this>");
        ArrayList arrayList = c16161o.f50172d.f11629a;
        AbstractC16544l.m18093f(arrayList, qffLJgOYizGmMj.XOA);
        C16160n c16160n = (C16160n) AbstractC17680n.m19353c0(arrayList);
        if (c16160n != null) {
            return c16160n.f50166d;
        }
        return null;
    }
}
