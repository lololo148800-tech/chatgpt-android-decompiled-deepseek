package p531Vj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Vj.O */
/* JADX INFO: loaded from: classes3.dex */
public final class C8345O extends AbstractC8350U {

    /* JADX INFO: renamed from: Y */
    public static final C8345O f26001Y = new C8345O();
    public static final Parcelable.Creator<C8345O> CREATOR = new C8343M(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C8345O);
    }

    public final int hashCode() {
        return 1563807797;
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
