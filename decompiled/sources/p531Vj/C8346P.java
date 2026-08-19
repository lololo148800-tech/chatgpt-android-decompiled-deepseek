package p531Vj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Vj.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C8346P extends AbstractC8350U {

    /* JADX INFO: renamed from: Y */
    public static final C8346P f26002Y = new C8346P();
    public static final Parcelable.Creator<C8346P> CREATOR = new C8343M(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C8346P);
    }

    public final int hashCode() {
        return -1821218195;
    }

    public final String toString() {
        return "RequestDeviceFeature";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(1);
    }
}
