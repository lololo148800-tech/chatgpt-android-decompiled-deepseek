package com.revenuecat.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p011A9.p012Ra.ahZQMZ;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001d\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\u0018\u0010\u0016\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\t¨\u0006\u001c"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "Landroid/os/Parcelable;", "Lcom/revenuecat/purchases/PurchasesErrorCode;", "code", "", "underlyingErrorMessage", "<init>", "(Lcom/revenuecat/purchases/PurchasesErrorCode;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/revenuecat/purchases/PurchasesErrorCode;", "getCode", "()Lcom/revenuecat/purchases/PurchasesErrorCode;", "Ljava/lang/String;", "getUnderlyingErrorMessage", "message", "getMessage", "getMessage$annotations", "()V", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PurchasesError implements Parcelable {
    public static final Parcelable.Creator<PurchasesError> CREATOR = new Creator();
    private final PurchasesErrorCode code;
    private final String message;
    private final String underlyingErrorMessage;

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Creator implements Parcelable.Creator<PurchasesError> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PurchasesError createFromParcel(Parcel parcel) {
            AbstractC16544l.m18094g(parcel, "parcel");
            return new PurchasesError(PurchasesErrorCode.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PurchasesError[] newArray(int i10) {
            return new PurchasesError[i10];
        }
    }

    public PurchasesError(PurchasesErrorCode code, String str) {
        AbstractC16544l.m18094g(code, "code");
        this.code = code;
        this.underlyingErrorMessage = str;
        this.message = code.getDescription();
    }

    public static /* synthetic */ void getMessage$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final PurchasesErrorCode getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getUnderlyingErrorMessage() {
        return this.underlyingErrorMessage;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        AbstractC16544l.m18094g(parcel, "out");
        parcel.writeString(this.code.name());
        parcel.writeString(this.underlyingErrorMessage);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(ahZQMZ.Jbxa);
        sb2.append(this.code);
        sb2.append(", underlyingErrorMessage=");
        sb2.append(this.underlyingErrorMessage);
        sb2.append(", message='");
        return AbstractC9306j0.m9891j(this.message, "')", sb2);
    }

    public /* synthetic */ PurchasesError(PurchasesErrorCode purchasesErrorCode, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(purchasesErrorCode, (i10 & 2) != 0 ? null : str);
    }
}
