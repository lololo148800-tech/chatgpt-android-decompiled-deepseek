package p571X9;

import android.os.Parcel;
import p139F9.BinderC2679b;
import p333N9.AbstractC5680a;

/* JADX INFO: renamed from: X9.G2 */
/* JADX INFO: loaded from: classes.dex */
public final class C9135G2 extends AbstractC5680a {
    /* JADX INFO: renamed from: s */
    public final C9127F0[] m9674s(BinderC2679b binderC2679b, BinderC2679b binderC2679b2, BinderC2679b binderC2679b3, int i10, int i11, int i12, int i13, int i14, int i15, C9226V4 c9226v4) {
        Parcel parcelM6116m = m6116m();
        AbstractC9365t.m9950a(parcelM6116m, binderC2679b);
        AbstractC9365t.m9950a(parcelM6116m, binderC2679b2);
        AbstractC9365t.m9950a(parcelM6116m, binderC2679b3);
        parcelM6116m.writeInt(i10);
        parcelM6116m.writeInt(i11);
        parcelM6116m.writeInt(i12);
        parcelM6116m.writeInt(i13);
        parcelM6116m.writeInt(i14);
        parcelM6116m.writeInt(i15);
        parcelM6116m.writeInt(1);
        c9226v4.writeToParcel(parcelM6116m, 0);
        Parcel parcelM6117n = m6117n(parcelM6116m, 4);
        C9127F0[] c9127f0Arr = (C9127F0[]) parcelM6117n.createTypedArray(C9127F0.CREATOR);
        parcelM6117n.recycle();
        return c9127f0Arr;
    }
}
