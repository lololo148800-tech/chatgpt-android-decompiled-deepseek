package p1060v9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p1009s9.C19501d;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p960q9.C18658l;

/* JADX INFO: renamed from: v9.z */
/* JADX INFO: loaded from: classes.dex */
public final class C20508z extends AbstractC20851a {
    public static final Parcelable.Creator<C20508z> CREATOR = new C18658l(26);

    /* JADX INFO: renamed from: Y */
    public Bundle f65110Y;

    /* JADX INFO: renamed from: Z */
    public C19501d[] f65111Z;

    /* JADX INFO: renamed from: o0 */
    public int f65112o0;

    /* JADX INFO: renamed from: p0 */
    public C20486d f65113p0;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8803b(parcel, 1, this.f65110Y);
        AbstractC8199t5.m8809h(parcel, 2, this.f65111Z, i10);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeInt(this.f65112o0);
        AbstractC8199t5.m8806e(parcel, 4, this.f65113p0, i10);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
