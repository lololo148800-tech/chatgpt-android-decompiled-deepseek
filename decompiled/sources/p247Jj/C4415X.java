package p247Jj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p125Ej.C2566j;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Jj.X */
/* JADX INFO: loaded from: classes3.dex */
public final class C4415X extends AbstractC4433h0 {
    public static final Parcelable.Creator<C4415X> CREATOR = new C2566j(24);

    /* JADX INFO: renamed from: u0 */
    public final String f14327u0;

    public C4415X(String inquiryId) {
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        this.f14327u0 = inquiryId;
    }

    @Override // p247Jj.AbstractC4433h0
    /* JADX INFO: renamed from: a */
    public final String mo5190a() {
        return this.f14327u0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4415X) && AbstractC16544l.m18089b(this.f14327u0, ((C4415X) obj).f14327u0);
    }

    public final int hashCode() {
        return this.f14327u0.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f14327u0, Separators.RPAREN, new StringBuilder("CreateInquirySession(inquiryId="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f14327u0);
    }
}
