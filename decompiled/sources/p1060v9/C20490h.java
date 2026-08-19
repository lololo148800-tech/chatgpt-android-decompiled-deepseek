package p1060v9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p960q9.C18658l;

/* JADX INFO: renamed from: v9.h */
/* JADX INFO: loaded from: classes.dex */
public final class C20490h extends AbstractC20851a {
    public static final Parcelable.Creator<C20490h> CREATOR = new C18658l(22);

    /* JADX INFO: renamed from: Y */
    public final int f65057Y;

    /* JADX INFO: renamed from: Z */
    public final int f65058Z;

    /* JADX INFO: renamed from: o0 */
    public final int f65059o0;

    /* JADX INFO: renamed from: p0 */
    public final long f65060p0;

    /* JADX INFO: renamed from: q0 */
    public final long f65061q0;

    /* JADX INFO: renamed from: r0 */
    public final String f65062r0;

    /* JADX INFO: renamed from: s0 */
    public final String f65063s0;

    /* JADX INFO: renamed from: t0 */
    public final int f65064t0;

    /* JADX INFO: renamed from: u0 */
    public final int f65065u0;

    public C20490h(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f65057Y = i10;
        this.f65058Z = i11;
        this.f65059o0 = i12;
        this.f65060p0 = j10;
        this.f65061q0 = j11;
        this.f65062r0 = str;
        this.f65063s0 = str2;
        this.f65064t0 = i13;
        this.f65065u0 = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f65057Y);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f65058Z);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeInt(this.f65059o0);
        AbstractC8199t5.m8813l(parcel, 4, 8);
        parcel.writeLong(this.f65060p0);
        AbstractC8199t5.m8813l(parcel, 5, 8);
        parcel.writeLong(this.f65061q0);
        AbstractC8199t5.m8807f(parcel, 6, this.f65062r0);
        AbstractC8199t5.m8807f(parcel, 7, this.f65063s0);
        AbstractC8199t5.m8813l(parcel, 8, 4);
        parcel.writeInt(this.f65064t0);
        AbstractC8199t5.m8813l(parcel, 9, 4);
        parcel.writeInt(this.f65065u0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
