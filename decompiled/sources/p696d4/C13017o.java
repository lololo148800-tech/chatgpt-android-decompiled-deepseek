package p696d4;

import android.os.Parcel;
import android.os.Parcelable;
import p003A1.AbstractC0168G;
import p1073w3.AbstractC20817s;
import p647ak.C10707i0;

/* JADX INFO: renamed from: d4.o */
/* JADX INFO: loaded from: classes.dex */
public final class C13017o extends AbstractC13011i {
    public static final Parcelable.Creator<C13017o> CREATOR = new C10707i0(25);

    /* JADX INFO: renamed from: Z */
    public final String f41300Z;

    /* JADX INFO: renamed from: o0 */
    public final String f41301o0;

    public C13017o(String str, String str2, String str3) {
        super(str);
        this.f41300Z = str2;
        this.f41301o0 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13017o.class != obj.getClass()) {
            return false;
        }
        C13017o c13017o = (C13017o) obj;
        return this.f41286Y.equals(c13017o.f41286Y) && AbstractC20817s.m21400a(this.f41300Z, c13017o.f41300Z) && AbstractC20817s.m21400a(this.f41301o0, c13017o.f41301o0);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(527, 31, this.f41286Y);
        String str = this.f41300Z;
        int iHashCode = (iM527p + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f41301o0;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p696d4.AbstractC13011i
    public final String toString() {
        return this.f41286Y + ": url=" + this.f41301o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f41286Y);
        parcel.writeString(this.f41300Z);
        parcel.writeString(this.f41301o0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C13017o(Parcel parcel) {
        String string = parcel.readString();
        int i10 = AbstractC20817s.f66106a;
        super(string);
        this.f41300Z = parcel.readString();
        this.f41301o0 = parcel.readString();
    }
}
