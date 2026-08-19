package p531Vj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p263K9.C4576X;

/* JADX INFO: renamed from: Vj.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C8377p extends AbstractC8381t {

    /* JADX INFO: renamed from: Y */
    public static final C8377p f26078Y = new C8377p();
    public static final Parcelable.Creator<C8377p> CREATOR = new C4576X(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C8377p);
    }

    public final int hashCode() {
        return -86189441;
    }

    public final String toString() {
        return "CheckDeviceFeatureState";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(1);
    }
}
