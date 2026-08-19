package p523V9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.D4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7869D4 extends AbstractC20851a {
    public static final Parcelable.Creator<C7869D4> CREATOR = new C8041a(0);

    /* JADX INFO: renamed from: Y */
    public String f24774Y;

    /* JADX INFO: renamed from: Z */
    public String f24775Z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 2, this.f24774Y);
        AbstractC8199t5.m8807f(parcel, 3, this.f24775Z);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
