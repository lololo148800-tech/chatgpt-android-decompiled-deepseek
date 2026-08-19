package p125Ej;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Ej.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C2567k implements InterfaceC2564h {

    /* JADX INFO: renamed from: Y */
    public static final C2567k f7999Y = new C2567k();
    public static final Parcelable.Creator<C2567k> CREATOR = new C2566j(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C2567k);
    }

    public final int hashCode() {
        return -18155401;
    }

    public final String toString() {
        return "LowLightHint";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(1);
    }
}
