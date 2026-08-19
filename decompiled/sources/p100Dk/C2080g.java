package p100Dk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;

/* JADX INFO: renamed from: Dk.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C2080g extends AbstractC2082i {
    public static final Parcelable.Creator<C2080g> CREATOR = new C0516a(24);

    /* JADX INFO: renamed from: Y */
    public final String f6417Y;

    /* JADX INFO: renamed from: Z */
    public final String f6418Z;

    /* JADX INFO: renamed from: o0 */
    public final String f6419o0;

    public C2080g(String str, String str2, String str3) {
        this.f6417Y = str;
        this.f6418Z = str2;
        this.f6419o0 = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f6417Y);
        out.writeString(this.f6418Z);
        out.writeString(this.f6419o0);
    }
}
