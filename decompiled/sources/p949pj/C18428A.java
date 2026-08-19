package p949pj;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Size;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: pj.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C18428A implements Parcelable {
    public static final Parcelable.Creator<C18428A> CREATOR = new C18461e(6);

    /* JADX INFO: renamed from: Y */
    public final String f58791Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC18495z f58792Z;

    /* JADX INFO: renamed from: o0 */
    public final Size f58793o0;

    /* JADX INFO: renamed from: p0 */
    public final int f58794p0;

    public C18428A(String label, EnumC18495z facingMode, Size size, int i10) {
        AbstractC16544l.m18094g(label, "label");
        AbstractC16544l.m18094g(facingMode, "facingMode");
        AbstractC16544l.m18094g(size, "size");
        this.f58791Y = label;
        this.f58792Z = facingMode;
        this.f58793o0 = size;
        this.f58794p0 = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f58791Y);
        out.writeString(this.f58792Z.name());
        out.writeSize(this.f58793o0);
        out.writeInt(this.f58794p0);
    }

    public /* synthetic */ C18428A() {
        this("", EnumC18495z.f58956o0, new Size(0, 0), 0);
    }
}
