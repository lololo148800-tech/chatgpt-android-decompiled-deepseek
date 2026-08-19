package p022Ak;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;

/* JADX INFO: renamed from: Ak.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C0545f implements Parcelable {
    public static final Parcelable.Creator<C0545f> CREATOR = new C0516a(6);

    /* JADX INFO: renamed from: Y */
    public final File f1738Y;

    /* JADX INFO: renamed from: Z */
    public final String f1739Z;

    public C0545f(File data, String mimeType) {
        AbstractC16544l.m18094g(data, "data");
        AbstractC16544l.m18094g(mimeType, "mimeType");
        this.f1738Y = data;
        this.f1739Z = mimeType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0545f)) {
            return false;
        }
        C0545f c0545f = (C0545f) obj;
        return AbstractC16544l.m18089b(this.f1738Y, c0545f.f1738Y) && AbstractC16544l.m18089b(this.f1739Z, c0545f.f1739Z);
    }

    public final int hashCode() {
        return this.f1739Z.hashCode() + (this.f1738Y.hashCode() * 31);
    }

    public final String toString() {
        return "Frame(data=" + this.f1738Y + ", mimeType=" + this.f1739Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeSerializable(this.f1738Y);
        out.writeString(this.f1739Z);
    }
}
