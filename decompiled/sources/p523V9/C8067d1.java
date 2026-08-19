package p523V9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8067d1 extends AbstractC20851a {
    public static final Parcelable.Creator<C8067d1> CREATOR = new C8041a(16);

    /* JADX INFO: renamed from: Y */
    public String f25377Y;

    /* JADX INFO: renamed from: Z */
    public String f25378Z;

    /* JADX INFO: renamed from: o0 */
    public String f25379o0;

    /* JADX INFO: renamed from: p0 */
    public String f25380p0;

    /* JADX INFO: renamed from: q0 */
    public String f25381q0;

    /* JADX INFO: renamed from: r0 */
    public C7857C0 f25382r0;

    /* JADX INFO: renamed from: s0 */
    public C7857C0 f25383s0;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 2, this.f25377Y);
        AbstractC8199t5.m8807f(parcel, 3, this.f25378Z);
        AbstractC8199t5.m8807f(parcel, 4, this.f25379o0);
        AbstractC8199t5.m8807f(parcel, 5, this.f25380p0);
        AbstractC8199t5.m8807f(parcel, 6, this.f25381q0);
        AbstractC8199t5.m8806e(parcel, 7, this.f25382r0, i10);
        AbstractC8199t5.m8806e(parcel, 8, this.f25383s0, i10);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
