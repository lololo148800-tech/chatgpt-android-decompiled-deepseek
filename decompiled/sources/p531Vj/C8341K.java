package p531Vj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p263K9.C4576X;

/* JADX INFO: renamed from: Vj.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C8341K extends AbstractC8350U {

    /* JADX INFO: renamed from: Y */
    public static final C8341K f25997Y = new C8341K();
    public static final Parcelable.Creator<C8341K> CREATOR = new C4576X(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C8341K);
    }

    public final int hashCode() {
        return -367421189;
    }

    public final String toString() {
        return "CheckPermissionPermanentlyDenied";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(1);
    }
}
