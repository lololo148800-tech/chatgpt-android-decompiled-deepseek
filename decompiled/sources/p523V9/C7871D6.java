package p523V9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.D6 */
/* JADX INFO: loaded from: classes.dex */
public final class C7871D6 extends AbstractC20851a {
    public static final Parcelable.Creator<C7871D6> CREATOR = new C8041a(7);

    /* JADX INFO: renamed from: Y */
    public final int f24777Y;

    /* JADX INFO: renamed from: Z */
    public final String[] f24778Z;

    public C7871D6(int i10, String[] strArr) {
        this.f24777Y = i10;
        this.f24778Z = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f24777Y);
        AbstractC8199t5.m8808g(parcel, 2, this.f24778Z);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
