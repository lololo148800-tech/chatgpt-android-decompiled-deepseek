package p571X9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: X9.G1 */
/* JADX INFO: loaded from: classes.dex */
public final class C9134G1 extends AbstractC20851a {
    public static final Parcelable.Creator<C9134G1> CREATOR = new C9270d0(2);

    /* JADX INFO: renamed from: Y */
    public final int f27910Y;

    /* JADX INFO: renamed from: Z */
    public final int f27911Z;

    /* JADX INFO: renamed from: o0 */
    public final int f27912o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f27913p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f27914q0;

    /* JADX INFO: renamed from: r0 */
    public final float f27915r0;

    public C9134G1(int i10, int i11, int i12, boolean z6, boolean z10, float f10) {
        this.f27910Y = i10;
        this.f27911Z = i11;
        this.f27912o0 = i12;
        this.f27913p0 = z6;
        this.f27914q0 = z10;
        this.f27915r0 = f10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f27910Y);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeInt(this.f27911Z);
        AbstractC8199t5.m8813l(parcel, 4, 4);
        parcel.writeInt(this.f27912o0);
        AbstractC8199t5.m8813l(parcel, 5, 4);
        parcel.writeInt(this.f27913p0 ? 1 : 0);
        AbstractC8199t5.m8813l(parcel, 6, 4);
        parcel.writeInt(this.f27914q0 ? 1 : 0);
        AbstractC8199t5.m8813l(parcel, 7, 4);
        parcel.writeFloat(this.f27915r0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
