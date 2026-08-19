package p100Dk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;

/* JADX INFO: renamed from: Dk.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2075b extends AbstractC2082i {
    public static final Parcelable.Creator<C2075b> CREATOR = new C0516a(19);

    /* JADX INFO: renamed from: Y */
    public final boolean f6412Y;

    public C2075b(boolean z6) {
        this.f6412Y = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(this.f6412Y ? 1 : 0);
    }
}
