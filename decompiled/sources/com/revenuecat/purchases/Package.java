package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreProduct;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.InterfaceC17300c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, m18067d2 = {"Lcom/revenuecat/purchases/Package;", "", "identifier", "", "packageType", "Lcom/revenuecat/purchases/PackageType;", "product", "Lcom/revenuecat/purchases/models/StoreProduct;", "offering", "(Ljava/lang/String;Lcom/revenuecat/purchases/PackageType;Lcom/revenuecat/purchases/models/StoreProduct;Ljava/lang/String;)V", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "(Ljava/lang/String;Lcom/revenuecat/purchases/PackageType;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "getIdentifier", "()Ljava/lang/String;", "getOffering$annotations", "()V", "getOffering", "getPackageType", "()Lcom/revenuecat/purchases/PackageType;", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "getProduct", "()Lcom/revenuecat/purchases/models/StoreProduct;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class Package {
    private final String identifier;
    private final PackageType packageType;
    private final PresentedOfferingContext presentedOfferingContext;
    private final StoreProduct product;

    public Package(String identifier, PackageType packageType, StoreProduct product, PresentedOfferingContext presentedOfferingContext) {
        AbstractC16544l.m18094g(identifier, "identifier");
        AbstractC16544l.m18094g(packageType, "packageType");
        AbstractC16544l.m18094g(product, "product");
        AbstractC16544l.m18094g(presentedOfferingContext, "presentedOfferingContext");
        this.identifier = identifier;
        this.packageType = packageType;
        this.product = product;
        this.presentedOfferingContext = presentedOfferingContext;
    }

    public static /* synthetic */ Package copy$default(Package r6, String str, PackageType packageType, StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = r6.identifier;
        }
        if ((i10 & 2) != 0) {
            packageType = r6.packageType;
        }
        if ((i10 & 4) != 0) {
            storeProduct = r6.product;
        }
        if ((i10 & 8) != 0) {
            presentedOfferingContext = r6.presentedOfferingContext;
        }
        return r6.copy(str, packageType, storeProduct, presentedOfferingContext);
    }

    @InterfaceC17300c
    public static /* synthetic */ void getOffering$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PackageType getPackageType() {
        return this.packageType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final StoreProduct getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final Package copy(String identifier, PackageType packageType, StoreProduct product, PresentedOfferingContext presentedOfferingContext) {
        AbstractC16544l.m18094g(identifier, "identifier");
        AbstractC16544l.m18094g(packageType, "packageType");
        AbstractC16544l.m18094g(product, "product");
        AbstractC16544l.m18094g(presentedOfferingContext, "presentedOfferingContext");
        return new Package(identifier, packageType, product, presentedOfferingContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Package)) {
            return false;
        }
        Package r6 = (Package) other;
        return AbstractC16544l.m18089b(this.identifier, r6.identifier) && this.packageType == r6.packageType && AbstractC16544l.m18089b(this.product, r6.product) && AbstractC16544l.m18089b(this.presentedOfferingContext, r6.presentedOfferingContext);
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getOffering() {
        String offeringIdentifier = this.presentedOfferingContext.getOfferingIdentifier();
        return offeringIdentifier == null ? "" : offeringIdentifier;
    }

    public final PackageType getPackageType() {
        return this.packageType;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final StoreProduct getProduct() {
        return this.product;
    }

    public int hashCode() {
        return this.presentedOfferingContext.hashCode() + ((this.product.hashCode() + ((this.packageType.hashCode() + (this.identifier.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Package(identifier=" + this.identifier + ", packageType=" + this.packageType + ", product=" + this.product + ", presentedOfferingContext=" + this.presentedOfferingContext + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC17300c
    public Package(String identifier, PackageType packageType, StoreProduct product, String offering) {
        this(identifier, packageType, product, new PresentedOfferingContext(offering));
        AbstractC16544l.m18094g(identifier, "identifier");
        AbstractC16544l.m18094g(packageType, "packageType");
        AbstractC16544l.m18094g(product, "product");
        AbstractC16544l.m18094g(offering, "offering");
    }
}
