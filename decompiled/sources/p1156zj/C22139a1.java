package p1156zj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: zj.a1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22139a1 implements Parcelable {
    public static final Parcelable.Creator<C22139a1> CREATOR = new C22132X0(1);

    /* JADX INFO: renamed from: Y */
    public final EnumC22128V0 f69986Y;

    public C22139a1(EnumC22128V0 side) {
        AbstractC16544l.m18094g(side, "side");
        this.f69986Y = side;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22139a1) && this.f69986Y == ((C22139a1) obj).f69986Y;
    }

    public final int hashCode() {
        return this.f69986Y.hashCode();
    }

    public final String toString() {
        return "SideIdPart(side=" + this.f69986Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f69986Y.name());
    }
}
