package p349O0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: O0.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C5989Z implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f19465a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f19465a) {
            case 0:
                return new C5992a0(parcel.readDouble());
            case 1:
                return new C5994b0(parcel.readFloat());
            case 2:
                return new C5996c0(parcel.readInt());
            default:
                return new C5998d0(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f19465a) {
            case 0:
                return new C5992a0[i10];
            case 1:
                return new C5994b0[i10];
            case 2:
                return new C5996c0[i10];
            default:
                return new C5998d0[i10];
        }
    }
}
