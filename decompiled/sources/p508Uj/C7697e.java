package p508Uj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p263K9.C4576X;

/* JADX INFO: renamed from: Uj.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C7697e extends AbstractC7701i {

    /* JADX INFO: renamed from: Y */
    public static final C7697e f24244Y = new C7697e();
    public static final Parcelable.Creator<C7697e> CREATOR = new C4576X(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C7697e);
    }

    public final int hashCode() {
        return -869674698;
    }

    public final String toString() {
        return "Cancel";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(1);
    }
}
