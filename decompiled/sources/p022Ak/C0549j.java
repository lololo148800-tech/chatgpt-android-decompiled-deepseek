package p022Ak;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;

/* JADX INFO: renamed from: Ak.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C0549j implements Parcelable {
    public static final Parcelable.Creator<C0549j> CREATOR = new C0516a(7);

    /* JADX INFO: renamed from: Y */
    public final EnumC0548i f1751Y;

    /* JADX INFO: renamed from: Z */
    public final File f1752Z;

    public C0549j(EnumC0548i captureMethod, File data) {
        AbstractC16544l.m18094g(captureMethod, "captureMethod");
        AbstractC16544l.m18094g(data, "data");
        this.f1751Y = captureMethod;
        this.f1752Z = data;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0549j)) {
            return false;
        }
        C0549j c0549j = (C0549j) obj;
        return this.f1751Y == c0549j.f1751Y && AbstractC16544l.m18089b(this.f1752Z, c0549j.f1752Z);
    }

    public final int hashCode() {
        return this.f1752Z.hashCode() + (this.f1751Y.hashCode() * 31);
    }

    public final String toString() {
        return "SelfieCapture(captureMethod=" + this.f1751Y + ", data=" + this.f1752Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f1751Y.name());
        out.writeSerializable(this.f1752Z);
    }
}
