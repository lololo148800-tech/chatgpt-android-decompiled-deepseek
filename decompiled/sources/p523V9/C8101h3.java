package p523V9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.h3 */
/* JADX INFO: loaded from: classes.dex */
public final class C8101h3 extends AbstractC20851a {
    public static final Parcelable.Creator<C8101h3> CREATOR = new C8041a(25);

    /* JADX INFO: renamed from: Y */
    public double f25437Y;

    /* JADX INFO: renamed from: Z */
    public double f25438Z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 2, 8);
        parcel.writeDouble(this.f25437Y);
        AbstractC8199t5.m8813l(parcel, 3, 8);
        parcel.writeDouble(this.f25438Z);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
