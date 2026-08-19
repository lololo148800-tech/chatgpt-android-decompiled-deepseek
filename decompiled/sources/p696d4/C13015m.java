package p696d4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1073w3.AbstractC20817s;
import p647ak.C10707i0;

/* JADX INFO: renamed from: d4.m */
/* JADX INFO: loaded from: classes.dex */
public final class C13015m extends AbstractC13011i {
    public static final Parcelable.Creator<C13015m> CREATOR = new C10707i0(23);

    /* JADX INFO: renamed from: Z */
    public final String f41296Z;

    /* JADX INFO: renamed from: o0 */
    public final byte[] f41297o0;

    public C13015m(String str, byte[] bArr) {
        super("PRIV");
        this.f41296Z = str;
        this.f41297o0 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13015m.class != obj.getClass()) {
            return false;
        }
        C13015m c13015m = (C13015m) obj;
        return AbstractC20817s.m21400a(this.f41296Z, c13015m.f41296Z) && Arrays.equals(this.f41297o0, c13015m.f41297o0);
    }

    public final int hashCode() {
        String str = this.f41296Z;
        return Arrays.hashCode(this.f41297o0) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p696d4.AbstractC13011i
    public final String toString() {
        return this.f41286Y + ": owner=" + this.f41296Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f41296Z);
        parcel.writeByteArray(this.f41297o0);
    }

    public C13015m(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i10 = AbstractC20817s.f66106a;
        this.f41296Z = string;
        this.f41297o0 = parcel.createByteArray();
    }
}
