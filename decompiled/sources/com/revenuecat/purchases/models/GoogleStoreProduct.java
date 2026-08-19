package com.revenuecat.purchases.models;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.InterfaceC17300c;
import p003A1.AbstractC0168G;
import p509Uk.lpqL.SfpOlmlMATQ;
import p826j6.C16162p;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018Bu\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0019Bm\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u001aB/\b\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0000\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u0004\u0018\u00010\u00022\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010(J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010(J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010(J\u0012\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010(J\u0012\u0010:\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b:\u0010;J\u009e\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b>\u0010(J\u0010\u0010@\u001a\u00020?HÖ\u0001¢\u0006\u0004\b@\u0010AJ\u001a\u0010E\u001a\u00020D2\b\u0010C\u001a\u0004\u0018\u00010BHÖ\u0003¢\u0006\u0004\bE\u0010FR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\bH\u0010(R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010G\u001a\u0004\bI\u0010(R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010J\u001a\u0004\bK\u0010+R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010L\u001a\u0004\bM\u0010-R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010G\u001a\u0004\bN\u0010(R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bO\u0010(R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010G\u001a\u0004\bP\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010Q\u001a\u0004\bR\u00102R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010S\u001a\u0004\bT\u00104R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010U\u001a\u0004\bV\u00106R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010W\u001a\u0004\bX\u00108R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010G\u0012\u0004\bZ\u0010[\u001a\u0004\bY\u0010(R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\\\u001a\u0004\b]\u0010;R\u0014\u0010_\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010(R\u0014\u0010c\u001a\u00020`8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u001a\u0010f\u001a\u00020\u00028VX\u0097\u0004¢\u0006\f\u0012\u0004\be\u0010[\u001a\u0004\bd\u0010(¨\u0006g"}, m18067d2 = {"Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "Lcom/revenuecat/purchases/models/StoreProduct;", "", "productId", "basePlanId", "Lcom/revenuecat/purchases/ProductType;", "type", "Lcom/revenuecat/purchases/models/Price;", "price", DiagnosticsEntry.NAME_KEY, UiComponentConfig.Title.type, "description", "Lcom/revenuecat/purchases/models/Period;", "period", "Lcom/revenuecat/purchases/models/SubscriptionOptions;", "subscriptionOptions", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "defaultOption", "Lj6/p;", "productDetails", "presentedOfferingIdentifier", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/models/Price;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;Lj6/p;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/models/Price;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;Lj6/p;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/models/Price;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;Lj6/p;Ljava/lang/String;)V", "otherProduct", "subscriptionOptionsWithOfferingId", "(Lcom/revenuecat/purchases/models/GoogleStoreProduct;Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "offeringId", "copyWithOfferingId", "(Ljava/lang/String;)Lcom/revenuecat/purchases/models/StoreProduct;", "copyWithPresentedOfferingContext", "(Lcom/revenuecat/purchases/PresentedOfferingContext;)Lcom/revenuecat/purchases/models/StoreProduct;", "Ljava/util/Locale;", "locale", "formattedPricePerMonth", "(Ljava/util/Locale;)Ljava/lang/String;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/revenuecat/purchases/ProductType;", "component4", "()Lcom/revenuecat/purchases/models/Price;", "component5", "component6", "component7", "component8", "()Lcom/revenuecat/purchases/models/Period;", "component9", "()Lcom/revenuecat/purchases/models/SubscriptionOptions;", "component10", "()Lcom/revenuecat/purchases/models/SubscriptionOption;", "component11", "()Lj6/p;", "component12", "component13", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/models/Price;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;Lj6/p;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "getBasePlanId", "Lcom/revenuecat/purchases/ProductType;", "getType", "Lcom/revenuecat/purchases/models/Price;", "getPrice", "getName", "getTitle", "getDescription", "Lcom/revenuecat/purchases/models/Period;", "getPeriod", "Lcom/revenuecat/purchases/models/SubscriptionOptions;", "getSubscriptionOptions", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "getDefaultOption", "Lj6/p;", "getProductDetails", "getPresentedOfferingIdentifier", "getPresentedOfferingIdentifier$annotations", "()V", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "getId", ParameterNames.f31999ID, "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "getSku", "getSku$annotations", ProxyAmazonBillingActivity.EXTRAS_SKU, "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class GoogleStoreProduct implements StoreProduct {
    private final String basePlanId;
    private final SubscriptionOption defaultOption;
    private final String description;
    private final String name;
    private final Period period;
    private final PresentedOfferingContext presentedOfferingContext;
    private final String presentedOfferingIdentifier;
    private final Price price;
    private final C16162p productDetails;
    private final String productId;
    private final SubscriptionOptions subscriptionOptions;
    private final String title;
    private final ProductType type;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC17300c
    public GoogleStoreProduct(String productId, String str, ProductType type, Price price, String name, String title, String description, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, C16162p productDetails) {
        this(productId, str, type, price, name, title, description, period, subscriptionOptions, subscriptionOption, productDetails, null, null, 6144, null);
        AbstractC16544l.m18094g(productId, "productId");
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(price, "price");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(description, "description");
        AbstractC16544l.m18094g(productDetails, "productDetails");
    }

    @InterfaceC17300c
    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    @InterfaceC17300c
    public static /* synthetic */ void getSku$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final SubscriptionOption getDefaultOption() {
        return this.defaultOption;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final C16162p getProductDetails() {
        return this.productDetails;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPresentedOfferingIdentifier() {
        return this.presentedOfferingIdentifier;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBasePlanId() {
        return this.basePlanId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ProductType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Price getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Period getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final SubscriptionOptions getSubscriptionOptions() {
        return this.subscriptionOptions;
    }

    public final GoogleStoreProduct copy(String productId, String basePlanId, ProductType type, Price price, String name, String title, String description, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption defaultOption, C16162p productDetails, String presentedOfferingIdentifier, PresentedOfferingContext presentedOfferingContext) {
        AbstractC16544l.m18094g(productId, "productId");
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(price, "price");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(description, "description");
        AbstractC16544l.m18094g(productDetails, "productDetails");
        return new GoogleStoreProduct(productId, basePlanId, type, price, name, title, description, period, subscriptionOptions, defaultOption, productDetails, presentedOfferingIdentifier, presentedOfferingContext);
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
        ArrayList arrayList;
        SubscriptionOptions subscriptionOptions = getSubscriptionOptions();
        if (subscriptionOptions != null) {
            arrayList = new ArrayList();
            for (SubscriptionOption subscriptionOption : subscriptionOptions) {
                GoogleSubscriptionOption googleSubscriptionOption = subscriptionOption instanceof GoogleSubscriptionOption ? (GoogleSubscriptionOption) subscriptionOption : null;
                GoogleSubscriptionOption googleSubscriptionOption2 = googleSubscriptionOption != null ? new GoogleSubscriptionOption(googleSubscriptionOption, presentedOfferingContext) : null;
                if (googleSubscriptionOption2 != null) {
                    arrayList.add(googleSubscriptionOption2);
                }
            }
        } else {
            arrayList = null;
        }
        SubscriptionOption defaultOption = getDefaultOption();
        GoogleSubscriptionOption googleSubscriptionOption3 = defaultOption instanceof GoogleSubscriptionOption ? (GoogleSubscriptionOption) defaultOption : null;
        return new GoogleStoreProduct(this, googleSubscriptionOption3 != null ? new GoogleSubscriptionOption(googleSubscriptionOption3, presentedOfferingContext) : null, arrayList != null ? new SubscriptionOptions(arrayList) : null, presentedOfferingContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoogleStoreProduct)) {
            return false;
        }
        GoogleStoreProduct googleStoreProduct = (GoogleStoreProduct) other;
        return AbstractC16544l.m18089b(this.productId, googleStoreProduct.productId) && AbstractC16544l.m18089b(this.basePlanId, googleStoreProduct.basePlanId) && this.type == googleStoreProduct.type && AbstractC16544l.m18089b(this.price, googleStoreProduct.price) && AbstractC16544l.m18089b(this.name, googleStoreProduct.name) && AbstractC16544l.m18089b(this.title, googleStoreProduct.title) && AbstractC16544l.m18089b(this.description, googleStoreProduct.description) && AbstractC16544l.m18089b(this.period, googleStoreProduct.period) && AbstractC16544l.m18089b(this.subscriptionOptions, googleStoreProduct.subscriptionOptions) && AbstractC16544l.m18089b(this.defaultOption, googleStoreProduct.defaultOption) && AbstractC16544l.m18089b(this.productDetails, googleStoreProduct.productDetails) && AbstractC16544l.m18089b(this.presentedOfferingIdentifier, googleStoreProduct.presentedOfferingIdentifier) && AbstractC16544l.m18089b(this.presentedOfferingContext, googleStoreProduct.presentedOfferingContext);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String formattedPricePerMonth(Locale locale) {
        SubscriptionOption basePlan;
        List<PricingPhase> pricingPhases;
        PricingPhase pricingPhase;
        AbstractC16544l.m18094g(locale, "locale");
        SubscriptionOptions subscriptionOptions = getSubscriptionOptions();
        if (subscriptionOptions == null || (basePlan = subscriptionOptions.getBasePlan()) == null || (pricingPhases = basePlan.getPricingPhases()) == null || (pricingPhase = (PricingPhase) AbstractC17680n.m19351a0(pricingPhases)) == null) {
            return null;
        }
        return pricingPhase.formattedPriceInMonths(locale);
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOption getDefaultOption() {
        return this.defaultOption;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getDescription() {
        return this.description;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getId() {
        if (this.basePlanId != null) {
            String str = this.productId + ':' + this.basePlanId;
            if (str != null) {
                return str;
            }
        }
        return this.productId;
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
        return this.presentedOfferingContext;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getPresentedOfferingIdentifier() {
        return this.presentedOfferingIdentifier;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price getPrice() {
        return this.price;
    }

    public final C16162p getProductDetails() {
        return this.productDetails;
    }

    public final String getProductId() {
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public PurchasingData getPurchasingData() {
        return (getType() != ProductType.SUBS || getDefaultOption() == null) ? new GooglePurchasingData.InAppProduct(getId(), this.productDetails) : getDefaultOption().getPurchasingData();
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getSku() {
        return this.productId;
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
        int iHashCode = this.productId.hashCode() * 31;
        String str = this.basePlanId;
        int iM527p = AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p((this.price.hashCode() + ((this.type.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.name), 31, this.title), 31, this.description);
        Period period = this.period;
        int iHashCode2 = (iM527p + (period == null ? 0 : period.hashCode())) * 31;
        SubscriptionOptions subscriptionOptions = this.subscriptionOptions;
        int iHashCode3 = (iHashCode2 + (subscriptionOptions == null ? 0 : subscriptionOptions.hashCode())) * 31;
        SubscriptionOption subscriptionOption = this.defaultOption;
        int iM527p2 = AbstractC0168G.m527p((iHashCode3 + (subscriptionOption == null ? 0 : subscriptionOption.hashCode())) * 31, 31, this.productDetails.f50175a);
        String str2 = this.presentedOfferingIdentifier;
        int iHashCode4 = (iM527p2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        return iHashCode4 + (presentedOfferingContext != null ? presentedOfferingContext.hashCode() : 0);
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
        return "GoogleStoreProduct(productId=" + this.productId + ", basePlanId=" + this.basePlanId + ", type=" + this.type + ", price=" + this.price + ", name=" + this.name + ", title=" + this.title + ", description=" + this.description + ", period=" + this.period + ", subscriptionOptions=" + this.subscriptionOptions + ", defaultOption=" + this.defaultOption + ", productDetails=" + this.productDetails + ", presentedOfferingIdentifier=" + this.presentedOfferingIdentifier + SfpOlmlMATQ.QrBOWvLdQZwqbE + this.presentedOfferingContext + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC17300c
    public GoogleStoreProduct(String productId, String str, ProductType type, Price price, String name, String title, String description, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, C16162p productDetails, String str2) {
        this(productId, str, type, price, name, title, description, period, subscriptionOptions, subscriptionOption, productDetails, str2, null, 4096, null);
        AbstractC16544l.m18094g(productId, "productId");
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(price, "price");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(description, "description");
        AbstractC16544l.m18094g(productDetails, "productDetails");
    }

    @InterfaceC17300c
    public GoogleStoreProduct(String productId, String str, ProductType type, Price price, String name, String title, String description, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, C16162p productDetails, String str2, PresentedOfferingContext presentedOfferingContext) {
        AbstractC16544l.m18094g(productId, "productId");
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(price, "price");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(description, "description");
        AbstractC16544l.m18094g(productDetails, "productDetails");
        this.productId = productId;
        this.basePlanId = str;
        this.type = type;
        this.price = price;
        this.name = name;
        this.title = title;
        this.description = description;
        this.period = period;
        this.subscriptionOptions = subscriptionOptions;
        this.defaultOption = subscriptionOption;
        this.productDetails = productDetails;
        this.presentedOfferingIdentifier = str2;
        this.presentedOfferingContext = presentedOfferingContext;
    }

    public /* synthetic */ GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, String str5, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, C16162p c16162p, String str6, PresentedOfferingContext presentedOfferingContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, productType, price, str3, str4, str5, period, subscriptionOptions, subscriptionOption, c16162p, (i10 & 2048) != 0 ? null : str6, (i10 & 4096) != 0 ? null : presentedOfferingContext);
    }

    public /* synthetic */ GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, String str5, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, C16162p c16162p, PresentedOfferingContext presentedOfferingContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, productType, price, str3, str4, str5, period, subscriptionOptions, subscriptionOption, c16162p, (i10 & 2048) != 0 ? null : presentedOfferingContext);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleStoreProduct(String productId, String str, ProductType type, Price price, String name, String title, String description, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, C16162p productDetails, PresentedOfferingContext presentedOfferingContext) {
        this(productId, str, type, price, name, title, description, period, subscriptionOptions, subscriptionOption, productDetails, presentedOfferingContext != null ? presentedOfferingContext.getOfferingIdentifier() : null, presentedOfferingContext);
        AbstractC16544l.m18094g(productId, "productId");
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(price, "price");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(description, "description");
        AbstractC16544l.m18094g(productDetails, "productDetails");
    }

    public /* synthetic */ GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, C16162p c16162p, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, productType, price, str3, str4, period, subscriptionOptions, subscriptionOption, c16162p, (i10 & 1024) != 0 ? null : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC17300c
    public GoogleStoreProduct(String productId, String str, ProductType type, Price price, String title, String description, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, C16162p productDetails, String str2) {
        this(productId, str, type, price, title, title, description, period, subscriptionOptions, subscriptionOption, productDetails, str2 != null ? new PresentedOfferingContext(str2) : null);
        AbstractC16544l.m18094g(productId, "productId");
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(price, "price");
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(description, "description");
        AbstractC16544l.m18094g(productDetails, "productDetails");
    }

    private GoogleStoreProduct(GoogleStoreProduct googleStoreProduct, SubscriptionOption subscriptionOption, SubscriptionOptions subscriptionOptions, PresentedOfferingContext presentedOfferingContext) {
        this(googleStoreProduct.productId, googleStoreProduct.basePlanId, googleStoreProduct.getType(), googleStoreProduct.getPrice(), googleStoreProduct.getName(), googleStoreProduct.getTitle(), googleStoreProduct.getDescription(), googleStoreProduct.getPeriod(), subscriptionOptions, subscriptionOption, googleStoreProduct.productDetails, presentedOfferingContext);
    }
}
