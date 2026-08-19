package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, m18067d2 = {"Lcom/revenuecat/purchases/models/Price;", "Landroid/os/Parcelable;", "", "formatted", "", "amountMicros", "currencyCode", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "copy", "(Ljava/lang/String;JLjava/lang/String;)Lcom/revenuecat/purchases/models/Price;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFormatted", "J", "getAmountMicros", "getCurrencyCode", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class Price implements Parcelable {
    public static final Parcelable.Creator<Price> CREATOR = new Creator();
    private final long amountMicros;
    private final String currencyCode;
    private final String formatted;

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Creator implements Parcelable.Creator<Price> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Price createFromParcel(Parcel parcel) {
            AbstractC16544l.m18094g(parcel, "parcel");
            return new Price(parcel.readString(), parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Price[] newArray(int i10) {
            return new Price[i10];
        }
    }

    public Price(String formatted, long j10, String currencyCode) {
        AbstractC16544l.m18094g(formatted, "formatted");
        AbstractC16544l.m18094g(currencyCode, "currencyCode");
        this.formatted = formatted;
        this.amountMicros = j10;
        this.currencyCode = currencyCode;
    }

    public static /* synthetic */ Price copy$default(Price price, String str, long j10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = price.formatted;
        }
        if ((i10 & 2) != 0) {
            j10 = price.amountMicros;
        }
        if ((i10 & 4) != 0) {
            str2 = price.currencyCode;
        }
        return price.copy(str, j10, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFormatted() {
        return this.formatted;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getAmountMicros() {
        return this.amountMicros;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final Price copy(String formatted, long amountMicros, String currencyCode) {
        AbstractC16544l.m18094g(formatted, "formatted");
        AbstractC16544l.m18094g(currencyCode, "currencyCode");
        return new Price(formatted, amountMicros, currencyCode);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Price)) {
            return false;
        }
        Price price = (Price) other;
        return AbstractC16544l.m18089b(this.formatted, price.formatted) && this.amountMicros == price.amountMicros && AbstractC16544l.m18089b(this.currencyCode, price.currencyCode);
    }

    public final long getAmountMicros() {
        return this.amountMicros;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getFormatted() {
        return this.formatted;
    }

    public int hashCode() {
        int iHashCode = this.formatted.hashCode() * 31;
        long j10 = this.amountMicros;
        return this.currencyCode.hashCode() + ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Price(formatted=");
        sb2.append(this.formatted);
        sb2.append(", amountMicros=");
        sb2.append(this.amountMicros);
        sb2.append(", currencyCode=");
        return AbstractC9306j0.m9892k(sb2, this.currencyCode, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        AbstractC16544l.m18094g(parcel, "out");
        parcel.writeString(this.formatted);
        parcel.writeLong(this.amountMicros);
        parcel.writeString(this.currencyCode);
    }
}
