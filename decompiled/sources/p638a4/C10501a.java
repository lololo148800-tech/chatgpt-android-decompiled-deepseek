package p638a4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1016t3.AbstractC19754D;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1016t3.C19799z;
import p1016t3.InterfaceC19752B;
import p1073w3.AbstractC20817s;
import p531Vj.C8343M;

/* JADX INFO: renamed from: a4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10501a implements InterfaceC19752B {
    public static final Parcelable.Creator<C10501a> CREATOR;

    /* JADX INFO: renamed from: s0 */
    public static final C19788o f31102s0;

    /* JADX INFO: renamed from: t0 */
    public static final C19788o f31103t0;

    /* JADX INFO: renamed from: Y */
    public final String f31104Y;

    /* JADX INFO: renamed from: Z */
    public final String f31105Z;

    /* JADX INFO: renamed from: o0 */
    public final long f31106o0;

    /* JADX INFO: renamed from: p0 */
    public final long f31107p0;

    /* JADX INFO: renamed from: q0 */
    public final byte[] f31108q0;

    /* JADX INFO: renamed from: r0 */
    public int f31109r0;

    static {
        C19787n c19787n = new C19787n();
        c19787n.f62714l = AbstractC19754D.m20711i("application/id3");
        f31102s0 = new C19788o(c19787n);
        C19787n c19787n2 = new C19787n();
        c19787n2.f62714l = AbstractC19754D.m20711i("application/x-scte35");
        f31103t0 = new C19788o(c19787n2);
        CREATOR = new C8343M(13);
    }

    public C10501a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f31104Y = str;
        this.f31105Z = str2;
        this.f31106o0 = j10;
        this.f31107p0 = j11;
        this.f31108q0 = bArr;
    }

    @Override // p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void mo10752S(C19799z c19799z) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10501a.class != obj.getClass()) {
            return false;
        }
        C10501a c10501a = (C10501a) obj;
        return this.f31106o0 == c10501a.f31106o0 && this.f31107p0 == c10501a.f31107p0 && AbstractC20817s.m21400a(this.f31104Y, c10501a.f31104Y) && AbstractC20817s.m21400a(this.f31105Z, c10501a.f31105Z) && Arrays.equals(this.f31108q0, c10501a.f31108q0);
    }

    public final int hashCode() {
        if (this.f31109r0 == 0) {
            String str = this.f31104Y;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f31105Z;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j10 = this.f31106o0;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f31107p0;
            this.f31109r0 = Arrays.hashCode(this.f31108q0) + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f31109r0;
    }

    @Override // p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: k */
    public final C19788o mo10753k() {
        String str = this.f31104Y;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f31103t0;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f31102s0;
            default:
                return null;
        }
    }

    @Override // p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: r0 */
    public final byte[] mo10754r0() {
        if (mo10753k() != null) {
            return this.f31108q0;
        }
        return null;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f31104Y + ", id=" + this.f31107p0 + ", durationMs=" + this.f31106o0 + ", value=" + this.f31105Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f31104Y);
        parcel.writeString(this.f31105Z);
        parcel.writeLong(this.f31106o0);
        parcel.writeLong(this.f31107p0);
        parcel.writeByteArray(this.f31108q0);
    }

    public C10501a(Parcel parcel) {
        String string = parcel.readString();
        int i10 = AbstractC20817s.f66106a;
        this.f31104Y = string;
        this.f31105Z = parcel.readString();
        this.f31106o0 = parcel.readLong();
        this.f31107p0 = parcel.readLong();
        this.f31108q0 = parcel.createByteArray();
    }
}
