package p523V9;

import android.os.Parcel;
import p139F9.BinderC2679b;
import p333N9.AbstractC5680a;

/* JADX INFO: renamed from: V9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8057c extends AbstractC5680a {
    /* JADX INFO: renamed from: s */
    public final C8026X5[] m8454s(BinderC2679b binderC2679b, C8089g c8089g) {
        Parcel parcelM6116m = m6116m();
        AbstractC7840A.m8088a(parcelM6116m, binderC2679b);
        parcelM6116m.writeInt(1);
        c8089g.writeToParcel(parcelM6116m, 0);
        Parcel parcelM6117n = m6117n(parcelM6116m, 1);
        C8026X5[] c8026x5Arr = (C8026X5[]) parcelM6117n.createTypedArray(C8026X5.CREATOR);
        parcelM6117n.recycle();
        return c8026x5Arr;
    }
}
