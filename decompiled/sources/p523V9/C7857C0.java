package p523V9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.C0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7857C0 extends AbstractC20851a {
    public static final Parcelable.Creator<C7857C0> CREATOR = new C8041a(8);

    /* JADX INFO: renamed from: Y */
    public int f24753Y;

    /* JADX INFO: renamed from: Z */
    public int f24754Z;

    /* JADX INFO: renamed from: o0 */
    public int f24755o0;

    /* JADX INFO: renamed from: p0 */
    public int f24756p0;

    /* JADX INFO: renamed from: q0 */
    public int f24757q0;

    /* JADX INFO: renamed from: r0 */
    public int f24758r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f24759s0;

    /* JADX INFO: renamed from: t0 */
    public String f24760t0;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f24753Y);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeInt(this.f24754Z);
        AbstractC8199t5.m8813l(parcel, 4, 4);
        parcel.writeInt(this.f24755o0);
        AbstractC8199t5.m8813l(parcel, 5, 4);
        parcel.writeInt(this.f24756p0);
        AbstractC8199t5.m8813l(parcel, 6, 4);
        parcel.writeInt(this.f24757q0);
        AbstractC8199t5.m8813l(parcel, 7, 4);
        parcel.writeInt(this.f24758r0);
        AbstractC8199t5.m8813l(parcel, 8, 4);
        parcel.writeInt(this.f24759s0 ? 1 : 0);
        AbstractC8199t5.m8807f(parcel, 9, this.f24760t0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
