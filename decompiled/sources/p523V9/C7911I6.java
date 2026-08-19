package p523V9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.I6 */
/* JADX INFO: loaded from: classes.dex */
public final class C7911I6 extends AbstractC20851a {
    public static final Parcelable.Creator<C7911I6> CREATOR = new C8041a(14);

    /* JADX INFO: renamed from: Y */
    public final int f25118Y;

    /* JADX INFO: renamed from: Z */
    public final String f25119Z;

    /* JADX INFO: renamed from: o0 */
    public final String f25120o0;

    /* JADX INFO: renamed from: p0 */
    public final String f25121p0;

    public C7911I6(int i10, String str, String str2, String str3) {
        this.f25118Y = i10;
        this.f25119Z = str;
        this.f25120o0 = str2;
        this.f25121p0 = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f25118Y);
        AbstractC8199t5.m8807f(parcel, 2, this.f25119Z);
        AbstractC8199t5.m8807f(parcel, 3, this.f25120o0);
        AbstractC8199t5.m8807f(parcel, 4, this.f25121p0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
