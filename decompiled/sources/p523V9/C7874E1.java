package p523V9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.E1 */
/* JADX INFO: loaded from: classes.dex */
public final class C7874E1 extends AbstractC20851a {
    public static final Parcelable.Creator<C7874E1> CREATOR = new C8041a(22);

    /* JADX INFO: renamed from: Y */
    public C7908I3 f24780Y;

    /* JADX INFO: renamed from: Z */
    public String f24781Z;

    /* JADX INFO: renamed from: o0 */
    public String f24782o0;

    /* JADX INFO: renamed from: p0 */
    public C8110i4[] f24783p0;

    /* JADX INFO: renamed from: q0 */
    public C7891G2[] f24784q0;

    /* JADX INFO: renamed from: r0 */
    public String[] f24785r0;

    /* JADX INFO: renamed from: s0 */
    public C8066d0[] f24786s0;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8806e(parcel, 2, this.f24780Y, i10);
        AbstractC8199t5.m8807f(parcel, 3, this.f24781Z);
        AbstractC8199t5.m8807f(parcel, 4, this.f24782o0);
        AbstractC8199t5.m8809h(parcel, 5, this.f24783p0, i10);
        AbstractC8199t5.m8809h(parcel, 6, this.f24784q0, i10);
        AbstractC8199t5.m8808g(parcel, 7, this.f24785r0);
        AbstractC8199t5.m8809h(parcel, 8, this.f24786s0, i10);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
