package p349O0;

import android.os.Parcel;
import android.os.Parcelable;
import p001A.AbstractC0010F;

/* JADX INFO: renamed from: O0.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6000e0 implements Parcelable.ClassLoaderCreator {
    /* JADX INFO: renamed from: a */
    public static C6002f0 m6473a(Parcel parcel, ClassLoader classLoader) {
        C5975S c5975s;
        if (classLoader == null) {
            classLoader = C6000e0.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i10 = parcel.readInt();
        if (i10 == 0) {
            c5975s = C5975S.f19445o0;
        } else if (i10 == 1) {
            c5975s = C5975S.f19448r0;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException(AbstractC0010F.m19c(i10, "Unsupported MutableState policy ", " was restored"));
            }
            c5975s = C5975S.f19446p0;
        }
        return new C6002f0(value, c5975s);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m6473a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C6002f0[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return m6473a(parcel, null);
    }
}
