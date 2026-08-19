package p1156zj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p1088wk.C21006a;
import p149Fj.EnumC2883q;

/* JADX INFO: renamed from: zj.W0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22130W0 implements Parcelable {
    public static final Parcelable.Creator<C22130W0> CREATOR = new C21006a(27);

    /* JADX INFO: renamed from: Y */
    public final String f69957Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC22136Z0 f69958Z;

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f69959o0;

    /* JADX INFO: renamed from: p0 */
    public final ArrayList f69960p0;

    /* JADX INFO: renamed from: q0 */
    public final EnumC2883q f69961q0;

    public C22130W0(String idClassKey, EnumC22136Z0 icon, ArrayList arrayList, ArrayList arrayList2, EnumC2883q type) {
        AbstractC16544l.m18094g(idClassKey, "idClassKey");
        AbstractC16544l.m18094g(icon, "icon");
        AbstractC16544l.m18094g(type, "type");
        this.f69957Y = idClassKey;
        this.f69958Z = icon;
        this.f69959o0 = arrayList;
        this.f69960p0 = arrayList2;
        this.f69961q0 = type;
    }

    /* JADX INFO: renamed from: a */
    public final C22124T0 m22373a(EnumC22128V0 side) {
        AbstractC16544l.m18094g(side, "side");
        for (C22124T0 c22124t0 : this.f69959o0) {
            if (c22124t0.f69936Z == side) {
                return c22124t0;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22130W0)) {
            return false;
        }
        C22130W0 c22130w0 = (C22130W0) obj;
        return AbstractC16544l.m18089b(this.f69957Y, c22130w0.f69957Y) && this.f69958Z == c22130w0.f69958Z && this.f69959o0.equals(c22130w0.f69959o0) && this.f69960p0.equals(c22130w0.f69960p0) && this.f69961q0 == c22130w0.f69961q0;
    }

    public final int hashCode() {
        return this.f69961q0.hashCode() + ((this.f69960p0.hashCode() + ((this.f69959o0.hashCode() + ((this.f69958Z.hashCode() + (this.f69957Y.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "IdConfig(idClassKey=" + this.f69957Y + ", icon=" + this.f69958Z + ", sideConfigs=" + this.f69959o0 + ", parts=" + this.f69960p0 + ", type=" + this.f69961q0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f69957Y);
        out.writeString(this.f69958Z.name());
        ArrayList arrayList = this.f69959o0;
        out.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C22124T0) it.next()).writeToParcel(out, i10);
        }
        ArrayList arrayList2 = this.f69960p0;
        out.writeInt(arrayList2.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            out.writeParcelable((Parcelable) it2.next(), i10);
        }
        out.writeString(this.f69961q0.name());
    }
}
