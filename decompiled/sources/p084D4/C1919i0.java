package p084D4;

import android.os.Parcel;
import android.os.Parcelable;
import p280L2.AbstractC4913b;

/* JADX INFO: renamed from: D4.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1919i0 extends AbstractC4913b {
    public static final Parcelable.Creator<C1919i0> CREATOR = new C1917h0(0);

    /* JADX INFO: renamed from: o0 */
    public Parcelable f5614o0;

    public C1919i0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5614o0 = parcel.readParcelable(classLoader == null ? AbstractC1900Y.class.getClassLoader() : classLoader);
    }

    @Override // p280L2.AbstractC4913b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f5614o0, 0);
    }
}
