package p949pj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: pj.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C18469i extends AbstractC18473k {
    public static final Parcelable.Creator<C18469i> CREATOR = new C18461e(3);

    /* JADX INFO: renamed from: Y */
    public final boolean f58912Y;

    public C18469i(boolean z6) {
        this.f58912Y = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18469i) && this.f58912Y == ((C18469i) obj).f58912Y;
    }

    public final int hashCode() {
        boolean z6 = this.f58912Y;
        if (z6) {
            return 1;
        }
        return z6 ? 1 : 0;
    }

    public final String toString() {
        return "MrzRule(isRequired=" + this.f58912Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(this.f58912Y ? 1 : 0);
    }
}
