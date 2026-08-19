package p949pj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: pj.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C18463f extends AbstractC18473k {
    public static final Parcelable.Creator<C18463f> CREATOR = new C18461e(0);

    /* JADX INFO: renamed from: Y */
    public final boolean f58903Y;

    public C18463f(boolean z6) {
        this.f58903Y = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18463f) && this.f58903Y == ((C18463f) obj).f58903Y;
    }

    public final int hashCode() {
        boolean z6 = this.f58903Y;
        if (z6) {
            return 1;
        }
        return z6 ? 1 : 0;
    }

    public final String toString() {
        return "BarcodePdf417Rule(isRequired=" + this.f58903Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(this.f58903Y ? 1 : 0);
    }
}
