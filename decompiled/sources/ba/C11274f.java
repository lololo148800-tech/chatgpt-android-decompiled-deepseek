package ba;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p647ak.C10707i0;

/* JADX INFO: renamed from: ba.f */
/* JADX INFO: loaded from: classes.dex */
public final class C11274f extends AbstractC20851a {
    public static final Parcelable.Creator<C11274f> CREATOR = new C10707i0(7);

    /* JADX INFO: renamed from: Y */
    public final boolean f34149Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f34150Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f34151o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f34152p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f34153q0;

    /* JADX INFO: renamed from: r0 */
    public final boolean f34154r0;

    public C11274f(boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f34149Y = z6;
        this.f34150Z = z10;
        this.f34151o0 = z11;
        this.f34152p0 = z12;
        this.f34153q0 = z13;
        this.f34154r0 = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f34149Y ? 1 : 0);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f34150Z ? 1 : 0);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeInt(this.f34151o0 ? 1 : 0);
        AbstractC8199t5.m8813l(parcel, 4, 4);
        parcel.writeInt(this.f34152p0 ? 1 : 0);
        AbstractC8199t5.m8813l(parcel, 5, 4);
        parcel.writeInt(this.f34153q0 ? 1 : 0);
        AbstractC8199t5.m8813l(parcel, 6, 4);
        parcel.writeInt(this.f34154r0 ? 1 : 0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
