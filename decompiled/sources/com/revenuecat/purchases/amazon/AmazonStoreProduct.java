package com.revenuecat.purchases.amazon;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.InterfaceC17300c;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bs\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0015Bw\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0003¢\u0006\u0002\u0010\u0017B{\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aJ\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010=\u001a\u00020\u0013HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010D\u001a\u00020\u000bHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0095\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001J\u0010\u0010H\u001a\u00020\u00012\u0006\u0010I\u001a\u00020\u0003H\u0017J\u0012\u0010J\u001a\u00020\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0013\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010NH\u0096\u0002J\b\u0010O\u001a\u00020PH\u0016J\t\u0010Q\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0014\u0010\u0016\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001eR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u001a\u00102\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b3\u0010*\u001a\u0004\b4\u0010\u001eR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109¨\u0006R"}, m18067d2 = {"Lcom/revenuecat/purchases/amazon/AmazonStoreProduct;", "Lcom/revenuecat/purchases/models/StoreProduct;", ParameterNames.f31999ID, "", "type", "Lcom/revenuecat/purchases/ProductType;", UiComponentConfig.Title.type, "description", "period", "Lcom/revenuecat/purchases/models/Period;", "price", "Lcom/revenuecat/purchases/models/Price;", "subscriptionOptions", "Lcom/revenuecat/purchases/models/SubscriptionOptions;", "defaultOption", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "iconUrl", "freeTrialPeriod", "originalProductJSON", "Lorg/json/JSONObject;", "presentedOfferingIdentifier", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lorg/json/JSONObject;Ljava/lang/String;)V", DiagnosticsEntry.NAME_KEY, "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lorg/json/JSONObject;Ljava/lang/String;)V", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lorg/json/JSONObject;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "getDefaultOption", "()Lcom/revenuecat/purchases/models/SubscriptionOption;", "getDescription", "()Ljava/lang/String;", "getFreeTrialPeriod", "()Lcom/revenuecat/purchases/models/Period;", "getIconUrl", "getId", "getName", "getOriginalProductJSON", "()Lorg/json/JSONObject;", "getPeriod", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingIdentifier$annotations", "()V", "getPresentedOfferingIdentifier", "getPrice", "()Lcom/revenuecat/purchases/models/Price;", "purchasingData", "Lcom/revenuecat/purchases/amazon/AmazonPurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/amazon/AmazonPurchasingData;", ProxyAmazonBillingActivity.EXTRAS_SKU, "getSku$annotations", "getSku", "getSubscriptionOptions", "()Lcom/revenuecat/purchases/models/SubscriptionOptions;", "getTitle", "getType", "()Lcom/revenuecat/purchases/ProductType;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copyWithOfferingId", "offeringId", "copyWithPresentedOfferingContext", "equals", "", "other", "", "hashCode", "", "toString", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class AmazonStoreProduct implements StoreProduct {
    private final SubscriptionOption defaultOption;
    private final String description;
    private final Period freeTrialPeriod;
    private final String iconUrl;
    private final String id;
    private final String name;
    private final JSONObject originalProductJSON;
    private final Period period;
    private final PresentedOfferingContext presentedOfferingContext;
    private final Price price;
    private final SubscriptionOptions subscriptionOptions;
    private final String title;
    private final ProductType type;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmazonStoreProduct(String id2, ProductType type, String name, String title, String description, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String iconUrl, Period period2, JSONObject originalProductJSON) {
        this(id2, type, name, title, description, period, price, subscriptionOptions, subscriptionOption, iconUrl, period2, originalProductJSON, null, 4096, null);
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(description, "description");
        AbstractC16544l.m18094g(price, "price");
        AbstractC16544l.m18094g(iconUrl, "iconUrl");
        AbstractC16544l.m18094g(originalProductJSON, "originalProductJSON");
    }

    @InterfaceC17300c
    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    @InterfaceC17300c
    public static /* synthetic */ void getSku$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Period getFreeTrialPeriod() {
        return this.freeTrialPeriod;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final JSONObject getOriginalProductJSON() {
        return this.originalProductJSON;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ProductType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Period getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Price getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final SubscriptionOptions getSubscriptionOptions() {
        return this.subscriptionOptions;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final SubscriptionOption getDefaultOption() {
        return this.defaultOption;
    }

    public final AmazonStoreProduct copy(String id2, ProductType type, String name, String title, String description, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption defaultOption, String iconUrl, Period freeTrialPeriod, JSONObject originalProductJSON, PresentedOfferingContext presentedOfferingContext) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(description, "description");
        AbstractC16544l.m18094g(price, "price");
        AbstractC16544l.m18094g(iconUrl, "iconUrl");
        AbstractC16544l.m18094g(originalProductJSON, "originalProductJSON");
        return new AmazonStoreProduct(id2, type, name, title, description, period, price, subscriptionOptions, defaultOption, iconUrl, freeTrialPeriod, originalProductJSON, presentedOfferingContext);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    @InterfaceC17300c
    public StoreProduct copyWithOfferingId(String offeringId) {
        PresentedOfferingContext presentedOfferingContext;
        AbstractC16544l.m18094g(offeringId, "offeringId");
        PresentedOfferingContext presentedOfferingContext2 = getPresentedOfferingContext();
        if (presentedOfferingContext2 == null || (presentedOfferingContext = PresentedOfferingContext.copy$default(presentedOfferingContext2, offeringId, null, null, 6, null)) == null) {
            presentedOfferingContext = new PresentedOfferingContext(offeringId);
        }
        return copyWithPresentedOfferingContext(presentedOfferingContext);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public StoreProduct copyWithPresentedOfferingContext(PresentedOfferingContext presentedOfferingContext) {
        return new AmazonStoreProduct(getId(), getType(), getName(), getTitle(), getDescription(), getPeriod(), getPrice(), getSubscriptionOptions(), getDefaultOption(), this.iconUrl, this.freeTrialPeriod, this.originalProductJSON, presentedOfferingContext);
    }

    public boolean equals(Object other) {
        return (other instanceof AmazonStoreProduct) && new ComparableData(this).equals(new ComparableData((AmazonStoreProduct) other));
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String formattedPricePerMonth(Locale locale) {
        return StoreProduct.DefaultImpls.formattedPricePerMonth(this, locale);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOption getDefaultOption() {
        return this.defaultOption;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getDescription() {
        return this.description;
    }

    public final Period getFreeTrialPeriod() {
        return this.freeTrialPeriod;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getId() {
        return this.id;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getName() {
        return this.name;
    }

    public final JSONObject getOriginalProductJSON() {
        return this.originalProductJSON;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Period getPeriod() {
        return this.period;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
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
    public String getSku() {
        return getId();
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOptions getSubscriptionOptions() {
        return this.subscriptionOptions;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getTitle() {
        return this.title;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        return new ComparableData(this).hashCode();
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
        return "AmazonStoreProduct(id=" + this.id + ", type=" + this.type + ", name=" + this.name + ", title=" + this.title + ", description=" + this.description + ", period=" + this.period + ", price=" + this.price + ", subscriptionOptions=" + this.subscriptionOptions + ", defaultOption=" + this.defaultOption + ", iconUrl=" + this.iconUrl + ", freeTrialPeriod=" + this.freeTrialPeriod + ", originalProductJSON=" + this.originalProductJSON + ", presentedOfferingContext=" + this.presentedOfferingContext + ')';
    }

    public AmazonStoreProduct(String id2, ProductType type, String name, String title, String description, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String iconUrl, Period period2, JSONObject originalProductJSON, PresentedOfferingContext presentedOfferingContext) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(description, "description");
        AbstractC16544l.m18094g(price, "price");
        AbstractC16544l.m18094g(iconUrl, "iconUrl");
        AbstractC16544l.m18094g(originalProductJSON, "originalProductJSON");
        this.id = id2;
        this.type = type;
        this.name = name;
        this.title = title;
        this.description = description;
        this.period = period;
        this.price = price;
        this.subscriptionOptions = subscriptionOptions;
        this.defaultOption = subscriptionOption;
        this.iconUrl = iconUrl;
        this.freeTrialPeriod = period2;
        this.originalProductJSON = originalProductJSON;
        this.presentedOfferingContext = presentedOfferingContext;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public AmazonPurchasingData getPurchasingData() {
        return new AmazonPurchasingData.Product(this);
    }

    public /* synthetic */ AmazonStoreProduct(String str, ProductType productType, String str2, String str3, String str4, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str5, Period period2, JSONObject jSONObject, PresentedOfferingContext presentedOfferingContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, productType, str2, str3, str4, period, price, subscriptionOptions, subscriptionOption, str5, period2, jSONObject, (i10 & 4096) != 0 ? null : presentedOfferingContext);
    }

    public /* synthetic */ AmazonStoreProduct(String str, ProductType productType, String str2, String str3, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str4, Period period2, JSONObject jSONObject, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, productType, str2, str3, period, price, subscriptionOptions, subscriptionOption, str4, period2, jSONObject, (i10 & 2048) != 0 ? null : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC17300c
    public AmazonStoreProduct(String id2, ProductType type, String title, String description, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String iconUrl, Period period2, JSONObject originalProductJSON, String str) {
        this(id2, type, title, title, description, period, price, subscriptionOptions, subscriptionOption, iconUrl, period2, originalProductJSON, str != null ? new PresentedOfferingContext(str) : null);
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(description, "description");
        AbstractC16544l.m18094g(price, "price");
        AbstractC16544l.m18094g(iconUrl, "iconUrl");
        AbstractC16544l.m18094g(originalProductJSON, "originalProductJSON");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC17300c
    public AmazonStoreProduct(String id2, ProductType type, String name, String title, String description, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String iconUrl, Period period2, JSONObject originalProductJSON, String presentedOfferingIdentifier) {
        this(id2, type, name, title, description, period, price, subscriptionOptions, subscriptionOption, iconUrl, period2, originalProductJSON, new PresentedOfferingContext(presentedOfferingIdentifier));
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(description, "description");
        AbstractC16544l.m18094g(price, "price");
        AbstractC16544l.m18094g(iconUrl, "iconUrl");
        AbstractC16544l.m18094g(originalProductJSON, "originalProductJSON");
        AbstractC16544l.m18094g(presentedOfferingIdentifier, "presentedOfferingIdentifier");
    }
}
