package p125Ej;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;

/* JADX INFO: renamed from: Ej.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C2565i implements InterfaceC2564h {

    /* JADX INFO: renamed from: Y */
    public static final C2565i f7997Y = new C2565i();
    public static final Parcelable.Creator<C2565i> CREATOR = new C0516a(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C2565i);
    }

    public final int hashCode() {
        return 1462785890;
    }

    public final String toString() {
        return "HoldStillHint";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(1);
    }
}
