package p571X9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: X9.t4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9370t4 extends AbstractC20851a {
    public static final Parcelable.Creator<C9370t4> CREATOR = new C9270d0(3);

    /* JADX INFO: renamed from: Y */
    public final int f28226Y;

    /* JADX INFO: renamed from: Z */
    public final float f28227Z;

    /* JADX INFO: renamed from: o0 */
    public final float f28228o0;

    /* JADX INFO: renamed from: p0 */
    public final int f28229p0;

    public C9370t4(float f10, float f11, int i10, int i11) {
        this.f28226Y = i10;
        this.f28227Z = f10;
        this.f28228o0 = f11;
        this.f28229p0 = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f28226Y);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeFloat(this.f28227Z);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeFloat(this.f28228o0);
        AbstractC8199t5.m8813l(parcel, 4, 4);
        parcel.writeInt(this.f28229p0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
