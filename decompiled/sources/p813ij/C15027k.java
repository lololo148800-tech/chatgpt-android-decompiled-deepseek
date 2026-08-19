package p813ij;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ij.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C15027k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC16544l.m18094g(parcel, "parcel");
        String string = parcel.readString();
        AbstractC16544l.m18091d(string);
        SparseArray sparseArray = parcel.readSparseArray(C15028l.class.getClassLoader());
        AbstractC16544l.m18091d(sparseArray);
        return new C15028l(string, sparseArray);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C15028l[i10];
    }
}
