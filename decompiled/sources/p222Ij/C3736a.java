package p222Ij;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p125Ej.C2566j;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Ij.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C3736a implements InterfaceC3738c {
    public static final Parcelable.Creator<C3736a> CREATOR = new C2566j(10);

    /* JADX INFO: renamed from: Y */
    public final String f11382Y;

    /* JADX INFO: renamed from: Z */
    public final String f11383Z;

    public C3736a(String name, String path) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(path, "path");
        this.f11382Y = name;
        this.f11383Z = path;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3736a)) {
            return false;
        }
        C3736a c3736a = (C3736a) obj;
        return AbstractC16544l.m18089b(this.f11382Y, c3736a.f11382Y) && AbstractC16544l.m18089b(this.f11383Z, c3736a.f11383Z);
    }

    public final int hashCode() {
        return this.f11383Z.hashCode() + (this.f11382Y.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PageChange(name=");
        sb2.append(this.f11382Y);
        sb2.append(", path=");
        return AbstractC9306j0.m9891j(this.f11383Z, Separators.RPAREN, sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f11382Y);
        out.writeString(this.f11383Z);
    }
}
