package sk;

import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p960q9.C18658l;

/* JADX INFO: renamed from: sk.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C19664c implements Parcelable {
    public static final Parcelable.Creator<C19664c> CREATOR = new C18658l(6);

    /* JADX INFO: renamed from: Y */
    public final Uri f62325Y;

    /* JADX INFO: renamed from: Z */
    public final Uri f62326Z;

    /* JADX INFO: renamed from: o0 */
    public final Uri f62327o0;

    public C19664c(Uri dg1Uri, Uri dg2Uri, Uri sodUri) {
        AbstractC16544l.m18094g(dg1Uri, "dg1Uri");
        AbstractC16544l.m18094g(dg2Uri, "dg2Uri");
        AbstractC16544l.m18094g(sodUri, "sodUri");
        this.f62325Y = dg1Uri;
        this.f62326Z = dg2Uri;
        this.f62327o0 = sodUri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19664c)) {
            return false;
        }
        C19664c c19664c = (C19664c) obj;
        return AbstractC16544l.m18089b(this.f62325Y, c19664c.f62325Y) && AbstractC16544l.m18089b(this.f62326Z, c19664c.f62326Z) && AbstractC16544l.m18089b(this.f62327o0, c19664c.f62327o0);
    }

    public final int hashCode() {
        return this.f62327o0.hashCode() + ((this.f62326Z.hashCode() + (this.f62325Y.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "GovernmentIdNfcData(dg1Uri=" + this.f62325Y + ", dg2Uri=" + this.f62326Z + ", sodUri=" + this.f62327o0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f62325Y, i10);
        out.writeParcelable(this.f62326Z, i10);
        out.writeParcelable(this.f62327o0, i10);
    }
}
