package p696d4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1073w3.AbstractC20817s;
import p647ak.C10707i0;

/* JADX INFO: renamed from: d4.l */
/* JADX INFO: loaded from: classes.dex */
public final class C13014l extends AbstractC13011i {
    public static final Parcelable.Creator<C13014l> CREATOR = new C10707i0(22);

    /* JADX INFO: renamed from: Z */
    public final int f41291Z;

    /* JADX INFO: renamed from: o0 */
    public final int f41292o0;

    /* JADX INFO: renamed from: p0 */
    public final int f41293p0;

    /* JADX INFO: renamed from: q0 */
    public final int[] f41294q0;

    /* JADX INFO: renamed from: r0 */
    public final int[] f41295r0;

    public C13014l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f41291Z = i10;
        this.f41292o0 = i11;
        this.f41293p0 = i12;
        this.f41294q0 = iArr;
        this.f41295r0 = iArr2;
    }

    @Override // p696d4.AbstractC13011i, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13014l.class != obj.getClass()) {
            return false;
        }
        C13014l c13014l = (C13014l) obj;
        return this.f41291Z == c13014l.f41291Z && this.f41292o0 == c13014l.f41292o0 && this.f41293p0 == c13014l.f41293p0 && Arrays.equals(this.f41294q0, c13014l.f41294q0) && Arrays.equals(this.f41295r0, c13014l.f41295r0);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f41295r0) + ((Arrays.hashCode(this.f41294q0) + ((((((527 + this.f41291Z) * 31) + this.f41292o0) * 31) + this.f41293p0) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f41291Z);
        parcel.writeInt(this.f41292o0);
        parcel.writeInt(this.f41293p0);
        parcel.writeIntArray(this.f41294q0);
        parcel.writeIntArray(this.f41295r0);
    }

    public C13014l(Parcel parcel) {
        super("MLLT");
        this.f41291Z = parcel.readInt();
        this.f41292o0 = parcel.readInt();
        this.f41293p0 = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i10 = AbstractC20817s.f66106a;
        this.f41294q0 = iArrCreateIntArray;
        this.f41295r0 = parcel.createIntArray();
    }
}
