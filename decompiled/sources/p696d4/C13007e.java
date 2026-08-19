package p696d4;

import android.os.Parcel;
import android.os.Parcelable;
import p1073w3.AbstractC20817s;
import p647ak.C10707i0;

/* JADX INFO: renamed from: d4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C13007e extends AbstractC13011i {
    public static final Parcelable.Creator<C13007e> CREATOR = new C10707i0(19);

    /* JADX INFO: renamed from: Z */
    public final String f41274Z;

    /* JADX INFO: renamed from: o0 */
    public final String f41275o0;

    /* JADX INFO: renamed from: p0 */
    public final String f41276p0;

    public C13007e(String str, String str2, String str3) {
        super("COMM");
        this.f41274Z = str;
        this.f41275o0 = str2;
        this.f41276p0 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13007e.class != obj.getClass()) {
            return false;
        }
        C13007e c13007e = (C13007e) obj;
        return AbstractC20817s.m21400a(this.f41275o0, c13007e.f41275o0) && AbstractC20817s.m21400a(this.f41274Z, c13007e.f41274Z) && AbstractC20817s.m21400a(this.f41276p0, c13007e.f41276p0);
    }

    public final int hashCode() {
        String str = this.f41274Z;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f41275o0;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f41276p0;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p696d4.AbstractC13011i
    public final String toString() {
        return this.f41286Y + ": language=" + this.f41274Z + ", description=" + this.f41275o0 + ", text=" + this.f41276p0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f41286Y);
        parcel.writeString(this.f41274Z);
        parcel.writeString(this.f41276p0);
    }

    public C13007e(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i10 = AbstractC20817s.f66106a;
        this.f41274Z = string;
        this.f41275o0 = parcel.readString();
        this.f41276p0 = parcel.readString();
    }
}
