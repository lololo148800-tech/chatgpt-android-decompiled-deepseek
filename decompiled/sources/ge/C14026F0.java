package ge;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p138F8.vJO.anhfj;
import p718e4.C13280a;

/* JADX INFO: renamed from: ge.F0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14026F0 implements Parcelable {
    public static final Parcelable.Creator<C14026F0> CREATOR = new C13280a(10);

    /* JADX INFO: renamed from: Y */
    public final int f44113Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC14097q0 f44114Z;

    public C14026F0(int i10, EnumC14097q0 scrollState) {
        AbstractC16544l.m18094g(scrollState, "scrollState");
        this.f44113Y = i10;
        this.f44114Z = scrollState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14026F0)) {
            return false;
        }
        C14026F0 c14026f0 = (C14026F0) obj;
        return this.f44113Y == c14026f0.f44113Y && this.f44114Z == c14026f0.f44114Z;
    }

    public final int hashCode() {
        return this.f44114Z.hashCode() + (this.f44113Y * 31);
    }

    public final String toString() {
        return "█";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        AbstractC16544l.m18094g(parcel, anhfj.wGsGc);
        parcel.writeInt(this.f44113Y);
        parcel.writeString(this.f44114Z.name());
    }
}
