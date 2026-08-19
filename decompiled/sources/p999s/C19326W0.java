package p999s;

import android.os.Parcel;
import android.os.Parcelable;
import p084D4.C1917h0;
import p280L2.AbstractC4913b;

/* JADX INFO: renamed from: s.W0 */
/* JADX INFO: loaded from: classes.dex */
public final class C19326W0 extends AbstractC4913b {
    public static final Parcelable.Creator<C19326W0> CREATOR = new C1917h0(8);

    /* JADX INFO: renamed from: o0 */
    public int f61211o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f61212p0;

    public C19326W0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f61211o0 = parcel.readInt();
        this.f61212p0 = parcel.readInt() != 0;
    }

    @Override // p280L2.AbstractC4913b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f61211o0);
        parcel.writeInt(this.f61212p0 ? 1 : 0);
    }
}
