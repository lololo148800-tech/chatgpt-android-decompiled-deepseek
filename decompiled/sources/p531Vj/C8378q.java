package p531Vj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p263K9.C4576X;

/* JADX INFO: renamed from: Vj.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C8378q extends AbstractC8381t {

    /* JADX INFO: renamed from: Y */
    public static final C8378q f26079Y = new C8378q();
    public static final Parcelable.Creator<C8378q> CREATOR = new C4576X(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C8378q);
    }

    public final int hashCode() {
        return 92238675;
    }

    public final String toString() {
        return "Complete";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(1);
    }
}
