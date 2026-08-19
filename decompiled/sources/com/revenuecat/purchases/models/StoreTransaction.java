package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.OwC.wNrQXvwLiB;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.utils.JSONObjectParceler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.InterfaceC17300c;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u0097\u0001\b\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001eJ\u001a\u0010!\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010'J\u0010\u0010/\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010'J\u0010\u00104\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010'J\u0010\u00109\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010'J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010'J\u0012\u0010=\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b=\u0010>J¼\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bA\u0010'J\u0010\u0010B\u001a\u00020#HÖ\u0001¢\u0006\u0004\bB\u0010%J \u0010G\u001a\u00020F2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020#HÖ\u0001¢\u0006\u0004\bG\u0010HR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010I\u001a\u0004\bJ\u0010'R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010K\u001a\u0004\bL\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010M\u001a\u0004\bN\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010O\u001a\u0004\bP\u0010-R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010I\u001a\u0004\bQ\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010R\u001a\u0004\bS\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010T\u001a\u0004\b\u000e\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bU\u0010'R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010V\u001a\u0004\bW\u00105R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010X\u001a\u0004\bY\u00107R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010I\u001a\u0004\bZ\u0010'R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010[\u001a\u0004\b\\\u0010:R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010I\u001a\u0004\b]\u0010'R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010I\u001a\u0004\b^\u0010'R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010_\u001a\u0004\b`\u0010>R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\bb\u0010c\u001a\u0004\ba\u0010'R \u0010f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\be\u0010c\u001a\u0004\bd\u0010)¨\u0006g"}, m18067d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "Landroid/os/Parcelable;", "", "orderId", "", "productIds", "Lcom/revenuecat/purchases/ProductType;", "type", "", "purchaseTime", "purchaseToken", "Lcom/revenuecat/purchases/models/PurchaseState;", "purchaseState", "", "isAutoRenewing", "signature", "Lorg/json/JSONObject;", "originalJson", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "storeUserID", "Lcom/revenuecat/purchases/models/PurchaseType;", "purchaseType", "marketplace", "subscriptionOptionId", "Lcom/revenuecat/purchases/ReplacementMode;", "replacementMode", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;JLjava/lang/String;Lcom/revenuecat/purchases/models/PurchaseState;Ljava/lang/Boolean;Ljava/lang/String;Lorg/json/JSONObject;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchaseType;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ReplacementMode;)V", "presentedOfferingIdentifier", "(Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;JLjava/lang/String;Lcom/revenuecat/purchases/models/PurchaseState;Ljava/lang/Boolean;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchaseType;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ReplacementMode;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/revenuecat/purchases/ProductType;", "component4", "()J", "component5", "component6", "()Lcom/revenuecat/purchases/models/PurchaseState;", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "()Lorg/json/JSONObject;", "component10", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "component11", "component12", "()Lcom/revenuecat/purchases/models/PurchaseType;", "component13", "component14", "component15", "()Lcom/revenuecat/purchases/ReplacementMode;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;JLjava/lang/String;Lcom/revenuecat/purchases/models/PurchaseState;Ljava/lang/Boolean;Ljava/lang/String;Lorg/json/JSONObject;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchaseType;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ReplacementMode;)Lcom/revenuecat/purchases/models/StoreTransaction;", "toString", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getOrderId", "Ljava/util/List;", "getProductIds", "Lcom/revenuecat/purchases/ProductType;", "getType", "J", "getPurchaseTime", "getPurchaseToken", "Lcom/revenuecat/purchases/models/PurchaseState;", "getPurchaseState", "Ljava/lang/Boolean;", "getSignature", "Lorg/json/JSONObject;", "getOriginalJson", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "getStoreUserID", "Lcom/revenuecat/purchases/models/PurchaseType;", "getPurchaseType", "getMarketplace", "getSubscriptionOptionId", "Lcom/revenuecat/purchases/ReplacementMode;", "getReplacementMode", "getPresentedOfferingIdentifier", "getPresentedOfferingIdentifier$annotations", "()V", "getSkus", "getSkus$annotations", "skus", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class StoreTransaction implements Parcelable {
    public static final Parcelable.Creator<StoreTransaction> CREATOR = new Creator();
    private final Boolean isAutoRenewing;
    private final String marketplace;
    private final String orderId;
    private final JSONObject originalJson;
    private final PresentedOfferingContext presentedOfferingContext;
    private final List<String> productIds;
    private final PurchaseState purchaseState;
    private final long purchaseTime;
    private final String purchaseToken;
    private final PurchaseType purchaseType;
    private final ReplacementMode replacementMode;
    private final String signature;
    private final String storeUserID;
    private final String subscriptionOptionId;
    private final ProductType type;

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Creator implements Parcelable.Creator<StoreTransaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoreTransaction createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            AbstractC16544l.m18094g(parcel, "parcel");
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ProductType productTypeValueOf = ProductType.valueOf(parcel.readString());
            long j10 = parcel.readLong();
            String string2 = parcel.readString();
            PurchaseState purchaseStateValueOf = PurchaseState.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StoreTransaction(string, arrayListCreateStringArrayList, productTypeValueOf, j10, string2, purchaseStateValueOf, boolValueOf, parcel.readString(), JSONObjectParceler.INSTANCE.create(parcel), parcel.readInt() != 0 ? PresentedOfferingContext.CREATOR.createFromParcel(parcel) : null, parcel.readString(), PurchaseType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (ReplacementMode) parcel.readParcelable(StoreTransaction.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoreTransaction[] newArray(int i10) {
            return new StoreTransaction[i10];
        }
    }

    public StoreTransaction(String str, List<String> productIds, ProductType type, long j10, String purchaseToken, PurchaseState purchaseState, Boolean bool, String str2, JSONObject originalJson, PresentedOfferingContext presentedOfferingContext, String str3, PurchaseType purchaseType, String str4, String str5, ReplacementMode replacementMode) {
        AbstractC16544l.m18094g(productIds, "productIds");
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(purchaseToken, "purchaseToken");
        AbstractC16544l.m18094g(purchaseState, "purchaseState");
        AbstractC16544l.m18094g(originalJson, "originalJson");
        AbstractC16544l.m18094g(purchaseType, "purchaseType");
        this.orderId = str;
        this.productIds = productIds;
        this.type = type;
        this.purchaseTime = j10;
        this.purchaseToken = purchaseToken;
        this.purchaseState = purchaseState;
        this.isAutoRenewing = bool;
        this.signature = str2;
        this.originalJson = originalJson;
        this.presentedOfferingContext = presentedOfferingContext;
        this.storeUserID = str3;
        this.purchaseType = purchaseType;
        this.marketplace = str4;
        this.subscriptionOptionId = str5;
        this.replacementMode = replacementMode;
    }

    @InterfaceC17300c
    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    @InterfaceC17300c
    public static /* synthetic */ void getSkus$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getStoreUserID() {
        return this.storeUserID;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final PurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getMarketplace() {
        return this.marketplace;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSubscriptionOptionId() {
        return this.subscriptionOptionId;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final ReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public final List<String> component2() {
        return this.productIds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ProductType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsAutoRenewing() {
        return this.isAutoRenewing;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final JSONObject getOriginalJson() {
        return this.originalJson;
    }

    public final StoreTransaction copy(String orderId, List<String> productIds, ProductType type, long purchaseTime, String purchaseToken, PurchaseState purchaseState, Boolean isAutoRenewing, String signature, JSONObject originalJson, PresentedOfferingContext presentedOfferingContext, String storeUserID, PurchaseType purchaseType, String marketplace, String subscriptionOptionId, ReplacementMode replacementMode) {
        AbstractC16544l.m18094g(productIds, "productIds");
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(purchaseToken, "purchaseToken");
        AbstractC16544l.m18094g(purchaseState, "purchaseState");
        AbstractC16544l.m18094g(originalJson, "originalJson");
        AbstractC16544l.m18094g(purchaseType, "purchaseType");
        return new StoreTransaction(orderId, productIds, type, purchaseTime, purchaseToken, purchaseState, isAutoRenewing, signature, originalJson, presentedOfferingContext, storeUserID, purchaseType, marketplace, subscriptionOptionId, replacementMode);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        return (other instanceof StoreTransaction) && new ComparableData(this).equals(new ComparableData((StoreTransaction) other));
    }

    public final String getMarketplace() {
        return this.marketplace;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final JSONObject getOriginalJson() {
        return this.originalJson;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final String getPresentedOfferingIdentifier() {
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        if (presentedOfferingContext != null) {
            return presentedOfferingContext.getOfferingIdentifier();
        }
        return null;
    }

    public final List<String> getProductIds() {
        return this.productIds;
    }

    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final PurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    public final ReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final List<String> getSkus() {
        return this.productIds;
    }

    public final String getStoreUserID() {
        return this.storeUserID;
    }

    public final String getSubscriptionOptionId() {
        return this.subscriptionOptionId;
    }

    public final ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        return new ComparableData(this).hashCode();
    }

    public final Boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public String toString() {
        return wNrQXvwLiB.ACqxXPvZTH + this.orderId + ", productIds=" + this.productIds + ", type=" + this.type + ", purchaseTime=" + this.purchaseTime + ", purchaseToken=" + this.purchaseToken + ", purchaseState=" + this.purchaseState + ", isAutoRenewing=" + this.isAutoRenewing + ", signature=" + this.signature + ", originalJson=" + this.originalJson + ", presentedOfferingContext=" + this.presentedOfferingContext + ", storeUserID=" + this.storeUserID + ", purchaseType=" + this.purchaseType + ", marketplace=" + this.marketplace + ", subscriptionOptionId=" + this.subscriptionOptionId + ", replacementMode=" + this.replacementMode + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        AbstractC16544l.m18094g(parcel, "out");
        parcel.writeString(this.orderId);
        parcel.writeStringList(this.productIds);
        parcel.writeString(this.type.name());
        parcel.writeLong(this.purchaseTime);
        parcel.writeString(this.purchaseToken);
        parcel.writeString(this.purchaseState.name());
        Boolean bool = this.isAutoRenewing;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            AbstractC12107L1.m13829t(parcel, 1, bool);
        }
        parcel.writeString(this.signature);
        JSONObjectParceler.INSTANCE.write(this.originalJson, parcel, flags);
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        if (presentedOfferingContext == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            presentedOfferingContext.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.storeUserID);
        parcel.writeString(this.purchaseType.name());
        parcel.writeString(this.marketplace);
        parcel.writeString(this.subscriptionOptionId);
        parcel.writeParcelable(this.replacementMode, flags);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC17300c
    public StoreTransaction(String str, List<String> productIds, ProductType type, long j10, String purchaseToken, PurchaseState purchaseState, Boolean bool, String str2, JSONObject originalJson, String str3, String str4, PurchaseType purchaseType, String str5, String str6, ReplacementMode replacementMode) {
        this(str, productIds, type, j10, purchaseToken, purchaseState, bool, str2, originalJson, str3 != null ? new PresentedOfferingContext(str3) : null, str4, purchaseType, str5, str6, replacementMode);
        AbstractC16544l.m18094g(productIds, "productIds");
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(purchaseToken, "purchaseToken");
        AbstractC16544l.m18094g(purchaseState, "purchaseState");
        AbstractC16544l.m18094g(originalJson, "originalJson");
        AbstractC16544l.m18094g(purchaseType, "purchaseType");
    }
}
