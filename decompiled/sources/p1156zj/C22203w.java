package p1156zj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p1088wk.C21006a;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: zj.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C22203w implements Parcelable {
    public static final Parcelable.Creator<C22203w> CREATOR = new C21006a(10);

    /* JADX INFO: renamed from: Y */
    public final EnumC22136Z0 f70389Y;

    /* JADX INFO: renamed from: Z */
    public final C22130W0 f70390Z;

    /* JADX INFO: renamed from: o0 */
    public final String f70391o0;

    public C22203w(EnumC22136Z0 icon, C22130W0 idConfig, String name) {
        AbstractC16544l.m18094g(icon, "icon");
        AbstractC16544l.m18094g(idConfig, "idConfig");
        AbstractC16544l.m18094g(name, "name");
        this.f70389Y = icon;
        this.f70390Z = idConfig;
        this.f70391o0 = name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22203w)) {
            return false;
        }
        C22203w c22203w = (C22203w) obj;
        return this.f70389Y == c22203w.f70389Y && AbstractC16544l.m18089b(this.f70390Z, c22203w.f70390Z) && AbstractC16544l.m18089b(this.f70391o0, c22203w.f70391o0);
    }

    public final int hashCode() {
        return this.f70391o0.hashCode() + ((this.f70390Z.hashCode() + (this.f70389Y.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EnabledIdClass(icon=");
        sb2.append(this.f70389Y);
        sb2.append(", idConfig=");
        sb2.append(this.f70390Z);
        sb2.append(", name=");
        return AbstractC9306j0.m9891j(this.f70391o0, Separators.RPAREN, sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f70389Y.name());
        this.f70390Z.writeToParcel(out, i10);
        out.writeString(this.f70391o0);
    }
}
