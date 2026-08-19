package p531Vj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p263K9.C4576X;

/* JADX INFO: renamed from: Vj.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C8379r extends AbstractC8381t {

    /* JADX INFO: renamed from: Y */
    public static final C8379r f26080Y = new C8379r();
    public static final Parcelable.Creator<C8379r> CREATOR = new C4576X(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C8379r);
    }

    public final int hashCode() {
        return 1991921803;
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
