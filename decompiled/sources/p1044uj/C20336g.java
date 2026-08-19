package p1044uj;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p960q9.C18658l;

/* JADX INFO: renamed from: uj.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C20336g extends AbstractC20340i {
    public static final Parcelable.Creator<C20336g> CREATOR = new C18658l(14);

    /* JADX INFO: renamed from: Y */
    public final String f64301Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC20324a f64302Z;

    /* JADX INFO: renamed from: o0 */
    public final int f64303o0;

    public C20336g(String absoluteFilePath, EnumC20324a captureMethod, int i10) {
        AbstractC16544l.m18094g(absoluteFilePath, "absoluteFilePath");
        AbstractC16544l.m18094g(captureMethod, "captureMethod");
        this.f64301Y = absoluteFilePath;
        this.f64302Z = captureMethod;
        this.f64303o0 = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C20336g.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentFile.Local");
        return AbstractC16544l.m18089b(this.f64301Y, ((C20336g) obj).f64301Y);
    }

    public final int hashCode() {
        return this.f64301Y.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Local(absoluteFilePath=");
        sb2.append(this.f64301Y);
        sb2.append(", captureMethod=");
        sb2.append(this.f64302Z);
        sb2.append(", uploadProgress=");
        return AbstractC10763a.m11056n(sb2, this.f64303o0, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f64301Y);
        this.f64302Z.writeToParcel(out, i10);
        out.writeInt(this.f64303o0);
    }
}
