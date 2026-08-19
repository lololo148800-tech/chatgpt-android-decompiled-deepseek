package p523V9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.E6 */
/* JADX INFO: loaded from: classes.dex */
public final class C7879E6 extends AbstractC20851a {
    public static final Parcelable.Creator<C7879E6> CREATOR = new C8041a(10);

    /* JADX INFO: renamed from: Y */
    public final int f24790Y;

    /* JADX INFO: renamed from: Z */
    public final int f24791Z;

    /* JADX INFO: renamed from: o0 */
    public final int f24792o0;

    /* JADX INFO: renamed from: p0 */
    public final int f24793p0;

    /* JADX INFO: renamed from: q0 */
    public final int f24794q0;

    /* JADX INFO: renamed from: r0 */
    public final int f24795r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f24796s0;

    /* JADX INFO: renamed from: t0 */
    public final String f24797t0;

    public C7879E6(int i10, int i11, int i12, int i13, int i14, int i15, boolean z6, String str) {
        this.f24790Y = i10;
        this.f24791Z = i11;
        this.f24792o0 = i12;
        this.f24793p0 = i13;
        this.f24794q0 = i14;
        this.f24795r0 = i15;
        this.f24796s0 = z6;
        this.f24797t0 = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f24790Y);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f24791Z);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeInt(this.f24792o0);
        AbstractC8199t5.m8813l(parcel, 4, 4);
        parcel.writeInt(this.f24793p0);
        AbstractC8199t5.m8813l(parcel, 5, 4);
        parcel.writeInt(this.f24794q0);
        AbstractC8199t5.m8813l(parcel, 6, 4);
        parcel.writeInt(this.f24795r0);
        AbstractC8199t5.m8813l(parcel, 7, 4);
        parcel.writeInt(this.f24796s0 ? 1 : 0);
        AbstractC8199t5.m8807f(parcel, 8, this.f24797t0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
