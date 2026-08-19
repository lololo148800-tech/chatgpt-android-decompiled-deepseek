package p571X9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: X9.V4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9226V4 extends AbstractC20851a {
    public static final Parcelable.Creator<C9226V4> CREATOR = new C9270d0(8);

    /* JADX INFO: renamed from: Y */
    public final int f28018Y;

    /* JADX INFO: renamed from: Z */
    public final int f28019Z;

    /* JADX INFO: renamed from: o0 */
    public final int f28020o0;

    /* JADX INFO: renamed from: p0 */
    public final long f28021p0;

    /* JADX INFO: renamed from: q0 */
    public final int f28022q0;

    public C9226V4(int i10, int i11, int i12, long j10, int i13) {
        this.f28018Y = i10;
        this.f28019Z = i11;
        this.f28020o0 = i12;
        this.f28021p0 = j10;
        this.f28022q0 = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f28018Y);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeInt(this.f28019Z);
        AbstractC8199t5.m8813l(parcel, 4, 4);
        parcel.writeInt(this.f28020o0);
        AbstractC8199t5.m8813l(parcel, 5, 8);
        parcel.writeLong(this.f28021p0);
        AbstractC8199t5.m8813l(parcel, 6, 4);
        parcel.writeInt(this.f28022q0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
