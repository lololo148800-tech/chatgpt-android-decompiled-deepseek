package p1156zj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p1088wk.C21006a;

/* JADX INFO: renamed from: zj.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C22176n implements InterfaceC22179o {
    public static final Parcelable.Creator<C22176n> CREATOR = new C21006a(9);

    /* JADX INFO: renamed from: Y */
    public final C22130W0 f70230Y;

    public C22176n(C22130W0 id2) {
        AbstractC16544l.m18094g(id2, "id");
        this.f70230Y = id2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22176n) && AbstractC16544l.m18089b(this.f70230Y, ((C22176n) obj).f70230Y);
    }

    public final int hashCode() {
        return this.f70230Y.hashCode();
    }

    public final String toString() {
        return "IdCaptureConfig(id=" + this.f70230Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        this.f70230Y.writeToParcel(out, i10);
    }
}
