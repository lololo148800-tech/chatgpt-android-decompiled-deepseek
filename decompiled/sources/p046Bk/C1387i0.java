package p046Bk;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;
import p994rk.C19221t2;

/* JADX INFO: renamed from: Bk.i0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1387i0 implements InterfaceC1389j0 {
    public static final Parcelable.Creator<C1387i0> CREATOR = new C0516a(14);

    /* JADX INFO: renamed from: Y */
    public final C19221t2 f3697Y;

    public C1387i0(C19221t2 verifyPersonaButtonComponent) {
        AbstractC16544l.m18094g(verifyPersonaButtonComponent, "verifyPersonaButtonComponent");
        this.f3697Y = verifyPersonaButtonComponent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1387i0) && AbstractC16544l.m18089b(this.f3697Y, ((C1387i0) obj).f3697Y);
    }

    public final int hashCode() {
        return this.f3697Y.hashCode();
    }

    public final String toString() {
        return "VerifyReusablePersona(verifyPersonaButtonComponent=" + this.f3697Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f3697Y, i10);
    }
}
