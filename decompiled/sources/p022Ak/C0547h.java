package p022Ak;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;

/* JADX INFO: renamed from: Ak.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C0547h implements Parcelable {
    public static final Parcelable.Creator<C0547h> CREATOR = new C0516a(5);

    /* JADX INFO: renamed from: Y */
    public final String f1744Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC0546g f1745Z;

    /* JADX INFO: renamed from: o0 */
    public final EnumC0544e f1746o0;

    /* JADX INFO: renamed from: p0 */
    public final ArrayList f1747p0;

    public C0547h(String idClass, EnumC0546g side, EnumC0544e captureMethod, ArrayList arrayList) {
        AbstractC16544l.m18094g(idClass, "idClass");
        AbstractC16544l.m18094g(side, "side");
        AbstractC16544l.m18094g(captureMethod, "captureMethod");
        this.f1744Y = idClass;
        this.f1745Z = side;
        this.f1746o0 = captureMethod;
        this.f1747p0 = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0547h)) {
            return false;
        }
        C0547h c0547h = (C0547h) obj;
        return AbstractC16544l.m18089b(this.f1744Y, c0547h.f1744Y) && this.f1745Z == c0547h.f1745Z && this.f1746o0 == c0547h.f1746o0 && this.f1747p0.equals(c0547h.f1747p0);
    }

    public final int hashCode() {
        return this.f1747p0.hashCode() + ((this.f1746o0.hashCode() + ((this.f1745Z.hashCode() + (this.f1744Y.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GovernmentIdCapture(idClass=" + this.f1744Y + ", side=" + this.f1745Z + ", captureMethod=" + this.f1746o0 + ", frames=" + this.f1747p0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f1744Y);
        out.writeString(this.f1745Z.name());
        out.writeString(this.f1746o0.name());
        ArrayList arrayList = this.f1747p0;
        out.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C0545f) it.next()).writeToParcel(out, i10);
        }
    }
}
