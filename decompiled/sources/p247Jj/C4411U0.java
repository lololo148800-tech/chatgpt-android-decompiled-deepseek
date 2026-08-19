package p247Jj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Jj.U0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4411U0 extends AbstractC4413V0 {

    /* JADX INFO: renamed from: Y */
    public static final C4411U0 f14312Y = new C4411U0();
    public static final Parcelable.Creator<C4411U0> CREATOR = new C4409T0(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C4411U0);
    }

    public final int hashCode() {
        return -593165066;
    }

    public final String toString() {
        return "TransitioningBack";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(1);
    }
}
