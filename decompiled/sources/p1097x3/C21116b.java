package p1097x3;

import android.os.Parcel;
import android.os.Parcelable;
import p1016t3.C19788o;
import p1016t3.C19799z;
import p1016t3.InterfaceC19752B;
import p1073w3.AbstractC20800b;
import p1088wk.C21006a;

/* JADX INFO: renamed from: x3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C21116b implements InterfaceC19752B {
    public static final Parcelable.Creator<C21116b> CREATOR = new C21006a(2);

    /* JADX INFO: renamed from: Y */
    public final float f67073Y;

    /* JADX INFO: renamed from: Z */
    public final float f67074Z;

    public C21116b(float f10, float f11) {
        AbstractC20800b.m21315c("Invalid latitude or longitude", f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f);
        this.f67073Y = f10;
        this.f67074Z = f11;
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
        if (obj == null || C21116b.class != obj.getClass()) {
            return false;
        }
        C21116b c21116b = (C21116b) obj;
        return this.f67073Y == c21116b.f67073Y && this.f67074Z == c21116b.f67074Z;
    }

    public final int hashCode() {
        return Float.valueOf(this.f67074Z).hashCode() + ((Float.valueOf(this.f67073Y).hashCode() + 527) * 31);
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
        return "xyz: latitude=" + this.f67073Y + ", longitude=" + this.f67074Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f67073Y);
        parcel.writeFloat(this.f67074Z);
    }

    public C21116b(Parcel parcel) {
        this.f67073Y = parcel.readFloat();
        this.f67074Z = parcel.readFloat();
    }
}
