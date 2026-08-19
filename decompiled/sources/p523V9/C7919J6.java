package p523V9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.J6 */
/* JADX INFO: loaded from: classes.dex */
public final class C7919J6 extends AbstractC20851a {
    public static final Parcelable.Creator<C7919J6> CREATOR = new C8041a(15);

    /* JADX INFO: renamed from: Y */
    public final double f25136Y;

    /* JADX INFO: renamed from: Z */
    public final double f25137Z;

    public C7919J6(double d10, double d11) {
        this.f25136Y = d10;
        this.f25137Z = d11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 8);
        parcel.writeDouble(this.f25136Y);
        AbstractC8199t5.m8813l(parcel, 2, 8);
        parcel.writeDouble(this.f25137Z);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
