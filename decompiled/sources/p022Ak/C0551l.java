package p022Ak;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;
import p582Xk.HXHG.bQBnquXS;

/* JADX INFO: renamed from: Ak.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C0551l extends AbstractC0554o {
    public static final Parcelable.Creator<C0551l> CREATOR = new C0516a(9);

    /* JADX INFO: renamed from: Y */
    public final String f1755Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f1756Z;

    /* JADX INFO: renamed from: o0 */
    public final C0541b f1757o0;

    public C0551l(String stepName, ArrayList arrayList, C0541b idDetails) {
        AbstractC16544l.m18094g(stepName, "stepName");
        AbstractC16544l.m18094g(idDetails, "idDetails");
        this.f1755Y = stepName;
        this.f1756Z = arrayList;
        this.f1757o0 = idDetails;
    }

    @Override // p022Ak.AbstractC0554o, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f1756Z.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C0547h) it.next()).f1747p0.iterator();
            while (it2.hasNext()) {
                ((C0545f) it2.next()).f1738Y.delete();
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0551l)) {
            return false;
        }
        C0551l c0551l = (C0551l) obj;
        return AbstractC16544l.m18089b(this.f1755Y, c0551l.f1755Y) && this.f1756Z.equals(c0551l.f1756Z) && AbstractC16544l.m18089b(this.f1757o0, c0551l.f1757o0);
    }

    public final int hashCode() {
        return this.f1757o0.hashCode() + ((this.f1756Z.hashCode() + (this.f1755Y.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f1755Y);
        ArrayList arrayList = this.f1756Z;
        out.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C0547h) it.next()).writeToParcel(out, i10);
        }
        this.f1757o0.writeToParcel(out, i10);
    }

    public final String toString() {
        return bQBnquXS.acUPPa + this.f1755Y + ", captures=" + this.f1756Z + ", idDetails=" + this.f1757o0 + Separators.RPAREN;
    }
}
