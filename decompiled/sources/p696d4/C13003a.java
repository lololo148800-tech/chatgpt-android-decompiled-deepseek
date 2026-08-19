package p696d4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1016t3.C19799z;
import p1073w3.AbstractC20817s;
import p647ak.C10707i0;

/* JADX INFO: renamed from: d4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13003a extends AbstractC13011i {
    public static final Parcelable.Creator<C13003a> CREATOR = new C10707i0(15);

    /* JADX INFO: renamed from: Z */
    public final String f41258Z;

    /* JADX INFO: renamed from: o0 */
    public final String f41259o0;

    /* JADX INFO: renamed from: p0 */
    public final int f41260p0;

    /* JADX INFO: renamed from: q0 */
    public final byte[] f41261q0;

    public C13003a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f41258Z = str;
        this.f41259o0 = str2;
        this.f41260p0 = i10;
        this.f41261q0 = bArr;
    }

    @Override // p696d4.AbstractC13011i, p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: S */
    public final void mo10752S(C19799z c19799z) {
        c19799z.m20755a(this.f41260p0, this.f41261q0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13003a.class != obj.getClass()) {
            return false;
        }
        C13003a c13003a = (C13003a) obj;
        return this.f41260p0 == c13003a.f41260p0 && AbstractC20817s.m21400a(this.f41258Z, c13003a.f41258Z) && AbstractC20817s.m21400a(this.f41259o0, c13003a.f41259o0) && Arrays.equals(this.f41261q0, c13003a.f41261q0);
    }

    public final int hashCode() {
        int i10 = (527 + this.f41260p0) * 31;
        String str = this.f41258Z;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f41259o0;
        return Arrays.hashCode(this.f41261q0) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // p696d4.AbstractC13011i
    public final String toString() {
        return this.f41286Y + ": mimeType=" + this.f41258Z + ", description=" + this.f41259o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f41258Z);
        parcel.writeString(this.f41259o0);
        parcel.writeInt(this.f41260p0);
        parcel.writeByteArray(this.f41261q0);
    }

    public C13003a(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i10 = AbstractC20817s.f66106a;
        this.f41258Z = string;
        this.f41259o0 = parcel.readString();
        this.f41260p0 = parcel.readInt();
        this.f41261q0 = parcel.createByteArray();
    }
}
