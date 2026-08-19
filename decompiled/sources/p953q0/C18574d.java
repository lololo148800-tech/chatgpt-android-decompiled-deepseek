package p953q0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: q0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C18574d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C18576e(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C18576e[i10];
    }
}
