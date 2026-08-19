package p149Fj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p125Ej.C2566j;

/* JADX INFO: renamed from: Fj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2867a implements InterfaceC2868b {

    /* JADX INFO: renamed from: Y */
    public static final C2867a f8636Y = new C2867a();
    public static final Parcelable.Creator<C2867a> CREATOR = new C2566j(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C2867a);
    }

    public final int hashCode() {
        return -402570646;
    }

    public final String toString() {
        return "Unknown";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(1);
    }
}
