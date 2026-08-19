package za;

import android.os.Parcel;
import android.os.Parcelable;
import p084D4.C1917h0;
import p280L2.AbstractC4913b;

/* JADX INFO: renamed from: za.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21818a extends AbstractC4913b {
    public static final Parcelable.Creator<C21818a> CREATOR = new C1917h0(9);

    /* JADX INFO: renamed from: o0 */
    public boolean f69191o0;

    public C21818a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f69191o0 = parcel.readInt() == 1;
    }

    @Override // p280L2.AbstractC4913b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f69191o0 ? 1 : 0);
    }
}
