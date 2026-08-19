package p571X9;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: X9.S4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9208S4 extends AbstractC20851a {
    public static final Parcelable.Creator<C9208S4> CREATOR = new C9270d0(6);

    /* JADX INFO: renamed from: Y */
    public final int f28001Y;

    /* JADX INFO: renamed from: Z */
    public final Rect f28002Z;

    /* JADX INFO: renamed from: o0 */
    public final float f28003o0;

    /* JADX INFO: renamed from: p0 */
    public final float f28004p0;

    /* JADX INFO: renamed from: q0 */
    public final float f28005q0;

    /* JADX INFO: renamed from: r0 */
    public final float f28006r0;

    /* JADX INFO: renamed from: s0 */
    public final float f28007s0;

    /* JADX INFO: renamed from: t0 */
    public final float f28008t0;

    /* JADX INFO: renamed from: u0 */
    public final float f28009u0;

    /* JADX INFO: renamed from: v0 */
    public final ArrayList f28010v0;

    /* JADX INFO: renamed from: w0 */
    public final ArrayList f28011w0;

    public C9208S4(int i10, Rect rect, float f10, float f11, float f12, float f13, float f14, float f15, float f16, ArrayList arrayList, ArrayList arrayList2) {
        this.f28001Y = i10;
        this.f28002Z = rect;
        this.f28003o0 = f10;
        this.f28004p0 = f11;
        this.f28005q0 = f12;
        this.f28006r0 = f13;
        this.f28007s0 = f14;
        this.f28008t0 = f15;
        this.f28009u0 = f16;
        this.f28010v0 = arrayList;
        this.f28011w0 = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f28001Y);
        AbstractC8199t5.m8806e(parcel, 2, this.f28002Z, i10);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeFloat(this.f28003o0);
        AbstractC8199t5.m8813l(parcel, 4, 4);
        parcel.writeFloat(this.f28004p0);
        AbstractC8199t5.m8813l(parcel, 5, 4);
        parcel.writeFloat(this.f28005q0);
        AbstractC8199t5.m8813l(parcel, 6, 4);
        parcel.writeFloat(this.f28006r0);
        AbstractC8199t5.m8813l(parcel, 7, 4);
        parcel.writeFloat(this.f28007s0);
        AbstractC8199t5.m8813l(parcel, 8, 4);
        parcel.writeFloat(this.f28008t0);
        AbstractC8199t5.m8813l(parcel, 9, 4);
        parcel.writeFloat(this.f28009u0);
        AbstractC8199t5.m8810i(parcel, 10, this.f28010v0);
        AbstractC8199t5.m8810i(parcel, 11, this.f28011w0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
