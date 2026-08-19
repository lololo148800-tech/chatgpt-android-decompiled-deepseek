package p1016t3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;
import p003A1.AbstractC0168G;
import p1073w3.AbstractC20817s;
import p960q9.C18658l;

/* JADX INFO: renamed from: t3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C19784k implements Parcelable {
    public static final Parcelable.Creator<C19784k> CREATOR = new C18658l(8);

    /* JADX INFO: renamed from: Y */
    public int f62684Y;

    /* JADX INFO: renamed from: Z */
    public final UUID f62685Z;

    /* JADX INFO: renamed from: o0 */
    public final String f62686o0;

    /* JADX INFO: renamed from: p0 */
    public final String f62687p0;

    /* JADX INFO: renamed from: q0 */
    public final byte[] f62688q0;

    public C19784k(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f62685Z = uuid;
        this.f62686o0 = str;
        str2.getClass();
        this.f62687p0 = AbstractC19754D.m20711i(str2);
        this.f62688q0 = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19784k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C19784k c19784k = (C19784k) obj;
        return AbstractC20817s.m21400a(this.f62686o0, c19784k.f62686o0) && AbstractC20817s.m21400a(this.f62687p0, c19784k.f62687p0) && AbstractC20817s.m21400a(this.f62685Z, c19784k.f62685Z) && Arrays.equals(this.f62688q0, c19784k.f62688q0);
    }

    public final int hashCode() {
        if (this.f62684Y == 0) {
            int iHashCode = this.f62685Z.hashCode() * 31;
            String str = this.f62686o0;
            this.f62684Y = Arrays.hashCode(this.f62688q0) + AbstractC0168G.m527p((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f62687p0);
        }
        return this.f62684Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f62685Z;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f62686o0);
        parcel.writeString(this.f62687p0);
        parcel.writeByteArray(this.f62688q0);
    }

    public C19784k(Parcel parcel) {
        this.f62685Z = new UUID(parcel.readLong(), parcel.readLong());
        this.f62686o0 = parcel.readString();
        String string = parcel.readString();
        int i10 = AbstractC20817s.f66106a;
        this.f62687p0 = string;
        this.f62688q0 = parcel.createByteArray();
    }
}
