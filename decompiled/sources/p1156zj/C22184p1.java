package p1156zj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p994rk.C19094J1;

/* JADX INFO: renamed from: zj.p1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22184p1 extends AbstractC22196t1 {
    public static final Parcelable.Creator<C22184p1> CREATOR = new C22132X0(5);

    /* JADX INFO: renamed from: Y */
    public final C19094J1 f70250Y;

    public C22184p1(C19094J1 customImage) {
        AbstractC16544l.m18094g(customImage, "customImage");
        this.f70250Y = customImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f70250Y, i10);
    }
}
