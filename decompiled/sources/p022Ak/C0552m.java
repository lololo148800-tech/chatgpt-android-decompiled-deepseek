package p022Ak;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Ak.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C0552m extends AbstractC0554o {
    public static final Parcelable.Creator<C0552m> CREATOR = new C0516a(10);

    /* JADX INFO: renamed from: Y */
    public final String f1758Y;

    /* JADX INFO: renamed from: Z */
    public final C0549j f1759Z;

    /* JADX INFO: renamed from: o0 */
    public final C0549j f1760o0;

    /* JADX INFO: renamed from: p0 */
    public final C0549j f1761p0;

    public C0552m(String stepName, C0549j c0549j, C0549j c0549j2, C0549j c0549j3) {
        AbstractC16544l.m18094g(stepName, "stepName");
        this.f1758Y = stepName;
        this.f1759Z = c0549j;
        this.f1760o0 = c0549j2;
        this.f1761p0 = c0549j3;
    }

    @Override // p022Ak.AbstractC0554o, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        File file;
        for (C0549j c0549j : AbstractC17681o.m19382k(this.f1759Z, this.f1760o0, this.f1761p0)) {
            if (c0549j != null && (file = c0549j.f1752Z) != null) {
                file.delete();
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
        if (!(obj instanceof C0552m)) {
            return false;
        }
        C0552m c0552m = (C0552m) obj;
        return AbstractC16544l.m18089b(this.f1758Y, c0552m.f1758Y) && AbstractC16544l.m18089b(this.f1759Z, c0552m.f1759Z) && AbstractC16544l.m18089b(this.f1760o0, c0552m.f1760o0) && AbstractC16544l.m18089b(this.f1761p0, c0552m.f1761p0);
    }

    public final int hashCode() {
        int iHashCode = this.f1758Y.hashCode() * 31;
        C0549j c0549j = this.f1759Z;
        int iHashCode2 = (iHashCode + (c0549j == null ? 0 : c0549j.hashCode())) * 31;
        C0549j c0549j2 = this.f1760o0;
        int iHashCode3 = (iHashCode2 + (c0549j2 == null ? 0 : c0549j2.hashCode())) * 31;
        C0549j c0549j3 = this.f1761p0;
        return iHashCode3 + (c0549j3 != null ? c0549j3.hashCode() : 0);
    }

    public final String toString() {
        return "SelfieStepData(stepName=" + this.f1758Y + ", centerCapture=" + this.f1759Z + ", leftCapture=" + this.f1760o0 + ", rightCapture=" + this.f1761p0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f1758Y);
        C0549j c0549j = this.f1759Z;
        if (c0549j == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c0549j.writeToParcel(out, i10);
        }
        C0549j c0549j2 = this.f1760o0;
        if (c0549j2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c0549j2.writeToParcel(out, i10);
        }
        C0549j c0549j3 = this.f1761p0;
        if (c0549j3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c0549j3.writeToParcel(out, i10);
        }
    }
}
