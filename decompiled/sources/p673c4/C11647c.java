package p673c4;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1016t3.C19788o;
import p1016t3.C19799z;
import p1016t3.InterfaceC19752B;
import p647ak.C10707i0;

/* JADX INFO: renamed from: c4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C11647c implements InterfaceC19752B {
    public static final Parcelable.Creator<C11647c> CREATOR = new C10707i0(9);

    /* JADX INFO: renamed from: Y */
    public final byte[] f35283Y;

    /* JADX INFO: renamed from: Z */
    public final String f35284Z;

    /* JADX INFO: renamed from: o0 */
    public final String f35285o0;

    public C11647c(String str, String str2, byte[] bArr) {
        this.f35283Y = bArr;
        this.f35284Z = str;
        this.f35285o0 = str2;
    }

    @Override // p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: S */
    public final void mo10752S(C19799z c19799z) {
        String str = this.f35284Z;
        if (str != null) {
            c19799z.f62793a = str;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11647c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f35283Y, ((C11647c) obj).f35283Y);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f35283Y);
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
        return "ICY: title=\"" + this.f35284Z + "\", url=\"" + this.f35285o0 + "\", rawMetadata.length=\"" + this.f35283Y.length + Separators.DOUBLE_QUOTE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f35283Y);
        parcel.writeString(this.f35284Z);
        parcel.writeString(this.f35285o0);
    }

    public C11647c(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.f35283Y = bArrCreateByteArray;
        this.f35284Z = parcel.readString();
        this.f35285o0 = parcel.readString();
    }
}
