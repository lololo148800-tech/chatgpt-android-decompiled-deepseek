package com.revenuecat.purchases;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000¨\u0006\u0006"}, m18067d2 = {"withPresentedContext", "Lcom/revenuecat/purchases/Offering;", "placementId", "", "targeting", "Lcom/revenuecat/purchases/Offerings$Targeting;", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class OfferingsKt {
    public static final Offering withPresentedContext(Offering offering, String str, Offerings.Targeting targeting) {
        AbstractC16544l.m18094g(offering, "<this>");
        List<Package> availablePackages = offering.getAvailablePackages();
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(availablePackages, 10));
        for (Package r6 : availablePackages) {
            PresentedOfferingContext presentedOfferingContext = r6.getPresentedOfferingContext();
            PresentedOfferingContext presentedOfferingContextCopy$default = PresentedOfferingContext.copy$default(presentedOfferingContext, null, str == null ? presentedOfferingContext.getPlacementIdentifier() : str, targeting != null ? new PresentedOfferingContext.TargetingContext(targeting.getRevision(), targeting.getRuleId()) : presentedOfferingContext.getTargetingContext(), 1, null);
            arrayList.add(new Package(r6.getIdentifier(), r6.getPackageType(), r6.getProduct().copyWithPresentedOfferingContext(presentedOfferingContextCopy$default), presentedOfferingContextCopy$default));
        }
        return new Offering(offering.getIdentifier(), offering.getServerDescription(), offering.getMetadata(), arrayList, offering.getPaywall());
    }
}
