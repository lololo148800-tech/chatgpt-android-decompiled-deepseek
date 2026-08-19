package p222Ij;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p125Ej.C2566j;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Ij.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3737b implements InterfaceC3738c {
    public static final Parcelable.Creator<C3737b> CREATOR = new C2566j(11);

    /* JADX INFO: renamed from: Y */
    public final String f11384Y;

    public C3737b(String inquiryId) {
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        this.f11384Y = inquiryId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3737b) && AbstractC16544l.m18089b(this.f11384Y, ((C3737b) obj).f11384Y);
    }

    public final int hashCode() {
        return this.f11384Y.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f11384Y, Separators.RPAREN, new StringBuilder("StartEvent(inquiryId="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f11384Y);
    }
}
