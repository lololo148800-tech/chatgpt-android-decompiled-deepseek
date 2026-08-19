package p696d4;

import android.os.Parcel;
import android.os.Parcelable;
import p1073w3.AbstractC20817s;
import p647ak.C10707i0;

/* JADX INFO: renamed from: d4.k */
/* JADX INFO: loaded from: classes.dex */
public final class C13013k extends AbstractC13011i {
    public static final Parcelable.Creator<C13013k> CREATOR = new C10707i0(21);

    /* JADX INFO: renamed from: Z */
    public final String f41288Z;

    /* JADX INFO: renamed from: o0 */
    public final String f41289o0;

    /* JADX INFO: renamed from: p0 */
    public final String f41290p0;

    public C13013k(String str, String str2, String str3) {
        super("----");
        this.f41288Z = str;
        this.f41289o0 = str2;
        this.f41290p0 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13013k.class != obj.getClass()) {
            return false;
        }
        C13013k c13013k = (C13013k) obj;
        return AbstractC20817s.m21400a(this.f41289o0, c13013k.f41289o0) && AbstractC20817s.m21400a(this.f41288Z, c13013k.f41288Z) && AbstractC20817s.m21400a(this.f41290p0, c13013k.f41290p0);
    }

    public final int hashCode() {
        String str = this.f41288Z;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f41289o0;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f41290p0;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p696d4.AbstractC13011i
    public final String toString() {
        return this.f41286Y + ": domain=" + this.f41288Z + ", description=" + this.f41289o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f41286Y);
        parcel.writeString(this.f41288Z);
        parcel.writeString(this.f41290p0);
    }

    public C13013k(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i10 = AbstractC20817s.f66106a;
        this.f41288Z = string;
        this.f41289o0 = parcel.readString();
        this.f41290p0 = parcel.readString();
    }
}
