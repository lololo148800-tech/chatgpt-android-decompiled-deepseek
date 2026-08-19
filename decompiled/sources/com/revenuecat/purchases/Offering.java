package com.revenuecat.purchases;

import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.InterfaceC17306i;
import p003A1.AbstractC0168G;
import p1071w0.AbstractC20734X;
import p571X9.AbstractC9227W;
import p775h2.AbstractC14376f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\"JV\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001bR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\"R\u001d\u0010:\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001d\u0010=\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u00109R\u001d\u0010@\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b>\u00107\u001a\u0004\b?\u00109R\u001d\u0010C\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u00109R\u001d\u0010F\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bD\u00107\u001a\u0004\bE\u00109R\u001d\u0010I\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u00107\u001a\u0004\bH\u00109R\u001d\u0010L\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bJ\u00107\u001a\u0004\bK\u00109¨\u0006M"}, m18067d2 = {"Lcom/revenuecat/purchases/Offering;", "", "", "identifier", "serverDescription", "", "metadata", "", "Lcom/revenuecat/purchases/Package;", "availablePackages", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "paywall", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lcom/revenuecat/purchases/paywalls/PaywallData;)V", "Lcom/revenuecat/purchases/PackageType;", "packageType", "findPackage", "(Lcom/revenuecat/purchases/PackageType;)Lcom/revenuecat/purchases/Package;", "s", "get", "(Ljava/lang/String;)Lcom/revenuecat/purchases/Package;", "getPackage", SubscriberAttributeKt.JSON_NAME_KEY, "default", "getMetadataString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "component4", "()Ljava/util/List;", "component5", "()Lcom/revenuecat/purchases/paywalls/PaywallData;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lcom/revenuecat/purchases/paywalls/PaywallData;)Lcom/revenuecat/purchases/Offering;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier", "getServerDescription", "Ljava/util/Map;", "getMetadata", "Ljava/util/List;", "getAvailablePackages", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "getPaywall", "lifetime$delegate", "Lmm/i;", "getLifetime", "()Lcom/revenuecat/purchases/Package;", "lifetime", "annual$delegate", "getAnnual", "annual", "sixMonth$delegate", "getSixMonth", "sixMonth", "threeMonth$delegate", "getThreeMonth", "threeMonth", "twoMonth$delegate", "getTwoMonth", "twoMonth", "monthly$delegate", "getMonthly", "monthly", "weekly$delegate", "getWeekly", "weekly", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class Offering {

    /* JADX INFO: renamed from: annual$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i annual;
    private final List<Package> availablePackages;
    private final String identifier;

    /* JADX INFO: renamed from: lifetime$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i lifetime;
    private final Map<String, Object> metadata;

    /* JADX INFO: renamed from: monthly$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i monthly;
    private final PaywallData paywall;
    private final String serverDescription;

    /* JADX INFO: renamed from: sixMonth$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i sixMonth;

    /* JADX INFO: renamed from: threeMonth$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i threeMonth;

    /* JADX INFO: renamed from: twoMonth$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i twoMonth;

    /* JADX INFO: renamed from: weekly$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i weekly;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Offering(String identifier, String serverDescription, Map<String, ? extends Object> metadata, List<Package> availablePackages) {
        this(identifier, serverDescription, metadata, availablePackages, null, 16, null);
        AbstractC16544l.m18094g(identifier, "identifier");
        AbstractC16544l.m18094g(serverDescription, "serverDescription");
        AbstractC16544l.m18094g(metadata, "metadata");
        AbstractC16544l.m18094g(availablePackages, "availablePackages");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Offering copy$default(Offering offering, String str, String str2, Map map, List list, PaywallData paywallData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = offering.identifier;
        }
        if ((i10 & 2) != 0) {
            str2 = offering.serverDescription;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            map = offering.metadata;
        }
        Map map2 = map;
        if ((i10 & 8) != 0) {
            list = offering.availablePackages;
        }
        List list2 = list;
        if ((i10 & 16) != 0) {
            paywallData = offering.paywall;
        }
        return offering.copy(str, str3, map2, list2, paywallData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Package findPackage(PackageType packageType) {
        Object next;
        Iterator<T> it = this.availablePackages.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (AbstractC16544l.m18089b(((Package) next).getIdentifier(), packageType.getIdentifier())) {
                return (Package) next;
            }
        }
        next = null;
        return (Package) next;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getServerDescription() {
        return this.serverDescription;
    }

    public final Map<String, Object> component3() {
        return this.metadata;
    }

    public final List<Package> component4() {
        return this.availablePackages;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PaywallData getPaywall() {
        return this.paywall;
    }

    public final Offering copy(String identifier, String serverDescription, Map<String, ? extends Object> metadata, List<Package> availablePackages, PaywallData paywall) {
        AbstractC16544l.m18094g(identifier, "identifier");
        AbstractC16544l.m18094g(serverDescription, "serverDescription");
        AbstractC16544l.m18094g(metadata, "metadata");
        AbstractC16544l.m18094g(availablePackages, "availablePackages");
        return new Offering(identifier, serverDescription, metadata, availablePackages, paywall);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Offering)) {
            return false;
        }
        Offering offering = (Offering) other;
        return AbstractC16544l.m18089b(this.identifier, offering.identifier) && AbstractC16544l.m18089b(this.serverDescription, offering.serverDescription) && AbstractC16544l.m18089b(this.metadata, offering.metadata) && AbstractC16544l.m18089b(this.availablePackages, offering.availablePackages) && AbstractC16544l.m18089b(this.paywall, offering.paywall);
    }

    public final Package get(String s10) {
        AbstractC16544l.m18094g(s10, "s");
        return getPackage(s10);
    }

    public final Package getAnnual() {
        return (Package) this.annual.getValue();
    }

    public final List<Package> getAvailablePackages() {
        return this.availablePackages;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Package getLifetime() {
        return (Package) this.lifetime.getValue();
    }

    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public final String getMetadataString(String key, String str) {
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(str, "default");
        Object obj = this.metadata.get(key);
        String str2 = obj instanceof String ? (String) obj : null;
        return str2 == null ? str : str2;
    }

    public final Package getMonthly() {
        return (Package) this.monthly.getValue();
    }

    public final Package getPackage(String identifier) {
        AbstractC16544l.m18094g(identifier, "identifier");
        for (Package r6 : this.availablePackages) {
            if (AbstractC16544l.m18089b(r6.getIdentifier(), identifier)) {
                return r6;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final PaywallData getPaywall() {
        return this.paywall;
    }

    public final String getServerDescription() {
        return this.serverDescription;
    }

    public final Package getSixMonth() {
        return (Package) this.sixMonth.getValue();
    }

    public final Package getThreeMonth() {
        return (Package) this.threeMonth.getValue();
    }

    public final Package getTwoMonth() {
        return (Package) this.twoMonth.getValue();
    }

    public final Package getWeekly() {
        return (Package) this.weekly.getValue();
    }

    public int hashCode() {
        int iM15858x = AbstractC14376f.m15858x(this.availablePackages, AbstractC20734X.m21250u(AbstractC0168G.m527p(this.identifier.hashCode() * 31, 31, this.serverDescription), 31, this.metadata), 31);
        PaywallData paywallData = this.paywall;
        return iM15858x + (paywallData == null ? 0 : paywallData.hashCode());
    }

    public String toString() {
        return "Offering(identifier=" + this.identifier + ", serverDescription=" + this.serverDescription + ", metadata=" + this.metadata + ", availablePackages=" + this.availablePackages + ", paywall=" + this.paywall + ')';
    }

    public Offering(String identifier, String serverDescription, Map<String, ? extends Object> metadata, List<Package> availablePackages, PaywallData paywallData) {
        AbstractC16544l.m18094g(identifier, "identifier");
        AbstractC16544l.m18094g(serverDescription, "serverDescription");
        AbstractC16544l.m18094g(metadata, "metadata");
        AbstractC16544l.m18094g(availablePackages, "availablePackages");
        this.identifier = identifier;
        this.serverDescription = serverDescription;
        this.metadata = metadata;
        this.availablePackages = availablePackages;
        this.paywall = paywallData;
        this.lifetime = AbstractC9227W.m9800c(new Offering$lifetime$2(this));
        this.annual = AbstractC9227W.m9800c(new Offering$annual$2(this));
        this.sixMonth = AbstractC9227W.m9800c(new Offering$sixMonth$2(this));
        this.threeMonth = AbstractC9227W.m9800c(new Offering$threeMonth$2(this));
        this.twoMonth = AbstractC9227W.m9800c(new Offering$twoMonth$2(this));
        this.monthly = AbstractC9227W.m9800c(new Offering$monthly$2(this));
        this.weekly = AbstractC9227W.m9800c(new Offering$weekly$2(this));
    }

    public /* synthetic */ Offering(String str, String str2, Map map, List list, PaywallData paywallData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map, list, (i10 & 16) != 0 ? null : paywallData);
    }
}
