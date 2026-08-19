package com.revenuecat.purchases.models;

import com.revenuecat.purchases.ProductType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p003A1.AbstractC0168G;
import p025An.C0644w;
import p571X9.AbstractC9306j0;
import p826j6.C16162p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m18067d2 = {"Lcom/revenuecat/purchases/models/GooglePurchasingData;", "Lcom/revenuecat/purchases/models/PurchasingData;", "()V", "productType", "Lcom/revenuecat/purchases/ProductType;", "getProductType", "()Lcom/revenuecat/purchases/ProductType;", "InAppProduct", "Subscription", "Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class GooglePurchasingData implements PurchasingData {

    @Metadata(m18066d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, m18067d2 = {"Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "Lcom/revenuecat/purchases/models/GooglePurchasingData;", "", "productId", "Lj6/p;", "productDetails", "<init>", "(Ljava/lang/String;Lj6/p;)V", "component1", "()Ljava/lang/String;", "component2", "()Lj6/p;", "copy", "(Ljava/lang/String;Lj6/p;)Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "Lj6/p;", "getProductDetails", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class InAppProduct extends GooglePurchasingData {
        private final C16162p productDetails;
        private final String productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InAppProduct(String productId, C16162p productDetails) {
            super(null);
            AbstractC16544l.m18094g(productId, "productId");
            AbstractC16544l.m18094g(productDetails, "productDetails");
            this.productId = productId;
            this.productDetails = productDetails;
        }

        public static /* synthetic */ InAppProduct copy$default(InAppProduct inAppProduct, String str, C16162p c16162p, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inAppProduct.productId;
            }
            if ((i10 & 2) != 0) {
                c16162p = inAppProduct.productDetails;
            }
            return inAppProduct.copy(str, c16162p);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getProductId() {
            return this.productId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final C16162p getProductDetails() {
            return this.productDetails;
        }

        public final InAppProduct copy(String productId, C16162p productDetails) {
            AbstractC16544l.m18094g(productId, "productId");
            AbstractC16544l.m18094g(productDetails, "productDetails");
            return new InAppProduct(productId, productDetails);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InAppProduct)) {
                return false;
            }
            InAppProduct inAppProduct = (InAppProduct) other;
            return AbstractC16544l.m18089b(this.productId, inAppProduct.productId) && AbstractC16544l.m18089b(this.productDetails, inAppProduct.productDetails);
        }

        public final C16162p getProductDetails() {
            return this.productDetails;
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            return this.productDetails.f50175a.hashCode() + (this.productId.hashCode() * 31);
        }

        public String toString() {
            return "InAppProduct(productId=" + this.productId + ", productDetails=" + this.productDetails + ')';
        }
    }

    @Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b \u0010\u000b¨\u0006!"}, m18067d2 = {"Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "Lcom/revenuecat/purchases/models/GooglePurchasingData;", "", "productId", "optionId", "Lj6/p;", "productDetails", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj6/p;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lj6/p;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj6/p;Ljava/lang/String;)Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "getOptionId", "Lj6/p;", "getProductDetails", "getToken", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class Subscription extends GooglePurchasingData {
        private final String optionId;
        private final C16162p productDetails;
        private final String productId;
        private final String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Subscription(String productId, String optionId, C16162p productDetails, String token) {
            super(null);
            AbstractC16544l.m18094g(productId, "productId");
            AbstractC16544l.m18094g(optionId, "optionId");
            AbstractC16544l.m18094g(productDetails, "productDetails");
            AbstractC16544l.m18094g(token, "token");
            this.productId = productId;
            this.optionId = optionId;
            this.productDetails = productDetails;
            this.token = token;
        }

        public static /* synthetic */ Subscription copy$default(Subscription subscription, String str, String str2, C16162p c16162p, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = subscription.productId;
            }
            if ((i10 & 2) != 0) {
                str2 = subscription.optionId;
            }
            if ((i10 & 4) != 0) {
                c16162p = subscription.productDetails;
            }
            if ((i10 & 8) != 0) {
                str3 = subscription.token;
            }
            return subscription.copy(str, str2, c16162p, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getProductId() {
            return this.productId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getOptionId() {
            return this.optionId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final C16162p getProductDetails() {
            return this.productDetails;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        public final Subscription copy(String productId, String optionId, C16162p productDetails, String token) {
            AbstractC16544l.m18094g(productId, "productId");
            AbstractC16544l.m18094g(optionId, "optionId");
            AbstractC16544l.m18094g(productDetails, "productDetails");
            AbstractC16544l.m18094g(token, "token");
            return new Subscription(productId, optionId, productDetails, token);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Subscription)) {
                return false;
            }
            Subscription subscription = (Subscription) other;
            return AbstractC16544l.m18089b(this.productId, subscription.productId) && AbstractC16544l.m18089b(this.optionId, subscription.optionId) && AbstractC16544l.m18089b(this.productDetails, subscription.productDetails) && AbstractC16544l.m18089b(this.token, subscription.token);
        }

        public final String getOptionId() {
            return this.optionId;
        }

        public final C16162p getProductDetails() {
            return this.productDetails;
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public String getProductId() {
            return this.productId;
        }

        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            return this.token.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(this.productId.hashCode() * 31, 31, this.optionId), 31, this.productDetails.f50175a);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Subscription(productId=");
            sb2.append(this.productId);
            sb2.append(", optionId=");
            sb2.append(this.optionId);
            sb2.append(", productDetails=");
            sb2.append(this.productDetails);
            sb2.append(", token=");
            return AbstractC9306j0.m9892k(sb2, this.token, ')');
        }
    }

    public /* synthetic */ GooglePurchasingData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.revenuecat.purchases.models.PurchasingData
    public ProductType getProductType() {
        if (this instanceof InAppProduct) {
            return ProductType.INAPP;
        }
        if (this instanceof Subscription) {
            return ProductType.SUBS;
        }
        throw new C0644w();
    }

    private GooglePurchasingData() {
    }
}
