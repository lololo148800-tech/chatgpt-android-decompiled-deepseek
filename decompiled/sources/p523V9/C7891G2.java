package p523V9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.G2 */
/* JADX INFO: loaded from: classes.dex */
public final class C7891G2 extends AbstractC20851a {
    public static final Parcelable.Creator<C7891G2> CREATOR = new C8041a(24);

    /* JADX INFO: renamed from: Y */
    public int f24825Y;

    /* JADX INFO: renamed from: Z */
    public String f24826Z;

    /* JADX INFO: renamed from: o0 */
    public String f24827o0;

    /* JADX INFO: renamed from: p0 */
    public String f24828p0;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f24825Y);
        AbstractC8199t5.m8807f(parcel, 3, this.f24826Z);
        AbstractC8199t5.m8807f(parcel, 4, this.f24827o0);
        AbstractC8199t5.m8807f(parcel, 5, this.f24828p0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
