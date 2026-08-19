package p523V9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.G6 */
/* JADX INFO: loaded from: classes.dex */
public final class C7895G6 extends AbstractC20851a {
    public static final Parcelable.Creator<C7895G6> CREATOR = new C8041a(12);

    /* JADX INFO: renamed from: Y */
    public final C7927K6 f24834Y;

    /* JADX INFO: renamed from: Z */
    public final String f24835Z;

    /* JADX INFO: renamed from: o0 */
    public final String f24836o0;

    /* JADX INFO: renamed from: p0 */
    public final C7935L6[] f24837p0;

    /* JADX INFO: renamed from: q0 */
    public final C7911I6[] f24838q0;

    /* JADX INFO: renamed from: r0 */
    public final String[] f24839r0;

    /* JADX INFO: renamed from: s0 */
    public final C7871D6[] f24840s0;

    public C7895G6(C7927K6 c7927k6, String str, String str2, C7935L6[] c7935l6Arr, C7911I6[] c7911i6Arr, String[] strArr, C7871D6[] c7871d6Arr) {
        this.f24834Y = c7927k6;
        this.f24835Z = str;
        this.f24836o0 = str2;
        this.f24837p0 = c7935l6Arr;
        this.f24838q0 = c7911i6Arr;
        this.f24839r0 = strArr;
        this.f24840s0 = c7871d6Arr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8806e(parcel, 1, this.f24834Y, i10);
        AbstractC8199t5.m8807f(parcel, 2, this.f24835Z);
        AbstractC8199t5.m8807f(parcel, 3, this.f24836o0);
        AbstractC8199t5.m8809h(parcel, 4, this.f24837p0, i10);
        AbstractC8199t5.m8809h(parcel, 5, this.f24838q0, i10);
        AbstractC8199t5.m8808g(parcel, 6, this.f24839r0);
        AbstractC8199t5.m8809h(parcel, 7, this.f24840s0, i10);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
