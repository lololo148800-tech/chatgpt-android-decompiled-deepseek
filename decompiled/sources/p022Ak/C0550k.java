package p022Ak;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;

/* JADX INFO: renamed from: Ak.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C0550k extends AbstractC0554o {
    public static final Parcelable.Creator<C0550k> CREATOR = new C0516a(8);

    /* JADX INFO: renamed from: Y */
    public final String f1753Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f1754Z;

    public C0550k(String stepName, ArrayList arrayList) {
        AbstractC16544l.m18094g(stepName, "stepName");
        this.f1753Y = stepName;
        this.f1754Z = arrayList;
    }

    @Override // p022Ak.AbstractC0554o, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f1754Z.iterator();
        while (it.hasNext()) {
            ((C0542c) it.next()).f1721Y.delete();
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
        if (!(obj instanceof C0550k)) {
            return false;
        }
        C0550k c0550k = (C0550k) obj;
        return AbstractC16544l.m18089b(this.f1753Y, c0550k.f1753Y) && this.f1754Z.equals(c0550k.f1754Z);
    }

    public final int hashCode() {
        return this.f1754Z.hashCode() + (this.f1753Y.hashCode() * 31);
    }

    public final String toString() {
        return "DocumentStepData(stepName=" + this.f1753Y + ", documents=" + this.f1754Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f1753Y);
        ArrayList arrayList = this.f1754Z;
        out.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C0542c) it.next()).writeToParcel(out, i10);
        }
    }
}
