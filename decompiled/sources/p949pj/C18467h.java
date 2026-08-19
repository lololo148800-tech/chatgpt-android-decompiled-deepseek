package p949pj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: pj.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C18467h extends AbstractC18473k {
    public static final Parcelable.Creator<C18467h> CREATOR = new C18461e(2);

    /* JADX INFO: renamed from: Y */
    public final boolean f58908Y;

    public C18467h(boolean z6) {
        this.f58908Y = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18467h) && this.f58908Y == ((C18467h) obj).f58908Y;
    }

    public final int hashCode() {
        boolean z6 = this.f58908Y;
        if (z6) {
            return 1;
        }
        return z6 ? 1 : 0;
    }

    public final String toString() {
        return "FrontRule(isRequired=" + this.f58908Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(this.f58908Y ? 1 : 0);
    }
}
