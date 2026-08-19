package p531Vj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Vj.T */
/* JADX INFO: loaded from: classes3.dex */
public final class C8349T extends AbstractC8350U {

    /* JADX INFO: renamed from: Y */
    public static final C8349T f26005Y = new C8349T();
    public static final Parcelable.Creator<C8349T> CREATOR = new C8343M(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C8349T);
    }

    public final int hashCode() {
        return 120525746;
    }

    public final String toString() {
        return "ShowRequestPermissionRationale";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(1);
    }
}
