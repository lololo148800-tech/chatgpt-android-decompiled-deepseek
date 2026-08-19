package p523V9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.N6 */
/* JADX INFO: loaded from: classes.dex */
public final class C7951N6 extends AbstractC20851a {
    public static final Parcelable.Creator<C7951N6> CREATOR = new C8041a(20);

    /* JADX INFO: renamed from: Y */
    public final String f25183Y;

    /* JADX INFO: renamed from: Z */
    public final String f25184Z;

    public C7951N6(String str, String str2) {
        this.f25183Y = str;
        this.f25184Z = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 1, this.f25183Y);
        AbstractC8199t5.m8807f(parcel, 2, this.f25184Z);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
