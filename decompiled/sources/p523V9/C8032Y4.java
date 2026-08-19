package p523V9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.Y4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8032Y4 extends AbstractC20851a {
    public static final Parcelable.Creator<C8032Y4> CREATOR = new C8041a(1);

    /* JADX INFO: renamed from: Y */
    public String f25346Y;

    /* JADX INFO: renamed from: Z */
    public String f25347Z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 2, this.f25346Y);
        AbstractC8199t5.m8807f(parcel, 3, this.f25347Z);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
