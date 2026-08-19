package p046Bk;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;
import p994rk.C19218t;

/* JADX INFO: renamed from: Bk.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1385h0 implements InterfaceC1389j0 {
    public static final Parcelable.Creator<C1385h0> CREATOR = new C0516a(13);

    /* JADX INFO: renamed from: Y */
    public final C19218t f3693Y;

    public C1385h0(C19218t createPersonaSheetComponent) {
        AbstractC16544l.m18094g(createPersonaSheetComponent, "createPersonaSheetComponent");
        this.f3693Y = createPersonaSheetComponent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1385h0) && AbstractC16544l.m18089b(this.f3693Y, ((C1385h0) obj).f3693Y);
    }

    public final int hashCode() {
        return this.f3693Y.hashCode();
    }

    public final String toString() {
        return "CreateReusablePersona(createPersonaSheetComponent=" + this.f3693Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f3693Y, i10);
    }
}
