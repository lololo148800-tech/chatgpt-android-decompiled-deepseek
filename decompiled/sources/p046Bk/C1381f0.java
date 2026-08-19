package p046Bk;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.GovernmentIdNfcScanComponent;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;

/* JADX INFO: renamed from: Bk.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1381f0 implements Parcelable {
    public static final Parcelable.Creator<C1381f0> CREATOR = new C0516a(12);

    /* JADX INFO: renamed from: Y */
    public final GovernmentIdNfcScanComponent f3671Y;

    public C1381f0(GovernmentIdNfcScanComponent component) {
        AbstractC16544l.m18094g(component, "component");
        this.f3671Y = component;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1381f0) && AbstractC16544l.m18089b(this.f3671Y, ((C1381f0) obj).f3671Y);
    }

    public final int hashCode() {
        return this.f3671Y.hashCode();
    }

    public final String toString() {
        return "NfcScan(component=" + this.f3671Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f3671Y, i10);
    }
}
