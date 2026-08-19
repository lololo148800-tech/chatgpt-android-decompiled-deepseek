package p949pj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: pj.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C18439L implements Parcelable {
    public static final Parcelable.Creator<C18439L> CREATOR = new C18461e(8);

    /* JADX INFO: renamed from: Y */
    public final String f58829Y;

    public C18439L(String textOnImage) {
        AbstractC16544l.m18094g(textOnImage, "textOnImage");
        this.f58829Y = textOnImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18439L) && AbstractC16544l.m18089b(this.f58829Y, ((C18439L) obj).f58829Y);
    }

    public final int hashCode() {
        return this.f58829Y.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f58829Y, Separators.RPAREN, new StringBuilder("ImageIdMetadata(textOnImage="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f58829Y);
    }
}
