package p021Aj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p1156zj.C22124T0;

/* JADX INFO: renamed from: Aj.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C0517b implements Parcelable {
    public static final Parcelable.Creator<C0517b> CREATOR = new C0516a(0);

    /* JADX INFO: renamed from: Y */
    public final boolean f1657Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f1658Z;

    /* JADX INFO: renamed from: o0 */
    public final C22124T0 f1659o0;

    public C0517b(boolean z6, boolean z10, C22124T0 idSideConfig) {
        AbstractC16544l.m18094g(idSideConfig, "idSideConfig");
        this.f1657Y = z6;
        this.f1658Z = z10;
        this.f1659o0 = idSideConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(this.f1657Y ? 1 : 0);
        out.writeInt(this.f1658Z ? 1 : 0);
        this.f1659o0.writeToParcel(out, i10);
    }
}
