package p696d4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1073w3.AbstractC20817s;
import p647ak.C10707i0;

/* JADX INFO: renamed from: d4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C13005c extends AbstractC13011i {
    public static final Parcelable.Creator<C13005c> CREATOR = new C10707i0(17);

    /* JADX INFO: renamed from: Z */
    public final String f41263Z;

    /* JADX INFO: renamed from: o0 */
    public final int f41264o0;

    /* JADX INFO: renamed from: p0 */
    public final int f41265p0;

    /* JADX INFO: renamed from: q0 */
    public final long f41266q0;

    /* JADX INFO: renamed from: r0 */
    public final long f41267r0;

    /* JADX INFO: renamed from: s0 */
    public final AbstractC13011i[] f41268s0;

    public C13005c(String str, int i10, int i11, long j10, long j11, AbstractC13011i[] abstractC13011iArr) {
        super("CHAP");
        this.f41263Z = str;
        this.f41264o0 = i10;
        this.f41265p0 = i11;
        this.f41266q0 = j10;
        this.f41267r0 = j11;
        this.f41268s0 = abstractC13011iArr;
    }

    @Override // p696d4.AbstractC13011i, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13005c.class != obj.getClass()) {
            return false;
        }
        C13005c c13005c = (C13005c) obj;
        return this.f41264o0 == c13005c.f41264o0 && this.f41265p0 == c13005c.f41265p0 && this.f41266q0 == c13005c.f41266q0 && this.f41267r0 == c13005c.f41267r0 && AbstractC20817s.m21400a(this.f41263Z, c13005c.f41263Z) && Arrays.equals(this.f41268s0, c13005c.f41268s0);
    }

    public final int hashCode() {
        int i10 = (((((((527 + this.f41264o0) * 31) + this.f41265p0) * 31) + ((int) this.f41266q0)) * 31) + ((int) this.f41267r0)) * 31;
        String str = this.f41263Z;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f41263Z);
        parcel.writeInt(this.f41264o0);
        parcel.writeInt(this.f41265p0);
        parcel.writeLong(this.f41266q0);
        parcel.writeLong(this.f41267r0);
        AbstractC13011i[] abstractC13011iArr = this.f41268s0;
        parcel.writeInt(abstractC13011iArr.length);
        for (AbstractC13011i abstractC13011i : abstractC13011iArr) {
            parcel.writeParcelable(abstractC13011i, 0);
        }
    }

    public C13005c(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i10 = AbstractC20817s.f66106a;
        this.f41263Z = string;
        this.f41264o0 = parcel.readInt();
        this.f41265p0 = parcel.readInt();
        this.f41266q0 = parcel.readLong();
        this.f41267r0 = parcel.readLong();
        int i11 = parcel.readInt();
        this.f41268s0 = new AbstractC13011i[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f41268s0[i12] = (AbstractC13011i) parcel.readParcelable(AbstractC13011i.class.getClassLoader());
        }
    }
}
