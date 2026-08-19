package p1044uj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p882m1.clb.WGTYqNchEpHca;
import p960q9.C18658l;

/* JADX INFO: renamed from: uj.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C20362t implements Parcelable {
    public static final Parcelable.Creator<C20362t> CREATOR = new C18658l(17);

    /* JADX INFO: renamed from: Y */
    public final C20370z f64379Y;

    /* JADX INFO: renamed from: Z */
    public final C20365u0 f64380Z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        this.f64379Y.writeToParcel(out, i10);
        this.f64380Z.writeToParcel(out, i10);
    }

    public C20362t(C20370z c20370z, C20365u0 uploadOptionsDialog) {
        AbstractC16544l.m18094g(c20370z, WGTYqNchEpHca.otQ);
        AbstractC16544l.m18094g(uploadOptionsDialog, "uploadOptionsDialog");
        this.f64379Y = c20370z;
        this.f64380Z = uploadOptionsDialog;
    }
}
