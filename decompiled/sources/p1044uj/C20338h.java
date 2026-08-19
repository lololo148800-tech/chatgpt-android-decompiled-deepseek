package p1044uj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;
import p960q9.C18658l;

/* JADX INFO: renamed from: uj.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C20338h extends AbstractC20340i {
    public static final Parcelable.Creator<C20338h> CREATOR = new C18658l(15);

    /* JADX INFO: renamed from: Y */
    public final String f64306Y;

    /* JADX INFO: renamed from: Z */
    public final String f64307Z;

    /* JADX INFO: renamed from: o0 */
    public final String f64308o0;

    /* JADX INFO: renamed from: p0 */
    public final String f64309p0;

    public C20338h(String str, String str2, String remoteUrl, String documentFileId) {
        AbstractC16544l.m18094g(remoteUrl, "remoteUrl");
        AbstractC16544l.m18094g(documentFileId, "documentFileId");
        this.f64306Y = str;
        this.f64307Z = str2;
        this.f64308o0 = remoteUrl;
        this.f64309p0 = documentFileId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20338h)) {
            return false;
        }
        C20338h c20338h = (C20338h) obj;
        return AbstractC16544l.m18089b(this.f64306Y, c20338h.f64306Y) && AbstractC16544l.m18089b(this.f64307Z, c20338h.f64307Z) && AbstractC16544l.m18089b(this.f64308o0, c20338h.f64308o0) && AbstractC16544l.m18089b(this.f64309p0, c20338h.f64309p0);
    }

    public final int hashCode() {
        String str = this.f64306Y;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f64307Z;
        return this.f64309p0.hashCode() + AbstractC0168G.m527p((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f64308o0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Remote(absoluteFilePath=");
        sb2.append(this.f64306Y);
        sb2.append(", filename=");
        sb2.append(this.f64307Z);
        sb2.append(", remoteUrl=");
        sb2.append(this.f64308o0);
        sb2.append(", documentFileId=");
        return AbstractC9306j0.m9891j(this.f64309p0, Separators.RPAREN, sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f64306Y);
        out.writeString(this.f64307Z);
        out.writeString(this.f64308o0);
        out.writeString(this.f64309p0);
    }
}
