package p1060v9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p960q9.C18658l;

/* JADX INFO: renamed from: v9.d */
/* JADX INFO: loaded from: classes.dex */
public final class C20486d extends AbstractC20851a {
    public static final Parcelable.Creator<C20486d> CREATOR = new C18658l(27);

    /* JADX INFO: renamed from: Y */
    public final C20492j f65032Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f65033Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f65034o0;

    /* JADX INFO: renamed from: p0 */
    public final int[] f65035p0;

    /* JADX INFO: renamed from: q0 */
    public final int f65036q0;

    /* JADX INFO: renamed from: r0 */
    public final int[] f65037r0;

    public C20486d(C20492j c20492j, boolean z6, boolean z10, int[] iArr, int i10, int[] iArr2) {
        this.f65032Y = c20492j;
        this.f65033Z = z6;
        this.f65034o0 = z10;
        this.f65035p0 = iArr;
        this.f65036q0 = i10;
        this.f65037r0 = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8806e(parcel, 1, this.f65032Y, i10);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f65033Z ? 1 : 0);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeInt(this.f65034o0 ? 1 : 0);
        int[] iArr = this.f65035p0;
        if (iArr != null) {
            int iM8811j2 = AbstractC8199t5.m8811j(parcel, 4);
            parcel.writeIntArray(iArr);
            AbstractC8199t5.m8812k(parcel, iM8811j2);
        }
        AbstractC8199t5.m8813l(parcel, 5, 4);
        parcel.writeInt(this.f65036q0);
        int[] iArr2 = this.f65037r0;
        if (iArr2 != null) {
            int iM8811j3 = AbstractC8199t5.m8811j(parcel, 6);
            parcel.writeIntArray(iArr2);
            AbstractC8199t5.m8812k(parcel, iM8811j3);
        }
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
