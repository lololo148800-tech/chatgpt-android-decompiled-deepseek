package p523V9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.g */
/* JADX INFO: loaded from: classes.dex */
public final class C8089g extends AbstractC20851a {
    public static final Parcelable.Creator<C8089g> CREATOR = new C8041a(4);

    /* JADX INFO: renamed from: Y */
    public int f25413Y;

    /* JADX INFO: renamed from: Z */
    public final int f25414Z;

    /* JADX INFO: renamed from: o0 */
    public final int f25415o0;

    /* JADX INFO: renamed from: p0 */
    public final long f25416p0;

    /* JADX INFO: renamed from: q0 */
    public final int f25417q0;

    public C8089g(int i10, int i11, int i12, long j10, int i13) {
        this.f25413Y = i10;
        this.f25414Z = i11;
        this.f25415o0 = i12;
        this.f25416p0 = j10;
        this.f25417q0 = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        int i11 = this.f25413Y;
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(i11);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeInt(this.f25414Z);
        AbstractC8199t5.m8813l(parcel, 4, 4);
        parcel.writeInt(this.f25415o0);
        AbstractC8199t5.m8813l(parcel, 5, 8);
        parcel.writeLong(this.f25416p0);
        AbstractC8199t5.m8813l(parcel, 6, 4);
        parcel.writeInt(this.f25417q0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
