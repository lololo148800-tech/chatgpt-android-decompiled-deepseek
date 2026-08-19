package com.revenuecat.purchases.models;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.InterfaceC17300c;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17678l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\fBO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\n\u00102\u001a\u0004\u0018\u00010*H\u0002J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\tHÂ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0007HÂ\u0003J_\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0010\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u0003H\u0017J\u0012\u0010>\u001a\u00020\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010BHÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0014R\u0016\u0010)\u001a\u0004\u0018\u00010*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0014R\u0014\u0010.\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006F"}, m18067d2 = {"Lcom/revenuecat/purchases/models/TestStoreProduct;", "Lcom/revenuecat/purchases/models/StoreProduct;", ParameterNames.f31999ID, "", UiComponentConfig.Title.type, "description", "price", "Lcom/revenuecat/purchases/models/Price;", "period", "Lcom/revenuecat/purchases/models/Period;", "freeTrialPeriod", "introPrice", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Price;)V", DiagnosticsEntry.NAME_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Price;)V", "defaultOption", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "getDefaultOption", "()Lcom/revenuecat/purchases/models/SubscriptionOption;", "getDescription", "()Ljava/lang/String;", "getId", "getName", "getPeriod", "()Lcom/revenuecat/purchases/models/Period;", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingIdentifier", "getPresentedOfferingIdentifier$annotations", "()V", "getPresentedOfferingIdentifier", "getPrice", "()Lcom/revenuecat/purchases/models/Price;", "purchasingData", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", ProxyAmazonBillingActivity.EXTRAS_SKU, "getSku", "subscriptionOptions", "Lcom/revenuecat/purchases/models/SubscriptionOptions;", "getSubscriptionOptions", "()Lcom/revenuecat/purchases/models/SubscriptionOptions;", "getTitle", "type", "Lcom/revenuecat/purchases/ProductType;", "getType", "()Lcom/revenuecat/purchases/ProductType;", "buildSubscriptionOptions", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "copyWithOfferingId", "offeringId", "copyWithPresentedOfferingContext", "equals", "", "other", "", "hashCode", "", "toString", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class TestStoreProduct implements StoreProduct {
    private final String description;
    private final Period freeTrialPeriod;
    private final String id;
    private final Price introPrice;
    private final String name;
    private final Period period;
    private final Price price;
    private final String title;

    public TestStoreProduct(String id2, String name, String title, String description, Price price, Period period, Period period2, Price price2) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(description, "description");
        AbstractC16544l.m18094g(price, "price");
        this.id = id2;
        this.name = name;
        this.title = title;
        this.description = description;
        this.price = price;
        this.period = period;
        this.freeTrialPeriod = period2;
        this.introPrice = price2;
    }

    private final SubscriptionOptions buildSubscriptionOptions() {
        if (getPeriod() == null) {
            return null;
        }
        Period period = this.freeTrialPeriod;
        PricingPhase pricingPhase = period != null ? new PricingPhase(period, RecurrenceMode.FINITE_RECURRING, 1, new Price("Free", 0L, getPrice().getCurrencyCode())) : null;
        Price price = this.introPrice;
        PricingPhase pricingPhase2 = price != null ? new PricingPhase(new Period(1, Period.Unit.MONTH, "P1M"), RecurrenceMode.FINITE_RECURRING, 1, price) : null;
        PricingPhase pricingPhase3 = new PricingPhase(getPeriod(), RecurrenceMode.INFINITE_RECURRING, null, getPrice());
        return new SubscriptionOptions(AbstractC17678l.m19315v(new TestSubscriptionOption[]{(this.freeTrialPeriod == null && pricingPhase2 == null) ? null : new TestSubscriptionOption(getId(), AbstractC17678l.m19315v(new PricingPhase[]{pricingPhase, pricingPhase2, pricingPhase3}), null, null, null, null, 60, null), new TestSubscriptionOption(getId(), AbstractC9393x3.m9974d(pricingPhase3), null, null, null, null, 60, null)}));
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final Period getFreeTrialPeriod() {
        return this.freeTrialPeriod;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    private final Price getIntroPrice() {
        return this.introPrice;
    }

    @InterfaceC17300c
    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Price getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Period getPeriod() {
        return this.period;
    }

    public final TestStoreProduct copy(String id2, String name, String title, String description, Price price, Period period, Period freeTrialPeriod, Price introPrice) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(description, "description");
        AbstractC16544l.m18094g(price, "price");
        return new TestStoreProduct(id2, name, title, description, price, period, freeTrialPeriod, introPrice);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    @InterfaceC17300c
    public StoreProduct copyWithOfferingId(String offeringId) {
        AbstractC16544l.m18094g(offeringId, "offeringId");
        return copyWithPresentedOfferingContext(new PresentedOfferingContext(offeringId));
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public StoreProduct copyWithPresentedOfferingContext(PresentedOfferingContext presentedOfferingContext) {
        return this;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestStoreProduct)) {
            return false;
        }
        TestStoreProduct testStoreProduct = (TestStoreProduct) other;
        return AbstractC16544l.m18089b(this.id, testStoreProduct.id) && AbstractC16544l.m18089b(this.name, testStoreProduct.name) && AbstractC16544l.m18089b(this.title, testStoreProduct.title) && AbstractC16544l.m18089b(this.description, testStoreProduct.description) && AbstractC16544l.m18089b(this.price, testStoreProduct.price) && AbstractC16544l.m18089b(this.period, testStoreProduct.period) && AbstractC16544l.m18089b(this.freeTrialPeriod, testStoreProduct.freeTrialPeriod) && AbstractC16544l.m18089b(this.introPrice, testStoreProduct.introPrice);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String formattedPricePerMonth(Locale locale) {
        return StoreProduct.DefaultImpls.formattedPricePerMonth(this, locale);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOption getDefaultOption() {
        SubscriptionOptions subscriptionOptions = getSubscriptionOptions();
        if (subscriptionOptions != null) {
            return subscriptionOptions.getDefaultOffer();
        }
        return null;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getDescription() {
        return this.description;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getId() {
        return this.id;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getName() {
        return this.name;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Period getPeriod() {
        return this.period;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public PresentedOfferingContext getPresentedOfferingContext() {
        return null;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getPresentedOfferingIdentifier() {
        PresentedOfferingContext presentedOfferingContext = getPresentedOfferingContext();
        if (presentedOfferingContext != null) {
            return presentedOfferingContext.getOfferingIdentifier();
        }
        return null;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price getPrice() {
        return this.price;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public PurchasingData getPurchasingData() {
        return new PurchasingData() { // from class: com.revenuecat.purchases.models.TestStoreProduct$purchasingData$1
            @Override // com.revenuecat.purchases.models.PurchasingData
            public String getProductId() {
                return this.this$0.getId();
            }

            @Override // com.revenuecat.purchases.models.PurchasingData
            public ProductType getProductType() {
                return this.this$0.getType();
            }
        };
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getSku() {
        return getId();
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOptions getSubscriptionOptions() {
        return buildSubscriptionOptions();
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getTitle() {
        return this.title;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public ProductType getType() {
        return getPeriod() == null ? ProductType.INAPP : ProductType.SUBS;
    }

    public int hashCode() {
        int iHashCode = (this.price.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(this.id.hashCode() * 31, 31, this.name), 31, this.title), 31, this.description)) * 31;
        Period period = this.period;
        int iHashCode2 = (iHashCode + (period == null ? 0 : period.hashCode())) * 31;
        Period period2 = this.freeTrialPeriod;
        int iHashCode3 = (iHashCode2 + (period2 == null ? 0 : period2.hashCode())) * 31;
        Price price = this.introPrice;
        return iHashCode3 + (price != null ? price.hashCode() : 0);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price pricePerMonth(Locale locale) {
        return StoreProduct.DefaultImpls.pricePerMonth(this, locale);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price pricePerWeek(Locale locale) {
        return StoreProduct.DefaultImpls.pricePerWeek(this, locale);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price pricePerYear(Locale locale) {
        return StoreProduct.DefaultImpls.pricePerYear(this, locale);
    }

    public String toString() {
        return "TestStoreProduct(id=" + this.id + ", name=" + this.name + ", title=" + this.title + ", description=" + this.description + ", price=" + this.price + ", period=" + this.period + ", freeTrialPeriod=" + this.freeTrialPeriod + ", introPrice=" + this.introPrice + ')';
    }

    public /* synthetic */ TestStoreProduct(String str, String str2, String str3, String str4, Price price, Period period, Period period2, Price price2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, price, period, (i10 & 64) != 0 ? null : period2, (i10 & 128) != 0 ? null : price2);
    }

    public /* synthetic */ TestStoreProduct(String str, String str2, String str3, Price price, Period period, Period period2, Price price2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, price, period, (i10 & 32) != 0 ? null : period2, (i10 & 64) != 0 ? null : price2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC17300c
    public TestStoreProduct(String id2, String title, String description, Price price, Period period, Period period2, Price price2) {
        this(id2, title, title, description, price, period, period2, price2);
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(description, "description");
        AbstractC16544l.m18094g(price, "price");
    }
}
