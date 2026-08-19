package p1156zj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: zj.q1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22187q1 extends AbstractC22196t1 {

    /* JADX INFO: renamed from: Y */
    public static final C22187q1 f70254Y = new C22187q1();
    public static final Parcelable.Creator<C22187q1> CREATOR = new C22132X0(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C22187q1);
    }

    public final int hashCode() {
        return 212467448;
    }

    public final String toString() {
        return "GenericFront";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(1);
    }
}
