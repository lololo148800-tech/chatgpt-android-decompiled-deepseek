package p408Qj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p263K9.C4576X;

/* JADX INFO: renamed from: Qj.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C6744j extends AbstractC6746l {

    /* JADX INFO: renamed from: Y */
    public static final C6744j f21649Y = new C6744j();
    public static final Parcelable.Creator<C6744j> CREATOR = new C4576X(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C6744j);
    }

    public final int hashCode() {
        return -1566369824;
    }

    public final String toString() {
        return "Running";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(1);
    }
}
