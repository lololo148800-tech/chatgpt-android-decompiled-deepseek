package com.revenuecat.purchases;

import android.app.Activity;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.TestStoreProduct;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001(B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068@X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u000f\u0010\u0011R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00188@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u001e8@X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006)"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchaseParams;", "", "builder", "Lcom/revenuecat/purchases/PurchaseParams$Builder;", "(Lcom/revenuecat/purchases/PurchaseParams$Builder;)V", "activity", "Landroid/app/Activity;", "getActivity$purchases_customEntitlementComputationRelease", "()Landroid/app/Activity;", "getBuilder", "()Lcom/revenuecat/purchases/PurchaseParams$Builder;", "googleReplacementMode", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "getGoogleReplacementMode", "()Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "isPersonalizedPrice", "", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "oldProductId", "", "getOldProductId", "()Ljava/lang/String;", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "setPresentedOfferingContext$purchases_customEntitlementComputationRelease", "(Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "purchasingData", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/models/PurchasingData;", "component1", "copy", "equals", "other", "hashCode", "", "toString", "Builder", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class PurchaseParams {
    private final Activity activity;
    private final Builder builder;
    private final GoogleReplacementMode googleReplacementMode;
    private final Boolean isPersonalizedPrice;
    private final String oldProductId;
    private PresentedOfferingContext presentedOfferingContext;
    private final PurchasingData purchasingData;

    public PurchaseParams(Builder builder) {
        AbstractC16544l.m18094g(builder, "builder");
        this.builder = builder;
        this.isPersonalizedPrice = builder.getIsPersonalizedPrice();
        this.oldProductId = builder.getOldProductId();
        this.googleReplacementMode = builder.getGoogleReplacementMode();
        this.purchasingData = builder.getPurchasingData();
        this.activity = builder.getActivity();
        this.presentedOfferingContext = builder.getPresentedOfferingContext();
    }

    public static /* synthetic */ PurchaseParams copy$default(PurchaseParams purchaseParams, Builder builder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            builder = purchaseParams.builder;
        }
        return purchaseParams.copy(builder);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Builder getBuilder() {
        return this.builder;
    }

    public final PurchaseParams copy(Builder builder) {
        AbstractC16544l.m18094g(builder, "builder");
        return new PurchaseParams(builder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PurchaseParams) && AbstractC16544l.m18089b(this.builder, ((PurchaseParams) other).builder);
    }

    /* JADX INFO: renamed from: getActivity$purchases_customEntitlementComputationRelease, reason: from getter */
    public final /* synthetic */ Activity getActivity() {
        return this.activity;
    }

    public final Builder getBuilder() {
        return this.builder;
    }

    public final GoogleReplacementMode getGoogleReplacementMode() {
        return this.googleReplacementMode;
    }

    public final String getOldProductId() {
        return this.oldProductId;
    }

    /* JADX INFO: renamed from: getPresentedOfferingContext$purchases_customEntitlementComputationRelease, reason: from getter */
    public final /* synthetic */ PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    /* JADX INFO: renamed from: getPurchasingData$purchases_customEntitlementComputationRelease, reason: from getter */
    public final /* synthetic */ PurchasingData getPurchasingData() {
        return this.purchasingData;
    }

    public int hashCode() {
        return this.builder.hashCode();
    }

    /* JADX INFO: renamed from: isPersonalizedPrice, reason: from getter */
    public final Boolean getIsPersonalizedPrice() {
        return this.isPersonalizedPrice;
    }

    /* JADX INFO: renamed from: setPresentedOfferingContext$purchases_customEntitlementComputationRelease */
    public final void m14410x1346d41c(PresentedOfferingContext presentedOfferingContext) {
        this.presentedOfferingContext = presentedOfferingContext;
    }

    public String toString() {
        return "PurchaseParams(builder=" + this.builder + ')';
    }

    @Metadata(m18066d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0016\u0018\u00002\u00020\u0001B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\n\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101R.\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u00102\u001a\u0004\u0018\u00010\u00188@@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R.\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u00102\u001a\u0004\u0018\u00010\u001b8@@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010\u001f\u001a\u00020\u001e2\u0006\u00102\u001a\u00020\u001e8@@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006B"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchaseParams$Builder;", "", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "Lcom/revenuecat/purchases/models/StoreProduct;", "product", "<init>", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/PresentedOfferingContext;Lcom/revenuecat/purchases/models/StoreProduct;)V", "Lcom/revenuecat/purchases/Package;", "packageToPurchase", "(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;)V", "storeProduct", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/StoreProduct;)V", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "subscriptionOption", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/SubscriptionOption;)V", "Lmm/C;", "ensureNoTestProduct", "(Lcom/revenuecat/purchases/models/StoreProduct;)V", "(Lcom/revenuecat/purchases/PresentedOfferingContext;)Lcom/revenuecat/purchases/PurchaseParams$Builder;", "", "isPersonalizedPrice", "(Z)Lcom/revenuecat/purchases/PurchaseParams$Builder;", "", "oldProductId", "(Ljava/lang/String;)Lcom/revenuecat/purchases/PurchaseParams$Builder;", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "googleReplacementMode", "(Lcom/revenuecat/purchases/models/GoogleReplacementMode;)Lcom/revenuecat/purchases/PurchaseParams$Builder;", "Lcom/revenuecat/purchases/PurchaseParams;", "build", "()Lcom/revenuecat/purchases/PurchaseParams;", "Landroid/app/Activity;", "getActivity$purchases_customEntitlementComputationRelease", "()Landroid/app/Activity;", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/models/PurchasingData;", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "setPresentedOfferingContext$purchases_customEntitlementComputationRelease", "(Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "Lcom/revenuecat/purchases/models/StoreProduct;", "getProduct$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/models/StoreProduct;", "<set-?>", "Ljava/lang/Boolean;", "isPersonalizedPrice$purchases_customEntitlementComputationRelease", "()Ljava/lang/Boolean;", "setPersonalizedPrice$purchases_customEntitlementComputationRelease", "(Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getOldProductId$purchases_customEntitlementComputationRelease", "()Ljava/lang/String;", "setOldProductId$purchases_customEntitlementComputationRelease", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "getGoogleReplacementMode$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "setGoogleReplacementMode$purchases_customEntitlementComputationRelease", "(Lcom/revenuecat/purchases/models/GoogleReplacementMode;)V", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static class Builder {
        private final Activity activity;
        private GoogleReplacementMode googleReplacementMode;
        private Boolean isPersonalizedPrice;
        private String oldProductId;
        private PresentedOfferingContext presentedOfferingContext;
        private final StoreProduct product;
        private final PurchasingData purchasingData;

        private Builder(Activity activity, PurchasingData purchasingData, PresentedOfferingContext presentedOfferingContext, StoreProduct storeProduct) {
            this.activity = activity;
            this.purchasingData = purchasingData;
            this.presentedOfferingContext = presentedOfferingContext;
            this.product = storeProduct;
            this.googleReplacementMode = GoogleReplacementMode.WITHOUT_PRORATION;
        }

        private final void ensureNoTestProduct(StoreProduct storeProduct) throws PurchasesException {
            if (storeProduct instanceof TestStoreProduct) {
                throw new PurchasesException(new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, "Cannot purchase " + storeProduct));
            }
        }

        public PurchaseParams build() throws PurchasesException {
            StoreProduct storeProduct = this.product;
            if (storeProduct != null) {
                ensureNoTestProduct(storeProduct);
            }
            return new PurchaseParams(this);
        }

        /* JADX INFO: renamed from: getActivity$purchases_customEntitlementComputationRelease, reason: from getter */
        public final /* synthetic */ Activity getActivity() {
            return this.activity;
        }

        /* JADX INFO: renamed from: getGoogleReplacementMode$purchases_customEntitlementComputationRelease, reason: from getter */
        public final /* synthetic */ GoogleReplacementMode getGoogleReplacementMode() {
            return this.googleReplacementMode;
        }

        /* JADX INFO: renamed from: getOldProductId$purchases_customEntitlementComputationRelease, reason: from getter */
        public final /* synthetic */ String getOldProductId() {
            return this.oldProductId;
        }

        /* JADX INFO: renamed from: getPresentedOfferingContext$purchases_customEntitlementComputationRelease, reason: from getter */
        public final /* synthetic */ PresentedOfferingContext getPresentedOfferingContext() {
            return this.presentedOfferingContext;
        }

        /* JADX INFO: renamed from: getProduct$purchases_customEntitlementComputationRelease, reason: from getter */
        public final /* synthetic */ StoreProduct getProduct() {
            return this.product;
        }

        /* JADX INFO: renamed from: getPurchasingData$purchases_customEntitlementComputationRelease, reason: from getter */
        public final /* synthetic */ PurchasingData getPurchasingData() {
            return this.purchasingData;
        }

        public final Builder googleReplacementMode(GoogleReplacementMode googleReplacementMode) {
            AbstractC16544l.m18094g(googleReplacementMode, "googleReplacementMode");
            this.googleReplacementMode = googleReplacementMode;
            return this;
        }

        public final Builder isPersonalizedPrice(boolean isPersonalizedPrice) {
            this.isPersonalizedPrice = Boolean.valueOf(isPersonalizedPrice);
            return this;
        }

        /* JADX INFO: renamed from: isPersonalizedPrice$purchases_customEntitlementComputationRelease, reason: from getter */
        public final /* synthetic */ Boolean getIsPersonalizedPrice() {
            return this.isPersonalizedPrice;
        }

        public final Builder oldProductId(String oldProductId) {
            AbstractC16544l.m18094g(oldProductId, "oldProductId");
            this.oldProductId = oldProductId;
            return this;
        }

        public final Builder presentedOfferingContext(PresentedOfferingContext presentedOfferingContext) {
            AbstractC16544l.m18094g(presentedOfferingContext, "presentedOfferingContext");
            this.presentedOfferingContext = presentedOfferingContext;
            return this;
        }

        /* JADX INFO: renamed from: setGoogleReplacementMode$purchases_customEntitlementComputationRelease */
        public final /* synthetic */ void m14414xbd803125(GoogleReplacementMode googleReplacementMode) {
            AbstractC16544l.m18094g(googleReplacementMode, "<set-?>");
            this.googleReplacementMode = googleReplacementMode;
        }

        public final /* synthetic */ void setOldProductId$purchases_customEntitlementComputationRelease(String str) {
            this.oldProductId = str;
        }

        /* JADX INFO: renamed from: setPersonalizedPrice$purchases_customEntitlementComputationRelease */
        public final /* synthetic */ void m14415xa9ad7562(Boolean bool) {
            this.isPersonalizedPrice = bool;
        }

        /* JADX INFO: renamed from: setPresentedOfferingContext$purchases_customEntitlementComputationRelease */
        public final void m14416x1346d41c(PresentedOfferingContext presentedOfferingContext) {
            this.presentedOfferingContext = presentedOfferingContext;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Activity activity, Package packageToPurchase) {
            this(activity, packageToPurchase.getProduct().getPurchasingData(), packageToPurchase.getPresentedOfferingContext(), packageToPurchase.getProduct());
            AbstractC16544l.m18094g(activity, "activity");
            AbstractC16544l.m18094g(packageToPurchase, "packageToPurchase");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Activity activity, StoreProduct storeProduct) {
            this(activity, storeProduct.getPurchasingData(), storeProduct.getPresentedOfferingContext(), storeProduct);
            AbstractC16544l.m18094g(activity, "activity");
            AbstractC16544l.m18094g(storeProduct, "storeProduct");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Activity activity, SubscriptionOption subscriptionOption) {
            this(activity, subscriptionOption.getPurchasingData(), subscriptionOption.getPresentedOfferingContext(), null);
            AbstractC16544l.m18094g(activity, "activity");
            AbstractC16544l.m18094g(subscriptionOption, "subscriptionOption");
        }
    }
}
