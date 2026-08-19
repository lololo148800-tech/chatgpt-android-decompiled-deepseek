package p531Vj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Vj.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C8344N extends AbstractC8350U {

    /* JADX INFO: renamed from: Y */
    public static final C8344N f26000Y = new C8344N();
    public static final Parcelable.Creator<C8344N> CREATOR = new C8343M(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C8344N);
    }

    public final int hashCode() {
        return -885686570;
    }

    public final String toString() {
        return "CheckPermissionState";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(1);
    }
}
