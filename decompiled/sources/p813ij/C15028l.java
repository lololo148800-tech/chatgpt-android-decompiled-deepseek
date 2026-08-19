package p813ij;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ij.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C15028l implements Parcelable {
    public static final C15027k CREATOR = new C15027k();

    /* JADX INFO: renamed from: Y */
    public final String f46726Y;

    /* JADX INFO: renamed from: Z */
    public final SparseArray f46727Z;

    public C15028l(String str, SparseArray sparseArray) {
        this.f46726Y = str;
        this.f46727Z = sparseArray;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15028l)) {
            return false;
        }
        C15028l c15028l = (C15028l) obj;
        return AbstractC16544l.m18089b(this.f46726Y, c15028l.f46726Y) && AbstractC16544l.m18089b(this.f46727Z, c15028l.f46727Z);
    }

    public final int hashCode() {
        return this.f46727Z.hashCode() + (this.f46726Y.hashCode() * 31);
    }

    public final String toString() {
        return "ViewStateFrame(key=" + this.f46726Y + ", viewState=" + this.f46727Z + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        AbstractC16544l.m18094g(parcel, "parcel");
        parcel.writeString(this.f46726Y);
        parcel.writeSparseArray(this.f46727Z);
    }
}
