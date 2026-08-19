package p1156zj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p1088wk.C21006a;

/* JADX INFO: renamed from: zj.T0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22124T0 implements Parcelable {
    public static final Parcelable.Creator<C22124T0> CREATOR = new C21006a(28);

    /* JADX INFO: renamed from: Y */
    public final String f69935Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC22128V0 f69936Z;

    /* JADX INFO: renamed from: o0 */
    public final AbstractC22196t1 f69937o0;

    /* JADX INFO: renamed from: p0 */
    public final C22122S0 f69938p0;

    /* JADX INFO: renamed from: q0 */
    public final C22126U0 f69939q0;

    public C22124T0(String sideKey, EnumC22128V0 side, AbstractC22196t1 overlay, C22122S0 autoCaptureConfig, C22126U0 manualCaptureConfig) {
        AbstractC16544l.m18094g(sideKey, "sideKey");
        AbstractC16544l.m18094g(side, "side");
        AbstractC16544l.m18094g(overlay, "overlay");
        AbstractC16544l.m18094g(autoCaptureConfig, "autoCaptureConfig");
        AbstractC16544l.m18094g(manualCaptureConfig, "manualCaptureConfig");
        this.f69935Y = sideKey;
        this.f69936Z = side;
        this.f69937o0 = overlay;
        this.f69938p0 = autoCaptureConfig;
        this.f69939q0 = manualCaptureConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22124T0)) {
            return false;
        }
        C22124T0 c22124t0 = (C22124T0) obj;
        return AbstractC16544l.m18089b(this.f69935Y, c22124t0.f69935Y) && this.f69936Z == c22124t0.f69936Z && AbstractC16544l.m18089b(this.f69937o0, c22124t0.f69937o0) && AbstractC16544l.m18089b(this.f69938p0, c22124t0.f69938p0) && AbstractC16544l.m18089b(this.f69939q0, c22124t0.f69939q0);
    }

    public final int hashCode() {
        return this.f69939q0.hashCode() + ((this.f69938p0.hashCode() + ((this.f69937o0.hashCode() + ((this.f69936Z.hashCode() + (this.f69935Y.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "IdSideConfig(sideKey=" + this.f69935Y + ", side=" + this.f69936Z + ", overlay=" + this.f69937o0 + ", autoCaptureConfig=" + this.f69938p0 + ", manualCaptureConfig=" + this.f69939q0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f69935Y);
        out.writeString(this.f69936Z.name());
        out.writeParcelable(this.f69937o0, i10);
        this.f69938p0.writeToParcel(out, i10);
        this.f69939q0.writeToParcel(out, i10);
    }
}
