package p149Fj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p125Ej.C2566j;
import p571X9.AbstractC9306j0;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: Fj.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C2880n implements Parcelable {
    public static final Parcelable.Creator<C2880n> CREATOR = new C2566j(7);

    /* JADX INFO: renamed from: Y */
    public final List f8661Y;

    /* JADX INFO: renamed from: Z */
    public final String f8662Z;

    /* JADX INFO: renamed from: o0 */
    public final String f8663o0;

    public C2880n(String fieldKeyDocument, String fieldKeyIdClass, List ids) {
        AbstractC16544l.m18094g(ids, "ids");
        AbstractC16544l.m18094g(fieldKeyDocument, "fieldKeyDocument");
        AbstractC16544l.m18094g(fieldKeyIdClass, "fieldKeyIdClass");
        this.f8661Y = ids;
        this.f8662Z = fieldKeyDocument;
        this.f8663o0 = fieldKeyIdClass;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2880n)) {
            return false;
        }
        C2880n c2880n = (C2880n) obj;
        return AbstractC16544l.m18089b(this.f8661Y, c2880n.f8661Y) && AbstractC16544l.m18089b(this.f8662Z, c2880n.f8662Z) && AbstractC16544l.m18089b(this.f8663o0, c2880n.f8663o0);
    }

    public final int hashCode() {
        return this.f8663o0.hashCode() + AbstractC0168G.m527p(this.f8661Y.hashCode() * 31, 31, this.f8662Z);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GovernmentIdRequestArguments(ids=");
        sb2.append(this.f8661Y);
        sb2.append(", fieldKeyDocument=");
        sb2.append(this.f8662Z);
        sb2.append(", fieldKeyIdClass=");
        return AbstractC9306j0.m9891j(this.f8663o0, Separators.RPAREN, sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        Iterator itM19536s = AbstractC17792x.m19536s(this.f8661Y, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
        out.writeString(this.f8662Z);
        out.writeString(this.f8663o0);
    }
}
