package com.revenuecat.purchases.models;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.PresentedOfferingContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.InterfaceC17300c;
import p003A1.AbstractC0168G;
import p1113xn.AbstractC21322p;
import p628Zk.GwZB.tpXhEMGxfXFVSh;
import p775h2.AbstractC14376f;
import p826j6.C16162p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bg\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012BW\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0014B\u001b\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0000\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0012\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b#\u0010$J|\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u0018R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\u001cR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b6\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\u001fR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b9\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010\"R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\b=\u0010$R\u0014\u0010?\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0018R\u001c\u0010C\u001a\u0004\u0018\u00010\u00028VX\u0097\u0004¢\u0006\f\u0012\u0004\bA\u0010B\u001a\u0004\b@\u0010\u0018R\u0014\u0010G\u001a\u00020D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006H"}, m18067d2 = {"Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "", "productId", "basePlanId", "offerId", "", "Lcom/revenuecat/purchases/models/PricingPhase;", "pricingPhases", "tags", "Lj6/p;", "productDetails", "offerToken", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "installmentsInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lj6/p;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;)V", "presentedOfferingId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lj6/p;Ljava/lang/String;Ljava/lang/String;)V", "subscriptionOption", "(Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "()Lj6/p;", "component7", "component8", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "component9", "()Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lj6/p;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;)Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "getBasePlanId", "getOfferId", "Ljava/util/List;", "getPricingPhases", "getTags", "Lj6/p;", "getProductDetails", "getOfferToken", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "getInstallmentsInfo", "getId", ParameterNames.f31999ID, "getPresentedOfferingIdentifier", "getPresentedOfferingIdentifier$annotations", "()V", "presentedOfferingIdentifier", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class GoogleSubscriptionOption implements SubscriptionOption {
    private final String basePlanId;
    private final GoogleInstallmentsInfo installmentsInfo;
    private final String offerId;
    private final String offerToken;
    private final PresentedOfferingContext presentedOfferingContext;
    private final List<PricingPhase> pricingPhases;
    private final C16162p productDetails;
    private final String productId;
    private final List<String> tags;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(String productId, String basePlanId, String str, List<PricingPhase> pricingPhases, List<String> tags, C16162p productDetails, String offerToken) {
        this(productId, basePlanId, str, pricingPhases, tags, productDetails, offerToken, null, null, 384, null);
        AbstractC16544l.m18094g(productId, "productId");
        AbstractC16544l.m18094g(basePlanId, "basePlanId");
        AbstractC16544l.m18094g(pricingPhases, "pricingPhases");
        AbstractC16544l.m18094g(tags, "tags");
        AbstractC16544l.m18094g(productDetails, "productDetails");
        AbstractC16544l.m18094g(offerToken, "offerToken");
    }

    @InterfaceC17300c
    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBasePlanId() {
        return this.basePlanId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    public final List<PricingPhase> component4() {
        return this.pricingPhases;
    }

    public final List<String> component5() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final C16162p getProductDetails() {
        return this.productDetails;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOfferToken() {
        return this.offerToken;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final GoogleInstallmentsInfo getInstallmentsInfo() {
        return this.installmentsInfo;
    }

    public final GoogleSubscriptionOption copy(String productId, String basePlanId, String offerId, List<PricingPhase> pricingPhases, List<String> tags, C16162p productDetails, String offerToken, PresentedOfferingContext presentedOfferingContext, GoogleInstallmentsInfo installmentsInfo) {
        AbstractC16544l.m18094g(productId, "productId");
        AbstractC16544l.m18094g(basePlanId, "basePlanId");
        AbstractC16544l.m18094g(pricingPhases, "pricingPhases");
        AbstractC16544l.m18094g(tags, "tags");
        AbstractC16544l.m18094g(productDetails, "productDetails");
        AbstractC16544l.m18094g(offerToken, "offerToken");
        return new GoogleSubscriptionOption(productId, basePlanId, offerId, pricingPhases, tags, productDetails, offerToken, presentedOfferingContext, installmentsInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoogleSubscriptionOption)) {
            return false;
        }
        GoogleSubscriptionOption googleSubscriptionOption = (GoogleSubscriptionOption) other;
        return AbstractC16544l.m18089b(this.productId, googleSubscriptionOption.productId) && AbstractC16544l.m18089b(this.basePlanId, googleSubscriptionOption.basePlanId) && AbstractC16544l.m18089b(this.offerId, googleSubscriptionOption.offerId) && AbstractC16544l.m18089b(this.pricingPhases, googleSubscriptionOption.pricingPhases) && AbstractC16544l.m18089b(this.tags, googleSubscriptionOption.tags) && AbstractC16544l.m18089b(this.productDetails, googleSubscriptionOption.productDetails) && AbstractC16544l.m18089b(this.offerToken, googleSubscriptionOption.offerToken) && AbstractC16544l.m18089b(this.presentedOfferingContext, googleSubscriptionOption.presentedOfferingContext) && AbstractC16544l.m18089b(this.installmentsInfo, googleSubscriptionOption.installmentsInfo);
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public Period getBillingPeriod() {
        return SubscriptionOption.DefaultImpls.getBillingPeriod(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PricingPhase getFreePhase() {
        return SubscriptionOption.DefaultImpls.getFreePhase(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PricingPhase getFullPricePhase() {
        return SubscriptionOption.DefaultImpls.getFullPricePhase(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public String getId() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.basePlanId);
        String str2 = this.offerId;
        if (str2 == null || AbstractC21322p.m21681O(str2)) {
            str = "";
        } else {
            str = ":" + this.offerId;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PricingPhase getIntroPhase() {
        return SubscriptionOption.DefaultImpls.getIntroPhase(this);
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public String getPresentedOfferingIdentifier() {
        PresentedOfferingContext presentedOfferingContext = getPresentedOfferingContext();
        if (presentedOfferingContext != null) {
            return presentedOfferingContext.getOfferingIdentifier();
        }
        return null;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public List<PricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    public final C16162p getProductDetails() {
        return this.productDetails;
    }

    public final String getProductId() {
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PurchasingData getPurchasingData() {
        return new GooglePurchasingData.Subscription(this.productId, getId(), this.productDetails, this.offerToken);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public List<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.productId.hashCode() * 31, 31, this.basePlanId);
        String str = this.offerId;
        int iM527p2 = AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC14376f.m15858x(this.tags, AbstractC14376f.m15858x(this.pricingPhases, (iM527p + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.productDetails.f50175a), 31, this.offerToken);
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        int iHashCode = (iM527p2 + (presentedOfferingContext == null ? 0 : presentedOfferingContext.hashCode())) * 31;
        GoogleInstallmentsInfo googleInstallmentsInfo = this.installmentsInfo;
        return iHashCode + (googleInstallmentsInfo != null ? googleInstallmentsInfo.hashCode() : 0);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public boolean isBasePlan() {
        return SubscriptionOption.DefaultImpls.isBasePlan(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public boolean isPrepaid() {
        return SubscriptionOption.DefaultImpls.isPrepaid(this);
    }

    public String toString() {
        return "GoogleSubscriptionOption(productId=" + this.productId + ", basePlanId=" + this.basePlanId + ", offerId=" + this.offerId + ", pricingPhases=" + this.pricingPhases + ", tags=" + this.tags + ", productDetails=" + this.productDetails + ", offerToken=" + this.offerToken + ", presentedOfferingContext=" + this.presentedOfferingContext + ", installmentsInfo=" + this.installmentsInfo + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(String productId, String basePlanId, String str, List<PricingPhase> pricingPhases, List<String> tags, C16162p productDetails, String offerToken, PresentedOfferingContext presentedOfferingContext) {
        this(productId, basePlanId, str, pricingPhases, tags, productDetails, offerToken, presentedOfferingContext, null, 256, null);
        AbstractC16544l.m18094g(productId, "productId");
        AbstractC16544l.m18094g(basePlanId, "basePlanId");
        AbstractC16544l.m18094g(pricingPhases, "pricingPhases");
        AbstractC16544l.m18094g(tags, "tags");
        AbstractC16544l.m18094g(productDetails, "productDetails");
        AbstractC16544l.m18094g(offerToken, "offerToken");
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public GoogleInstallmentsInfo getInstallmentsInfo() {
        return this.installmentsInfo;
    }

    public GoogleSubscriptionOption(String productId, String str, String str2, List<PricingPhase> pricingPhases, List<String> tags, C16162p productDetails, String offerToken, PresentedOfferingContext presentedOfferingContext, GoogleInstallmentsInfo googleInstallmentsInfo) {
        AbstractC16544l.m18094g(productId, "productId");
        AbstractC16544l.m18094g(str, tpXhEMGxfXFVSh.dMYCzx);
        AbstractC16544l.m18094g(pricingPhases, "pricingPhases");
        AbstractC16544l.m18094g(tags, "tags");
        AbstractC16544l.m18094g(productDetails, "productDetails");
        AbstractC16544l.m18094g(offerToken, "offerToken");
        this.productId = productId;
        this.basePlanId = str;
        this.offerId = str2;
        this.pricingPhases = pricingPhases;
        this.tags = tags;
        this.productDetails = productDetails;
        this.offerToken = offerToken;
        this.presentedOfferingContext = presentedOfferingContext;
        this.installmentsInfo = googleInstallmentsInfo;
    }

    public /* synthetic */ GoogleSubscriptionOption(String str, String str2, String str3, List list, List list2, C16162p c16162p, String str4, PresentedOfferingContext presentedOfferingContext, GoogleInstallmentsInfo googleInstallmentsInfo, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, list2, c16162p, str4, (i10 & 128) != 0 ? null : presentedOfferingContext, (i10 & 256) != 0 ? null : googleInstallmentsInfo);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC17300c
    public GoogleSubscriptionOption(String productId, String basePlanId, String str, List<PricingPhase> pricingPhases, List<String> tags, C16162p productDetails, String offerToken, String presentedOfferingId) {
        this(productId, basePlanId, str, pricingPhases, tags, productDetails, offerToken, new PresentedOfferingContext(presentedOfferingId), null, 256, null);
        AbstractC16544l.m18094g(productId, "productId");
        AbstractC16544l.m18094g(basePlanId, "basePlanId");
        AbstractC16544l.m18094g(pricingPhases, "pricingPhases");
        AbstractC16544l.m18094g(tags, "tags");
        AbstractC16544l.m18094g(productDetails, "productDetails");
        AbstractC16544l.m18094g(offerToken, "offerToken");
        AbstractC16544l.m18094g(presentedOfferingId, "presentedOfferingId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(GoogleSubscriptionOption subscriptionOption, PresentedOfferingContext presentedOfferingContext) {
        this(subscriptionOption.productId, subscriptionOption.basePlanId, subscriptionOption.offerId, subscriptionOption.getPricingPhases(), subscriptionOption.getTags(), subscriptionOption.productDetails, subscriptionOption.offerToken, presentedOfferingContext, subscriptionOption.getInstallmentsInfo());
        AbstractC16544l.m18094g(subscriptionOption, "subscriptionOption");
    }
}
