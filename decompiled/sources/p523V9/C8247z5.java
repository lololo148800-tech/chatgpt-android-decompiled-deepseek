package p523V9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.z5 */
/* JADX INFO: loaded from: classes.dex */
public final class C8247z5 extends AbstractC20851a {
    public static final Parcelable.Creator<C8247z5> CREATOR = new C8041a(2);

    /* JADX INFO: renamed from: Y */
    public String f25728Y;

    /* JADX INFO: renamed from: Z */
    public String f25729Z;

    /* JADX INFO: renamed from: o0 */
    public int f25730o0;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 2, this.f25728Y);
        AbstractC8199t5.m8807f(parcel, 3, this.f25729Z);
        AbstractC8199t5.m8813l(parcel, 4, 4);
        parcel.writeInt(this.f25730o0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
