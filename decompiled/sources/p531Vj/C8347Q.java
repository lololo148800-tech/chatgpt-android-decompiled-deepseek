package p531Vj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Vj.Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C8347Q extends AbstractC8350U {

    /* JADX INFO: renamed from: Y */
    public static final C8347Q f26003Y = new C8347Q();
    public static final Parcelable.Creator<C8347Q> CREATOR = new C8343M(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C8347Q);
    }

    public final int hashCode() {
        return -2052298174;
    }

    public final String toString() {
        return "RequestPermission";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(1);
    }
}
