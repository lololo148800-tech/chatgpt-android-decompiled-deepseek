package p523V9;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.P6 */
/* JADX INFO: loaded from: classes.dex */
public final class C7967P6 extends AbstractC20851a {
    public static final Parcelable.Creator<C7967P6> CREATOR = new C8041a(9);

    /* JADX INFO: renamed from: A0 */
    public final C7903H6 f25208A0;

    /* JADX INFO: renamed from: Y */
    public final int f25209Y;

    /* JADX INFO: renamed from: Z */
    public final String f25210Z;

    /* JADX INFO: renamed from: o0 */
    public final String f25211o0;

    /* JADX INFO: renamed from: p0 */
    public final byte[] f25212p0;

    /* JADX INFO: renamed from: q0 */
    public final Point[] f25213q0;

    /* JADX INFO: renamed from: r0 */
    public final int f25214r0;

    /* JADX INFO: renamed from: s0 */
    public final C7911I6 f25215s0;

    /* JADX INFO: renamed from: t0 */
    public final C7935L6 f25216t0;

    /* JADX INFO: renamed from: u0 */
    public final C7943M6 f25217u0;

    /* JADX INFO: renamed from: v0 */
    public final C7959O6 f25218v0;

    /* JADX INFO: renamed from: w0 */
    public final C7951N6 f25219w0;

    /* JADX INFO: renamed from: x0 */
    public final C7919J6 f25220x0;

    /* JADX INFO: renamed from: y0 */
    public final C7887F6 f25221y0;

    /* JADX INFO: renamed from: z0 */
    public final C7895G6 f25222z0;

    public C7967P6(int i10, String str, String str2, byte[] bArr, Point[] pointArr, int i11, C7911I6 c7911i6, C7935L6 c7935l6, C7943M6 c7943m6, C7959O6 c7959o6, C7951N6 c7951n6, C7919J6 c7919j6, C7887F6 c7887f6, C7895G6 c7895g6, C7903H6 c7903h6) {
        this.f25209Y = i10;
        this.f25210Z = str;
        this.f25211o0 = str2;
        this.f25212p0 = bArr;
        this.f25213q0 = pointArr;
        this.f25214r0 = i11;
        this.f25215s0 = c7911i6;
        this.f25216t0 = c7935l6;
        this.f25217u0 = c7943m6;
        this.f25218v0 = c7959o6;
        this.f25219w0 = c7951n6;
        this.f25220x0 = c7919j6;
        this.f25221y0 = c7887f6;
        this.f25222z0 = c7895g6;
        this.f25208A0 = c7903h6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f25209Y);
        AbstractC8199t5.m8807f(parcel, 2, this.f25210Z);
        AbstractC8199t5.m8807f(parcel, 3, this.f25211o0);
        AbstractC8199t5.m8804c(parcel, 4, this.f25212p0);
        AbstractC8199t5.m8809h(parcel, 5, this.f25213q0, i10);
        AbstractC8199t5.m8813l(parcel, 6, 4);
        parcel.writeInt(this.f25214r0);
        AbstractC8199t5.m8806e(parcel, 7, this.f25215s0, i10);
        AbstractC8199t5.m8806e(parcel, 8, this.f25216t0, i10);
        AbstractC8199t5.m8806e(parcel, 9, this.f25217u0, i10);
        AbstractC8199t5.m8806e(parcel, 10, this.f25218v0, i10);
        AbstractC8199t5.m8806e(parcel, 11, this.f25219w0, i10);
        AbstractC8199t5.m8806e(parcel, 12, this.f25220x0, i10);
        AbstractC8199t5.m8806e(parcel, 13, this.f25221y0, i10);
        AbstractC8199t5.m8806e(parcel, 14, this.f25222z0, i10);
        AbstractC8199t5.m8806e(parcel, 15, this.f25208A0, i10);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
