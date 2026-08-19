package p657b4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p003A1.AbstractC0168G;
import p1016t3.AbstractC19754D;
import p1016t3.C19788o;
import p1016t3.C19799z;
import p1016t3.InterfaceC19752B;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p644ab.AbstractC10531d;
import p647ak.C10707i0;

/* JADX INFO: renamed from: b4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11228a implements InterfaceC19752B {
    public static final Parcelable.Creator<C11228a> CREATOR = new C10707i0(1);

    /* JADX INFO: renamed from: Y */
    public final int f33983Y;

    /* JADX INFO: renamed from: Z */
    public final String f33984Z;

    /* JADX INFO: renamed from: o0 */
    public final String f33985o0;

    /* JADX INFO: renamed from: p0 */
    public final int f33986p0;

    /* JADX INFO: renamed from: q0 */
    public final int f33987q0;

    /* JADX INFO: renamed from: r0 */
    public final int f33988r0;

    /* JADX INFO: renamed from: s0 */
    public final int f33989s0;

    /* JADX INFO: renamed from: t0 */
    public final byte[] f33990t0;

    public C11228a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f33983Y = i10;
        this.f33984Z = str;
        this.f33985o0 = str2;
        this.f33986p0 = i11;
        this.f33987q0 = i12;
        this.f33988r0 = i13;
        this.f33989s0 = i14;
        this.f33990t0 = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static C11228a m12483a(C20811m c20811m) {
        int iM21352g = c20811m.m21352g();
        String strM20711i = AbstractC19754D.m20711i(c20811m.m21363r(c20811m.m21352g(), AbstractC10531d.f31240a));
        String strM21363r = c20811m.m21363r(c20811m.m21352g(), AbstractC10531d.f31242c);
        int iM21352g2 = c20811m.m21352g();
        int iM21352g3 = c20811m.m21352g();
        int iM21352g4 = c20811m.m21352g();
        int iM21352g5 = c20811m.m21352g();
        int iM21352g6 = c20811m.m21352g();
        byte[] bArr = new byte[iM21352g6];
        c20811m.m21350e(bArr, 0, iM21352g6);
        return new C11228a(iM21352g, strM20711i, strM21363r, iM21352g2, iM21352g3, iM21352g4, iM21352g5, bArr);
    }

    @Override // p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: S */
    public final void mo10752S(C19799z c19799z) {
        c19799z.m20755a(this.f33983Y, this.f33990t0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11228a.class != obj.getClass()) {
            return false;
        }
        C11228a c11228a = (C11228a) obj;
        return this.f33983Y == c11228a.f33983Y && this.f33984Z.equals(c11228a.f33984Z) && this.f33985o0.equals(c11228a.f33985o0) && this.f33986p0 == c11228a.f33986p0 && this.f33987q0 == c11228a.f33987q0 && this.f33988r0 == c11228a.f33988r0 && this.f33989s0 == c11228a.f33989s0 && Arrays.equals(this.f33990t0, c11228a.f33990t0);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f33990t0) + ((((((((AbstractC0168G.m527p(AbstractC0168G.m527p((527 + this.f33983Y) * 31, 31, this.f33984Z), 31, this.f33985o0) + this.f33986p0) * 31) + this.f33987q0) * 31) + this.f33988r0) * 31) + this.f33989s0) * 31);
    }

    @Override // p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C19788o mo10753k() {
        return null;
    }

    @Override // p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ byte[] mo10754r0() {
        return null;
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f33984Z + ", description=" + this.f33985o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f33983Y);
        parcel.writeString(this.f33984Z);
        parcel.writeString(this.f33985o0);
        parcel.writeInt(this.f33986p0);
        parcel.writeInt(this.f33987q0);
        parcel.writeInt(this.f33988r0);
        parcel.writeInt(this.f33989s0);
        parcel.writeByteArray(this.f33990t0);
    }

    public C11228a(Parcel parcel) {
        this.f33983Y = parcel.readInt();
        String string = parcel.readString();
        int i10 = AbstractC20817s.f66106a;
        this.f33984Z = string;
        this.f33985o0 = parcel.readString();
        this.f33986p0 = parcel.readInt();
        this.f33987q0 = parcel.readInt();
        this.f33988r0 = parcel.readInt();
        this.f33989s0 = parcel.readInt();
        this.f33990t0 = parcel.createByteArray();
    }
}
