package p523V9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.L6 */
/* JADX INFO: loaded from: classes.dex */
public final class C7935L6 extends AbstractC20851a {
    public static final Parcelable.Creator<C7935L6> CREATOR = new C8041a(18);

    /* JADX INFO: renamed from: Y */
    public final int f25160Y;

    /* JADX INFO: renamed from: Z */
    public final String f25161Z;

    public C7935L6(int i10, String str) {
        this.f25160Y = i10;
        this.f25161Z = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f25160Y);
        AbstractC8199t5.m8807f(parcel, 2, this.f25161Z);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
