package p523V9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.i4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8110i4 extends AbstractC20851a {
    public static final Parcelable.Creator<C8110i4> CREATOR = new C8041a(27);

    /* JADX INFO: renamed from: Y */
    public int f25444Y;

    /* JADX INFO: renamed from: Z */
    public String f25445Z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f25444Y);
        AbstractC8199t5.m8807f(parcel, 3, this.f25445Z);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
