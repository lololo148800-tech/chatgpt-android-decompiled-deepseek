package p949pj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: pj.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C18465g extends AbstractC18473k {
    public static final Parcelable.Creator<C18465g> CREATOR = new C18461e(1);

    /* JADX INFO: renamed from: Y */
    public final boolean f58904Y;

    public C18465g(boolean z6) {
        this.f58904Y = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18465g) && this.f58904Y == ((C18465g) obj).f58904Y;
    }

    public final int hashCode() {
        boolean z6 = this.f58904Y;
        if (z6) {
            return 1;
        }
        return z6 ? 1 : 0;
    }

    public final String toString() {
        return "FrontOrBackRule(isRequired=" + this.f58904Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(this.f58904Y ? 1 : 0);
    }
}
