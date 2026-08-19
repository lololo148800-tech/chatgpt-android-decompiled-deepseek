package p571X9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: X9.R4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9202R4 extends AbstractC20851a {
    public static final Parcelable.Creator<C9202R4> CREATOR = new C9270d0(5);

    /* JADX INFO: renamed from: Y */
    public final int f27990Y;

    /* JADX INFO: renamed from: Z */
    public final int f27991Z;

    /* JADX INFO: renamed from: o0 */
    public final int f27992o0;

    /* JADX INFO: renamed from: p0 */
    public final int f27993p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f27994q0;

    /* JADX INFO: renamed from: r0 */
    public final float f27995r0;

    public C9202R4(int i10, int i11, int i12, int i13, boolean z6, float f10) {
        this.f27990Y = i10;
        this.f27991Z = i11;
        this.f27992o0 = i12;
        this.f27993p0 = i13;
        this.f27994q0 = z6;
        this.f27995r0 = f10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f27990Y);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f27991Z);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeInt(this.f27992o0);
        AbstractC8199t5.m8813l(parcel, 4, 4);
        parcel.writeInt(this.f27993p0);
        AbstractC8199t5.m8813l(parcel, 5, 4);
        parcel.writeInt(this.f27994q0 ? 1 : 0);
        AbstractC8199t5.m8813l(parcel, 6, 4);
        parcel.writeFloat(this.f27995r0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
