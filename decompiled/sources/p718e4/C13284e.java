package p718e4;

import android.os.Parcel;
import android.os.Parcelable;
import p1016t3.C19788o;
import p1016t3.C19799z;
import p1016t3.InterfaceC19752B;

/* JADX INFO: renamed from: e4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C13284e implements InterfaceC19752B {
    public static final Parcelable.Creator<C13284e> CREATOR = new C13280a(3);

    /* JADX INFO: renamed from: Y */
    public final float f41988Y;

    /* JADX INFO: renamed from: Z */
    public final int f41989Z;

    public C13284e(int i10, float f10) {
        this.f41988Y = f10;
        this.f41989Z = i10;
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
        if (obj == null || C13284e.class != obj.getClass()) {
            return false;
        }
        C13284e c13284e = (C13284e) obj;
        return this.f41988Y == c13284e.f41988Y && this.f41989Z == c13284e.f41989Z;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f41988Y).hashCode() + 527) * 31) + this.f41989Z;
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
        return "smta: captureFrameRate=" + this.f41988Y + ", svcTemporalLayerCount=" + this.f41989Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f41988Y);
        parcel.writeInt(this.f41989Z);
    }

    public C13284e(Parcel parcel) {
        this.f41988Y = parcel.readFloat();
        this.f41989Z = parcel.readInt();
    }
}
