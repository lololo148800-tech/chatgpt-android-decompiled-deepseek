package p612Z3;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import p1016t3.C19788o;
import p1016t3.C19799z;
import p1016t3.InterfaceC19752B;
import p531Vj.C8343M;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Z3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10152a implements InterfaceC19752B {
    public static final Parcelable.Creator<C10152a> CREATOR = new C8343M(12);

    /* JADX INFO: renamed from: Y */
    public final int f30081Y;

    /* JADX INFO: renamed from: Z */
    public final String f30082Z;

    public C10152a(int i10, String str) {
        this.f30081Y = i10;
        this.f30082Z = str;
    }

    @Override // p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void mo10752S(C19799z c19799z) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
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
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.f30081Y);
        sb2.append(",url=");
        return AbstractC9306j0.m9891j(this.f30082Z, Separators.RPAREN, sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f30082Z);
        parcel.writeInt(this.f30081Y);
    }
}
