package p100Dk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;

/* JADX INFO: renamed from: Dk.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C2081h extends AbstractC2082i {
    public static final Parcelable.Creator<C2081h> CREATOR = new C0516a(25);

    /* JADX INFO: renamed from: Y */
    public final String f6420Y;

    /* JADX INFO: renamed from: Z */
    public final String f6421Z;

    /* JADX INFO: renamed from: o0 */
    public final String f6422o0;

    public C2081h(String str, String str2, String str3) {
        this.f6420Y = str;
        this.f6421Z = str2;
        this.f6422o0 = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f6420Y);
        out.writeString(this.f6421Z);
        out.writeString(this.f6422o0);
    }
}
