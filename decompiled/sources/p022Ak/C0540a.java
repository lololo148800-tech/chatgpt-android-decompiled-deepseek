package p022Ak;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;

/* JADX INFO: renamed from: Ak.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C0540a implements Closeable, Parcelable {
    public static final Parcelable.Creator<C0540a> CREATOR = new C0516a(1);

    /* JADX INFO: renamed from: Y */
    public final ArrayList f1718Y;

    public C0540a(ArrayList arrayList) {
        this.f1718Y = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f1718Y.iterator();
        while (it.hasNext()) {
            ((AbstractC0554o) it.next()).close();
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
        return (obj instanceof C0540a) && this.f1718Y.equals(((C0540a) obj).f1718Y);
    }

    public final int hashCode() {
        return this.f1718Y.hashCode();
    }

    public final String toString() {
        return "CollectedData(stepData=" + this.f1718Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        ArrayList arrayList = this.f1718Y;
        out.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i10);
        }
    }
}
