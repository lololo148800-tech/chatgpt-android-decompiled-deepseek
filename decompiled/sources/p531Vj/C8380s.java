package p531Vj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p263K9.C4576X;

/* JADX INFO: renamed from: Vj.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C8380s extends AbstractC8381t {

    /* JADX INFO: renamed from: Y */
    public static final C8380s f26081Y = new C8380s();
    public static final Parcelable.Creator<C8380s> CREATOR = new C4576X(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C8380s);
    }

    public final int hashCode() {
        return 725044653;
    }

    public final String toString() {
        return "ShowDeviceFeaturePrompt";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(1);
    }
}
