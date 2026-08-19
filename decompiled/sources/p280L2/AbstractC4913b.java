package p280L2;

import android.os.Parcel;
import android.os.Parcelable;
import p084D4.C1917h0;

/* JADX INFO: renamed from: L2.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4913b implements Parcelable {

    /* JADX INFO: renamed from: Y */
    public final Parcelable f16000Y;

    /* JADX INFO: renamed from: Z */
    public static final C4912a f15999Z = new C4912a();
    public static final Parcelable.Creator<AbstractC4913b> CREATOR = new C1917h0(4);

    public AbstractC4913b() {
        this.f16000Y = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f16000Y, i10);
    }

    public AbstractC4913b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f16000Y = parcelable == f15999Z ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC4913b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f16000Y = parcelable == null ? f15999Z : parcelable;
    }
}
