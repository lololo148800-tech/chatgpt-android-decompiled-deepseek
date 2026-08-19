package p1097x3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p003A1.AbstractC0168G;
import p1016t3.C19788o;
import p1016t3.C19799z;
import p1016t3.InterfaceC19752B;
import p1073w3.AbstractC20817s;
import p1088wk.C21006a;
import p523V9.AbstractC8135l5;

/* JADX INFO: renamed from: x3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21115a implements InterfaceC19752B {
    public static final Parcelable.Creator<C21115a> CREATOR = new C21006a(1);

    /* JADX INFO: renamed from: Y */
    public final String f67069Y;

    /* JADX INFO: renamed from: Z */
    public final byte[] f67070Z;

    /* JADX INFO: renamed from: o0 */
    public final int f67071o0;

    /* JADX INFO: renamed from: p0 */
    public final int f67072p0;

    public C21115a(String str, byte[] bArr, int i10, int i11) {
        this.f67069Y = str;
        this.f67070Z = bArr;
        this.f67071o0 = i10;
        this.f67072p0 = i11;
    }

    @Override // p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void mo10752S(C19799z c19799z) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21115a.class != obj.getClass()) {
            return false;
        }
        C21115a c21115a = (C21115a) obj;
        return this.f67069Y.equals(c21115a.f67069Y) && Arrays.equals(this.f67070Z, c21115a.f67070Z) && this.f67071o0 == c21115a.f67071o0 && this.f67072p0 == c21115a.f67072p0;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f67070Z) + AbstractC0168G.m527p(527, 31, this.f67069Y)) * 31) + this.f67071o0) * 31) + this.f67072p0;
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
        String strM21412m;
        byte[] bArr = this.f67070Z;
        int i10 = this.f67072p0;
        if (i10 == 1) {
            strM21412m = AbstractC20817s.m21412m(bArr);
        } else if (i10 == 23) {
            strM21412m = String.valueOf(Float.intBitsToFloat(AbstractC8135l5.m8656d(bArr)));
        } else if (i10 != 67) {
            int i11 = AbstractC20817s.f66106a;
            StringBuilder sb2 = new StringBuilder(bArr.length * 2);
            for (int i12 = 0; i12 < bArr.length; i12++) {
                sb2.append(Character.forDigit((bArr[i12] >> 4) & 15, 16));
                sb2.append(Character.forDigit(bArr[i12] & 15, 16));
            }
            strM21412m = sb2.toString();
        } else {
            strM21412m = String.valueOf(AbstractC8135l5.m8656d(bArr));
        }
        return "mdta: key=" + this.f67069Y + ", value=" + strM21412m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f67069Y);
        parcel.writeByteArray(this.f67070Z);
        parcel.writeInt(this.f67071o0);
        parcel.writeInt(this.f67072p0);
    }

    public C21115a(Parcel parcel) {
        String string = parcel.readString();
        int i10 = AbstractC20817s.f66106a;
        this.f67069Y = string;
        this.f67070Z = parcel.createByteArray();
        this.f67071o0 = parcel.readInt();
        this.f67072p0 = parcel.readInt();
    }
}
