package ck;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p647ak.AbstractC10729t;
import p647ak.C10707i0;
import p770gk.InterfaceC14188d;

/* JADX INFO: renamed from: ck.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C11765b implements InterfaceC14188d {
    public static final Parcelable.Creator<C11765b> CREATOR = new C10707i0(10);

    /* JADX INFO: renamed from: Y */
    public final String f35683Y;

    /* JADX INFO: renamed from: Z */
    public final AbstractC10729t f35684Z;

    /* JADX INFO: renamed from: o0 */
    public final AbstractC10729t f35685o0;

    /* JADX INFO: renamed from: p0 */
    public final AbstractC10729t f35686p0;

    public C11765b(String stepName, AbstractC10729t abstractC10729t, AbstractC10729t abstractC10729t2, AbstractC10729t abstractC10729t3) {
        AbstractC16544l.m18094g(stepName, "stepName");
        this.f35683Y = stepName;
        this.f35684Z = abstractC10729t;
        this.f35685o0 = abstractC10729t2;
        this.f35686p0 = abstractC10729t3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11765b)) {
            return false;
        }
        C11765b c11765b = (C11765b) obj;
        return AbstractC16544l.m18089b(this.f35683Y, c11765b.f35683Y) && AbstractC16544l.m18089b(this.f35684Z, c11765b.f35684Z) && AbstractC16544l.m18089b(this.f35685o0, c11765b.f35685o0) && AbstractC16544l.m18089b(this.f35686p0, c11765b.f35686p0);
    }

    public final int hashCode() {
        int iHashCode = this.f35683Y.hashCode() * 31;
        AbstractC10729t abstractC10729t = this.f35684Z;
        int iHashCode2 = (iHashCode + (abstractC10729t == null ? 0 : abstractC10729t.hashCode())) * 31;
        AbstractC10729t abstractC10729t2 = this.f35685o0;
        int iHashCode3 = (iHashCode2 + (abstractC10729t2 == null ? 0 : abstractC10729t2.hashCode())) * 31;
        AbstractC10729t abstractC10729t3 = this.f35686p0;
        return iHashCode3 + (abstractC10729t3 != null ? abstractC10729t3.hashCode() : 0);
    }

    public final String toString() {
        return "SelfieStepData(stepName=" + this.f35683Y + ", centerCapture=" + this.f35684Z + ", leftCapture=" + this.f35685o0 + ", rightCapture=" + this.f35686p0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f35683Y);
        out.writeParcelable(this.f35684Z, i10);
        out.writeParcelable(this.f35685o0, i10);
        out.writeParcelable(this.f35686p0, i10);
    }
}
