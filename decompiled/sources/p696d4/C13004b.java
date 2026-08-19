package p696d4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p003A1.AbstractC0168G;
import p1073w3.AbstractC20817s;
import p647ak.C10707i0;

/* JADX INFO: renamed from: d4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13004b extends AbstractC13011i {
    public static final Parcelable.Creator<C13004b> CREATOR = new C10707i0(16);

    /* JADX INFO: renamed from: Z */
    public final byte[] f41262Z;

    public C13004b(String str, byte[] bArr) {
        super(str);
        this.f41262Z = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13004b.class != obj.getClass()) {
            return false;
        }
        C13004b c13004b = (C13004b) obj;
        return this.f41286Y.equals(c13004b.f41286Y) && Arrays.equals(this.f41262Z, c13004b.f41262Z);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f41262Z) + AbstractC0168G.m527p(527, 31, this.f41286Y);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f41286Y);
        parcel.writeByteArray(this.f41262Z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C13004b(Parcel parcel) {
        String string = parcel.readString();
        int i10 = AbstractC20817s.f66106a;
        super(string);
        this.f41262Z = parcel.createByteArray();
    }
}
