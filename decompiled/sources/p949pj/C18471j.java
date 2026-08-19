package p949pj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: pj.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C18471j extends AbstractC18473k {
    public static final Parcelable.Creator<C18471j> CREATOR = new C18461e(4);

    /* JADX INFO: renamed from: Y */
    public final boolean f58916Y;

    public C18471j(boolean z6) {
        this.f58916Y = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18471j) && this.f58916Y == ((C18471j) obj).f58916Y;
    }

    public final int hashCode() {
        boolean z6 = this.f58916Y;
        if (z6) {
            return 1;
        }
        return z6 ? 1 : 0;
    }

    public final String toString() {
        return "TextExtractionRule(isRequired=" + this.f58916Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(this.f58916Y ? 1 : 0);
    }
}
