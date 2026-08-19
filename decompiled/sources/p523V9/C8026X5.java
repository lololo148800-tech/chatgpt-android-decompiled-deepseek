package p523V9;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.X5 */
/* JADX INFO: loaded from: classes.dex */
public final class C8026X5 extends AbstractC20851a {
    public static final Parcelable.Creator<C8026X5> CREATOR = new C8041a(6);

    /* JADX INFO: renamed from: A0 */
    public byte[] f25326A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f25327B0;

    /* JADX INFO: renamed from: C0 */
    public double f25328C0;

    /* JADX INFO: renamed from: Y */
    public int f25329Y;

    /* JADX INFO: renamed from: Z */
    public String f25330Z;

    /* JADX INFO: renamed from: o0 */
    public String f25331o0;

    /* JADX INFO: renamed from: p0 */
    public int f25332p0;

    /* JADX INFO: renamed from: q0 */
    public Point[] f25333q0;

    /* JADX INFO: renamed from: r0 */
    public C7891G2 f25334r0;

    /* JADX INFO: renamed from: s0 */
    public C8110i4 f25335s0;

    /* JADX INFO: renamed from: t0 */
    public C7869D4 f25336t0;

    /* JADX INFO: renamed from: u0 */
    public C8247z5 f25337u0;

    /* JADX INFO: renamed from: v0 */
    public C8032Y4 f25338v0;

    /* JADX INFO: renamed from: w0 */
    public C8101h3 f25339w0;

    /* JADX INFO: renamed from: x0 */
    public C8067d1 f25340x0;

    /* JADX INFO: renamed from: y0 */
    public C7874E1 f25341y0;

    /* JADX INFO: renamed from: z0 */
    public C8084f2 f25342z0;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f25329Y);
        AbstractC8199t5.m8807f(parcel, 3, this.f25330Z);
        AbstractC8199t5.m8807f(parcel, 4, this.f25331o0);
        AbstractC8199t5.m8813l(parcel, 5, 4);
        parcel.writeInt(this.f25332p0);
        AbstractC8199t5.m8809h(parcel, 6, this.f25333q0, i10);
        AbstractC8199t5.m8806e(parcel, 7, this.f25334r0, i10);
        AbstractC8199t5.m8806e(parcel, 8, this.f25335s0, i10);
        AbstractC8199t5.m8806e(parcel, 9, this.f25336t0, i10);
        AbstractC8199t5.m8806e(parcel, 10, this.f25337u0, i10);
        AbstractC8199t5.m8806e(parcel, 11, this.f25338v0, i10);
        AbstractC8199t5.m8806e(parcel, 12, this.f25339w0, i10);
        AbstractC8199t5.m8806e(parcel, 13, this.f25340x0, i10);
        AbstractC8199t5.m8806e(parcel, 14, this.f25341y0, i10);
        AbstractC8199t5.m8806e(parcel, 15, this.f25342z0, i10);
        AbstractC8199t5.m8804c(parcel, 16, this.f25326A0);
        AbstractC8199t5.m8813l(parcel, 17, 4);
        parcel.writeInt(this.f25327B0 ? 1 : 0);
        AbstractC8199t5.m8813l(parcel, 18, 8);
        parcel.writeDouble(this.f25328C0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
