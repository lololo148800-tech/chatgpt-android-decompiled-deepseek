package p523V9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.O6 */
/* JADX INFO: loaded from: classes.dex */
public final class C7959O6 extends AbstractC20851a {
    public static final Parcelable.Creator<C7959O6> CREATOR = new C8041a(21);

    /* JADX INFO: renamed from: Y */
    public final String f25198Y;

    /* JADX INFO: renamed from: Z */
    public final String f25199Z;

    /* JADX INFO: renamed from: o0 */
    public final int f25200o0;

    public C7959O6(int i10, String str, String str2) {
        this.f25198Y = str;
        this.f25199Z = str2;
        this.f25200o0 = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 1, this.f25198Y);
        AbstractC8199t5.m8807f(parcel, 2, this.f25199Z);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeInt(this.f25200o0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
