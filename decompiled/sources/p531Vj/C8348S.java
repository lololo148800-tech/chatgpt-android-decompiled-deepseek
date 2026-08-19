package p531Vj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Vj.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C8348S extends AbstractC8350U {

    /* JADX INFO: renamed from: Y */
    public static final C8348S f26004Y = new C8348S();
    public static final Parcelable.Creator<C8348S> CREATOR = new C8343M(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C8348S);
    }

    public final int hashCode() {
        return -1723010119;
    }

    public final String toString() {
        return "ShowPermissionPermanentlyDeniedMessage";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(1);
    }
}
