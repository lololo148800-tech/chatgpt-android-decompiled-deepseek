package p696d4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.OwC.wNrQXvwLiB;
import java.util.Arrays;
import p1073w3.AbstractC20817s;
import p647ak.C10707i0;

/* JADX INFO: renamed from: d4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C13006d extends AbstractC13011i {
    public static final Parcelable.Creator<C13006d> CREATOR = new C10707i0(18);

    /* JADX INFO: renamed from: Z */
    public final String f41269Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f41270o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f41271p0;

    /* JADX INFO: renamed from: q0 */
    public final String[] f41272q0;

    /* JADX INFO: renamed from: r0 */
    public final AbstractC13011i[] f41273r0;

    public C13006d(String str, boolean z6, boolean z10, String[] strArr, AbstractC13011i[] abstractC13011iArr) {
        super(wNrQXvwLiB.HeeBVXlJc);
        this.f41269Z = str;
        this.f41270o0 = z6;
        this.f41271p0 = z10;
        this.f41272q0 = strArr;
        this.f41273r0 = abstractC13011iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13006d.class != obj.getClass()) {
            return false;
        }
        C13006d c13006d = (C13006d) obj;
        return this.f41270o0 == c13006d.f41270o0 && this.f41271p0 == c13006d.f41271p0 && AbstractC20817s.m21400a(this.f41269Z, c13006d.f41269Z) && Arrays.equals(this.f41272q0, c13006d.f41272q0) && Arrays.equals(this.f41273r0, c13006d.f41273r0);
    }

    public final int hashCode() {
        int i10 = (((527 + (this.f41270o0 ? 1 : 0)) * 31) + (this.f41271p0 ? 1 : 0)) * 31;
        String str = this.f41269Z;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f41269Z);
        parcel.writeByte(this.f41270o0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f41271p0 ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f41272q0);
        AbstractC13011i[] abstractC13011iArr = this.f41273r0;
        parcel.writeInt(abstractC13011iArr.length);
        for (AbstractC13011i abstractC13011i : abstractC13011iArr) {
            parcel.writeParcelable(abstractC13011i, 0);
        }
    }

    public C13006d(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i10 = AbstractC20817s.f66106a;
        this.f41269Z = string;
        this.f41270o0 = parcel.readByte() != 0;
        this.f41271p0 = parcel.readByte() != 0;
        this.f41272q0 = parcel.createStringArray();
        int i11 = parcel.readInt();
        this.f41273r0 = new AbstractC13011i[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f41273r0[i12] = (AbstractC13011i) parcel.readParcelable(AbstractC13011i.class.getClassLoader());
        }
    }
}
