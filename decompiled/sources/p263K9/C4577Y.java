package p263K9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p449S9.C7054X;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: K9.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C4577Y extends AbstractC20851a {
    public static final Parcelable.Creator<C4577Y> CREATOR = new C4576X(5);

    /* JADX INFO: renamed from: Y */
    public final long f14924Y;

    /* JADX INFO: renamed from: Z */
    public final C7054X f14925Z;

    /* JADX INFO: renamed from: o0 */
    public final C7054X f14926o0;

    /* JADX INFO: renamed from: p0 */
    public final C7054X f14927p0;

    public C4577Y(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        AbstractC20502t.m21157h(bArr);
        C7054X c7054xM7451s = C7054X.m7451s(bArr.length, bArr);
        AbstractC20502t.m21157h(bArr2);
        C7054X c7054xM7451s2 = C7054X.m7451s(bArr2.length, bArr2);
        AbstractC20502t.m21157h(bArr3);
        C7054X c7054xM7451s3 = C7054X.m7451s(bArr3.length, bArr3);
        this.f14924Y = j10;
        this.f14925Z = c7054xM7451s;
        this.f14926o0 = c7054xM7451s2;
        this.f14927p0 = c7054xM7451s3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4577Y)) {
            return false;
        }
        C4577Y c4577y = (C4577Y) obj;
        return this.f14924Y == c4577y.f14924Y && AbstractC20502t.m21161l(this.f14925Z, c4577y.f14925Z) && AbstractC20502t.m21161l(this.f14926o0, c4577y.f14926o0) && AbstractC20502t.m21161l(this.f14927p0, c4577y.f14927p0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f14924Y), this.f14925Z, this.f14926o0, this.f14927p0});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 8);
        parcel.writeLong(this.f14924Y);
        AbstractC8199t5.m8804c(parcel, 2, this.f14925Z.m7453t());
        AbstractC8199t5.m8804c(parcel, 3, this.f14926o0.m7453t());
        AbstractC8199t5.m8804c(parcel, 4, this.f14927p0.m7453t());
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
