package p1156zj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: zj.r1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22190r1 extends AbstractC22196t1 {

    /* JADX INFO: renamed from: Y */
    public static final C22190r1 f70260Y = new C22190r1();
    public static final Parcelable.Creator<C22190r1> CREATOR = new C22132X0(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C22190r1);
    }

    public final int hashCode() {
        return -1995687048;
    }

    public final String toString() {
        return "Passport";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(1);
    }
}
