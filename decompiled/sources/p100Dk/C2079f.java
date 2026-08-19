package p100Dk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;

/* JADX INFO: renamed from: Dk.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C2079f extends AbstractC2082i {
    public static final Parcelable.Creator<C2079f> CREATOR = new C0516a(23);

    /* JADX INFO: renamed from: Y */
    public final String f6416Y;

    public C2079f(String str) {
        this.f6416Y = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f6416Y);
    }
}
