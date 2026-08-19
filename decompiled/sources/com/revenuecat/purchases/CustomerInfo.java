package com.revenuecat.purchases;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.models.RawDataContainer;
import com.revenuecat.purchases.models.Transaction;
import com.revenuecat.purchases.utils.DateHelper;
import com.revenuecat.purchases.utils.JSONObjectParceler;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import mm.InterfaceC17300c;
import mm.InterfaceC17306i;
import org.json.JSONObject;
import p571X9.AbstractC9227W;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b'\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002Bw\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u0018J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001b\u0010\u0018J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u0018J\u0017\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u0018J\u0017\u0010\u001f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\u0018J\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010*J\u001e\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006HÆ\u0003¢\u0006\u0004\b+\u0010,J\u001e\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006HÆ\u0003¢\u0006\u0004\b-\u0010,J\u0010\u0010.\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b0\u0010(J\u0010\u00101\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b1\u0010/J\u0010\u00102\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b2\u0010!J\u0012\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b5\u0010/J\u0094\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b8\u0010(J \u0010=\u001a\u00020<2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b=\u0010>J+\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00070@2\u0014\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0002¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\bC\u0010DR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bF\u0010*R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010G\u001a\u0004\bH\u0010,R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bI\u0010,R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010J\u001a\u0004\bK\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010L\u001a\u0004\bM\u0010(R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010J\u001a\u0004\bN\u0010/R\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010O\u001a\u0004\bP\u0010!R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010Q\u001a\u0004\bR\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010J\u001a\u0004\bS\u0010/R\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010TR'\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00070@8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\bU\u0010V\u0012\u0004\bY\u0010Z\u001a\u0004\bW\u0010XR'\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00070@8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\\\u0010V\u0012\u0004\b^\u0010Z\u001a\u0004\b]\u0010XR'\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00070@8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b`\u0010V\u0012\u0004\bb\u0010Z\u001a\u0004\ba\u0010XR#\u0010g\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\bd\u0010V\u0012\u0004\bf\u0010Z\u001a\u0004\be\u0010/R'\u0010n\u001a\b\u0012\u0004\u0012\u00020i0h8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\bj\u0010V\u0012\u0004\bm\u0010Z\u001a\u0004\bk\u0010lR\"\u0010p\u001a\n o*\u0004\u0018\u00010\u00030\u00038\u0002X\u0082\u0004¢\u0006\f\n\u0004\bp\u0010T\u0012\u0004\bq\u0010ZR\u001a\u0010t\u001a\u00020\u00038VX\u0096\u0004¢\u0006\f\u0012\u0004\bs\u0010Z\u001a\u0004\br\u0010D¨\u0006u"}, m18067d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "Landroid/os/Parcelable;", "Lcom/revenuecat/purchases/models/RawDataContainer;", "Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/EntitlementInfos;", CustomerInfoResponseJsonKeys.ENTITLEMENTS, "", "", "Ljava/util/Date;", "allExpirationDatesByProduct", "allPurchaseDatesByProduct", "requestDate", "", "schemaVersion", "firstSeen", "originalAppUserId", "Landroid/net/Uri;", "managementURL", "originalPurchaseDate", "jsonObject", "<init>", "(Lcom/revenuecat/purchases/EntitlementInfos;Ljava/util/Map;Ljava/util/Map;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Landroid/net/Uri;Ljava/util/Date;Lorg/json/JSONObject;)V", ProxyAmazonBillingActivity.EXTRAS_SKU, "getExpirationDateForSku", "(Ljava/lang/String;)Ljava/util/Date;", "productId", "getExpirationDateForProductId", "getPurchaseDateForSku", "getPurchaseDateForProductId", "entitlement", "getExpirationDateForEntitlement", "getPurchaseDateForEntitlement", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "()Lcom/revenuecat/purchases/EntitlementInfos;", "component2", "()Ljava/util/Map;", "component3", "component4", "()Ljava/util/Date;", "component5", "component6", "component7", "component8", "()Landroid/net/Uri;", "component9", "copy", "(Lcom/revenuecat/purchases/EntitlementInfos;Ljava/util/Map;Ljava/util/Map;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Landroid/net/Uri;Ljava/util/Date;Lorg/json/JSONObject;)Lcom/revenuecat/purchases/CustomerInfo;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "expirations", "", "activeIdentifiers", "(Ljava/util/Map;)Ljava/util/Set;", "component10", "()Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/EntitlementInfos;", "getEntitlements", "Ljava/util/Map;", "getAllExpirationDatesByProduct", "getAllPurchaseDatesByProduct", "Ljava/util/Date;", "getRequestDate", TokenNames.f32012I, "getSchemaVersion", "getFirstSeen", "Ljava/lang/String;", "getOriginalAppUserId", "Landroid/net/Uri;", "getManagementURL", "getOriginalPurchaseDate", "Lorg/json/JSONObject;", "activeSubscriptions$delegate", "Lmm/i;", "getActiveSubscriptions", "()Ljava/util/Set;", "getActiveSubscriptions$annotations", "()V", "activeSubscriptions", "allPurchasedSkus$delegate", "getAllPurchasedSkus", "getAllPurchasedSkus$annotations", "allPurchasedSkus", "allPurchasedProductIds$delegate", "getAllPurchasedProductIds", "getAllPurchasedProductIds$annotations", "allPurchasedProductIds", "latestExpirationDate$delegate", "getLatestExpirationDate", "getLatestExpirationDate$annotations", "latestExpirationDate", "", "Lcom/revenuecat/purchases/models/Transaction;", "nonSubscriptionTransactions$delegate", "getNonSubscriptionTransactions", "()Ljava/util/List;", "getNonSubscriptionTransactions$annotations", "nonSubscriptionTransactions", "kotlin.jvm.PlatformType", "subscriberJSONObject", "getSubscriberJSONObject$annotations", "getRawData", "getRawData$annotations", "rawData", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class CustomerInfo implements Parcelable, RawDataContainer<JSONObject> {
    public static final Parcelable.Creator<CustomerInfo> CREATOR = new Creator();

    /* JADX INFO: renamed from: activeSubscriptions$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i activeSubscriptions;
    private final Map<String, Date> allExpirationDatesByProduct;
    private final Map<String, Date> allPurchaseDatesByProduct;

    /* JADX INFO: renamed from: allPurchasedProductIds$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i allPurchasedProductIds;

    /* JADX INFO: renamed from: allPurchasedSkus$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i allPurchasedSkus;
    private final EntitlementInfos entitlements;
    private final Date firstSeen;
    private final JSONObject jsonObject;

    /* JADX INFO: renamed from: latestExpirationDate$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i latestExpirationDate;
    private final Uri managementURL;

    /* JADX INFO: renamed from: nonSubscriptionTransactions$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i nonSubscriptionTransactions;
    private final String originalAppUserId;
    private final Date originalPurchaseDate;
    private final Date requestDate;
    private final int schemaVersion;
    private final JSONObject subscriberJSONObject;

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Creator implements Parcelable.Creator<CustomerInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerInfo createFromParcel(Parcel parcel) {
            AbstractC16544l.m18094g(parcel, "parcel");
            EntitlementInfos entitlementInfosCreateFromParcel = EntitlementInfos.CREATOR.createFromParcel(parcel);
            int i10 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                linkedHashMap.put(parcel.readString(), parcel.readSerializable());
            }
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashMap2.put(parcel.readString(), parcel.readSerializable());
            }
            return new CustomerInfo(entitlementInfosCreateFromParcel, linkedHashMap, linkedHashMap2, (Date) parcel.readSerializable(), parcel.readInt(), (Date) parcel.readSerializable(), parcel.readString(), (Uri) parcel.readParcelable(CustomerInfo.class.getClassLoader()), (Date) parcel.readSerializable(), JSONObjectParceler.INSTANCE.create(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerInfo[] newArray(int i10) {
            return new CustomerInfo[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomerInfo(EntitlementInfos entitlements, Map<String, ? extends Date> allExpirationDatesByProduct, Map<String, ? extends Date> allPurchaseDatesByProduct, Date requestDate, int i10, Date firstSeen, String originalAppUserId, Uri uri, Date date, JSONObject jsonObject) {
        AbstractC16544l.m18094g(entitlements, "entitlements");
        AbstractC16544l.m18094g(allExpirationDatesByProduct, "allExpirationDatesByProduct");
        AbstractC16544l.m18094g(allPurchaseDatesByProduct, "allPurchaseDatesByProduct");
        AbstractC16544l.m18094g(requestDate, "requestDate");
        AbstractC16544l.m18094g(firstSeen, "firstSeen");
        AbstractC16544l.m18094g(originalAppUserId, "originalAppUserId");
        AbstractC16544l.m18094g(jsonObject, "jsonObject");
        this.entitlements = entitlements;
        this.allExpirationDatesByProduct = allExpirationDatesByProduct;
        this.allPurchaseDatesByProduct = allPurchaseDatesByProduct;
        this.requestDate = requestDate;
        this.schemaVersion = i10;
        this.firstSeen = firstSeen;
        this.originalAppUserId = originalAppUserId;
        this.managementURL = uri;
        this.originalPurchaseDate = date;
        this.jsonObject = jsonObject;
        this.activeSubscriptions = AbstractC9227W.m9800c(new CustomerInfo$activeSubscriptions$2(this));
        this.allPurchasedSkus = AbstractC9227W.m9800c(new CustomerInfo$allPurchasedSkus$2(this));
        this.allPurchasedProductIds = AbstractC9227W.m9800c(new CustomerInfo$allPurchasedProductIds$2(this));
        this.latestExpirationDate = AbstractC9227W.m9800c(new CustomerInfo$latestExpirationDate$2(this));
        this.nonSubscriptionTransactions = AbstractC9227W.m9800c(new CustomerInfo$nonSubscriptionTransactions$2(this));
        this.subscriberJSONObject = jsonObject.getJSONObject(CustomerInfoResponseJsonKeys.SUBSCRIBER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<String> activeIdentifiers(Map<String, ? extends Date> expirations) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Date> entry : expirations.entrySet()) {
            if (DateHelper.Companion.m22528isDateActiveSxA4cEA$default(DateHelper.INSTANCE, entry.getValue(), this.requestDate, 0L, 4, null).isActive()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    private final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public static /* synthetic */ void getActiveSubscriptions$annotations() {
    }

    public static /* synthetic */ void getAllPurchasedProductIds$annotations() {
    }

    @InterfaceC17300c
    public static /* synthetic */ void getAllPurchasedSkus$annotations() {
    }

    public static /* synthetic */ void getLatestExpirationDate$annotations() {
    }

    public static /* synthetic */ void getNonSubscriptionTransactions$annotations() {
    }

    public static /* synthetic */ void getRawData$annotations() {
    }

    private static /* synthetic */ void getSubscriberJSONObject$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EntitlementInfos getEntitlements() {
        return this.entitlements;
    }

    public final Map<String, Date> component2() {
        return this.allExpirationDatesByProduct;
    }

    public final Map<String, Date> component3() {
        return this.allPurchaseDatesByProduct;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getRequestDate() {
        return this.requestDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSchemaVersion() {
        return this.schemaVersion;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getFirstSeen() {
        return this.firstSeen;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOriginalAppUserId() {
        return this.originalAppUserId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Uri getManagementURL() {
        return this.managementURL;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final CustomerInfo copy(EntitlementInfos entitlements, Map<String, ? extends Date> allExpirationDatesByProduct, Map<String, ? extends Date> allPurchaseDatesByProduct, Date requestDate, int schemaVersion, Date firstSeen, String originalAppUserId, Uri managementURL, Date originalPurchaseDate, JSONObject jsonObject) {
        AbstractC16544l.m18094g(entitlements, "entitlements");
        AbstractC16544l.m18094g(allExpirationDatesByProduct, "allExpirationDatesByProduct");
        AbstractC16544l.m18094g(allPurchaseDatesByProduct, "allPurchaseDatesByProduct");
        AbstractC16544l.m18094g(requestDate, "requestDate");
        AbstractC16544l.m18094g(firstSeen, "firstSeen");
        AbstractC16544l.m18094g(originalAppUserId, "originalAppUserId");
        AbstractC16544l.m18094g(jsonObject, "jsonObject");
        return new CustomerInfo(entitlements, allExpirationDatesByProduct, allPurchaseDatesByProduct, requestDate, schemaVersion, firstSeen, originalAppUserId, managementURL, originalPurchaseDate, jsonObject);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        return (other instanceof CustomerInfo) && new ComparableData(this).equals(new ComparableData((CustomerInfo) other));
    }

    public final Set<String> getActiveSubscriptions() {
        return (Set) this.activeSubscriptions.getValue();
    }

    public final Map<String, Date> getAllExpirationDatesByProduct() {
        return this.allExpirationDatesByProduct;
    }

    public final Map<String, Date> getAllPurchaseDatesByProduct() {
        return this.allPurchaseDatesByProduct;
    }

    public final Set<String> getAllPurchasedProductIds() {
        return (Set) this.allPurchasedProductIds.getValue();
    }

    public final Set<String> getAllPurchasedSkus() {
        return (Set) this.allPurchasedSkus.getValue();
    }

    public final EntitlementInfos getEntitlements() {
        return this.entitlements;
    }

    public final Date getExpirationDateForEntitlement(String entitlement) {
        AbstractC16544l.m18094g(entitlement, "entitlement");
        EntitlementInfo entitlementInfo = this.entitlements.getAll().get(entitlement);
        if (entitlementInfo != null) {
            return entitlementInfo.getExpirationDate();
        }
        return null;
    }

    public final Date getExpirationDateForProductId(String productId) {
        AbstractC16544l.m18094g(productId, "productId");
        return this.allExpirationDatesByProduct.get(productId);
    }

    @InterfaceC17300c
    public final Date getExpirationDateForSku(String sku) {
        AbstractC16544l.m18094g(sku, "sku");
        return this.allExpirationDatesByProduct.get(sku);
    }

    public final Date getFirstSeen() {
        return this.firstSeen;
    }

    public final Date getLatestExpirationDate() {
        return (Date) this.latestExpirationDate.getValue();
    }

    public final Uri getManagementURL() {
        return this.managementURL;
    }

    public final List<Transaction> getNonSubscriptionTransactions() {
        return (List) this.nonSubscriptionTransactions.getValue();
    }

    public final String getOriginalAppUserId() {
        return this.originalAppUserId;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final Date getPurchaseDateForEntitlement(String entitlement) {
        AbstractC16544l.m18094g(entitlement, "entitlement");
        EntitlementInfo entitlementInfo = this.entitlements.getAll().get(entitlement);
        if (entitlementInfo != null) {
            return entitlementInfo.getLatestPurchaseDate();
        }
        return null;
    }

    public final Date getPurchaseDateForProductId(String productId) {
        AbstractC16544l.m18094g(productId, "productId");
        return this.allPurchaseDatesByProduct.get(productId);
    }

    @InterfaceC17300c
    public final Date getPurchaseDateForSku(String sku) {
        AbstractC16544l.m18094g(sku, "sku");
        return this.allPurchaseDatesByProduct.get(sku);
    }

    public final Date getRequestDate() {
        return this.requestDate;
    }

    public final int getSchemaVersion() {
        return this.schemaVersion;
    }

    public int hashCode() {
        return new ComparableData(this).hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("<CustomerInfo\n latestExpirationDate: ");
        sb2.append(getLatestExpirationDate());
        sb2.append("\nactiveSubscriptions:  ");
        Set<String> activeSubscriptions = getActiveSubscriptions();
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(activeSubscriptions, 10));
        for (String str : activeSubscriptions) {
            arrayList.add(new C17309l(str, AbstractC17660E.m19258c(new C17309l("expiresDate", getExpirationDateForProductId(str)))));
        }
        sb2.append(AbstractC17659D.m19253o(arrayList));
        sb2.append(",\nactiveEntitlements: ");
        Map<String, EntitlementInfo> active = this.entitlements.getActive();
        ArrayList arrayList2 = new ArrayList(active.size());
        Iterator<Map.Entry<String, EntitlementInfo>> it = active.entrySet().iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().toString());
        }
        sb2.append(arrayList2);
        sb2.append(",\nentitlements: ");
        Map<String, EntitlementInfo> all = this.entitlements.getAll();
        ArrayList arrayList3 = new ArrayList(all.size());
        Iterator<Map.Entry<String, EntitlementInfo>> it2 = all.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList3.add(it2.next().toString());
        }
        sb2.append(arrayList3);
        sb2.append(",\nnonSubscriptionTransactions: ");
        sb2.append(getNonSubscriptionTransactions());
        sb2.append(",\nrequestDate: ");
        sb2.append(this.requestDate);
        sb2.append("\n>");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        AbstractC16544l.m18094g(parcel, "out");
        this.entitlements.writeToParcel(parcel, flags);
        Map<String, Date> map = this.allExpirationDatesByProduct;
        parcel.writeInt(map.size());
        for (Map.Entry<String, Date> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeSerializable(entry.getValue());
        }
        Map<String, Date> map2 = this.allPurchaseDatesByProduct;
        parcel.writeInt(map2.size());
        for (Map.Entry<String, Date> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeSerializable(entry2.getValue());
        }
        parcel.writeSerializable(this.requestDate);
        parcel.writeInt(this.schemaVersion);
        parcel.writeSerializable(this.firstSeen);
        parcel.writeString(this.originalAppUserId);
        parcel.writeParcelable(this.managementURL, flags);
        parcel.writeSerializable(this.originalPurchaseDate);
        JSONObjectParceler.INSTANCE.write(this.jsonObject, parcel, flags);
    }

    @Override // com.revenuecat.purchases.models.RawDataContainer
    public JSONObject getRawData() {
        return this.jsonObject;
    }
}
