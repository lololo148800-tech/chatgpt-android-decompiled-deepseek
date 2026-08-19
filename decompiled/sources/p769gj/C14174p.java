package p769gj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p523V9.AbstractC8183r5;
import p722e8.C13298H;
import p729ej.C13420k;
import p729ej.C13425p;
import p959q8.C18639a;

/* JADX INFO: renamed from: gj.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C14174p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC16544l.m18094g(parcel, "parcel");
        C0678l c0678l = C0678l.f1971p0;
        byte[] bArrCreateByteArray = parcel.createByteArray();
        AbstractC16544l.m18091d(bArrCreateByteArray);
        C0678l c0678lM19998t = C18639a.m19998t(bArrCreateByteArray, 0, -1234567890);
        C0675i c0675i = new C0675i();
        c0675i.m1432c1(c0678lM19998t);
        C0678l byteString = AbstractC8183r5.m8764b(c0675i);
        AbstractC16544l.m18094g(byteString, "byteString");
        return new C14175q(new C13425p(new C13420k(new C13298H(byteString, 3)), new C13298H(c0675i, 5)));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C14175q[i10];
    }
}
