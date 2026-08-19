package p571X9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: X9.F0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9127F0 extends AbstractC20851a {
    public static final Parcelable.Creator<C9127F0> CREATOR = new C9270d0(1);

    /* JADX INFO: renamed from: A0 */
    public final float f27891A0;

    /* JADX INFO: renamed from: Y */
    public final int f27892Y;

    /* JADX INFO: renamed from: Z */
    public final int f27893Z;

    /* JADX INFO: renamed from: o0 */
    public final float f27894o0;

    /* JADX INFO: renamed from: p0 */
    public final float f27895p0;

    /* JADX INFO: renamed from: q0 */
    public final float f27896q0;

    /* JADX INFO: renamed from: r0 */
    public final float f27897r0;

    /* JADX INFO: renamed from: s0 */
    public final float f27898s0;

    /* JADX INFO: renamed from: t0 */
    public final float f27899t0;

    /* JADX INFO: renamed from: u0 */
    public final float f27900u0;

    /* JADX INFO: renamed from: v0 */
    public final C9370t4[] f27901v0;

    /* JADX INFO: renamed from: w0 */
    public final float f27902w0;

    /* JADX INFO: renamed from: x0 */
    public final float f27903x0;

    /* JADX INFO: renamed from: y0 */
    public final float f27904y0;

    /* JADX INFO: renamed from: z0 */
    public final C9132G[] f27905z0;

    public C9127F0(int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, float f16, C9370t4[] c9370t4Arr, float f17, float f18, float f19, C9132G[] c9132gArr, float f20) {
        this.f27892Y = i10;
        this.f27893Z = i11;
        this.f27894o0 = f10;
        this.f27895p0 = f11;
        this.f27896q0 = f12;
        this.f27897r0 = f13;
        this.f27898s0 = f14;
        this.f27899t0 = f15;
        this.f27900u0 = f16;
        this.f27901v0 = c9370t4Arr;
        this.f27902w0 = f17;
        this.f27903x0 = f18;
        this.f27904y0 = f19;
        this.f27905z0 = c9132gArr;
        this.f27891A0 = f20;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f27892Y);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f27893Z);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeFloat(this.f27894o0);
        AbstractC8199t5.m8813l(parcel, 4, 4);
        parcel.writeFloat(this.f27895p0);
        AbstractC8199t5.m8813l(parcel, 5, 4);
        parcel.writeFloat(this.f27896q0);
        AbstractC8199t5.m8813l(parcel, 6, 4);
        parcel.writeFloat(this.f27897r0);
        AbstractC8199t5.m8813l(parcel, 7, 4);
        parcel.writeFloat(this.f27898s0);
        AbstractC8199t5.m8813l(parcel, 8, 4);
        parcel.writeFloat(this.f27899t0);
        AbstractC8199t5.m8809h(parcel, 9, this.f27901v0, i10);
        AbstractC8199t5.m8813l(parcel, 10, 4);
        parcel.writeFloat(this.f27902w0);
        AbstractC8199t5.m8813l(parcel, 11, 4);
        parcel.writeFloat(this.f27903x0);
        AbstractC8199t5.m8813l(parcel, 12, 4);
        parcel.writeFloat(this.f27904y0);
        AbstractC8199t5.m8809h(parcel, 13, this.f27905z0, i10);
        AbstractC8199t5.m8813l(parcel, 14, 4);
        parcel.writeFloat(this.f27900u0);
        AbstractC8199t5.m8813l(parcel, 15, 4);
        parcel.writeFloat(this.f27891A0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
