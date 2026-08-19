package p100Dk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;

/* JADX INFO: renamed from: Dk.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C2077d extends AbstractC2082i {
    public static final Parcelable.Creator<C2077d> CREATOR = new C0516a(21);

    /* JADX INFO: renamed from: Y */
    public final String f6414Y;

    public C2077d(String value) {
        AbstractC16544l.m18094g(value, "value");
        this.f6414Y = value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f6414Y);
    }
}
