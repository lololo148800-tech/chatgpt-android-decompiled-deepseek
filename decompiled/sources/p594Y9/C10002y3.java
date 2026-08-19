package p594Y9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: Y9.y3 */
/* JADX INFO: loaded from: classes.dex */
public final class C10002y3 extends AbstractC20851a {
    public static final Parcelable.Creator<C10002y3> CREATOR = new C9864c1(1);

    /* JADX INFO: renamed from: Y */
    public final C9875d5[] f29667Y;

    /* JADX INFO: renamed from: Z */
    public final C9700B0 f29668Z;

    /* JADX INFO: renamed from: o0 */
    public final C9700B0 f29669o0;

    /* JADX INFO: renamed from: p0 */
    public final C9700B0 f29670p0;

    /* JADX INFO: renamed from: q0 */
    public final String f29671q0;

    /* JADX INFO: renamed from: r0 */
    public final float f29672r0;

    /* JADX INFO: renamed from: s0 */
    public final String f29673s0;

    /* JADX INFO: renamed from: t0 */
    public final int f29674t0;

    /* JADX INFO: renamed from: u0 */
    public final boolean f29675u0;

    /* JADX INFO: renamed from: v0 */
    public final int f29676v0;

    /* JADX INFO: renamed from: w0 */
    public final int f29677w0;

    public C10002y3(C9875d5[] c9875d5Arr, C9700B0 c9700b0, C9700B0 c9700b1, C9700B0 c9700b2, String str, float f10, String str2, int i10, boolean z6, int i11, int i12) {
        this.f29667Y = c9875d5Arr;
        this.f29668Z = c9700b0;
        this.f29669o0 = c9700b1;
        this.f29670p0 = c9700b2;
        this.f29671q0 = str;
        this.f29672r0 = f10;
        this.f29673s0 = str2;
        this.f29674t0 = i10;
        this.f29675u0 = z6;
        this.f29676v0 = i11;
        this.f29677w0 = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8809h(parcel, 2, this.f29667Y, i10);
        AbstractC8199t5.m8806e(parcel, 3, this.f29668Z, i10);
        AbstractC8199t5.m8806e(parcel, 4, this.f29669o0, i10);
        AbstractC8199t5.m8806e(parcel, 5, this.f29670p0, i10);
        AbstractC8199t5.m8807f(parcel, 6, this.f29671q0);
        AbstractC8199t5.m8813l(parcel, 7, 4);
        parcel.writeFloat(this.f29672r0);
        AbstractC8199t5.m8807f(parcel, 8, this.f29673s0);
        AbstractC8199t5.m8813l(parcel, 9, 4);
        parcel.writeInt(this.f29674t0);
        AbstractC8199t5.m8813l(parcel, 10, 4);
        parcel.writeInt(this.f29675u0 ? 1 : 0);
        AbstractC8199t5.m8813l(parcel, 11, 4);
        parcel.writeInt(this.f29676v0);
        AbstractC8199t5.m8813l(parcel, 12, 4);
        parcel.writeInt(this.f29677w0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
