package p696d4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1073w3.AbstractC20817s;
import p647ak.C10707i0;

/* JADX INFO: renamed from: d4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C13008f extends AbstractC13011i {
    public static final Parcelable.Creator<C13008f> CREATOR = new C10707i0(20);

    /* JADX INFO: renamed from: Z */
    public final String f41277Z;

    /* JADX INFO: renamed from: o0 */
    public final String f41278o0;

    /* JADX INFO: renamed from: p0 */
    public final String f41279p0;

    /* JADX INFO: renamed from: q0 */
    public final byte[] f41280q0;

    public C13008f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f41277Z = str;
        this.f41278o0 = str2;
        this.f41279p0 = str3;
        this.f41280q0 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13008f.class != obj.getClass()) {
            return false;
        }
        C13008f c13008f = (C13008f) obj;
        return AbstractC20817s.m21400a(this.f41277Z, c13008f.f41277Z) && AbstractC20817s.m21400a(this.f41278o0, c13008f.f41278o0) && AbstractC20817s.m21400a(this.f41279p0, c13008f.f41279p0) && Arrays.equals(this.f41280q0, c13008f.f41280q0);
    }

    public final int hashCode() {
        String str = this.f41277Z;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f41278o0;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f41279p0;
        return Arrays.hashCode(this.f41280q0) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // p696d4.AbstractC13011i
    public final String toString() {
        return this.f41286Y + ": mimeType=" + this.f41277Z + ", filename=" + this.f41278o0 + ", description=" + this.f41279p0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f41277Z);
        parcel.writeString(this.f41278o0);
        parcel.writeString(this.f41279p0);
        parcel.writeByteArray(this.f41280q0);
    }

    public C13008f(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i10 = AbstractC20817s.f66106a;
        this.f41277Z = string;
        this.f41278o0 = parcel.readString();
        this.f41279p0 = parcel.readString();
        this.f41280q0 = parcel.createByteArray();
    }
}
