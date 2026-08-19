package com.revenuecat.purchases.models;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.InterfaceC17300c;
import org.json.JSONException;
import org.json.JSONObject;
import p003A1.AbstractC0168G;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000fR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b,\u0010\u000fR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0014¨\u00061"}, m18067d2 = {"Lcom/revenuecat/purchases/models/Transaction;", "Landroid/os/Parcelable;", "", "transactionIdentifier", "revenuecatId", "productIdentifier", "productId", "Ljava/util/Date;", "purchaseDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V", "Lorg/json/JSONObject;", "jsonObject", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/Date;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)Lcom/revenuecat/purchases/models/Transaction;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTransactionIdentifier", "getRevenuecatId", "getRevenuecatId$annotations", "()V", "getProductIdentifier", "getProductId", "getProductId$annotations", "Ljava/util/Date;", "getPurchaseDate", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class Transaction implements Parcelable {
    public static final Parcelable.Creator<Transaction> CREATOR = new Creator();
    private final String productId;
    private final String productIdentifier;
    private final Date purchaseDate;
    private final String revenuecatId;
    private final String transactionIdentifier;

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Creator implements Parcelable.Creator<Transaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Transaction createFromParcel(Parcel parcel) {
            AbstractC16544l.m18094g(parcel, "parcel");
            return new Transaction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Transaction[] newArray(int i10) {
            return new Transaction[i10];
        }
    }

    public Transaction(String transactionIdentifier, String revenuecatId, String productIdentifier, String productId, Date purchaseDate) {
        AbstractC16544l.m18094g(transactionIdentifier, "transactionIdentifier");
        AbstractC16544l.m18094g(revenuecatId, "revenuecatId");
        AbstractC16544l.m18094g(productIdentifier, "productIdentifier");
        AbstractC16544l.m18094g(productId, "productId");
        AbstractC16544l.m18094g(purchaseDate, "purchaseDate");
        this.transactionIdentifier = transactionIdentifier;
        this.revenuecatId = revenuecatId;
        this.productIdentifier = productIdentifier;
        this.productId = productId;
        this.purchaseDate = purchaseDate;
    }

    public static /* synthetic */ Transaction copy$default(Transaction transaction, String str, String str2, String str3, String str4, Date date, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = transaction.transactionIdentifier;
        }
        if ((i10 & 2) != 0) {
            str2 = transaction.revenuecatId;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = transaction.productIdentifier;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = transaction.productId;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            date = transaction.purchaseDate;
        }
        return transaction.copy(str, str5, str6, str7, date);
    }

    @InterfaceC17300c
    public static /* synthetic */ void getProductId$annotations() {
    }

    @InterfaceC17300c
    public static /* synthetic */ void getRevenuecatId$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTransactionIdentifier() {
        return this.transactionIdentifier;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRevenuecatId() {
        return this.revenuecatId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public final Transaction copy(String transactionIdentifier, String revenuecatId, String productIdentifier, String productId, Date purchaseDate) {
        AbstractC16544l.m18094g(transactionIdentifier, "transactionIdentifier");
        AbstractC16544l.m18094g(revenuecatId, "revenuecatId");
        AbstractC16544l.m18094g(productIdentifier, "productIdentifier");
        AbstractC16544l.m18094g(productId, "productId");
        AbstractC16544l.m18094g(purchaseDate, "purchaseDate");
        return new Transaction(transactionIdentifier, revenuecatId, productIdentifier, productId, purchaseDate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) other;
        return AbstractC16544l.m18089b(this.transactionIdentifier, transaction.transactionIdentifier) && AbstractC16544l.m18089b(this.revenuecatId, transaction.revenuecatId) && AbstractC16544l.m18089b(this.productIdentifier, transaction.productIdentifier) && AbstractC16544l.m18089b(this.productId, transaction.productId) && AbstractC16544l.m18089b(this.purchaseDate, transaction.purchaseDate);
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public final String getRevenuecatId() {
        return this.revenuecatId;
    }

    public final String getTransactionIdentifier() {
        return this.transactionIdentifier;
    }

    public int hashCode() {
        return this.purchaseDate.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(this.transactionIdentifier.hashCode() * 31, 31, this.revenuecatId), 31, this.productIdentifier), 31, this.productId);
    }

    public String toString() {
        return "Transaction(transactionIdentifier=" + this.transactionIdentifier + ", revenuecatId=" + this.revenuecatId + ", productIdentifier=" + this.productIdentifier + ", productId=" + this.productId + ", purchaseDate=" + this.purchaseDate + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        AbstractC16544l.m18094g(parcel, "out");
        parcel.writeString(this.transactionIdentifier);
        parcel.writeString(this.revenuecatId);
        parcel.writeString(this.productIdentifier);
        parcel.writeString(this.productId);
        parcel.writeSerializable(this.purchaseDate);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Transaction(String productId, JSONObject jsonObject) throws JSONException {
        AbstractC16544l.m18094g(productId, "productId");
        AbstractC16544l.m18094g(jsonObject, "jsonObject");
        String string = jsonObject.getString(ParameterNames.f31999ID);
        AbstractC16544l.m18093f(string, "jsonObject.getString(\"id\")");
        String string2 = jsonObject.getString(ParameterNames.f31999ID);
        AbstractC16544l.m18093f(string2, "jsonObject.getString(\"id\")");
        this(string, string2, productId, productId, JSONObjectExtensionsKt.getDate(jsonObject, "purchase_date"));
    }
}
