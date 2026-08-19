package na;

import android.os.Parcel;
import android.os.Parcelable;
import p084D4.C1917h0;
import p280L2.AbstractC4913b;

/* JADX INFO: renamed from: na.b */
/* JADX INFO: loaded from: classes.dex */
public final class C17541b extends AbstractC4913b {
    public static final Parcelable.Creator<C17541b> CREATOR = new C1917h0(7);

    /* JADX INFO: renamed from: o0 */
    public boolean f56100o0;

    public C17541b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C17541b.class.getClassLoader();
        }
        this.f56100o0 = parcel.readInt() == 1;
    }

    @Override // p280L2.AbstractC4913b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f56100o0 ? 1 : 0);
    }
}
