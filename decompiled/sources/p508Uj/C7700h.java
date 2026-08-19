package p508Uj;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p263K9.C4576X;

/* JADX INFO: renamed from: Uj.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C7700h extends AbstractC7701i {
    public static final Parcelable.Creator<C7700h> CREATOR = new C4576X(18);

    /* JADX INFO: renamed from: Y */
    public final Uri f24249Y;

    /* JADX INFO: renamed from: Z */
    public final Uri f24250Z;

    /* JADX INFO: renamed from: o0 */
    public final Uri f24251o0;

    public C7700h(Uri dg1Uri, Uri dg2Uri, Uri sodUri) {
        AbstractC16544l.m18094g(dg1Uri, "dg1Uri");
        AbstractC16544l.m18094g(dg2Uri, "dg2Uri");
        AbstractC16544l.m18094g(sodUri, "sodUri");
        this.f24249Y = dg1Uri;
        this.f24250Z = dg2Uri;
        this.f24251o0 = sodUri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f24249Y, i10);
        out.writeParcelable(this.f24250Z, i10);
        out.writeParcelable(this.f24251o0, i10);
    }
}
