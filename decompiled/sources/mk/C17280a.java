package mk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p718e4.C13280a;

/* JADX INFO: renamed from: mk.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C17280a implements Parcelable {
    public static final Parcelable.Creator<C17280a> CREATOR = new C13280a(17);

    /* JADX INFO: renamed from: Y */
    public final boolean f55088Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f55089Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f55090o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f55091p0;

    public C17280a(boolean z6, boolean z10, boolean z11, boolean z12) {
        this.f55088Y = z6;
        this.f55089Z = z10;
        this.f55090o0 = z11;
        this.f55091p0 = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(this.f55088Y ? 1 : 0);
        out.writeInt(this.f55089Z ? 1 : 0);
        out.writeInt(this.f55090o0 ? 1 : 0);
        out.writeInt(this.f55091p0 ? 1 : 0);
    }
}
