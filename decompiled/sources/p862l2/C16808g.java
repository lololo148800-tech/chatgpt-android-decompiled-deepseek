package p862l2;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import p084D4.C1917h0;
import p280L2.AbstractC4913b;

/* JADX INFO: renamed from: l2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C16808g extends AbstractC4913b {
    public static final Parcelable.Creator<C16808g> CREATOR = new C1917h0(5);

    /* JADX INFO: renamed from: o0 */
    public SparseArray f53935o0;

    public C16808g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i10 = parcel.readInt();
        int[] iArr = new int[i10];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f53935o0 = new SparseArray(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f53935o0.append(iArr[i11], parcelableArray[i11]);
        }
    }

    @Override // p280L2.AbstractC4913b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        SparseArray sparseArray = this.f53935o0;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = this.f53935o0.keyAt(i11);
            parcelableArr[i11] = (Parcelable) this.f53935o0.valueAt(i11);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i10);
    }
}
