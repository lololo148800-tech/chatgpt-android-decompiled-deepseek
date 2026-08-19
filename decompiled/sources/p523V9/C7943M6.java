package p523V9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.M6 */
/* JADX INFO: loaded from: classes.dex */
public final class C7943M6 extends AbstractC20851a {
    public static final Parcelable.Creator<C7943M6> CREATOR = new C8041a(19);

    /* JADX INFO: renamed from: Y */
    public final String f25172Y;

    /* JADX INFO: renamed from: Z */
    public final String f25173Z;

    public C7943M6(String str, String str2) {
        this.f25172Y = str;
        this.f25173Z = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 1, this.f25172Y);
        AbstractC8199t5.m8807f(parcel, 2, this.f25173Z);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
