package com.revenuecat.purchases;

import com.google.protobuf.AbstractC12107L1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p1071w0.AbstractC20734X;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002'(B%\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0007B=\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0002\b\u0018J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÀ\u0003¢\u0006\u0002\b\u001aJC\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0006\u0010 \u001a\u00020\u0006H\u0086\u0002J\u0010\u0010!\u001a\u0004\u0018\u00010\u00032\u0006\u0010\"\u001a\u00020\u0006J\u0010\u0010#\u001a\u0004\u0018\u00010\u00032\u0006\u0010 \u001a\u00020\u0006J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0006HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, m18067d2 = {"Lcom/revenuecat/purchases/Offerings;", "", "current", "Lcom/revenuecat/purchases/Offering;", "all", "", "", "(Lcom/revenuecat/purchases/Offering;Ljava/util/Map;)V", "placements", "Lcom/revenuecat/purchases/Offerings$Placements;", "targeting", "Lcom/revenuecat/purchases/Offerings$Targeting;", "(Lcom/revenuecat/purchases/Offering;Ljava/util/Map;Lcom/revenuecat/purchases/Offerings$Placements;Lcom/revenuecat/purchases/Offerings$Targeting;)V", "getAll", "()Ljava/util/Map;", "getCurrent", "()Lcom/revenuecat/purchases/Offering;", "getPlacements$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/Offerings$Placements;", "getTargeting$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/Offerings$Targeting;", "component1", "component2", "component3", "component3$purchases_customEntitlementComputationRelease", "component4", "component4$purchases_customEntitlementComputationRelease", "copy", "equals", "", "other", "get", "identifier", "getCurrentOfferingForPlacement", "placementId", "getOffering", "hashCode", "", "toString", "Placements", "Targeting", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class Offerings {
    private final Map<String, Offering> all;
    private final Offering current;
    private final Placements placements;
    private final Targeting targeting;

    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005HÆ\u0003J-\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m18067d2 = {"Lcom/revenuecat/purchases/Offerings$Placements;", "", "fallbackOfferingId", "", "offeringIdsByPlacement", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getFallbackOfferingId", "()Ljava/lang/String;", "getOfferingIdsByPlacement", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class Placements {
        private final String fallbackOfferingId;
        private final Map<String, String> offeringIdsByPlacement;

        public Placements(String str, Map<String, String> offeringIdsByPlacement) {
            AbstractC16544l.m18094g(offeringIdsByPlacement, "offeringIdsByPlacement");
            this.fallbackOfferingId = str;
            this.offeringIdsByPlacement = offeringIdsByPlacement;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Placements copy$default(Placements placements, String str, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = placements.fallbackOfferingId;
            }
            if ((i10 & 2) != 0) {
                map = placements.offeringIdsByPlacement;
            }
            return placements.copy(str, map);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFallbackOfferingId() {
            return this.fallbackOfferingId;
        }

        public final Map<String, String> component2() {
            return this.offeringIdsByPlacement;
        }

        public final Placements copy(String fallbackOfferingId, Map<String, String> offeringIdsByPlacement) {
            AbstractC16544l.m18094g(offeringIdsByPlacement, "offeringIdsByPlacement");
            return new Placements(fallbackOfferingId, offeringIdsByPlacement);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Placements)) {
                return false;
            }
            Placements placements = (Placements) other;
            return AbstractC16544l.m18089b(this.fallbackOfferingId, placements.fallbackOfferingId) && AbstractC16544l.m18089b(this.offeringIdsByPlacement, placements.offeringIdsByPlacement);
        }

        public final String getFallbackOfferingId() {
            return this.fallbackOfferingId;
        }

        public final Map<String, String> getOfferingIdsByPlacement() {
            return this.offeringIdsByPlacement;
        }

        public int hashCode() {
            String str = this.fallbackOfferingId;
            return this.offeringIdsByPlacement.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Placements(fallbackOfferingId=");
            sb2.append(this.fallbackOfferingId);
            sb2.append(", offeringIdsByPlacement=");
            return AbstractC12107L1.m13827r(sb2, this.offeringIdsByPlacement, ')');
        }
    }

    @Metadata(m18066d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m18067d2 = {"Lcom/revenuecat/purchases/Offerings$Targeting;", "", "revision", "", "ruleId", "", "(ILjava/lang/String;)V", "getRevision", "()I", "getRuleId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class Targeting {
        private final int revision;
        private final String ruleId;

        public Targeting(int i10, String ruleId) {
            AbstractC16544l.m18094g(ruleId, "ruleId");
            this.revision = i10;
            this.ruleId = ruleId;
        }

        public static /* synthetic */ Targeting copy$default(Targeting targeting, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = targeting.revision;
            }
            if ((i11 & 2) != 0) {
                str = targeting.ruleId;
            }
            return targeting.copy(i10, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getRevision() {
            return this.revision;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRuleId() {
            return this.ruleId;
        }

        public final Targeting copy(int revision, String ruleId) {
            AbstractC16544l.m18094g(ruleId, "ruleId");
            return new Targeting(revision, ruleId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Targeting)) {
                return false;
            }
            Targeting targeting = (Targeting) other;
            return this.revision == targeting.revision && AbstractC16544l.m18089b(this.ruleId, targeting.ruleId);
        }

        public final int getRevision() {
            return this.revision;
        }

        public final String getRuleId() {
            return this.ruleId;
        }

        public int hashCode() {
            return this.ruleId.hashCode() + (this.revision * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Targeting(revision=");
            sb2.append(this.revision);
            sb2.append(", ruleId=");
            return AbstractC9306j0.m9892k(sb2, this.ruleId, ')');
        }
    }

    public Offerings(Offering offering, Map<String, Offering> all, Placements placements, Targeting targeting) {
        AbstractC16544l.m18094g(all, "all");
        this.current = offering;
        this.all = all;
        this.placements = placements;
        this.targeting = targeting;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Offerings copy$default(Offerings offerings, Offering offering, Map map, Placements placements, Targeting targeting, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            offering = offerings.current;
        }
        if ((i10 & 2) != 0) {
            map = offerings.all;
        }
        if ((i10 & 4) != 0) {
            placements = offerings.placements;
        }
        if ((i10 & 8) != 0) {
            targeting = offerings.targeting;
        }
        return offerings.copy(offering, map, placements, targeting);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Offering getCurrent() {
        return this.current;
    }

    public final Map<String, Offering> component2() {
        return this.all;
    }

    /* JADX INFO: renamed from: component3$purchases_customEntitlementComputationRelease, reason: from getter */
    public final Placements getPlacements() {
        return this.placements;
    }

    /* JADX INFO: renamed from: component4$purchases_customEntitlementComputationRelease, reason: from getter */
    public final Targeting getTargeting() {
        return this.targeting;
    }

    public final Offerings copy(Offering current, Map<String, Offering> all, Placements placements, Targeting targeting) {
        AbstractC16544l.m18094g(all, "all");
        return new Offerings(current, all, placements, targeting);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Offerings)) {
            return false;
        }
        Offerings offerings = (Offerings) other;
        return AbstractC16544l.m18089b(this.current, offerings.current) && AbstractC16544l.m18089b(this.all, offerings.all) && AbstractC16544l.m18089b(this.placements, offerings.placements) && AbstractC16544l.m18089b(this.targeting, offerings.targeting);
    }

    public final Offering get(String identifier) {
        AbstractC16544l.m18094g(identifier, "identifier");
        return getOffering(identifier);
    }

    public final Map<String, Offering> getAll() {
        return this.all;
    }

    public final Offering getCurrent() {
        return this.current;
    }

    public final Offering getCurrentOfferingForPlacement(String placementId) {
        AbstractC16544l.m18094g(placementId, "placementId");
        Placements placements = this.placements;
        if (placements == null) {
            return null;
        }
        String str = placements.getOfferingIdsByPlacement().get(placementId);
        Offering offering = str != null ? getOffering(str) : null;
        String fallbackOfferingId = placements.getFallbackOfferingId();
        Offering offering2 = fallbackOfferingId != null ? getOffering(fallbackOfferingId) : null;
        boolean zContainsKey = placements.getOfferingIdsByPlacement().containsKey(placementId);
        if (offering == null) {
            offering = zContainsKey ? null : offering2;
        }
        if (offering != null) {
            return OfferingsKt.withPresentedContext(offering, placementId, this.targeting);
        }
        return null;
    }

    public final Offering getOffering(String identifier) {
        AbstractC16544l.m18094g(identifier, "identifier");
        return this.all.get(identifier);
    }

    public final Placements getPlacements$purchases_customEntitlementComputationRelease() {
        return this.placements;
    }

    public final Targeting getTargeting$purchases_customEntitlementComputationRelease() {
        return this.targeting;
    }

    public int hashCode() {
        Offering offering = this.current;
        int iM21250u = AbstractC20734X.m21250u((offering == null ? 0 : offering.hashCode()) * 31, 31, this.all);
        Placements placements = this.placements;
        int iHashCode = (iM21250u + (placements == null ? 0 : placements.hashCode())) * 31;
        Targeting targeting = this.targeting;
        return iHashCode + (targeting != null ? targeting.hashCode() : 0);
    }

    public String toString() {
        return "Offerings(current=" + this.current + ", all=" + this.all + ", placements=" + this.placements + ", targeting=" + this.targeting + ')';
    }

    public /* synthetic */ Offerings(Offering offering, Map map, Placements placements, Targeting targeting, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(offering, map, (i10 & 4) != 0 ? null : placements, (i10 & 8) != 0 ? null : targeting);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Offerings(Offering offering, Map<String, Offering> all) {
        this(offering, all, null, null);
        AbstractC16544l.m18094g(all, "all");
    }
}
