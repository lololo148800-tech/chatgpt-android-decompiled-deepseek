package p531Vj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Vj.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8365e0 implements Parcelable {
    public static final Parcelable.Creator<C8365e0> CREATOR = new C8343M(6);

    /* JADX INFO: renamed from: Y */
    public final EnumC8334D f26058Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC8363d0 f26059Z;

    public C8365e0(EnumC8334D permission, EnumC8363d0 result) {
        AbstractC16544l.m18094g(permission, "permission");
        AbstractC16544l.m18094g(result, "result");
        this.f26058Y = permission;
        this.f26059Z = result;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8365e0)) {
            return false;
        }
        C8365e0 c8365e0 = (C8365e0) obj;
        return this.f26058Y == c8365e0.f26058Y && this.f26059Z == c8365e0.f26059Z;
    }

    public final int hashCode() {
        return this.f26059Z.hashCode() + (this.f26058Y.hashCode() * 31);
    }

    public final String toString() {
        return "PermissionState(permission=" + this.f26058Y + ", result=" + this.f26059Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f26058Y.name());
        out.writeString(this.f26059Z.name());
    }
}
