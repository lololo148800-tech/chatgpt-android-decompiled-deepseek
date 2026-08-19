package p100Dk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;

/* JADX INFO: renamed from: Dk.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2074a extends AbstractC2082i {
    public static final Parcelable.Creator<C2074a> CREATOR = new C0516a(18);

    /* JADX INFO: renamed from: Y */
    public final String f6407Y;

    /* JADX INFO: renamed from: Z */
    public final String f6408Z;

    /* JADX INFO: renamed from: o0 */
    public final String f6409o0;

    /* JADX INFO: renamed from: p0 */
    public final String f6410p0;

    /* JADX INFO: renamed from: q0 */
    public final String f6411q0;

    public C2074a(String str, String str2, String str3, String str4, String str5) {
        this.f6407Y = str;
        this.f6408Z = str2;
        this.f6409o0 = str3;
        this.f6410p0 = str4;
        this.f6411q0 = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f6407Y);
        out.writeString(this.f6408Z);
        out.writeString(this.f6409o0);
        out.writeString(this.f6410p0);
        out.writeString(this.f6411q0);
    }
}
