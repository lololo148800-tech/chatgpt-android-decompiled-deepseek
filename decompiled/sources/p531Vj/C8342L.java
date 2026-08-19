package p531Vj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p263K9.C4576X;

/* JADX INFO: renamed from: Vj.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C8342L extends AbstractC8350U {

    /* JADX INFO: renamed from: Y */
    public static final C8342L f25998Y = new C8342L();
    public static final Parcelable.Creator<C8342L> CREATOR = new C4576X(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C8342L);
    }

    public final int hashCode() {
        return -1860465355;
    }

    public final String toString() {
        return "CheckPermissionRationaleState";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(1);
    }
}
