package p878lo;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: lo.L */
/* JADX INFO: loaded from: classes2.dex */
public final class C17089L implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54617a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f54617a) {
            case 0:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C17091N(parcel.readLong(), parcel.readFloat(), parcel.readLong(), parcel.readInt() == 0 ? null : C17090M.CREATOR.createFromParcel(parcel));
            default:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C17090M(parcel.readLong(), parcel.readLong(), parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f54617a) {
            case 0:
                return new C17091N[i10];
            default:
                return new C17090M[i10];
        }
    }
}
