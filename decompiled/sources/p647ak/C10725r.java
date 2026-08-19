package p647ak;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p531Vj.C8343M;
import p861l1.xapn.suYVq;

/* JADX INFO: renamed from: ak.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C10725r extends AbstractC10729t {
    public static final Parcelable.Creator<C10725r> CREATOR = new C8343M(14);

    /* JADX INFO: renamed from: Y */
    public final String f31859Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC10721p f31860Z;

    /* JADX INFO: renamed from: o0 */
    public final EnumC10723q f31861o0;

    /* JADX INFO: renamed from: p0 */
    public final long f31862p0;

    public C10725r(String absoluteFilePath, EnumC10721p captureMethod, EnumC10723q pose, long j10) {
        AbstractC16544l.m18094g(absoluteFilePath, "absoluteFilePath");
        AbstractC16544l.m18094g(captureMethod, "captureMethod");
        AbstractC16544l.m18094g(pose, "pose");
        this.f31859Y = absoluteFilePath;
        this.f31860Z = captureMethod;
        this.f31861o0 = pose;
        this.f31862p0 = j10;
    }

    @Override // p647ak.AbstractC10729t
    /* JADX INFO: renamed from: a */
    public final String mo11035a() {
        return this.f31859Y;
    }

    @Override // p647ak.AbstractC10729t
    /* JADX INFO: renamed from: b */
    public final EnumC10721p mo11036b() {
        return this.f31860Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10725r)) {
            return false;
        }
        C10725r c10725r = (C10725r) obj;
        return AbstractC16544l.m18089b(this.f31859Y, c10725r.f31859Y) && this.f31860Z == c10725r.f31860Z && this.f31861o0 == c10725r.f31861o0 && this.f31862p0 == c10725r.f31862p0;
    }

    public final int hashCode() {
        int iHashCode = (this.f31861o0.hashCode() + ((this.f31860Z.hashCode() + (this.f31859Y.hashCode() * 31)) * 31)) * 31;
        long j10 = this.f31862p0;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f31859Y);
        out.writeString(this.f31860Z.name());
        out.writeString(this.f31861o0.name());
        out.writeLong(this.f31862p0);
    }

    public final String toString() {
        return suYVq.NqMTOrPRdy + this.f31859Y + ", captureMethod=" + this.f31860Z + ", pose=" + this.f31861o0 + ", capturedTimestamp=" + this.f31862p0 + Separators.RPAREN;
    }
}
