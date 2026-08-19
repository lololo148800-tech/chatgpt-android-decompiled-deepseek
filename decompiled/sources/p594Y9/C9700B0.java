package p594Y9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: Y9.B0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9700B0 extends AbstractC20851a {
    public static final Parcelable.Creator<C9700B0> CREATOR = new C9864c1(0);

    /* JADX INFO: renamed from: Y */
    public final int f29228Y;

    /* JADX INFO: renamed from: Z */
    public final int f29229Z;

    /* JADX INFO: renamed from: o0 */
    public final int f29230o0;

    /* JADX INFO: renamed from: p0 */
    public final int f29231p0;

    /* JADX INFO: renamed from: q0 */
    public final float f29232q0;

    public C9700B0(int i10, int i11, int i12, int i13, float f10) {
        this.f29228Y = i10;
        this.f29229Z = i11;
        this.f29230o0 = i12;
        this.f29231p0 = i13;
        this.f29232q0 = f10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f29228Y);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeInt(this.f29229Z);
        AbstractC8199t5.m8813l(parcel, 4, 4);
        parcel.writeInt(this.f29230o0);
        AbstractC8199t5.m8813l(parcel, 5, 4);
        parcel.writeInt(this.f29231p0);
        AbstractC8199t5.m8813l(parcel, 6, 4);
        parcel.writeFloat(this.f29232q0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
